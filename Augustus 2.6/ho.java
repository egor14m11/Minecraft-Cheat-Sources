import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class ho implements ff<fj>
{
    private float a;
    private int b;
    private int c;
    
    public ho() {
    }
    
    public ho(final float \u2603, final int \u2603, final int \u2603) {
        this.a = \u2603;
        this.b = \u2603;
        this.c = \u2603;
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.readFloat();
        this.c = \u2603.e();
        this.b = \u2603.e();
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.writeFloat(this.a);
        \u2603.b(this.c);
        \u2603.b(this.b);
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
    
    public int c() {
        return this.c;
    }
}
