// 
// Decompiled by Procyon v0.5.36
// 

public class azi implements awd.a
{
    private final ave a;
    
    public azi() {
        this.a = ave.A();
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final boolean \u2603) {
        final int \u26032 = \u2603 + \u2603 / 2 - this.a.k.a / 2;
        this.a.k.a(bnq.a("lanServer.scanning", new Object[0]), this.a.m.l / 2 - this.a.k.a(bnq.a("lanServer.scanning", new Object[0])) / 2, \u26032, 16777215);
        String s = null;
        switch ((int)(ave.J() / 300L % 4L)) {
            default: {
                s = "O o o";
                break;
            }
            case 1:
            case 3: {
                s = "o O o";
                break;
            }
            case 2: {
                s = "o o O";
                break;
            }
        }
        this.a.k.a(s, this.a.m.l / 2 - this.a.k.a(s) / 2, \u26032 + this.a.k.a, 8421504);
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final int \u2603) {
    }
    
    @Override
    public boolean a(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        return false;
    }
    
    @Override
    public void b(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
    }
}
