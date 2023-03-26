import java.util.List;
import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class akr extends ahh
{
    public static final amm<aio.a> b;
    
    public akr() {
        super(arm.d);
        alz alz = this.M.b();
        if (!this.l()) {
            alz = alz.a(akr.a, ahh.a.b);
        }
        this.j(alz.a(akr.b, aio.a.a));
        this.a(yz.b);
    }
    
    @Override
    public arn g(final alz \u2603) {
        return \u2603.b(akr.b).c();
    }
    
    @Override
    public zw a(final alz \u2603, final Random \u2603, final int \u2603) {
        return zw.a(afi.bM);
    }
    
    @Override
    public zw c(final adm \u2603, final cj \u2603) {
        return zw.a(afi.bM);
    }
    
    @Override
    public String b(final int \u2603) {
        return super.a() + "." + aio.a.a(\u2603).d();
    }
    
    @Override
    public amo<?> n() {
        return akr.b;
    }
    
    @Override
    public Object a(final zx \u2603) {
        return aio.a.a(\u2603.i() & 0x7);
    }
    
    @Override
    public void a(final zw \u2603, final yz \u2603, final List<zx> \u2603) {
        if (\u2603 == zw.a(afi.bL)) {
            return;
        }
        for (final aio.a a : aio.a.values()) {
            \u2603.add(new zx(\u2603, 1, a.a()));
        }
    }
    
    @Override
    public alz a(final int \u2603) {
        alz alz = this.Q().a(akr.b, aio.a.a(\u2603 & 0x7));
        if (!this.l()) {
            alz = alz.a(akr.a, ((\u2603 & 0x8) == 0x0) ? ahh.a.b : ahh.a.a);
        }
        return alz;
    }
    
    @Override
    public int c(final alz \u2603) {
        int n = 0;
        n |= \u2603.b(akr.b).a();
        if (!this.l() && \u2603.b(akr.a) == ahh.a.a) {
            n |= 0x8;
        }
        return n;
    }
    
    @Override
    protected ama e() {
        if (this.l()) {
            return new ama(this, new amo[] { akr.b });
        }
        return new ama(this, new amo[] { akr.a, akr.b });
    }
    
    @Override
    public int a(final alz \u2603) {
        return \u2603.b(akr.b).a();
    }
    
    static {
        b = amm.a("variant", aio.a.class);
    }
}
