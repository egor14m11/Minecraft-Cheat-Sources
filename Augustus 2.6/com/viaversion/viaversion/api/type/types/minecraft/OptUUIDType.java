// 
// Decompiled by Procyon v0.5.36
// 

package com.viaversion.viaversion.api.type.types.minecraft;

import io.netty.buffer.ByteBuf;
import java.util.UUID;
import com.viaversion.viaversion.api.type.Type;

public class OptUUIDType extends Type<UUID>
{
    public OptUUIDType() {
        super(UUID.class);
    }
    
    @Override
    public UUID read(final ByteBuf buffer) {
        final boolean present = buffer.readBoolean();
        if (!present) {
            return null;
        }
        return new UUID(buffer.readLong(), buffer.readLong());
    }
    
    @Override
    public void write(final ByteBuf buffer, final UUID object) {
        if (object == null) {
            buffer.writeBoolean(false);
        }
        else {
            buffer.writeBoolean(true);
            buffer.writeLong(object.getMostSignificantBits());
            buffer.writeLong(object.getLeastSignificantBits());
        }
    }
}
