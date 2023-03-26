import java.util.List;
import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL11;

// 
// Decompiled by Procyon v0.5.36
// 

public class bfe
{
    public void a(final bfd \u2603) {
        if (\u2603.h() > 0) {
            final bmu g = \u2603.g();
            final int g2 = g.g();
            final ByteBuffer f = \u2603.f();
            final List<bmv> h = g.h();
            for (int i = 0; i < h.size(); ++i) {
                final bmv bmv = h.get(i);
                final bmv.b b = bmv.b();
                final int c = bmv.a().c();
                final int n = bmv.d();
                f.position(g.d(i));
                switch (bfe$1.a[b.ordinal()]) {
                    case 1: {
                        GL11.glVertexPointer(bmv.c(), c, g2, f);
                        GL11.glEnableClientState(32884);
                        break;
                    }
                    case 2: {
                        bqs.l(bqs.q + n);
                        GL11.glTexCoordPointer(bmv.c(), c, g2, f);
                        GL11.glEnableClientState(32888);
                        bqs.l(bqs.q);
                        break;
                    }
                    case 3: {
                        GL11.glColorPointer(bmv.c(), c, g2, f);
                        GL11.glEnableClientState(32886);
                        break;
                    }
                    case 4: {
                        GL11.glNormalPointer(c, g2, f);
                        GL11.glEnableClientState(32885);
                        break;
                    }
                }
            }
            GL11.glDrawArrays(\u2603.i(), 0, \u2603.h());
            for (int i = 0, size = h.size(); i < size; ++i) {
                final bmv bmv2 = h.get(i);
                final bmv.b b2 = bmv2.b();
                final int n = bmv2.d();
                switch (bfe$1.a[b2.ordinal()]) {
                    case 1: {
                        GL11.glDisableClientState(32884);
                        break;
                    }
                    case 2: {
                        bqs.l(bqs.q + n);
                        GL11.glDisableClientState(32888);
                        bqs.l(bqs.q);
                        break;
                    }
                    case 3: {
                        GL11.glDisableClientState(32886);
                        bfl.G();
                        break;
                    }
                    case 4: {
                        GL11.glDisableClientState(32885);
                        break;
                    }
                }
            }
        }
        \u2603.b();
    }
}
