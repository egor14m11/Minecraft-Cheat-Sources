// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.logging.log4j.core.config.builder.api;

public interface FilterableComponentBuilder<T extends ComponentBuilder<T>> extends ComponentBuilder<T>
{
    T add(final FilterComponentBuilder assembler);
}
