// 
// Decompiled by Procyon v0.5.36
// 

public class bhf extends bhd<ale>
{
    private static final jy c;
    private bay d;
    
    public bhf() {
        this.d = new bay();
    }
    
    @Override
    public void a(final ale \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603, final int \u2603) {
        bfl.E();
        bfl.b((float)\u2603 + 0.5f, (float)\u2603 + 0.75f, (float)\u2603 + 0.5f);
        final float \u26032 = \u2603.a + \u2603;
        bfl.b(0.0f, 0.1f + ns.a(\u26032 * 0.1f) * 0.01f, 0.0f);
        float n;
        for (n = \u2603.l - \u2603.m; n >= 3.1415927f; n -= 6.2831855f) {}
        while (n < -3.1415927f) {
            n += 6.2831855f;
        }
        final float n2 = \u2603.m + n * \u2603;
        bfl.b(-n2 * 180.0f / 3.1415927f, 0.0f, 1.0f, 0.0f);
        bfl.b(80.0f, 0.0f, 0.0f, 1.0f);
        this.a(bhf.c);
        float \u26033 = \u2603.g + (\u2603.f - \u2603.g) * \u2603 + 0.25f;
        float \u26034 = \u2603.g + (\u2603.f - \u2603.g) * \u2603 + 0.75f;
        \u26033 = (\u26033 - ns.b((double)\u26033)) * 1.6f - 0.3f;
        \u26034 = (\u26034 - ns.b((double)\u26034)) * 1.6f - 0.3f;
        if (\u26033 < 0.0f) {
            \u26033 = 0.0f;
        }
        if (\u26034 < 0.0f) {
            \u26034 = 0.0f;
        }
        if (\u26033 > 1.0f) {
            \u26033 = 1.0f;
        }
        if (\u26034 > 1.0f) {
            \u26034 = 1.0f;
        }
        final float \u26035 = \u2603.k + (\u2603.j - \u2603.k) * \u2603;
        bfl.o();
        this.d.a(null, \u26032, \u26033, \u26034, \u26035, 0.0f, 0.0625f);
        bfl.F();
    }
    
    static {
        c = new jy("textures/entity/enchanting_table_book.png");
    }
}
