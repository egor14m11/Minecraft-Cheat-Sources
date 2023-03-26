// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.logging.log4j.core.config;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.core.LoggerContext;

public class NullConfiguration extends AbstractConfiguration
{
    public static final String NULL_NAME = "Null";
    
    public NullConfiguration() {
        super(null, ConfigurationSource.NULL_SOURCE);
        this.setName("Null");
        final LoggerConfig root = this.getRootLogger();
        root.setLevel(Level.OFF);
    }
}
