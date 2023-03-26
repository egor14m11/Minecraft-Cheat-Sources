import java.util.List;
import org.lwjgl.opengl.GL11;

// 
// Decompiled by Procyon v0.5.36
// 

public class bhj extends bhd<aln>
{
    private static final jy c;
    private final bbx d;
    
    public bhj() {
        this.d = new bbx();
    }
    
    @Override
    public void a(final aln \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603, final int \u2603) {
        final afh w = \u2603.w();
        bfl.E();
        final float \u26032 = 0.6666667f;
        if (w == afi.an) {
            bfl.b((float)\u2603 + 0.5f, (float)\u2603 + 0.75f * \u26032, (float)\u2603 + 0.5f);
            final float n = \u2603.u() * 360 / 16.0f;
            bfl.b(-n, 0.0f, 1.0f, 0.0f);
            this.d.b.j = true;
        }
        else {
            final int u = \u2603.u();
            float n2 = 0.0f;
            if (u == 2) {
                n2 = 180.0f;
            }
            if (u == 4) {
                n2 = 90.0f;
            }
            if (u == 5) {
                n2 = -90.0f;
            }
            bfl.b((float)\u2603 + 0.5f, (float)\u2603 + 0.75f * \u26032, (float)\u2603 + 0.5f);
            bfl.b(-n2, 0.0f, 1.0f, 0.0f);
            bfl.b(0.0f, -0.3125f, -0.4375f);
            this.d.b.j = false;
        }
        if (\u2603 >= 0) {
            this.a(bhj.a[\u2603]);
            bfl.n(5890);
            bfl.E();
            bfl.a(4.0f, 2.0f, 1.0f);
            bfl.b(0.0625f, 0.0625f, 0.0625f);
            bfl.n(5888);
        }
        else {
            this.a(bhj.c);
        }
        bfl.B();
        bfl.E();
        bfl.a(\u26032, -\u26032, -\u26032);
        this.d.a();
        bfl.F();
        final avn c = this.c();
        float n2 = 0.015625f * \u26032;
        bfl.b(0.0f, 0.5f * \u26032, 0.07f * \u26032);
        bfl.a(n2, -n2, n2);
        GL11.glNormal3f(0.0f, 0.0f, -1.0f * n2);
        bfl.a(false);
        final int n3 = 0;
        if (\u2603 < 0) {
            for (int i = 0; i < \u2603.a.length; ++i) {
                if (\u2603.a[i] != null) {
                    final eu \u26033 = \u2603.a[i];
                    final List<eu> a = avu.a(\u26033, 90, c, false, true);
                    String string = (a != null && a.size() > 0) ? a.get(0).d() : "";
                    if (i == \u2603.f) {
                        string = "> " + string + " <";
                        c.a(string, -c.a(string) / 2, i * 10 - \u2603.a.length * 5, n3);
                    }
                    else {
                        c.a(string, -c.a(string) / 2, i * 10 - \u2603.a.length * 5, n3);
                    }
                }
            }
        }
        bfl.a(true);
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        bfl.F();
        if (\u2603 >= 0) {
            bfl.n(5890);
            bfl.F();
            bfl.n(5888);
        }
    }
    
    static {
        c = new jy("textures/entity/sign.png");
    }
}
