/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.core.JsonGenerationException
 *  com.fasterxml.jackson.core.JsonGenerator
 *  com.fasterxml.jackson.databind.SerializerProvider
 *  com.fasterxml.jackson.databind.ser.std.StdSerializer
 */
package org.apache.logging.log4j.core.jackson;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Map;
import org.apache.logging.log4j.core.jackson.MapEntry;
import org.apache.logging.log4j.util.BiConsumer;
import org.apache.logging.log4j.util.ReadOnlyStringMap;

public class ContextDataAsEntryListSerializer
extends StdSerializer<ReadOnlyStringMap> {
    private static final long serialVersionUID = 1L;

    protected ContextDataAsEntryListSerializer() {
        super(Map.class, false);
    }

    public void serialize(ReadOnlyStringMap contextData, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException {
        final MapEntry[] pairs = new MapEntry[contextData.size()];
        contextData.forEach(new BiConsumer<String, Object>(){
            int i = 0;

            @Override
            public void accept(String key, Object value) {
                pairs[this.i++] = new MapEntry(key, String.valueOf(value));
            }
        });
        jgen.writeObject((Object)pairs);
    }
}

