import org.apache.commons.lang3.StringUtils;
import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class id implements ff<ic>
{
    private String a;
    private cj b;
    
    public id() {
    }
    
    public id(final String \u2603) {
        this(\u2603, null);
    }
    
    public id(final String \u2603, final cj \u2603) {
        this.a = \u2603;
        this.b = \u2603;
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.c(32767);
        final boolean boolean1 = \u2603.readBoolean();
        if (boolean1) {
            this.b = \u2603.c();
        }
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.a(StringUtils.substring(this.a, 0, 32767));
        final boolean \u26032 = this.b != null;
        \u2603.writeBoolean(\u26032);
        if (\u26032) {
            \u2603.a(this.b);
        }
    }
    
    @Override
    public void a(final ic \u2603) {
        \u2603.a(this);
    }
    
    public String a() {
        return this.a;
    }
    
    public cj b() {
        return this.b;
    }
}
