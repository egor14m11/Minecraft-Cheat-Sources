import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class baf
{
    private static final bah b;
    private static final bah c;
    private static final bah d;
    private static final bah e;
    public static final bah a;
    private final bai f;
    private final List<baj> g;
    private bag h;
    private int i;
    private int j;
    
    public baf(final bai \u2603) {
        this.g = (List<baj>)Lists.newArrayList();
        this.i = -1;
        this.h = new bae();
        this.f = \u2603;
    }
    
    public bah a(final int \u2603) {
        final int n = \u2603 + this.j * 6;
        if (this.j > 0 && \u2603 == 0) {
            return baf.c;
        }
        if (\u2603 == 7) {
            if (n < this.h.a().size()) {
                return baf.d;
            }
            return baf.e;
        }
        else {
            if (\u2603 == 8) {
                return baf.b;
            }
            if (n < 0 || n >= this.h.a().size()) {
                return baf.a;
            }
            return (bah)Objects.firstNonNull((Object)this.h.a().get(n), (Object)baf.a);
        }
    }
    
    public List<bah> a() {
        final List<bah> arrayList = (List<bah>)Lists.newArrayList();
        for (int i = 0; i <= 8; ++i) {
            arrayList.add(this.a(i));
        }
        return arrayList;
    }
    
    public bah b() {
        return this.a(this.i);
    }
    
    public bag c() {
        return this.h;
    }
    
    public void b(final int \u2603) {
        final bah a = this.a(\u2603);
        if (a != baf.a) {
            if (this.i == \u2603 && a.B_()) {
                a.a(this);
            }
            else {
                this.i = \u2603;
            }
        }
    }
    
    public void d() {
        this.f.a(this);
    }
    
    public int e() {
        return this.i;
    }
    
    public void a(final bag \u2603) {
        this.g.add(this.f());
        this.h = \u2603;
        this.i = -1;
        this.j = 0;
    }
    
    public baj f() {
        return new baj(this.h, this.a(), this.i);
    }
    
    static {
        b = new a();
        c = new b(-1, true);
        d = new b(1, true);
        e = new b(1, false);
        a = new bah() {
            @Override
            public void a(final baf \u2603) {
            }
            
            @Override
            public eu A_() {
                return new fa("");
            }
            
            @Override
            public void a(final float \u2603, final int \u2603) {
            }
            
            @Override
            public boolean B_() {
                return false;
            }
        };
    }
    
    static class a implements bah
    {
        private a() {
        }
        
        @Override
        public void a(final baf \u2603) {
            \u2603.d();
        }
        
        @Override
        public eu A_() {
            return new fa("Close menu");
        }
        
        @Override
        public void a(final float \u2603, final int \u2603) {
            ave.A().P().a(awm.a);
            avp.a(0, 0, 128.0f, 0.0f, 16, 16, 256.0f, 256.0f);
        }
        
        @Override
        public boolean B_() {
            return true;
        }
    }
    
    static class b implements bah
    {
        private final int a;
        private final boolean b;
        
        public b(final int \u2603, final boolean \u2603) {
            this.a = \u2603;
            this.b = \u2603;
        }
        
        @Override
        public void a(final baf \u2603) {
            \u2603.j += this.a;
        }
        
        @Override
        public eu A_() {
            if (this.a < 0) {
                return new fa("Previous Page");
            }
            return new fa("Next Page");
        }
        
        @Override
        public void a(final float \u2603, final int \u2603) {
            ave.A().P().a(awm.a);
            if (this.a < 0) {
                avp.a(0, 0, 144.0f, 0.0f, 16, 16, 256.0f, 256.0f);
            }
            else {
                avp.a(0, 0, 160.0f, 0.0f, 16, 16, 256.0f, 256.0f);
            }
        }
        
        @Override
        public boolean B_() {
            return this.b;
        }
    }
}
