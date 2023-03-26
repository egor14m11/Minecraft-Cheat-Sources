import java.util.Date;
import org.apache.logging.log4j.LogManager;
import org.apache.commons.lang3.StringUtils;
import java.util.Collections;
import java.text.SimpleDateFormat;
import java.util.List;
import java.text.DateFormat;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class axv extends axu implements awx
{
    private static final Logger g;
    private final DateFormat h;
    protected axu a;
    protected String f;
    private boolean i;
    private int r;
    private List<ats> s;
    private a t;
    private String u;
    private String v;
    private String[] w;
    private boolean x;
    private avs y;
    private avs z;
    private avs A;
    private avs B;
    
    public axv(final axu \u2603) {
        this.h = new SimpleDateFormat();
        this.f = "Select world";
        this.w = new String[4];
        this.a = \u2603;
    }
    
    @Override
    public void b() {
        this.f = bnq.a("selectWorld.title", new Object[0]);
        try {
            this.f();
        }
        catch (atq throwable) {
            axv.g.error("Couldn't load level list", throwable);
            this.j.a(new axj("Unable to load worlds", throwable.getMessage()));
            return;
        }
        this.u = bnq.a("selectWorld.world", new Object[0]);
        this.v = bnq.a("selectWorld.conversion", new Object[0]);
        this.w[adp.a.b.a()] = bnq.a("gameMode.survival", new Object[0]);
        this.w[adp.a.c.a()] = bnq.a("gameMode.creative", new Object[0]);
        this.w[adp.a.d.a()] = bnq.a("gameMode.adventure", new Object[0]);
        this.w[adp.a.e.a()] = bnq.a("gameMode.spectator", new Object[0]);
        (this.t = new a(this.j)).d(4, 5);
        this.a();
    }
    
    @Override
    public void k() {
        super.k();
        this.t.p();
    }
    
    private void f() throws atq {
        final atr f = this.j.f();
        Collections.sort(this.s = f.b());
        this.r = -1;
    }
    
    protected String b(final int \u2603) {
        return this.s.get(\u2603).a();
    }
    
    protected String h(final int \u2603) {
        String cs = this.s.get(\u2603).b();
        if (StringUtils.isEmpty(cs)) {
            cs = bnq.a("selectWorld.world", new Object[0]) + " " + (\u2603 + 1);
        }
        return cs;
    }
    
    public void a() {
        this.n.add(this.z = new avs(1, this.l / 2 - 154, this.m - 52, 150, 20, bnq.a("selectWorld.select", new Object[0])));
        this.n.add(new avs(3, this.l / 2 + 4, this.m - 52, 150, 20, bnq.a("selectWorld.create", new Object[0])));
        this.n.add(this.A = new avs(6, this.l / 2 - 154, this.m - 28, 72, 20, bnq.a("selectWorld.rename", new Object[0])));
        this.n.add(this.y = new avs(2, this.l / 2 - 76, this.m - 28, 72, 20, bnq.a("selectWorld.delete", new Object[0])));
        this.n.add(this.B = new avs(7, this.l / 2 + 4, this.m - 28, 72, 20, bnq.a("selectWorld.recreate", new Object[0])));
        this.n.add(new avs(0, this.l / 2 + 82, this.m - 28, 72, 20, bnq.a("gui.cancel", new Object[0])));
        this.z.l = false;
        this.y.l = false;
        this.A.l = false;
        this.B.l = false;
    }
    
    @Override
    protected void a(final avs \u2603) {
        if (!\u2603.l) {
            return;
        }
        if (\u2603.k == 2) {
            final String h = this.h(this.r);
            if (h != null) {
                this.x = true;
                final awy a = a(this, h, this.r);
                this.j.a(a);
            }
        }
        else if (\u2603.k == 1) {
            this.i(this.r);
        }
        else if (\u2603.k == 3) {
            this.j.a(new axb(this));
        }
        else if (\u2603.k == 6) {
            this.j.a(new axt(this, this.b(this.r)));
        }
        else if (\u2603.k == 0) {
            this.j.a(this.a);
        }
        else if (\u2603.k == 7) {
            final axb \u26032 = new axb(this);
            final atp a2 = this.j.f().a(this.b(this.r), false);
            final ato d = a2.d();
            a2.a();
            \u26032.a(d);
            this.j.a(\u26032);
        }
        else {
            this.t.a(\u2603);
        }
    }
    
    public void i(final int \u2603) {
        this.j.a((axu)null);
        if (this.i) {
            return;
        }
        this.i = true;
        String \u26032 = this.b(\u2603);
        if (\u26032 == null) {
            \u26032 = "World" + \u2603;
        }
        String \u26033 = this.h(\u2603);
        if (\u26033 == null) {
            \u26033 = "World" + \u2603;
        }
        if (this.j.f().f(\u26032)) {
            this.j.a(\u26032, \u26033, null);
        }
    }
    
    @Override
    public void a(final boolean \u2603, final int \u2603) {
        if (this.x) {
            this.x = false;
            if (\u2603) {
                final atr f = this.j.f();
                f.d();
                f.e(this.b(\u2603));
                try {
                    this.f();
                }
                catch (atq throwable) {
                    axv.g.error("Couldn't load level list", throwable);
                }
            }
            this.j.a(this);
        }
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final float \u2603) {
        this.t.a(\u2603, \u2603, \u2603);
        this.a(this.q, this.f, this.l / 2, 20, 16777215);
        super.a(\u2603, \u2603, \u2603);
    }
    
    public static awy a(final awx \u2603, final String \u2603, final int \u2603) {
        final String a = bnq.a("selectWorld.deleteQuestion", new Object[0]);
        final String string = "'" + \u2603 + "' " + bnq.a("selectWorld.deleteWarning", new Object[0]);
        final String a2 = bnq.a("selectWorld.deleteButton", new Object[0]);
        final String a3 = bnq.a("gui.cancel", new Object[0]);
        final awy awy = new awy(\u2603, a, string, a2, a3, \u2603);
        return awy;
    }
    
    static {
        g = LogManager.getLogger();
    }
    
    class a extends awi
    {
        public a(final ave \u2603) {
            super(\u2603, axv.this.l, axv.this.m, 32, axv.this.m - 64, 36);
        }
        
        @Override
        protected int b() {
            return axv.this.s.size();
        }
        
        @Override
        protected void a(final int \u2603, final boolean \u2603, final int \u2603, final int \u2603) {
            axv.this.r = \u2603;
            final boolean b = axv.this.r >= 0 && axv.this.r < this.b();
            axv.this.z.l = b;
            axv.this.y.l = b;
            axv.this.A.l = b;
            axv.this.B.l = b;
            if (\u2603 && b) {
                axv.this.i(\u2603);
            }
        }
        
        @Override
        protected boolean a(final int \u2603) {
            return \u2603 == axv.this.r;
        }
        
        @Override
        protected int k() {
            return axv.this.s.size() * 36;
        }
        
        @Override
        protected void a() {
            axv.this.c();
        }
        
        @Override
        protected void a(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
            final ats ats = axv.this.s.get(\u2603);
            String s = ats.b();
            if (StringUtils.isEmpty(s)) {
                s = axv.this.u + " " + (\u2603 + 1);
            }
            String \u26032 = ats.a();
            \u26032 = \u26032 + " (" + axv.this.h.format(new Date(ats.e()));
            \u26032 += ")";
            String \u26033 = "";
            if (ats.d()) {
                \u26033 = axv.this.v + " " + \u26033;
            }
            else {
                \u26033 = axv.this.w[ats.f().a()];
                if (ats.g()) {
                    \u26033 = a.e + bnq.a("gameMode.hardcore", new Object[0]) + a.v;
                }
                if (ats.h()) {
                    \u26033 = \u26033 + ", " + bnq.a("selectWorld.cheats", new Object[0]);
                }
            }
            axv.this.c(axv.this.q, s, \u2603 + 2, \u2603 + 1, 16777215);
            axv.this.c(axv.this.q, \u26032, \u2603 + 2, \u2603 + 12, 8421504);
            axv.this.c(axv.this.q, \u26033, \u2603 + 2, \u2603 + 12 + 10, 8421504);
        }
    }
}
