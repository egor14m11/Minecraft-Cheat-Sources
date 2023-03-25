/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.appender.db;

import java.util.ArrayList;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.appender.AbstractManager;
import org.apache.logging.log4j.core.appender.ManagerFactory;

public abstract class AbstractDatabaseManager
extends AbstractManager {
    private final ArrayList<LogEvent> buffer;
    private final int bufferSize;
    private boolean connected = false;

    protected AbstractDatabaseManager(String name, int bufferSize) {
        super(name);
        this.bufferSize = bufferSize;
        this.buffer = new ArrayList(bufferSize + 1);
    }

    protected abstract void connectInternal() throws Exception;

    public final synchronized void connect() {
        if (!this.isConnected()) {
            try {
                this.connectInternal();
                this.connected = true;
            }
            catch (Exception e) {
                LOGGER.error("Could not connect to database using logging manager [{}].", this.getName(), e);
            }
        }
    }

    protected abstract void disconnectInternal() throws Exception;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final synchronized void disconnect() {
        this.flush();
        if (this.isConnected()) {
            try {
                this.disconnectInternal();
            }
            catch (Exception e) {
                LOGGER.warn("Error while disconnecting from database using logging manager [{}].", this.getName(), e);
            }
            finally {
                this.connected = false;
            }
        }
    }

    public final boolean isConnected() {
        return this.connected;
    }

    protected abstract void writeInternal(LogEvent var1);

    public final synchronized void flush() {
        if (this.isConnected() && this.buffer.size() > 0) {
            for (LogEvent event : this.buffer) {
                this.writeInternal(event);
            }
            this.buffer.clear();
        }
    }

    public final synchronized void write(LogEvent event) {
        if (this.bufferSize > 0) {
            this.buffer.add(event);
            if (this.buffer.size() >= this.bufferSize || event.isEndOfBatch()) {
                this.flush();
            }
        } else {
            this.writeInternal(event);
        }
    }

    @Override
    public final void releaseSub() {
        this.disconnect();
    }

    public final String toString() {
        return this.getName();
    }

    protected static <M extends AbstractDatabaseManager, T extends AbstractFactoryData> M getManager(String name, T data, ManagerFactory<M, T> factory) {
        return (M)((AbstractDatabaseManager)AbstractManager.getManager(name, factory, data));
    }

    protected static abstract class AbstractFactoryData {
        private final int bufferSize;

        protected AbstractFactoryData(int bufferSize) {
            this.bufferSize = bufferSize;
        }

        public int getBufferSize() {
            return this.bufferSize;
        }
    }
}

