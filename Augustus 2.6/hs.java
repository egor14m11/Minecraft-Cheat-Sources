import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class hs implements ff<fj>
{
    private String a;
    private String b;
    private int c;
    private a d;
    
    public hs() {
        this.a = "";
        this.b = "";
    }
    
    public hs(final aum \u2603) {
        this.a = "";
        this.b = "";
        this.a = \u2603.e();
        this.b = \u2603.d().b();
        this.c = \u2603.c();
        this.d = hs.a.a;
    }
    
    public hs(final String \u2603) {
        this.a = "";
        this.b = "";
        this.a = \u2603;
        this.b = "";
        this.c = 0;
        this.d = hs.a.b;
    }
    
    public hs(final String \u2603, final auk \u2603) {
        this.a = "";
        this.b = "";
        this.a = \u2603;
        this.b = \u2603.b();
        this.c = 0;
        this.d = hs.a.b;
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.c(40);
        this.d = \u2603.a(a.class);
        this.b = \u2603.c(16);
        if (this.d != hs.a.b) {
            this.c = \u2603.e();
        }
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.a(this.a);
        \u2603.a(this.d);
        \u2603.a(this.b);
        if (this.d != hs.a.b) {
            \u2603.b(this.c);
        }
    }
    
    @Override
    public void a(final fj \u2603) {
        \u2603.a(this);
    }
    
    public String a() {
        return this.a;
    }
    
    public String b() {
        return this.b;
    }
    
    public int c() {
        return this.c;
    }
    
    public a d() {
        return this.d;
    }
    
    public enum a
    {
        a, 
        b;
    }
}
