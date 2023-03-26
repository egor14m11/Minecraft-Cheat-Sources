import java.nio.ByteOrder;
import java.util.BitSet;
import java.util.Arrays;
import com.google.common.primitives.Floats;
import java.util.Comparator;
import org.apache.logging.log4j.LogManager;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.nio.IntBuffer;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.5.36
// 

public class bfd
{
    private ByteBuffer a;
    private IntBuffer b;
    private ShortBuffer c;
    private FloatBuffer d;
    private int e;
    private bmv f;
    private int g;
    private boolean h;
    private int i;
    private double j;
    private double k;
    private double l;
    private bmu m;
    private boolean n;
    
    public bfd(final int \u2603) {
        this.a = avd.c(\u2603 * 4);
        this.b = this.a.asIntBuffer();
        this.c = this.a.asShortBuffer();
        this.d = this.a.asFloatBuffer();
    }
    
    private void b(final int \u2603) {
        if (\u2603 <= this.b.remaining()) {
            return;
        }
        final int capacity = this.a.capacity();
        final int n = capacity % 2097152;
        final int n2 = n + (((this.b.position() + \u2603) * 4 - n) / 2097152 + 1) * 2097152;
        LogManager.getLogger().warn("Needed to grow BufferBuilder buffer: Old size " + capacity + " bytes, new size " + n2 + " bytes.");
        final int position = this.b.position();
        final ByteBuffer c = avd.c(n2);
        this.a.position(0);
        c.put(this.a);
        c.rewind();
        this.a = c;
        this.d = this.a.asFloatBuffer().asReadOnlyBuffer();
        (this.b = this.a.asIntBuffer()).position(position);
        (this.c = this.a.asShortBuffer()).position(position << 1);
    }
    
    public void a(final float \u2603, final float \u2603, final float \u2603) {
        final int n = this.e / 4;
        final float[] array = new float[n];
        for (int i = 0; i < n; ++i) {
            array[i] = a(this.d, (float)(\u2603 + this.j), (float)(\u2603 + this.k), (float)(\u2603 + this.l), this.m.f(), i * this.m.g());
        }
        final Integer[] a = new Integer[n];
        for (int j = 0; j < a.length; ++j) {
            a[j] = j;
        }
        Arrays.sort(a, new Comparator<Integer>() {
            public int a(final Integer \u2603, final Integer \u2603) {
                return Floats.compare(array[\u2603], array[\u2603]);
            }
        });
        final BitSet set = new BitSet();
        final int g = this.m.g();
        final int[] array2 = new int[g];
        for (int nextClearBit = 0; (nextClearBit = set.nextClearBit(nextClearBit)) < a.length; ++nextClearBit) {
            final int intValue = a[nextClearBit];
            if (intValue != nextClearBit) {
                this.b.limit(intValue * g + g);
                this.b.position(intValue * g);
                this.b.get(array2);
                for (int k = intValue, n2 = a[k]; k != nextClearBit; k = n2, n2 = a[k]) {
                    this.b.limit(n2 * g + g);
                    this.b.position(n2 * g);
                    final IntBuffer slice = this.b.slice();
                    this.b.limit(k * g + g);
                    this.b.position(k * g);
                    this.b.put(slice);
                    set.set(k);
                }
                this.b.limit(nextClearBit * g + g);
                this.b.position(nextClearBit * g);
                this.b.put(array2);
            }
            set.set(nextClearBit);
        }
    }
    
    public a a() {
        this.b.rewind();
        final int j = this.j();
        this.b.limit(j);
        final int[] array = new int[j];
        this.b.get(array);
        this.b.limit(this.b.capacity());
        this.b.position(j);
        return new a(array, new bmu(this.m));
    }
    
    private int j() {
        return this.e * this.m.f();
    }
    
    private static float a(final FloatBuffer \u2603, final float \u2603, final float \u2603, final float \u2603, final int \u2603, final int \u2603) {
        final float value = \u2603.get(\u2603 + \u2603 * 0 + 0);
        final float value2 = \u2603.get(\u2603 + \u2603 * 0 + 1);
        final float value3 = \u2603.get(\u2603 + \u2603 * 0 + 2);
        final float value4 = \u2603.get(\u2603 + \u2603 * 1 + 0);
        final float value5 = \u2603.get(\u2603 + \u2603 * 1 + 1);
        final float value6 = \u2603.get(\u2603 + \u2603 * 1 + 2);
        final float value7 = \u2603.get(\u2603 + \u2603 * 2 + 0);
        final float value8 = \u2603.get(\u2603 + \u2603 * 2 + 1);
        final float value9 = \u2603.get(\u2603 + \u2603 * 2 + 2);
        final float value10 = \u2603.get(\u2603 + \u2603 * 3 + 0);
        final float value11 = \u2603.get(\u2603 + \u2603 * 3 + 1);
        final float value12 = \u2603.get(\u2603 + \u2603 * 3 + 2);
        final float n = (value + value4 + value7 + value10) * 0.25f - \u2603;
        final float n2 = (value2 + value5 + value8 + value11) * 0.25f - \u2603;
        final float n3 = (value3 + value6 + value9 + value12) * 0.25f - \u2603;
        return n * n + n2 * n2 + n3 * n3;
    }
    
    public void a(final a \u2603) {
        this.b.clear();
        this.b(\u2603.a().length);
        this.b.put(\u2603.a());
        this.e = \u2603.b();
        this.m = new bmu(\u2603.c());
    }
    
    public void b() {
        this.e = 0;
        this.f = null;
        this.g = 0;
    }
    
    public void a(final int \u2603, final bmu \u2603) {
        if (this.n) {
            throw new IllegalStateException("Already building!");
        }
        this.n = true;
        this.b();
        this.i = \u2603;
        this.m = \u2603;
        this.f = \u2603.c(this.g);
        this.h = false;
        this.a.limit(this.a.capacity());
    }
    
    public bfd a(final double \u2603, final double \u2603) {
        final int n = this.e * this.m.g() + this.m.d(this.g);
        switch (bfd$2.a[this.f.a().ordinal()]) {
            case 1: {
                this.a.putFloat(n, (float)\u2603);
                this.a.putFloat(n + 4, (float)\u2603);
                break;
            }
            case 2:
            case 3: {
                this.a.putInt(n, (int)\u2603);
                this.a.putInt(n + 4, (int)\u2603);
                break;
            }
            case 4:
            case 5: {
                this.a.putShort(n, (short)\u2603);
                this.a.putShort(n + 2, (short)\u2603);
                break;
            }
            case 6:
            case 7: {
                this.a.put(n, (byte)\u2603);
                this.a.put(n + 1, (byte)\u2603);
                break;
            }
        }
        this.k();
        return this;
    }
    
    public bfd a(final int \u2603, final int \u2603) {
        final int n = this.e * this.m.g() + this.m.d(this.g);
        switch (bfd$2.a[this.f.a().ordinal()]) {
            case 1: {
                this.a.putFloat(n, (float)\u2603);
                this.a.putFloat(n + 4, (float)\u2603);
                break;
            }
            case 2:
            case 3: {
                this.a.putInt(n, \u2603);
                this.a.putInt(n + 4, \u2603);
                break;
            }
            case 4:
            case 5: {
                this.a.putShort(n, (short)\u2603);
                this.a.putShort(n + 2, (short)\u2603);
                break;
            }
            case 6:
            case 7: {
                this.a.put(n, (byte)\u2603);
                this.a.put(n + 1, (byte)\u2603);
                break;
            }
        }
        this.k();
        return this;
    }
    
    public void a(final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        final int n = (this.e - 4) * this.m.f() + this.m.b(1) / 4;
        final int n2 = this.m.g() >> 2;
        this.b.put(n, \u2603);
        this.b.put(n + n2, \u2603);
        this.b.put(n + n2 * 2, \u2603);
        this.b.put(n + n2 * 3, \u2603);
    }
    
    public void a(final double \u2603, final double \u2603, final double \u2603) {
        final int f = this.m.f();
        final int n = (this.e - 4) * f;
        for (int i = 0; i < 4; ++i) {
            final int n2 = n + i * f;
            final int n3 = n2 + 1;
            final int n4 = n3 + 1;
            this.b.put(n2, Float.floatToRawIntBits((float)(\u2603 + this.j) + Float.intBitsToFloat(this.b.get(n2))));
            this.b.put(n3, Float.floatToRawIntBits((float)(\u2603 + this.k) + Float.intBitsToFloat(this.b.get(n3))));
            this.b.put(n4, Float.floatToRawIntBits((float)(\u2603 + this.l) + Float.intBitsToFloat(this.b.get(n4))));
        }
    }
    
    private int c(final int \u2603) {
        return ((this.e - \u2603) * this.m.g() + this.m.e()) / 4;
    }
    
    public void a(final float \u2603, final float \u2603, final float \u2603, final int \u2603) {
        final int c = this.c(\u2603);
        int value = -1;
        if (!this.h) {
            value = this.b.get(c);
            if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
                final int n = (int)((value & 0xFF) * \u2603);
                final int n2 = (int)((value >> 8 & 0xFF) * \u2603);
                final int n3 = (int)((value >> 16 & 0xFF) * \u2603);
                value &= 0xFF000000;
                value |= (n3 << 16 | n2 << 8 | n);
            }
            else {
                final int n = (int)((value >> 24 & 0xFF) * \u2603);
                final int n2 = (int)((value >> 16 & 0xFF) * \u2603);
                final int n3 = (int)((value >> 8 & 0xFF) * \u2603);
                value &= 0xFF;
                value |= (n << 24 | n2 << 16 | n3 << 8);
            }
        }
        this.b.put(c, value);
    }
    
    private void b(final int \u2603, final int \u2603) {
        final int c = this.c(\u2603);
        final int \u26032 = \u2603 >> 16 & 0xFF;
        final int \u26033 = \u2603 >> 8 & 0xFF;
        final int \u26034 = \u2603 & 0xFF;
        final int \u26035 = \u2603 >> 24 & 0xFF;
        this.a(c, \u26032, \u26033, \u26034, \u26035);
    }
    
    public void b(final float \u2603, final float \u2603, final float \u2603, final int \u2603) {
        final int c = this.c(\u2603);
        final int a = ns.a((int)(\u2603 * 255.0f), 0, 255);
        final int a2 = ns.a((int)(\u2603 * 255.0f), 0, 255);
        final int a3 = ns.a((int)(\u2603 * 255.0f), 0, 255);
        this.a(c, a, a2, a3, 255);
    }
    
    private void a(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
            this.b.put(\u2603, \u2603 << 24 | \u2603 << 16 | \u2603 << 8 | \u2603);
        }
        else {
            this.b.put(\u2603, \u2603 << 24 | \u2603 << 16 | \u2603 << 8 | \u2603);
        }
    }
    
    public void c() {
        this.h = true;
    }
    
    public bfd a(final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        return this.b((int)(\u2603 * 255.0f), (int)(\u2603 * 255.0f), (int)(\u2603 * 255.0f), (int)(\u2603 * 255.0f));
    }
    
    public bfd b(final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        if (this.h) {
            return this;
        }
        final int n = this.e * this.m.g() + this.m.d(this.g);
        switch (bfd$2.a[this.f.a().ordinal()]) {
            case 1: {
                this.a.putFloat(n, \u2603 / 255.0f);
                this.a.putFloat(n + 4, \u2603 / 255.0f);
                this.a.putFloat(n + 8, \u2603 / 255.0f);
                this.a.putFloat(n + 12, \u2603 / 255.0f);
                break;
            }
            case 2:
            case 3: {
                this.a.putFloat(n, (float)\u2603);
                this.a.putFloat(n + 4, (float)\u2603);
                this.a.putFloat(n + 8, (float)\u2603);
                this.a.putFloat(n + 12, (float)\u2603);
                break;
            }
            case 4:
            case 5: {
                this.a.putShort(n, (short)\u2603);
                this.a.putShort(n + 2, (short)\u2603);
                this.a.putShort(n + 4, (short)\u2603);
                this.a.putShort(n + 6, (short)\u2603);
                break;
            }
            case 6:
            case 7: {
                if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
                    this.a.put(n, (byte)\u2603);
                    this.a.put(n + 1, (byte)\u2603);
                    this.a.put(n + 2, (byte)\u2603);
                    this.a.put(n + 3, (byte)\u2603);
                    break;
                }
                this.a.put(n, (byte)\u2603);
                this.a.put(n + 1, (byte)\u2603);
                this.a.put(n + 2, (byte)\u2603);
                this.a.put(n + 3, (byte)\u2603);
                break;
            }
        }
        this.k();
        return this;
    }
    
    public void a(final int[] \u2603) {
        this.b(\u2603.length);
        this.b.position(this.j());
        this.b.put(\u2603);
        this.e += \u2603.length / this.m.f();
    }
    
    public void d() {
        ++this.e;
        this.b(this.m.f());
    }
    
    public bfd b(final double \u2603, final double \u2603, final double \u2603) {
        final int n = this.e * this.m.g() + this.m.d(this.g);
        switch (bfd$2.a[this.f.a().ordinal()]) {
            case 1: {
                this.a.putFloat(n, (float)(\u2603 + this.j));
                this.a.putFloat(n + 4, (float)(\u2603 + this.k));
                this.a.putFloat(n + 8, (float)(\u2603 + this.l));
                break;
            }
            case 2:
            case 3: {
                this.a.putInt(n, Float.floatToRawIntBits((float)(\u2603 + this.j)));
                this.a.putInt(n + 4, Float.floatToRawIntBits((float)(\u2603 + this.k)));
                this.a.putInt(n + 8, Float.floatToRawIntBits((float)(\u2603 + this.l)));
                break;
            }
            case 4:
            case 5: {
                this.a.putShort(n, (short)(\u2603 + this.j));
                this.a.putShort(n + 2, (short)(\u2603 + this.k));
                this.a.putShort(n + 4, (short)(\u2603 + this.l));
                break;
            }
            case 6:
            case 7: {
                this.a.put(n, (byte)(\u2603 + this.j));
                this.a.put(n + 1, (byte)(\u2603 + this.k));
                this.a.put(n + 2, (byte)(\u2603 + this.l));
                break;
            }
        }
        this.k();
        return this;
    }
    
    public void b(final float \u2603, final float \u2603, final float \u2603) {
        final int n = (byte)(\u2603 * 127.0f) & 0xFF;
        final int n2 = (byte)(\u2603 * 127.0f) & 0xFF;
        final int n3 = (byte)(\u2603 * 127.0f) & 0xFF;
        final int n4 = n | n2 << 8 | n3 << 16;
        final int n5 = this.m.g() >> 2;
        final int n6 = (this.e - 4) * n5 + this.m.c() / 4;
        this.b.put(n6, n4);
        this.b.put(n6 + n5, n4);
        this.b.put(n6 + n5 * 2, n4);
        this.b.put(n6 + n5 * 3, n4);
    }
    
    private void k() {
        ++this.g;
        this.g %= this.m.i();
        this.f = this.m.c(this.g);
        if (this.f.b() == bmv.b.g) {
            this.k();
        }
    }
    
    public bfd c(final float \u2603, final float \u2603, final float \u2603) {
        final int n = this.e * this.m.g() + this.m.d(this.g);
        switch (bfd$2.a[this.f.a().ordinal()]) {
            case 1: {
                this.a.putFloat(n, \u2603);
                this.a.putFloat(n + 4, \u2603);
                this.a.putFloat(n + 8, \u2603);
                break;
            }
            case 2:
            case 3: {
                this.a.putInt(n, (int)\u2603);
                this.a.putInt(n + 4, (int)\u2603);
                this.a.putInt(n + 8, (int)\u2603);
                break;
            }
            case 4:
            case 5: {
                this.a.putShort(n, (short)((int)\u2603 * 32767 & 0xFFFF));
                this.a.putShort(n + 2, (short)((int)\u2603 * 32767 & 0xFFFF));
                this.a.putShort(n + 4, (short)((int)\u2603 * 32767 & 0xFFFF));
                break;
            }
            case 6:
            case 7: {
                this.a.put(n, (byte)((int)\u2603 * 127 & 0xFF));
                this.a.put(n + 1, (byte)((int)\u2603 * 127 & 0xFF));
                this.a.put(n + 2, (byte)((int)\u2603 * 127 & 0xFF));
                break;
            }
        }
        this.k();
        return this;
    }
    
    public void c(final double \u2603, final double \u2603, final double \u2603) {
        this.j = \u2603;
        this.k = \u2603;
        this.l = \u2603;
    }
    
    public void e() {
        if (!this.n) {
            throw new IllegalStateException("Not building!");
        }
        this.n = false;
        this.a.position(0);
        this.a.limit(this.j() * 4);
    }
    
    public ByteBuffer f() {
        return this.a;
    }
    
    public bmu g() {
        return this.m;
    }
    
    public int h() {
        return this.e;
    }
    
    public int i() {
        return this.i;
    }
    
    public void a(final int \u2603) {
        for (int i = 0; i < 4; ++i) {
            this.b(\u2603, i + 1);
        }
    }
    
    public void d(final float \u2603, final float \u2603, final float \u2603) {
        for (int i = 0; i < 4; ++i) {
            this.b(\u2603, \u2603, \u2603, i + 1);
        }
    }
    
    public class a
    {
        private final int[] b;
        private final bmu c;
        
        public a(final int[] \u2603, final bmu \u2603) {
            this.b = \u2603;
            this.c = \u2603;
        }
        
        public int[] a() {
            return this.b;
        }
        
        public int b() {
            return this.b.length / this.c.f();
        }
        
        public bmu c() {
            return this.c;
        }
    }
}
