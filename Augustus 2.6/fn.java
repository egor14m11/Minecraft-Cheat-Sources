import java.io.IOException;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class fn implements ff<fj>
{
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private byte i;
    private byte j;
    private byte k;
    private pz l;
    private List<pz.a> m;
    
    public fn() {
    }
    
    public fn(final pr \u2603) {
        this.a = \u2603.F();
        this.b = (byte)pm.a(\u2603);
        this.c = ns.c(\u2603.s * 32.0);
        this.d = ns.c(\u2603.t * 32.0);
        this.e = ns.c(\u2603.u * 32.0);
        this.i = (byte)(\u2603.y * 256.0f / 360.0f);
        this.j = (byte)(\u2603.z * 256.0f / 360.0f);
        this.k = (byte)(\u2603.aK * 256.0f / 360.0f);
        final double n = 3.9;
        double v = \u2603.v;
        double w = \u2603.w;
        double x = \u2603.x;
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
        this.f = (int)(v * 8000.0);
        this.g = (int)(w * 8000.0);
        this.h = (int)(x * 8000.0);
        this.l = \u2603.H();
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.e();
        this.b = (\u2603.readByte() & 0xFF);
        this.c = \u2603.readInt();
        this.d = \u2603.readInt();
        this.e = \u2603.readInt();
        this.i = \u2603.readByte();
        this.j = \u2603.readByte();
        this.k = \u2603.readByte();
        this.f = \u2603.readShort();
        this.g = \u2603.readShort();
        this.h = \u2603.readShort();
        this.m = pz.b(\u2603);
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.b(this.a);
        \u2603.writeByte(this.b & 0xFF);
        \u2603.writeInt(this.c);
        \u2603.writeInt(this.d);
        \u2603.writeInt(this.e);
        \u2603.writeByte(this.i);
        \u2603.writeByte(this.j);
        \u2603.writeByte(this.k);
        \u2603.writeShort(this.f);
        \u2603.writeShort(this.g);
        \u2603.writeShort(this.h);
        this.l.a(\u2603);
    }
    
    @Override
    public void a(final fj \u2603) {
        \u2603.a(this);
    }
    
    public List<pz.a> a() {
        if (this.m == null) {
            this.m = this.l.c();
        }
        return this.m;
    }
    
    public int b() {
        return this.a;
    }
    
    public int c() {
        return this.b;
    }
    
    public int d() {
        return this.c;
    }
    
    public int e() {
        return this.d;
    }
    
    public int f() {
        return this.e;
    }
    
    public int g() {
        return this.f;
    }
    
    public int h() {
        return this.g;
    }
    
    public int i() {
        return this.h;
    }
    
    public byte j() {
        return this.i;
    }
    
    public byte k() {
        return this.j;
    }
    
    public byte l() {
        return this.k;
    }
}
