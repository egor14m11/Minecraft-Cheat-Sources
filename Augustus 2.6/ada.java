import java.io.IOException;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.5.36
// 

public class ada extends ArrayList<acz>
{
    public ada() {
    }
    
    public ada(final dn \u2603) {
        this.a(\u2603);
    }
    
    public acz a(final zx \u2603, final zx \u2603, final int \u2603) {
        if (\u2603 <= 0 || \u2603 >= this.size()) {
            for (int i = 0; i < this.size(); ++i) {
                final acz acz = this.get(i);
                if (this.a(\u2603, acz.a()) && \u2603.b >= acz.a().b && ((!acz.c() && \u2603 == null) || (acz.c() && this.a(\u2603, acz.b()) && \u2603.b >= acz.b().b))) {
                    return acz;
                }
            }
            return null;
        }
        final acz acz2 = this.get(\u2603);
        if (this.a(\u2603, acz2.a()) && ((\u2603 == null && !acz2.c()) || (acz2.c() && this.a(\u2603, acz2.b()))) && \u2603.b >= acz2.a().b && (!acz2.c() || \u2603.b >= acz2.b().b)) {
            return acz2;
        }
        return null;
    }
    
    private boolean a(final zx \u2603, final zx \u2603) {
        return zx.c(\u2603, \u2603) && (!\u2603.n() || (\u2603.n() && dy.a(\u2603.o(), \u2603.o(), false)));
    }
    
    public void a(final em \u2603) {
        \u2603.writeByte((byte)(this.size() & 0xFF));
        for (int i = 0; i < this.size(); ++i) {
            final acz acz = this.get(i);
            \u2603.a(acz.a());
            \u2603.a(acz.d());
            final zx b = acz.b();
            \u2603.writeBoolean(b != null);
            if (b != null) {
                \u2603.a(b);
            }
            \u2603.writeBoolean(acz.h());
            \u2603.writeInt(acz.e());
            \u2603.writeInt(acz.f());
        }
    }
    
    public static ada b(final em \u2603) throws IOException {
        final ada ada = new ada();
        for (int n = \u2603.readByte() & 0xFF, i = 0; i < n; ++i) {
            final zx j = \u2603.i();
            final zx k = \u2603.i();
            zx l = null;
            if (\u2603.readBoolean()) {
                l = \u2603.i();
            }
            final boolean boolean1 = \u2603.readBoolean();
            final int int1 = \u2603.readInt();
            final int int2 = \u2603.readInt();
            final acz e = new acz(j, l, k, int1, int2);
            if (boolean1) {
                e.i();
            }
            ada.add(e);
        }
        return ada;
    }
    
    public void a(final dn \u2603) {
        final du c = \u2603.c("Recipes", 10);
        for (int i = 0; i < c.c(); ++i) {
            final dn b = c.b(i);
            this.add(new acz(b));
        }
    }
    
    public dn a() {
        final dn dn = new dn();
        final du \u2603 = new du();
        for (int i = 0; i < this.size(); ++i) {
            final acz acz = this.get(i);
            \u2603.a(acz.k());
        }
        dn.a("Recipes", \u2603);
        return dn;
    }
}
