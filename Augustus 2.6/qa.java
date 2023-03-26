import java.util.UUID;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class qa extends tm implements px
{
    protected se bm;
    
    public qa(final adm \u2603) {
        super(\u2603);
        this.bm = new se(this);
        this.cm();
    }
    
    @Override
    protected void h() {
        super.h();
        this.ac.a(16, (Byte)0);
        this.ac.a(17, "");
    }
    
    @Override
    public void b(final dn \u2603) {
        super.b(\u2603);
        if (this.b() == null) {
            \u2603.a("OwnerUUID", "");
        }
        else {
            \u2603.a("OwnerUUID", this.b());
        }
        \u2603.a("Sitting", this.cn());
    }
    
    @Override
    public void a(final dn \u2603) {
        super.a(\u2603);
        String \u26032 = "";
        if (\u2603.b("OwnerUUID", 8)) {
            \u26032 = \u2603.j("OwnerUUID");
        }
        else {
            final String j = \u2603.j("Owner");
            \u26032 = lw.a(j);
        }
        if (\u26032.length() > 0) {
            this.b(\u26032);
            this.m(true);
        }
        this.bm.a(\u2603.n("Sitting"));
        this.n(\u2603.n("Sitting"));
    }
    
    protected void l(final boolean \u2603) {
        cy \u26032 = cy.I;
        if (!\u2603) {
            \u26032 = cy.l;
        }
        for (int i = 0; i < 7; ++i) {
            final double \u26033 = this.V.nextGaussian() * 0.02;
            final double \u26034 = this.V.nextGaussian() * 0.02;
            final double \u26035 = this.V.nextGaussian() * 0.02;
            this.o.a(\u26032, this.s + this.V.nextFloat() * this.J * 2.0f - this.J, this.t + 0.5 + this.V.nextFloat() * this.K, this.u + this.V.nextFloat() * this.J * 2.0f - this.J, \u26033, \u26034, \u26035, new int[0]);
        }
    }
    
    @Override
    public void a(final byte \u2603) {
        if (\u2603 == 7) {
            this.l(true);
        }
        else if (\u2603 == 6) {
            this.l(false);
        }
        else {
            super.a(\u2603);
        }
    }
    
    public boolean cl() {
        return (this.ac.a(16) & 0x4) != 0x0;
    }
    
    public void m(final boolean \u2603) {
        final byte a = this.ac.a(16);
        if (\u2603) {
            this.ac.b(16, (byte)(a | 0x4));
        }
        else {
            this.ac.b(16, (byte)(a & 0xFFFFFFFB));
        }
        this.cm();
    }
    
    protected void cm() {
    }
    
    public boolean cn() {
        return (this.ac.a(16) & 0x1) != 0x0;
    }
    
    public void n(final boolean \u2603) {
        final byte a = this.ac.a(16);
        if (\u2603) {
            this.ac.b(16, (byte)(a | 0x1));
        }
        else {
            this.ac.b(16, (byte)(a & 0xFFFFFFFE));
        }
    }
    
    @Override
    public String b() {
        return this.ac.e(17);
    }
    
    public void b(final String \u2603) {
        this.ac.b(17, \u2603);
    }
    
    public pr co() {
        try {
            final UUID fromString = UUID.fromString(this.b());
            if (fromString == null) {
                return null;
            }
            return this.o.b(fromString);
        }
        catch (IllegalArgumentException ex) {
            return null;
        }
    }
    
    public boolean e(final pr \u2603) {
        return \u2603 == this.co();
    }
    
    public se cp() {
        return this.bm;
    }
    
    public boolean a(final pr \u2603, final pr \u2603) {
        return true;
    }
    
    @Override
    public auq bO() {
        if (this.cl()) {
            final pr co = this.co();
            if (co != null) {
                return co.bO();
            }
        }
        return super.bO();
    }
    
    @Override
    public boolean c(final pr \u2603) {
        if (this.cl()) {
            final pr co = this.co();
            if (\u2603 == co) {
                return true;
            }
            if (co != null) {
                return co.c(\u2603);
            }
        }
        return super.c(\u2603);
    }
    
    @Override
    public void a(final ow \u2603) {
        if (!this.o.D && this.o.Q().b("showDeathMessages") && this.l_() && this.co() instanceof lf) {
            ((lf)this.co()).a(this.bs().b());
        }
        super.a(\u2603);
    }
}
