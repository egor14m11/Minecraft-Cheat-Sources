import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class gr implements ff<fj>
{
    private cy a;
    private float b;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;
    private int i;
    private boolean j;
    private int[] k;
    
    public gr() {
    }
    
    public gr(final cy \u2603, final boolean \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final int \u2603, final int... \u2603) {
        this.a = \u2603;
        this.j = \u2603;
        this.b = \u2603;
        this.c = \u2603;
        this.d = \u2603;
        this.e = \u2603;
        this.f = \u2603;
        this.g = \u2603;
        this.h = \u2603;
        this.i = \u2603;
        this.k = \u2603;
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = cy.a(\u2603.readInt());
        if (this.a == null) {
            this.a = cy.J;
        }
        this.j = \u2603.readBoolean();
        this.b = \u2603.readFloat();
        this.c = \u2603.readFloat();
        this.d = \u2603.readFloat();
        this.e = \u2603.readFloat();
        this.f = \u2603.readFloat();
        this.g = \u2603.readFloat();
        this.h = \u2603.readFloat();
        this.i = \u2603.readInt();
        final int d = this.a.d();
        this.k = new int[d];
        for (int i = 0; i < d; ++i) {
            this.k[i] = \u2603.e();
        }
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.writeInt(this.a.c());
        \u2603.writeBoolean(this.j);
        \u2603.writeFloat(this.b);
        \u2603.writeFloat(this.c);
        \u2603.writeFloat(this.d);
        \u2603.writeFloat(this.e);
        \u2603.writeFloat(this.f);
        \u2603.writeFloat(this.g);
        \u2603.writeFloat(this.h);
        \u2603.writeInt(this.i);
        for (int d = this.a.d(), i = 0; i < d; ++i) {
            \u2603.b(this.k[i]);
        }
    }
    
    public cy a() {
        return this.a;
    }
    
    public boolean b() {
        return this.j;
    }
    
    public double c() {
        return this.b;
    }
    
    public double d() {
        return this.c;
    }
    
    public double e() {
        return this.d;
    }
    
    public float f() {
        return this.e;
    }
    
    public float g() {
        return this.f;
    }
    
    public float h() {
        return this.g;
    }
    
    public float i() {
        return this.h;
    }
    
    public int j() {
        return this.i;
    }
    
    public int[] k() {
        return this.k;
    }
    
    @Override
    public void a(final fj \u2603) {
        \u2603.a(this);
    }
}
