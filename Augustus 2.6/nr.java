import java.util.Locale;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonReader;
import java.io.IOException;
import com.google.gson.stream.JsonWriter;
import java.util.Map;
import com.google.common.collect.Maps;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.TypeAdapterFactory;

// 
// Decompiled by Procyon v0.5.36
// 

public class nr implements TypeAdapterFactory
{
    @Override
    public <T> TypeAdapter<T> create(final Gson \u2603, final TypeToken<T> \u2603) {
        final Class<T> rawType = (Class<T>)\u2603.getRawType();
        if (!rawType.isEnum()) {
            return null;
        }
        final Map<String, T> hashMap = (Map<String, T>)Maps.newHashMap();
        for (final T \u26032 : rawType.getEnumConstants()) {
            hashMap.put(this.a(\u26032), \u26032);
        }
        return new TypeAdapter<T>() {
            @Override
            public void write(final JsonWriter \u2603, final T \u2603) throws IOException {
                if (\u2603 == null) {
                    \u2603.nullValue();
                }
                else {
                    \u2603.value(nr.this.a(\u2603));
                }
            }
            
            @Override
            public T read(final JsonReader \u2603) throws IOException {
                if (\u2603.peek() == JsonToken.NULL) {
                    \u2603.nextNull();
                    return null;
                }
                return hashMap.get(\u2603.nextString());
            }
        };
    }
    
    private String a(final Object \u2603) {
        if (\u2603 instanceof Enum) {
            return ((Enum)\u2603).name().toLowerCase(Locale.US);
        }
        return \u2603.toString().toLowerCase(Locale.US);
    }
}
