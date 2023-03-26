// 
// Decompiled by Procyon v0.5.36
// 

package com.viaversion.viaversion.protocols.protocol1_18to1_17_1.types;

import com.viaversion.viaversion.api.type.types.minecraft.BaseChunkType;
import java.util.Iterator;
import java.util.List;
import com.viaversion.viaversion.api.minecraft.chunks.Chunk1_18;
import com.viaversion.viaversion.api.type.types.version.Types1_18;
import com.viaversion.viaversion.api.minecraft.blockentity.BlockEntity;
import java.util.ArrayList;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.minecraft.chunks.ChunkSection;
import com.viaversion.viaversion.libs.opennbt.tag.builtin.CompoundTag;
import io.netty.buffer.ByteBuf;
import com.google.common.base.Preconditions;
import com.viaversion.viaversion.api.type.types.version.ChunkSectionType1_18;
import com.viaversion.viaversion.api.minecraft.chunks.Chunk;
import com.viaversion.viaversion.api.type.Type;

public final class Chunk1_18Type extends Type<Chunk>
{
    private final ChunkSectionType1_18 sectionType;
    private final int ySectionCount;
    
    public Chunk1_18Type(final int ySectionCount, final int globalPaletteBlockBits, final int globalPaletteBiomeBits) {
        super(Chunk.class);
        Preconditions.checkArgument(ySectionCount > 0);
        this.sectionType = new ChunkSectionType1_18(globalPaletteBlockBits, globalPaletteBiomeBits);
        this.ySectionCount = ySectionCount;
    }
    
    @Override
    public Chunk read(final ByteBuf buffer) throws Exception {
        final int chunkX = buffer.readInt();
        final int chunkZ = buffer.readInt();
        final CompoundTag heightMap = Type.NBT.read(buffer);
        final ByteBuf sectionsBuf = buffer.readBytes(Type.VAR_INT.readPrimitive(buffer));
        final ChunkSection[] sections = new ChunkSection[this.ySectionCount];
        try {
            for (int i = 0; i < this.ySectionCount; ++i) {
                sections[i] = this.sectionType.read(sectionsBuf);
            }
        }
        finally {
            if (sectionsBuf.readableBytes() > 0 && Via.getManager().isDebug()) {
                Via.getPlatform().getLogger().warning("Found " + sectionsBuf.readableBytes() + " more bytes than expected while reading the chunk: " + chunkX + "/" + chunkZ);
            }
            sectionsBuf.release();
        }
        final int blockEntitiesLength = Type.VAR_INT.readPrimitive(buffer);
        final List<BlockEntity> blockEntities = new ArrayList<BlockEntity>(blockEntitiesLength);
        for (int j = 0; j < blockEntitiesLength; ++j) {
            blockEntities.add(Types1_18.BLOCK_ENTITY.read(buffer));
        }
        return new Chunk1_18(chunkX, chunkZ, sections, heightMap, blockEntities);
    }
    
    @Override
    public void write(final ByteBuf buffer, final Chunk chunk) throws Exception {
        buffer.writeInt(chunk.getX());
        buffer.writeInt(chunk.getZ());
        Type.NBT.write(buffer, chunk.getHeightMap());
        final ByteBuf sectionBuffer = buffer.alloc().buffer();
        try {
            for (final ChunkSection section : chunk.getSections()) {
                this.sectionType.write(sectionBuffer, section);
            }
            sectionBuffer.readerIndex(0);
            Type.VAR_INT.writePrimitive(buffer, sectionBuffer.readableBytes());
            buffer.writeBytes(sectionBuffer);
        }
        finally {
            sectionBuffer.release();
        }
        Type.VAR_INT.writePrimitive(buffer, chunk.blockEntities().size());
        for (final BlockEntity blockEntity : chunk.blockEntities()) {
            Types1_18.BLOCK_ENTITY.write(buffer, blockEntity);
        }
    }
    
    @Override
    public Class<? extends Type> getBaseClass() {
        return BaseChunkType.class;
    }
}
