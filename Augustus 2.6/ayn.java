import org.apache.logging.log4j.LogManager;
import java.util.Iterator;
import io.netty.buffer.Unpooled;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class ayn extends ayl
{
    private static final Logger u;
    private static final jy v;
    private og w;
    private b x;
    private boolean y;
    
    public ayn(final wm \u2603, final og \u2603) {
        super(new xl(\u2603, \u2603));
        this.w = \u2603;
        this.f = 230;
        this.g = 219;
    }
    
    @Override
    public void b() {
        super.b();
        this.n.add(this.x = new b(-1, this.i + 164, this.r + 107));
        this.n.add(new a(-2, this.i + 190, this.r + 107));
        this.y = true;
        this.x.l = false;
    }
    
    @Override
    public void e() {
        super.e();
        final int a_ = this.w.a_(0);
        final int a_2 = this.w.a_(1);
        final int a_3 = this.w.a_(2);
        if (this.y && a_ >= 0) {
            this.y = false;
            for (int i = 0; i <= 2; ++i) {
                final int length = akv.a[i].length;
                final int n = length * 22 + (length - 1) * 2;
                for (int j = 0; j < length; ++j) {
                    final int n2 = akv.a[i][j].H;
                    final c c = new c(i << 8 | n2, this.i + 76 + j * 24 - n / 2, this.r + 22 + i * 25, n2, i);
                    this.n.add(c);
                    if (i >= a_) {
                        c.l = false;
                    }
                    else if (n2 == a_2) {
                        c.b(true);
                    }
                }
            }
            int i = 3;
            final int length = akv.a[i].length + 1;
            final int n = length * 22 + (length - 1) * 2;
            for (int j = 0; j < length - 1; ++j) {
                final int n2 = akv.a[i][j].H;
                final c c = new c(i << 8 | n2, this.i + 167 + j * 24 - n / 2, this.r + 47, n2, i);
                this.n.add(c);
                if (i >= a_) {
                    c.l = false;
                }
                else if (n2 == a_3) {
                    c.b(true);
                }
            }
            if (a_2 > 0) {
                final c c2 = new c(i << 8 | a_2, this.i + 167 + (length - 1) * 24 - n / 2, this.r + 47, a_2, i);
                this.n.add(c2);
                if (i >= a_) {
                    c2.l = false;
                }
                else if (a_2 == a_3) {
                    c2.b(true);
                }
            }
        }
        this.x.l = (this.w.a(0) != null && a_2 > 0);
    }
    
    @Override
    protected void a(final avs \u2603) {
        if (\u2603.k == -2) {
            this.j.a((axu)null);
        }
        else if (\u2603.k == -1) {
            final String \u26032 = "MC|Beacon";
            final em \u26033 = new em(Unpooled.buffer());
            \u26033.writeInt(this.w.a_(1));
            \u26033.writeInt(this.w.a_(2));
            this.j.u().a(new im(\u26032, \u26033));
            this.j.a((axu)null);
        }
        else if (\u2603 instanceof c) {
            if (((c)\u2603).c()) {
                return;
            }
            final int k = \u2603.k;
            final int n = k & 0xFF;
            final int n2 = k >> 8;
            if (n2 < 3) {
                this.w.b(1, n);
            }
            else {
                this.w.b(2, n);
            }
            this.n.clear();
            this.b();
            this.e();
        }
    }
    
    @Override
    protected void b(final int \u2603, final int \u2603) {
        avc.a();
        this.a(this.q, bnq.a("tile.beacon.primary", new Object[0]), 62, 10, 14737632);
        this.a(this.q, bnq.a("tile.beacon.secondary", new Object[0]), 169, 10, 14737632);
        for (final avs avs : this.n) {
            if (avs.a()) {
                avs.b(\u2603 - this.i, \u2603 - this.r);
                break;
            }
        }
        avc.c();
    }
    
    @Override
    protected void a(final float \u2603, final int \u2603, final int \u2603) {
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.j.P().a(ayn.v);
        final int \u26032 = (this.l - this.f) / 2;
        final int \u26033 = (this.m - this.g) / 2;
        this.b(\u26032, \u26033, 0, 0, this.f, this.g);
        this.k.a = 100.0f;
        this.k.b(new zx(zy.bO), \u26032 + 42, \u26033 + 109);
        this.k.b(new zx(zy.i), \u26032 + 42 + 22, \u26033 + 109);
        this.k.b(new zx(zy.k), \u26032 + 42 + 44, \u26033 + 109);
        this.k.b(new zx(zy.j), \u26032 + 42 + 66, \u26033 + 109);
        this.k.a = 0.0f;
    }
    
    static {
        u = LogManager.getLogger();
        v = new jy("textures/gui/container/beacon.png");
    }
    
    static class d extends avs
    {
        private final jy o;
        private final int p;
        private final int q;
        private boolean r;
        
        protected d(final int \u2603, final int \u2603, final int \u2603, final jy \u2603, final int \u2603, final int \u2603) {
            super(\u2603, \u2603, \u2603, 22, 22, "");
            this.o = \u2603;
            this.p = \u2603;
            this.q = \u2603;
        }
        
        @Override
        public void a(final ave \u2603, final int \u2603, final int \u2603) {
            if (!this.m) {
                return;
            }
            \u2603.P().a(ayn.v);
            bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
            this.n = (\u2603 >= this.h && \u2603 >= this.i && \u2603 < this.h + this.f && \u2603 < this.i + this.g);
            final int \u26032 = 219;
            int \u26033 = 0;
            if (!this.l) {
                \u26033 += this.f * 2;
            }
            else if (this.r) {
                \u26033 += this.f * 1;
            }
            else if (this.n) {
                \u26033 += this.f * 3;
            }
            this.b(this.h, this.i, \u26033, \u26032, this.f, this.g);
            if (!ayn.v.equals(this.o)) {
                \u2603.P().a(this.o);
            }
            this.b(this.h + 2, this.i + 2, this.p, this.q, 18, 18);
        }
        
        public boolean c() {
            return this.r;
        }
        
        public void b(final boolean \u2603) {
            this.r = \u2603;
        }
    }
    
    class c extends d
    {
        private final int p;
        private final int q;
        
        public c(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
            super(\u2603, \u2603, \u2603, ayl.a, 0 + pe.a[\u2603].f() % 8 * 18, 198 + pe.a[\u2603].f() / 8 * 18);
            this.p = \u2603;
            this.q = \u2603;
        }
        
        @Override
        public void b(final int \u2603, final int \u2603) {
            String s = bnq.a(pe.a[this.p].a(), new Object[0]);
            if (this.q >= 3 && this.p != pe.l.H) {
                s += " II";
            }
            axu.this.a(s, \u2603, \u2603);
        }
    }
    
    class b extends d
    {
        public b(final int \u2603, final int \u2603, final int \u2603) {
            super(\u2603, \u2603, \u2603, ayn.v, 90, 220);
        }
        
        @Override
        public void b(final int \u2603, final int \u2603) {
            axu.this.a(bnq.a("gui.done", new Object[0]), \u2603, \u2603);
        }
    }
    
    class a extends d
    {
        public a(final int \u2603, final int \u2603, final int \u2603) {
            super(\u2603, \u2603, \u2603, ayn.v, 112, 220);
        }
        
        @Override
        public void b(final int \u2603, final int \u2603) {
            axu.this.a(bnq.a("gui.cancel", new Object[0]), \u2603, \u2603);
        }
    }
}
