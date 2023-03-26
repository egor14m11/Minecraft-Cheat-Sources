import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class afd extends afh
{
    protected afd(final arm \u2603) {
        this(\u2603, \u2603.r());
    }
    
    protected afd(final arm \u2603, final arn \u2603) {
        super(\u2603, \u2603);
        this.a(yz.d);
        this.a(true);
    }
    
    @Override
    public void a(final adq \u2603, final cj \u2603) {
        this.d(\u2603.p(\u2603));
    }
    
    protected void d(final alz \u2603) {
        final boolean b = this.e(\u2603) > 0;
        final float n = 0.0625f;
        if (b) {
            this.a(0.0625f, 0.0f, 0.0625f, 0.9375f, 0.03125f, 0.9375f);
        }
        else {
            this.a(0.0625f, 0.0f, 0.0625f, 0.9375f, 0.0625f, 0.9375f);
        }
    }
    
    @Override
    public int a(final adm \u2603) {
        return 20;
    }
    
    @Override
    public aug a(final adm \u2603, final cj \u2603, final alz \u2603) {
        return null;
    }
    
    @Override
    public boolean c() {
        return false;
    }
    
    @Override
    public boolean d() {
        return false;
    }
    
    @Override
    public boolean b(final adq \u2603, final cj \u2603) {
        return true;
    }
    
    @Override
    public boolean g() {
        return true;
    }
    
    @Override
    public boolean d(final adm \u2603, final cj \u2603) {
        return this.m(\u2603, \u2603.b());
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final afh \u2603) {
        if (!this.m(\u2603, \u2603.b())) {
            this.b(\u2603, \u2603, \u2603, 0);
            \u2603.g(\u2603);
        }
    }
    
    private boolean m(final adm \u2603, final cj \u2603) {
        return adm.a(\u2603, \u2603) || \u2603.p(\u2603).c() instanceof agt;
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
    }
    
    @Override
    public void b(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
        if (\u2603.D) {
            return;
        }
        final int e = this.e(\u2603);
        if (e > 0) {
            this.a(\u2603, \u2603, \u2603, e);
        }
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final pk \u2603) {
        if (\u2603.D) {
            return;
        }
        final int e = this.e(\u2603);
        if (e == 0) {
            this.a(\u2603, \u2603, \u2603, e);
        }
    }
    
    protected void a(final adm \u2603, final cj \u2603, alz \u2603, final int \u2603) {
        final int f = this.f(\u2603, \u2603);
        final boolean b = \u2603 > 0;
        final boolean b2 = f > 0;
        if (\u2603 != f) {
            \u2603 = this.a(\u2603, f);
            \u2603.a(\u2603, \u2603, 2);
            this.e(\u2603, \u2603);
            \u2603.b(\u2603, \u2603);
        }
        if (!b2 && b) {
            \u2603.a(\u2603.n() + 0.5, \u2603.o() + 0.1, \u2603.p() + 0.5, "random.click", 0.3f, 0.5f);
        }
        else if (b2 && !b) {
            \u2603.a(\u2603.n() + 0.5, \u2603.o() + 0.1, \u2603.p() + 0.5, "random.click", 0.3f, 0.6f);
        }
        if (b2) {
            \u2603.a(\u2603, this, this.a(\u2603));
        }
    }
    
    protected aug a(final cj \u2603) {
        final float n = 0.125f;
        return new aug(\u2603.n() + 0.125f, \u2603.o(), \u2603.p() + 0.125f, \u2603.n() + 1 - 0.125f, \u2603.o() + 0.25, \u2603.p() + 1 - 0.125f);
    }
    
    @Override
    public void b(final adm \u2603, final cj \u2603, final alz \u2603) {
        if (this.e(\u2603) > 0) {
            this.e(\u2603, \u2603);
        }
        super.b(\u2603, \u2603, \u2603);
    }
    
    protected void e(final adm \u2603, final cj \u2603) {
        \u2603.c(\u2603, this);
        \u2603.c(\u2603.b(), this);
    }
    
    @Override
    public int a(final adq \u2603, final cj \u2603, final alz \u2603, final cq \u2603) {
        return this.e(\u2603);
    }
    
    @Override
    public int b(final adq \u2603, final cj \u2603, final alz \u2603, final cq \u2603) {
        if (\u2603 == cq.b) {
            return this.e(\u2603);
        }
        return 0;
    }
    
    @Override
    public boolean i() {
        return true;
    }
    
    @Override
    public void j() {
        final float n = 0.5f;
        final float n2 = 0.125f;
        final float n3 = 0.5f;
        this.a(0.0f, 0.375f, 0.0f, 1.0f, 0.625f, 1.0f);
    }
    
    @Override
    public int k() {
        return 1;
    }
    
    protected abstract int f(final adm p0, final cj p1);
    
    protected abstract int e(final alz p0);
    
    protected abstract alz a(final alz p0, final int p1);
}
