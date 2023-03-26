import java.io.IOException;
import java.util.List;
import java.util.UUID;

// 
// Decompiled by Procyon v0.5.36
// 

public class fp implements ff<fj>
{
    private int a;
    private UUID b;
    private int c;
    private int d;
    private int e;
    private byte f;
    private byte g;
    private int h;
    private pz i;
    private List<pz.a> j;
    
    public fp() {
    }
    
    public fp(final wn \u2603) {
        this.a = \u2603.F();
        this.b = \u2603.cd().getId();
        this.c = ns.c(\u2603.s * 32.0);
        this.d = ns.c(\u2603.t * 32.0);
        this.e = ns.c(\u2603.u * 32.0);
        this.f = (byte)(\u2603.y * 256.0f / 360.0f);
        this.g = (byte)(\u2603.z * 256.0f / 360.0f);
        final zx h = \u2603.bi.h();
        this.h = ((h == null) ? 0 : zw.b(h.b()));
        this.i = \u2603.H();
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.e();
        this.b = \u2603.g();
        this.c = \u2603.readInt();
        this.d = \u2603.readInt();
        this.e = \u2603.readInt();
        this.f = \u2603.readByte();
        this.g = \u2603.readByte();
        this.h = \u2603.readShort();
        this.j = pz.b(\u2603);
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.b(this.a);
        \u2603.a(this.b);
        \u2603.writeInt(this.c);
        \u2603.writeInt(this.d);
        \u2603.writeInt(this.e);
        \u2603.writeByte(this.f);
        \u2603.writeByte(this.g);
        \u2603.writeShort(this.h);
        this.i.a(\u2603);
    }
    
    @Override
    public void a(final fj \u2603) {
        \u2603.a(this);
    }
    
    public List<pz.a> a() {
        if (this.j == null) {
            this.j = this.i.c();
        }
        return this.j;
    }
    
    public int b() {
        return this.a;
    }
    
    public UUID c() {
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
    
    public byte g() {
        return this.f;
    }
    
    public byte h() {
        return this.g;
    }
    
    public int i() {
        return this.h;
    }
}
