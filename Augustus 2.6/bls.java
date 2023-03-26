import java.util.Iterator;
import java.io.IOException;
import com.google.common.collect.Lists;
import org.lwjgl.util.vector.Matrix4f;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class bls
{
    private final blq c;
    public final bfw a;
    public final bfw b;
    private final List<Object> d;
    private final List<String> e;
    private final List<Integer> f;
    private final List<Integer> g;
    private Matrix4f h;
    
    public bls(final bni \u2603, final String \u2603, final bfw \u2603, final bfw \u2603) throws IOException {
        this.d = Lists.newArrayList();
        this.e = (List<String>)Lists.newArrayList();
        this.f = (List<Integer>)Lists.newArrayList();
        this.g = (List<Integer>)Lists.newArrayList();
        this.c = new blq(\u2603, \u2603);
        this.a = \u2603;
        this.b = \u2603;
    }
    
    public void b() {
        this.c.a();
    }
    
    public void a(final String \u2603, final Object \u2603, final int \u2603, final int \u2603) {
        this.e.add(this.e.size(), \u2603);
        this.d.add(this.d.size(), \u2603);
        this.f.add(this.f.size(), \u2603);
        this.g.add(this.g.size(), \u2603);
    }
    
    private void d() {
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        bfl.k();
        bfl.i();
        bfl.c();
        bfl.n();
        bfl.f();
        bfl.h();
        bfl.w();
        bfl.i(0);
    }
    
    public void a(final Matrix4f \u2603) {
        this.h = \u2603;
    }
    
    public void a(final float \u2603) {
        this.d();
        this.a.e();
        final float \u26032 = (float)this.b.a;
        final float \u26033 = (float)this.b.b;
        bfl.b(0, 0, (int)\u26032, (int)\u26033);
        this.c.a("DiffuseSampler", this.a);
        for (int i = 0; i < this.d.size(); ++i) {
            this.c.a(this.e.get(i), this.d.get(i));
            this.c.b("AuxSize" + i).a(this.f.get(i), this.g.get(i));
        }
        this.c.b("ProjMat").a(this.h);
        this.c.b("InSize").a((float)this.a.a, (float)this.a.b);
        this.c.b("OutSize").a(\u26032, \u26033);
        this.c.b("Time").a(\u2603);
        final ave a = ave.A();
        this.c.b("ScreenSize").a((float)a.d, (float)a.e);
        this.c.c();
        this.b.f();
        this.b.a(false);
        bfl.a(false);
        bfl.a(true, true, true, true);
        final bfx a2 = bfx.a();
        final bfd c = a2.c();
        c.a(7, bms.f);
        c.b(0.0, \u26033, 500.0).b(255, 255, 255, 255).d();
        c.b(\u26032, \u26033, 500.0).b(255, 255, 255, 255).d();
        c.b(\u26032, 0.0, 500.0).b(255, 255, 255, 255).d();
        c.b(0.0, 0.0, 500.0).b(255, 255, 255, 255).d();
        a2.b();
        bfl.a(true);
        bfl.a(true, true, true, true);
        this.c.b();
        this.b.e();
        this.a.d();
        for (final Object next : this.d) {
            if (next instanceof bfw) {
                ((bfw)next).d();
            }
        }
    }
    
    public blq c() {
        return this.c;
    }
}
