/*
 * Decompiled with CFR 0.150.
 */
package javax.annotation.concurrent;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value={ElementType.FIELD, ElementType.METHOD})
@Retention(value=RetentionPolicy.CLASS)
public @interface GuardedBy {
    public String value();
}

