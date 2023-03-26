import com.google.common.collect.Lists;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class ta
{
    ps a;
    List<pk> b;
    List<pk> c;
    
    public ta(final ps \u2603) {
        this.b = (List<pk>)Lists.newArrayList();
        this.c = (List<pk>)Lists.newArrayList();
        this.a = \u2603;
    }
    
    public void a() {
        this.b.clear();
        this.c.clear();
    }
    
    public boolean a(final pk \u2603) {
        if (this.b.contains(\u2603)) {
            return true;
        }
        if (this.c.contains(\u2603)) {
            return false;
        }
        this.a.o.B.a("canSee");
        final boolean t = this.a.t(\u2603);
        this.a.o.B.b();
        if (t) {
            this.b.add(\u2603);
        }
        else {
            this.c.add(\u2603);
        }
        return t;
    }
}
