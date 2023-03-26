import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class hm implements ff<fj>
{
    private int a;
    private int b;
    private int c;
    private int d;
    
    public hm() {
    }
    
    public hm(final pk \u2603) {
        this(\u2603.F(), \u2603.v, \u2603.w, \u2603.x);
    }
    
    public hm(final int \u2603, double \u2603, double \u2603, double \u2603) {
        this.a = \u2603;
        final double n = 3.9;
        if (\u2603 < -n) {
            \u2603 = -n;
        }
        if (\u2603 < -n) {
            \u2603 = -n;
        }
        if (\u2603 < -n) {
            \u2603 = -n;
        }
        if (\u2603 > n) {
            \u2603 = n;
        }
        if (\u2603 > n) {
            \u2603 = n;
        }
        if (\u2603 > n) {
            \u2603 = n;
        }
        this.b = (int)(\u2603 * 8000.0);
        this.c = (int)(\u2603 * 8000.0);
        this.d = (int)(\u2603 * 8000.0);
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.e();
        this.b = \u2603.readShort();
        this.c = \u2603.readShort();
        this.d = \u2603.readShort();
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.b(this.a);
        \u2603.writeShort(this.b);
        \u2603.writeShort(this.c);
        \u2603.writeShort(this.d);
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
}
