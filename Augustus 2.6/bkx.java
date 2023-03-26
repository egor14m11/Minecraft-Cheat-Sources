// 
// Decompiled by Procyon v0.5.36
// 

public class bkx extends bkn<bbj>
{
    public bkx(final bjl<?> \u2603) {
        super(\u2603);
    }
    
    @Override
    protected void a() {
        this.c = (T)new bbj(0.5f);
        this.d = (T)new bbj(1.0f);
    }
    
    @Override
    protected void a(final bbj \u2603, final int \u2603) {
        this.a(\u2603);
        switch (\u2603) {
            case 4: {
                \u2603.e.j = true;
                \u2603.f.j = true;
                break;
            }
            case 3: {
                \u2603.g.j = true;
                \u2603.h.j = true;
                \u2603.i.j = true;
                break;
            }
            case 2: {
                \u2603.g.j = true;
                \u2603.j.j = true;
                \u2603.k.j = true;
                break;
            }
            case 1: {
                \u2603.j.j = true;
                \u2603.k.j = true;
                break;
            }
        }
    }
    
    protected void a(final bbj \u2603) {
        \u2603.a(false);
    }
}
