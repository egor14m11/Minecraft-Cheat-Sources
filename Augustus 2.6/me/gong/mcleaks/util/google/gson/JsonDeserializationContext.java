// 
// Decompiled by Procyon v0.5.36
// 

package me.gong.mcleaks.util.google.gson;

import java.lang.reflect.Type;

public interface JsonDeserializationContext
{
     <T> T deserialize(final JsonElement p0, final Type p1) throws JsonParseException;
}
