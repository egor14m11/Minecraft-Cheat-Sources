import org.lwjgl.opengl.GL11;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.5.36
// 

public class bfy extends bfh
{
    @Override
    public void a(final adf \u2603) {
        if (!this.b) {
            return;
        }
        for (final bht \u26032 : this.a) {
            final bmt b = \u26032.b(\u2603.ordinal());
            bfl.E();
            this.a(\u26032);
            \u26032.f();
            b.a();
            this.a();
            b.a(7);
            bfl.F();
        }
        bqs.g(bqs.R, 0);
        bfl.G();
        this.a.clear();
    }
    
    private void a() {
        GL11.glVertexPointer(3, 5126, 28, 0L);
        GL11.glColorPointer(4, 5121, 28, 12L);
        GL11.glTexCoordPointer(2, 5126, 28, 16L);
        bqs.l(bqs.r);
        GL11.glTexCoordPointer(2, 5122, 28, 24L);
        bqs.l(bqs.q);
    }
}
