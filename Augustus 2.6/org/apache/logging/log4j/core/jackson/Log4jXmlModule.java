// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.logging.log4j.core.jackson;

import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;

final class Log4jXmlModule extends JacksonXmlModule
{
    private static final long serialVersionUID = 1L;
    private final boolean includeStacktrace;
    private final boolean stacktraceAsString;
    
    Log4jXmlModule(final boolean includeStacktrace, final boolean stacktraceAsString) {
        this.includeStacktrace = includeStacktrace;
        this.stacktraceAsString = stacktraceAsString;
        new Initializers.SimpleModuleInitializer().initialize((SimpleModule)this, false);
    }
    
    public void setupModule(final Module.SetupContext context) {
        super.setupModule(context);
        new Initializers.SetupContextInitializer().setupModule(context, this.includeStacktrace, this.stacktraceAsString);
    }
}
