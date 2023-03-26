import java.util.Iterator;
import org.lwjgl.opengl.GL11;

// 
// Decompiled by Procyon v0.5.36
// 

public class bft extends bfh
{
    @Override
    public void a(final adf \u2603) {
        if (!this.b) {
            return;
        }
        for (final bht \u26032 : this.a) {
            final bhs bhs = (bhs)\u26032;
            bfl.E();
            this.a(\u26032);
            GL11.glCallList(bhs.a(\u2603, bhs.g()));
            bfl.F();
        }
        bfl.G();
        this.a.clear();
    }
}
