import java.util.Iterator;
import java.util.Random;
import java.util.LinkedList;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class aqu
{
    protected LinkedList<aqt> a;
    protected aqe b;
    private int c;
    private int d;
    
    public aqu() {
        this.a = new LinkedList<aqt>();
    }
    
    public aqu(final int \u2603, final int \u2603) {
        this.a = new LinkedList<aqt>();
        this.c = \u2603;
        this.d = \u2603;
    }
    
    public aqe a() {
        return this.b;
    }
    
    public LinkedList<aqt> b() {
        return this.a;
    }
    
    public void a(final adm \u2603, final Random \u2603, final aqe \u2603) {
        final Iterator<aqt> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            final aqt aqt = iterator.next();
            if (aqt.c().a(\u2603) && !aqt.a(\u2603, \u2603, \u2603)) {
                iterator.remove();
            }
        }
    }
    
    protected void c() {
        this.b = aqe.a();
        for (final aqt aqt : this.a) {
            this.b.b(aqt.c());
        }
    }
    
    public dn a(final int \u2603, final int \u2603) {
        final dn \u26032 = new dn();
        \u26032.a("id", aqr.a(this));
        \u26032.a("ChunkX", \u2603);
        \u26032.a("ChunkZ", \u2603);
        \u26032.a("BB", this.b.g());
        final du \u26033 = new du();
        for (final aqt aqt : this.a) {
            \u26033.a(aqt.b());
        }
        \u26032.a("Children", \u26033);
        this.a(\u26032);
        return \u26032;
    }
    
    public void a(final dn \u2603) {
    }
    
    public void a(final adm \u2603, final dn \u2603) {
        this.c = \u2603.f("ChunkX");
        this.d = \u2603.f("ChunkZ");
        if (\u2603.c("BB")) {
            this.b = new aqe(\u2603.l("BB"));
        }
        final du c = \u2603.c("Children", 10);
        for (int i = 0; i < c.c(); ++i) {
            this.a.add(aqr.b(c.b(i), \u2603));
        }
        this.b(\u2603);
    }
    
    public void b(final dn \u2603) {
    }
    
    protected void a(final adm \u2603, final Random \u2603, final int \u2603) {
        final int n = \u2603.F() - \u2603;
        int n2 = this.b.d() + 1;
        if (n2 < n) {
            n2 += \u2603.nextInt(n - n2);
        }
        final int n3 = n2 - this.b.e;
        this.b.a(0, n3, 0);
        for (final aqt aqt : this.a) {
            aqt.a(0, n3, 0);
        }
    }
    
    protected void a(final adm \u2603, final Random \u2603, final int \u2603, final int \u2603) {
        final int bound = \u2603 - \u2603 + 1 - this.b.d();
        int n = 1;
        if (bound > 1) {
            n = \u2603 + \u2603.nextInt(bound);
        }
        else {
            n = \u2603;
        }
        final int n2 = n - this.b.b;
        this.b.a(0, n2, 0);
        for (final aqt aqt : this.a) {
            aqt.a(0, n2, 0);
        }
    }
    
    public boolean d() {
        return true;
    }
    
    public boolean a(final adg \u2603) {
        return true;
    }
    
    public void b(final adg \u2603) {
    }
    
    public int e() {
        return this.c;
    }
    
    public int f() {
        return this.d;
    }
}
