import java.util.UUID;

// 
// Decompiled by Procyon v0.5.36
// 

public class vw extends we
{
    private static final UUID b;
    private static final qd c;
    private int bm;
    private int bn;
    private UUID bo;
    
    public vw(final adm \u2603) {
        super(\u2603);
        this.ab = true;
    }
    
    @Override
    public void b(final pr \u2603) {
        super.b(\u2603);
        if (\u2603 != null) {
            this.bo = \u2603.aK();
        }
    }
    
    @Override
    protected void n() {
        this.bi.a(1, new b(this));
        this.bi.a(2, new a(this));
    }
    
    @Override
    protected void aX() {
        super.aX();
        this.a(vw.a).a(0.0);
        this.a(vy.d).a(0.23000000417232513);
        this.a(vy.e).a(5.0);
    }
    
    @Override
    public void t_() {
        super.t_();
    }
    
    @Override
    protected void E() {
        final qc a = this.a(vy.d);
        if (this.cm()) {
            if (!this.j_() && !a.a(vw.c)) {
                a.b(vw.c);
            }
            --this.bm;
        }
        else if (a.a(vw.c)) {
            a.c(vw.c);
        }
        if (this.bn > 0 && --this.bn == 0) {
            this.a("mob.zombiepig.zpigangry", this.bB() * 2.0f, ((this.V.nextFloat() - this.V.nextFloat()) * 0.2f + 1.0f) * 1.8f);
        }
        if (this.bm > 0 && this.bo != null && this.bd() == null) {
            final wn b = this.o.b(this.bo);
            this.b((pr)b);
            this.aN = b;
            this.aO = this.be();
        }
        super.E();
    }
    
    @Override
    public boolean bR() {
        return this.o.aa() != oj.a;
    }
    
    @Override
    public boolean bS() {
        return this.o.a(this.aR(), this) && this.o.a(this, this.aR()).isEmpty() && !this.o.d(this.aR());
    }
    
    @Override
    public void b(final dn \u2603) {
        super.b(\u2603);
        \u2603.a("Anger", (short)this.bm);
        if (this.bo != null) {
            \u2603.a("HurtBy", this.bo.toString());
        }
        else {
            \u2603.a("HurtBy", "");
        }
    }
    
    @Override
    public void a(final dn \u2603) {
        super.a(\u2603);
        this.bm = \u2603.e("Anger");
        final String j = \u2603.j("HurtBy");
        if (j.length() > 0) {
            this.bo = UUID.fromString(j);
            final wn b = this.o.b(this.bo);
            this.b((pr)b);
            if (b != null) {
                this.aN = b;
                this.aO = this.be();
            }
        }
    }
    
    @Override
    public boolean a(final ow \u2603, final float \u2603) {
        if (this.b(\u2603)) {
            return false;
        }
        final pk j = \u2603.j();
        if (j instanceof wn) {
            this.b(j);
        }
        return super.a(\u2603, \u2603);
    }
    
    private void b(final pk \u2603) {
        this.bm = 400 + this.V.nextInt(400);
        this.bn = this.V.nextInt(40);
        if (\u2603 instanceof pr) {
            this.b((pr)\u2603);
        }
    }
    
    public boolean cm() {
        return this.bm > 0;
    }
    
    @Override
    protected String z() {
        return "mob.zombiepig.zpig";
    }
    
    @Override
    protected String bo() {
        return "mob.zombiepig.zpighurt";
    }
    
    @Override
    protected String bp() {
        return "mob.zombiepig.zpigdeath";
    }
    
    @Override
    protected void b(final boolean \u2603, final int \u2603) {
        for (int n = this.V.nextInt(2 + \u2603), i = 0; i < n; ++i) {
            this.a(zy.bt, 1);
        }
        for (int n = this.V.nextInt(2 + \u2603), i = 0; i < n; ++i) {
            this.a(zy.bx, 1);
        }
    }
    
    @Override
    public boolean a(final wn \u2603) {
        return false;
    }
    
    @Override
    protected void bq() {
        this.a(zy.k, 1);
    }
    
    @Override
    protected void a(final ok \u2603) {
        this.c(0, new zx(zy.B));
    }
    
    @Override
    public pu a(final ok \u2603, final pu \u2603) {
        super.a(\u2603, \u2603);
        this.m(false);
        return \u2603;
    }
    
    static {
        b = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
        c = new qd(vw.b, "Attacking speed boost", 0.05, 0).a(false);
    }
    
    static class b extends sm
    {
        public b(final vw \u2603) {
            super(\u2603, true, new Class[0]);
        }
        
        @Override
        protected void a(final py \u2603, final pr \u2603) {
            super.a(\u2603, \u2603);
            if (\u2603 instanceof vw) {
                ((vw)\u2603).b(\u2603);
            }
        }
    }
    
    static class a extends sp<wn>
    {
        public a(final vw \u2603) {
            super(\u2603, wn.class, true);
        }
        
        @Override
        public boolean a() {
            return ((vw)this.e).cm() && super.a();
        }
    }
}
