import com.google.common.collect.Lists;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class oq implements og
{
    private String a;
    private int b;
    private zx[] c;
    private List<oh> d;
    private boolean e;
    
    public oq(final String \u2603, final boolean \u2603, final int \u2603) {
        this.a = \u2603;
        this.e = \u2603;
        this.b = \u2603;
        this.c = new zx[\u2603];
    }
    
    public oq(final eu \u2603, final int \u2603) {
        this(\u2603.c(), true, \u2603);
    }
    
    public void a(final oh \u2603) {
        if (this.d == null) {
            this.d = (List<oh>)Lists.newArrayList();
        }
        this.d.add(\u2603);
    }
    
    public void b(final oh \u2603) {
        this.d.remove(\u2603);
    }
    
    @Override
    public zx a(final int \u2603) {
        if (\u2603 < 0 || \u2603 >= this.c.length) {
            return null;
        }
        return this.c[\u2603];
    }
    
    @Override
    public zx a(final int \u2603, final int \u2603) {
        if (this.c[\u2603] == null) {
            return null;
        }
        if (this.c[\u2603].b <= \u2603) {
            final zx a = this.c[\u2603];
            this.c[\u2603] = null;
            this.p_();
            return a;
        }
        final zx a = this.c[\u2603].a(\u2603);
        if (this.c[\u2603].b == 0) {
            this.c[\u2603] = null;
        }
        this.p_();
        return a;
    }
    
    public zx a(final zx \u2603) {
        final zx k = \u2603.k();
        for (int i = 0; i < this.b; ++i) {
            final zx a = this.a(i);
            if (a == null) {
                this.a(i, k);
                this.p_();
                return null;
            }
            if (zx.c(a, k)) {
                final int min = Math.min(this.q_(), a.c());
                final int min2 = Math.min(k.b, min - a.b);
                if (min2 > 0) {
                    final zx zx = a;
                    zx.b += min2;
                    final zx zx2 = k;
                    zx2.b -= min2;
                    if (k.b <= 0) {
                        this.p_();
                        return null;
                    }
                }
            }
        }
        if (k.b != \u2603.b) {
            this.p_();
        }
        return k;
    }
    
    @Override
    public zx b(final int \u2603) {
        if (this.c[\u2603] != null) {
            final zx zx = this.c[\u2603];
            this.c[\u2603] = null;
            return zx;
        }
        return null;
    }
    
    @Override
    public void a(final int \u2603, final zx \u2603) {
        this.c[\u2603] = \u2603;
        if (\u2603 != null && \u2603.b > this.q_()) {
            \u2603.b = this.q_();
        }
        this.p_();
    }
    
    @Override
    public int o_() {
        return this.b;
    }
    
    @Override
    public String e_() {
        return this.a;
    }
    
    @Override
    public boolean l_() {
        return this.e;
    }
    
    public void a(final String \u2603) {
        this.e = true;
        this.a = \u2603;
    }
    
    @Override
    public eu f_() {
        if (this.l_()) {
            return new fa(this.e_());
        }
        return new fb(this.e_(), new Object[0]);
    }
    
    @Override
    public int q_() {
        return 64;
    }
    
    @Override
    public void p_() {
        if (this.d != null) {
            for (int i = 0; i < this.d.size(); ++i) {
                this.d.get(i).a(this);
            }
        }
    }
    
    @Override
    public boolean a(final wn \u2603) {
        return true;
    }
    
    @Override
    public void b(final wn \u2603) {
    }
    
    @Override
    public void c(final wn \u2603) {
    }
    
    @Override
    public boolean b(final int \u2603, final zx \u2603) {
        return true;
    }
    
    @Override
    public int a_(final int \u2603) {
        return 0;
    }
    
    @Override
    public void b(final int \u2603, final int \u2603) {
    }
    
    @Override
    public int g() {
        return 0;
    }
    
    @Override
    public void l() {
        for (int i = 0; i < this.c.length; ++i) {
            this.c[i] = null;
        }
    }
}
