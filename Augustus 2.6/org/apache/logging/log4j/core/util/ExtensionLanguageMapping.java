// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.logging.log4j.core.util;

import java.util.ArrayList;
import java.util.List;

public enum ExtensionLanguageMapping
{
    JS("js", "JavaScript"), 
    JAVASCRIPT("javascript", "JavaScript"), 
    GVY("gvy", "Groovy"), 
    GROOVY("groovy", "Groovy"), 
    BSH("bsh", "beanshell"), 
    BEANSHELL("beanshell", "beanshell"), 
    JY("jy", "jython"), 
    JYTHON("jython", "jython"), 
    FTL("ftl", "freemarker"), 
    FREEMARKER("freemarker", "freemarker"), 
    VM("vm", "velocity"), 
    VELOCITY("velocity", "velocity"), 
    AWK("awk", "awk"), 
    EJS("ejs", "ejs"), 
    TCL("tcl", "tcl"), 
    HS("hs", "jaskell"), 
    JELLY("jelly", "jelly"), 
    JEP("jep", "jep"), 
    JEXL("jexl", "jexl"), 
    JEXL2("jexl2", "jexl2"), 
    RB("rb", "ruby"), 
    RUBY("ruby", "ruby"), 
    JUDO("judo", "judo"), 
    JUDI("judi", "judo"), 
    SCALA("scala", "scala"), 
    CLJ("clj", "Clojure");
    
    private final String extension;
    private final String language;
    
    private ExtensionLanguageMapping(final String extension, final String language) {
        this.extension = extension;
        this.language = language;
    }
    
    public String getExtension() {
        return this.extension;
    }
    
    public String getLanguage() {
        return this.language;
    }
    
    public static ExtensionLanguageMapping getByExtension(final String extension) {
        for (final ExtensionLanguageMapping mapping : values()) {
            if (mapping.extension.equals(extension)) {
                return mapping;
            }
        }
        return null;
    }
    
    public static List<ExtensionLanguageMapping> getByLanguage(final String language) {
        final List<ExtensionLanguageMapping> list = new ArrayList<ExtensionLanguageMapping>();
        for (final ExtensionLanguageMapping mapping : values()) {
            if (mapping.language.equals(language)) {
                list.add(mapping);
            }
        }
        return list;
    }
}
