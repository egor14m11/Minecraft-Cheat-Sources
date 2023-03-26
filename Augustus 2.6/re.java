import org.apache.logging.log4j.LogManager;
import java.util.Iterator;
import com.google.common.collect.Lists;
import java.util.List;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class re
{
    private static final Logger a;
    private List<a> b;
    private List<a> c;
    private final nt d;
    private int e;
    private int f;
    
    public re(final nt \u2603) {
        this.b = (List<a>)Lists.newArrayList();
        this.c = (List<a>)Lists.newArrayList();
        this.f = 3;
        this.d = \u2603;
    }
    
    public void a(final int \u2603, final rd \u2603) {
        this.b.add(new a(\u2603, \u2603));
    }
    
    public void a(final rd \u2603) {
        final Iterator<a> iterator = this.b.iterator();
        while (iterator.hasNext()) {
            final a a = iterator.next();
            final rd a2 = a.a;
            if (a2 == \u2603) {
                if (this.c.contains(a)) {
                    a2.d();
                    this.c.remove(a);
                }
                iterator.remove();
            }
        }
    }
    
    public void a() {
        this.d.a("goalSetup");
        if (this.e++ % this.f == 0) {
            for (final a a : this.b) {
                final boolean contains = this.c.contains(a);
                if (contains) {
                    if (this.b(a) && this.a(a)) {
                        continue;
                    }
                    a.a.d();
                    this.c.remove(a);
                }
                if (this.b(a)) {
                    if (!a.a.a()) {
                        continue;
                    }
                    a.a.c();
                    this.c.add(a);
                }
            }
        }
        else {
            final Iterator<a> iterator2 = this.c.iterator();
            while (iterator2.hasNext()) {
                final a a = iterator2.next();
                if (!this.a(a)) {
                    a.a.d();
                    iterator2.remove();
                }
            }
        }
        this.d.b();
        this.d.a("goalTick");
        final Iterator iterator = this.c.iterator();
        while (iterator.hasNext()) {
            final a a = iterator.next();
            a.a.e();
        }
        this.d.b();
    }
    
    private boolean a(final a \u2603) {
        final boolean b = \u2603.a.b();
        return b;
    }
    
    private boolean b(final a \u2603) {
        for (final a \u26032 : this.b) {
            if (\u26032 == \u2603) {
                continue;
            }
            if (\u2603.b >= \u26032.b) {
                if (!this.a(\u2603, \u26032) && this.c.contains(\u26032)) {
                    return false;
                }
                continue;
            }
            else {
                if (!\u26032.a.i() && this.c.contains(\u26032)) {
                    return false;
                }
                continue;
            }
        }
        return true;
    }
    
    private boolean a(final a \u2603, final a \u2603) {
        return (\u2603.a.j() & \u2603.a.j()) == 0x0;
    }
    
    static {
        a = LogManager.getLogger();
    }
    
    class a
    {
        public rd a;
        public int b;
        
        public a(final int \u2603, final rd \u2603) {
            this.b = \u2603;
            this.a = \u2603;
        }
    }
}
