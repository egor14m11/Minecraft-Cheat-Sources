// 
// Decompiled by Procyon v0.5.36
// 

package com.viaversion.viaversion.api.type.types.version;

import com.viaversion.viaversion.api.minecraft.metadata.MetaType;
import com.viaversion.viaversion.api.type.types.minecraft.ModernMetaType;

@Deprecated
public class Metadata1_17Type extends ModernMetaType
{
    @Override
    protected MetaType getType(final int index) {
        return Types1_17.META_TYPES.byId(index);
    }
}
