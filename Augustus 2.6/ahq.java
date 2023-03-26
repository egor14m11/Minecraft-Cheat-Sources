// 
// Decompiled by Procyon v0.5.36
// 

public class ahq extends afc
{
    public static final amk a;
    
    protected ahq() {
        super(arm.d, arn.l);
        this.j(this.M.b().a((amo<Comparable>)ahq.a, false));
        this.a(yz.c);
    }
    
    @Override
    public boolean a(final adm \u2603, final cj \u2603, alz \u2603, final wn \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (\u2603.b((amo<Boolean>)ahq.a)) {
            this.e(\u2603, \u2603, \u2603);
            \u2603 = \u2603.a((amo<Comparable>)ahq.a, false);
            \u2603.a(\u2603, \u2603, 2);
            return true;
        }
        return false;
    }
    
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final zx \u2603) {
        if (\u2603.D) {
            return;
        }
        final akw s = \u2603.s(\u2603);
        if (!(s instanceof a)) {
            return;
        }
        ((a)s).a(new zx(\u2603.b(), 1, \u2603.i()));
        \u2603.a(\u2603, \u2603.a((amo<Comparable>)ahq.a, true), 2);
    }
    
    private void e(final adm \u2603, final cj \u2603, final alz \u2603) {
        if (\u2603.D) {
            return;
        }
        final akw s = \u2603.s(\u2603);
        if (!(s instanceof a)) {
            return;
        }
        final a a = (a)s;
        final zx a2 = a.a();
        if (a2 == null) {
            return;
        }
        \u2603.b(1005, \u2603, 0);
        \u2603.a(\u2603, (String)null);
        a.a((zx)null);
        final float n = 0.7f;
        final double n2 = \u2603.s.nextFloat() * n + (1.0f - n) * 0.5;
        final double n3 = \u2603.s.nextFloat() * n + (1.0f - n) * 0.2 + 0.6;
        final double n4 = \u2603.s.nextFloat() * n + (1.0f - n) * 0.5;
        final zx k = a2.k();
        final uz \u26032 = new uz(\u2603, \u2603.n() + n2, \u2603.o() + n3, \u2603.p() + n4, k);
        \u26032.p();
        \u2603.d(\u26032);
    }
    
    @Override
    public void b(final adm \u2603, final cj \u2603, final alz \u2603) {
        this.e(\u2603, \u2603, \u2603);
        super.b(\u2603, \u2603, \u2603);
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final float \u2603, final int \u2603) {
        if (\u2603.D) {
            return;
        }
        super.a(\u2603, \u2603, \u2603, \u2603, 0);
    }
    
    @Override
    public akw a(final adm \u2603, final int \u2603) {
        return new a();
    }
    
    @Override
    public boolean O() {
        return true;
    }
    
    @Override
    public int l(final adm \u2603, final cj \u2603) {
        final akw s = \u2603.s(\u2603);
        if (s instanceof a) {
            final zx a = ((a)s).a();
            if (a != null) {
                return zw.b(a.b()) + 1 - zw.b(zy.cq);
            }
        }
        return 0;
    }
    
    @Override
    public int b() {
        return 3;
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a((amo<Comparable>)ahq.a, \u2603 > 0);
    }
    
    @Override
    public int c(final alz \u2603) {
        return ((boolean)\u2603.b((amo<Boolean>)ahq.a)) ? 1 : 0;
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { ahq.a });
    }
    
    static {
        a = amk.a("has_record");
    }
    
    public static class a extends akw
    {
        private zx a;
        
        @Override
        public void a(final dn \u2603) {
            super.a(\u2603);
            if (\u2603.b("RecordItem", 10)) {
                this.a(zx.a(\u2603.m("RecordItem")));
            }
            else if (\u2603.f("Record") > 0) {
                this.a(new zx(zw.b(\u2603.f("Record")), 1, 0));
            }
        }
        
        @Override
        public void b(final dn \u2603) {
            super.b(\u2603);
            if (this.a() != null) {
                \u2603.a("RecordItem", this.a().b(new dn()));
            }
        }
        
        public zx a() {
            return this.a;
        }
        
        public void a(final zx \u2603) {
            this.a = \u2603;
            this.p_();
        }
    }
}
