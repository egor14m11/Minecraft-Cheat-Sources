/*
 * Decompiled with CFR 0.150.
 */
package org.apache.http;

import org.apache.http.HttpException;

public class ProtocolException
extends HttpException {
    private static final long serialVersionUID = -2143571074341228994L;

    public ProtocolException() {
    }

    public ProtocolException(String message) {
        super(message);
    }

    public ProtocolException(String message, Throwable cause) {
        super(message, cause);
    }
}

