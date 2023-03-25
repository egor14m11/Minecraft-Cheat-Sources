/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.appender.rolling;

import org.apache.logging.log4j.core.appender.rolling.RolloverDescription;
import org.apache.logging.log4j.core.appender.rolling.helper.Action;

public final class RolloverDescriptionImpl
implements RolloverDescription {
    private final String activeFileName;
    private final boolean append;
    private final Action synchronous;
    private final Action asynchronous;

    public RolloverDescriptionImpl(String activeFileName, boolean append, Action synchronous, Action asynchronous) {
        if (activeFileName == null) {
            throw new NullPointerException("activeFileName");
        }
        this.append = append;
        this.activeFileName = activeFileName;
        this.synchronous = synchronous;
        this.asynchronous = asynchronous;
    }

    @Override
    public String getActiveFileName() {
        return this.activeFileName;
    }

    @Override
    public boolean getAppend() {
        return this.append;
    }

    @Override
    public Action getSynchronous() {
        return this.synchronous;
    }

    @Override
    public Action getAsynchronous() {
        return this.asynchronous;
    }
}

