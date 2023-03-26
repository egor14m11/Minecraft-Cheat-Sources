import java.util.Iterator;
import com.google.common.collect.Lists;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class th extends ate
{
    private adm b;
    private final List<cj> c;
    private final List<te> d;
    private final List<tf> e;
    private int f;
    
    public th(final String \u2603) {
        super(\u2603);
        this.c = (List<cj>)Lists.newArrayList();
        this.d = (List<te>)Lists.newArrayList();
        this.e = (List<tf>)Lists.newArrayList();
    }
    
    public th(final adm \u2603) {
        super(a(\u2603.t));
        this.c = (List<cj>)Lists.newArrayList();
        this.d = (List<te>)Lists.newArrayList();
        this.e = (List<tf>)Lists.newArrayList();
        this.b = \u2603;
        this.c();
    }
    
    public void a(final adm \u2603) {
        this.b = \u2603;
        for (final tf tf : this.e) {
            tf.a(\u2603);
        }
    }
    
    public void a(final cj \u2603) {
        if (this.c.size() > 64) {
            return;
        }
        if (!this.e(\u2603)) {
            this.c.add(\u2603);
        }
    }
    
    public void a() {
        ++this.f;
        for (final tf tf : this.e) {
            tf.a(this.f);
        }
        this.e();
        this.f();
        this.g();
        if (this.f % 400 == 0) {
            this.c();
        }
    }
    
    private void e() {
        final Iterator<tf> iterator = this.e.iterator();
        while (iterator.hasNext()) {
            final tf tf = iterator.next();
            if (tf.g()) {
                iterator.remove();
                this.c();
            }
        }
    }
    
    public List<tf> b() {
        return this.e;
    }
    
    public tf a(final cj \u2603, final int \u2603) {
        tf tf = null;
        double n = 3.4028234663852886E38;
        for (final tf tf2 : this.e) {
            final double i = tf2.a().i(\u2603);
            if (i >= n) {
                continue;
            }
            final float n2 = (float)(\u2603 + tf2.b());
            if (i > n2 * n2) {
                continue;
            }
            tf = tf2;
            n = i;
        }
        return tf;
    }
    
    private void f() {
        if (this.c.isEmpty()) {
            return;
        }
        this.b(this.c.remove(0));
    }
    
    private void g() {
        for (int i = 0; i < this.d.size(); ++i) {
            final te \u2603 = this.d.get(i);
            tf a = this.a(\u2603.d(), 32);
            if (a == null) {
                a = new tf(this.b);
                this.e.add(a);
                this.c();
            }
            a.a(\u2603);
        }
        this.d.clear();
    }
    
    private void b(final cj \u2603) {
        final int n = 16;
        final int n2 = 4;
        final int n3 = 16;
        for (int i = -n; i < n; ++i) {
            for (int j = -n2; j < n2; ++j) {
                for (int k = -n3; k < n3; ++k) {
                    final cj a = \u2603.a(i, j, k);
                    if (this.f(a)) {
                        final te c = this.c(a);
                        if (c == null) {
                            this.d(a);
                        }
                        else {
                            c.a(this.f);
                        }
                    }
                }
            }
        }
    }
    
    private te c(final cj \u2603) {
        for (final te te : this.d) {
            if (te.d().n() == \u2603.n() && te.d().p() == \u2603.p() && Math.abs(te.d().o() - \u2603.o()) <= 1) {
                return te;
            }
        }
        for (final tf tf : this.e) {
            final te e = tf.e(\u2603);
            if (e != null) {
                return e;
            }
        }
        return null;
    }
    
    private void d(final cj \u2603) {
        final cq h = agh.h(this.b, \u2603);
        final cq d = h.d();
        final int a = this.a(\u2603, h, 5);
        final int a2 = this.a(\u2603, d, a + 1);
        if (a != a2) {
            this.d.add(new te(\u2603, (a < a2) ? h : d, this.f));
        }
    }
    
    private int a(final cj \u2603, final cq \u2603, final int \u2603) {
        int n = 0;
        for (int i = 1; i <= 5; ++i) {
            if (this.b.i(\u2603.a(\u2603, i)) && ++n >= \u2603) {
                return n;
            }
        }
        return n;
    }
    
    private boolean e(final cj \u2603) {
        for (final cj cj : this.c) {
            if (cj.equals(\u2603)) {
                return true;
            }
        }
        return false;
    }
    
    private boolean f(final cj \u2603) {
        final afh c = this.b.p(\u2603).c();
        return c instanceof agh && c.t() == arm.d;
    }
    
    @Override
    public void a(final dn \u2603) {
        this.f = \u2603.f("Tick");
        final du c = \u2603.c("Villages", 10);
        for (int i = 0; i < c.c(); ++i) {
            final dn b = c.b(i);
            final tf tf = new tf();
            tf.a(b);
            this.e.add(tf);
        }
    }
    
    @Override
    public void b(final dn \u2603) {
        \u2603.a("Tick", this.f);
        final du \u26032 = new du();
        for (final tf tf : this.e) {
            final dn dn = new dn();
            tf.b(dn);
            \u26032.a(dn);
        }
        \u2603.a("Villages", \u26032);
    }
    
    public static String a(final anm \u2603) {
        return "villages" + \u2603.l();
    }
}
