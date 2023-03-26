import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class gq implements ff<fj>
{
    private int a;
    private cj b;
    private int c;
    private boolean d;
    
    public gq() {
    }
    
    public gq(final int \u2603, final cj \u2603, final int \u2603, final boolean \u2603) {
        this.a = \u2603;
        this.b = \u2603;
        this.c = \u2603;
        this.d = \u2603;
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.readInt();
        this.b = \u2603.c();
        this.c = \u2603.readInt();
        this.d = \u2603.readBoolean();
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.writeInt(this.a);
        \u2603.a(this.b);
        \u2603.writeInt(this.c);
        \u2603.writeBoolean(this.d);
    }
    
    @Override
    public void a(final fj \u2603) {
        \u2603.a(this);
    }
    
    public boolean a() {
        return this.d;
    }
    
    public int b() {
        return this.a;
    }
    
    public int c() {
        return this.c;
    }
    
    public cj d() {
        return this.b;
    }
}
