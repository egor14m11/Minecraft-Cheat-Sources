// 
// Decompiled by Procyon v0.5.36
// 

package com.sun.jna;

public interface CallbackProxy extends Callback
{
    Object callback(final Object[] p0);
    
    Class<?>[] getParameterTypes();
    
    Class<?> getReturnType();
}
