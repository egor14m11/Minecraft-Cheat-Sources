import java.text.SimpleDateFormat;
import org.apache.logging.log4j.LogManager;
import java.util.Date;
import java.awt.image.RenderedImage;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import org.lwjgl.opengl.GL11;
import org.lwjgl.BufferUtils;
import java.io.File;
import java.nio.IntBuffer;
import java.text.DateFormat;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class avj
{
    private static final Logger a;
    private static final DateFormat b;
    private static IntBuffer c;
    private static int[] d;
    
    public static eu a(final File \u2603, final int \u2603, final int \u2603, final bfw \u2603) {
        return a(\u2603, null, \u2603, \u2603, \u2603);
    }
    
    public static eu a(final File \u2603, final String \u2603, int \u2603, int \u2603, final bfw \u2603) {
        try {
            final File file = new File(\u2603, "screenshots");
            file.mkdir();
            if (bqs.i()) {
                \u2603 = \u2603.a;
                \u2603 = \u2603.b;
            }
            final int size = \u2603 * \u2603;
            if (avj.c == null || avj.c.capacity() < size) {
                avj.c = BufferUtils.createIntBuffer(size);
                avj.d = new int[size];
            }
            GL11.glPixelStorei(3333, 1);
            GL11.glPixelStorei(3317, 1);
            avj.c.clear();
            if (bqs.i()) {
                bfl.i(\u2603.g);
                GL11.glGetTexImage(3553, 0, 32993, 33639, avj.c);
            }
            else {
                GL11.glReadPixels(0, 0, \u2603, \u2603, 32993, 33639, avj.c);
            }
            avj.c.get(avj.d);
            bml.a(avj.d, \u2603, \u2603);
            BufferedImage im = null;
            if (bqs.i()) {
                im = new BufferedImage(\u2603.c, \u2603.d, 1);
                int i;
                for (int n = i = \u2603.b - \u2603.d; i < \u2603.b; ++i) {
                    for (int j = 0; j < \u2603.c; ++j) {
                        im.setRGB(j, i - n, avj.d[i * \u2603.a + j]);
                    }
                }
            }
            else {
                im = new BufferedImage(\u2603, \u2603, 1);
                im.setRGB(0, 0, \u2603, \u2603, avj.d, 0, \u2603);
            }
            File a;
            if (\u2603 == null) {
                a = a(file);
            }
            else {
                a = new File(file, \u2603);
            }
            ImageIO.write(im, "png", a);
            final eu eu = new fa(a.getName());
            eu.b().a(new et(et.a.b, a.getAbsolutePath()));
            eu.b().d(true);
            return new fb("screenshot.success", new Object[] { eu });
        }
        catch (Exception throwable) {
            avj.a.warn("Couldn't save screenshot", throwable);
            return new fb("screenshot.failure", new Object[] { throwable.getMessage() });
        }
    }
    
    private static File a(final File \u2603) {
        final String string = avj.b.format(new Date()).toString();
        int i = 1;
        File file;
        while (true) {
            file = new File(\u2603, string + ((i == 1) ? "" : ("_" + i)) + ".png");
            if (!file.exists()) {
                break;
            }
            ++i;
        }
        return file;
    }
    
    static {
        a = LogManager.getLogger();
        b = new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss");
    }
}
