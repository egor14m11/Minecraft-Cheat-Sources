import com.google.common.collect.Lists;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class awf extends awd
{
    private final List<a> u;
    
    public awf(final ave \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final avh.a... \u2603) {
        super(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        this.u = (List<a>)Lists.newArrayList();
        this.k = false;
        for (int i = 0; i < \u2603.length; i += 2) {
            final avh.a \u26032 = \u2603[i];
            final avh.a \u26033 = (i < \u2603.length - 1) ? \u2603[i + 1] : null;
            final avs a = this.a(\u2603, \u2603 / 2 - 155, 0, \u26032);
            final avs a2 = this.a(\u2603, \u2603 / 2 - 155 + 160, 0, \u26033);
            this.u.add(new a(a, a2));
        }
    }
    
    private avs a(final ave \u2603, final int \u2603, final int \u2603, final avh.a \u2603) {
        if (\u2603 == null) {
            return null;
        }
        final int c = \u2603.c();
        return \u2603.a() ? new awj(c, \u2603, \u2603, \u2603) : new awe(c, \u2603, \u2603, \u2603, \u2603.t.c(\u2603));
    }
    
    public a c(final int \u2603) {
        return this.u.get(\u2603);
    }
    
    @Override
    protected int b() {
        return this.u.size();
    }
    
    @Override
    public int c() {
        return 400;
    }
    
    @Override
    protected int d() {
        return super.d() + 32;
    }
    
    public static class a implements awd.a
    {
        private final ave a;
        private final avs b;
        private final avs c;
        
        public a(final avs \u2603, final avs \u2603) {
            this.a = ave.A();
            this.b = \u2603;
            this.c = \u2603;
        }
        
        @Override
        public void a(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final boolean \u2603) {
            if (this.b != null) {
                this.b.i = \u2603;
                this.b.a(this.a, \u2603, \u2603);
            }
            if (this.c != null) {
                this.c.i = \u2603;
                this.c.a(this.a, \u2603, \u2603);
            }
        }
        
        @Override
        public boolean a(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
            if (this.b.c(this.a, \u2603, \u2603)) {
                if (this.b instanceof awe) {
                    this.a.t.a(((awe)this.b).c(), 1);
                    this.b.j = this.a.t.c(avh.a.a(this.b.k));
                }
                return true;
            }
            if (this.c != null && this.c.c(this.a, \u2603, \u2603)) {
                if (this.c instanceof awe) {
                    this.a.t.a(((awe)this.c).c(), 1);
                    this.c.j = this.a.t.c(avh.a.a(this.c.k));
                }
                return true;
            }
            return false;
        }
        
        @Override
        public void b(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
            if (this.b != null) {
                this.b.a(\u2603, \u2603);
            }
            if (this.c != null) {
                this.c.a(\u2603, \u2603);
            }
        }
        
        @Override
        public void a(final int \u2603, final int \u2603, final int \u2603) {
        }
    }
}
