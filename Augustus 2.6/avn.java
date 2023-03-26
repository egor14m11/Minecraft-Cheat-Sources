import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import com.ibm.icu.text.ArabicShapingException;
import com.ibm.icu.text.Bidi;
import com.ibm.icu.text.ArabicShaping;
import org.lwjgl.opengl.GL11;
import java.io.InputStream;
import org.apache.commons.io.IOUtils;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class avn implements bnj
{
    private static final jy[] c;
    private int[] d;
    public int a;
    public Random b;
    private byte[] e;
    private int[] f;
    private final jy g;
    private final bmj h;
    private float i;
    private float j;
    private boolean k;
    private boolean l;
    private float m;
    private float n;
    private float o;
    private float p;
    private int q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    
    public avn(final avh \u2603, final jy \u2603, final bmj \u2603, final boolean \u2603) {
        this.d = new int[256];
        this.a = 9;
        this.b = new Random();
        this.e = new byte[65536];
        this.f = new int[32];
        this.g = \u2603;
        this.h = \u2603;
        this.k = \u2603;
        \u2603.a(this.g);
        for (int i = 0; i < 32; ++i) {
            final int n = (i >> 3 & 0x1) * 85;
            int n2 = (i >> 2 & 0x1) * 170 + n;
            int n3 = (i >> 1 & 0x1) * 170 + n;
            int n4 = (i >> 0 & 0x1) * 170 + n;
            if (i == 6) {
                n2 += 85;
            }
            if (\u2603.e) {
                final int n5 = (n2 * 30 + n3 * 59 + n4 * 11) / 100;
                final int n6 = (n2 * 30 + n3 * 70) / 100;
                final int n7 = (n2 * 30 + n4 * 70) / 100;
                n2 = n5;
                n3 = n6;
                n4 = n7;
            }
            if (i >= 16) {
                n2 /= 4;
                n3 /= 4;
                n4 /= 4;
            }
            this.f[i] = ((n2 & 0xFF) << 16 | (n3 & 0xFF) << 8 | (n4 & 0xFF));
        }
        this.d();
    }
    
    @Override
    public void a(final bni \u2603) {
        this.c();
    }
    
    private void c() {
        BufferedImage a;
        try {
            a = bml.a(ave.A().Q().a(this.g).b());
        }
        catch (IOException cause) {
            throw new RuntimeException(cause);
        }
        final int width = a.getWidth();
        final int height = a.getHeight();
        final int[] rgbArray = new int[width * height];
        a.getRGB(0, 0, width, height, rgbArray, 0, width);
        final int n = height / 16;
        final int n2 = width / 16;
        final int n3 = 1;
        final float n4 = 8.0f / n2;
        for (int i = 0; i < 256; ++i) {
            final int n5 = i % 16;
            final int n6 = i / 16;
            if (i == 32) {
                this.d[i] = 3 + n3;
            }
            int j;
            for (j = n2 - 1; j >= 0; --j) {
                final int n7 = n5 * n2 + j;
                boolean b = true;
                for (int n8 = 0; n8 < n && b; ++n8) {
                    final int n9 = (n6 * n2 + n8) * width;
                    if ((rgbArray[n7 + n9] >> 24 & 0xFF) != 0x0) {
                        b = false;
                    }
                }
                if (!b) {
                    break;
                }
            }
            ++j;
            this.d[i] = (int)(0.5 + j * n4) + n3;
        }
    }
    
    private void d() {
        InputStream b = null;
        try {
            b = ave.A().Q().a(new jy("font/glyph_sizes.bin")).b();
            b.read(this.e);
        }
        catch (IOException cause) {
            throw new RuntimeException(cause);
        }
        finally {
            IOUtils.closeQuietly(b);
        }
    }
    
    private float a(final char \u2603, final boolean \u2603) {
        if (\u2603 == ' ') {
            return 4.0f;
        }
        final int index = "\u00c0\u00c1\u00c2\u00c8\u00ca\u00cb\u00cd\u00d3\u00d4\u00d5\u00da\u00df\u00e3\u00f5\u011f\u0130\u0131\u0152\u0153\u015e\u015f\u0174\u0175\u017e\u0207\u0000\u0000\u0000\u0000\u0000\u0000\u0000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u0000\u00c7\u00fc\u00e9\u00e2\u00e4\u00e0\u00e5\u00e7\u00ea\u00eb\u00e8\u00ef\u00ee\u00ec\u00c4\u00c5\u00c9\u00e6\u00c6\u00f4\u00f6\u00f2\u00fb\u00f9\u00ff\u00d6\u00dc\u00f8£\u00d8\u00d7\u0192\u00e1\u00ed\u00f3\u00fa\u00f1\u00d1ªº¿®¬½¼¡«»\u2591\u2592\u2593\u2502\u2524\u2561\u2562\u2556\u2555\u2563\u2551\u2557\u255d\u255c\u255b\u2510\u2514\u2534\u252c\u251c\u2500\u253c\u255e\u255f\u255a\u2554\u2569\u2566\u2560\u2550\u256c\u2567\u2568\u2564\u2565\u2559\u2558\u2552\u2553\u256b\u256a\u2518\u250c\u2588\u2584\u258c\u2590\u2580\u03b1\u03b2\u0393\u03c0\u03a3\u03c3\u03bc\u03c4\u03a6\u0398\u03a9\u03b4\u221e\u2205\u2208\u2229\u2261±\u2265\u2264\u2320\u2321\u00f7\u2248°\u2219·\u221a\u207f²\u25a0\u0000".indexOf(\u2603);
        if (index != -1 && !this.k) {
            return this.a(index, \u2603);
        }
        return this.b(\u2603, \u2603);
    }
    
    private float a(final int \u2603, final boolean \u2603) {
        final int n = \u2603 % 16 * 8;
        final int n2 = \u2603 / 16 * 8;
        final int n3 = \u2603 ? 1 : 0;
        this.h.a(this.g);
        final int n4 = this.d[\u2603];
        final float n5 = n4 - 0.01f;
        GL11.glBegin(5);
        GL11.glTexCoord2f(n / 128.0f, n2 / 128.0f);
        GL11.glVertex3f(this.i + n3, this.j, 0.0f);
        GL11.glTexCoord2f(n / 128.0f, (n2 + 7.99f) / 128.0f);
        GL11.glVertex3f(this.i - n3, this.j + 7.99f, 0.0f);
        GL11.glTexCoord2f((n + n5 - 1.0f) / 128.0f, n2 / 128.0f);
        GL11.glVertex3f(this.i + n5 - 1.0f + n3, this.j, 0.0f);
        GL11.glTexCoord2f((n + n5 - 1.0f) / 128.0f, (n2 + 7.99f) / 128.0f);
        GL11.glVertex3f(this.i + n5 - 1.0f - n3, this.j + 7.99f, 0.0f);
        GL11.glEnd();
        return (float)n4;
    }
    
    private jy a(final int \u2603) {
        if (avn.c[\u2603] == null) {
            avn.c[\u2603] = new jy(String.format("textures/font/unicode_page_%02x.png", \u2603));
        }
        return avn.c[\u2603];
    }
    
    private void b(final int \u2603) {
        this.h.a(this.a(\u2603));
    }
    
    private float b(final char \u2603, final boolean \u2603) {
        if (this.e[\u2603] == 0) {
            return 0.0f;
        }
        final int \u26032 = \u2603 / '\u0100';
        this.b(\u26032);
        final int n = this.e[\u2603] >>> 4;
        final int n2 = this.e[\u2603] & 0xF;
        final float n3 = (float)n;
        final float n4 = (float)(n2 + 1);
        final float n5 = \u2603 % '\u0010' * 16 + n3;
        final float n6 = (float)((\u2603 & '\u00ff') / 16 * 16);
        final float n7 = n4 - n3 - 0.02f;
        final float n8 = \u2603 ? 1.0f : 0.0f;
        GL11.glBegin(5);
        GL11.glTexCoord2f(n5 / 256.0f, n6 / 256.0f);
        GL11.glVertex3f(this.i + n8, this.j, 0.0f);
        GL11.glTexCoord2f(n5 / 256.0f, (n6 + 15.98f) / 256.0f);
        GL11.glVertex3f(this.i - n8, this.j + 7.99f, 0.0f);
        GL11.glTexCoord2f((n5 + n7) / 256.0f, n6 / 256.0f);
        GL11.glVertex3f(this.i + n7 / 2.0f + n8, this.j, 0.0f);
        GL11.glTexCoord2f((n5 + n7) / 256.0f, (n6 + 15.98f) / 256.0f);
        GL11.glVertex3f(this.i + n7 / 2.0f - n8, this.j + 7.99f, 0.0f);
        GL11.glEnd();
        return (n4 - n3) / 2.0f + 1.0f;
    }
    
    public int a(final String \u2603, final float \u2603, final float \u2603, final int \u2603) {
        return this.a(\u2603, \u2603, \u2603, \u2603, true);
    }
    
    public int a(final String \u2603, final int \u2603, final int \u2603, final int \u2603) {
        return this.a(\u2603, (float)\u2603, (float)\u2603, \u2603, false);
    }
    
    public int a(final String \u2603, final float \u2603, final float \u2603, final int \u2603, final boolean \u2603) {
        bfl.d();
        this.e();
        int a;
        if (\u2603) {
            a = this.b(\u2603, \u2603 + 1.0f, \u2603 + 1.0f, \u2603, true);
            a = Math.max(a, this.b(\u2603, \u2603, \u2603, \u2603, false));
        }
        else {
            a = this.b(\u2603, \u2603, \u2603, \u2603, false);
        }
        return a;
    }
    
    private String c(final String \u2603) {
        try {
            final Bidi bidi = new Bidi(new ArabicShaping(8).shape(\u2603), 127);
            bidi.setReorderingMode(0);
            return bidi.writeReordered(2);
        }
        catch (ArabicShapingException ex) {
            return \u2603;
        }
    }
    
    private void e() {
        this.r = false;
        this.s = false;
        this.t = false;
        this.u = false;
        this.v = false;
    }
    
    private void a(final String \u2603, final boolean \u2603) {
        for (int i = 0; i < \u2603.length(); ++i) {
            char char1 = \u2603.charAt(i);
            if (char1 == '§' && i + 1 < \u2603.length()) {
                int index = "0123456789abcdefklmnor".indexOf(\u2603.toLowerCase(Locale.ENGLISH).charAt(i + 1));
                if (index < 16) {
                    this.r = false;
                    this.s = false;
                    this.v = false;
                    this.u = false;
                    this.t = false;
                    if (index < 0 || index > 15) {
                        index = 15;
                    }
                    if (\u2603) {
                        index += 16;
                    }
                    final int j = this.f[index];
                    this.q = j;
                    bfl.c((j >> 16) / 255.0f, (j >> 8 & 0xFF) / 255.0f, (j & 0xFF) / 255.0f, this.p);
                }
                else if (index == 16) {
                    this.r = true;
                }
                else if (index == 17) {
                    this.s = true;
                }
                else if (index == 18) {
                    this.v = true;
                }
                else if (index == 19) {
                    this.u = true;
                }
                else if (index == 20) {
                    this.t = true;
                }
                else if (index == 21) {
                    this.r = false;
                    this.s = false;
                    this.v = false;
                    this.u = false;
                    this.t = false;
                    bfl.c(this.m, this.n, this.o, this.p);
                }
                ++i;
            }
            else {
                int index = "\u00c0\u00c1\u00c2\u00c8\u00ca\u00cb\u00cd\u00d3\u00d4\u00d5\u00da\u00df\u00e3\u00f5\u011f\u0130\u0131\u0152\u0153\u015e\u015f\u0174\u0175\u017e\u0207\u0000\u0000\u0000\u0000\u0000\u0000\u0000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u0000\u00c7\u00fc\u00e9\u00e2\u00e4\u00e0\u00e5\u00e7\u00ea\u00eb\u00e8\u00ef\u00ee\u00ec\u00c4\u00c5\u00c9\u00e6\u00c6\u00f4\u00f6\u00f2\u00fb\u00f9\u00ff\u00d6\u00dc\u00f8£\u00d8\u00d7\u0192\u00e1\u00ed\u00f3\u00fa\u00f1\u00d1ªº¿®¬½¼¡«»\u2591\u2592\u2593\u2502\u2524\u2561\u2562\u2556\u2555\u2563\u2551\u2557\u255d\u255c\u255b\u2510\u2514\u2534\u252c\u251c\u2500\u253c\u255e\u255f\u255a\u2554\u2569\u2566\u2560\u2550\u256c\u2567\u2568\u2564\u2565\u2559\u2558\u2552\u2553\u256b\u256a\u2518\u250c\u2588\u2584\u258c\u2590\u2580\u03b1\u03b2\u0393\u03c0\u03a3\u03c3\u03bc\u03c4\u03a6\u0398\u03a9\u03b4\u221e\u2205\u2208\u2229\u2261±\u2265\u2264\u2320\u2321\u00f7\u2248°\u2219·\u221a\u207f²\u25a0\u0000".indexOf(char1);
                if (this.r && index != -1) {
                    final int j = this.a(char1);
                    char char2;
                    do {
                        index = this.b.nextInt("\u00c0\u00c1\u00c2\u00c8\u00ca\u00cb\u00cd\u00d3\u00d4\u00d5\u00da\u00df\u00e3\u00f5\u011f\u0130\u0131\u0152\u0153\u015e\u015f\u0174\u0175\u017e\u0207\u0000\u0000\u0000\u0000\u0000\u0000\u0000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u0000\u00c7\u00fc\u00e9\u00e2\u00e4\u00e0\u00e5\u00e7\u00ea\u00eb\u00e8\u00ef\u00ee\u00ec\u00c4\u00c5\u00c9\u00e6\u00c6\u00f4\u00f6\u00f2\u00fb\u00f9\u00ff\u00d6\u00dc\u00f8£\u00d8\u00d7\u0192\u00e1\u00ed\u00f3\u00fa\u00f1\u00d1ªº¿®¬½¼¡«»\u2591\u2592\u2593\u2502\u2524\u2561\u2562\u2556\u2555\u2563\u2551\u2557\u255d\u255c\u255b\u2510\u2514\u2534\u252c\u251c\u2500\u253c\u255e\u255f\u255a\u2554\u2569\u2566\u2560\u2550\u256c\u2567\u2568\u2564\u2565\u2559\u2558\u2552\u2553\u256b\u256a\u2518\u250c\u2588\u2584\u258c\u2590\u2580\u03b1\u03b2\u0393\u03c0\u03a3\u03c3\u03bc\u03c4\u03a6\u0398\u03a9\u03b4\u221e\u2205\u2208\u2229\u2261±\u2265\u2264\u2320\u2321\u00f7\u2248°\u2219·\u221a\u207f²\u25a0\u0000".length());
                        char2 = "\u00c0\u00c1\u00c2\u00c8\u00ca\u00cb\u00cd\u00d3\u00d4\u00d5\u00da\u00df\u00e3\u00f5\u011f\u0130\u0131\u0152\u0153\u015e\u015f\u0174\u0175\u017e\u0207\u0000\u0000\u0000\u0000\u0000\u0000\u0000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u0000\u00c7\u00fc\u00e9\u00e2\u00e4\u00e0\u00e5\u00e7\u00ea\u00eb\u00e8\u00ef\u00ee\u00ec\u00c4\u00c5\u00c9\u00e6\u00c6\u00f4\u00f6\u00f2\u00fb\u00f9\u00ff\u00d6\u00dc\u00f8£\u00d8\u00d7\u0192\u00e1\u00ed\u00f3\u00fa\u00f1\u00d1ªº¿®¬½¼¡«»\u2591\u2592\u2593\u2502\u2524\u2561\u2562\u2556\u2555\u2563\u2551\u2557\u255d\u255c\u255b\u2510\u2514\u2534\u252c\u251c\u2500\u253c\u255e\u255f\u255a\u2554\u2569\u2566\u2560\u2550\u256c\u2567\u2568\u2564\u2565\u2559\u2558\u2552\u2553\u256b\u256a\u2518\u250c\u2588\u2584\u258c\u2590\u2580\u03b1\u03b2\u0393\u03c0\u03a3\u03c3\u03bc\u03c4\u03a6\u0398\u03a9\u03b4\u221e\u2205\u2208\u2229\u2261±\u2265\u2264\u2320\u2321\u00f7\u2248°\u2219·\u221a\u207f²\u25a0\u0000".charAt(index);
                    } while (j != this.a(char2));
                    char1 = char2;
                }
                final float n = this.k ? 0.5f : 1.0f;
                final boolean b = (char1 == '\0' || index == -1 || this.k) && \u2603;
                if (b) {
                    this.i -= n;
                    this.j -= n;
                }
                float a = this.a(char1, this.t);
                if (b) {
                    this.i += n;
                    this.j += n;
                }
                if (this.s) {
                    this.i += n;
                    if (b) {
                        this.i -= n;
                        this.j -= n;
                    }
                    this.a(char1, this.t);
                    this.i -= n;
                    if (b) {
                        this.i += n;
                        this.j += n;
                    }
                    ++a;
                }
                if (this.v) {
                    final bfx bfx = bfx.a();
                    final bfd bfd = bfx.c();
                    bfl.x();
                    bfd.a(7, bms.e);
                    bfd.b(this.i, this.j + this.a / 2, 0.0).d();
                    bfd.b(this.i + a, this.j + this.a / 2, 0.0).d();
                    bfd.b(this.i + a, this.j + this.a / 2 - 1.0f, 0.0).d();
                    bfd.b(this.i, this.j + this.a / 2 - 1.0f, 0.0).d();
                    bfx.b();
                    bfl.w();
                }
                if (this.u) {
                    final bfx bfx = bfx.a();
                    final bfd bfd = bfx.c();
                    bfl.x();
                    bfd.a(7, bms.e);
                    final int n2 = this.u ? -1 : 0;
                    bfd.b(this.i + n2, this.j + this.a, 0.0).d();
                    bfd.b(this.i + a, this.j + this.a, 0.0).d();
                    bfd.b(this.i + a, this.j + this.a - 1.0f, 0.0).d();
                    bfd.b(this.i + n2, this.j + this.a - 1.0f, 0.0).d();
                    bfx.b();
                    bfl.w();
                }
                this.i += (int)a;
            }
        }
    }
    
    private int a(final String \u2603, int \u2603, final int \u2603, final int \u2603, final int \u2603, final boolean \u2603) {
        if (this.l) {
            final int a = this.a(this.c(\u2603));
            \u2603 = \u2603 + \u2603 - a;
        }
        return this.b(\u2603, (float)\u2603, (float)\u2603, \u2603, \u2603);
    }
    
    private int b(String \u2603, final float \u2603, final float \u2603, int \u2603, final boolean \u2603) {
        if (\u2603 == null) {
            return 0;
        }
        if (this.l) {
            \u2603 = this.c(\u2603);
        }
        if ((\u2603 & 0xFC000000) == 0x0) {
            \u2603 |= 0xFF000000;
        }
        if (\u2603) {
            \u2603 = ((\u2603 & 0xFCFCFC) >> 2 | (\u2603 & 0xFF000000));
        }
        this.m = (\u2603 >> 16 & 0xFF) / 255.0f;
        this.n = (\u2603 >> 8 & 0xFF) / 255.0f;
        this.o = (\u2603 & 0xFF) / 255.0f;
        this.p = (\u2603 >> 24 & 0xFF) / 255.0f;
        bfl.c(this.m, this.n, this.o, this.p);
        this.i = \u2603;
        this.j = \u2603;
        this.a(\u2603, \u2603);
        return (int)this.i;
    }
    
    public int a(final String \u2603) {
        if (\u2603 == null) {
            return 0;
        }
        int n = 0;
        boolean b = false;
        for (int i = 0; i < \u2603.length(); ++i) {
            char \u26032 = \u2603.charAt(i);
            int a = this.a(\u26032);
            if (a < 0 && i < \u2603.length() - 1) {
                \u26032 = \u2603.charAt(++i);
                if (\u26032 == 'l' || \u26032 == 'L') {
                    b = true;
                }
                else if (\u26032 == 'r' || \u26032 == 'R') {
                    b = false;
                }
                a = 0;
            }
            n += a;
            if (b && a > 0) {
                ++n;
            }
        }
        return n;
    }
    
    public int a(final char \u2603) {
        if (\u2603 == '§') {
            return -1;
        }
        if (\u2603 == ' ') {
            return 4;
        }
        final int index = "\u00c0\u00c1\u00c2\u00c8\u00ca\u00cb\u00cd\u00d3\u00d4\u00d5\u00da\u00df\u00e3\u00f5\u011f\u0130\u0131\u0152\u0153\u015e\u015f\u0174\u0175\u017e\u0207\u0000\u0000\u0000\u0000\u0000\u0000\u0000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u0000\u00c7\u00fc\u00e9\u00e2\u00e4\u00e0\u00e5\u00e7\u00ea\u00eb\u00e8\u00ef\u00ee\u00ec\u00c4\u00c5\u00c9\u00e6\u00c6\u00f4\u00f6\u00f2\u00fb\u00f9\u00ff\u00d6\u00dc\u00f8£\u00d8\u00d7\u0192\u00e1\u00ed\u00f3\u00fa\u00f1\u00d1ªº¿®¬½¼¡«»\u2591\u2592\u2593\u2502\u2524\u2561\u2562\u2556\u2555\u2563\u2551\u2557\u255d\u255c\u255b\u2510\u2514\u2534\u252c\u251c\u2500\u253c\u255e\u255f\u255a\u2554\u2569\u2566\u2560\u2550\u256c\u2567\u2568\u2564\u2565\u2559\u2558\u2552\u2553\u256b\u256a\u2518\u250c\u2588\u2584\u258c\u2590\u2580\u03b1\u03b2\u0393\u03c0\u03a3\u03c3\u03bc\u03c4\u03a6\u0398\u03a9\u03b4\u221e\u2205\u2208\u2229\u2261±\u2265\u2264\u2320\u2321\u00f7\u2248°\u2219·\u221a\u207f²\u25a0\u0000".indexOf(\u2603);
        if (\u2603 > '\0' && index != -1 && !this.k) {
            return this.d[index];
        }
        if (this.e[\u2603] != 0) {
            int n = this.e[\u2603] >>> 4;
            int n2 = this.e[\u2603] & 0xF;
            if (n2 > 7) {
                n2 = 15;
                n = 0;
            }
            return (++n2 - n) / 2 + 1;
        }
        return 0;
    }
    
    public String a(final String \u2603, final int \u2603) {
        return this.a(\u2603, \u2603, false);
    }
    
    public String a(final String \u2603, final int \u2603, final boolean \u2603) {
        final StringBuilder sb = new StringBuilder();
        int n = 0;
        final int n2 = \u2603 ? (\u2603.length() - 1) : 0;
        final int n3 = \u2603 ? -1 : 1;
        boolean b = false;
        boolean b2 = false;
        for (int index = n2; index >= 0 && index < \u2603.length() && n < \u2603; index += n3) {
            final char char1 = \u2603.charAt(index);
            final int a = this.a(char1);
            if (b) {
                b = false;
                if (char1 == 'l' || char1 == 'L') {
                    b2 = true;
                }
                else if (char1 == 'r' || char1 == 'R') {
                    b2 = false;
                }
            }
            else if (a < 0) {
                b = true;
            }
            else {
                n += a;
                if (b2) {
                    ++n;
                }
            }
            if (n > \u2603) {
                break;
            }
            if (\u2603) {
                sb.insert(0, char1);
            }
            else {
                sb.append(char1);
            }
        }
        return sb.toString();
    }
    
    private String d(String \u2603) {
        while (\u2603 != null && \u2603.endsWith("\n")) {
            \u2603 = \u2603.substring(0, \u2603.length() - 1);
        }
        return \u2603;
    }
    
    public void a(String \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        this.e();
        this.q = \u2603;
        \u2603 = this.d(\u2603);
        this.a(\u2603, \u2603, \u2603, \u2603, false);
    }
    
    private void a(final String \u2603, final int \u2603, int \u2603, final int \u2603, final boolean \u2603) {
        final List<String> c = this.c(\u2603, \u2603);
        for (final String \u26032 : c) {
            this.a(\u26032, \u2603, \u2603, \u2603, this.q, \u2603);
            \u2603 += this.a;
        }
    }
    
    public int b(final String \u2603, final int \u2603) {
        return this.a * this.c(\u2603, \u2603).size();
    }
    
    public void a(final boolean \u2603) {
        this.k = \u2603;
    }
    
    public boolean a() {
        return this.k;
    }
    
    public void b(final boolean \u2603) {
        this.l = \u2603;
    }
    
    public List<String> c(final String \u2603, final int \u2603) {
        return Arrays.asList(this.d(\u2603, \u2603).split("\n"));
    }
    
    String d(final String \u2603, final int \u2603) {
        final int e = this.e(\u2603, \u2603);
        if (\u2603.length() <= e) {
            return \u2603;
        }
        final String substring = \u2603.substring(0, e);
        final char char1 = \u2603.charAt(e);
        final boolean b = char1 == ' ' || char1 == '\n';
        final String string = b(substring) + \u2603.substring(e + (b ? 1 : 0));
        return substring + "\n" + this.d(string, \u2603);
    }
    
    private int e(final String \u2603, final int \u2603) {
        final int length = \u2603.length();
        int n = 0;
        int i = 0;
        int n2 = -1;
        boolean b = false;
        while (i < length) {
            final char char1 = \u2603.charAt(i);
            Label_0164: {
                switch (char1) {
                    case '§': {
                        if (i < length - 1) {
                            final char char2 = \u2603.charAt(++i);
                            if (char2 == 'l' || char2 == 'L') {
                                b = true;
                            }
                            else if (char2 == 'r' || char2 == 'R' || c(char2)) {
                                b = false;
                            }
                        }
                        break Label_0164;
                    }
                    case '\n': {
                        --i;
                        break Label_0164;
                    }
                    case ' ': {
                        n2 = i;
                        break;
                    }
                }
                n += this.a(char1);
                if (b) {
                    ++n;
                }
            }
            if (char1 == '\n') {
                n2 = ++i;
                break;
            }
            if (n > \u2603) {
                break;
            }
            ++i;
        }
        if (i != length && n2 != -1 && n2 < i) {
            return n2;
        }
        return i;
    }
    
    private static boolean c(final char \u2603) {
        return (\u2603 >= '0' && \u2603 <= '9') || (\u2603 >= 'a' && \u2603 <= 'f') || (\u2603 >= 'A' && \u2603 <= 'F');
    }
    
    private static boolean d(final char \u2603) {
        return (\u2603 >= 'k' && \u2603 <= 'o') || (\u2603 >= 'K' && \u2603 <= 'O') || \u2603 == 'r' || \u2603 == 'R';
    }
    
    public static String b(final String \u2603) {
        String str = "";
        int index = -1;
        final int length = \u2603.length();
        while ((index = \u2603.indexOf(167, index + 1)) != -1) {
            if (index < length - 1) {
                final char char1 = \u2603.charAt(index + 1);
                if (c(char1)) {
                    str = "§" + char1;
                }
                else {
                    if (!d(char1)) {
                        continue;
                    }
                    str = str + "§" + char1;
                }
            }
        }
        return str;
    }
    
    public boolean b() {
        return this.l;
    }
    
    public int b(final char \u2603) {
        return this.f["0123456789abcdef".indexOf(\u2603)];
    }
    
    static {
        c = new jy[256];
    }
}
