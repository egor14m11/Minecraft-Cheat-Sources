import java.text.ParseException;
import com.google.gson.JsonObject;
import java.util.Date;
import java.text.SimpleDateFormat;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class ls<T> extends ma<T>
{
    public static final SimpleDateFormat a;
    protected final Date b;
    protected final String c;
    protected final Date d;
    protected final String e;
    
    public ls(final T \u2603, final Date \u2603, final String \u2603, final Date \u2603, final String \u2603) {
        super(\u2603);
        this.b = ((\u2603 == null) ? new Date() : \u2603);
        this.c = ((\u2603 == null) ? "(Unknown)" : \u2603);
        this.d = \u2603;
        this.e = ((\u2603 == null) ? "Banned by an operator." : \u2603);
    }
    
    protected ls(final T \u2603, final JsonObject \u2603) {
        super(\u2603, \u2603);
        Date b;
        try {
            b = (\u2603.has("created") ? ls.a.parse(\u2603.get("created").getAsString()) : new Date());
        }
        catch (ParseException ex) {
            b = new Date();
        }
        this.b = b;
        this.c = (\u2603.has("source") ? \u2603.get("source").getAsString() : "(Unknown)");
        Date d;
        try {
            d = (\u2603.has("expires") ? ls.a.parse(\u2603.get("expires").getAsString()) : null);
        }
        catch (ParseException ex2) {
            d = null;
        }
        this.d = d;
        this.e = (\u2603.has("reason") ? \u2603.get("reason").getAsString() : "Banned by an operator.");
    }
    
    public Date c() {
        return this.d;
    }
    
    public String d() {
        return this.e;
    }
    
    @Override
    boolean e() {
        return this.d != null && this.d.before(new Date());
    }
    
    @Override
    protected void a(final JsonObject \u2603) {
        \u2603.addProperty("created", ls.a.format(this.b));
        \u2603.addProperty("source", this.c);
        \u2603.addProperty("expires", (this.d == null) ? "forever" : ls.a.format(this.d));
        \u2603.addProperty("reason", this.e);
    }
    
    static {
        a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
    }
}
