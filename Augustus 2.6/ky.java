// 
// Decompiled by Procyon v0.5.36
// 

public class ky extends lg
{
    private boolean c;
    private boolean d;
    private int e;
    private int f;
    
    public ky(final adm \u2603) {
        super(\u2603);
    }
    
    @Override
    public void a() {
        super.a();
        ++this.f;
        final long k = this.a.K();
        final long lng = k / 24000L + 1L;
        if (!this.c && this.f > 20) {
            this.c = true;
            this.b.a.a(new gm(5, 0.0f));
        }
        this.d = (k > 120500L);
        if (this.d) {
            ++this.e;
        }
        if (k % 24000L == 500L) {
            if (lng <= 6L) {
                this.b.a(new fb("demo.day." + lng, new Object[0]));
            }
        }
        else if (lng == 1L) {
            if (k == 100L) {
                this.b.a.a(new gm(5, 101.0f));
            }
            else if (k == 175L) {
                this.b.a.a(new gm(5, 102.0f));
            }
            else if (k == 250L) {
                this.b.a.a(new gm(5, 103.0f));
            }
        }
        else if (lng == 5L && k % 24000L == 22000L) {
            this.b.a(new fb("demo.day.warning", new Object[0]));
        }
    }
    
    private void f() {
        if (this.e > 100) {
            this.b.a(new fb("demo.reminder", new Object[0]));
            this.e = 0;
        }
    }
    
    @Override
    public void a(final cj \u2603, final cq \u2603) {
        if (this.d) {
            this.f();
            return;
        }
        super.a(\u2603, \u2603);
    }
    
    @Override
    public void a(final cj \u2603) {
        if (this.d) {
            return;
        }
        super.a(\u2603);
    }
    
    @Override
    public boolean b(final cj \u2603) {
        return !this.d && super.b(\u2603);
    }
    
    @Override
    public boolean a(final wn \u2603, final adm \u2603, final zx \u2603) {
        if (this.d) {
            this.f();
            return false;
        }
        return super.a(\u2603, \u2603, \u2603);
    }
    
    @Override
    public boolean a(final wn \u2603, final adm \u2603, final zx \u2603, final cj \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (this.d) {
            this.f();
            return false;
        }
        return super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
}
