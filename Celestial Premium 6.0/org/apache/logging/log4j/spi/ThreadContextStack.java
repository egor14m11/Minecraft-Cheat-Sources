/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.spi;

import java.util.Collection;
import org.apache.logging.log4j.ThreadContext;

public interface ThreadContextStack
extends ThreadContext.ContextStack,
Collection<String> {
}

