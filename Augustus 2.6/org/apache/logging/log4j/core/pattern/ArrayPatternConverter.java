// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.logging.log4j.core.pattern;

public interface ArrayPatternConverter extends PatternConverter
{
    void format(final StringBuilder toAppendTo, final Object... objects);
}
