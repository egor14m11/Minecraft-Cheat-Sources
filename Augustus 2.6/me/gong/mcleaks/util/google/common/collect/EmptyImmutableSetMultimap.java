// 
// Decompiled by Procyon v0.5.36
// 

package me.gong.mcleaks.util.google.common.collect;

import java.util.Comparator;
import me.gong.mcleaks.util.google.common.annotations.GwtCompatible;

@GwtCompatible(serializable = true)
class EmptyImmutableSetMultimap extends ImmutableSetMultimap<Object, Object>
{
    static final EmptyImmutableSetMultimap INSTANCE;
    private static final long serialVersionUID = 0L;
    
    private EmptyImmutableSetMultimap() {
        super(ImmutableMap.of(), 0, null);
    }
    
    private Object readResolve() {
        return EmptyImmutableSetMultimap.INSTANCE;
    }
    
    static {
        INSTANCE = new EmptyImmutableSetMultimap();
    }
}
