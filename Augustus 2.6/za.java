import com.google.common.collect.Multimap;
import java.util.Set;

// 
// Decompiled by Procyon v0.5.36
// 

public class za extends zw
{
    private Set<afh> c;
    protected float a;
    private float d;
    protected a b;
    
    protected za(final float \u2603, final a \u2603, final Set<afh> \u2603) {
        this.a = 4.0f;
        this.b = \u2603;
        this.c = \u2603;
        this.h = 1;
        this.d(\u2603.a());
        this.a = \u2603.b();
        this.d = \u2603 + \u2603.c();
        this.a(yz.i);
    }
    
    @Override
    public float a(final zx \u2603, final afh \u2603) {
        return this.c.contains(\u2603) ? this.a : 1.0f;
    }
    
    @Override
    public boolean a(final zx \u2603, final pr \u2603, final pr \u2603) {
        \u2603.a(2, \u2603);
        return true;
    }
    
    @Override
    public boolean a(final zx \u2603, final adm \u2603, final afh \u2603, final cj \u2603, final pr \u2603) {
        if (\u2603.g(\u2603, \u2603) != 0.0) {
            \u2603.a(1, \u2603);
        }
        return true;
    }
    
    @Override
    public boolean w_() {
        return true;
    }
    
    public a g() {
        return this.b;
    }
    
    @Override
    public int b() {
        return this.b.e();
    }
    
    public String h() {
        return this.b.toString();
    }
    
    @Override
    public boolean a(final zx \u2603, final zx \u2603) {
        return this.b.f() == \u2603.b() || super.a(\u2603, \u2603);
    }
    
    @Override
    public Multimap<String, qd> i() {
        final Multimap<String, qd> i = super.i();
        i.put(vy.e.a(), new qd(za.f, "Tool modifier", this.d, 0));
        return i;
    }
}
