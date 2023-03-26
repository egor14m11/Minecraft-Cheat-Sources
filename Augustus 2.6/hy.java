import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class hy implements ff<fj>
{
    private int a;
    private int b;
    
    public hy() {
    }
    
    public hy(final int \u2603, final int \u2603) {
        this.a = \u2603;
        this.b = \u2603;
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.e();
        this.b = \u2603.e();
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.b(this.a);
        \u2603.b(this.b);
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
}
