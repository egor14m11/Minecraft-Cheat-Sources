// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.logging.log4j.core.lookup;

import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.util.ReadOnlyStringMap;
import org.apache.logging.log4j.core.impl.ContextDataInjectorFactory;
import org.apache.logging.log4j.core.ContextDataInjector;
import org.apache.logging.log4j.core.config.plugins.Plugin;

@Plugin(name = "ctx", category = "Lookup")
public class ContextMapLookup implements StrLookup
{
    private final ContextDataInjector injector;
    
    public ContextMapLookup() {
        this.injector = ContextDataInjectorFactory.createInjector();
    }
    
    @Override
    public String lookup(final String key) {
        return this.currentContextData().getValue(key);
    }
    
    private ReadOnlyStringMap currentContextData() {
        return this.injector.rawContextData();
    }
    
    @Override
    public String lookup(final LogEvent event, final String key) {
        return event.getContextData().getValue(key);
    }
}
