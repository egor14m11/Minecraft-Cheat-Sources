// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.logging.log4j.core.appender;

import org.apache.logging.log4j.core.config.plugins.PluginFactory;
import org.apache.logging.log4j.core.util.Booleans;
import org.apache.logging.log4j.core.config.plugins.PluginConfiguration;
import org.apache.logging.log4j.core.config.plugins.PluginAliases;
import org.apache.logging.log4j.core.config.plugins.PluginElement;
import org.apache.logging.log4j.core.config.plugins.PluginAttribute;
import java.util.Iterator;
import org.apache.logging.log4j.LoggingException;
import org.apache.logging.log4j.core.LogEvent;
import java.util.Map;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.core.Appender;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.io.Serializable;
import org.apache.logging.log4j.core.Layout;
import org.apache.logging.log4j.core.config.Property;
import org.apache.logging.log4j.core.Filter;
import java.util.List;
import org.apache.logging.log4j.core.config.AppenderControl;
import org.apache.logging.log4j.core.config.Configuration;
import org.apache.logging.log4j.core.config.plugins.Plugin;

@Plugin(name = "Failover", category = "Core", elementType = "appender", printObject = true)
public final class FailoverAppender extends AbstractAppender
{
    private static final int DEFAULT_INTERVAL_SECONDS = 60;
    private final String primaryRef;
    private final String[] failovers;
    private final Configuration config;
    private AppenderControl primary;
    private final List<AppenderControl> failoverAppenders;
    private final long intervalNanos;
    private volatile long nextCheckNanos;
    
    private FailoverAppender(final String name, final Filter filter, final String primary, final String[] failovers, final int intervalMillis, final Configuration config, final boolean ignoreExceptions, final Property[] properties) {
        super(name, filter, null, ignoreExceptions, properties);
        this.failoverAppenders = new ArrayList<AppenderControl>();
        this.primaryRef = primary;
        this.failovers = failovers;
        this.config = config;
        this.intervalNanos = TimeUnit.MILLISECONDS.toNanos(intervalMillis);
    }
    
    @Override
    public void start() {
        final Map<String, Appender> map = this.config.getAppenders();
        int errors = 0;
        final Appender appender = map.get(this.primaryRef);
        if (appender != null) {
            this.primary = new AppenderControl(appender, null, null);
        }
        else {
            FailoverAppender.LOGGER.error("Unable to locate primary Appender " + this.primaryRef);
            ++errors;
        }
        for (final String name : this.failovers) {
            final Appender foAppender = map.get(name);
            if (foAppender != null) {
                this.failoverAppenders.add(new AppenderControl(foAppender, null, null));
            }
            else {
                FailoverAppender.LOGGER.error("Failover appender " + name + " is not configured");
            }
        }
        if (this.failoverAppenders.isEmpty()) {
            FailoverAppender.LOGGER.error("No failover appenders are available");
            ++errors;
        }
        if (errors == 0) {
            super.start();
        }
    }
    
    @Override
    public void append(final LogEvent event) {
        if (!this.isStarted()) {
            this.error("FailoverAppender " + this.getName() + " did not start successfully");
            return;
        }
        final long localCheckNanos = this.nextCheckNanos;
        if (localCheckNanos == 0L || System.nanoTime() - localCheckNanos > 0L) {
            this.callAppender(event);
        }
        else {
            this.failover(event, null);
        }
    }
    
    private void callAppender(final LogEvent event) {
        try {
            this.primary.callAppender(event);
            this.nextCheckNanos = 0L;
        }
        catch (Exception ex) {
            this.nextCheckNanos = System.nanoTime() + this.intervalNanos;
            this.failover(event, ex);
        }
    }
    
    private void failover(final LogEvent event, final Exception ex) {
        final RuntimeException re = (RuntimeException)((ex != null) ? ((ex instanceof LoggingException) ? ex : new LoggingException(ex)) : null);
        boolean written = false;
        Exception failoverException = null;
        for (final AppenderControl control : this.failoverAppenders) {
            try {
                control.callAppender(event);
                written = true;
            }
            catch (Exception fex) {
                if (failoverException != null) {
                    continue;
                }
                failoverException = fex;
                continue;
            }
            break;
        }
        if (written || this.ignoreExceptions()) {
            return;
        }
        if (re != null) {
            throw re;
        }
        throw new LoggingException("Unable to write to failover appenders", failoverException);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(this.getName());
        sb.append(" primary=").append(this.primary).append(", failover={");
        boolean first = true;
        for (final String str : this.failovers) {
            if (!first) {
                sb.append(", ");
            }
            sb.append(str);
            first = false;
        }
        sb.append('}');
        return sb.toString();
    }
    
    @PluginFactory
    public static FailoverAppender createAppender(@PluginAttribute("name") final String name, @PluginAttribute("primary") final String primary, @PluginElement("Failovers") final String[] failovers, @PluginAliases({ "retryInterval" }) @PluginAttribute("retryIntervalSeconds") final String retryIntervalSeconds, @PluginConfiguration final Configuration config, @PluginElement("Filter") final Filter filter, @PluginAttribute("ignoreExceptions") final String ignore) {
        if (name == null) {
            FailoverAppender.LOGGER.error("A name for the Appender must be specified");
            return null;
        }
        if (primary == null) {
            FailoverAppender.LOGGER.error("A primary Appender must be specified");
            return null;
        }
        if (failovers == null || failovers.length == 0) {
            FailoverAppender.LOGGER.error("At least one failover Appender must be specified");
            return null;
        }
        final int seconds = AbstractAppender.parseInt(retryIntervalSeconds, 60);
        int retryIntervalMillis;
        if (seconds >= 0) {
            retryIntervalMillis = seconds * 1000;
        }
        else {
            FailoverAppender.LOGGER.warn("Interval " + retryIntervalSeconds + " is less than zero. Using default");
            retryIntervalMillis = 60000;
        }
        final boolean ignoreExceptions = Booleans.parseBoolean(ignore, true);
        return new FailoverAppender(name, filter, primary, failovers, retryIntervalMillis, config, ignoreExceptions, null);
    }
}
