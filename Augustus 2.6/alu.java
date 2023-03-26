import java.util.Iterator;
import java.util.Collection;
import com.google.common.collect.Lists;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class alu extends akw implements km
{
    private alz a;
    private cq f;
    private boolean g;
    private boolean h;
    private float i;
    private float j;
    private List<pk> k;
    
    public alu() {
        this.k = (List<pk>)Lists.newArrayList();
    }
    
    public alu(final alz \u2603, final cq \u2603, final boolean \u2603, final boolean \u2603) {
        this.k = (List<pk>)Lists.newArrayList();
        this.a = \u2603;
        this.f = \u2603;
        this.g = \u2603;
        this.h = \u2603;
    }
    
    public alz b() {
        return this.a;
    }
    
    @Override
    public int u() {
        return 0;
    }
    
    public boolean d() {
        return this.g;
    }
    
    public cq e() {
        return this.f;
    }
    
    public boolean g() {
        return this.h;
    }
    
    public float a(float \u2603) {
        if (\u2603 > 1.0f) {
            \u2603 = 1.0f;
        }
        return this.j + (this.i - this.j) * \u2603;
    }
    
    public float b(final float \u2603) {
        if (this.g) {
            return (this.a(\u2603) - 1.0f) * this.f.g();
        }
        return (1.0f - this.a(\u2603)) * this.f.g();
    }
    
    public float c(final float \u2603) {
        if (this.g) {
            return (this.a(\u2603) - 1.0f) * this.f.h();
        }
        return (1.0f - this.a(\u2603)) * this.f.h();
    }
    
    public float d(final float \u2603) {
        if (this.g) {
            return (this.a(\u2603) - 1.0f) * this.f.i();
        }
        return (1.0f - this.a(\u2603)) * this.f.i();
    }
    
    private void a(float \u2603, final float \u2603) {
        if (this.g) {
            \u2603 = 1.0f - \u2603;
        }
        else {
            --\u2603;
        }
        final aug a = afi.M.a(this.b, this.c, this.a, \u2603, this.f);
        if (a != null) {
            final List<pk> b = this.b.b(null, a);
            if (!b.isEmpty()) {
                this.k.addAll(b);
                for (final pk pk : this.k) {
                    if (this.a.c() == afi.cE && this.g) {
                        switch (alu$1.a[this.f.k().ordinal()]) {
                            case 1: {
                                pk.v = this.f.g();
                                continue;
                            }
                            case 2: {
                                pk.w = this.f.h();
                                continue;
                            }
                            case 3: {
                                pk.x = this.f.i();
                                continue;
                            }
                        }
                    }
                    else {
                        pk.d(\u2603 * this.f.g(), \u2603 * this.f.h(), \u2603 * this.f.i());
                    }
                }
                this.k.clear();
            }
        }
    }
    
    public void h() {
        if (this.j < 1.0f && this.b != null) {
            final float n = 1.0f;
            this.i = n;
            this.j = n;
            this.b.t(this.c);
            this.y();
            if (this.b.p(this.c).c() == afi.M) {
                this.b.a(this.c, this.a, 3);
                this.b.d(this.c, this.a.c());
            }
        }
    }
    
    @Override
    public void c() {
        this.j = this.i;
        if (this.j >= 1.0f) {
            this.a(1.0f, 0.25f);
            this.b.t(this.c);
            this.y();
            if (this.b.p(this.c).c() == afi.M) {
                this.b.a(this.c, this.a, 3);
                this.b.d(this.c, this.a.c());
            }
            return;
        }
        this.i += 0.5f;
        if (this.i >= 1.0f) {
            this.i = 1.0f;
        }
        if (this.g) {
            this.a(this.i, this.i - this.j + 0.0625f);
        }
    }
    
    @Override
    public void a(final dn \u2603) {
        super.a(\u2603);
        this.a = afh.c(\u2603.f("blockId")).a(\u2603.f("blockData"));
        this.f = cq.a(\u2603.f("facing"));
        final float h = \u2603.h("progress");
        this.i = h;
        this.j = h;
        this.g = \u2603.n("extending");
    }
    
    @Override
    public void b(final dn \u2603) {
        super.b(\u2603);
        \u2603.a("blockId", afh.a(this.a.c()));
        \u2603.a("blockData", this.a.c().c(this.a));
        \u2603.a("facing", this.f.a());
        \u2603.a("progress", this.j);
        \u2603.a("extending", this.g);
    }
}
