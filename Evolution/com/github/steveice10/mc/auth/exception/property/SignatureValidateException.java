/*
 * Decompiled with CFR 0.152.
 */
package com.github.steveice10.mc.auth.exception.property;

import com.github.steveice10.mc.auth.exception.property.PropertyException;

public class SignatureValidateException
extends PropertyException {
    private static final long serialVersionUID = 1L;

    public SignatureValidateException() {
    }

    public SignatureValidateException(String message) {
        super(message);
    }

    public SignatureValidateException(String message, Throwable cause) {
        super(message, cause);
    }

    public SignatureValidateException(Throwable cause) {
        super(cause);
    }
}

