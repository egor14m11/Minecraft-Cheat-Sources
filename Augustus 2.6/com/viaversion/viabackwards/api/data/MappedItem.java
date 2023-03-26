// 
// Decompiled by Procyon v0.5.36
// 

package com.viaversion.viabackwards.api.data;

import com.viaversion.viaversion.protocols.protocol1_13to1_12_2.ChatRewriter;

public class MappedItem
{
    private final int id;
    private final String jsonName;
    
    public MappedItem(final int id, final String name) {
        this.id = id;
        this.jsonName = ChatRewriter.legacyTextToJsonString("§f" + name);
    }
    
    public int getId() {
        return this.id;
    }
    
    public String getJsonName() {
        return this.jsonName;
    }
}
