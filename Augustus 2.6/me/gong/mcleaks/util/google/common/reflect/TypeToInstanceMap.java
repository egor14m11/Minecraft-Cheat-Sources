// 
// Decompiled by Procyon v0.5.36
// 

package me.gong.mcleaks.util.google.common.reflect;

import me.gong.mcleaks.util.google.errorprone.annotations.CanIgnoreReturnValue;
import javax.annotation.Nullable;
import me.gong.mcleaks.util.google.common.annotations.Beta;
import java.util.Map;

@Beta
public interface TypeToInstanceMap<B> extends Map<TypeToken<? extends B>, B>
{
    @Nullable
     <T extends B> T getInstance(final Class<T> p0);
    
    @Nullable
    @CanIgnoreReturnValue
     <T extends B> T putInstance(final Class<T> p0, @Nullable final T p1);
    
    @Nullable
     <T extends B> T getInstance(final TypeToken<T> p0);
    
    @Nullable
    @CanIgnoreReturnValue
     <T extends B> T putInstance(final TypeToken<T> p0, @Nullable final T p1);
}
