/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.errorprone.annotations.CanIgnoreReturnValue
 */
package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import javax.annotation.Nullable;

@GwtCompatible
public final class SettableFuture<V>
extends AbstractFuture.TrustedFuture<V> {
    public static <V> SettableFuture<V> create() {
        return new SettableFuture<V>();
    }

    @Override
    @CanIgnoreReturnValue
    public boolean set(@Nullable V value) {
        return super.set(value);
    }

    @Override
    @CanIgnoreReturnValue
    public boolean setException(Throwable throwable) {
        return super.setException(throwable);
    }

    @Override
    @Beta
    @CanIgnoreReturnValue
    public boolean setFuture(ListenableFuture<? extends V> future) {
        return super.setFuture(future);
    }

    private SettableFuture() {
    }
}

