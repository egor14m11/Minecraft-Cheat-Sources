import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class bjf extends biv<uz>
{
    private final bjh a;
    private Random e;
    
    public bjf(final biu \u2603, final bjh \u2603) {
        super(\u2603);
        this.e = new Random();
        this.a = \u2603;
        this.c = 0.15f;
        this.d = 0.75f;
    }
    
    private int a(final uz \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603, final boq \u2603) {
        final zx l = \u2603.l();
        final zw b = l.b();
        if (b == null) {
            return 0;
        }
        final boolean c = \u2603.c();
        final int a = this.a(l);
        final float n = 0.25f;
        final float n2 = ns.a((\u2603.o() + \u2603) / 10.0f + \u2603.a) * 0.1f + 0.1f;
        final float y = \u2603.f().b(bgr.b.f).d.y;
        bfl.b((float)\u2603, (float)\u2603 + n2 + 0.25f * y, (float)\u2603);
        if (c || this.b.g != null) {
            final float n3 = ((\u2603.o() + \u2603) / 20.0f + \u2603.a) * 57.295776f;
            bfl.b(n3, 0.0f, 1.0f, 0.0f);
        }
        if (!c) {
            final float n3 = -0.0f * (a - 1) * 0.5f;
            final float \u26032 = -0.0f * (a - 1) * 0.5f;
            final float \u26033 = -0.046875f * (a - 1) * 0.5f;
            bfl.b(n3, \u26032, \u26033);
        }
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        return a;
    }
    
    private int a(final zx \u2603) {
        int n = 1;
        if (\u2603.b > 48) {
            n = 5;
        }
        else if (\u2603.b > 32) {
            n = 4;
        }
        else if (\u2603.b > 16) {
            n = 3;
        }
        else if (\u2603.b > 1) {
            n = 2;
        }
        return n;
    }
    
    @Override
    public void a(final uz \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603, final float \u2603) {
        final zx l = \u2603.l();
        this.e.setSeed(187L);
        boolean b = false;
        if (this.c(\u2603)) {
            this.b.a.b(this.a(\u2603)).b(false, false);
            b = true;
        }
        bfl.B();
        bfl.a(516, 0.1f);
        bfl.l();
        bfl.a(770, 771, 1, 0);
        bfl.E();
        final boq a = this.a.a().a(l);
        for (int a2 = this.a(\u2603, \u2603, \u2603, \u2603, \u2603, a), i = 0; i < a2; ++i) {
            if (a.c()) {
                bfl.E();
                if (i > 0) {
                    final float x = (this.e.nextFloat() * 2.0f - 1.0f) * 0.15f;
                    final float y = (this.e.nextFloat() * 2.0f - 1.0f) * 0.15f;
                    final float z = (this.e.nextFloat() * 2.0f - 1.0f) * 0.15f;
                    bfl.b(x, y, z);
                }
                bfl.a(0.5f, 0.5f, 0.5f);
                a.f().a(bgr.b.f);
                this.a.a(l, a);
                bfl.F();
            }
            else {
                bfl.E();
                a.f().a(bgr.b.f);
                this.a.a(l, a);
                bfl.F();
                final float x = a.f().o.d.x;
                final float y = a.f().o.d.y;
                final float z = a.f().o.d.z;
                bfl.b(0.0f * x, 0.0f * y, 0.046875f * z);
            }
        }
        bfl.F();
        bfl.C();
        bfl.k();
        this.c(\u2603);
        if (b) {
            this.b.a.b(this.a(\u2603)).a();
        }
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    protected jy a(final uz \u2603) {
        return bmh.g;
    }
}
