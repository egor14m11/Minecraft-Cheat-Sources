// 
// Decompiled by Procyon v0.5.36
// 

public class nq<V>
{
    private transient a<V>[] a;
    private transient int b;
    private int c;
    private int d;
    private final float e;
    private transient volatile int f;
    
    public nq() {
        this.e = 0.75f;
        this.d = 3072;
        this.a = (a<V>[])new a[4096];
        this.c = this.a.length - 1;
    }
    
    private static int g(final long \u2603) {
        return a((int)(\u2603 ^ \u2603 >>> 32));
    }
    
    private static int a(int \u2603) {
        \u2603 ^= (\u2603 >>> 20 ^ \u2603 >>> 12);
        return \u2603 ^ \u2603 >>> 7 ^ \u2603 >>> 4;
    }
    
    private static int a(final int \u2603, final int \u2603) {
        return \u2603 & \u2603;
    }
    
    public int a() {
        return this.b;
    }
    
    public V a(final long \u2603) {
        final int g = g(\u2603);
        for (a<V> c = this.a[a(g, this.c)]; c != null; c = c.c) {
            if (c.a == \u2603) {
                return c.b;
            }
        }
        return null;
    }
    
    public boolean b(final long \u2603) {
        return this.c(\u2603) != null;
    }
    
    final a<V> c(final long \u2603) {
        final int g = g(\u2603);
        for (a<V> c = this.a[a(g, this.c)]; c != null; c = c.c) {
            if (c.a == \u2603) {
                return c;
            }
        }
        return null;
    }
    
    public void a(final long \u2603, final V \u2603) {
        final int g = g(\u2603);
        final int a = a(g, this.c);
        for (a<V> c = this.a[a]; c != null; c = c.c) {
            if (c.a == \u2603) {
                c.b = \u2603;
                return;
            }
        }
        ++this.f;
        this.a(g, \u2603, \u2603, a);
    }
    
    private void b(final int \u2603) {
        final a<V>[] a = this.a;
        final int length = a.length;
        if (length == 1073741824) {
            this.d = Integer.MAX_VALUE;
            return;
        }
        final a<V>[] array = (a<V>[])new a[\u2603];
        this.a(array);
        this.a = array;
        this.c = this.a.length - 1;
        this.d = (int)(\u2603 * this.e);
    }
    
    private void a(final a<V>[] \u2603) {
        final a<V>[] a = this.a;
        final int length = \u2603.length;
        for (int i = 0; i < a.length; ++i) {
            a<V> a2 = a[i];
            if (a2 != null) {
                a[i] = null;
                do {
                    final a<V> c = a2.c;
                    final int a3 = a(a2.d, length - 1);
                    a2.c = \u2603[a3];
                    \u2603[a3] = a2;
                    a2 = c;
                } while (a2 != null);
            }
        }
    }
    
    public V d(final long \u2603) {
        final a<V> e = this.e(\u2603);
        return (e == null) ? null : e.b;
    }
    
    final a<V> e(final long \u2603) {
        final int g = g(\u2603);
        final int a = a(g, this.c);
        a<V> a3;
        a<V> c;
        for (a<V> a2 = a3 = this.a[a]; a3 != null; a3 = c) {
            c = a3.c;
            if (a3.a == \u2603) {
                ++this.f;
                --this.b;
                if (a2 == a3) {
                    this.a[a] = c;
                }
                else {
                    a2.c = c;
                }
                return a3;
            }
            a2 = a3;
        }
        return a3;
    }
    
    private void a(final int \u2603, final long \u2603, final V \u2603, final int \u2603) {
        final a<V> \u26032 = this.a[\u2603];
        this.a[\u2603] = new a<V>(\u2603, \u2603, \u2603, \u26032);
        if (this.b++ >= this.d) {
            this.b(2 * this.a.length);
        }
    }
    
    static class a<V>
    {
        final long a;
        V b;
        a<V> c;
        final int d;
        
        a(final int \u2603, final long \u2603, final V \u2603, final a<V> \u2603) {
            this.b = \u2603;
            this.c = \u2603;
            this.a = \u2603;
            this.d = \u2603;
        }
        
        public final long a() {
            return this.a;
        }
        
        public final V b() {
            return this.b;
        }
        
        @Override
        public final boolean equals(final Object \u2603) {
            if (!(\u2603 instanceof a)) {
                return false;
            }
            final a<V> a = (a<V>)\u2603;
            final Object value = this.a();
            final Object value2 = a.a();
            if (value == value2 || (value != null && value.equals(value2))) {
                final Object b = this.b();
                final Object b2 = a.b();
                if (b == b2 || (b != null && b.equals(b2))) {
                    return true;
                }
            }
            return false;
        }
        
        @Override
        public final int hashCode() {
            return g(this.a);
        }
        
        @Override
        public final String toString() {
            return this.a() + "=" + this.b();
        }
    }
}
