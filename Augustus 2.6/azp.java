import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class azp implements awd.a
{
    private static final jy c;
    private static final eu d;
    private static final eu e;
    private static final eu f;
    protected final ave a;
    protected final azo b;
    
    public azp(final azo \u2603) {
        this.b = \u2603;
        this.a = ave.A();
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final boolean \u2603) {
        final int a = this.a();
        if (a != 1) {
            bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
            avp.a(\u2603 - 1, \u2603 - 1, \u2603 + \u2603 - 9, \u2603 + \u2603 + 1, -8978432);
        }
        this.d();
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        avp.a(\u2603, \u2603, 0.0f, 0.0f, 32, 32, 32.0f, 32.0f);
        String \u26032 = this.c();
        String \u26033 = this.b();
        if ((this.a.t.A || \u2603) && this.e()) {
            this.a.P().a(azp.c);
            avp.a(\u2603, \u2603, \u2603 + 32, \u2603 + 32, -1601138544);
            bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
            final int a2 = \u2603 - \u2603;
            final int n = \u2603 - \u2603;
            if (a < 1) {
                \u26032 = azp.d.d();
                \u26033 = azp.e.d();
            }
            else if (a > 1) {
                \u26032 = azp.d.d();
                \u26033 = azp.f.d();
            }
            if (this.f()) {
                if (a2 < 32) {
                    avp.a(\u2603, \u2603, 0.0f, 32.0f, 32, 32, 256.0f, 256.0f);
                }
                else {
                    avp.a(\u2603, \u2603, 0.0f, 0.0f, 32, 32, 256.0f, 256.0f);
                }
            }
            else {
                if (this.g()) {
                    if (a2 < 16) {
                        avp.a(\u2603, \u2603, 32.0f, 32.0f, 32, 32, 256.0f, 256.0f);
                    }
                    else {
                        avp.a(\u2603, \u2603, 32.0f, 0.0f, 32, 32, 256.0f, 256.0f);
                    }
                }
                if (this.h()) {
                    if (a2 < 32 && a2 > 16 && n < 16) {
                        avp.a(\u2603, \u2603, 96.0f, 32.0f, 32, 32, 256.0f, 256.0f);
                    }
                    else {
                        avp.a(\u2603, \u2603, 96.0f, 0.0f, 32, 32, 256.0f, 256.0f);
                    }
                }
                if (this.i()) {
                    if (a2 < 32 && a2 > 16 && n > 16) {
                        avp.a(\u2603, \u2603, 64.0f, 32.0f, 32, 32, 256.0f, 256.0f);
                    }
                    else {
                        avp.a(\u2603, \u2603, 64.0f, 0.0f, 32, 32, 256.0f, 256.0f);
                    }
                }
            }
        }
        final int a2 = this.a.k.a(\u26032);
        if (a2 > 157) {
            \u26032 = this.a.k.a(\u26032, 157 - this.a.k.a("...")) + "...";
        }
        this.a.k.a(\u26032, (float)(\u2603 + 32 + 2), (float)(\u2603 + 1), 16777215);
        final List<String> c = this.a.k.c(\u26033, 157);
        for (int n2 = 0; n2 < 2 && n2 < c.size(); ++n2) {
            this.a.k.a(c.get(n2), (float)(\u2603 + 32 + 2), (float)(\u2603 + 12 + 10 * n2), 8421504);
        }
    }
    
    protected abstract int a();
    
    protected abstract String b();
    
    protected abstract String c();
    
    protected abstract void d();
    
    protected boolean e() {
        return true;
    }
    
    protected boolean f() {
        return !this.b.a(this);
    }
    
    protected boolean g() {
        return this.b.a(this);
    }
    
    protected boolean h() {
        final List<azp> b = this.b.b(this);
        final int index = b.indexOf(this);
        return index > 0 && b.get(index - 1).e();
    }
    
    protected boolean i() {
        final List<azp> b = this.b.b(this);
        final int index = b.indexOf(this);
        return index >= 0 && index < b.size() - 1 && b.get(index + 1).e();
    }
    
    @Override
    public boolean a(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        if (this.e() && \u2603 <= 32) {
            if (this.f()) {
                this.b.g();
                final int a = this.a();
                if (a != 1) {
                    final String a2 = bnq.a("resourcePack.incompatible.confirm.title", new Object[0]);
                    final String a3 = bnq.a("resourcePack.incompatible.confirm." + ((a > 1) ? "new" : "old"), new Object[0]);
                    this.a.a(new awy(new awx() {
                        @Override
                        public void a(final boolean \u2603, final int \u2603) {
                            final List<azp> b = azp.this.b.b(azp.this);
                            azp.this.a.a(azp.this.b);
                            if (\u2603) {
                                b.remove(azp.this);
                                azp.this.b.f().add(0, azp.this);
                            }
                        }
                    }, a2, a3, 0));
                }
                else {
                    this.b.b(this).remove(this);
                    this.b.f().add(0, this);
                }
                return true;
            }
            if (\u2603 < 16 && this.g()) {
                this.b.b(this).remove(this);
                this.b.a().add(0, this);
                this.b.g();
                return true;
            }
            if (\u2603 > 16 && \u2603 < 16 && this.h()) {
                final List<azp> list = this.b.b(this);
                final int n = list.indexOf(this);
                list.remove(this);
                list.add(n - 1, this);
                this.b.g();
                return true;
            }
            if (\u2603 > 16 && \u2603 > 16 && this.i()) {
                final List<azp> list = this.b.b(this);
                final int n = list.indexOf(this);
                list.remove(this);
                list.add(n + 1, this);
                this.b.g();
                return true;
            }
        }
        return false;
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final int \u2603) {
    }
    
    @Override
    public void b(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
    }
    
    static {
        c = new jy("textures/gui/resource_packs.png");
        d = new fb("resourcePack.incompatible", new Object[0]);
        e = new fb("resourcePack.incompatible.old", new Object[0]);
        f = new fb("resourcePack.incompatible.new", new Object[0]);
    }
}
