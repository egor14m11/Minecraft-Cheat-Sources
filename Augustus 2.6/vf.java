import java.util.List;
import com.google.common.base.Predicate;

// 
// Decompiled by Procyon v0.5.36
// 

public class vf extends vd implements ali
{
    private boolean a;
    private int b;
    private cj c;
    
    public vf(final adm \u2603) {
        super(\u2603);
        this.a = true;
        this.b = -1;
        this.c = cj.a;
    }
    
    public vf(final adm \u2603, final double \u2603, final double \u2603, final double \u2603) {
        super(\u2603, \u2603, \u2603, \u2603);
        this.a = true;
        this.b = -1;
        this.c = cj.a;
    }
    
    @Override
    public a s() {
        return va.a.f;
    }
    
    @Override
    public alz u() {
        return afi.cp.Q();
    }
    
    @Override
    public int w() {
        return 1;
    }
    
    @Override
    public int o_() {
        return 5;
    }
    
    @Override
    public boolean e(final wn \u2603) {
        if (!this.o.D) {
            \u2603.a((og)this);
        }
        return true;
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final int \u2603, final boolean \u2603) {
        final boolean \u26032 = !\u2603;
        if (\u26032 != this.y()) {
            this.i(\u26032);
        }
    }
    
    public boolean y() {
        return this.a;
    }
    
    public void i(final boolean \u2603) {
        this.a = \u2603;
    }
    
    @Override
    public adm z() {
        return this.o;
    }
    
    @Override
    public double A() {
        return this.s;
    }
    
    @Override
    public double B() {
        return this.t + 0.5;
    }
    
    @Override
    public double C() {
        return this.u;
    }
    
    @Override
    public void t_() {
        super.t_();
        if (!this.o.D && this.ai() && this.y()) {
            final cj cj = new cj(this);
            if (cj.equals(this.c)) {
                --this.b;
            }
            else {
                this.m(0);
            }
            if (!this.E()) {
                this.m(0);
                if (this.D()) {
                    this.m(4);
                    this.p_();
                }
            }
        }
    }
    
    public boolean D() {
        if (alj.a(this)) {
            return true;
        }
        final List<uz> a = this.o.a((Class<? extends uz>)uz.class, this.aR().b(0.25, 0.0, 0.25), (Predicate<? super uz>)po.a);
        if (a.size() > 0) {
            alj.a(this, a.get(0));
        }
        return false;
    }
    
    @Override
    public void a(final ow \u2603) {
        super.a(\u2603);
        if (this.o.Q().b("doEntityDrops")) {
            this.a(zw.a(afi.cp), 1, 0.0f);
        }
    }
    
    @Override
    protected void b(final dn \u2603) {
        super.b(\u2603);
        \u2603.a("TransferCooldown", this.b);
    }
    
    @Override
    protected void a(final dn \u2603) {
        super.a(\u2603);
        this.b = \u2603.f("TransferCooldown");
    }
    
    public void m(final int \u2603) {
        this.b = \u2603;
    }
    
    public boolean E() {
        return this.b > 0;
    }
    
    @Override
    public String k() {
        return "minecraft:hopper";
    }
    
    @Override
    public xi a(final wm \u2603, final wn \u2603) {
        return new xw(\u2603, this, \u2603);
    }
}
