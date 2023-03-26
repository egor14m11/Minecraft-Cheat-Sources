import org.apache.logging.log4j.LogManager;
import com.google.common.collect.Lists;
import com.google.common.base.Splitter;
import java.util.List;
import org.lwjgl.input.Keyboard;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class azh extends axu implements awx
{
    private static final Logger a;
    private final bdg f;
    private axu g;
    private azl h;
    private bdf i;
    private avs r;
    private avs s;
    private avs t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private String y;
    private bde z;
    private bpq.c A;
    private bpq.b B;
    private boolean C;
    
    public azh(final axu \u2603) {
        this.f = new bdg();
        this.g = \u2603;
    }
    
    @Override
    public void b() {
        Keyboard.enableRepeatEvents(true);
        this.n.clear();
        if (!this.C) {
            this.C = true;
            (this.i = new bdf(this.j)).a();
            this.A = new bpq.c();
            try {
                (this.B = new bpq.b(this.A)).start();
            }
            catch (Exception ex) {
                azh.a.warn("Unable to start LAN server detection: " + ex.getMessage());
            }
            (this.h = new azl(this, this.j, this.l, this.m, 32, this.m - 64, 36)).a(this.i);
        }
        else {
            this.h.a(this.l, this.m, 32, this.m - 64);
        }
        this.a();
    }
    
    @Override
    public void k() {
        super.k();
        this.h.p();
    }
    
    public void a() {
        this.n.add(this.r = new avs(7, this.l / 2 - 154, this.m - 28, 70, 20, bnq.a("selectServer.edit", new Object[0])));
        this.n.add(this.t = new avs(2, this.l / 2 - 74, this.m - 28, 70, 20, bnq.a("selectServer.delete", new Object[0])));
        this.n.add(this.s = new avs(1, this.l / 2 - 154, this.m - 52, 100, 20, bnq.a("selectServer.select", new Object[0])));
        this.n.add(new avs(4, this.l / 2 - 50, this.m - 52, 100, 20, bnq.a("selectServer.direct", new Object[0])));
        this.n.add(new avs(3, this.l / 2 + 4 + 50, this.m - 52, 100, 20, bnq.a("selectServer.add", new Object[0])));
        this.n.add(new avs(8, this.l / 2 + 4, this.m - 28, 70, 20, bnq.a("selectServer.refresh", new Object[0])));
        this.n.add(new avs(0, this.l / 2 + 4 + 76, this.m - 28, 75, 20, bnq.a("gui.cancel", new Object[0])));
        this.b(this.h.e());
    }
    
    @Override
    public void e() {
        super.e();
        if (this.A.a()) {
            final List<bpq.a> c = this.A.c();
            this.A.b();
            this.h.a(c);
        }
        this.f.a();
    }
    
    @Override
    public void m() {
        Keyboard.enableRepeatEvents(false);
        if (this.B != null) {
            this.B.interrupt();
            this.B = null;
        }
        this.f.b();
    }
    
    @Override
    protected void a(final avs \u2603) {
        if (!\u2603.l) {
            return;
        }
        final awd.a a = (this.h.e() < 0) ? null : this.h.b(this.h.e());
        if (\u2603.k == 2 && a instanceof azk) {
            final String a2 = ((azk)a).a().a;
            if (a2 != null) {
                this.u = true;
                final String a3 = bnq.a("selectServer.deleteQuestion", new Object[0]);
                final String string = "'" + a2 + "' " + bnq.a("selectServer.deleteWarning", new Object[0]);
                final String a4 = bnq.a("selectServer.deleteButton", new Object[0]);
                final String a5 = bnq.a("gui.cancel", new Object[0]);
                final awy \u26032 = new awy(this, a3, string, a4, a5, this.h.e());
                this.j.a(\u26032);
            }
        }
        else if (\u2603.k == 1) {
            this.f();
        }
        else if (\u2603.k == 4) {
            this.x = true;
            this.j.a(new axg(this, this.z = new bde(bnq.a("selectServer.defaultName", new Object[0]), "", false)));
        }
        else if (\u2603.k == 3) {
            this.v = true;
            this.j.a(new axi(this, this.z = new bde(bnq.a("selectServer.defaultName", new Object[0]), "", false)));
        }
        else if (\u2603.k == 7 && a instanceof azk) {
            this.w = true;
            final bde a6 = ((azk)a).a();
            (this.z = new bde(a6.a, a6.b, false)).a(a6);
            this.j.a(new axi(this, this.z));
        }
        else if (\u2603.k == 0) {
            this.j.a(this.g);
        }
        else if (\u2603.k == 8) {
            this.i();
        }
    }
    
    private void i() {
        this.j.a(new azh(this.g));
    }
    
    @Override
    public void a(final boolean \u2603, final int \u2603) {
        final awd.a a = (this.h.e() < 0) ? null : this.h.b(this.h.e());
        if (this.u) {
            this.u = false;
            if (\u2603 && a instanceof azk) {
                this.i.b(this.h.e());
                this.i.b();
                this.h.c(-1);
                this.h.a(this.i);
            }
            this.j.a(this);
        }
        else if (this.x) {
            this.x = false;
            if (\u2603) {
                this.a(this.z);
            }
            else {
                this.j.a(this);
            }
        }
        else if (this.v) {
            this.v = false;
            if (\u2603) {
                this.i.a(this.z);
                this.i.b();
                this.h.c(-1);
                this.h.a(this.i);
            }
            this.j.a(this);
        }
        else if (this.w) {
            this.w = false;
            if (\u2603 && a instanceof azk) {
                final bde a2 = ((azk)a).a();
                a2.a = this.z.a;
                a2.b = this.z.b;
                a2.a(this.z);
                this.i.b();
                this.h.a(this.i);
            }
            this.j.a(this);
        }
    }
    
    @Override
    protected void a(final char \u2603, final int \u2603) {
        final int e = this.h.e();
        final awd.a a = (e < 0) ? null : this.h.b(e);
        if (\u2603 == 63) {
            this.i();
            return;
        }
        if (e >= 0) {
            if (\u2603 == 200) {
                if (r()) {
                    if (e > 0 && a instanceof azk) {
                        this.i.a(e, e - 1);
                        this.b(this.h.e() - 1);
                        this.h.h(-this.h.r());
                        this.h.a(this.i);
                    }
                }
                else if (e > 0) {
                    this.b(this.h.e() - 1);
                    this.h.h(-this.h.r());
                    if (this.h.b(this.h.e()) instanceof azi) {
                        if (this.h.e() > 0) {
                            this.b(this.h.b() - 1);
                            this.h.h(-this.h.r());
                        }
                        else {
                            this.b(-1);
                        }
                    }
                }
                else {
                    this.b(-1);
                }
            }
            else if (\u2603 == 208) {
                if (r()) {
                    if (e < this.i.c() - 1) {
                        this.i.a(e, e + 1);
                        this.b(e + 1);
                        this.h.h(this.h.r());
                        this.h.a(this.i);
                    }
                }
                else if (e < this.h.b()) {
                    this.b(this.h.e() + 1);
                    this.h.h(this.h.r());
                    if (this.h.b(this.h.e()) instanceof azi) {
                        if (this.h.e() < this.h.b() - 1) {
                            this.b(this.h.b() + 1);
                            this.h.h(this.h.r());
                        }
                        else {
                            this.b(-1);
                        }
                    }
                }
                else {
                    this.b(-1);
                }
            }
            else if (\u2603 == 28 || \u2603 == 156) {
                this.a(this.n.get(2));
            }
            else {
                super.a(\u2603, \u2603);
            }
        }
        else {
            super.a(\u2603, \u2603);
        }
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final float \u2603) {
        this.y = null;
        this.c();
        this.h.a(\u2603, \u2603, \u2603);
        this.a(this.q, bnq.a("multiplayer.title", new Object[0]), this.l / 2, 20, 16777215);
        super.a(\u2603, \u2603, \u2603);
        if (this.y != null) {
            this.a((List<String>)Lists.newArrayList((Iterable<?>)Splitter.on("\n").split(this.y)), \u2603, \u2603);
        }
    }
    
    public void f() {
        final awd.a a = (this.h.e() < 0) ? null : this.h.b(this.h.e());
        if (a instanceof azk) {
            this.a(((azk)a).a());
        }
        else if (a instanceof azj) {
            final bpq.a a2 = ((azj)a).a();
            this.a(new bde(a2.a(), a2.b(), true));
        }
    }
    
    private void a(final bde \u2603) {
        this.j.a(new awz(this, this.j, \u2603));
    }
    
    public void b(final int \u2603) {
        this.h.c(\u2603);
        final awd.a a = (\u2603 < 0) ? null : this.h.b(\u2603);
        this.s.l = false;
        this.r.l = false;
        this.t.l = false;
        if (a != null && !(a instanceof azi)) {
            this.s.l = true;
            if (a instanceof azk) {
                this.r.l = true;
                this.t.l = true;
            }
        }
    }
    
    public bdg g() {
        return this.f;
    }
    
    public void a(final String \u2603) {
        this.y = \u2603;
    }
    
    @Override
    protected void a(final int \u2603, final int \u2603, final int \u2603) {
        super.a(\u2603, \u2603, \u2603);
        this.h.b(\u2603, \u2603, \u2603);
    }
    
    @Override
    protected void b(final int \u2603, final int \u2603, final int \u2603) {
        super.b(\u2603, \u2603, \u2603);
        this.h.c(\u2603, \u2603, \u2603);
    }
    
    public bdf h() {
        return this.i;
    }
    
    public boolean a(final azk \u2603, final int \u2603) {
        return \u2603 > 0;
    }
    
    public boolean b(final azk \u2603, final int \u2603) {
        return \u2603 < this.i.c() - 1;
    }
    
    public void a(final azk \u2603, final int \u2603, final boolean \u2603) {
        final int n = \u2603 ? 0 : (\u2603 - 1);
        this.i.a(\u2603, n);
        if (this.h.e() == \u2603) {
            this.b(n);
        }
        this.h.a(this.i);
    }
    
    public void b(final azk \u2603, final int \u2603, final boolean \u2603) {
        final int n = \u2603 ? (this.i.c() - 1) : (\u2603 + 1);
        this.i.a(\u2603, n);
        if (this.h.e() == \u2603) {
            this.b(n);
        }
        this.h.a(this.i);
    }
    
    static {
        a = LogManager.getLogger();
    }
}
