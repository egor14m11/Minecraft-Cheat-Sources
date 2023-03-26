import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

// 
// Decompiled by Procyon v0.5.36
// 

public class ayi extends awd
{
    private final ayj u;
    private final ave v;
    private final awd.a[] w;
    private int x;
    
    public ayi(final ayj \u2603, final ave \u2603) {
        super(\u2603, \u2603.l, \u2603.m, 63, \u2603.m - 32, 20);
        this.x = 0;
        this.u = \u2603;
        this.v = \u2603;
        final avb[] a = ArrayUtils.clone(\u2603.t.aw);
        this.w = new awd.a[a.length + avb.c().size()];
        Arrays.sort(a);
        int n = 0;
        String anObject = null;
        for (final avb \u26032 : a) {
            final String e = \u26032.e();
            if (!e.equals(anObject)) {
                anObject = e;
                this.w[n++] = new a(e);
            }
            final int a2 = \u2603.k.a(bnq.a(\u26032.g(), new Object[0]));
            if (a2 > this.x) {
                this.x = a2;
            }
            this.w[n++] = new b(\u26032);
        }
    }
    
    @Override
    protected int b() {
        return this.w.length;
    }
    
    @Override
    public awd.a b(final int \u2603) {
        return this.w[\u2603];
    }
    
    @Override
    protected int d() {
        return super.d() + 15;
    }
    
    @Override
    public int c() {
        return super.c() + 32;
    }
    
    public class a implements awd.a
    {
        private final String b;
        private final int c;
        
        public a(final String \u2603) {
            this.b = bnq.a(\u2603, new Object[0]);
            this.c = ayi.this.v.k.a(this.b);
        }
        
        @Override
        public void a(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final boolean \u2603) {
            ayi.this.v.k.a(this.b, ayi.this.v.m.l / 2 - this.c / 2, \u2603 + \u2603 - ayi.this.v.k.a - 1, 16777215);
        }
        
        @Override
        public boolean a(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
            return false;
        }
        
        @Override
        public void b(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        }
        
        @Override
        public void a(final int \u2603, final int \u2603, final int \u2603) {
        }
    }
    
    public class b implements awd.a
    {
        private final avb b;
        private final String c;
        private final avs d;
        private final avs e;
        
        private b(final avb \u2603) {
            this.b = \u2603;
            this.c = bnq.a(\u2603.g(), new Object[0]);
            this.d = new avs(0, 0, 0, 75, 20, bnq.a(\u2603.g(), new Object[0]));
            this.e = new avs(0, 0, 0, 50, 20, bnq.a("controls.reset", new Object[0]));
        }
        
        @Override
        public void a(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final boolean \u2603) {
            final boolean b = ayi.this.u.f == this.b;
            ayi.this.v.k.a(this.c, \u2603 + 90 - ayi.this.x, \u2603 + \u2603 / 2 - ayi.this.v.k.a / 2, 16777215);
            this.e.h = \u2603 + 190;
            this.e.i = \u2603;
            this.e.l = (this.b.i() != this.b.h());
            this.e.a(ayi.this.v, \u2603, \u2603);
            this.d.h = \u2603 + 105;
            this.d.i = \u2603;
            this.d.j = avh.c(this.b.i());
            boolean b2 = false;
            if (this.b.i() != 0) {
                for (final avb avb : ayi.this.v.t.aw) {
                    if (avb != this.b && avb.i() == this.b.i()) {
                        b2 = true;
                        break;
                    }
                }
            }
            if (b) {
                this.d.j = a.p + "> " + a.o + this.d.j + a.p + " <";
            }
            else if (b2) {
                this.d.j = a.m + this.d.j;
            }
            this.d.a(ayi.this.v, \u2603, \u2603);
        }
        
        @Override
        public boolean a(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
            if (this.d.c(ayi.this.v, \u2603, \u2603)) {
                ayi.this.u.f = this.b;
                return true;
            }
            if (this.e.c(ayi.this.v, \u2603, \u2603)) {
                ayi.this.v.t.a(this.b, this.b.h());
                avb.b();
                return true;
            }
            return false;
        }
        
        @Override
        public void b(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
            this.d.a(\u2603, \u2603);
            this.e.a(\u2603, \u2603);
        }
        
        @Override
        public void a(final int \u2603, final int \u2603, final int \u2603) {
        }
    }
}
