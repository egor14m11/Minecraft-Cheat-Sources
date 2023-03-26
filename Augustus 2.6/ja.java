import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class ja implements ff<ic>
{
    private static final cj a;
    private cj b;
    private int c;
    private zx d;
    private float e;
    private float f;
    private float g;
    
    public ja() {
    }
    
    public ja(final zx \u2603) {
        this(ja.a, 255, \u2603, 0.0f, 0.0f, 0.0f);
    }
    
    public ja(final cj \u2603, final int \u2603, final zx \u2603, final float \u2603, final float \u2603, final float \u2603) {
        this.b = \u2603;
        this.c = \u2603;
        this.d = ((\u2603 != null) ? \u2603.k() : null);
        this.e = \u2603;
        this.f = \u2603;
        this.g = \u2603;
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.b = \u2603.c();
        this.c = \u2603.readUnsignedByte();
        this.d = \u2603.i();
        this.e = \u2603.readUnsignedByte() / 16.0f;
        this.f = \u2603.readUnsignedByte() / 16.0f;
        this.g = \u2603.readUnsignedByte() / 16.0f;
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.a(this.b);
        \u2603.writeByte(this.c);
        \u2603.a(this.d);
        \u2603.writeByte((int)(this.e * 16.0f));
        \u2603.writeByte((int)(this.f * 16.0f));
        \u2603.writeByte((int)(this.g * 16.0f));
    }
    
    @Override
    public void a(final ic \u2603) {
        \u2603.a(this);
    }
    
    public cj a() {
        return this.b;
    }
    
    public int b() {
        return this.c;
    }
    
    public zx c() {
        return this.d;
    }
    
    public float d() {
        return this.e;
    }
    
    public float e() {
        return this.f;
    }
    
    public float f() {
        return this.g;
    }
    
    static {
        a = new cj(-1, -1, -1);
    }
}
