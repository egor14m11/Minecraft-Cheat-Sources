import org.apache.logging.log4j.LogManager;
import java.util.List;
import com.google.common.collect.Lists;
import java.util.concurrent.Callable;
import java.util.Iterator;
import com.google.common.collect.Sets;
import java.util.Set;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class la
{
    private static final Logger a;
    private final le b;
    private Set<lh> c;
    private nm<lh> d;
    private int e;
    
    public la(final le \u2603) {
        this.c = (Set<lh>)Sets.newHashSet();
        this.d = new nm<lh>();
        this.b = \u2603;
        this.e = \u2603.r().ap().d();
    }
    
    public void a(final pk \u2603) {
        if (\u2603 instanceof lf) {
            this.a(\u2603, 512, 2);
            final lf \u26032 = (lf)\u2603;
            for (final lh lh : this.c) {
                if (lh.a != \u26032) {
                    lh.b(\u26032);
                }
            }
        }
        else if (\u2603 instanceof ur) {
            this.a(\u2603, 64, 5, true);
        }
        else if (\u2603 instanceof wq) {
            this.a(\u2603, 64, 20, false);
        }
        else if (\u2603 instanceof ww) {
            this.a(\u2603, 64, 10, false);
        }
        else if (\u2603 instanceof ws) {
            this.a(\u2603, 64, 10, false);
        }
        else if (\u2603 instanceof wx) {
            this.a(\u2603, 64, 10, true);
        }
        else if (\u2603 instanceof xa) {
            this.a(\u2603, 64, 10, true);
        }
        else if (\u2603 instanceof wr) {
            this.a(\u2603, 64, 4, true);
        }
        else if (\u2603 instanceof wz) {
            this.a(\u2603, 64, 10, true);
        }
        else if (\u2603 instanceof xc) {
            this.a(\u2603, 64, 10, true);
        }
        else if (\u2603 instanceof xb) {
            this.a(\u2603, 64, 10, true);
        }
        else if (\u2603 instanceof wt) {
            this.a(\u2603, 64, 10, true);
        }
        else if (\u2603 instanceof uz) {
            this.a(\u2603, 64, 20, true);
        }
        else if (\u2603 instanceof va) {
            this.a(\u2603, 80, 3, true);
        }
        else if (\u2603 instanceof ux) {
            this.a(\u2603, 80, 3, true);
        }
        else if (\u2603 instanceof tx) {
            this.a(\u2603, 64, 3, true);
        }
        else if (\u2603 instanceof uk) {
            this.a(\u2603, 80, 3, false);
        }
        else if (\u2603 instanceof tk) {
            this.a(\u2603, 80, 3, false);
        }
        else if (\u2603 instanceof ug) {
            this.a(\u2603, 160, 3, true);
        }
        else if (\u2603 instanceof pi) {
            this.a(\u2603, 80, 3, true);
        }
        else if (\u2603 instanceof vj) {
            this.a(\u2603, 160, 10, true);
        }
        else if (\u2603 instanceof uy) {
            this.a(\u2603, 160, 20, true);
        }
        else if (\u2603 instanceof un) {
            this.a(\u2603, 160, Integer.MAX_VALUE, false);
        }
        else if (\u2603 instanceof um) {
            this.a(\u2603, 160, 3, true);
        }
        else if (\u2603 instanceof pp) {
            this.a(\u2603, 160, 20, true);
        }
        else if (\u2603 instanceof uf) {
            this.a(\u2603, 256, Integer.MAX_VALUE, false);
        }
    }
    
    public void a(final pk \u2603, final int \u2603, final int \u2603) {
        this.a(\u2603, \u2603, \u2603, false);
    }
    
    public void a(final pk \u2603, int \u2603, final int \u2603, final boolean \u2603) {
        if (\u2603 > this.e) {
            \u2603 = this.e;
        }
        try {
            if (this.d.b(\u2603.F())) {
                throw new IllegalStateException("Entity is already tracked!");
            }
            final lh \u26032 = new lh(\u2603, \u2603, \u2603, \u2603);
            this.c.add(\u26032);
            this.d.a(\u2603.F(), \u26032);
            \u26032.b(this.b.j);
        }
        catch (Throwable \u26033) {
            final b a = b.a(\u26033, "Adding entity to track");
            final c a2 = a.a("Entity To Track");
            a2.a("Tracking range", \u2603 + " blocks");
            a2.a("Update interval", new Callable<String>() {
                public String a() throws Exception {
                    String str = "Once per " + \u2603 + " ticks";
                    if (\u2603 == Integer.MAX_VALUE) {
                        str = "Maximum (" + str + ")";
                    }
                    return str;
                }
            });
            \u2603.a(a2);
            final c a3 = a.a("Entity That Is Already Tracked");
            this.d.a(\u2603.F()).a.a(a3);
            try {
                throw new e(a);
            }
            catch (e throwable) {
                la.a.error("\"Silently\" catching entity tracking error.", throwable);
            }
        }
    }
    
    public void b(final pk \u2603) {
        if (\u2603 instanceof lf) {
            final lf \u26032 = (lf)\u2603;
            for (final lh lh : this.c) {
                lh.a(\u26032);
            }
        }
        final lh lh2 = this.d.d(\u2603.F());
        if (lh2 != null) {
            this.c.remove(lh2);
            lh2.a();
        }
    }
    
    public void a() {
        final List<lf> arrayList = (List<lf>)Lists.newArrayList();
        for (final lh lh : this.c) {
            lh.a(this.b.j);
            if (lh.n && lh.a instanceof lf) {
                arrayList.add((lf)lh.a);
            }
        }
        for (int i = 0; i < arrayList.size(); ++i) {
            final lf \u2603 = arrayList.get(i);
            for (final lh lh2 : this.c) {
                if (lh2.a != \u2603) {
                    lh2.b(\u2603);
                }
            }
        }
    }
    
    public void a(final lf \u2603) {
        for (final lh lh : this.c) {
            if (lh.a == \u2603) {
                lh.b(this.b.j);
            }
            else {
                lh.b(\u2603);
            }
        }
    }
    
    public void a(final pk \u2603, final ff \u2603) {
        final lh lh = this.d.a(\u2603.F());
        if (lh != null) {
            lh.a(\u2603);
        }
    }
    
    public void b(final pk \u2603, final ff \u2603) {
        final lh lh = this.d.a(\u2603.F());
        if (lh != null) {
            lh.b(\u2603);
        }
    }
    
    public void b(final lf \u2603) {
        for (final lh lh : this.c) {
            lh.d(\u2603);
        }
    }
    
    public void a(final lf \u2603, final amy \u2603) {
        for (final lh lh : this.c) {
            if (lh.a != \u2603 && lh.a.ae == \u2603.a && lh.a.ag == \u2603.b) {
                lh.b(\u2603);
            }
        }
    }
    
    static {
        a = LogManager.getLogger();
    }
}
