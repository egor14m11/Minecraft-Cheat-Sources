import java.util.List;
import org.lwjgl.opengl.GL11;

// 
// Decompiled by Procyon v0.5.36
// 

public class bhb extends bhd<akv>
{
    private static final jy c;
    
    @Override
    public void a(final akv \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603, final int \u2603) {
        final float o = \u2603.o();
        bfl.a(516, 0.1f);
        if (o > 0.0f) {
            final bfx a = bfx.a();
            final bfd c = a.c();
            bfl.n();
            final List<akv.a> n = \u2603.n();
            int n2 = 0;
            for (int i = 0; i < n.size(); ++i) {
                final akv.a a2 = n.get(i);
                final int n3 = n2 + a2.c();
                this.a(bhb.c);
                GL11.glTexParameterf(3553, 10242, 10497.0f);
                GL11.glTexParameterf(3553, 10243, 10497.0f);
                bfl.f();
                bfl.p();
                bfl.k();
                bfl.a(true);
                bfl.a(770, 1, 1, 0);
                final double n4 = \u2603.z().K() + (double)\u2603;
                final double h = ns.h(-n4 * 0.2 - ns.c(-n4 * 0.1));
                final float n5 = a2.b()[0];
                final float n6 = a2.b()[1];
                final float n7 = a2.b()[2];
                double n8 = n4 * 0.025 * -1.5;
                double n9 = 0.2;
                double n10 = 0.5 + Math.cos(n8 + 2.356194490192345) * 0.2;
                double n11 = 0.5 + Math.sin(n8 + 2.356194490192345) * 0.2;
                double n12 = 0.5 + Math.cos(n8 + 0.7853981633974483) * 0.2;
                double n13 = 0.5 + Math.sin(n8 + 0.7853981633974483) * 0.2;
                double n14 = 0.5 + Math.cos(n8 + 3.9269908169872414) * 0.2;
                double n15 = 0.5 + Math.sin(n8 + 3.9269908169872414) * 0.2;
                double n16 = 0.5 + Math.cos(n8 + 5.497787143782138) * 0.2;
                double n17 = 0.5 + Math.sin(n8 + 5.497787143782138) * 0.2;
                double n18 = 0.0;
                double n19 = 1.0;
                final double n20 = -1.0 + h;
                final double n21 = a2.c() * o * 2.5 + n20;
                c.a(7, bms.i);
                c.b(\u2603 + n10, \u2603 + n3, \u2603 + n11).a(1.0, n21).a(n5, n6, n7, 1.0f).d();
                c.b(\u2603 + n10, \u2603 + n2, \u2603 + n11).a(1.0, n20).a(n5, n6, n7, 1.0f).d();
                c.b(\u2603 + n12, \u2603 + n2, \u2603 + n13).a(0.0, n20).a(n5, n6, n7, 1.0f).d();
                c.b(\u2603 + n12, \u2603 + n3, \u2603 + n13).a(0.0, n21).a(n5, n6, n7, 1.0f).d();
                c.b(\u2603 + n16, \u2603 + n3, \u2603 + n17).a(1.0, n21).a(n5, n6, n7, 1.0f).d();
                c.b(\u2603 + n16, \u2603 + n2, \u2603 + n17).a(1.0, n20).a(n5, n6, n7, 1.0f).d();
                c.b(\u2603 + n14, \u2603 + n2, \u2603 + n15).a(0.0, n20).a(n5, n6, n7, 1.0f).d();
                c.b(\u2603 + n14, \u2603 + n3, \u2603 + n15).a(0.0, n21).a(n5, n6, n7, 1.0f).d();
                c.b(\u2603 + n12, \u2603 + n3, \u2603 + n13).a(1.0, n21).a(n5, n6, n7, 1.0f).d();
                c.b(\u2603 + n12, \u2603 + n2, \u2603 + n13).a(1.0, n20).a(n5, n6, n7, 1.0f).d();
                c.b(\u2603 + n16, \u2603 + n2, \u2603 + n17).a(0.0, n20).a(n5, n6, n7, 1.0f).d();
                c.b(\u2603 + n16, \u2603 + n3, \u2603 + n17).a(0.0, n21).a(n5, n6, n7, 1.0f).d();
                c.b(\u2603 + n14, \u2603 + n3, \u2603 + n15).a(1.0, n21).a(n5, n6, n7, 1.0f).d();
                c.b(\u2603 + n14, \u2603 + n2, \u2603 + n15).a(1.0, n20).a(n5, n6, n7, 1.0f).d();
                c.b(\u2603 + n10, \u2603 + n2, \u2603 + n11).a(0.0, n20).a(n5, n6, n7, 1.0f).d();
                c.b(\u2603 + n10, \u2603 + n3, \u2603 + n11).a(0.0, n21).a(n5, n6, n7, 1.0f).d();
                a.b();
                bfl.l();
                bfl.a(770, 771, 1, 0);
                bfl.a(false);
                n8 = 0.2;
                n9 = 0.2;
                n10 = 0.8;
                n11 = 0.2;
                n12 = 0.2;
                n13 = 0.8;
                n14 = 0.8;
                n15 = 0.8;
                n16 = 0.0;
                n17 = 1.0;
                n18 = -1.0 + h;
                n19 = a2.c() * o + n18;
                c.a(7, bms.i);
                c.b(\u2603 + 0.2, \u2603 + n3, \u2603 + 0.2).a(1.0, n19).a(n5, n6, n7, 0.125f).d();
                c.b(\u2603 + 0.2, \u2603 + n2, \u2603 + 0.2).a(1.0, n18).a(n5, n6, n7, 0.125f).d();
                c.b(\u2603 + 0.8, \u2603 + n2, \u2603 + 0.2).a(0.0, n18).a(n5, n6, n7, 0.125f).d();
                c.b(\u2603 + 0.8, \u2603 + n3, \u2603 + 0.2).a(0.0, n19).a(n5, n6, n7, 0.125f).d();
                c.b(\u2603 + 0.8, \u2603 + n3, \u2603 + 0.8).a(1.0, n19).a(n5, n6, n7, 0.125f).d();
                c.b(\u2603 + 0.8, \u2603 + n2, \u2603 + 0.8).a(1.0, n18).a(n5, n6, n7, 0.125f).d();
                c.b(\u2603 + 0.2, \u2603 + n2, \u2603 + 0.8).a(0.0, n18).a(n5, n6, n7, 0.125f).d();
                c.b(\u2603 + 0.2, \u2603 + n3, \u2603 + 0.8).a(0.0, n19).a(n5, n6, n7, 0.125f).d();
                c.b(\u2603 + 0.8, \u2603 + n3, \u2603 + 0.2).a(1.0, n19).a(n5, n6, n7, 0.125f).d();
                c.b(\u2603 + 0.8, \u2603 + n2, \u2603 + 0.2).a(1.0, n18).a(n5, n6, n7, 0.125f).d();
                c.b(\u2603 + 0.8, \u2603 + n2, \u2603 + 0.8).a(0.0, n18).a(n5, n6, n7, 0.125f).d();
                c.b(\u2603 + 0.8, \u2603 + n3, \u2603 + 0.8).a(0.0, n19).a(n5, n6, n7, 0.125f).d();
                c.b(\u2603 + 0.2, \u2603 + n3, \u2603 + 0.8).a(1.0, n19).a(n5, n6, n7, 0.125f).d();
                c.b(\u2603 + 0.2, \u2603 + n2, \u2603 + 0.8).a(1.0, n18).a(n5, n6, n7, 0.125f).d();
                c.b(\u2603 + 0.2, \u2603 + n2, \u2603 + 0.2).a(0.0, n18).a(n5, n6, n7, 0.125f).d();
                c.b(\u2603 + 0.2, \u2603 + n3, \u2603 + 0.2).a(0.0, n19).a(n5, n6, n7, 0.125f).d();
                a.b();
                bfl.e();
                bfl.w();
                bfl.a(true);
                n2 = n3;
            }
            bfl.m();
        }
    }
    
    @Override
    public boolean a() {
        return true;
    }
    
    static {
        c = new jy("textures/entity/beacon_beam.png");
    }
}
