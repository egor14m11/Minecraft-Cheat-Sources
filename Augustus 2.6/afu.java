import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class afu extends age implements afj
{
    public static final amn a;
    
    public afu() {
        super(arm.k);
        this.j(this.M.b().a((amo<Comparable>)afu.O, cq.c).a((amo<Comparable>)afu.a, 0));
        this.a(true);
    }
    
    @Override
    public void b(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
        if (!this.e(\u2603, \u2603, \u2603)) {
            this.f(\u2603, \u2603, \u2603);
        }
        else if (\u2603.s.nextInt(5) == 0) {
            final int intValue = \u2603.b((amo<Integer>)afu.a);
            if (intValue < 2) {
                \u2603.a(\u2603, \u2603.a((amo<Comparable>)afu.a, intValue + 1), 2);
            }
        }
    }
    
    public boolean e(final adm \u2603, cj \u2603, final alz \u2603) {
        \u2603 = \u2603.a(\u2603.b((amo<cq>)afu.O));
        final alz p = \u2603.p(\u2603);
        return p.c() == afi.r && p.b(aio.a) == aio.a.d;
    }
    
    @Override
    public boolean d() {
        return false;
    }
    
    @Override
    public boolean c() {
        return false;
    }
    
    @Override
    public aug a(final adm \u2603, final cj \u2603, final alz \u2603) {
        this.a((adq)\u2603, \u2603);
        return super.a(\u2603, \u2603, \u2603);
    }
    
    @Override
    public aug b(final adm \u2603, final cj \u2603) {
        this.a((adq)\u2603, \u2603);
        return super.b(\u2603, \u2603);
    }
    
    @Override
    public void a(final adq \u2603, final cj \u2603) {
        final alz p = \u2603.p(\u2603);
        final cq cq = p.b((amo<cq>)afu.O);
        final int intValue = p.b((amo<Integer>)afu.a);
        final int n = 4 + intValue * 2;
        final int n2 = 5 + intValue * 2;
        final float n3 = n / 2.0f;
        switch (afu$1.a[cq.ordinal()]) {
            case 1: {
                this.a((8.0f - n3) / 16.0f, (12.0f - n2) / 16.0f, (15.0f - n) / 16.0f, (8.0f + n3) / 16.0f, 0.75f, 0.9375f);
                break;
            }
            case 2: {
                this.a((8.0f - n3) / 16.0f, (12.0f - n2) / 16.0f, 0.0625f, (8.0f + n3) / 16.0f, 0.75f, (1.0f + n) / 16.0f);
                break;
            }
            case 3: {
                this.a(0.0625f, (12.0f - n2) / 16.0f, (8.0f - n3) / 16.0f, (1.0f + n) / 16.0f, 0.75f, (8.0f + n3) / 16.0f);
                break;
            }
            case 4: {
                this.a((15.0f - n) / 16.0f, (12.0f - n2) / 16.0f, (8.0f - n3) / 16.0f, 0.9375f, 0.75f, (8.0f + n3) / 16.0f);
                break;
            }
        }
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final pr \u2603, final zx \u2603) {
        final cq a = cq.a(\u2603.y);
        \u2603.a(\u2603, \u2603.a((amo<Comparable>)afu.O, a), 2);
    }
    
    @Override
    public alz a(final adm \u2603, final cj \u2603, cq \u2603, final float \u2603, final float \u2603, final float \u2603, final int \u2603, final pr \u2603) {
        if (!\u2603.k().c()) {
            \u2603 = cq.c;
        }
        return this.Q().a((amo<Comparable>)afu.O, \u2603.d()).a((amo<Comparable>)afu.a, 0);
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final afh \u2603) {
        if (!this.e(\u2603, \u2603, \u2603)) {
            this.f(\u2603, \u2603, \u2603);
        }
    }
    
    private void f(final adm \u2603, final cj \u2603, final alz \u2603) {
        \u2603.a(\u2603, afi.a.Q(), 3);
        this.b(\u2603, \u2603, \u2603, 0);
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final float \u2603, final int \u2603) {
        final int intValue = \u2603.b((amo<Integer>)afu.a);
        int n = 1;
        if (intValue >= 2) {
            n = 3;
        }
        for (int i = 0; i < n; ++i) {
            afh.a(\u2603, \u2603, new zx(zy.aW, 1, zd.m.b()));
        }
    }
    
    @Override
    public zw c(final adm \u2603, final cj \u2603) {
        return zy.aW;
    }
    
    @Override
    public int j(final adm \u2603, final cj \u2603) {
        return zd.m.b();
    }
    
    @Override
    public boolean a(final adm \u2603, final cj \u2603, final alz \u2603, final boolean \u2603) {
        return \u2603.b((amo<Integer>)afu.a) < 2;
    }
    
    @Override
    public boolean a(final adm \u2603, final Random \u2603, final cj \u2603, final alz \u2603) {
        return true;
    }
    
    @Override
    public void b(final adm \u2603, final Random \u2603, final cj \u2603, final alz \u2603) {
        \u2603.a(\u2603, \u2603.a((amo<Comparable>)afu.a, \u2603.b((amo<Integer>)afu.a) + 1), 2);
    }
    
    @Override
    public adf m() {
        return adf.c;
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a((amo<Comparable>)afu.O, cq.b(\u2603)).a((amo<Comparable>)afu.a, (\u2603 & 0xF) >> 2);
    }
    
    @Override
    public int c(final alz \u2603) {
        int n = 0;
        n |= \u2603.b((amo<cq>)afu.O).b();
        n |= \u2603.b((amo<Integer>)afu.a) << 2;
        return n;
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { afu.O, afu.a });
    }
    
    static {
        a = amn.a("age", 0, 2);
    }
}
