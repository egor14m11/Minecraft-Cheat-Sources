import java.util.Iterator;
import com.google.common.collect.Maps;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public class avq
{
    private static final jy a;
    private final bmj b;
    private final Map<String, a> c;
    
    public avq(final bmj \u2603) {
        this.c = (Map<String, a>)Maps.newHashMap();
        this.b = \u2603;
    }
    
    public void a(final atg \u2603) {
        this.b(\u2603).a();
    }
    
    public void a(final atg \u2603, final boolean \u2603) {
        this.b(\u2603).a(\u2603);
    }
    
    private a b(final atg \u2603) {
        a a = this.c.get(\u2603.a);
        if (a == null) {
            a = new a(\u2603);
            this.c.put(\u2603.a, a);
        }
        return a;
    }
    
    public void a() {
        for (final a \u2603 : this.c.values()) {
            this.b.c(\u2603.d);
        }
        this.c.clear();
    }
    
    static {
        a = new jy("textures/map/map_icons.png");
    }
    
    class a
    {
        private final atg b;
        private final blz c;
        private final jy d;
        private final int[] e;
        
        private a(final atg \u2603) {
            this.b = \u2603;
            this.c = new blz(128, 128);
            this.e = this.c.e();
            this.d = avq.this.b.a("map/" + \u2603.a, this.c);
            for (int i = 0; i < this.e.length; ++i) {
                this.e[i] = 0;
            }
        }
        
        private void a() {
            for (int i = 0; i < 16384; ++i) {
                final int n = this.b.f[i] & 0xFF;
                if (n / 4 == 0) {
                    this.e[i] = (i + i / 128 & 0x1) * 8 + 16 << 24;
                }
                else {
                    this.e[i] = arn.a[n / 4].a(n & 0x3);
                }
            }
            this.c.d();
        }
        
        private void a(final boolean \u2603) {
            final int n = 0;
            final int n2 = 0;
            final bfx a = bfx.a();
            final bfd c = a.c();
            final float n3 = 0.0f;
            avq.this.b.a(this.d);
            bfl.l();
            bfl.a(1, 771, 0, 1);
            bfl.c();
            c.a(7, bms.g);
            c.b(n + 0 + n3, n2 + 128 - n3, -0.009999999776482582).a(0.0, 1.0).d();
            c.b(n + 128 - n3, n2 + 128 - n3, -0.009999999776482582).a(1.0, 1.0).d();
            c.b(n + 128 - n3, n2 + 0 + n3, -0.009999999776482582).a(1.0, 0.0).d();
            c.b(n + 0 + n3, n2 + 0 + n3, -0.009999999776482582).a(0.0, 0.0).d();
            a.b();
            bfl.d();
            bfl.k();
            avq.this.b.a(avq.a);
            int n4 = 0;
            for (final atf atf : this.b.h.values()) {
                if (\u2603 && atf.a() != 1) {
                    continue;
                }
                bfl.E();
                bfl.b(n + atf.b() / 2.0f + 64.0f, n2 + atf.c() / 2.0f + 64.0f, -0.02f);
                bfl.b(atf.d() * 360 / 16.0f, 0.0f, 0.0f, 1.0f);
                bfl.a(4.0f, 4.0f, 3.0f);
                bfl.b(-0.125f, 0.125f, 0.0f);
                final byte a2 = atf.a();
                final float n5 = (a2 % 4 + 0) / 4.0f;
                final float n6 = (a2 / 4 + 0) / 4.0f;
                final float n7 = (a2 % 4 + 1) / 4.0f;
                final float n8 = (a2 / 4 + 1) / 4.0f;
                c.a(7, bms.g);
                final float n9 = -0.001f;
                c.b(-1.0, 1.0, n4 * -0.001f).a(n5, n6).d();
                c.b(1.0, 1.0, n4 * -0.001f).a(n7, n6).d();
                c.b(1.0, -1.0, n4 * -0.001f).a(n7, n8).d();
                c.b(-1.0, -1.0, n4 * -0.001f).a(n5, n8).d();
                a.b();
                bfl.F();
                ++n4;
            }
            bfl.E();
            bfl.b(0.0f, 0.0f, -0.04f);
            bfl.a(1.0f, 1.0f, 1.0f);
            bfl.F();
        }
    }
}
