import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class gc implements ff<fj>
{
    private int a;
    private String b;
    private eu c;
    private int d;
    private int e;
    
    public gc() {
    }
    
    public gc(final int \u2603, final String \u2603, final eu \u2603) {
        this(\u2603, \u2603, \u2603, 0);
    }
    
    public gc(final int \u2603, final String \u2603, final eu \u2603, final int \u2603) {
        this.a = \u2603;
        this.b = \u2603;
        this.c = \u2603;
        this.d = \u2603;
    }
    
    public gc(final int \u2603, final String \u2603, final eu \u2603, final int \u2603, final int \u2603) {
        this(\u2603, \u2603, \u2603, \u2603);
        this.e = \u2603;
    }
    
    @Override
    public void a(final fj \u2603) {
        \u2603.a(this);
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.readUnsignedByte();
        this.b = \u2603.c(32);
        this.c = \u2603.d();
        this.d = \u2603.readUnsignedByte();
        if (this.b.equals("EntityHorse")) {
            this.e = \u2603.readInt();
        }
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.writeByte(this.a);
        \u2603.a(this.b);
        \u2603.a(this.c);
        \u2603.writeByte(this.d);
        if (this.b.equals("EntityHorse")) {
            \u2603.writeInt(this.e);
        }
    }
    
    public int a() {
        return this.a;
    }
    
    public String b() {
        return this.b;
    }
    
    public eu c() {
        return this.c;
    }
    
    public int d() {
        return this.d;
    }
    
    public int e() {
        return this.e;
    }
    
    public boolean f() {
        return this.d > 0;
    }
}
