import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonObject;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonDeserializer;

// 
// Decompiled by Procyon v0.5.36
// 

public class ez
{
    private ez a;
    private a b;
    private Boolean c;
    private Boolean d;
    private Boolean e;
    private Boolean f;
    private Boolean g;
    private et h;
    private ew i;
    private String j;
    private static final ez k;
    
    public a a() {
        return (this.b == null) ? this.o().a() : this.b;
    }
    
    public boolean b() {
        return (this.c == null) ? this.o().b() : this.c;
    }
    
    public boolean c() {
        return (this.d == null) ? this.o().c() : this.d;
    }
    
    public boolean d() {
        return (this.f == null) ? this.o().d() : this.f;
    }
    
    public boolean e() {
        return (this.e == null) ? this.o().e() : this.e;
    }
    
    public boolean f() {
        return (this.g == null) ? this.o().f() : this.g;
    }
    
    public boolean g() {
        return this.c == null && this.d == null && this.f == null && this.e == null && this.g == null && this.b == null && this.h == null && this.i == null;
    }
    
    public et h() {
        return (this.h == null) ? this.o().h() : this.h;
    }
    
    public ew i() {
        return (this.i == null) ? this.o().i() : this.i;
    }
    
    public String j() {
        return (this.j == null) ? this.o().j() : this.j;
    }
    
    public ez a(final a \u2603) {
        this.b = \u2603;
        return this;
    }
    
    public ez a(final Boolean \u2603) {
        this.c = \u2603;
        return this;
    }
    
    public ez b(final Boolean \u2603) {
        this.d = \u2603;
        return this;
    }
    
    public ez c(final Boolean \u2603) {
        this.f = \u2603;
        return this;
    }
    
    public ez d(final Boolean \u2603) {
        this.e = \u2603;
        return this;
    }
    
    public ez e(final Boolean \u2603) {
        this.g = \u2603;
        return this;
    }
    
    public ez a(final et \u2603) {
        this.h = \u2603;
        return this;
    }
    
    public ez a(final ew \u2603) {
        this.i = \u2603;
        return this;
    }
    
    public ez a(final String \u2603) {
        this.j = \u2603;
        return this;
    }
    
    public ez a(final ez \u2603) {
        this.a = \u2603;
        return this;
    }
    
    public String k() {
        if (!this.g()) {
            final StringBuilder sb = new StringBuilder();
            if (this.a() != null) {
                sb.append(this.a());
            }
            if (this.b()) {
                sb.append(a.r);
            }
            if (this.c()) {
                sb.append(a.u);
            }
            if (this.e()) {
                sb.append(a.t);
            }
            if (this.f()) {
                sb.append(a.q);
            }
            if (this.d()) {
                sb.append(a.s);
            }
            return sb.toString();
        }
        if (this.a != null) {
            return this.a.k();
        }
        return "";
    }
    
    private ez o() {
        return (this.a == null) ? ez.k : this.a;
    }
    
    @Override
    public String toString() {
        return "Style{hasParent=" + (this.a != null) + ", color=" + this.b + ", bold=" + this.c + ", italic=" + this.d + ", underlined=" + this.e + ", obfuscated=" + this.g + ", clickEvent=" + this.h() + ", hoverEvent=" + this.i() + ", insertion=" + this.j() + '}';
    }
    
    @Override
    public boolean equals(final Object \u2603) {
        if (this == \u2603) {
            return true;
        }
        if (\u2603 instanceof ez) {
            final ez ez = (ez)\u2603;
            if (this.b() == ez.b() && this.a() == ez.a() && this.c() == ez.c() && this.f() == ez.f() && this.d() == ez.d() && this.e() == ez.e()) {
                if (this.h() != null) {
                    if (!this.h().equals(ez.h())) {
                        return false;
                    }
                }
                else if (ez.h() != null) {
                    return false;
                }
                if (this.i() != null) {
                    if (!this.i().equals(ez.i())) {
                        return false;
                    }
                }
                else if (ez.i() != null) {
                    return false;
                }
                if ((this.j() == null) ? (ez.j() == null) : this.j().equals(ez.j())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        int hashCode = this.b.hashCode();
        hashCode = 31 * hashCode + this.c.hashCode();
        hashCode = 31 * hashCode + this.d.hashCode();
        hashCode = 31 * hashCode + this.e.hashCode();
        hashCode = 31 * hashCode + this.f.hashCode();
        hashCode = 31 * hashCode + this.g.hashCode();
        hashCode = 31 * hashCode + this.h.hashCode();
        hashCode = 31 * hashCode + this.i.hashCode();
        hashCode = 31 * hashCode + this.j.hashCode();
        return hashCode;
    }
    
    public ez m() {
        final ez ez = new ez();
        ez.c = this.c;
        ez.d = this.d;
        ez.f = this.f;
        ez.e = this.e;
        ez.g = this.g;
        ez.b = this.b;
        ez.h = this.h;
        ez.i = this.i;
        ez.a = this.a;
        ez.j = this.j;
        return ez;
    }
    
    public ez n() {
        final ez ez = new ez();
        ez.a(this.b());
        ez.b(this.c());
        ez.c(this.d());
        ez.d(this.e());
        ez.e(this.f());
        ez.a(this.a());
        ez.a(this.h());
        ez.a(this.i());
        ez.a(this.j());
        return ez;
    }
    
    static {
        k = new ez() {
            @Override
            public a a() {
                return null;
            }
            
            @Override
            public boolean b() {
                return false;
            }
            
            @Override
            public boolean c() {
                return false;
            }
            
            @Override
            public boolean d() {
                return false;
            }
            
            @Override
            public boolean e() {
                return false;
            }
            
            @Override
            public boolean f() {
                return false;
            }
            
            @Override
            public et h() {
                return null;
            }
            
            @Override
            public ew i() {
                return null;
            }
            
            @Override
            public String j() {
                return null;
            }
            
            @Override
            public ez a(final a \u2603) {
                throw new UnsupportedOperationException();
            }
            
            @Override
            public ez a(final Boolean \u2603) {
                throw new UnsupportedOperationException();
            }
            
            @Override
            public ez b(final Boolean \u2603) {
                throw new UnsupportedOperationException();
            }
            
            @Override
            public ez c(final Boolean \u2603) {
                throw new UnsupportedOperationException();
            }
            
            @Override
            public ez d(final Boolean \u2603) {
                throw new UnsupportedOperationException();
            }
            
            @Override
            public ez e(final Boolean \u2603) {
                throw new UnsupportedOperationException();
            }
            
            @Override
            public ez a(final et \u2603) {
                throw new UnsupportedOperationException();
            }
            
            @Override
            public ez a(final ew \u2603) {
                throw new UnsupportedOperationException();
            }
            
            @Override
            public ez a(final ez \u2603) {
                throw new UnsupportedOperationException();
            }
            
            @Override
            public String toString() {
                return "Style.ROOT";
            }
            
            @Override
            public ez m() {
                return this;
            }
            
            @Override
            public ez n() {
                return this;
            }
            
            @Override
            public String k() {
                return "";
            }
        };
    }
    
    public static class a implements JsonDeserializer<ez>, JsonSerializer<ez>
    {
        public ez a(final JsonElement \u2603, final Type \u2603, final JsonDeserializationContext \u2603) throws JsonParseException {
            if (!\u2603.isJsonObject()) {
                return null;
            }
            final ez \u26032 = new ez();
            final JsonObject asJsonObject = \u2603.getAsJsonObject();
            if (asJsonObject == null) {
                return null;
            }
            if (asJsonObject.has("bold")) {
                \u26032.c = asJsonObject.get("bold").getAsBoolean();
            }
            if (asJsonObject.has("italic")) {
                \u26032.d = asJsonObject.get("italic").getAsBoolean();
            }
            if (asJsonObject.has("underlined")) {
                \u26032.e = asJsonObject.get("underlined").getAsBoolean();
            }
            if (asJsonObject.has("strikethrough")) {
                \u26032.f = asJsonObject.get("strikethrough").getAsBoolean();
            }
            if (asJsonObject.has("obfuscated")) {
                \u26032.g = asJsonObject.get("obfuscated").getAsBoolean();
            }
            if (asJsonObject.has("color")) {
                \u26032.b = \u2603.deserialize(asJsonObject.get("color"), a.class);
            }
            if (asJsonObject.has("insertion")) {
                \u26032.j = asJsonObject.get("insertion").getAsString();
            }
            if (asJsonObject.has("clickEvent")) {
                final JsonObject jsonObject = asJsonObject.getAsJsonObject("clickEvent");
                if (jsonObject != null) {
                    final JsonPrimitive jsonPrimitive = jsonObject.getAsJsonPrimitive("action");
                    final et.a \u26033 = (jsonPrimitive == null) ? null : et.a.a(jsonPrimitive.getAsString());
                    final JsonPrimitive asJsonPrimitive = jsonObject.getAsJsonPrimitive("value");
                    final String \u26034 = (asJsonPrimitive == null) ? null : asJsonPrimitive.getAsString();
                    if (\u26033 != null && \u26034 != null && \u26033.a()) {
                        \u26032.h = new et(\u26033, \u26034);
                    }
                }
            }
            if (asJsonObject.has("hoverEvent")) {
                final JsonObject jsonObject = asJsonObject.getAsJsonObject("hoverEvent");
                if (jsonObject != null) {
                    final JsonPrimitive jsonPrimitive = jsonObject.getAsJsonPrimitive("action");
                    final ew.a \u26035 = (jsonPrimitive == null) ? null : ew.a.a(jsonPrimitive.getAsString());
                    final eu \u26036 = \u2603.deserialize(jsonObject.get("value"), eu.class);
                    if (\u26035 != null && \u26036 != null && \u26035.a()) {
                        \u26032.i = new ew(\u26035, \u26036);
                    }
                }
            }
            return \u26032;
        }
        
        public JsonElement a(final ez \u2603, final Type \u2603, final JsonSerializationContext \u2603) {
            if (\u2603.g()) {
                return null;
            }
            final JsonObject jsonObject = new JsonObject();
            if (\u2603.c != null) {
                jsonObject.addProperty("bold", \u2603.c);
            }
            if (\u2603.d != null) {
                jsonObject.addProperty("italic", \u2603.d);
            }
            if (\u2603.e != null) {
                jsonObject.addProperty("underlined", \u2603.e);
            }
            if (\u2603.f != null) {
                jsonObject.addProperty("strikethrough", \u2603.f);
            }
            if (\u2603.g != null) {
                jsonObject.addProperty("obfuscated", \u2603.g);
            }
            if (\u2603.b != null) {
                jsonObject.add("color", \u2603.serialize(\u2603.b));
            }
            if (\u2603.j != null) {
                jsonObject.add("insertion", \u2603.serialize(\u2603.j));
            }
            if (\u2603.h != null) {
                final JsonObject jsonObject2 = new JsonObject();
                jsonObject2.addProperty("action", \u2603.h.a().b());
                jsonObject2.addProperty("value", \u2603.h.b());
                jsonObject.add("clickEvent", jsonObject2);
            }
            if (\u2603.i != null) {
                final JsonObject jsonObject2 = new JsonObject();
                jsonObject2.addProperty("action", \u2603.i.a().b());
                jsonObject2.add("value", \u2603.serialize(\u2603.i.b()));
                jsonObject.add("hoverEvent", jsonObject2);
            }
            return jsonObject;
        }
    }
}
