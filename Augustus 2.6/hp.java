import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class hp implements ff<fj>
{
    private float a;
    private int b;
    private float c;
    
    public hp() {
    }
    
    public hp(final float \u2603, final int \u2603, final float \u2603) {
        this.a = \u2603;
        this.b = \u2603;
        this.c = \u2603;
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.readFloat();
        this.b = \u2603.e();
        this.c = \u2603.readFloat();
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.writeFloat(this.a);
        \u2603.b(this.b);
        \u2603.writeFloat(this.c);
    }
    
    @Override
    public void a(final fj \u2603) {
        \u2603.a(this);
    }
    
    public float a() {
        return this.a;
    }
    
    public int b() {
        return this.b;
    }
    
    public float c() {
        return this.c;
    }
}
