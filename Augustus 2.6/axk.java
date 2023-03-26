// 
// Decompiled by Procyon v0.5.36
// 

public class axk extends awv
{
    @Override
    public void b() {
        super.b();
        this.n.add(new avs(1, this.l / 2 - 100, this.m - 40, bnq.a("multiplayer.stopSleeping", new Object[0])));
    }
    
    @Override
    protected void a(final char \u2603, final int \u2603) {
        if (\u2603 == 1) {
            this.f();
        }
        else if (\u2603 == 28 || \u2603 == 156) {
            final String trim = this.a.b().trim();
            if (!trim.isEmpty()) {
                this.j.h.e(trim);
            }
            this.a.a("");
            this.j.q.d().d();
        }
        else {
            super.a(\u2603, \u2603);
        }
    }
    
    @Override
    protected void a(final avs \u2603) {
        if (\u2603.k == 1) {
            this.f();
        }
        else {
            super.a(\u2603);
        }
    }
    
    private void f() {
        final bcy a = this.j.h.a;
        a.a(new is(this.j.h, is.a.c));
    }
}
