import com.google.common.base.Objects;
import com.google.common.base.Predicates;
import com.google.common.base.Predicate;
import java.util.Iterator;
import com.google.common.collect.Lists;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class awg extends awd
{
    private final List<d> u;
    private final nm<avp> v;
    private final List<avw> w;
    private final f[][] x;
    private int y;
    private b z;
    private avp A;
    
    public awg(final ave \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final b \u2603, final f[]... \u2603) {
        super(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        this.u = (List<d>)Lists.newArrayList();
        this.v = new nm<avp>();
        this.w = (List<avw>)Lists.newArrayList();
        this.z = \u2603;
        this.x = \u2603;
        this.k = false;
        this.s();
        this.t();
    }
    
    private void s() {
        for (final f[] array : this.x) {
            for (int j = 0; j < array.length; j += 2) {
                final f \u2603 = array[j];
                final f \u26032 = (j < array.length - 1) ? array[j + 1] : null;
                final avp a = this.a(\u2603, 0, \u26032 == null);
                final avp a2 = this.a(\u26032, 160, \u2603 == null);
                final d d = new d(a, a2);
                this.u.add(d);
                if (\u2603 != null && a != null) {
                    this.v.a(\u2603.b(), a);
                    if (a instanceof avw) {
                        this.w.add((avw)a);
                    }
                }
                if (\u26032 != null && a2 != null) {
                    this.v.a(\u26032.b(), a2);
                    if (a2 instanceof avw) {
                        this.w.add((avw)a2);
                    }
                }
            }
        }
    }
    
    private void t() {
        this.u.clear();
        for (int i = 0; i < this.x[this.y].length; i += 2) {
            final f f = this.x[this.y][i];
            final f f2 = (i < this.x[this.y].length - 1) ? this.x[this.y][i + 1] : null;
            final avp \u2603 = this.v.a(f.b());
            final avp \u26032 = (f2 != null) ? this.v.a(f2.b()) : null;
            final d d = new d(\u2603, \u26032);
            this.u.add(d);
        }
    }
    
    public void c(final int \u2603) {
        if (\u2603 == this.y) {
            return;
        }
        final int y = this.y;
        this.y = \u2603;
        this.t();
        this.e(y, \u2603);
        this.n = 0.0f;
    }
    
    public int e() {
        return this.y;
    }
    
    public int f() {
        return this.x.length;
    }
    
    public avp g() {
        return this.A;
    }
    
    public void h() {
        if (this.y > 0) {
            this.c(this.y - 1);
        }
    }
    
    public void i() {
        if (this.y < this.x.length - 1) {
            this.c(this.y + 1);
        }
    }
    
    public avp d(final int \u2603) {
        return this.v.a(\u2603);
    }
    
    private void e(final int \u2603, final int \u2603) {
        for (final f f : this.x[\u2603]) {
            if (f != null) {
                this.a(this.v.a(f.b()), false);
            }
        }
        for (final f f : this.x[\u2603]) {
            if (f != null) {
                this.a(this.v.a(f.b()), true);
            }
        }
    }
    
    private void a(final avp \u2603, final boolean \u2603) {
        if (\u2603 instanceof avs) {
            ((avs)\u2603).m = \u2603;
        }
        else if (\u2603 instanceof avw) {
            ((avw)\u2603).e(\u2603);
        }
        else if (\u2603 instanceof avy) {
            ((avy)\u2603).j = \u2603;
        }
    }
    
    private avp a(final f \u2603, final int \u2603, final boolean \u2603) {
        if (\u2603 instanceof g) {
            return this.a(this.b / 2 - 155 + \u2603, 0, (g)\u2603);
        }
        if (\u2603 instanceof a) {
            return this.a(this.b / 2 - 155 + \u2603, 0, (a)\u2603);
        }
        if (\u2603 instanceof c) {
            return this.a(this.b / 2 - 155 + \u2603, 0, (c)\u2603);
        }
        if (\u2603 instanceof e) {
            return this.a(this.b / 2 - 155 + \u2603, 0, (e)\u2603, \u2603);
        }
        return null;
    }
    
    public void a(final boolean \u2603) {
        for (final d d : this.u) {
            if (d.b instanceof avs) {
                ((avs)d.b).l = \u2603;
            }
            if (d.c instanceof avs) {
                ((avs)d.c).l = \u2603;
            }
        }
    }
    
    @Override
    public boolean b(final int \u2603, final int \u2603, final int \u2603) {
        final boolean b = super.b(\u2603, \u2603, \u2603);
        final int c = this.c(\u2603, \u2603);
        if (c >= 0) {
            final d e = this.e(c);
            if (this.A != e.d && this.A != null && this.A instanceof avw) {
                ((avw)this.A).b(false);
            }
            this.A = e.d;
        }
        return b;
    }
    
    private avx a(final int \u2603, final int \u2603, final g \u2603) {
        final avx avx = new avx(this.z, \u2603.b(), \u2603, \u2603, \u2603.c(), \u2603.e(), \u2603.f(), \u2603.g(), \u2603.a());
        avx.m = \u2603.d();
        return avx;
    }
    
    private awb a(final int \u2603, final int \u2603, final a \u2603) {
        final awb awb = new awb(this.z, \u2603.b(), \u2603, \u2603, \u2603.c(), \u2603.a());
        awb.m = \u2603.d();
        return awb;
    }
    
    private avw a(final int \u2603, final int \u2603, final c \u2603) {
        final avw avw = new avw(\u2603.b(), this.a.k, \u2603, \u2603, 150, 20);
        avw.a(\u2603.c());
        avw.a(this.z);
        avw.e(\u2603.d());
        avw.a(\u2603.a());
        return avw;
    }
    
    private avy a(final int \u2603, final int \u2603, final e \u2603, final boolean \u2603) {
        avy avy;
        if (\u2603) {
            avy = new avy(this.a.k, \u2603.b(), \u2603, \u2603, this.b - \u2603 * 2, 20, -1);
        }
        else {
            avy = new avy(this.a.k, \u2603.b(), \u2603, \u2603, 150, 20, -1);
        }
        avy.j = \u2603.d();
        avy.a(\u2603.c());
        avy.a();
        return avy;
    }
    
    public void a(final char \u2603, final int \u2603) {
        if (!(this.A instanceof avw)) {
            return;
        }
        avw avw = (avw)this.A;
        if (axu.e(\u2603)) {
            final String o = axu.o();
            final String[] split = o.split(";");
            int index;
            final int f = index = this.w.indexOf(this.A);
            for (final String \u26032 : split) {
                this.w.get(index).a(\u26032);
                if (index == this.w.size() - 1) {
                    index = 0;
                }
                else {
                    ++index;
                }
                if (index == f) {
                    break;
                }
            }
            return;
        }
        if (\u2603 == 15) {
            avw.b(false);
            int index2 = this.w.indexOf(this.A);
            if (axu.r()) {
                if (index2 == 0) {
                    index2 = this.w.size() - 1;
                }
                else {
                    --index2;
                }
            }
            else if (index2 == this.w.size() - 1) {
                index2 = 0;
            }
            else {
                ++index2;
            }
            this.A = this.w.get(index2);
            avw = (avw)this.A;
            avw.b(true);
            final int n = avw.f + this.h;
            final int f = avw.f;
            if (n > this.e) {
                this.n += n - this.e;
            }
            else if (f < this.d) {
                this.n = (float)f;
            }
        }
        else {
            avw.a(\u2603, \u2603);
        }
    }
    
    public d e(final int \u2603) {
        return this.u.get(\u2603);
    }
    
    public int b() {
        return this.u.size();
    }
    
    @Override
    public int c() {
        return 400;
    }
    
    @Override
    protected int d() {
        return super.d() + 32;
    }
    
    public static class d implements awd.a
    {
        private final ave a;
        private final avp b;
        private final avp c;
        private avp d;
        
        public d(final avp \u2603, final avp \u2603) {
            this.a = ave.A();
            this.b = \u2603;
            this.c = \u2603;
        }
        
        public avp a() {
            return this.b;
        }
        
        public avp b() {
            return this.c;
        }
        
        @Override
        public void a(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final boolean \u2603) {
            this.a(this.b, \u2603, \u2603, \u2603, false);
            this.a(this.c, \u2603, \u2603, \u2603, false);
        }
        
        private void a(final avp \u2603, final int \u2603, final int \u2603, final int \u2603, final boolean \u2603) {
            if (\u2603 == null) {
                return;
            }
            if (\u2603 instanceof avs) {
                this.a((avs)\u2603, \u2603, \u2603, \u2603, \u2603);
            }
            else if (\u2603 instanceof avw) {
                this.a((avw)\u2603, \u2603, \u2603);
            }
            else if (\u2603 instanceof avy) {
                this.a((avy)\u2603, \u2603, \u2603, \u2603, \u2603);
            }
        }
        
        private void a(final avs \u2603, final int \u2603, final int \u2603, final int \u2603, final boolean \u2603) {
            \u2603.i = \u2603;
            if (!\u2603) {
                \u2603.a(this.a, \u2603, \u2603);
            }
        }
        
        private void a(final avw \u2603, final int \u2603, final boolean \u2603) {
            \u2603.f = \u2603;
            if (!\u2603) {
                \u2603.g();
            }
        }
        
        private void a(final avy \u2603, final int \u2603, final int \u2603, final int \u2603, final boolean \u2603) {
            \u2603.h = \u2603;
            if (!\u2603) {
                \u2603.a(this.a, \u2603, \u2603);
            }
        }
        
        @Override
        public void a(final int \u2603, final int \u2603, final int \u2603) {
            this.a(this.b, \u2603, 0, 0, true);
            this.a(this.c, \u2603, 0, 0, true);
        }
        
        @Override
        public boolean a(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
            final boolean a = this.a(this.b, \u2603, \u2603, \u2603);
            final boolean a2 = this.a(this.c, \u2603, \u2603, \u2603);
            return a || a2;
        }
        
        private boolean a(final avp \u2603, final int \u2603, final int \u2603, final int \u2603) {
            if (\u2603 == null) {
                return false;
            }
            if (\u2603 instanceof avs) {
                return this.a((avs)\u2603, \u2603, \u2603, \u2603);
            }
            if (\u2603 instanceof avw) {
                this.a((avw)\u2603, \u2603, \u2603, \u2603);
            }
            return false;
        }
        
        private boolean a(final avs \u2603, final int \u2603, final int \u2603, final int \u2603) {
            final boolean c = \u2603.c(this.a, \u2603, \u2603);
            if (c) {
                this.d = \u2603;
            }
            return c;
        }
        
        private void a(final avw \u2603, final int \u2603, final int \u2603, final int \u2603) {
            \u2603.a(\u2603, \u2603, \u2603);
            if (\u2603.m()) {
                this.d = \u2603;
            }
        }
        
        @Override
        public void b(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
            this.b(this.b, \u2603, \u2603, \u2603);
            this.b(this.c, \u2603, \u2603, \u2603);
        }
        
        private void b(final avp \u2603, final int \u2603, final int \u2603, final int \u2603) {
            if (\u2603 == null) {
                return;
            }
            if (\u2603 instanceof avs) {
                this.b((avs)\u2603, \u2603, \u2603, \u2603);
            }
        }
        
        private void b(final avs \u2603, final int \u2603, final int \u2603, final int \u2603) {
            \u2603.a(\u2603, \u2603);
        }
    }
    
    public static class f
    {
        private final int a;
        private final String b;
        private final boolean c;
        
        public f(final int \u2603, final String \u2603, final boolean \u2603) {
            this.a = \u2603;
            this.b = \u2603;
            this.c = \u2603;
        }
        
        public int b() {
            return this.a;
        }
        
        public String c() {
            return this.b;
        }
        
        public boolean d() {
            return this.c;
        }
    }
    
    public static class g extends f
    {
        private final avx.a a;
        private final float b;
        private final float c;
        private final float d;
        
        public g(final int \u2603, final String \u2603, final boolean \u2603, final avx.a \u2603, final float \u2603, final float \u2603, final float \u2603) {
            super(\u2603, \u2603, \u2603);
            this.a = \u2603;
            this.b = \u2603;
            this.c = \u2603;
            this.d = \u2603;
        }
        
        public avx.a a() {
            return this.a;
        }
        
        public float e() {
            return this.b;
        }
        
        public float f() {
            return this.c;
        }
        
        public float g() {
            return this.d;
        }
    }
    
    public static class a extends f
    {
        private final boolean a;
        
        public a(final int \u2603, final String \u2603, final boolean \u2603, final boolean \u2603) {
            super(\u2603, \u2603, \u2603);
            this.a = \u2603;
        }
        
        public boolean a() {
            return this.a;
        }
    }
    
    public static class c extends f
    {
        private final Predicate<String> a;
        
        public c(final int \u2603, final String \u2603, final boolean \u2603, final Predicate<String> \u2603) {
            super(\u2603, \u2603, \u2603);
            this.a = (Predicate<String>)Objects.firstNonNull((Object)\u2603, (Object)Predicates.alwaysTrue());
        }
        
        public Predicate<String> a() {
            return this.a;
        }
    }
    
    public static class e extends f
    {
        public e(final int \u2603, final String \u2603, final boolean \u2603) {
            super(\u2603, \u2603, \u2603);
        }
    }
    
    public interface b
    {
        void a(final int p0, final boolean p1);
        
        void a(final int p0, final float p1);
        
        void a(final int p0, final String p1);
    }
}
