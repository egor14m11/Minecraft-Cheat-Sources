import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class any
{
    protected int a;
    protected Random b;
    protected adm c;
    
    public any() {
        this.a = 8;
        this.b = new Random();
    }
    
    public void a(final amv \u2603, final adm \u2603, final int \u2603, final int \u2603, final ans \u2603) {
        final int a = this.a;
        this.c = \u2603;
        this.b.setSeed(\u2603.J());
        final long nextLong = this.b.nextLong();
        final long nextLong2 = this.b.nextLong();
        for (int i = \u2603 - a; i <= \u2603 + a; ++i) {
            for (int j = \u2603 - a; j <= \u2603 + a; ++j) {
                final long n = i * nextLong;
                final long n2 = j * nextLong2;
                this.b.setSeed(n ^ n2 ^ \u2603.J());
                this.a(\u2603, i, j, \u2603, \u2603, \u2603);
            }
        }
    }
    
    protected void a(final adm \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final ans \u2603) {
    }
}
