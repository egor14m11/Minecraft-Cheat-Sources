import com.google.common.collect.Multimap;

// 
// Decompiled by Procyon v0.5.36
// 

public class aay extends zw
{
    private float a;
    private final a b;
    
    public aay(final a \u2603) {
        this.b = \u2603;
        this.h = 1;
        this.d(\u2603.a());
        this.a(yz.j);
        this.a = 4.0f + \u2603.c();
    }
    
    public float g() {
        return this.b.c();
    }
    
    @Override
    public float a(final zx \u2603, final afh \u2603) {
        if (\u2603 == afi.G) {
            return 15.0f;
        }
        final arm t = \u2603.t();
        if (t == arm.k || t == arm.l || t == arm.v || t == arm.j || t == arm.C) {
            return 1.5f;
        }
        return 1.0f;
    }
    
    @Override
    public boolean a(final zx \u2603, final pr \u2603, final pr \u2603) {
        \u2603.a(1, \u2603);
        return true;
    }
    
    @Override
    public boolean a(final zx \u2603, final adm \u2603, final afh \u2603, final cj \u2603, final pr \u2603) {
        if (\u2603.g(\u2603, \u2603) != 0.0) {
            \u2603.a(2, \u2603);
        }
        return true;
    }
    
    @Override
    public boolean w_() {
        return true;
    }
    
    @Override
    public aba e(final zx \u2603) {
        return aba.d;
    }
    
    @Override
    public int d(final zx \u2603) {
        return 72000;
    }
    
    @Override
    public zx a(final zx \u2603, final adm \u2603, final wn \u2603) {
        \u2603.a(\u2603, this.d(\u2603));
        return \u2603;
    }
    
    @Override
    public boolean b(final afh \u2603) {
        return \u2603 == afi.G;
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
        i.put(vy.e.a(), new qd(aay.f, "Weapon modifier", this.a, 0));
        return i;
    }
}
