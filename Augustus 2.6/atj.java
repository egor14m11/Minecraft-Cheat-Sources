import java.io.File;

// 
// Decompiled by Procyon v0.5.36
// 

public class atj extends atm
{
    public atj(final File \u2603, final String \u2603, final boolean \u2603) {
        super(\u2603, \u2603, \u2603);
    }
    
    @Override
    public and a(final anm \u2603) {
        final File b = this.b();
        if (\u2603 instanceof ann) {
            final File file = new File(b, "DIM-1");
            file.mkdirs();
            return new anj(file);
        }
        if (\u2603 instanceof anp) {
            final File file = new File(b, "DIM1");
            file.mkdirs();
            return new anj(file);
        }
        return new anj(b);
    }
    
    @Override
    public void a(final ato \u2603, final dn \u2603) {
        \u2603.e(19133);
        super.a(\u2603, \u2603);
    }
    
    @Override
    public void a() {
        try {
            auc.a().b();
        }
        catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        ani.a();
    }
}
