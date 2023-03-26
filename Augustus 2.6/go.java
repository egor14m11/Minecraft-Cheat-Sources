import java.util.Iterator;
import java.util.List;
import com.google.common.collect.Lists;
import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class go implements ff<fj>
{
    private int a;
    private int b;
    private a c;
    private boolean d;
    
    public go() {
    }
    
    public go(final amy \u2603, final boolean \u2603, final int \u2603) {
        this.a = \u2603.a;
        this.b = \u2603.b;
        this.d = \u2603;
        this.c = a(\u2603, \u2603, !\u2603.p().t.o(), \u2603);
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.readInt();
        this.b = \u2603.readInt();
        this.d = \u2603.readBoolean();
        this.c = new a();
        this.c.b = \u2603.readShort();
        this.c.a = \u2603.a();
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.writeInt(this.a);
        \u2603.writeInt(this.b);
        \u2603.writeBoolean(this.d);
        \u2603.writeShort((short)(this.c.b & 0xFFFF));
        \u2603.a(this.c.a);
    }
    
    @Override
    public void a(final fj \u2603) {
        \u2603.a(this);
    }
    
    public byte[] a() {
        return this.c.a;
    }
    
    protected static int a(final int \u2603, final boolean \u2603, final boolean \u2603) {
        final int n = \u2603 * 2 * 16 * 16 * 16;
        final int n2 = \u2603 * 16 * 16 * 16 / 2;
        final int n3 = \u2603 ? (\u2603 * 16 * 16 * 16 / 2) : 0;
        final int n4 = \u2603 ? 256 : 0;
        return n + n2 + n3 + n4;
    }
    
    public static a a(final amy \u2603, final boolean \u2603, final boolean \u2603, final int \u2603) {
        final amz[] h = \u2603.h();
        final a a = new a();
        final List<amz> arrayList = (List<amz>)Lists.newArrayList();
        for (int i = 0; i < h.length; ++i) {
            final amz amz = h[i];
            if (amz != null && (!\u2603 || !amz.a()) && (\u2603 & 1 << i) != 0x0) {
                final a a2 = a;
                a2.b |= 1 << i;
                arrayList.add(amz);
            }
        }
        a.a = new byte[a(Integer.bitCount(a.b), \u2603, \u2603)];
        int i = 0;
        for (final amz amz2 : arrayList) {
            final char[] g;
            final char[] array = g = amz2.g();
            for (final char c : g) {
                a.a[i++] = (byte)(c & '\u00ff');
                a.a[i++] = (byte)(c >> 8 & 0xFF);
            }
        }
        for (final amz amz2 : arrayList) {
            i = a(amz2.h().a(), a.a, i);
        }
        if (\u2603) {
            for (final amz amz2 : arrayList) {
                i = a(amz2.i().a(), a.a, i);
            }
        }
        if (\u2603) {
            a(\u2603.k(), a.a, i);
        }
        return a;
    }
    
    private static int a(final byte[] \u2603, final byte[] \u2603, final int \u2603) {
        System.arraycopy(\u2603, 0, \u2603, \u2603, \u2603.length);
        return \u2603 + \u2603.length;
    }
    
    public int b() {
        return this.a;
    }
    
    public int c() {
        return this.b;
    }
    
    public int d() {
        return this.c.b;
    }
    
    public boolean e() {
        return this.d;
    }
    
    public static class a
    {
        public byte[] a;
        public int b;
    }
}
