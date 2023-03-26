// 
// Decompiled by Procyon v0.5.36
// 

public class ya implements og
{
    private final acy a;
    private zx[] b;
    private final wn c;
    private acz d;
    private int e;
    
    public ya(final wn \u2603, final acy \u2603) {
        this.b = new zx[3];
        this.c = \u2603;
        this.a = \u2603;
    }
    
    @Override
    public int o_() {
        return this.b.length;
    }
    
    @Override
    public zx a(final int \u2603) {
        return this.b[\u2603];
    }
    
    @Override
    public zx a(final int \u2603, final int \u2603) {
        if (this.b[\u2603] == null) {
            return null;
        }
        if (\u2603 == 2) {
            final zx a = this.b[\u2603];
            this.b[\u2603] = null;
            return a;
        }
        if (this.b[\u2603].b <= \u2603) {
            final zx a = this.b[\u2603];
            this.b[\u2603] = null;
            if (this.e(\u2603)) {
                this.h();
            }
            return a;
        }
        final zx a = this.b[\u2603].a(\u2603);
        if (this.b[\u2603].b == 0) {
            this.b[\u2603] = null;
        }
        if (this.e(\u2603)) {
            this.h();
        }
        return a;
    }
    
    private boolean e(final int \u2603) {
        return \u2603 == 0 || \u2603 == 1;
    }
    
    @Override
    public zx b(final int \u2603) {
        if (this.b[\u2603] != null) {
            final zx zx = this.b[\u2603];
            this.b[\u2603] = null;
            return zx;
        }
        return null;
    }
    
    @Override
    public void a(final int \u2603, final zx \u2603) {
        this.b[\u2603] = \u2603;
        if (\u2603 != null && \u2603.b > this.q_()) {
            \u2603.b = this.q_();
        }
        if (this.e(\u2603)) {
            this.h();
        }
    }
    
    @Override
    public String e_() {
        return "mob.villager";
    }
    
    @Override
    public boolean l_() {
        return false;
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
    public boolean a(final wn \u2603) {
        return this.a.v_() == \u2603;
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
    public void p_() {
        this.h();
    }
    
    public void h() {
        this.d = null;
        zx zx = this.b[0];
        zx zx2 = this.b[1];
        if (zx == null) {
            zx = zx2;
            zx2 = null;
        }
        if (zx == null) {
            this.a(2, null);
        }
        else {
            final ada b_ = this.a.b_(this.c);
            if (b_ != null) {
                acz acz = b_.a(zx, zx2, this.e);
                if (acz != null && !acz.h()) {
                    this.d = acz;
                    this.a(2, acz.d().k());
                }
                else if (zx2 != null) {
                    acz = b_.a(zx2, zx, this.e);
                    if (acz != null && !acz.h()) {
                        this.d = acz;
                        this.a(2, acz.d().k());
                    }
                    else {
                        this.a(2, null);
                    }
                }
                else {
                    this.a(2, null);
                }
            }
        }
        this.a.a_(this.a(2));
    }
    
    public acz i() {
        return this.d;
    }
    
    public void d(final int \u2603) {
        this.e = \u2603;
        this.h();
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
        for (int i = 0; i < this.b.length; ++i) {
            this.b[i] = null;
        }
    }
}
