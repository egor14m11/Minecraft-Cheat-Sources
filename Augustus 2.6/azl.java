import java.util.Iterator;
import com.google.common.collect.Lists;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class azl extends awd
{
    private final azh u;
    private final List<azk> v;
    private final List<azj> w;
    private final a x;
    private int y;
    
    public azl(final azh \u2603, final ave \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        super(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        this.v = (List<azk>)Lists.newArrayList();
        this.w = (List<azj>)Lists.newArrayList();
        this.x = new azi();
        this.y = -1;
        this.u = \u2603;
    }
    
    @Override
    public a b(int \u2603) {
        if (\u2603 < this.v.size()) {
            return this.v.get(\u2603);
        }
        \u2603 -= this.v.size();
        if (\u2603 == 0) {
            return this.x;
        }
        --\u2603;
        return this.w.get(\u2603);
    }
    
    @Override
    protected int b() {
        return this.v.size() + 1 + this.w.size();
    }
    
    public void c(final int \u2603) {
        this.y = \u2603;
    }
    
    @Override
    protected boolean a(final int \u2603) {
        return \u2603 == this.y;
    }
    
    public int e() {
        return this.y;
    }
    
    public void a(final bdf \u2603) {
        this.v.clear();
        for (int i = 0; i < \u2603.c(); ++i) {
            this.v.add(new azk(this.u, \u2603.a(i)));
        }
    }
    
    public void a(final List<bpq.a> \u2603) {
        this.w.clear();
        for (final bpq.a \u26032 : \u2603) {
            this.w.add(new azj(this.u, \u26032));
        }
    }
    
    @Override
    protected int d() {
        return super.d() + 30;
    }
    
    @Override
    public int c() {
        return super.c() + 85;
    }
}
