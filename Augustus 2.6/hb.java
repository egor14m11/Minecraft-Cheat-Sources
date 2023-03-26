import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class hb implements ff<fj>
{
    private int[] a;
    
    public hb() {
    }
    
    public hb(final int... \u2603) {
        this.a = \u2603;
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = new int[\u2603.e()];
        for (int i = 0; i < this.a.length; ++i) {
            this.a[i] = \u2603.e();
        }
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.b(this.a.length);
        for (int i = 0; i < this.a.length; ++i) {
            \u2603.b(this.a[i]);
        }
    }
    
    @Override
    public void a(final fj \u2603) {
        \u2603.a(this);
    }
    
    public int[] a() {
        return this.a;
    }
}
