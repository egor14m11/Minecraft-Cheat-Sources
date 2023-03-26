import org.lwjgl.input.Keyboard;

// 
// Decompiled by Procyon v0.5.36
// 

public class aze extends axu
{
    private aln a;
    private int f;
    private int g;
    private avs h;
    
    public aze(final aln \u2603) {
        this.a = \u2603;
    }
    
    @Override
    public void b() {
        this.n.clear();
        Keyboard.enableRepeatEvents(true);
        this.n.add(this.h = new avs(0, this.l / 2 - 100, this.m / 4 + 120, bnq.a("gui.done", new Object[0])));
        this.a.a(false);
    }
    
    @Override
    public void m() {
        Keyboard.enableRepeatEvents(false);
        final bcy u = this.j.u();
        if (u != null) {
            u.a(new ix(this.a.v(), this.a.a));
        }
        this.a.a(true);
    }
    
    @Override
    public void e() {
        ++this.f;
    }
    
    @Override
    protected void a(final avs \u2603) {
        if (!\u2603.l) {
            return;
        }
        if (\u2603.k == 0) {
            this.a.p_();
            this.j.a((axu)null);
        }
    }
    
    @Override
    protected void a(final char \u2603, final int \u2603) {
        if (\u2603 == 200) {
            this.g = (this.g - 1 & 0x3);
        }
        if (\u2603 == 208 || \u2603 == 28 || \u2603 == 156) {
            this.g = (this.g + 1 & 0x3);
        }
        String \u26032 = this.a.a[this.g].c();
        if (\u2603 == 14 && \u26032.length() > 0) {
            \u26032 = \u26032.substring(0, \u26032.length() - 1);
        }
        if (f.a(\u2603) && this.q.a(\u26032 + \u2603) <= 90) {
            \u26032 += \u2603;
        }
        this.a.a[this.g] = new fa(\u26032);
        if (\u2603 == 1) {
            this.a(this.h);
        }
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final float \u2603) {
        this.c();
        this.a(this.q, bnq.a("sign.edit", new Object[0]), this.l / 2, 40, 16777215);
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        bfl.E();
        bfl.b((float)(this.l / 2), 0.0f, 50.0f);
        final float n = 93.75f;
        bfl.a(-n, -n, -n);
        bfl.b(180.0f, 0.0f, 1.0f, 0.0f);
        final afh w = this.a.w();
        if (w == afi.an) {
            final float \u26032 = this.a.u() * 360 / 16.0f;
            bfl.b(\u26032, 0.0f, 1.0f, 0.0f);
            bfl.b(0.0f, -1.0625f, 0.0f);
        }
        else {
            final int u = this.a.u();
            float \u26033 = 0.0f;
            if (u == 2) {
                \u26033 = 180.0f;
            }
            if (u == 4) {
                \u26033 = 90.0f;
            }
            if (u == 5) {
                \u26033 = -90.0f;
            }
            bfl.b(\u26033, 0.0f, 1.0f, 0.0f);
            bfl.b(0.0f, -1.0625f, 0.0f);
        }
        if (this.f / 6 % 2 == 0) {
            this.a.f = this.g;
        }
        bhc.a.a(this.a, -0.5, -0.75, -0.5, 0.0f);
        this.a.f = -1;
        bfl.F();
        super.a(\u2603, \u2603, \u2603);
    }
}
