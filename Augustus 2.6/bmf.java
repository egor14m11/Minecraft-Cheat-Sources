import java.util.Iterator;
import java.util.Arrays;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;

// 
// Decompiled by Procyon v0.5.36
// 

public class bmf
{
    private final int a;
    private final Set<a> b;
    private final List<b> c;
    private int d;
    private int e;
    private final int f;
    private final int g;
    private final boolean h;
    private final int i;
    
    public bmf(final int \u2603, final int \u2603, final boolean \u2603, final int \u2603, final int \u2603) {
        this.b = (Set<a>)Sets.newHashSetWithExpectedSize(256);
        this.c = (List<b>)Lists.newArrayListWithCapacity(256);
        this.a = \u2603;
        this.f = \u2603;
        this.g = \u2603;
        this.h = \u2603;
        this.i = \u2603;
    }
    
    public int a() {
        return this.d;
    }
    
    public int b() {
        return this.e;
    }
    
    public void a(final bmi \u2603) {
        final a a = new a(\u2603, this.a);
        if (this.i > 0) {
            a.a(this.i);
        }
        this.b.add(a);
    }
    
    public void c() {
        final a[] a = this.b.toArray(new a[this.b.size()]);
        Arrays.sort(a);
        for (final a a2 : a) {
            if (!this.a(a2)) {
                final String format = String.format("Unable to fit: %s - size: %dx%d - Maybe try a lowerresolution resourcepack?", a2.a().i(), a2.a().c(), a2.a().d());
                throw new bmg(a2, format);
            }
        }
        if (this.h) {
            this.d = ns.b(this.d);
            this.e = ns.b(this.e);
        }
    }
    
    public List<bmi> d() {
        final List<b> arrayList = (List<b>)Lists.newArrayList();
        for (final b b : this.c) {
            b.a(arrayList);
        }
        final List<bmi> arrayList2 = (List<bmi>)Lists.newArrayList();
        for (final b b2 : arrayList) {
            final a a = b2.a();
            final bmi a2 = a.a();
            a2.a(this.d, this.e, b2.b(), b2.c(), a.e());
            arrayList2.add(a2);
        }
        return arrayList2;
    }
    
    private static int b(final int \u2603, final int \u2603) {
        return (\u2603 >> \u2603) + (((\u2603 & (1 << \u2603) - 1) != 0x0) ? 1 : 0) << \u2603;
    }
    
    private boolean a(final a \u2603) {
        for (int i = 0; i < this.c.size(); ++i) {
            if (this.c.get(i).a(\u2603)) {
                return true;
            }
            \u2603.d();
            if (this.c.get(i).a(\u2603)) {
                return true;
            }
            \u2603.d();
        }
        return this.b(\u2603);
    }
    
    private boolean b(final a \u2603) {
        final int min = Math.min(\u2603.b(), \u2603.c());
        final boolean b = this.d == 0 && this.e == 0;
        boolean b9;
        if (this.h) {
            final int n = ns.b(this.d);
            final int b2 = ns.b(this.e);
            final int b3 = ns.b(this.d + min);
            final int b4 = ns.b(this.e + min);
            final boolean b5 = b3 <= this.f;
            final boolean b6 = b4 <= this.g;
            if (!b5 && !b6) {
                return false;
            }
            final boolean b7 = n != b3;
            final boolean b8 = b2 != b4;
            if (b7 ^ b8) {
                b9 = !b7;
            }
            else {
                b9 = (b5 && n <= b2);
            }
        }
        else {
            final boolean b10 = this.d + min <= this.f;
            final boolean b11 = this.e + min <= this.g;
            if (!b10 && !b11) {
                return false;
            }
            b9 = (b10 && (b || this.d <= this.e));
        }
        final int n = Math.max(\u2603.b(), \u2603.c());
        if (ns.b((b9 ? this.e : this.d) + n) > (b9 ? this.g : this.f)) {
            return false;
        }
        b b12;
        if (b9) {
            if (\u2603.b() > \u2603.c()) {
                \u2603.d();
            }
            if (this.e == 0) {
                this.e = \u2603.c();
            }
            b12 = new b(this.d, 0, \u2603.b(), this.e);
            this.d += \u2603.b();
        }
        else {
            b12 = new b(0, this.e, this.d, \u2603.c());
            this.e += \u2603.c();
        }
        b12.a(\u2603);
        this.c.add(b12);
        return true;
    }
    
    public static class a implements Comparable<a>
    {
        private final bmi a;
        private final int b;
        private final int c;
        private final int d;
        private boolean e;
        private float f;
        
        public a(final bmi \u2603, final int \u2603) {
            this.f = 1.0f;
            this.a = \u2603;
            this.b = \u2603.c();
            this.c = \u2603.d();
            this.d = \u2603;
            this.e = (b(this.c, \u2603) > b(this.b, \u2603));
        }
        
        public bmi a() {
            return this.a;
        }
        
        public int b() {
            return this.e ? b((int)(this.c * this.f), this.d) : b((int)(this.b * this.f), this.d);
        }
        
        public int c() {
            return this.e ? b((int)(this.b * this.f), this.d) : b((int)(this.c * this.f), this.d);
        }
        
        public void d() {
            this.e = !this.e;
        }
        
        public boolean e() {
            return this.e;
        }
        
        public void a(final int \u2603) {
            if (this.b <= \u2603 || this.c <= \u2603) {
                return;
            }
            this.f = \u2603 / (float)Math.min(this.b, this.c);
        }
        
        @Override
        public String toString() {
            return "Holder{width=" + this.b + ", height=" + this.c + '}';
        }
        
        public int a(final a \u2603) {
            int n;
            if (this.c() == \u2603.c()) {
                if (this.b() == \u2603.b()) {
                    if (this.a.i() == null) {
                        return (\u2603.a.i() == null) ? 0 : -1;
                    }
                    return this.a.i().compareTo(\u2603.a.i());
                }
                else {
                    n = ((this.b() < \u2603.b()) ? 1 : -1);
                }
            }
            else {
                n = ((this.c() < \u2603.c()) ? 1 : -1);
            }
            return n;
        }
    }
    
    public static class b
    {
        private final int a;
        private final int b;
        private final int c;
        private final int d;
        private List<b> e;
        private a f;
        
        public b(final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
            this.a = \u2603;
            this.b = \u2603;
            this.c = \u2603;
            this.d = \u2603;
        }
        
        public a a() {
            return this.f;
        }
        
        public int b() {
            return this.a;
        }
        
        public int c() {
            return this.b;
        }
        
        public boolean a(final a \u2603) {
            if (this.f != null) {
                return false;
            }
            final int b = \u2603.b();
            final int c = \u2603.c();
            if (b > this.c || c > this.d) {
                return false;
            }
            if (b == this.c && c == this.d) {
                this.f = \u2603;
                return true;
            }
            if (this.e == null) {
                (this.e = (List<b>)Lists.newArrayListWithCapacity(1)).add(new b(this.a, this.b, b, c));
                final int n = this.c - b;
                final int n2 = this.d - c;
                if (n2 > 0 && n > 0) {
                    final int max = Math.max(this.d, n);
                    final int max2 = Math.max(this.c, n2);
                    if (max >= max2) {
                        this.e.add(new b(this.a, this.b + c, b, n2));
                        this.e.add(new b(this.a + b, this.b, n, this.d));
                    }
                    else {
                        this.e.add(new b(this.a + b, this.b, n, c));
                        this.e.add(new b(this.a, this.b + c, this.c, n2));
                    }
                }
                else if (n == 0) {
                    this.e.add(new b(this.a, this.b + c, b, n2));
                }
                else if (n2 == 0) {
                    this.e.add(new b(this.a + b, this.b, n, c));
                }
            }
            for (final b b2 : this.e) {
                if (b2.a(\u2603)) {
                    return true;
                }
            }
            return false;
        }
        
        public void a(final List<b> \u2603) {
            if (this.f != null) {
                \u2603.add(this);
            }
            else if (this.e != null) {
                for (final b b : this.e) {
                    b.a(\u2603);
                }
            }
        }
        
        @Override
        public String toString() {
            return "Slot{originX=" + this.a + ", originY=" + this.b + ", width=" + this.c + ", height=" + this.d + ", texture=" + this.f + ", subSlots=" + this.e + '}';
        }
    }
}
