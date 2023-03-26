import com.google.gson.JsonPrimitive;
import org.apache.commons.lang3.StringUtils;
import com.google.gson.JsonArray;
import com.google.gson.JsonSyntaxException;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

// 
// Decompiled by Procyon v0.5.36
// 

public class ni
{
    public static boolean a(final JsonObject \u2603, final String \u2603) {
        return f(\u2603, \u2603) && \u2603.getAsJsonPrimitive(\u2603).isString();
    }
    
    public static boolean a(final JsonElement \u2603) {
        return \u2603.isJsonPrimitive() && \u2603.getAsJsonPrimitive().isString();
    }
    
    public static boolean c(final JsonObject \u2603, final String \u2603) {
        return f(\u2603, \u2603) && \u2603.getAsJsonPrimitive(\u2603).isBoolean();
    }
    
    public static boolean d(final JsonObject \u2603, final String \u2603) {
        return g(\u2603, \u2603) && \u2603.get(\u2603).isJsonArray();
    }
    
    public static boolean f(final JsonObject \u2603, final String \u2603) {
        return g(\u2603, \u2603) && \u2603.get(\u2603).isJsonPrimitive();
    }
    
    public static boolean g(final JsonObject \u2603, final String \u2603) {
        return \u2603 != null && \u2603.get(\u2603) != null;
    }
    
    public static String a(final JsonElement \u2603, final String \u2603) {
        if (\u2603.isJsonPrimitive()) {
            return \u2603.getAsString();
        }
        throw new JsonSyntaxException("Expected " + \u2603 + " to be a string, was " + d(\u2603));
    }
    
    public static String h(final JsonObject \u2603, final String \u2603) {
        if (\u2603.has(\u2603)) {
            return a(\u2603.get(\u2603), \u2603);
        }
        throw new JsonSyntaxException("Missing " + \u2603 + ", expected to find a string");
    }
    
    public static String a(final JsonObject \u2603, final String \u2603, final String \u2603) {
        if (\u2603.has(\u2603)) {
            return a(\u2603.get(\u2603), \u2603);
        }
        return \u2603;
    }
    
    public static boolean b(final JsonElement \u2603, final String \u2603) {
        if (\u2603.isJsonPrimitive()) {
            return \u2603.getAsBoolean();
        }
        throw new JsonSyntaxException("Expected " + \u2603 + " to be a Boolean, was " + d(\u2603));
    }
    
    public static boolean i(final JsonObject \u2603, final String \u2603) {
        if (\u2603.has(\u2603)) {
            return b(\u2603.get(\u2603), \u2603);
        }
        throw new JsonSyntaxException("Missing " + \u2603 + ", expected to find a Boolean");
    }
    
    public static boolean a(final JsonObject \u2603, final String \u2603, final boolean \u2603) {
        if (\u2603.has(\u2603)) {
            return b(\u2603.get(\u2603), \u2603);
        }
        return \u2603;
    }
    
    public static float d(final JsonElement \u2603, final String \u2603) {
        if (\u2603.isJsonPrimitive() && \u2603.getAsJsonPrimitive().isNumber()) {
            return \u2603.getAsFloat();
        }
        throw new JsonSyntaxException("Expected " + \u2603 + " to be a Float, was " + d(\u2603));
    }
    
    public static float k(final JsonObject \u2603, final String \u2603) {
        if (\u2603.has(\u2603)) {
            return d(\u2603.get(\u2603), \u2603);
        }
        throw new JsonSyntaxException("Missing " + \u2603 + ", expected to find a Float");
    }
    
    public static float a(final JsonObject \u2603, final String \u2603, final float \u2603) {
        if (\u2603.has(\u2603)) {
            return d(\u2603.get(\u2603), \u2603);
        }
        return \u2603;
    }
    
    public static int f(final JsonElement \u2603, final String \u2603) {
        if (\u2603.isJsonPrimitive() && \u2603.getAsJsonPrimitive().isNumber()) {
            return \u2603.getAsInt();
        }
        throw new JsonSyntaxException("Expected " + \u2603 + " to be a Int, was " + d(\u2603));
    }
    
    public static int m(final JsonObject \u2603, final String \u2603) {
        if (\u2603.has(\u2603)) {
            return f(\u2603.get(\u2603), \u2603);
        }
        throw new JsonSyntaxException("Missing " + \u2603 + ", expected to find a Int");
    }
    
    public static int a(final JsonObject \u2603, final String \u2603, final int \u2603) {
        if (\u2603.has(\u2603)) {
            return f(\u2603.get(\u2603), \u2603);
        }
        return \u2603;
    }
    
    public static JsonObject l(final JsonElement \u2603, final String \u2603) {
        if (\u2603.isJsonObject()) {
            return \u2603.getAsJsonObject();
        }
        throw new JsonSyntaxException("Expected " + \u2603 + " to be a JsonObject, was " + d(\u2603));
    }
    
    public static JsonObject s(final JsonObject \u2603, final String \u2603) {
        if (\u2603.has(\u2603)) {
            return l(\u2603.get(\u2603), \u2603);
        }
        throw new JsonSyntaxException("Missing " + \u2603 + ", expected to find a JsonObject");
    }
    
    public static JsonObject a(final JsonObject \u2603, final String \u2603, final JsonObject \u2603) {
        if (\u2603.has(\u2603)) {
            return l(\u2603.get(\u2603), \u2603);
        }
        return \u2603;
    }
    
    public static JsonArray m(final JsonElement \u2603, final String \u2603) {
        if (\u2603.isJsonArray()) {
            return \u2603.getAsJsonArray();
        }
        throw new JsonSyntaxException("Expected " + \u2603 + " to be a JsonArray, was " + d(\u2603));
    }
    
    public static JsonArray t(final JsonObject \u2603, final String \u2603) {
        if (\u2603.has(\u2603)) {
            return m(\u2603.get(\u2603), \u2603);
        }
        throw new JsonSyntaxException("Missing " + \u2603 + ", expected to find a JsonArray");
    }
    
    public static JsonArray a(final JsonObject \u2603, final String \u2603, final JsonArray \u2603) {
        if (\u2603.has(\u2603)) {
            return m(\u2603.get(\u2603), \u2603);
        }
        return \u2603;
    }
    
    public static String d(final JsonElement \u2603) {
        final String abbreviateMiddle = StringUtils.abbreviateMiddle(String.valueOf(\u2603), "...", 10);
        if (\u2603 == null) {
            return "null (missing)";
        }
        if (\u2603.isJsonNull()) {
            return "null (json)";
        }
        if (\u2603.isJsonArray()) {
            return "an array (" + abbreviateMiddle + ")";
        }
        if (\u2603.isJsonObject()) {
            return "an object (" + abbreviateMiddle + ")";
        }
        if (\u2603.isJsonPrimitive()) {
            final JsonPrimitive asJsonPrimitive = \u2603.getAsJsonPrimitive();
            if (asJsonPrimitive.isNumber()) {
                return "a number (" + abbreviateMiddle + ")";
            }
            if (asJsonPrimitive.isBoolean()) {
                return "a boolean (" + abbreviateMiddle + ")";
            }
        }
        return abbreviateMiddle;
    }
}
