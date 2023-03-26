// 
// Decompiled by Procyon v0.5.36
// 

public class bgd implements bnj
{
    private bgc a;
    private final avh b;
    private final bgf c;
    private final bgb d;
    private final bge e;
    
    public bgd(final bgc \u2603, final avh \u2603) {
        this.c = new bgf();
        this.d = new bgb();
        this.e = new bge();
        this.a = \u2603;
        this.b = \u2603;
    }
    
    public bgc a() {
        return this.a;
    }
    
    public void a(alz \u2603, final cj \u2603, final bmi \u2603, final adq \u2603) {
        final afh c = \u2603.c();
        final int b = c.b();
        if (b != 3) {
            return;
        }
        \u2603 = c.a(\u2603, \u2603, \u2603);
        final boq b2 = this.a.b(\u2603);
        final boq b3 = new bow.a(b2, \u2603).b();
        this.c.a(\u2603, b3, \u2603, \u2603, bfx.a().c());
    }
    
    public boolean a(final alz \u2603, final cj \u2603, final adq \u2603, final bfd \u2603) {
        try {
            final int b = \u2603.c().b();
            if (b == -1) {
                return false;
            }
            switch (b) {
                case 3: {
                    final boq a = this.a(\u2603, \u2603, \u2603);
                    return this.c.a(\u2603, a, \u2603, \u2603, \u2603);
                }
                case 2: {
                    return false;
                }
                case 1: {
                    return this.e.a(\u2603, \u2603, \u2603, \u2603);
                }
            }
        }
        catch (Throwable \u26032) {
            final b a2 = b.a(\u26032, "Tesselating block in world");
            final c a3 = a2.a("Block being tesselated");
            c.a(a3, \u2603, \u2603.c(), \u2603.c().c(\u2603));
            throw new e(a2);
        }
        return false;
    }
    
    public bgf b() {
        return this.c;
    }
    
    private boq a(final alz \u2603, final cj \u2603) {
        boq boq = this.a.b(\u2603);
        if (\u2603 != null && this.b.v && boq instanceof box) {
            boq = ((box)boq).a(ns.a(\u2603));
        }
        return boq;
    }
    
    public boq a(alz \u2603, final adq \u2603, final cj \u2603) {
        final afh c = \u2603.c();
        if (\u2603.G() != adr.g) {
            try {
                \u2603 = c.a(\u2603, \u2603, \u2603);
            }
            catch (Exception ex) {}
        }
        boq boq = this.a.b(\u2603);
        if (\u2603 != null && this.b.v && boq instanceof box) {
            boq = ((box)boq).a(ns.a(\u2603));
        }
        return boq;
    }
    
    public void a(final alz \u2603, final float \u2603) {
        final int b = \u2603.c().b();
        if (b == -1) {
            return;
        }
        switch (b) {
            case 3: {
                final boq a = this.a(\u2603, null);
                this.c.a(a, \u2603, \u2603, true);
                break;
            }
            case 2: {
                this.d.a(\u2603.c(), \u2603);
                break;
            }
        }
    }
    
    public boolean a(final afh \u2603, final int \u2603) {
        if (\u2603 == null) {
            return false;
        }
        final int b = \u2603.b();
        return b != 3 && b == 2;
    }
    
    @Override
    public void a(final bni \u2603) {
        this.e.a();
    }
}
