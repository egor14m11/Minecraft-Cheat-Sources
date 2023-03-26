import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class fk implements ff<fj>
{
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    
    public fk() {
    }
    
    public fk(final pk \u2603, final int \u2603) {
        this(\u2603, \u2603, 0);
    }
    
    public fk(final pk \u2603, final int \u2603, final int \u2603) {
        this.a = \u2603.F();
        this.b = ns.c(\u2603.s * 32.0);
        this.c = ns.c(\u2603.t * 32.0);
        this.d = ns.c(\u2603.u * 32.0);
        this.h = ns.d(\u2603.z * 256.0f / 360.0f);
        this.i = ns.d(\u2603.y * 256.0f / 360.0f);
        this.j = \u2603;
        this.k = \u2603;
        if (\u2603 > 0) {
            double v = \u2603.v;
            double w = \u2603.w;
            double x = \u2603.x;
            final double n = 3.9;
            if (v < -n) {
                v = -n;
            }
            if (w < -n) {
                w = -n;
            }
            if (x < -n) {
                x = -n;
            }
            if (v > n) {
                v = n;
            }
            if (w > n) {
                w = n;
            }
            if (x > n) {
                x = n;
            }
            this.e = (int)(v * 8000.0);
            this.f = (int)(w * 8000.0);
            this.g = (int)(x * 8000.0);
        }
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.e();
        this.j = \u2603.readByte();
        this.b = \u2603.readInt();
        this.c = \u2603.readInt();
        this.d = \u2603.readInt();
        this.h = \u2603.readByte();
        this.i = \u2603.readByte();
        this.k = \u2603.readInt();
        if (this.k > 0) {
            this.e = \u2603.readShort();
            this.f = \u2603.readShort();
            this.g = \u2603.readShort();
        }
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.b(this.a);
        \u2603.writeByte(this.j);
        \u2603.writeInt(this.b);
        \u2603.writeInt(this.c);
        \u2603.writeInt(this.d);
        \u2603.writeByte(this.h);
        \u2603.writeByte(this.i);
        \u2603.writeInt(this.k);
        if (this.k > 0) {
            \u2603.writeShort(this.e);
            \u2603.writeShort(this.f);
            \u2603.writeShort(this.g);
        }
    }
    
    @Override
    public void a(final fj \u2603) {
        \u2603.a(this);
    }
    
    public int a() {
        return this.a;
    }
    
    public int b() {
        return this.b;
    }
    
    public int c() {
        return this.c;
    }
    
    public int d() {
        return this.d;
    }
    
    public int e() {
        return this.e;
    }
    
    public int f() {
        return this.f;
    }
    
    public int g() {
        return this.g;
    }
    
    public int h() {
        return this.h;
    }
    
    public int i() {
        return this.i;
    }
    
    public int j() {
        return this.j;
    }
    
    public int k() {
        return this.k;
    }
    
    public void a(final int \u2603) {
        this.b = \u2603;
    }
    
    public void b(final int \u2603) {
        this.c = \u2603;
    }
    
    public void c(final int \u2603) {
        this.d = \u2603;
    }
    
    public void d(final int \u2603) {
        this.e = \u2603;
    }
    
    public void e(final int \u2603) {
        this.f = \u2603;
    }
    
    public void f(final int \u2603) {
        this.g = \u2603;
    }
    
    public void g(final int \u2603) {
        this.k = \u2603;
    }
}
