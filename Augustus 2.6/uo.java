// 
// Decompiled by Procyon v0.5.36
// 

public class uo extends un
{
    private float c;
    
    public uo(final adm \u2603) {
        super(\u2603);
        this.c = 1.0f;
    }
    
    public uo(final adm \u2603, final cj \u2603, final cq \u2603) {
        super(\u2603, \u2603);
        this.c = 1.0f;
        this.a(\u2603);
    }
    
    @Override
    protected void h() {
        this.H().a(8, 5);
        this.H().a(9, (Byte)0);
    }
    
    @Override
    public float ao() {
        return 0.0f;
    }
    
    @Override
    public boolean a(final ow \u2603, final float \u2603) {
        if (this.b(\u2603)) {
            return false;
        }
        if (!\u2603.c() && this.o() != null) {
            if (!this.o.D) {
                this.a(\u2603.j(), false);
                this.a((zx)null);
            }
            return true;
        }
        return super.a(\u2603, \u2603);
    }
    
    @Override
    public int l() {
        return 12;
    }
    
    @Override
    public int m() {
        return 12;
    }
    
    @Override
    public boolean a(final double \u2603) {
        double n = 16.0;
        n *= 64.0 * this.j;
        return \u2603 < n * n;
    }
    
    @Override
    public void b(final pk \u2603) {
        this.a(\u2603, true);
    }
    
    public void a(final pk \u2603, final boolean \u2603) {
        if (!this.o.Q().b("doEntityDrops")) {
            return;
        }
        zx \u26032 = this.o();
        if (\u2603 instanceof wn) {
            final wn wn = (wn)\u2603;
            if (wn.bA.d) {
                this.b(\u26032);
                return;
            }
        }
        if (\u2603) {
            this.a(new zx(zy.bP), 0.0f);
        }
        if (\u26032 != null && this.V.nextFloat() < this.c) {
            \u26032 = \u26032.k();
            this.b(\u26032);
            this.a(\u26032, 0.0f);
        }
    }
    
    private void b(final zx \u2603) {
        if (\u2603 == null) {
            return;
        }
        if (\u2603.b() == zy.bd) {
            final atg a = ((aab)\u2603.b()).a(\u2603, this.o);
            a.h.remove("frame-" + this.F());
        }
        \u2603.a((uo)null);
    }
    
    public zx o() {
        return this.H().f(8);
    }
    
    public void a(final zx \u2603) {
        this.a(\u2603, true);
    }
    
    private void a(zx \u2603, final boolean \u2603) {
        if (\u2603 != null) {
            \u2603 = \u2603.k();
            \u2603.b = 1;
            \u2603.a(this);
        }
        this.H().b(8, \u2603);
        this.H().i(8);
        if (\u2603 && this.a != null) {
            this.o.e(this.a, afi.a);
        }
    }
    
    public int p() {
        return this.H().a(9);
    }
    
    public void a(final int \u2603) {
        this.a(\u2603, true);
    }
    
    private void a(final int \u2603, final boolean \u2603) {
        this.H().b(9, (byte)(\u2603 % 8));
        if (\u2603 && this.a != null) {
            this.o.e(this.a, afi.a);
        }
    }
    
    @Override
    public void b(final dn \u2603) {
        if (this.o() != null) {
            \u2603.a("Item", this.o().b(new dn()));
            \u2603.a("ItemRotation", (byte)this.p());
            \u2603.a("ItemDropChance", this.c);
        }
        super.b(\u2603);
    }
    
    @Override
    public void a(final dn \u2603) {
        final dn m = \u2603.m("Item");
        if (m != null && !m.c_()) {
            this.a(zx.a(m), false);
            this.a(\u2603.d("ItemRotation"), false);
            if (\u2603.b("ItemDropChance", 99)) {
                this.c = \u2603.h("ItemDropChance");
            }
            if (\u2603.c("Direction")) {
                this.a(this.p() * 2, false);
            }
        }
        super.a(\u2603);
    }
    
    @Override
    public boolean e(final wn \u2603) {
        if (this.o() == null) {
            final zx ba = \u2603.bA();
            if (ba != null && !this.o.D) {
                this.a(ba);
                if (!\u2603.bA.d) {
                    final zx zx = ba;
                    if (--zx.b <= 0) {
                        \u2603.bi.a(\u2603.bi.c, null);
                    }
                }
            }
        }
        else if (!this.o.D) {
            this.a(this.p() + 1);
        }
        return true;
    }
    
    public int q() {
        if (this.o() == null) {
            return 0;
        }
        return this.p() % 8 + 1;
    }
}
