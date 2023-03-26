import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class in implements ff<ic>
{
    private int a;
    private a b;
    private aui c;
    
    public in() {
    }
    
    public in(final pk \u2603, final a \u2603) {
        this.a = \u2603.F();
        this.b = \u2603;
    }
    
    public in(final pk \u2603, final aui \u2603) {
        this(\u2603, in.a.c);
        this.c = \u2603;
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.e();
        this.b = \u2603.a(a.class);
        if (this.b == in.a.c) {
            this.c = new aui(\u2603.readFloat(), \u2603.readFloat(), \u2603.readFloat());
        }
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.b(this.a);
        \u2603.a(this.b);
        if (this.b == in.a.c) {
            \u2603.writeFloat((float)this.c.a);
            \u2603.writeFloat((float)this.c.b);
            \u2603.writeFloat((float)this.c.c);
        }
    }
    
    @Override
    public void a(final ic \u2603) {
        \u2603.a(this);
    }
    
    public pk a(final adm \u2603) {
        return \u2603.a(this.a);
    }
    
    public a a() {
        return this.b;
    }
    
    public aui b() {
        return this.c;
    }
    
    public enum a
    {
        a, 
        b, 
        c;
    }
}
