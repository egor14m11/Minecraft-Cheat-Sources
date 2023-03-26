// 
// Decompiled by Procyon v0.5.36
// 

public class yd extends oq
{
    private alf a;
    
    public yd() {
        super("container.enderchest", false, 27);
    }
    
    public void a(final alf \u2603) {
        this.a = \u2603;
    }
    
    public void a(final du \u2603) {
        for (int i = 0; i < this.o_(); ++i) {
            this.a(i, null);
        }
        for (int i = 0; i < \u2603.c(); ++i) {
            final dn b = \u2603.b(i);
            final int \u26032 = b.d("Slot") & 0xFF;
            if (\u26032 >= 0 && \u26032 < this.o_()) {
                this.a(\u26032, zx.a(b));
            }
        }
    }
    
    public du h() {
        final du du = new du();
        for (int i = 0; i < this.o_(); ++i) {
            final zx a = this.a(i);
            if (a != null) {
                final dn dn = new dn();
                dn.a("Slot", (byte)i);
                a.b(dn);
                du.a(dn);
            }
        }
        return du;
    }
    
    @Override
    public boolean a(final wn \u2603) {
        return (this.a == null || this.a.a(\u2603)) && super.a(\u2603);
    }
    
    @Override
    public void b(final wn \u2603) {
        if (this.a != null) {
            this.a.b();
        }
        super.b(\u2603);
    }
    
    @Override
    public void c(final wn \u2603) {
        if (this.a != null) {
            this.a.d();
        }
        super.c(\u2603);
        this.a = null;
    }
}
