// 
// Decompiled by Procyon v0.5.36
// 

package me.gong.mcleaks.util.google.common.eventbus;

import me.gong.mcleaks.util.google.common.annotations.Beta;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD })
@Beta
public @interface AllowConcurrentEvents {
}
