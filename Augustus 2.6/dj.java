import java.util.IllegalFormatException;
import java.util.Iterator;
import java.io.InputStream;
import java.io.IOException;
import com.google.common.collect.Iterables;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.Charsets;
import com.google.common.collect.Maps;
import java.util.Map;
import com.google.common.base.Splitter;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.5.36
// 

public class dj
{
    private static final Pattern a;
    private static final Splitter b;
    private static dj c;
    private final Map<String, String> d;
    private long e;
    
    public dj() {
        this.d = (Map<String, String>)Maps.newHashMap();
        try {
            final InputStream resourceAsStream = dj.class.getResourceAsStream("/assets/minecraft/lang/en_US.lang");
            for (final String sequence : IOUtils.readLines(resourceAsStream, Charsets.UTF_8)) {
                if (!sequence.isEmpty()) {
                    if (sequence.charAt(0) == '#') {
                        continue;
                    }
                    final String[] array = Iterables.toArray(dj.b.split(sequence), String.class);
                    if (array == null) {
                        continue;
                    }
                    if (array.length != 2) {
                        continue;
                    }
                    final String s = array[0];
                    final String replaceAll = dj.a.matcher(array[1]).replaceAll("%$1s");
                    this.d.put(s, replaceAll);
                }
            }
            this.e = System.currentTimeMillis();
        }
        catch (IOException ex) {}
    }
    
    static dj a() {
        return dj.c;
    }
    
    public static synchronized void a(final Map<String, String> \u2603) {
        dj.c.d.clear();
        dj.c.d.putAll(\u2603);
        dj.c.e = System.currentTimeMillis();
    }
    
    public synchronized String a(final String \u2603) {
        return this.c(\u2603);
    }
    
    public synchronized String a(final String \u2603, final Object... \u2603) {
        final String c = this.c(\u2603);
        try {
            return String.format(c, \u2603);
        }
        catch (IllegalFormatException ex) {
            return "Format error: " + c;
        }
    }
    
    private String c(final String \u2603) {
        final String s = this.d.get(\u2603);
        return (s == null) ? \u2603 : s;
    }
    
    public synchronized boolean b(final String \u2603) {
        return this.d.containsKey(\u2603);
    }
    
    public long c() {
        return this.e;
    }
    
    static {
        a = Pattern.compile("%(\\d+\\$)?[\\d\\.]*[df]");
        b = Splitter.on('=').limit(2);
        dj.c = new dj();
    }
}
