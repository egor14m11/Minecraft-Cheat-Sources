// 
// Decompiled by Procyon v0.5.36
// 

package me.gong.mcleaks.util.google.common.util.concurrent;

import me.gong.mcleaks.util.google.common.base.Preconditions;
import java.util.concurrent.Future;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import me.gong.mcleaks.util.google.errorprone.annotations.CanIgnoreReturnValue;
import me.gong.mcleaks.util.google.common.annotations.GwtIncompatible;
import me.gong.mcleaks.util.google.common.annotations.Beta;

@Beta
@GwtIncompatible
public abstract class ForwardingCheckedFuture<V, X extends Exception> extends ForwardingListenableFuture<V> implements CheckedFuture<V, X>
{
    @CanIgnoreReturnValue
    @Override
    public V checkedGet() throws X, Exception {
        return this.delegate().checkedGet();
    }
    
    @CanIgnoreReturnValue
    @Override
    public V checkedGet(final long timeout, final TimeUnit unit) throws TimeoutException, X, Exception {
        return this.delegate().checkedGet(timeout, unit);
    }
    
    @Override
    protected abstract CheckedFuture<V, X> delegate();
    
    @Beta
    public abstract static class SimpleForwardingCheckedFuture<V, X extends Exception> extends ForwardingCheckedFuture<V, X>
    {
        private final CheckedFuture<V, X> delegate;
        
        protected SimpleForwardingCheckedFuture(final CheckedFuture<V, X> delegate) {
            this.delegate = Preconditions.checkNotNull(delegate);
        }
        
        @Override
        protected final CheckedFuture<V, X> delegate() {
            return this.delegate;
        }
    }
}
