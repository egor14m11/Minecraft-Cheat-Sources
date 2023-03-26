import java.util.concurrent.Callable;
import java.io.IOException;
import java.util.Iterator;
import java.awt.image.BufferedImage;
import com.google.common.collect.Lists;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class bmi
{
    private final String j;
    protected List<int[][]> a;
    protected int[][] b;
    private boa k;
    protected boolean c;
    protected int d;
    protected int e;
    protected int f;
    protected int g;
    private float l;
    private float m;
    private float n;
    private float o;
    protected int h;
    protected int i;
    private static String p;
    private static String q;
    
    protected bmi(final String \u2603) {
        this.a = (List<int[][]>)Lists.newArrayList();
        this.j = \u2603;
    }
    
    protected static bmi a(final jy \u2603) {
        final String string = \u2603.toString();
        if (bmi.p.equals(string)) {
            return new bmo(string);
        }
        if (bmi.q.equals(string)) {
            return new bmp(string);
        }
        return new bmi(string);
    }
    
    public static void a(final String \u2603) {
        bmi.p = \u2603;
    }
    
    public static void b(final String \u2603) {
        bmi.q = \u2603;
    }
    
    public void a(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final boolean \u2603) {
        this.d = \u2603;
        this.e = \u2603;
        this.c = \u2603;
        final float n = (float)(0.009999999776482582 / \u2603);
        final float n2 = (float)(0.009999999776482582 / \u2603);
        this.l = \u2603 / (float)\u2603 + n;
        this.m = (\u2603 + this.f) / (float)\u2603 - n;
        this.n = \u2603 / (float)\u2603 + n2;
        this.o = (\u2603 + this.g) / (float)\u2603 - n2;
    }
    
    public void a(final bmi \u2603) {
        this.d = \u2603.d;
        this.e = \u2603.e;
        this.f = \u2603.f;
        this.g = \u2603.g;
        this.c = \u2603.c;
        this.l = \u2603.l;
        this.m = \u2603.m;
        this.n = \u2603.n;
        this.o = \u2603.o;
    }
    
    public int a() {
        return this.d;
    }
    
    public int b() {
        return this.e;
    }
    
    public int c() {
        return this.f;
    }
    
    public int d() {
        return this.g;
    }
    
    public float e() {
        return this.l;
    }
    
    public float f() {
        return this.m;
    }
    
    public float a(final double \u2603) {
        final float n = this.m - this.l;
        return this.l + n * (float)\u2603 / 16.0f;
    }
    
    public float g() {
        return this.n;
    }
    
    public float h() {
        return this.o;
    }
    
    public float b(final double \u2603) {
        final float n = this.o - this.n;
        return this.n + n * ((float)\u2603 / 16.0f);
    }
    
    public String i() {
        return this.j;
    }
    
    public void j() {
        ++this.i;
        if (this.i >= this.k.a(this.h)) {
            final int c = this.k.c(this.h);
            final int n = (this.k.c() == 0) ? this.a.size() : this.k.c();
            this.h = (this.h + 1) % n;
            this.i = 0;
            final int c2 = this.k.c(this.h);
            if (c != c2 && c2 >= 0 && c2 < this.a.size()) {
                bml.a(this.a.get(c2), this.f, this.g, this.d, this.e, false, false);
            }
        }
        else if (this.k.e()) {
            this.n();
        }
    }
    
    private void n() {
        final double n = 1.0 - this.i / (double)this.k.a(this.h);
        final int c = this.k.c(this.h);
        final int n2 = (this.k.c() == 0) ? this.a.size() : this.k.c();
        final int c2 = this.k.c((this.h + 1) % n2);
        if (c != c2 && c2 >= 0 && c2 < this.a.size()) {
            final int[][] array = this.a.get(c);
            final int[][] array2 = this.a.get(c2);
            if (this.b == null || this.b.length != array.length) {
                this.b = new int[array.length][];
            }
            for (int i = 0; i < array.length; ++i) {
                if (this.b[i] == null) {
                    this.b[i] = new int[array[i].length];
                }
                if (i < array2.length) {
                    if (array2[i].length == array[i].length) {
                        for (int j = 0; j < array[i].length; ++j) {
                            final int n3 = array[i][j];
                            final int n4 = array2[i][j];
                            final int n5 = (int)(((n3 & 0xFF0000) >> 16) * n + ((n4 & 0xFF0000) >> 16) * (1.0 - n));
                            final int n6 = (int)(((n3 & 0xFF00) >> 8) * n + ((n4 & 0xFF00) >> 8) * (1.0 - n));
                            final int n7 = (int)((n3 & 0xFF) * n + (n4 & 0xFF) * (1.0 - n));
                            this.b[i][j] = ((n3 & 0xFF000000) | n5 << 16 | n6 << 8 | n7);
                        }
                    }
                }
            }
            bml.a(this.b, this.f, this.g, this.d, this.e, false, false);
        }
    }
    
    public int[][] a(final int \u2603) {
        return this.a.get(\u2603);
    }
    
    public int k() {
        return this.a.size();
    }
    
    public void b(final int \u2603) {
        this.f = \u2603;
    }
    
    public void c(final int \u2603) {
        this.g = \u2603;
    }
    
    public void a(final BufferedImage[] \u2603, final boa \u2603) throws IOException {
        this.o();
        final int width = \u2603[0].getWidth();
        final int height = \u2603[0].getHeight();
        this.f = width;
        this.g = height;
        final int[][] array = new int[\u2603.length][];
        for (int i = 0; i < \u2603.length; ++i) {
            final BufferedImage bufferedImage = \u2603[i];
            if (bufferedImage != null) {
                if (i > 0 && (bufferedImage.getWidth() != width >> i || bufferedImage.getHeight() != height >> i)) {
                    throw new RuntimeException(String.format("Unable to load miplevel: %d, image is size: %dx%d, expected %dx%d", i, bufferedImage.getWidth(), bufferedImage.getHeight(), width >> i, height >> i));
                }
                array[i] = new int[bufferedImage.getWidth() * bufferedImage.getHeight()];
                bufferedImage.getRGB(0, 0, bufferedImage.getWidth(), bufferedImage.getHeight(), array[i], 0, bufferedImage.getWidth());
            }
        }
        if (\u2603 == null) {
            if (height != width) {
                throw new RuntimeException("broken aspect ratio and not an animation");
            }
            this.a.add(array);
        }
        else {
            final int i = height / width;
            final int n = width;
            final int n2 = width;
            this.g = this.f;
            if (\u2603.c() > 0) {
                for (final int j : \u2603.f()) {
                    if (j >= i) {
                        throw new RuntimeException("invalid frameindex " + j);
                    }
                    this.e(j);
                    this.a.set(j, a(array, n, n2, j));
                }
                this.k = \u2603;
            }
            else {
                final List<bnz> arrayList = (List<bnz>)Lists.newArrayList();
                for (int j = 0; j < i; ++j) {
                    this.a.add(a(array, n, n2, j));
                    arrayList.add(new bnz(j, -1));
                }
                this.k = new boa(arrayList, this.f, this.g, \u2603.d(), \u2603.e());
            }
        }
    }
    
    public void d(final int \u2603) {
        final List<int[][]> arrayList = (List<int[][]>)Lists.newArrayList();
        for (int i = 0; i < this.a.size(); ++i) {
            final int[][] \u26032 = this.a.get(i);
            if (\u26032 != null) {
                try {
                    arrayList.add(bml.a(\u2603, this.f, \u26032));
                }
                catch (Throwable \u26033) {
                    final b a = b.a(\u26033, "Generating mipmaps for frame");
                    final c a2 = a.a("Frame being iterated");
                    a2.a("Frame index", i);
                    a2.a("Frame sizes", new Callable<String>() {
                        public String a() throws Exception {
                            final StringBuilder sb = new StringBuilder();
                            for (final int[] array : \u26032) {
                                if (sb.length() > 0) {
                                    sb.append(", ");
                                }
                                sb.append((array == null) ? "null" : Integer.valueOf(array.length));
                            }
                            return sb.toString();
                        }
                    });
                    throw new e(a);
                }
            }
        }
        this.a(arrayList);
    }
    
    private void e(final int \u2603) {
        if (this.a.size() > \u2603) {
            return;
        }
        for (int i = this.a.size(); i <= \u2603; ++i) {
            this.a.add(null);
        }
    }
    
    private static int[][] a(final int[][] \u2603, final int \u2603, final int \u2603, final int \u2603) {
        final int[][] array = new int[\u2603.length][];
        for (int i = 0; i < \u2603.length; ++i) {
            final int[] array2 = \u2603[i];
            if (array2 != null) {
                array[i] = new int[(\u2603 >> i) * (\u2603 >> i)];
                System.arraycopy(array2, \u2603 * array[i].length, array[i], 0, array[i].length);
            }
        }
        return array;
    }
    
    public void l() {
        this.a.clear();
    }
    
    public boolean m() {
        return this.k != null;
    }
    
    public void a(final List<int[][]> \u2603) {
        this.a = \u2603;
    }
    
    private void o() {
        this.k = null;
        this.a((List<int[][]>)Lists.newArrayList());
        this.h = 0;
        this.i = 0;
    }
    
    @Override
    public String toString() {
        return "TextureAtlasSprite{name='" + this.j + '\'' + ", frameCount=" + this.a.size() + ", rotated=" + this.c + ", x=" + this.d + ", y=" + this.e + ", height=" + this.g + ", width=" + this.f + ", u0=" + this.l + ", u1=" + this.m + ", v0=" + this.n + ", v1=" + this.o + '}';
    }
    
    static {
        bmi.p = "builtin/clock";
        bmi.q = "builtin/compass";
    }
}
