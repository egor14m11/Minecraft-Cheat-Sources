import java.util.Random;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class zi extends zw
{
    @Override
    public boolean f(final zx \u2603) {
        return true;
    }
    
    @Override
    public boolean f_(final zx \u2603) {
        return false;
    }
    
    @Override
    public aaj g(final zx \u2603) {
        if (this.h(\u2603).c() > 0) {
            return aaj.b;
        }
        return super.g(\u2603);
    }
    
    public du h(final zx \u2603) {
        final dn o = \u2603.o();
        if (o == null || !o.b("StoredEnchantments", 9)) {
            return new du();
        }
        return (du)o.a("StoredEnchantments");
    }
    
    @Override
    public void a(final zx \u2603, final wn \u2603, final List<String> \u2603, final boolean \u2603) {
        super.a(\u2603, \u2603, \u2603, \u2603);
        final du h = this.h(\u2603);
        if (h != null) {
            for (int i = 0; i < h.c(); ++i) {
                final int e = h.b(i).e("id");
                final int e2 = h.b(i).e("lvl");
                if (aci.c(e) != null) {
                    \u2603.add(aci.c(e).d(e2));
                }
            }
        }
    }
    
    public void a(final zx \u2603, final acl \u2603) {
        final du h = this.h(\u2603);
        boolean b = true;
        for (int i = 0; i < h.c(); ++i) {
            final dn b2 = h.b(i);
            if (b2.e("id") == \u2603.b.B) {
                if (b2.e("lvl") < \u2603.c) {
                    b2.a("lvl", (short)\u2603.c);
                }
                b = false;
                break;
            }
        }
        if (b) {
            final dn \u26032 = new dn();
            \u26032.a("id", (short)\u2603.b.B);
            \u26032.a("lvl", (short)\u2603.c);
            h.a(\u26032);
        }
        if (!\u2603.n()) {
            \u2603.d(new dn());
        }
        \u2603.o().a("StoredEnchantments", h);
    }
    
    public zx a(final acl \u2603) {
        final zx \u26032 = new zx(this);
        this.a(\u26032, \u2603);
        return \u26032;
    }
    
    public void a(final aci \u2603, final List<zx> \u2603) {
        for (int i = \u2603.e(); i <= \u2603.b(); ++i) {
            \u2603.add(this.a(new acl(\u2603, i)));
        }
    }
    
    public ob b(final Random \u2603) {
        return this.a(\u2603, 1, 1, 1);
    }
    
    public ob a(final Random \u2603, final int \u2603, final int \u2603, final int \u2603) {
        final zx zx = new zx(zy.aL, 1, 0);
        ack.a(\u2603, zx, 30);
        return new ob(zx, \u2603, \u2603, \u2603);
    }
}
