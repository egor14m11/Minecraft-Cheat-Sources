import org.lwjgl.opengl.GL11;
import com.google.common.collect.Lists;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class bct
{
    public float a;
    public float b;
    private int r;
    private int s;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    private boolean t;
    private int u;
    public boolean i;
    public boolean j;
    public boolean k;
    public List<bcr> l;
    public List<bct> m;
    public final String n;
    private bbo v;
    public float o;
    public float p;
    public float q;
    
    public bct(final bbo \u2603, final String \u2603) {
        this.a = 64.0f;
        this.b = 32.0f;
        this.j = true;
        this.l = (List<bcr>)Lists.newArrayList();
        this.v = \u2603;
        \u2603.s.add(this);
        this.n = \u2603;
        this.b(\u2603.t, \u2603.u);
    }
    
    public bct(final bbo \u2603) {
        this(\u2603, null);
    }
    
    public bct(final bbo \u2603, final int \u2603, final int \u2603) {
        this(\u2603);
        this.a(\u2603, \u2603);
    }
    
    public void a(final bct \u2603) {
        if (this.m == null) {
            this.m = (List<bct>)Lists.newArrayList();
        }
        this.m.add(\u2603);
    }
    
    public bct a(final int \u2603, final int \u2603) {
        this.r = \u2603;
        this.s = \u2603;
        return this;
    }
    
    public bct a(String \u2603, final float \u2603, final float \u2603, final float \u2603, final int \u2603, final int \u2603, final int \u2603) {
        \u2603 = this.n + "." + \u2603;
        final bcu a = this.v.a(\u2603);
        this.a(a.a, a.b);
        this.l.add(new bcr(this, this.r, this.s, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, 0.0f).a(\u2603));
        return this;
    }
    
    public bct a(final float \u2603, final float \u2603, final float \u2603, final int \u2603, final int \u2603, final int \u2603) {
        this.l.add(new bcr(this, this.r, this.s, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, 0.0f));
        return this;
    }
    
    public bct a(final float \u2603, final float \u2603, final float \u2603, final int \u2603, final int \u2603, final int \u2603, final boolean \u2603) {
        this.l.add(new bcr(this, this.r, this.s, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, 0.0f, \u2603));
        return this;
    }
    
    public void a(final float \u2603, final float \u2603, final float \u2603, final int \u2603, final int \u2603, final int \u2603, final float \u2603) {
        this.l.add(new bcr(this, this.r, this.s, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603));
    }
    
    public void a(final float \u2603, final float \u2603, final float \u2603) {
        this.c = \u2603;
        this.d = \u2603;
        this.e = \u2603;
    }
    
    public void a(final float \u2603) {
        if (this.k) {
            return;
        }
        if (!this.j) {
            return;
        }
        if (!this.t) {
            this.d(\u2603);
        }
        bfl.b(this.o, this.p, this.q);
        if (this.f != 0.0f || this.g != 0.0f || this.h != 0.0f) {
            bfl.E();
            bfl.b(this.c * \u2603, this.d * \u2603, this.e * \u2603);
            if (this.h != 0.0f) {
                bfl.b(this.h * 57.295776f, 0.0f, 0.0f, 1.0f);
            }
            if (this.g != 0.0f) {
                bfl.b(this.g * 57.295776f, 0.0f, 1.0f, 0.0f);
            }
            if (this.f != 0.0f) {
                bfl.b(this.f * 57.295776f, 1.0f, 0.0f, 0.0f);
            }
            bfl.o(this.u);
            if (this.m != null) {
                for (int i = 0; i < this.m.size(); ++i) {
                    this.m.get(i).a(\u2603);
                }
            }
            bfl.F();
        }
        else if (this.c != 0.0f || this.d != 0.0f || this.e != 0.0f) {
            bfl.b(this.c * \u2603, this.d * \u2603, this.e * \u2603);
            bfl.o(this.u);
            if (this.m != null) {
                for (int i = 0; i < this.m.size(); ++i) {
                    this.m.get(i).a(\u2603);
                }
            }
            bfl.b(-this.c * \u2603, -this.d * \u2603, -this.e * \u2603);
        }
        else {
            bfl.o(this.u);
            if (this.m != null) {
                for (int i = 0; i < this.m.size(); ++i) {
                    this.m.get(i).a(\u2603);
                }
            }
        }
        bfl.b(-this.o, -this.p, -this.q);
    }
    
    public void b(final float \u2603) {
        if (this.k) {
            return;
        }
        if (!this.j) {
            return;
        }
        if (!this.t) {
            this.d(\u2603);
        }
        bfl.E();
        bfl.b(this.c * \u2603, this.d * \u2603, this.e * \u2603);
        if (this.g != 0.0f) {
            bfl.b(this.g * 57.295776f, 0.0f, 1.0f, 0.0f);
        }
        if (this.f != 0.0f) {
            bfl.b(this.f * 57.295776f, 1.0f, 0.0f, 0.0f);
        }
        if (this.h != 0.0f) {
            bfl.b(this.h * 57.295776f, 0.0f, 0.0f, 1.0f);
        }
        bfl.o(this.u);
        bfl.F();
    }
    
    public void c(final float \u2603) {
        if (this.k) {
            return;
        }
        if (!this.j) {
            return;
        }
        if (!this.t) {
            this.d(\u2603);
        }
        if (this.f != 0.0f || this.g != 0.0f || this.h != 0.0f) {
            bfl.b(this.c * \u2603, this.d * \u2603, this.e * \u2603);
            if (this.h != 0.0f) {
                bfl.b(this.h * 57.295776f, 0.0f, 0.0f, 1.0f);
            }
            if (this.g != 0.0f) {
                bfl.b(this.g * 57.295776f, 0.0f, 1.0f, 0.0f);
            }
            if (this.f != 0.0f) {
                bfl.b(this.f * 57.295776f, 1.0f, 0.0f, 0.0f);
            }
        }
        else if (this.c != 0.0f || this.d != 0.0f || this.e != 0.0f) {
            bfl.b(this.c * \u2603, this.d * \u2603, this.e * \u2603);
        }
    }
    
    private void d(final float \u2603) {
        GL11.glNewList(this.u = avd.a(1), 4864);
        final bfd c = bfx.a().c();
        for (int i = 0; i < this.l.size(); ++i) {
            this.l.get(i).a(c, \u2603);
        }
        GL11.glEndList();
        this.t = true;
    }
    
    public bct b(final int \u2603, final int \u2603) {
        this.a = (float)\u2603;
        this.b = (float)\u2603;
        return this;
    }
}
