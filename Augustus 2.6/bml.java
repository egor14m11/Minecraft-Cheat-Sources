import org.apache.logging.log4j.LogManager;
import org.apache.commons.io.IOUtils;
import javax.imageio.ImageIO;
import java.io.InputStream;
import java.io.IOException;
import org.lwjgl.opengl.GL11;
import java.awt.image.BufferedImage;
import java.nio.IntBuffer;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class bml
{
    private static final Logger c;
    private static final IntBuffer d;
    public static final blz a;
    public static final int[] b;
    private static final int[] e;
    
    public static int a() {
        return bfl.y();
    }
    
    public static void a(final int \u2603) {
        bfl.h(\u2603);
    }
    
    public static int a(final int \u2603, final BufferedImage \u2603) {
        return a(\u2603, \u2603, false, false);
    }
    
    public static void a(final int \u2603, final int[] \u2603, final int \u2603, final int \u2603) {
        b(\u2603);
        a(0, \u2603, \u2603, \u2603, 0, 0, false, false, false);
    }
    
    public static int[][] a(final int \u2603, final int \u2603, final int[][] \u2603) {
        final int[][] array = new int[\u2603 + 1][];
        array[0] = \u2603[0];
        if (\u2603 > 0) {
            boolean \u26032 = false;
            for (int i = 0; i < \u2603.length; ++i) {
                if (\u2603[0][i] >> 24 == 0) {
                    \u26032 = true;
                    break;
                }
            }
            for (int i = 1; i <= \u2603; ++i) {
                if (\u2603[i] != null) {
                    array[i] = \u2603[i];
                }
                else {
                    final int[] array2 = array[i - 1];
                    final int[] array3 = new int[array2.length >> 2];
                    final int n = \u2603 >> i;
                    final int n2 = array3.length / n;
                    final int n3 = n << 1;
                    for (int j = 0; j < n; ++j) {
                        for (int k = 0; k < n2; ++k) {
                            final int n4 = 2 * (j + k * n3);
                            array3[j + k * n] = a(array2[n4 + 0], array2[n4 + 1], array2[n4 + 0 + n3], array2[n4 + 1 + n3], \u26032);
                        }
                    }
                    array[i] = array3;
                }
            }
        }
        return array;
    }
    
    private static int a(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final boolean \u2603) {
        if (!\u2603) {
            final int a = a(\u2603, \u2603, \u2603, \u2603, 24);
            final int a2 = a(\u2603, \u2603, \u2603, \u2603, 16);
            final int a3 = a(\u2603, \u2603, \u2603, \u2603, 8);
            final int a4 = a(\u2603, \u2603, \u2603, \u2603, 0);
            return a << 24 | a2 << 16 | a3 << 8 | a4;
        }
        bml.e[0] = \u2603;
        bml.e[1] = \u2603;
        bml.e[2] = \u2603;
        bml.e[3] = \u2603;
        float n = 0.0f;
        float n2 = 0.0f;
        float n3 = 0.0f;
        float n4 = 0.0f;
        for (int i = 0; i < 4; ++i) {
            if (bml.e[i] >> 24 != 0) {
                n += (float)Math.pow((bml.e[i] >> 24 & 0xFF) / 255.0f, 2.2);
                n2 += (float)Math.pow((bml.e[i] >> 16 & 0xFF) / 255.0f, 2.2);
                n3 += (float)Math.pow((bml.e[i] >> 8 & 0xFF) / 255.0f, 2.2);
                n4 += (float)Math.pow((bml.e[i] >> 0 & 0xFF) / 255.0f, 2.2);
            }
        }
        n /= 4.0f;
        n2 /= 4.0f;
        n3 /= 4.0f;
        n4 /= 4.0f;
        int i = (int)(Math.pow(n, 0.45454545454545453) * 255.0);
        final int n5 = (int)(Math.pow(n2, 0.45454545454545453) * 255.0);
        final int n6 = (int)(Math.pow(n3, 0.45454545454545453) * 255.0);
        final int n7 = (int)(Math.pow(n4, 0.45454545454545453) * 255.0);
        if (i < 96) {
            i = 0;
        }
        return i << 24 | n5 << 16 | n6 << 8 | n7;
    }
    
    private static int a(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        final float n = (float)Math.pow((\u2603 >> \u2603 & 0xFF) / 255.0f, 2.2);
        final float n2 = (float)Math.pow((\u2603 >> \u2603 & 0xFF) / 255.0f, 2.2);
        final float n3 = (float)Math.pow((\u2603 >> \u2603 & 0xFF) / 255.0f, 2.2);
        final float n4 = (float)Math.pow((\u2603 >> \u2603 & 0xFF) / 255.0f, 2.2);
        final float n5 = (float)Math.pow((n + n2 + n3 + n4) * 0.25, 0.45454545454545453);
        return (int)(n5 * 255.0);
    }
    
    public static void a(final int[][] \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final boolean \u2603, final boolean \u2603) {
        for (int i = 0; i < \u2603.length; ++i) {
            final int[] \u26032 = \u2603[i];
            a(i, \u26032, \u2603 >> i, \u2603 >> i, \u2603 >> i, \u2603 >> i, \u2603, \u2603, \u2603.length > 1);
        }
    }
    
    private static void a(final int \u2603, final int[] \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final boolean \u2603, final boolean \u2603, final boolean \u2603) {
        final int a = 4194304 / \u2603;
        a(\u2603, \u2603);
        a(\u2603);
        int min;
        for (int i = 0; i < \u2603 * \u2603; i += \u2603 * min) {
            final int n = i / \u2603;
            min = Math.min(a, \u2603 - n);
            final int \u26032 = \u2603 * min;
            b(\u2603, i, \u26032);
            GL11.glTexSubImage2D(3553, \u2603, \u2603, \u2603 + n, \u2603, min, 32993, 33639, bml.d);
        }
    }
    
    public static int a(final int \u2603, final BufferedImage \u2603, final boolean \u2603, final boolean \u2603) {
        a(\u2603, \u2603.getWidth(), \u2603.getHeight());
        return a(\u2603, \u2603, 0, 0, \u2603, \u2603);
    }
    
    public static void a(final int \u2603, final int \u2603, final int \u2603) {
        a(\u2603, 0, \u2603, \u2603);
    }
    
    public static void a(final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        a(\u2603);
        b(\u2603);
        if (\u2603 >= 0) {
            GL11.glTexParameteri(3553, 33085, \u2603);
            GL11.glTexParameterf(3553, 33082, 0.0f);
            GL11.glTexParameterf(3553, 33083, (float)\u2603);
            GL11.glTexParameterf(3553, 34049, 0.0f);
        }
        for (int i = 0; i <= \u2603; ++i) {
            GL11.glTexImage2D(3553, i, 6408, \u2603 >> i, \u2603 >> i, 0, 32993, 33639, (IntBuffer)null);
        }
    }
    
    public static int a(final int \u2603, final BufferedImage \u2603, final int \u2603, final int \u2603, final boolean \u2603, final boolean \u2603) {
        b(\u2603);
        a(\u2603, \u2603, \u2603, \u2603, \u2603);
        return \u2603;
    }
    
    private static void a(final BufferedImage \u2603, final int \u2603, final int \u2603, final boolean \u2603, final boolean \u2603) {
        final int width = \u2603.getWidth();
        final int height = \u2603.getHeight();
        final int a = 4194304 / width;
        final int[] array = new int[a * width];
        b(\u2603);
        a(\u2603);
        for (int i = 0; i < width * height; i += width * a) {
            final int startY = i / width;
            final int min = Math.min(a, height - startY);
            final int \u26032 = width * min;
            \u2603.getRGB(0, startY, width, min, array, 0, width);
            a(array, \u26032);
            GL11.glTexSubImage2D(3553, 0, \u2603, \u2603 + startY, width, min, 32993, 33639, bml.d);
        }
    }
    
    private static void a(final boolean \u2603) {
        if (\u2603) {
            GL11.glTexParameteri(3553, 10242, 10496);
            GL11.glTexParameteri(3553, 10243, 10496);
        }
        else {
            GL11.glTexParameteri(3553, 10242, 10497);
            GL11.glTexParameteri(3553, 10243, 10497);
        }
    }
    
    private static void b(final boolean \u2603) {
        a(\u2603, false);
    }
    
    private static void a(final boolean \u2603, final boolean \u2603) {
        if (\u2603) {
            GL11.glTexParameteri(3553, 10241, \u2603 ? 9987 : 9729);
            GL11.glTexParameteri(3553, 10240, 9729);
        }
        else {
            GL11.glTexParameteri(3553, 10241, \u2603 ? 9986 : 9728);
            GL11.glTexParameteri(3553, 10240, 9728);
        }
    }
    
    private static void a(final int[] \u2603, final int \u2603) {
        b(\u2603, 0, \u2603);
    }
    
    private static void b(final int[] \u2603, final int \u2603, final int \u2603) {
        int[] a = \u2603;
        if (ave.A().t.e) {
            a = a(\u2603);
        }
        bml.d.clear();
        bml.d.put(a, \u2603, \u2603);
        bml.d.position(0).limit(\u2603);
    }
    
    static void b(final int \u2603) {
        bfl.i(\u2603);
    }
    
    public static int[] a(final bni \u2603, final jy \u2603) throws IOException {
        final BufferedImage a = a(\u2603.a(\u2603).b());
        final int width = a.getWidth();
        final int height = a.getHeight();
        final int[] rgbArray = new int[width * height];
        a.getRGB(0, 0, width, height, rgbArray, 0, width);
        return rgbArray;
    }
    
    public static BufferedImage a(final InputStream \u2603) throws IOException {
        try {
            return ImageIO.read(\u2603);
        }
        finally {
            IOUtils.closeQuietly(\u2603);
        }
    }
    
    public static int[] a(final int[] \u2603) {
        final int[] array = new int[\u2603.length];
        for (int i = 0; i < \u2603.length; ++i) {
            array[i] = c(\u2603[i]);
        }
        return array;
    }
    
    public static int c(final int \u2603) {
        final int n = \u2603 >> 24 & 0xFF;
        final int n2 = \u2603 >> 16 & 0xFF;
        final int n3 = \u2603 >> 8 & 0xFF;
        final int n4 = \u2603 & 0xFF;
        final int n5 = (n2 * 30 + n3 * 59 + n4 * 11) / 100;
        final int n6 = (n2 * 30 + n3 * 70) / 100;
        final int n7 = (n2 * 30 + n4 * 70) / 100;
        return n << 24 | n5 << 16 | n6 << 8 | n7;
    }
    
    public static void a(final int[] \u2603, final int \u2603, final int \u2603) {
        final int[] array = new int[\u2603];
        for (int n = \u2603 / 2, i = 0; i < n; ++i) {
            System.arraycopy(\u2603, i * \u2603, array, 0, \u2603);
            System.arraycopy(\u2603, (\u2603 - 1 - i) * \u2603, \u2603, i * \u2603, \u2603);
            System.arraycopy(array, 0, \u2603, (\u2603 - 1 - i) * \u2603, \u2603);
        }
    }
    
    static {
        c = LogManager.getLogger();
        d = avd.f(4194304);
        a = new blz(16, 16);
        b = bml.a.e();
        final int n = -16777216;
        final int n2 = -524040;
        final int[] array = { -524040, -524040, -524040, -524040, -524040, -524040, -524040, -524040 };
        final int[] array2 = { -16777216, -16777216, -16777216, -16777216, -16777216, -16777216, -16777216, -16777216 };
        final int length = array.length;
        for (int i = 0; i < 16; ++i) {
            System.arraycopy((i < length) ? array : array2, 0, bml.b, 16 * i, length);
            System.arraycopy((i < length) ? array2 : array, 0, bml.b, 16 * i + length, length);
        }
        bml.a.d();
        e = new int[4];
    }
}
