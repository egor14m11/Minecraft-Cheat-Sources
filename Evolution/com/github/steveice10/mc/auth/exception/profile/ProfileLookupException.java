/*
 * Decompiled with CFR 0.152.
 */
package com.github.steveice10.mc.auth.exception.profile;

import com.github.steveice10.mc.auth.exception.profile.ProfileException;

public class ProfileLookupException
extends ProfileException {
    private static final long serialVersionUID = 1L;

    public ProfileLookupException() {
    }

    public ProfileLookupException(String message) {
        super(message);
    }

    public ProfileLookupException(String message, Throwable cause) {
        super(message, cause);
    }

    public ProfileLookupException(Throwable cause) {
        super(cause);
    }
}

