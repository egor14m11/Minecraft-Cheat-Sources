/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.helpers;

public class Strings {
    public static boolean isEmpty(CharSequence cs) {
        return cs == null || cs.length() == 0;
    }

    public static boolean isNotEmpty(CharSequence cs) {
        return !Strings.isEmpty(cs);
    }
}

