import com.google.common.collect.Lists;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class avy extends avp
{
    protected int a;
    protected int f;
    public int g;
    public int h;
    private List<String> k;
    public int i;
    private boolean l;
    public boolean j;
    private boolean m;
    private int n;
    private int o;
    private int p;
    private int q;
    private avn r;
    private int s;
    
    public avy(final avn \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        this.a = 200;
        this.f = 20;
        this.j = true;
        this.r = \u2603;
        this.i = \u2603;
        this.g = \u2603;
        this.h = \u2603;
        this.a = \u2603;
        this.f = \u2603;
        this.k = (List<String>)Lists.newArrayList();
        this.l = false;
        this.m = false;
        this.n = \u2603;
        this.o = -1;
        this.p = -1;
        this.q = -1;
        this.s = 0;
    }
    
    public void a(final String \u2603) {
        this.k.add(bnq.a(\u2603, new Object[0]));
    }
    
    public avy a() {
        this.l = true;
        return this;
    }
    
    public void a(final ave \u2603, final int \u2603, final int \u2603) {
        if (!this.j) {
            return;
        }
        bfl.l();
        bfl.a(770, 771, 1, 0);
        this.b(\u2603, \u2603, \u2603);
        final int n = this.h + this.f / 2 + this.s / 2;
        final int n2 = n - this.k.size() * 10 / 2;
        for (int i = 0; i < this.k.size(); ++i) {
            if (this.l) {
                this.a(this.r, this.k.get(i), this.g + this.a / 2, n2 + i * 10, this.n);
            }
            else {
                this.c(this.r, this.k.get(i), this.g, n2 + i * 10, this.n);
            }
        }
    }
    
    protected void b(final ave \u2603, final int \u2603, final int \u2603) {
        if (this.m) {
            final int n = this.a + this.s * 2;
            final int n2 = this.f + this.s * 2;
            final int n3 = this.g - this.s;
            final int n4 = this.h - this.s;
            avp.a(n3, n4, n3 + n, n4 + n2, this.o);
            this.a(n3, n3 + n, n4, this.p);
            this.a(n3, n3 + n, n4 + n2, this.q);
            this.b(n3, n4, n4 + n2, this.p);
            this.b(n3 + n, n4, n4 + n2, this.q);
        }
    }
}
