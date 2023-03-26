import java.util.Iterator;
import com.google.common.collect.Lists;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class ov
{
    private final List<ou> a;
    private final pr b;
    private int c;
    private int d;
    private int e;
    private boolean f;
    private boolean g;
    private String h;
    
    public ov(final pr \u2603) {
        this.a = (List<ou>)Lists.newArrayList();
        this.b = \u2603;
    }
    
    public void a() {
        this.j();
        if (this.b.k_()) {
            final afh c = this.b.o.p(new cj(this.b.s, this.b.aR().b, this.b.u)).c();
            if (c == afi.au) {
                this.h = "ladder";
            }
            else if (c == afi.bn) {
                this.h = "vines";
            }
        }
        else if (this.b.V()) {
            this.h = "water";
        }
    }
    
    public void a(final ow \u2603, final float \u2603, final float \u2603) {
        this.g();
        this.a();
        final ou ou = new ou(\u2603, this.b.W, \u2603, \u2603, this.h, this.b.O);
        this.a.add(ou);
        this.c = this.b.W;
        this.g = true;
        if (ou.f() && !this.f && this.b.ai()) {
            this.f = true;
            this.d = this.b.W;
            this.e = this.d;
            this.b.h_();
        }
    }
    
    public eu b() {
        if (this.a.size() == 0) {
            return new fb("death.attack.generic", new Object[] { this.b.f_() });
        }
        final ou i = this.i();
        final ou ou = this.a.get(this.a.size() - 1);
        final eu h = ou.h();
        final pk j = ou.a().j();
        eu b;
        if (i != null && ou.a() == ow.i) {
            final eu h2 = i.h();
            if (i.a() == ow.i || i.a() == ow.j) {
                b = new fb("death.fell.accident." + this.a(i), new Object[] { this.b.f_() });
            }
            else if (h2 != null && (h == null || !h2.equals(h))) {
                final pk k = i.a().j();
                final zx zx = (k instanceof pr) ? ((pr)k).bA() : null;
                if (zx != null && zx.s()) {
                    b = new fb("death.fell.assist.item", new Object[] { this.b.f_(), h2, zx.C() });
                }
                else {
                    b = new fb("death.fell.assist", new Object[] { this.b.f_(), h2 });
                }
            }
            else if (h != null) {
                final zx zx2 = (j instanceof pr) ? ((pr)j).bA() : null;
                if (zx2 != null && zx2.s()) {
                    b = new fb("death.fell.finish.item", new Object[] { this.b.f_(), h, zx2.C() });
                }
                else {
                    b = new fb("death.fell.finish", new Object[] { this.b.f_(), h });
                }
            }
            else {
                b = new fb("death.fell.killer", new Object[] { this.b.f_() });
            }
        }
        else {
            b = ou.a().b(this.b);
        }
        return b;
    }
    
    public pr c() {
        pr pr = null;
        wn wn = null;
        float c = 0.0f;
        float c2 = 0.0f;
        for (final ou ou : this.a) {
            if (ou.a().j() instanceof wn && (wn == null || ou.c() > c2)) {
                c2 = ou.c();
                wn = (wn)ou.a().j();
            }
            if (ou.a().j() instanceof pr && (pr == null || ou.c() > c)) {
                c = ou.c();
                pr = (pr)ou.a().j();
            }
        }
        if (wn != null && c2 >= c / 3.0f) {
            return wn;
        }
        return pr;
    }
    
    private ou i() {
        ou ou = null;
        ou ou2 = null;
        final int n = 0;
        float i = 0.0f;
        for (int j = 0; j < this.a.size(); ++j) {
            final ou ou3 = this.a.get(j);
            final ou ou4 = (j > 0) ? this.a.get(j - 1) : null;
            if ((ou3.a() == ow.i || ou3.a() == ow.j) && ou3.i() > 0.0f && (ou == null || ou3.i() > i)) {
                if (j > 0) {
                    ou = ou4;
                }
                else {
                    ou = ou3;
                }
                i = ou3.i();
            }
            if (ou3.g() != null && (ou2 == null || ou3.c() > n)) {
                ou2 = ou3;
            }
        }
        if (i > 5.0f && ou != null) {
            return ou;
        }
        if (n > 5 && ou2 != null) {
            return ou2;
        }
        return null;
    }
    
    private String a(final ou \u2603) {
        return (\u2603.g() == null) ? "generic" : \u2603.g();
    }
    
    public int f() {
        if (this.f) {
            return this.b.W - this.d;
        }
        return this.e - this.d;
    }
    
    private void j() {
        this.h = null;
    }
    
    public void g() {
        final int n = this.f ? 300 : 100;
        if (this.g && (!this.b.ai() || this.b.W - this.c > n)) {
            final boolean f = this.f;
            this.g = false;
            this.f = false;
            this.e = this.b.W;
            if (f) {
                this.b.j();
            }
            this.a.clear();
        }
    }
    
    public pr h() {
        return this.b;
    }
}
