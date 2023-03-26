import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class abd extends zw
{
    public abd() {
        this.c(1);
    }
    
    public static boolean b(final dn \u2603) {
        if (!abc.b(\u2603)) {
            return false;
        }
        if (!\u2603.b("title", 8)) {
            return false;
        }
        final String j = \u2603.j("title");
        return j != null && j.length() <= 32 && \u2603.b("author", 8);
    }
    
    public static int h(final zx \u2603) {
        return \u2603.o().f("generation");
    }
    
    @Override
    public String a(final zx \u2603) {
        if (\u2603.n()) {
            final dn o = \u2603.o();
            final String j = o.j("title");
            if (!nx.b(j)) {
                return j;
            }
        }
        return super.a(\u2603);
    }
    
    @Override
    public void a(final zx \u2603, final wn \u2603, final List<String> \u2603, final boolean \u2603) {
        if (\u2603.n()) {
            final dn o = \u2603.o();
            final String j = o.j("author");
            if (!nx.b(j)) {
                \u2603.add(a.h + di.a("book.byAuthor", j));
            }
            \u2603.add(a.h + di.a("book.generation." + o.f("generation")));
        }
    }
    
    @Override
    public zx a(final zx \u2603, final adm \u2603, final wn \u2603) {
        if (!\u2603.D) {
            this.a(\u2603, \u2603);
        }
        \u2603.a(\u2603);
        \u2603.b(na.ad[zw.b(this)]);
        return \u2603;
    }
    
    private void a(final zx \u2603, final wn \u2603) {
        if (\u2603 == null || \u2603.o() == null) {
            return;
        }
        final dn o = \u2603.o();
        if (o.n("resolved")) {
            return;
        }
        o.a("resolved", true);
        if (!b(o)) {
            return;
        }
        final du c = o.c("pages", 8);
        for (int i = 0; i < c.c(); ++i) {
            final String f = c.f(i);
            eu eu;
            try {
                eu = eu.a.a(f);
                eu = ev.a(\u2603, eu, \u2603);
            }
            catch (Exception ex) {
                eu = new fa(f);
            }
            c.a(i, new ea(eu.a.a(eu)));
        }
        o.a("pages", c);
        if (\u2603 instanceof lf && \u2603.bZ() == \u2603) {
            final yg a = \u2603.bk.a(\u2603.bi, \u2603.bi.c);
            ((lf)\u2603).a.a(new gf(0, a.e, \u2603));
        }
    }
    
    @Override
    public boolean f(final zx \u2603) {
        return true;
    }
}
