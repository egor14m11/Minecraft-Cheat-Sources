// 
// Decompiled by Procyon v0.5.36
// 

package com.google.common.eventbus;

@ElementTypesAreNonnullByDefault
public interface SubscriberExceptionHandler
{
    void handleException(final Throwable p0, final SubscriberExceptionContext p1);
}
