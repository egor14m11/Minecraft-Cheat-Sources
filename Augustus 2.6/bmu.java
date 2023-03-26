import org.apache.logging.log4j.LogManager;
import com.google.common.collect.Lists;
import java.util.List;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class bmu
{
    private static final Logger a;
    private final List<bmv> b;
    private final List<Integer> c;
    private int d;
    private int e;
    private List<Integer> f;
    private int g;
    
    public bmu(final bmu \u2603) {
        this();
        for (int i = 0; i < \u2603.i(); ++i) {
            this.a(\u2603.c(i));
        }
        this.d = \u2603.g();
    }
    
    public bmu() {
        this.b = (List<bmv>)Lists.newArrayList();
        this.c = (List<Integer>)Lists.newArrayList();
        this.d = 0;
        this.e = -1;
        this.f = (List<Integer>)Lists.newArrayList();
        this.g = -1;
    }
    
    public void a() {
        this.b.clear();
        this.c.clear();
        this.e = -1;
        this.f.clear();
        this.g = -1;
        this.d = 0;
    }
    
    public bmu a(final bmv \u2603) {
        if (\u2603.f() && this.j()) {
            bmu.a.warn("VertexFormat error: Trying to add a position VertexFormatElement when one already exists, ignoring.");
            return this;
        }
        this.b.add(\u2603);
        this.c.add(this.d);
        switch (bmu$1.a[\u2603.b().ordinal()]) {
            case 1: {
                this.g = this.d;
                break;
            }
            case 2: {
                this.e = this.d;
                break;
            }
            case 3: {
                this.f.add(\u2603.d(), this.d);
                break;
            }
        }
        this.d += \u2603.e();
        return this;
    }
    
    public boolean b() {
        return this.g >= 0;
    }
    
    public int c() {
        return this.g;
    }
    
    public boolean d() {
        return this.e >= 0;
    }
    
    public int e() {
        return this.e;
    }
    
    public boolean a(final int \u2603) {
        return this.f.size() - 1 >= \u2603;
    }
    
    public int b(final int \u2603) {
        return this.f.get(\u2603);
    }
    
    @Override
    public String toString() {
        String s = "format: " + this.b.size() + " elements: ";
        for (int i = 0; i < this.b.size(); ++i) {
            s += this.b.get(i).toString();
            if (i != this.b.size() - 1) {
                s += " ";
            }
        }
        return s;
    }
    
    private boolean j() {
        for (int i = 0, size = this.b.size(); i < size; ++i) {
            final bmv bmv = this.b.get(i);
            if (bmv.f()) {
                return true;
            }
        }
        return false;
    }
    
    public int f() {
        return this.g() / 4;
    }
    
    public int g() {
        return this.d;
    }
    
    public List<bmv> h() {
        return this.b;
    }
    
    public int i() {
        return this.b.size();
    }
    
    public bmv c(final int \u2603) {
        return this.b.get(\u2603);
    }
    
    public int d(final int \u2603) {
        return this.c.get(\u2603);
    }
    
    @Override
    public boolean equals(final Object \u2603) {
        if (this == \u2603) {
            return true;
        }
        if (\u2603 == null || this.getClass() != \u2603.getClass()) {
            return false;
        }
        final bmu bmu = (bmu)\u2603;
        return this.d == bmu.d && this.b.equals(bmu.b) && this.c.equals(bmu.c);
    }
    
    @Override
    public int hashCode() {
        int hashCode = this.b.hashCode();
        hashCode = 31 * hashCode + this.c.hashCode();
        hashCode = 31 * hashCode + this.d;
        return hashCode;
    }
    
    static {
        a = LogManager.getLogger();
    }
}
