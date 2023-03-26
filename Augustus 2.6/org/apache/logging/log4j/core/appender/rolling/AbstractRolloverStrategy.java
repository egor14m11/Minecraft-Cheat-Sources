// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.logging.log4j.core.appender.rolling;

import org.apache.logging.log4j.status.StatusLogger;
import java.util.regex.Matcher;
import java.util.Iterator;
import java.nio.file.DirectoryStream;
import java.io.IOException;
import org.apache.logging.log4j.LoggingException;
import java.nio.file.Files;
import java.io.File;
import java.util.TreeMap;
import org.apache.logging.log4j.core.pattern.NotANumber;
import java.nio.file.Path;
import java.util.SortedMap;
import java.util.Collection;
import java.util.ArrayList;
import org.apache.logging.log4j.core.appender.rolling.action.CompositeAction;
import java.util.List;
import org.apache.logging.log4j.core.appender.rolling.action.Action;
import org.apache.logging.log4j.core.lookup.StrSubstitutor;
import java.util.regex.Pattern;
import org.apache.logging.log4j.Logger;

public abstract class AbstractRolloverStrategy implements RolloverStrategy
{
    protected static final Logger LOGGER;
    public static final Pattern PATTERN_COUNTER;
    protected final StrSubstitutor strSubstitutor;
    
    protected AbstractRolloverStrategy(final StrSubstitutor strSubstitutor) {
        this.strSubstitutor = strSubstitutor;
    }
    
    public StrSubstitutor getStrSubstitutor() {
        return this.strSubstitutor;
    }
    
    protected Action merge(final Action compressAction, final List<Action> custom, final boolean stopOnError) {
        if (custom.isEmpty()) {
            return compressAction;
        }
        if (compressAction == null) {
            return new CompositeAction(custom, stopOnError);
        }
        final List<Action> all = new ArrayList<Action>();
        all.add(compressAction);
        all.addAll(custom);
        return new CompositeAction(all, stopOnError);
    }
    
    protected int suffixLength(final String lowFilename) {
        for (final FileExtension extension : FileExtension.values()) {
            if (extension.isExtensionFor(lowFilename)) {
                return extension.length();
            }
        }
        return 0;
    }
    
    protected SortedMap<Integer, Path> getEligibleFiles(final RollingFileManager manager) {
        return this.getEligibleFiles(manager, true);
    }
    
    protected SortedMap<Integer, Path> getEligibleFiles(final RollingFileManager manager, final boolean isAscending) {
        final StringBuilder buf = new StringBuilder();
        final String pattern = manager.getPatternProcessor().getPattern();
        manager.getPatternProcessor().formatFileName(this.strSubstitutor, buf, NotANumber.NAN);
        final String fileName = manager.isDirectWrite() ? "" : manager.getFileName();
        return this.getEligibleFiles(fileName, buf.toString(), pattern, isAscending);
    }
    
    protected SortedMap<Integer, Path> getEligibleFiles(final String path, final String pattern) {
        return this.getEligibleFiles("", path, pattern, true);
    }
    
    @Deprecated
    protected SortedMap<Integer, Path> getEligibleFiles(final String path, final String logfilePattern, final boolean isAscending) {
        return this.getEligibleFiles("", path, logfilePattern, isAscending);
    }
    
    protected SortedMap<Integer, Path> getEligibleFiles(final String currentFile, final String path, final String logfilePattern, final boolean isAscending) {
        final TreeMap<Integer, Path> eligibleFiles = new TreeMap<Integer, Path>();
        final File file = new File(path);
        File parent = file.getParentFile();
        if (parent == null) {
            parent = new File(".");
        }
        else {
            parent.mkdirs();
        }
        if (!AbstractRolloverStrategy.PATTERN_COUNTER.matcher(logfilePattern).matches()) {
            return eligibleFiles;
        }
        final Path dir = parent.toPath();
        String fileName = file.getName();
        final int suffixLength = this.suffixLength(fileName);
        if (suffixLength > 0) {
            fileName = Pattern.quote(fileName.substring(0, fileName.length() - suffixLength)) + ".*";
        }
        else {
            fileName = Pattern.quote(fileName);
        }
        final String filePattern = fileName.replaceFirst("0?\\u0000", "\\\\E(0?\\\\d+)\\\\Q");
        final Pattern pattern = Pattern.compile(filePattern);
        final Path current = (currentFile.length() > 0) ? new File(currentFile).toPath() : null;
        AbstractRolloverStrategy.LOGGER.debug("Current file: {}", currentFile);
        try (final DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
            for (final Path entry : stream) {
                final Matcher matcher = pattern.matcher(entry.toFile().getName());
                if (matcher.matches() && !entry.equals(current)) {
                    try {
                        final Integer index = Integer.parseInt(matcher.group(1));
                        eligibleFiles.put(index, entry);
                    }
                    catch (NumberFormatException ex) {
                        AbstractRolloverStrategy.LOGGER.debug("Ignoring file {} which matches pattern but the index is invalid.", entry.toFile().getName());
                    }
                }
            }
        }
        catch (IOException ioe) {
            throw new LoggingException("Error reading folder " + dir + " " + ioe.getMessage(), ioe);
        }
        return isAscending ? eligibleFiles : eligibleFiles.descendingMap();
    }
    
    static {
        LOGGER = StatusLogger.getLogger();
        PATTERN_COUNTER = Pattern.compile(".*%((?<ZEROPAD>0)?(?<PADDING>\\d+))?i.*");
    }
}
