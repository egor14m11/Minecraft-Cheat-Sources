import java.util.Collections;
import java.util.Iterator;
import java.util.Random;
import com.google.common.collect.Lists;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class aql
{
    public static void a() {
        aqr.a(h.class, "OMB");
        aqr.a(j.class, "OMCR");
        aqr.a(k.class, "OMDXR");
        aqr.a(l.class, "OMDXYR");
        aqr.a(m.class, "OMDYR");
        aqr.a(n.class, "OMDYZR");
        aqr.a(o.class, "OMDZR");
        aqr.a(p.class, "OMEntry");
        aqr.a(q.class, "OMPenthouse");
        aqr.a(s.class, "OMSimple");
        aqr.a(t.class, "OMSimpleT");
    }
    
    public abstract static class r extends aqt
    {
        protected static final alz a;
        protected static final alz b;
        protected static final alz c;
        protected static final alz d;
        protected static final alz e;
        protected static final alz f;
        protected static final int g;
        protected static final int h;
        protected static final int i;
        protected static final int j;
        protected v k;
        
        protected static final int b(final int \u2603, final int \u2603, final int \u2603) {
            return \u2603 * 25 + \u2603 * 5 + \u2603;
        }
        
        public r() {
            super(0);
        }
        
        public r(final int \u2603) {
            super(\u2603);
        }
        
        public r(final cq \u2603, final aqe \u2603) {
            super(1);
            this.m = \u2603;
            this.l = \u2603;
        }
        
        protected r(final int \u2603, final cq \u2603, final v \u2603, final int \u2603, final int \u2603, final int \u2603) {
            super(\u2603);
            this.m = \u2603;
            this.k = \u2603;
            final int a = \u2603.a;
            final int n = a % 5;
            final int n2 = a / 5 % 5;
            final int n3 = a / 25;
            if (\u2603 == cq.c || \u2603 == cq.d) {
                this.l = new aqe(0, 0, 0, \u2603 * 8 - 1, \u2603 * 4 - 1, \u2603 * 8 - 1);
            }
            else {
                this.l = new aqe(0, 0, 0, \u2603 * 8 - 1, \u2603 * 4 - 1, \u2603 * 8 - 1);
            }
            switch (aql$1.a[\u2603.ordinal()]) {
                case 1: {
                    this.l.a(n * 8, n3 * 4, -(n2 + \u2603) * 8 + 1);
                    break;
                }
                case 2: {
                    this.l.a(n * 8, n3 * 4, n2 * 8);
                    break;
                }
                case 3: {
                    this.l.a(-(n2 + \u2603) * 8 + 1, n3 * 4, n * 8);
                    break;
                }
                default: {
                    this.l.a(n2 * 8, n3 * 4, n * 8);
                    break;
                }
            }
        }
        
        @Override
        protected void a(final dn \u2603) {
        }
        
        @Override
        protected void b(final dn \u2603) {
        }
        
        protected void a(final adm \u2603, final aqe \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final boolean \u2603) {
            for (int i = \u2603; i <= \u2603; ++i) {
                for (int j = \u2603; j <= \u2603; ++j) {
                    for (int k = \u2603; k <= \u2603; ++k) {
                        if (!\u2603 || this.a(\u2603, j, i, k, \u2603).c().t() != arm.a) {
                            if (this.d(i) >= \u2603.F()) {
                                this.a(\u2603, afi.a.Q(), j, i, k, \u2603);
                            }
                            else {
                                this.a(\u2603, r.f, j, i, k, \u2603);
                            }
                        }
                    }
                }
            }
        }
        
        protected void a(final adm \u2603, final aqe \u2603, final int \u2603, final int \u2603, final boolean \u2603) {
            if (\u2603) {
                this.a(\u2603, \u2603, \u2603 + 0, 0, \u2603 + 0, \u2603 + 2, 0, \u2603 + 8 - 1, r.a, r.a, false);
                this.a(\u2603, \u2603, \u2603 + 5, 0, \u2603 + 0, \u2603 + 8 - 1, 0, \u2603 + 8 - 1, r.a, r.a, false);
                this.a(\u2603, \u2603, \u2603 + 3, 0, \u2603 + 0, \u2603 + 4, 0, \u2603 + 2, r.a, r.a, false);
                this.a(\u2603, \u2603, \u2603 + 3, 0, \u2603 + 5, \u2603 + 4, 0, \u2603 + 8 - 1, r.a, r.a, false);
                this.a(\u2603, \u2603, \u2603 + 3, 0, \u2603 + 2, \u2603 + 4, 0, \u2603 + 2, r.b, r.b, false);
                this.a(\u2603, \u2603, \u2603 + 3, 0, \u2603 + 5, \u2603 + 4, 0, \u2603 + 5, r.b, r.b, false);
                this.a(\u2603, \u2603, \u2603 + 2, 0, \u2603 + 3, \u2603 + 2, 0, \u2603 + 4, r.b, r.b, false);
                this.a(\u2603, \u2603, \u2603 + 5, 0, \u2603 + 3, \u2603 + 5, 0, \u2603 + 4, r.b, r.b, false);
            }
            else {
                this.a(\u2603, \u2603, \u2603 + 0, 0, \u2603 + 0, \u2603 + 8 - 1, 0, \u2603 + 8 - 1, r.a, r.a, false);
            }
        }
        
        protected void a(final adm \u2603, final aqe \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final alz \u2603) {
            for (int i = \u2603; i <= \u2603; ++i) {
                for (int j = \u2603; j <= \u2603; ++j) {
                    for (int k = \u2603; k <= \u2603; ++k) {
                        if (this.a(\u2603, j, i, k, \u2603) == r.f) {
                            this.a(\u2603, \u2603, j, i, k, \u2603);
                        }
                    }
                }
            }
        }
        
        protected boolean a(final aqe \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
            final int a = this.a(\u2603, \u2603);
            final int b = this.b(\u2603, \u2603);
            final int a2 = this.a(\u2603, \u2603);
            final int b2 = this.b(\u2603, \u2603);
            return \u2603.a(Math.min(a, a2), Math.min(b, b2), Math.max(a, a2), Math.max(b, b2));
        }
        
        protected boolean a(final adm \u2603, final aqe \u2603, final int \u2603, final int \u2603, final int \u2603) {
            final int a = this.a(\u2603, \u2603);
            final int d = this.d(\u2603);
            final int b = this.b(\u2603, \u2603);
            if (\u2603.b(new cj(a, d, b))) {
                final vt vt = new vt(\u2603);
                vt.a(true);
                vt.h(vt.bu());
                vt.b(a + 0.5, d, b + 0.5, 0.0f, 0.0f);
                vt.a(\u2603.E(new cj(vt)), null);
                \u2603.d(vt);
                return true;
            }
            return false;
        }
        
        static {
            a = afi.cI.a(aiu.b);
            b = afi.cI.a(aiu.N);
            c = afi.cI.a(aiu.O);
            d = r.b;
            e = afi.cJ.Q();
            f = afi.j.Q();
            g = b(2, 0, 0);
            h = b(2, 2, 0);
            i = b(0, 1, 0);
            j = b(4, 1, 0);
        }
    }
    
    public static class h extends r
    {
        private v o;
        private v p;
        private List<r> q;
        
        public h() {
            this.q = (List<r>)Lists.newArrayList();
        }
        
        public h(final Random \u2603, final int \u2603, final int \u2603, final cq \u2603) {
            super(0);
            this.q = (List<r>)Lists.newArrayList();
            this.m = \u2603;
            switch (aql$1.a[this.m.ordinal()]) {
                case 1:
                case 2: {
                    this.l = new aqe(\u2603, 39, \u2603, \u2603 + 58 - 1, 61, \u2603 + 58 - 1);
                    break;
                }
                default: {
                    this.l = new aqe(\u2603, 39, \u2603, \u2603 + 58 - 1, 61, \u2603 + 58 - 1);
                    break;
                }
            }
            final List<v> a = this.a(\u2603);
            this.o.d = true;
            this.q.add(new p(this.m, this.o));
            this.q.add(new j(this.m, this.p, \u2603));
            final List<i> arrayList = (List<i>)Lists.newArrayList();
            arrayList.add(new b());
            arrayList.add(new d());
            arrayList.add(new e());
            arrayList.add(new aql.a());
            arrayList.add(new c());
            arrayList.add(new g());
            arrayList.add(new f());
            for (final v v : a) {
                if (!v.d && !v.b()) {
                    for (final i i : arrayList) {
                        if (i.a(v)) {
                            this.q.add(i.a(this.m, v, \u2603));
                            break;
                        }
                    }
                }
            }
            final int b = this.l.b;
            final int a2 = this.a(9, 22);
            final int b2 = this.b(9, 22);
            for (final r r : this.q) {
                r.c().a(a2, b, b2);
            }
            final aqe a3 = aqe.a(this.a(1, 1), this.d(1), this.b(1, 1), this.a(23, 21), this.d(8), this.b(23, 21));
            final aqe a4 = aqe.a(this.a(34, 1), this.d(1), this.b(34, 1), this.a(56, 21), this.d(8), this.b(56, 21));
            final aqe a5 = aqe.a(this.a(22, 22), this.d(13), this.b(22, 22), this.a(35, 35), this.d(17), this.b(35, 35));
            int nextInt = \u2603.nextInt();
            this.q.add(new u(this.m, a3, nextInt++));
            this.q.add(new u(this.m, a4, nextInt++));
            this.q.add(new q(this.m, a5));
        }
        
        private List<v> a(final Random \u2603) {
            final v[] array = new v[75];
            for (int i = 0; i < 5; ++i) {
                for (int j = 0; j < 4; ++j) {
                    final int k = 0;
                    final int \u26032 = r.b(i, k, j);
                    array[\u26032] = new v(\u26032);
                }
            }
            for (int i = 0; i < 5; ++i) {
                for (int j = 0; j < 4; ++j) {
                    final int k = 1;
                    final int \u26032 = r.b(i, k, j);
                    array[\u26032] = new v(\u26032);
                }
            }
            for (int i = 1; i < 4; ++i) {
                for (int j = 0; j < 2; ++j) {
                    final int k = 2;
                    final int \u26032 = r.b(i, k, j);
                    array[\u26032] = new v(\u26032);
                }
            }
            this.o = array[h.g];
            for (int i = 0; i < 5; ++i) {
                for (int j = 0; j < 5; ++j) {
                    for (int k = 0; k < 3; ++k) {
                        final int \u26032 = r.b(i, k, j);
                        if (array[\u26032] != null) {
                            for (final cq \u26033 : cq.values()) {
                                final int \u26034 = i + \u26033.g();
                                final int nextInt = k + \u26033.h();
                                final int a = j + \u26033.i();
                                if (\u26034 >= 0 && \u26034 < 5 && a >= 0 && a < 5 && nextInt >= 0 && nextInt < 3) {
                                    final int b = r.b(\u26034, nextInt, a);
                                    if (array[b] != null) {
                                        if (a != j) {
                                            array[\u26032].a(\u26033.d(), array[b]);
                                        }
                                        else {
                                            array[\u26032].a(\u26033, array[b]);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            final v v;
            array[h.h].a(cq.b, v = new v(1003));
            final v v2;
            array[h.i].a(cq.d, v2 = new v(1001));
            final v v3;
            array[h.j].a(cq.d, v3 = new v(1002));
            v.d = true;
            v2.d = true;
            v3.d = true;
            this.o.e = true;
            this.p = array[r.b(\u2603.nextInt(4), 0, 2)];
            this.p.d = true;
            this.p.b[cq.f.a()].d = true;
            this.p.b[cq.c.a()].d = true;
            this.p.b[cq.f.a()].b[cq.c.a()].d = true;
            this.p.b[cq.b.a()].d = true;
            this.p.b[cq.f.a()].b[cq.b.a()].d = true;
            this.p.b[cq.c.a()].b[cq.b.a()].d = true;
            this.p.b[cq.f.a()].b[cq.c.a()].b[cq.b.a()].d = true;
            final List<v> arrayList = (List<v>)Lists.newArrayList();
            for (final v v4 : array) {
                if (v4 != null) {
                    v4.a();
                    arrayList.add(v4);
                }
            }
            v.a();
            Collections.shuffle(arrayList, \u2603);
            int n2 = 1;
            for (final v v5 : arrayList) {
                int n3 = 0;
                int \u26034 = 0;
                while (n3 < 2 && \u26034 < 5) {
                    ++\u26034;
                    final int nextInt = \u2603.nextInt(6);
                    if (v5.c[nextInt]) {
                        final int a = cq.a(nextInt).d().a();
                        v5.c[nextInt] = false;
                        v5.b[nextInt].c[a] = false;
                        if (v5.a(n2++) && v5.b[nextInt].a(n2++)) {
                            ++n3;
                        }
                        else {
                            v5.c[nextInt] = true;
                            v5.b[nextInt].c[a] = true;
                        }
                    }
                }
            }
            arrayList.add(v);
            arrayList.add(v2);
            arrayList.add(v3);
            return arrayList;
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            final int \u26032 = Math.max(\u2603.F(), 64) - this.l.b;
            this.a(\u2603, \u2603, 0, 0, 0, 58, \u26032, 58, false);
            this.a(false, 0, \u2603, \u2603, \u2603);
            this.a(true, 33, \u2603, \u2603, \u2603);
            this.b(\u2603, \u2603, \u2603);
            this.c(\u2603, \u2603, \u2603);
            this.d(\u2603, \u2603, \u2603);
            this.e(\u2603, \u2603, \u2603);
            this.f(\u2603, \u2603, \u2603);
            this.g(\u2603, \u2603, \u2603);
            for (int i = 0; i < 7; ++i) {
                int j = 0;
                while (j < 7) {
                    if (j == 0 && i == 3) {
                        j = 6;
                    }
                    final int n = i * 9;
                    final int n2 = j * 9;
                    for (int k = 0; k < 4; ++k) {
                        for (int l = 0; l < 4; ++l) {
                            this.a(\u2603, h.b, n + k, 0, n2 + l, \u2603);
                            this.b(\u2603, h.b, n + k, -1, n2 + l, \u2603);
                        }
                    }
                    if (i == 0 || i == 6) {
                        ++j;
                    }
                    else {
                        j += 6;
                    }
                }
            }
            for (int i = 0; i < 5; ++i) {
                this.a(\u2603, \u2603, -1 - i, 0 + i * 2, -1 - i, -1 - i, 23, 58 + i, false);
                this.a(\u2603, \u2603, 58 + i, 0 + i * 2, -1 - i, 58 + i, 23, 58 + i, false);
                this.a(\u2603, \u2603, 0 - i, 0 + i * 2, -1 - i, 57 + i, 23, -1 - i, false);
                this.a(\u2603, \u2603, 0 - i, 0 + i * 2, 58 + i, 57 + i, 23, 58 + i, false);
            }
            for (final r r : this.q) {
                if (r.c().a(\u2603)) {
                    r.a(\u2603, \u2603, \u2603);
                }
            }
            return true;
        }
        
        private void a(final boolean \u2603, final int \u2603, final adm \u2603, final Random \u2603, final aqe \u2603) {
            final int n = 24;
            if (this.a(\u2603, \u2603, 0, \u2603 + 23, 20)) {
                this.a(\u2603, \u2603, \u2603 + 0, 0, 0, \u2603 + 24, 0, 20, h.a, h.a, false);
                this.a(\u2603, \u2603, \u2603 + 0, 1, 0, \u2603 + 24, 10, 20, false);
                for (int i = 0; i < 4; ++i) {
                    this.a(\u2603, \u2603, \u2603 + i, i + 1, i, \u2603 + i, i + 1, 20, h.b, h.b, false);
                    this.a(\u2603, \u2603, \u2603 + i + 7, i + 5, i + 7, \u2603 + i + 7, i + 5, 20, h.b, h.b, false);
                    this.a(\u2603, \u2603, \u2603 + 17 - i, i + 5, i + 7, \u2603 + 17 - i, i + 5, 20, h.b, h.b, false);
                    this.a(\u2603, \u2603, \u2603 + 24 - i, i + 1, i, \u2603 + 24 - i, i + 1, 20, h.b, h.b, false);
                    this.a(\u2603, \u2603, \u2603 + i + 1, i + 1, i, \u2603 + 23 - i, i + 1, i, h.b, h.b, false);
                    this.a(\u2603, \u2603, \u2603 + i + 8, i + 5, i + 7, \u2603 + 16 - i, i + 5, i + 7, h.b, h.b, false);
                }
                this.a(\u2603, \u2603, \u2603 + 4, 4, 4, \u2603 + 6, 4, 20, h.a, h.a, false);
                this.a(\u2603, \u2603, \u2603 + 7, 4, 4, \u2603 + 17, 4, 6, h.a, h.a, false);
                this.a(\u2603, \u2603, \u2603 + 18, 4, 4, \u2603 + 20, 4, 20, h.a, h.a, false);
                this.a(\u2603, \u2603, \u2603 + 11, 8, 11, \u2603 + 13, 8, 20, h.a, h.a, false);
                this.a(\u2603, h.d, \u2603 + 12, 9, 12, \u2603);
                this.a(\u2603, h.d, \u2603 + 12, 9, 15, \u2603);
                this.a(\u2603, h.d, \u2603 + 12, 9, 18, \u2603);
                int i = \u2603 ? (\u2603 + 19) : (\u2603 + 5);
                final int n2 = \u2603 ? (\u2603 + 5) : (\u2603 + 19);
                for (int j = 20; j >= 5; j -= 3) {
                    this.a(\u2603, h.d, i, 5, j, \u2603);
                }
                for (int j = 19; j >= 7; j -= 3) {
                    this.a(\u2603, h.d, n2, 5, j, \u2603);
                }
                for (int j = 0; j < 4; ++j) {
                    final int \u26032 = \u2603 ? (\u2603 + (24 - (17 - j * 3))) : (\u2603 + 17 - j * 3);
                    this.a(\u2603, h.d, \u26032, 5, 5, \u2603);
                }
                this.a(\u2603, h.d, n2, 5, 5, \u2603);
                this.a(\u2603, \u2603, \u2603 + 11, 1, 12, \u2603 + 13, 7, 12, h.a, h.a, false);
                this.a(\u2603, \u2603, \u2603 + 12, 1, 11, \u2603 + 12, 7, 13, h.a, h.a, false);
            }
        }
        
        private void b(final adm \u2603, final Random \u2603, final aqe \u2603) {
            if (this.a(\u2603, 22, 5, 35, 17)) {
                this.a(\u2603, \u2603, 25, 0, 0, 32, 8, 20, false);
                for (int i = 0; i < 4; ++i) {
                    this.a(\u2603, \u2603, 24, 2, 5 + i * 4, 24, 4, 5 + i * 4, h.b, h.b, false);
                    this.a(\u2603, \u2603, 22, 4, 5 + i * 4, 23, 4, 5 + i * 4, h.b, h.b, false);
                    this.a(\u2603, h.b, 25, 5, 5 + i * 4, \u2603);
                    this.a(\u2603, h.b, 26, 6, 5 + i * 4, \u2603);
                    this.a(\u2603, h.e, 26, 5, 5 + i * 4, \u2603);
                    this.a(\u2603, \u2603, 33, 2, 5 + i * 4, 33, 4, 5 + i * 4, h.b, h.b, false);
                    this.a(\u2603, \u2603, 34, 4, 5 + i * 4, 35, 4, 5 + i * 4, h.b, h.b, false);
                    this.a(\u2603, h.b, 32, 5, 5 + i * 4, \u2603);
                    this.a(\u2603, h.b, 31, 6, 5 + i * 4, \u2603);
                    this.a(\u2603, h.e, 31, 5, 5 + i * 4, \u2603);
                    this.a(\u2603, \u2603, 27, 6, 5 + i * 4, 30, 6, 5 + i * 4, h.a, h.a, false);
                }
            }
        }
        
        private void c(final adm \u2603, final Random \u2603, final aqe \u2603) {
            if (this.a(\u2603, 15, 20, 42, 21)) {
                this.a(\u2603, \u2603, 15, 0, 21, 42, 0, 21, h.a, h.a, false);
                this.a(\u2603, \u2603, 26, 1, 21, 31, 3, 21, false);
                this.a(\u2603, \u2603, 21, 12, 21, 36, 12, 21, h.a, h.a, false);
                this.a(\u2603, \u2603, 17, 11, 21, 40, 11, 21, h.a, h.a, false);
                this.a(\u2603, \u2603, 16, 10, 21, 41, 10, 21, h.a, h.a, false);
                this.a(\u2603, \u2603, 15, 7, 21, 42, 9, 21, h.a, h.a, false);
                this.a(\u2603, \u2603, 16, 6, 21, 41, 6, 21, h.a, h.a, false);
                this.a(\u2603, \u2603, 17, 5, 21, 40, 5, 21, h.a, h.a, false);
                this.a(\u2603, \u2603, 21, 4, 21, 36, 4, 21, h.a, h.a, false);
                this.a(\u2603, \u2603, 22, 3, 21, 26, 3, 21, h.a, h.a, false);
                this.a(\u2603, \u2603, 31, 3, 21, 35, 3, 21, h.a, h.a, false);
                this.a(\u2603, \u2603, 23, 2, 21, 25, 2, 21, h.a, h.a, false);
                this.a(\u2603, \u2603, 32, 2, 21, 34, 2, 21, h.a, h.a, false);
                this.a(\u2603, \u2603, 28, 4, 20, 29, 4, 21, h.b, h.b, false);
                this.a(\u2603, h.b, 27, 3, 21, \u2603);
                this.a(\u2603, h.b, 30, 3, 21, \u2603);
                this.a(\u2603, h.b, 26, 2, 21, \u2603);
                this.a(\u2603, h.b, 31, 2, 21, \u2603);
                this.a(\u2603, h.b, 25, 1, 21, \u2603);
                this.a(\u2603, h.b, 32, 1, 21, \u2603);
                for (int i = 0; i < 7; ++i) {
                    this.a(\u2603, h.c, 28 - i, 6 + i, 21, \u2603);
                    this.a(\u2603, h.c, 29 + i, 6 + i, 21, \u2603);
                }
                for (int i = 0; i < 4; ++i) {
                    this.a(\u2603, h.c, 28 - i, 9 + i, 21, \u2603);
                    this.a(\u2603, h.c, 29 + i, 9 + i, 21, \u2603);
                }
                this.a(\u2603, h.c, 28, 12, 21, \u2603);
                this.a(\u2603, h.c, 29, 12, 21, \u2603);
                for (int i = 0; i < 3; ++i) {
                    this.a(\u2603, h.c, 22 - i * 2, 8, 21, \u2603);
                    this.a(\u2603, h.c, 22 - i * 2, 9, 21, \u2603);
                    this.a(\u2603, h.c, 35 + i * 2, 8, 21, \u2603);
                    this.a(\u2603, h.c, 35 + i * 2, 9, 21, \u2603);
                }
                this.a(\u2603, \u2603, 15, 13, 21, 42, 15, 21, false);
                this.a(\u2603, \u2603, 15, 1, 21, 15, 6, 21, false);
                this.a(\u2603, \u2603, 16, 1, 21, 16, 5, 21, false);
                this.a(\u2603, \u2603, 17, 1, 21, 20, 4, 21, false);
                this.a(\u2603, \u2603, 21, 1, 21, 21, 3, 21, false);
                this.a(\u2603, \u2603, 22, 1, 21, 22, 2, 21, false);
                this.a(\u2603, \u2603, 23, 1, 21, 24, 1, 21, false);
                this.a(\u2603, \u2603, 42, 1, 21, 42, 6, 21, false);
                this.a(\u2603, \u2603, 41, 1, 21, 41, 5, 21, false);
                this.a(\u2603, \u2603, 37, 1, 21, 40, 4, 21, false);
                this.a(\u2603, \u2603, 36, 1, 21, 36, 3, 21, false);
                this.a(\u2603, \u2603, 33, 1, 21, 34, 1, 21, false);
                this.a(\u2603, \u2603, 35, 1, 21, 35, 2, 21, false);
            }
        }
        
        private void d(final adm \u2603, final Random \u2603, final aqe \u2603) {
            if (this.a(\u2603, 21, 21, 36, 36)) {
                this.a(\u2603, \u2603, 21, 0, 22, 36, 0, 36, h.a, h.a, false);
                this.a(\u2603, \u2603, 21, 1, 22, 36, 23, 36, false);
                for (int i = 0; i < 4; ++i) {
                    this.a(\u2603, \u2603, 21 + i, 13 + i, 21 + i, 36 - i, 13 + i, 21 + i, h.b, h.b, false);
                    this.a(\u2603, \u2603, 21 + i, 13 + i, 36 - i, 36 - i, 13 + i, 36 - i, h.b, h.b, false);
                    this.a(\u2603, \u2603, 21 + i, 13 + i, 22 + i, 21 + i, 13 + i, 35 - i, h.b, h.b, false);
                    this.a(\u2603, \u2603, 36 - i, 13 + i, 22 + i, 36 - i, 13 + i, 35 - i, h.b, h.b, false);
                }
                this.a(\u2603, \u2603, 25, 16, 25, 32, 16, 32, h.a, h.a, false);
                this.a(\u2603, \u2603, 25, 17, 25, 25, 19, 25, h.b, h.b, false);
                this.a(\u2603, \u2603, 32, 17, 25, 32, 19, 25, h.b, h.b, false);
                this.a(\u2603, \u2603, 25, 17, 32, 25, 19, 32, h.b, h.b, false);
                this.a(\u2603, \u2603, 32, 17, 32, 32, 19, 32, h.b, h.b, false);
                this.a(\u2603, h.b, 26, 20, 26, \u2603);
                this.a(\u2603, h.b, 27, 21, 27, \u2603);
                this.a(\u2603, h.e, 27, 20, 27, \u2603);
                this.a(\u2603, h.b, 26, 20, 31, \u2603);
                this.a(\u2603, h.b, 27, 21, 30, \u2603);
                this.a(\u2603, h.e, 27, 20, 30, \u2603);
                this.a(\u2603, h.b, 31, 20, 31, \u2603);
                this.a(\u2603, h.b, 30, 21, 30, \u2603);
                this.a(\u2603, h.e, 30, 20, 30, \u2603);
                this.a(\u2603, h.b, 31, 20, 26, \u2603);
                this.a(\u2603, h.b, 30, 21, 27, \u2603);
                this.a(\u2603, h.e, 30, 20, 27, \u2603);
                this.a(\u2603, \u2603, 28, 21, 27, 29, 21, 27, h.a, h.a, false);
                this.a(\u2603, \u2603, 27, 21, 28, 27, 21, 29, h.a, h.a, false);
                this.a(\u2603, \u2603, 28, 21, 30, 29, 21, 30, h.a, h.a, false);
                this.a(\u2603, \u2603, 30, 21, 28, 30, 21, 29, h.a, h.a, false);
            }
        }
        
        private void e(final adm \u2603, final Random \u2603, final aqe \u2603) {
            if (this.a(\u2603, 0, 21, 6, 58)) {
                this.a(\u2603, \u2603, 0, 0, 21, 6, 0, 57, h.a, h.a, false);
                this.a(\u2603, \u2603, 0, 1, 21, 6, 7, 57, false);
                this.a(\u2603, \u2603, 4, 4, 21, 6, 4, 53, h.a, h.a, false);
                for (int i = 0; i < 4; ++i) {
                    this.a(\u2603, \u2603, i, i + 1, 21, i, i + 1, 57 - i, h.b, h.b, false);
                }
                for (int i = 23; i < 53; i += 3) {
                    this.a(\u2603, h.d, 5, 5, i, \u2603);
                }
                this.a(\u2603, h.d, 5, 5, 52, \u2603);
                for (int i = 0; i < 4; ++i) {
                    this.a(\u2603, \u2603, i, i + 1, 21, i, i + 1, 57 - i, h.b, h.b, false);
                }
                this.a(\u2603, \u2603, 4, 1, 52, 6, 3, 52, h.a, h.a, false);
                this.a(\u2603, \u2603, 5, 1, 51, 5, 3, 53, h.a, h.a, false);
            }
            if (this.a(\u2603, 51, 21, 58, 58)) {
                this.a(\u2603, \u2603, 51, 0, 21, 57, 0, 57, h.a, h.a, false);
                this.a(\u2603, \u2603, 51, 1, 21, 57, 7, 57, false);
                this.a(\u2603, \u2603, 51, 4, 21, 53, 4, 53, h.a, h.a, false);
                for (int i = 0; i < 4; ++i) {
                    this.a(\u2603, \u2603, 57 - i, i + 1, 21, 57 - i, i + 1, 57 - i, h.b, h.b, false);
                }
                for (int i = 23; i < 53; i += 3) {
                    this.a(\u2603, h.d, 52, 5, i, \u2603);
                }
                this.a(\u2603, h.d, 52, 5, 52, \u2603);
                this.a(\u2603, \u2603, 51, 1, 52, 53, 3, 52, h.a, h.a, false);
                this.a(\u2603, \u2603, 52, 1, 51, 52, 3, 53, h.a, h.a, false);
            }
            if (this.a(\u2603, 0, 51, 57, 57)) {
                this.a(\u2603, \u2603, 7, 0, 51, 50, 0, 57, h.a, h.a, false);
                this.a(\u2603, \u2603, 7, 1, 51, 50, 10, 57, false);
                for (int i = 0; i < 4; ++i) {
                    this.a(\u2603, \u2603, i + 1, i + 1, 57 - i, 56 - i, i + 1, 57 - i, h.b, h.b, false);
                }
            }
        }
        
        private void f(final adm \u2603, final Random \u2603, final aqe \u2603) {
            if (this.a(\u2603, 7, 21, 13, 50)) {
                this.a(\u2603, \u2603, 7, 0, 21, 13, 0, 50, h.a, h.a, false);
                this.a(\u2603, \u2603, 7, 1, 21, 13, 10, 50, false);
                this.a(\u2603, \u2603, 11, 8, 21, 13, 8, 53, h.a, h.a, false);
                for (int i = 0; i < 4; ++i) {
                    this.a(\u2603, \u2603, i + 7, i + 5, 21, i + 7, i + 5, 54, h.b, h.b, false);
                }
                for (int i = 21; i <= 45; i += 3) {
                    this.a(\u2603, h.d, 12, 9, i, \u2603);
                }
            }
            if (this.a(\u2603, 44, 21, 50, 54)) {
                this.a(\u2603, \u2603, 44, 0, 21, 50, 0, 50, h.a, h.a, false);
                this.a(\u2603, \u2603, 44, 1, 21, 50, 10, 50, false);
                this.a(\u2603, \u2603, 44, 8, 21, 46, 8, 53, h.a, h.a, false);
                for (int i = 0; i < 4; ++i) {
                    this.a(\u2603, \u2603, 50 - i, i + 5, 21, 50 - i, i + 5, 54, h.b, h.b, false);
                }
                for (int i = 21; i <= 45; i += 3) {
                    this.a(\u2603, h.d, 45, 9, i, \u2603);
                }
            }
            if (this.a(\u2603, 8, 44, 49, 54)) {
                this.a(\u2603, \u2603, 14, 0, 44, 43, 0, 50, h.a, h.a, false);
                this.a(\u2603, \u2603, 14, 1, 44, 43, 10, 50, false);
                for (int i = 12; i <= 45; i += 3) {
                    this.a(\u2603, h.d, i, 9, 45, \u2603);
                    this.a(\u2603, h.d, i, 9, 52, \u2603);
                    if (i == 12 || i == 18 || i == 24 || i == 33 || i == 39 || i == 45) {
                        this.a(\u2603, h.d, i, 9, 47, \u2603);
                        this.a(\u2603, h.d, i, 9, 50, \u2603);
                        this.a(\u2603, h.d, i, 10, 45, \u2603);
                        this.a(\u2603, h.d, i, 10, 46, \u2603);
                        this.a(\u2603, h.d, i, 10, 51, \u2603);
                        this.a(\u2603, h.d, i, 10, 52, \u2603);
                        this.a(\u2603, h.d, i, 11, 47, \u2603);
                        this.a(\u2603, h.d, i, 11, 50, \u2603);
                        this.a(\u2603, h.d, i, 12, 48, \u2603);
                        this.a(\u2603, h.d, i, 12, 49, \u2603);
                    }
                }
                for (int i = 0; i < 3; ++i) {
                    this.a(\u2603, \u2603, 8 + i, 5 + i, 54, 49 - i, 5 + i, 54, h.a, h.a, false);
                }
                this.a(\u2603, \u2603, 11, 8, 54, 46, 8, 54, h.b, h.b, false);
                this.a(\u2603, \u2603, 14, 8, 44, 43, 8, 53, h.a, h.a, false);
            }
        }
        
        private void g(final adm \u2603, final Random \u2603, final aqe \u2603) {
            if (this.a(\u2603, 14, 21, 20, 43)) {
                this.a(\u2603, \u2603, 14, 0, 21, 20, 0, 43, h.a, h.a, false);
                this.a(\u2603, \u2603, 14, 1, 22, 20, 14, 43, false);
                this.a(\u2603, \u2603, 18, 12, 22, 20, 12, 39, h.a, h.a, false);
                this.a(\u2603, \u2603, 18, 12, 21, 20, 12, 21, h.b, h.b, false);
                for (int i = 0; i < 4; ++i) {
                    this.a(\u2603, \u2603, i + 14, i + 9, 21, i + 14, i + 9, 43 - i, h.b, h.b, false);
                }
                for (int i = 23; i <= 39; i += 3) {
                    this.a(\u2603, h.d, 19, 13, i, \u2603);
                }
            }
            if (this.a(\u2603, 37, 21, 43, 43)) {
                this.a(\u2603, \u2603, 37, 0, 21, 43, 0, 43, h.a, h.a, false);
                this.a(\u2603, \u2603, 37, 1, 22, 43, 14, 43, false);
                this.a(\u2603, \u2603, 37, 12, 22, 39, 12, 39, h.a, h.a, false);
                this.a(\u2603, \u2603, 37, 12, 21, 39, 12, 21, h.b, h.b, false);
                for (int i = 0; i < 4; ++i) {
                    this.a(\u2603, \u2603, 43 - i, i + 9, 21, 43 - i, i + 9, 43 - i, h.b, h.b, false);
                }
                for (int i = 23; i <= 39; i += 3) {
                    this.a(\u2603, h.d, 38, 13, i, \u2603);
                }
            }
            if (this.a(\u2603, 15, 37, 42, 43)) {
                this.a(\u2603, \u2603, 21, 0, 37, 36, 0, 43, h.a, h.a, false);
                this.a(\u2603, \u2603, 21, 1, 37, 36, 14, 43, false);
                this.a(\u2603, \u2603, 21, 12, 37, 36, 12, 39, h.a, h.a, false);
                for (int i = 0; i < 4; ++i) {
                    this.a(\u2603, \u2603, 15 + i, i + 9, 43 - i, 42 - i, i + 9, 43 - i, h.b, h.b, false);
                }
                for (int i = 21; i <= 36; i += 3) {
                    this.a(\u2603, h.d, i, 13, 38, \u2603);
                }
            }
        }
    }
    
    public static class p extends r
    {
        public p() {
        }
        
        public p(final cq \u2603, final v \u2603) {
            super(1, \u2603, \u2603, 1, 1, 1);
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            this.a(\u2603, \u2603, 0, 3, 0, 2, 3, 7, p.b, p.b, false);
            this.a(\u2603, \u2603, 5, 3, 0, 7, 3, 7, p.b, p.b, false);
            this.a(\u2603, \u2603, 0, 2, 0, 1, 2, 7, p.b, p.b, false);
            this.a(\u2603, \u2603, 6, 2, 0, 7, 2, 7, p.b, p.b, false);
            this.a(\u2603, \u2603, 0, 1, 0, 0, 1, 7, p.b, p.b, false);
            this.a(\u2603, \u2603, 7, 1, 0, 7, 1, 7, p.b, p.b, false);
            this.a(\u2603, \u2603, 0, 1, 7, 7, 3, 7, p.b, p.b, false);
            this.a(\u2603, \u2603, 1, 1, 0, 2, 3, 0, p.b, p.b, false);
            this.a(\u2603, \u2603, 5, 1, 0, 6, 3, 0, p.b, p.b, false);
            if (this.k.c[cq.c.a()]) {
                this.a(\u2603, \u2603, 3, 1, 7, 4, 2, 7, false);
            }
            if (this.k.c[cq.e.a()]) {
                this.a(\u2603, \u2603, 0, 1, 3, 1, 2, 4, false);
            }
            if (this.k.c[cq.f.a()]) {
                this.a(\u2603, \u2603, 6, 1, 3, 7, 2, 4, false);
            }
            return true;
        }
    }
    
    public static class s extends r
    {
        private int o;
        
        public s() {
        }
        
        public s(final cq \u2603, final v \u2603, final Random \u2603) {
            super(1, \u2603, \u2603, 1, 1, 1);
            this.o = \u2603.nextInt(3);
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            if (this.k.a / 25 > 0) {
                this.a(\u2603, \u2603, 0, 0, this.k.c[cq.a.a()]);
            }
            if (this.k.b[cq.b.a()] == null) {
                this.a(\u2603, \u2603, 1, 4, 1, 6, 4, 6, s.a);
            }
            final boolean b = this.o != 0 && \u2603.nextBoolean() && !this.k.c[cq.a.a()] && !this.k.c[cq.b.a()] && this.k.c() > 1;
            if (this.o == 0) {
                this.a(\u2603, \u2603, 0, 1, 0, 2, 1, 2, s.b, s.b, false);
                this.a(\u2603, \u2603, 0, 3, 0, 2, 3, 2, s.b, s.b, false);
                this.a(\u2603, \u2603, 0, 2, 0, 0, 2, 2, s.a, s.a, false);
                this.a(\u2603, \u2603, 1, 2, 0, 2, 2, 0, s.a, s.a, false);
                this.a(\u2603, s.e, 1, 2, 1, \u2603);
                this.a(\u2603, \u2603, 5, 1, 0, 7, 1, 2, s.b, s.b, false);
                this.a(\u2603, \u2603, 5, 3, 0, 7, 3, 2, s.b, s.b, false);
                this.a(\u2603, \u2603, 7, 2, 0, 7, 2, 2, s.a, s.a, false);
                this.a(\u2603, \u2603, 5, 2, 0, 6, 2, 0, s.a, s.a, false);
                this.a(\u2603, s.e, 6, 2, 1, \u2603);
                this.a(\u2603, \u2603, 0, 1, 5, 2, 1, 7, s.b, s.b, false);
                this.a(\u2603, \u2603, 0, 3, 5, 2, 3, 7, s.b, s.b, false);
                this.a(\u2603, \u2603, 0, 2, 5, 0, 2, 7, s.a, s.a, false);
                this.a(\u2603, \u2603, 1, 2, 7, 2, 2, 7, s.a, s.a, false);
                this.a(\u2603, s.e, 1, 2, 6, \u2603);
                this.a(\u2603, \u2603, 5, 1, 5, 7, 1, 7, s.b, s.b, false);
                this.a(\u2603, \u2603, 5, 3, 5, 7, 3, 7, s.b, s.b, false);
                this.a(\u2603, \u2603, 7, 2, 5, 7, 2, 7, s.a, s.a, false);
                this.a(\u2603, \u2603, 5, 2, 7, 6, 2, 7, s.a, s.a, false);
                this.a(\u2603, s.e, 6, 2, 6, \u2603);
                if (this.k.c[cq.d.a()]) {
                    this.a(\u2603, \u2603, 3, 3, 0, 4, 3, 0, s.b, s.b, false);
                }
                else {
                    this.a(\u2603, \u2603, 3, 3, 0, 4, 3, 1, s.b, s.b, false);
                    this.a(\u2603, \u2603, 3, 2, 0, 4, 2, 0, s.a, s.a, false);
                    this.a(\u2603, \u2603, 3, 1, 0, 4, 1, 1, s.b, s.b, false);
                }
                if (this.k.c[cq.c.a()]) {
                    this.a(\u2603, \u2603, 3, 3, 7, 4, 3, 7, s.b, s.b, false);
                }
                else {
                    this.a(\u2603, \u2603, 3, 3, 6, 4, 3, 7, s.b, s.b, false);
                    this.a(\u2603, \u2603, 3, 2, 7, 4, 2, 7, s.a, s.a, false);
                    this.a(\u2603, \u2603, 3, 1, 6, 4, 1, 7, s.b, s.b, false);
                }
                if (this.k.c[cq.e.a()]) {
                    this.a(\u2603, \u2603, 0, 3, 3, 0, 3, 4, s.b, s.b, false);
                }
                else {
                    this.a(\u2603, \u2603, 0, 3, 3, 1, 3, 4, s.b, s.b, false);
                    this.a(\u2603, \u2603, 0, 2, 3, 0, 2, 4, s.a, s.a, false);
                    this.a(\u2603, \u2603, 0, 1, 3, 1, 1, 4, s.b, s.b, false);
                }
                if (this.k.c[cq.f.a()]) {
                    this.a(\u2603, \u2603, 7, 3, 3, 7, 3, 4, s.b, s.b, false);
                }
                else {
                    this.a(\u2603, \u2603, 6, 3, 3, 7, 3, 4, s.b, s.b, false);
                    this.a(\u2603, \u2603, 7, 2, 3, 7, 2, 4, s.a, s.a, false);
                    this.a(\u2603, \u2603, 6, 1, 3, 7, 1, 4, s.b, s.b, false);
                }
            }
            else if (this.o == 1) {
                this.a(\u2603, \u2603, 2, 1, 2, 2, 3, 2, s.b, s.b, false);
                this.a(\u2603, \u2603, 2, 1, 5, 2, 3, 5, s.b, s.b, false);
                this.a(\u2603, \u2603, 5, 1, 5, 5, 3, 5, s.b, s.b, false);
                this.a(\u2603, \u2603, 5, 1, 2, 5, 3, 2, s.b, s.b, false);
                this.a(\u2603, s.e, 2, 2, 2, \u2603);
                this.a(\u2603, s.e, 2, 2, 5, \u2603);
                this.a(\u2603, s.e, 5, 2, 5, \u2603);
                this.a(\u2603, s.e, 5, 2, 2, \u2603);
                this.a(\u2603, \u2603, 0, 1, 0, 1, 3, 0, s.b, s.b, false);
                this.a(\u2603, \u2603, 0, 1, 1, 0, 3, 1, s.b, s.b, false);
                this.a(\u2603, \u2603, 0, 1, 7, 1, 3, 7, s.b, s.b, false);
                this.a(\u2603, \u2603, 0, 1, 6, 0, 3, 6, s.b, s.b, false);
                this.a(\u2603, \u2603, 6, 1, 7, 7, 3, 7, s.b, s.b, false);
                this.a(\u2603, \u2603, 7, 1, 6, 7, 3, 6, s.b, s.b, false);
                this.a(\u2603, \u2603, 6, 1, 0, 7, 3, 0, s.b, s.b, false);
                this.a(\u2603, \u2603, 7, 1, 1, 7, 3, 1, s.b, s.b, false);
                this.a(\u2603, s.a, 1, 2, 0, \u2603);
                this.a(\u2603, s.a, 0, 2, 1, \u2603);
                this.a(\u2603, s.a, 1, 2, 7, \u2603);
                this.a(\u2603, s.a, 0, 2, 6, \u2603);
                this.a(\u2603, s.a, 6, 2, 7, \u2603);
                this.a(\u2603, s.a, 7, 2, 6, \u2603);
                this.a(\u2603, s.a, 6, 2, 0, \u2603);
                this.a(\u2603, s.a, 7, 2, 1, \u2603);
                if (!this.k.c[cq.d.a()]) {
                    this.a(\u2603, \u2603, 1, 3, 0, 6, 3, 0, s.b, s.b, false);
                    this.a(\u2603, \u2603, 1, 2, 0, 6, 2, 0, s.a, s.a, false);
                    this.a(\u2603, \u2603, 1, 1, 0, 6, 1, 0, s.b, s.b, false);
                }
                if (!this.k.c[cq.c.a()]) {
                    this.a(\u2603, \u2603, 1, 3, 7, 6, 3, 7, s.b, s.b, false);
                    this.a(\u2603, \u2603, 1, 2, 7, 6, 2, 7, s.a, s.a, false);
                    this.a(\u2603, \u2603, 1, 1, 7, 6, 1, 7, s.b, s.b, false);
                }
                if (!this.k.c[cq.e.a()]) {
                    this.a(\u2603, \u2603, 0, 3, 1, 0, 3, 6, s.b, s.b, false);
                    this.a(\u2603, \u2603, 0, 2, 1, 0, 2, 6, s.a, s.a, false);
                    this.a(\u2603, \u2603, 0, 1, 1, 0, 1, 6, s.b, s.b, false);
                }
                if (!this.k.c[cq.f.a()]) {
                    this.a(\u2603, \u2603, 7, 3, 1, 7, 3, 6, s.b, s.b, false);
                    this.a(\u2603, \u2603, 7, 2, 1, 7, 2, 6, s.a, s.a, false);
                    this.a(\u2603, \u2603, 7, 1, 1, 7, 1, 6, s.b, s.b, false);
                }
            }
            else if (this.o == 2) {
                this.a(\u2603, \u2603, 0, 1, 0, 0, 1, 7, s.b, s.b, false);
                this.a(\u2603, \u2603, 7, 1, 0, 7, 1, 7, s.b, s.b, false);
                this.a(\u2603, \u2603, 1, 1, 0, 6, 1, 0, s.b, s.b, false);
                this.a(\u2603, \u2603, 1, 1, 7, 6, 1, 7, s.b, s.b, false);
                this.a(\u2603, \u2603, 0, 2, 0, 0, 2, 7, s.c, s.c, false);
                this.a(\u2603, \u2603, 7, 2, 0, 7, 2, 7, s.c, s.c, false);
                this.a(\u2603, \u2603, 1, 2, 0, 6, 2, 0, s.c, s.c, false);
                this.a(\u2603, \u2603, 1, 2, 7, 6, 2, 7, s.c, s.c, false);
                this.a(\u2603, \u2603, 0, 3, 0, 0, 3, 7, s.b, s.b, false);
                this.a(\u2603, \u2603, 7, 3, 0, 7, 3, 7, s.b, s.b, false);
                this.a(\u2603, \u2603, 1, 3, 0, 6, 3, 0, s.b, s.b, false);
                this.a(\u2603, \u2603, 1, 3, 7, 6, 3, 7, s.b, s.b, false);
                this.a(\u2603, \u2603, 0, 1, 3, 0, 2, 4, s.c, s.c, false);
                this.a(\u2603, \u2603, 7, 1, 3, 7, 2, 4, s.c, s.c, false);
                this.a(\u2603, \u2603, 3, 1, 0, 4, 2, 0, s.c, s.c, false);
                this.a(\u2603, \u2603, 3, 1, 7, 4, 2, 7, s.c, s.c, false);
                if (this.k.c[cq.d.a()]) {
                    this.a(\u2603, \u2603, 3, 1, 0, 4, 2, 0, false);
                }
                if (this.k.c[cq.c.a()]) {
                    this.a(\u2603, \u2603, 3, 1, 7, 4, 2, 7, false);
                }
                if (this.k.c[cq.e.a()]) {
                    this.a(\u2603, \u2603, 0, 1, 3, 0, 2, 4, false);
                }
                if (this.k.c[cq.f.a()]) {
                    this.a(\u2603, \u2603, 7, 1, 3, 7, 2, 4, false);
                }
            }
            if (b) {
                this.a(\u2603, \u2603, 3, 1, 3, 4, 1, 4, s.b, s.b, false);
                this.a(\u2603, \u2603, 3, 2, 3, 4, 2, 4, s.a, s.a, false);
                this.a(\u2603, \u2603, 3, 3, 3, 4, 3, 4, s.b, s.b, false);
            }
            return true;
        }
    }
    
    public static class t extends r
    {
        public t() {
        }
        
        public t(final cq \u2603, final v \u2603, final Random \u2603) {
            super(1, \u2603, \u2603, 1, 1, 1);
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            if (this.k.a / 25 > 0) {
                this.a(\u2603, \u2603, 0, 0, this.k.c[cq.a.a()]);
            }
            if (this.k.b[cq.b.a()] == null) {
                this.a(\u2603, \u2603, 1, 4, 1, 6, 4, 6, t.a);
            }
            for (int i = 1; i <= 6; ++i) {
                for (int j = 1; j <= 6; ++j) {
                    if (\u2603.nextInt(3) != 0) {
                        final int \u26032 = 2 + ((\u2603.nextInt(4) != 0) ? 1 : 0);
                        this.a(\u2603, \u2603, i, \u26032, j, i, 3, j, afi.v.a(1), afi.v.a(1), false);
                    }
                }
            }
            this.a(\u2603, \u2603, 0, 1, 0, 0, 1, 7, t.b, t.b, false);
            this.a(\u2603, \u2603, 7, 1, 0, 7, 1, 7, t.b, t.b, false);
            this.a(\u2603, \u2603, 1, 1, 0, 6, 1, 0, t.b, t.b, false);
            this.a(\u2603, \u2603, 1, 1, 7, 6, 1, 7, t.b, t.b, false);
            this.a(\u2603, \u2603, 0, 2, 0, 0, 2, 7, t.c, t.c, false);
            this.a(\u2603, \u2603, 7, 2, 0, 7, 2, 7, t.c, t.c, false);
            this.a(\u2603, \u2603, 1, 2, 0, 6, 2, 0, t.c, t.c, false);
            this.a(\u2603, \u2603, 1, 2, 7, 6, 2, 7, t.c, t.c, false);
            this.a(\u2603, \u2603, 0, 3, 0, 0, 3, 7, t.b, t.b, false);
            this.a(\u2603, \u2603, 7, 3, 0, 7, 3, 7, t.b, t.b, false);
            this.a(\u2603, \u2603, 1, 3, 0, 6, 3, 0, t.b, t.b, false);
            this.a(\u2603, \u2603, 1, 3, 7, 6, 3, 7, t.b, t.b, false);
            this.a(\u2603, \u2603, 0, 1, 3, 0, 2, 4, t.c, t.c, false);
            this.a(\u2603, \u2603, 7, 1, 3, 7, 2, 4, t.c, t.c, false);
            this.a(\u2603, \u2603, 3, 1, 0, 4, 2, 0, t.c, t.c, false);
            this.a(\u2603, \u2603, 3, 1, 7, 4, 2, 7, t.c, t.c, false);
            if (this.k.c[cq.d.a()]) {
                this.a(\u2603, \u2603, 3, 1, 0, 4, 2, 0, false);
            }
            return true;
        }
    }
    
    public static class m extends r
    {
        public m() {
        }
        
        public m(final cq \u2603, final v \u2603, final Random \u2603) {
            super(1, \u2603, \u2603, 1, 2, 1);
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            if (this.k.a / 25 > 0) {
                this.a(\u2603, \u2603, 0, 0, this.k.c[cq.a.a()]);
            }
            final v v = this.k.b[cq.b.a()];
            if (v.b[cq.b.a()] == null) {
                this.a(\u2603, \u2603, 1, 8, 1, 6, 8, 6, m.a);
            }
            this.a(\u2603, \u2603, 0, 4, 0, 0, 4, 7, m.b, m.b, false);
            this.a(\u2603, \u2603, 7, 4, 0, 7, 4, 7, m.b, m.b, false);
            this.a(\u2603, \u2603, 1, 4, 0, 6, 4, 0, m.b, m.b, false);
            this.a(\u2603, \u2603, 1, 4, 7, 6, 4, 7, m.b, m.b, false);
            this.a(\u2603, \u2603, 2, 4, 1, 2, 4, 2, m.b, m.b, false);
            this.a(\u2603, \u2603, 1, 4, 2, 1, 4, 2, m.b, m.b, false);
            this.a(\u2603, \u2603, 5, 4, 1, 5, 4, 2, m.b, m.b, false);
            this.a(\u2603, \u2603, 6, 4, 2, 6, 4, 2, m.b, m.b, false);
            this.a(\u2603, \u2603, 2, 4, 5, 2, 4, 6, m.b, m.b, false);
            this.a(\u2603, \u2603, 1, 4, 5, 1, 4, 5, m.b, m.b, false);
            this.a(\u2603, \u2603, 5, 4, 5, 5, 4, 6, m.b, m.b, false);
            this.a(\u2603, \u2603, 6, 4, 5, 6, 4, 5, m.b, m.b, false);
            v k = this.k;
            for (int i = 1; i <= 5; i += 4) {
                int n = 0;
                if (k.c[cq.d.a()]) {
                    this.a(\u2603, \u2603, 2, i, n, 2, i + 2, n, m.b, m.b, false);
                    this.a(\u2603, \u2603, 5, i, n, 5, i + 2, n, m.b, m.b, false);
                    this.a(\u2603, \u2603, 3, i + 2, n, 4, i + 2, n, m.b, m.b, false);
                }
                else {
                    this.a(\u2603, \u2603, 0, i, n, 7, i + 2, n, m.b, m.b, false);
                    this.a(\u2603, \u2603, 0, i + 1, n, 7, i + 1, n, m.a, m.a, false);
                }
                n = 7;
                if (k.c[cq.c.a()]) {
                    this.a(\u2603, \u2603, 2, i, n, 2, i + 2, n, m.b, m.b, false);
                    this.a(\u2603, \u2603, 5, i, n, 5, i + 2, n, m.b, m.b, false);
                    this.a(\u2603, \u2603, 3, i + 2, n, 4, i + 2, n, m.b, m.b, false);
                }
                else {
                    this.a(\u2603, \u2603, 0, i, n, 7, i + 2, n, m.b, m.b, false);
                    this.a(\u2603, \u2603, 0, i + 1, n, 7, i + 1, n, m.a, m.a, false);
                }
                int n2 = 0;
                if (k.c[cq.e.a()]) {
                    this.a(\u2603, \u2603, n2, i, 2, n2, i + 2, 2, m.b, m.b, false);
                    this.a(\u2603, \u2603, n2, i, 5, n2, i + 2, 5, m.b, m.b, false);
                    this.a(\u2603, \u2603, n2, i + 2, 3, n2, i + 2, 4, m.b, m.b, false);
                }
                else {
                    this.a(\u2603, \u2603, n2, i, 0, n2, i + 2, 7, m.b, m.b, false);
                    this.a(\u2603, \u2603, n2, i + 1, 0, n2, i + 1, 7, m.a, m.a, false);
                }
                n2 = 7;
                if (k.c[cq.f.a()]) {
                    this.a(\u2603, \u2603, n2, i, 2, n2, i + 2, 2, m.b, m.b, false);
                    this.a(\u2603, \u2603, n2, i, 5, n2, i + 2, 5, m.b, m.b, false);
                    this.a(\u2603, \u2603, n2, i + 2, 3, n2, i + 2, 4, m.b, m.b, false);
                }
                else {
                    this.a(\u2603, \u2603, n2, i, 0, n2, i + 2, 7, m.b, m.b, false);
                    this.a(\u2603, \u2603, n2, i + 1, 0, n2, i + 1, 7, m.a, m.a, false);
                }
                k = v;
            }
            return true;
        }
    }
    
    public static class k extends r
    {
        public k() {
        }
        
        public k(final cq \u2603, final v \u2603, final Random \u2603) {
            super(1, \u2603, \u2603, 2, 1, 1);
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            final v v = this.k.b[cq.f.a()];
            final v k = this.k;
            if (this.k.a / 25 > 0) {
                this.a(\u2603, \u2603, 8, 0, v.c[cq.a.a()]);
                this.a(\u2603, \u2603, 0, 0, k.c[cq.a.a()]);
            }
            if (k.b[cq.b.a()] == null) {
                this.a(\u2603, \u2603, 1, 4, 1, 7, 4, 6, aql.k.a);
            }
            if (v.b[cq.b.a()] == null) {
                this.a(\u2603, \u2603, 8, 4, 1, 14, 4, 6, aql.k.a);
            }
            this.a(\u2603, \u2603, 0, 3, 0, 0, 3, 7, aql.k.b, aql.k.b, false);
            this.a(\u2603, \u2603, 15, 3, 0, 15, 3, 7, aql.k.b, aql.k.b, false);
            this.a(\u2603, \u2603, 1, 3, 0, 15, 3, 0, aql.k.b, aql.k.b, false);
            this.a(\u2603, \u2603, 1, 3, 7, 14, 3, 7, aql.k.b, aql.k.b, false);
            this.a(\u2603, \u2603, 0, 2, 0, 0, 2, 7, aql.k.a, aql.k.a, false);
            this.a(\u2603, \u2603, 15, 2, 0, 15, 2, 7, aql.k.a, aql.k.a, false);
            this.a(\u2603, \u2603, 1, 2, 0, 15, 2, 0, aql.k.a, aql.k.a, false);
            this.a(\u2603, \u2603, 1, 2, 7, 14, 2, 7, aql.k.a, aql.k.a, false);
            this.a(\u2603, \u2603, 0, 1, 0, 0, 1, 7, aql.k.b, aql.k.b, false);
            this.a(\u2603, \u2603, 15, 1, 0, 15, 1, 7, aql.k.b, aql.k.b, false);
            this.a(\u2603, \u2603, 1, 1, 0, 15, 1, 0, aql.k.b, aql.k.b, false);
            this.a(\u2603, \u2603, 1, 1, 7, 14, 1, 7, aql.k.b, aql.k.b, false);
            this.a(\u2603, \u2603, 5, 1, 0, 10, 1, 4, aql.k.b, aql.k.b, false);
            this.a(\u2603, \u2603, 6, 2, 0, 9, 2, 3, aql.k.a, aql.k.a, false);
            this.a(\u2603, \u2603, 5, 3, 0, 10, 3, 4, aql.k.b, aql.k.b, false);
            this.a(\u2603, aql.k.e, 6, 2, 3, \u2603);
            this.a(\u2603, aql.k.e, 9, 2, 3, \u2603);
            if (k.c[cq.d.a()]) {
                this.a(\u2603, \u2603, 3, 1, 0, 4, 2, 0, false);
            }
            if (k.c[cq.c.a()]) {
                this.a(\u2603, \u2603, 3, 1, 7, 4, 2, 7, false);
            }
            if (k.c[cq.e.a()]) {
                this.a(\u2603, \u2603, 0, 1, 3, 0, 2, 4, false);
            }
            if (v.c[cq.d.a()]) {
                this.a(\u2603, \u2603, 11, 1, 0, 12, 2, 0, false);
            }
            if (v.c[cq.c.a()]) {
                this.a(\u2603, \u2603, 11, 1, 7, 12, 2, 7, false);
            }
            if (v.c[cq.f.a()]) {
                this.a(\u2603, \u2603, 15, 1, 3, 15, 2, 4, false);
            }
            return true;
        }
    }
    
    public static class o extends r
    {
        public o() {
        }
        
        public o(final cq \u2603, final v \u2603, final Random \u2603) {
            super(1, \u2603, \u2603, 1, 1, 2);
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            final v v = this.k.b[cq.c.a()];
            final v k = this.k;
            if (this.k.a / 25 > 0) {
                this.a(\u2603, \u2603, 0, 8, v.c[cq.a.a()]);
                this.a(\u2603, \u2603, 0, 0, k.c[cq.a.a()]);
            }
            if (k.b[cq.b.a()] == null) {
                this.a(\u2603, \u2603, 1, 4, 1, 6, 4, 7, o.a);
            }
            if (v.b[cq.b.a()] == null) {
                this.a(\u2603, \u2603, 1, 4, 8, 6, 4, 14, o.a);
            }
            this.a(\u2603, \u2603, 0, 3, 0, 0, 3, 15, o.b, o.b, false);
            this.a(\u2603, \u2603, 7, 3, 0, 7, 3, 15, o.b, o.b, false);
            this.a(\u2603, \u2603, 1, 3, 0, 7, 3, 0, o.b, o.b, false);
            this.a(\u2603, \u2603, 1, 3, 15, 6, 3, 15, o.b, o.b, false);
            this.a(\u2603, \u2603, 0, 2, 0, 0, 2, 15, o.a, o.a, false);
            this.a(\u2603, \u2603, 7, 2, 0, 7, 2, 15, o.a, o.a, false);
            this.a(\u2603, \u2603, 1, 2, 0, 7, 2, 0, o.a, o.a, false);
            this.a(\u2603, \u2603, 1, 2, 15, 6, 2, 15, o.a, o.a, false);
            this.a(\u2603, \u2603, 0, 1, 0, 0, 1, 15, o.b, o.b, false);
            this.a(\u2603, \u2603, 7, 1, 0, 7, 1, 15, o.b, o.b, false);
            this.a(\u2603, \u2603, 1, 1, 0, 7, 1, 0, o.b, o.b, false);
            this.a(\u2603, \u2603, 1, 1, 15, 6, 1, 15, o.b, o.b, false);
            this.a(\u2603, \u2603, 1, 1, 1, 1, 1, 2, o.b, o.b, false);
            this.a(\u2603, \u2603, 6, 1, 1, 6, 1, 2, o.b, o.b, false);
            this.a(\u2603, \u2603, 1, 3, 1, 1, 3, 2, o.b, o.b, false);
            this.a(\u2603, \u2603, 6, 3, 1, 6, 3, 2, o.b, o.b, false);
            this.a(\u2603, \u2603, 1, 1, 13, 1, 1, 14, o.b, o.b, false);
            this.a(\u2603, \u2603, 6, 1, 13, 6, 1, 14, o.b, o.b, false);
            this.a(\u2603, \u2603, 1, 3, 13, 1, 3, 14, o.b, o.b, false);
            this.a(\u2603, \u2603, 6, 3, 13, 6, 3, 14, o.b, o.b, false);
            this.a(\u2603, \u2603, 2, 1, 6, 2, 3, 6, o.b, o.b, false);
            this.a(\u2603, \u2603, 5, 1, 6, 5, 3, 6, o.b, o.b, false);
            this.a(\u2603, \u2603, 2, 1, 9, 2, 3, 9, o.b, o.b, false);
            this.a(\u2603, \u2603, 5, 1, 9, 5, 3, 9, o.b, o.b, false);
            this.a(\u2603, \u2603, 3, 2, 6, 4, 2, 6, o.b, o.b, false);
            this.a(\u2603, \u2603, 3, 2, 9, 4, 2, 9, o.b, o.b, false);
            this.a(\u2603, \u2603, 2, 2, 7, 2, 2, 8, o.b, o.b, false);
            this.a(\u2603, \u2603, 5, 2, 7, 5, 2, 8, o.b, o.b, false);
            this.a(\u2603, o.e, 2, 2, 5, \u2603);
            this.a(\u2603, o.e, 5, 2, 5, \u2603);
            this.a(\u2603, o.e, 2, 2, 10, \u2603);
            this.a(\u2603, o.e, 5, 2, 10, \u2603);
            this.a(\u2603, o.b, 2, 3, 5, \u2603);
            this.a(\u2603, o.b, 5, 3, 5, \u2603);
            this.a(\u2603, o.b, 2, 3, 10, \u2603);
            this.a(\u2603, o.b, 5, 3, 10, \u2603);
            if (k.c[cq.d.a()]) {
                this.a(\u2603, \u2603, 3, 1, 0, 4, 2, 0, false);
            }
            if (k.c[cq.f.a()]) {
                this.a(\u2603, \u2603, 7, 1, 3, 7, 2, 4, false);
            }
            if (k.c[cq.e.a()]) {
                this.a(\u2603, \u2603, 0, 1, 3, 0, 2, 4, false);
            }
            if (v.c[cq.c.a()]) {
                this.a(\u2603, \u2603, 3, 1, 15, 4, 2, 15, false);
            }
            if (v.c[cq.e.a()]) {
                this.a(\u2603, \u2603, 0, 1, 11, 0, 2, 12, false);
            }
            if (v.c[cq.f.a()]) {
                this.a(\u2603, \u2603, 7, 1, 11, 7, 2, 12, false);
            }
            return true;
        }
    }
    
    public static class l extends r
    {
        public l() {
        }
        
        public l(final cq \u2603, final v \u2603, final Random \u2603) {
            super(1, \u2603, \u2603, 2, 2, 1);
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            final v v = this.k.b[cq.f.a()];
            final v k = this.k;
            final v v2 = k.b[cq.b.a()];
            final v v3 = v.b[cq.b.a()];
            if (this.k.a / 25 > 0) {
                this.a(\u2603, \u2603, 8, 0, v.c[cq.a.a()]);
                this.a(\u2603, \u2603, 0, 0, k.c[cq.a.a()]);
            }
            if (v2.b[cq.b.a()] == null) {
                this.a(\u2603, \u2603, 1, 8, 1, 7, 8, 6, l.a);
            }
            if (v3.b[cq.b.a()] == null) {
                this.a(\u2603, \u2603, 8, 8, 1, 14, 8, 6, l.a);
            }
            for (int i = 1; i <= 7; ++i) {
                alz alz = l.b;
                if (i == 2 || i == 6) {
                    alz = l.a;
                }
                this.a(\u2603, \u2603, 0, i, 0, 0, i, 7, alz, alz, false);
                this.a(\u2603, \u2603, 15, i, 0, 15, i, 7, alz, alz, false);
                this.a(\u2603, \u2603, 1, i, 0, 15, i, 0, alz, alz, false);
                this.a(\u2603, \u2603, 1, i, 7, 14, i, 7, alz, alz, false);
            }
            this.a(\u2603, \u2603, 2, 1, 3, 2, 7, 4, l.b, l.b, false);
            this.a(\u2603, \u2603, 3, 1, 2, 4, 7, 2, l.b, l.b, false);
            this.a(\u2603, \u2603, 3, 1, 5, 4, 7, 5, l.b, l.b, false);
            this.a(\u2603, \u2603, 13, 1, 3, 13, 7, 4, l.b, l.b, false);
            this.a(\u2603, \u2603, 11, 1, 2, 12, 7, 2, l.b, l.b, false);
            this.a(\u2603, \u2603, 11, 1, 5, 12, 7, 5, l.b, l.b, false);
            this.a(\u2603, \u2603, 5, 1, 3, 5, 3, 4, l.b, l.b, false);
            this.a(\u2603, \u2603, 10, 1, 3, 10, 3, 4, l.b, l.b, false);
            this.a(\u2603, \u2603, 5, 7, 2, 10, 7, 5, l.b, l.b, false);
            this.a(\u2603, \u2603, 5, 5, 2, 5, 7, 2, l.b, l.b, false);
            this.a(\u2603, \u2603, 10, 5, 2, 10, 7, 2, l.b, l.b, false);
            this.a(\u2603, \u2603, 5, 5, 5, 5, 7, 5, l.b, l.b, false);
            this.a(\u2603, \u2603, 10, 5, 5, 10, 7, 5, l.b, l.b, false);
            this.a(\u2603, l.b, 6, 6, 2, \u2603);
            this.a(\u2603, l.b, 9, 6, 2, \u2603);
            this.a(\u2603, l.b, 6, 6, 5, \u2603);
            this.a(\u2603, l.b, 9, 6, 5, \u2603);
            this.a(\u2603, \u2603, 5, 4, 3, 6, 4, 4, l.b, l.b, false);
            this.a(\u2603, \u2603, 9, 4, 3, 10, 4, 4, l.b, l.b, false);
            this.a(\u2603, l.e, 5, 4, 2, \u2603);
            this.a(\u2603, l.e, 5, 4, 5, \u2603);
            this.a(\u2603, l.e, 10, 4, 2, \u2603);
            this.a(\u2603, l.e, 10, 4, 5, \u2603);
            if (k.c[cq.d.a()]) {
                this.a(\u2603, \u2603, 3, 1, 0, 4, 2, 0, false);
            }
            if (k.c[cq.c.a()]) {
                this.a(\u2603, \u2603, 3, 1, 7, 4, 2, 7, false);
            }
            if (k.c[cq.e.a()]) {
                this.a(\u2603, \u2603, 0, 1, 3, 0, 2, 4, false);
            }
            if (v.c[cq.d.a()]) {
                this.a(\u2603, \u2603, 11, 1, 0, 12, 2, 0, false);
            }
            if (v.c[cq.c.a()]) {
                this.a(\u2603, \u2603, 11, 1, 7, 12, 2, 7, false);
            }
            if (v.c[cq.f.a()]) {
                this.a(\u2603, \u2603, 15, 1, 3, 15, 2, 4, false);
            }
            if (v2.c[cq.d.a()]) {
                this.a(\u2603, \u2603, 3, 5, 0, 4, 6, 0, false);
            }
            if (v2.c[cq.c.a()]) {
                this.a(\u2603, \u2603, 3, 5, 7, 4, 6, 7, false);
            }
            if (v2.c[cq.e.a()]) {
                this.a(\u2603, \u2603, 0, 5, 3, 0, 6, 4, false);
            }
            if (v3.c[cq.d.a()]) {
                this.a(\u2603, \u2603, 11, 5, 0, 12, 6, 0, false);
            }
            if (v3.c[cq.c.a()]) {
                this.a(\u2603, \u2603, 11, 5, 7, 12, 6, 7, false);
            }
            if (v3.c[cq.f.a()]) {
                this.a(\u2603, \u2603, 15, 5, 3, 15, 6, 4, false);
            }
            return true;
        }
    }
    
    public static class n extends r
    {
        public n() {
        }
        
        public n(final cq \u2603, final v \u2603, final Random \u2603) {
            super(1, \u2603, \u2603, 1, 2, 2);
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            final v v = this.k.b[cq.c.a()];
            final v k = this.k;
            final v v2 = v.b[cq.b.a()];
            final v v3 = k.b[cq.b.a()];
            if (this.k.a / 25 > 0) {
                this.a(\u2603, \u2603, 0, 8, v.c[cq.a.a()]);
                this.a(\u2603, \u2603, 0, 0, k.c[cq.a.a()]);
            }
            if (v3.b[cq.b.a()] == null) {
                this.a(\u2603, \u2603, 1, 8, 1, 6, 8, 7, n.a);
            }
            if (v2.b[cq.b.a()] == null) {
                this.a(\u2603, \u2603, 1, 8, 8, 6, 8, 14, n.a);
            }
            for (int i = 1; i <= 7; ++i) {
                alz alz = n.b;
                if (i == 2 || i == 6) {
                    alz = n.a;
                }
                this.a(\u2603, \u2603, 0, i, 0, 0, i, 15, alz, alz, false);
                this.a(\u2603, \u2603, 7, i, 0, 7, i, 15, alz, alz, false);
                this.a(\u2603, \u2603, 1, i, 0, 6, i, 0, alz, alz, false);
                this.a(\u2603, \u2603, 1, i, 15, 6, i, 15, alz, alz, false);
            }
            for (int i = 1; i <= 7; ++i) {
                alz alz = n.c;
                if (i == 2 || i == 6) {
                    alz = n.e;
                }
                this.a(\u2603, \u2603, 3, i, 7, 4, i, 8, alz, alz, false);
            }
            if (k.c[cq.d.a()]) {
                this.a(\u2603, \u2603, 3, 1, 0, 4, 2, 0, false);
            }
            if (k.c[cq.f.a()]) {
                this.a(\u2603, \u2603, 7, 1, 3, 7, 2, 4, false);
            }
            if (k.c[cq.e.a()]) {
                this.a(\u2603, \u2603, 0, 1, 3, 0, 2, 4, false);
            }
            if (v.c[cq.c.a()]) {
                this.a(\u2603, \u2603, 3, 1, 15, 4, 2, 15, false);
            }
            if (v.c[cq.e.a()]) {
                this.a(\u2603, \u2603, 0, 1, 11, 0, 2, 12, false);
            }
            if (v.c[cq.f.a()]) {
                this.a(\u2603, \u2603, 7, 1, 11, 7, 2, 12, false);
            }
            if (v3.c[cq.d.a()]) {
                this.a(\u2603, \u2603, 3, 5, 0, 4, 6, 0, false);
            }
            if (v3.c[cq.f.a()]) {
                this.a(\u2603, \u2603, 7, 5, 3, 7, 6, 4, false);
                this.a(\u2603, \u2603, 5, 4, 2, 6, 4, 5, n.b, n.b, false);
                this.a(\u2603, \u2603, 6, 1, 2, 6, 3, 2, n.b, n.b, false);
                this.a(\u2603, \u2603, 6, 1, 5, 6, 3, 5, n.b, n.b, false);
            }
            if (v3.c[cq.e.a()]) {
                this.a(\u2603, \u2603, 0, 5, 3, 0, 6, 4, false);
                this.a(\u2603, \u2603, 1, 4, 2, 2, 4, 5, n.b, n.b, false);
                this.a(\u2603, \u2603, 1, 1, 2, 1, 3, 2, n.b, n.b, false);
                this.a(\u2603, \u2603, 1, 1, 5, 1, 3, 5, n.b, n.b, false);
            }
            if (v2.c[cq.c.a()]) {
                this.a(\u2603, \u2603, 3, 5, 15, 4, 6, 15, false);
            }
            if (v2.c[cq.e.a()]) {
                this.a(\u2603, \u2603, 0, 5, 11, 0, 6, 12, false);
                this.a(\u2603, \u2603, 1, 4, 10, 2, 4, 13, n.b, n.b, false);
                this.a(\u2603, \u2603, 1, 1, 10, 1, 3, 10, n.b, n.b, false);
                this.a(\u2603, \u2603, 1, 1, 13, 1, 3, 13, n.b, n.b, false);
            }
            if (v2.c[cq.f.a()]) {
                this.a(\u2603, \u2603, 7, 5, 11, 7, 6, 12, false);
                this.a(\u2603, \u2603, 5, 4, 10, 6, 4, 13, n.b, n.b, false);
                this.a(\u2603, \u2603, 6, 1, 10, 6, 3, 10, n.b, n.b, false);
                this.a(\u2603, \u2603, 6, 1, 13, 6, 3, 13, n.b, n.b, false);
            }
            return true;
        }
    }
    
    public static class j extends r
    {
        public j() {
        }
        
        public j(final cq \u2603, final v \u2603, final Random \u2603) {
            super(1, \u2603, \u2603, 2, 2, 2);
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            this.a(\u2603, \u2603, 1, 8, 0, 14, 8, 14, j.a);
            int i = 7;
            alz alz = j.b;
            this.a(\u2603, \u2603, 0, i, 0, 0, i, 15, alz, alz, false);
            this.a(\u2603, \u2603, 15, i, 0, 15, i, 15, alz, alz, false);
            this.a(\u2603, \u2603, 1, i, 0, 15, i, 0, alz, alz, false);
            this.a(\u2603, \u2603, 1, i, 15, 14, i, 15, alz, alz, false);
            for (i = 1; i <= 6; ++i) {
                alz = j.b;
                if (i == 2 || i == 6) {
                    alz = j.a;
                }
                for (int j = 0; j <= 15; j += 15) {
                    this.a(\u2603, \u2603, j, i, 0, j, i, 1, alz, alz, false);
                    this.a(\u2603, \u2603, j, i, 6, j, i, 9, alz, alz, false);
                    this.a(\u2603, \u2603, j, i, 14, j, i, 15, alz, alz, false);
                }
                this.a(\u2603, \u2603, 1, i, 0, 1, i, 0, alz, alz, false);
                this.a(\u2603, \u2603, 6, i, 0, 9, i, 0, alz, alz, false);
                this.a(\u2603, \u2603, 14, i, 0, 14, i, 0, alz, alz, false);
                this.a(\u2603, \u2603, 1, i, 15, 14, i, 15, alz, alz, false);
            }
            this.a(\u2603, \u2603, 6, 3, 6, 9, 6, 9, j.c, j.c, false);
            this.a(\u2603, \u2603, 7, 4, 7, 8, 5, 8, afi.R.Q(), afi.R.Q(), false);
            for (i = 3; i <= 6; i += 3) {
                for (int k = 6; k <= 9; k += 3) {
                    this.a(\u2603, j.e, k, i, 6, \u2603);
                    this.a(\u2603, j.e, k, i, 9, \u2603);
                }
            }
            this.a(\u2603, \u2603, 5, 1, 6, 5, 2, 6, j.b, j.b, false);
            this.a(\u2603, \u2603, 5, 1, 9, 5, 2, 9, j.b, j.b, false);
            this.a(\u2603, \u2603, 10, 1, 6, 10, 2, 6, j.b, j.b, false);
            this.a(\u2603, \u2603, 10, 1, 9, 10, 2, 9, j.b, j.b, false);
            this.a(\u2603, \u2603, 6, 1, 5, 6, 2, 5, j.b, j.b, false);
            this.a(\u2603, \u2603, 9, 1, 5, 9, 2, 5, j.b, j.b, false);
            this.a(\u2603, \u2603, 6, 1, 10, 6, 2, 10, j.b, j.b, false);
            this.a(\u2603, \u2603, 9, 1, 10, 9, 2, 10, j.b, j.b, false);
            this.a(\u2603, \u2603, 5, 2, 5, 5, 6, 5, j.b, j.b, false);
            this.a(\u2603, \u2603, 5, 2, 10, 5, 6, 10, j.b, j.b, false);
            this.a(\u2603, \u2603, 10, 2, 5, 10, 6, 5, j.b, j.b, false);
            this.a(\u2603, \u2603, 10, 2, 10, 10, 6, 10, j.b, j.b, false);
            this.a(\u2603, \u2603, 5, 7, 1, 5, 7, 6, j.b, j.b, false);
            this.a(\u2603, \u2603, 10, 7, 1, 10, 7, 6, j.b, j.b, false);
            this.a(\u2603, \u2603, 5, 7, 9, 5, 7, 14, j.b, j.b, false);
            this.a(\u2603, \u2603, 10, 7, 9, 10, 7, 14, j.b, j.b, false);
            this.a(\u2603, \u2603, 1, 7, 5, 6, 7, 5, j.b, j.b, false);
            this.a(\u2603, \u2603, 1, 7, 10, 6, 7, 10, j.b, j.b, false);
            this.a(\u2603, \u2603, 9, 7, 5, 14, 7, 5, j.b, j.b, false);
            this.a(\u2603, \u2603, 9, 7, 10, 14, 7, 10, j.b, j.b, false);
            this.a(\u2603, \u2603, 2, 1, 2, 2, 1, 3, j.b, j.b, false);
            this.a(\u2603, \u2603, 3, 1, 2, 3, 1, 2, j.b, j.b, false);
            this.a(\u2603, \u2603, 13, 1, 2, 13, 1, 3, j.b, j.b, false);
            this.a(\u2603, \u2603, 12, 1, 2, 12, 1, 2, j.b, j.b, false);
            this.a(\u2603, \u2603, 2, 1, 12, 2, 1, 13, j.b, j.b, false);
            this.a(\u2603, \u2603, 3, 1, 13, 3, 1, 13, j.b, j.b, false);
            this.a(\u2603, \u2603, 13, 1, 12, 13, 1, 13, j.b, j.b, false);
            this.a(\u2603, \u2603, 12, 1, 13, 12, 1, 13, j.b, j.b, false);
            return true;
        }
    }
    
    public static class u extends r
    {
        private int o;
        
        public u() {
        }
        
        public u(final cq \u2603, final aqe \u2603, final int \u2603) {
            super(\u2603, \u2603);
            this.o = (\u2603 & 0x1);
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            if (this.o == 0) {
                for (int i = 0; i < 4; ++i) {
                    this.a(\u2603, \u2603, 10 - i, 3 - i, 20 - i, 12 + i, 3 - i, 20, u.b, u.b, false);
                }
                this.a(\u2603, \u2603, 7, 0, 6, 15, 0, 16, u.b, u.b, false);
                this.a(\u2603, \u2603, 6, 0, 6, 6, 3, 20, u.b, u.b, false);
                this.a(\u2603, \u2603, 16, 0, 6, 16, 3, 20, u.b, u.b, false);
                this.a(\u2603, \u2603, 7, 1, 7, 7, 1, 20, u.b, u.b, false);
                this.a(\u2603, \u2603, 15, 1, 7, 15, 1, 20, u.b, u.b, false);
                this.a(\u2603, \u2603, 7, 1, 6, 9, 3, 6, u.b, u.b, false);
                this.a(\u2603, \u2603, 13, 1, 6, 15, 3, 6, u.b, u.b, false);
                this.a(\u2603, \u2603, 8, 1, 7, 9, 1, 7, u.b, u.b, false);
                this.a(\u2603, \u2603, 13, 1, 7, 14, 1, 7, u.b, u.b, false);
                this.a(\u2603, \u2603, 9, 0, 5, 13, 0, 5, u.b, u.b, false);
                this.a(\u2603, \u2603, 10, 0, 7, 12, 0, 7, u.c, u.c, false);
                this.a(\u2603, \u2603, 8, 0, 10, 8, 0, 12, u.c, u.c, false);
                this.a(\u2603, \u2603, 14, 0, 10, 14, 0, 12, u.c, u.c, false);
                for (int i = 18; i >= 7; i -= 3) {
                    this.a(\u2603, u.e, 6, 3, i, \u2603);
                    this.a(\u2603, u.e, 16, 3, i, \u2603);
                }
                this.a(\u2603, u.e, 10, 0, 10, \u2603);
                this.a(\u2603, u.e, 12, 0, 10, \u2603);
                this.a(\u2603, u.e, 10, 0, 12, \u2603);
                this.a(\u2603, u.e, 12, 0, 12, \u2603);
                this.a(\u2603, u.e, 8, 3, 6, \u2603);
                this.a(\u2603, u.e, 14, 3, 6, \u2603);
                this.a(\u2603, u.b, 4, 2, 4, \u2603);
                this.a(\u2603, u.e, 4, 1, 4, \u2603);
                this.a(\u2603, u.b, 4, 0, 4, \u2603);
                this.a(\u2603, u.b, 18, 2, 4, \u2603);
                this.a(\u2603, u.e, 18, 1, 4, \u2603);
                this.a(\u2603, u.b, 18, 0, 4, \u2603);
                this.a(\u2603, u.b, 4, 2, 18, \u2603);
                this.a(\u2603, u.e, 4, 1, 18, \u2603);
                this.a(\u2603, u.b, 4, 0, 18, \u2603);
                this.a(\u2603, u.b, 18, 2, 18, \u2603);
                this.a(\u2603, u.e, 18, 1, 18, \u2603);
                this.a(\u2603, u.b, 18, 0, 18, \u2603);
                this.a(\u2603, u.b, 9, 7, 20, \u2603);
                this.a(\u2603, u.b, 13, 7, 20, \u2603);
                this.a(\u2603, \u2603, 6, 0, 21, 7, 4, 21, u.b, u.b, false);
                this.a(\u2603, \u2603, 15, 0, 21, 16, 4, 21, u.b, u.b, false);
                this.a(\u2603, \u2603, 11, 2, 16);
            }
            else if (this.o == 1) {
                this.a(\u2603, \u2603, 9, 3, 18, 13, 3, 20, u.b, u.b, false);
                this.a(\u2603, \u2603, 9, 0, 18, 9, 2, 18, u.b, u.b, false);
                this.a(\u2603, \u2603, 13, 0, 18, 13, 2, 18, u.b, u.b, false);
                int i = 9;
                final int \u26032 = 20;
                final int \u26033 = 5;
                for (int j = 0; j < 2; ++j) {
                    this.a(\u2603, u.b, i, \u26033 + 1, \u26032, \u2603);
                    this.a(\u2603, u.e, i, \u26033, \u26032, \u2603);
                    this.a(\u2603, u.b, i, \u26033 - 1, \u26032, \u2603);
                    i = 13;
                }
                this.a(\u2603, \u2603, 7, 3, 7, 15, 3, 14, u.b, u.b, false);
                i = 10;
                for (int j = 0; j < 2; ++j) {
                    this.a(\u2603, \u2603, i, 0, 10, i, 6, 10, u.b, u.b, false);
                    this.a(\u2603, \u2603, i, 0, 12, i, 6, 12, u.b, u.b, false);
                    this.a(\u2603, u.e, i, 0, 10, \u2603);
                    this.a(\u2603, u.e, i, 0, 12, \u2603);
                    this.a(\u2603, u.e, i, 4, 10, \u2603);
                    this.a(\u2603, u.e, i, 4, 12, \u2603);
                    i = 12;
                }
                i = 8;
                for (int j = 0; j < 2; ++j) {
                    this.a(\u2603, \u2603, i, 0, 7, i, 2, 7, u.b, u.b, false);
                    this.a(\u2603, \u2603, i, 0, 14, i, 2, 14, u.b, u.b, false);
                    i = 14;
                }
                this.a(\u2603, \u2603, 8, 3, 8, 8, 3, 13, u.c, u.c, false);
                this.a(\u2603, \u2603, 14, 3, 8, 14, 3, 13, u.c, u.c, false);
                this.a(\u2603, \u2603, 11, 5, 13);
            }
            return true;
        }
    }
    
    public static class q extends r
    {
        public q() {
        }
        
        public q(final cq \u2603, final aqe \u2603) {
            super(\u2603, \u2603);
        }
        
        @Override
        public boolean a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            this.a(\u2603, \u2603, 2, -1, 2, 11, -1, 11, q.b, q.b, false);
            this.a(\u2603, \u2603, 0, -1, 0, 1, -1, 11, q.a, q.a, false);
            this.a(\u2603, \u2603, 12, -1, 0, 13, -1, 11, q.a, q.a, false);
            this.a(\u2603, \u2603, 2, -1, 0, 11, -1, 1, q.a, q.a, false);
            this.a(\u2603, \u2603, 2, -1, 12, 11, -1, 13, q.a, q.a, false);
            this.a(\u2603, \u2603, 0, 0, 0, 0, 0, 13, q.b, q.b, false);
            this.a(\u2603, \u2603, 13, 0, 0, 13, 0, 13, q.b, q.b, false);
            this.a(\u2603, \u2603, 1, 0, 0, 12, 0, 0, q.b, q.b, false);
            this.a(\u2603, \u2603, 1, 0, 13, 12, 0, 13, q.b, q.b, false);
            for (int i = 2; i <= 11; i += 3) {
                this.a(\u2603, q.e, 0, 0, i, \u2603);
                this.a(\u2603, q.e, 13, 0, i, \u2603);
                this.a(\u2603, q.e, i, 0, 0, \u2603);
            }
            this.a(\u2603, \u2603, 2, 0, 3, 4, 0, 9, q.b, q.b, false);
            this.a(\u2603, \u2603, 9, 0, 3, 11, 0, 9, q.b, q.b, false);
            this.a(\u2603, \u2603, 4, 0, 9, 9, 0, 11, q.b, q.b, false);
            this.a(\u2603, q.b, 5, 0, 8, \u2603);
            this.a(\u2603, q.b, 8, 0, 8, \u2603);
            this.a(\u2603, q.b, 10, 0, 10, \u2603);
            this.a(\u2603, q.b, 3, 0, 10, \u2603);
            this.a(\u2603, \u2603, 3, 0, 3, 3, 0, 7, q.c, q.c, false);
            this.a(\u2603, \u2603, 10, 0, 3, 10, 0, 7, q.c, q.c, false);
            this.a(\u2603, \u2603, 6, 0, 10, 7, 0, 10, q.c, q.c, false);
            int i = 3;
            for (int j = 0; j < 2; ++j) {
                for (int k = 2; k <= 8; k += 3) {
                    this.a(\u2603, \u2603, i, 0, k, i, 2, k, q.b, q.b, false);
                }
                i = 10;
            }
            this.a(\u2603, \u2603, 5, 0, 10, 5, 2, 10, q.b, q.b, false);
            this.a(\u2603, \u2603, 8, 0, 10, 8, 2, 10, q.b, q.b, false);
            this.a(\u2603, \u2603, 6, -1, 7, 7, -1, 8, q.c, q.c, false);
            this.a(\u2603, \u2603, 6, -1, 3, 7, -1, 4, false);
            this.a(\u2603, \u2603, 6, 1, 6);
            return true;
        }
    }
    
    static class v
    {
        int a;
        v[] b;
        boolean[] c;
        boolean d;
        boolean e;
        int f;
        
        public v(final int \u2603) {
            this.b = new v[6];
            this.c = new boolean[6];
            this.a = \u2603;
        }
        
        public void a(final cq \u2603, final v \u2603) {
            this.b[\u2603.a()] = \u2603;
            \u2603.b[\u2603.d().a()] = this;
        }
        
        public void a() {
            for (int i = 0; i < 6; ++i) {
                this.c[i] = (this.b[i] != null);
            }
        }
        
        public boolean a(final int \u2603) {
            if (this.e) {
                return true;
            }
            this.f = \u2603;
            for (int i = 0; i < 6; ++i) {
                if (this.b[i] != null && this.c[i] && this.b[i].f != \u2603 && this.b[i].a(\u2603)) {
                    return true;
                }
            }
            return false;
        }
        
        public boolean b() {
            return this.a >= 75;
        }
        
        public int c() {
            int n = 0;
            for (int i = 0; i < 6; ++i) {
                if (this.c[i]) {
                    ++n;
                }
            }
            return n;
        }
    }
    
    static class f implements i
    {
        private f() {
        }
        
        @Override
        public boolean a(final v \u2603) {
            return true;
        }
        
        @Override
        public r a(final cq \u2603, final v \u2603, final Random \u2603) {
            \u2603.d = true;
            return new s(\u2603, \u2603, \u2603);
        }
    }
    
    static class g implements i
    {
        private g() {
        }
        
        @Override
        public boolean a(final v \u2603) {
            return !\u2603.c[cq.e.a()] && !\u2603.c[cq.f.a()] && !\u2603.c[cq.c.a()] && !\u2603.c[cq.d.a()] && !\u2603.c[cq.b.a()];
        }
        
        @Override
        public r a(final cq \u2603, final v \u2603, final Random \u2603) {
            \u2603.d = true;
            return new t(\u2603, \u2603, \u2603);
        }
    }
    
    static class c implements i
    {
        private c() {
        }
        
        @Override
        public boolean a(final v \u2603) {
            return \u2603.c[cq.b.a()] && !\u2603.b[cq.b.a()].d;
        }
        
        @Override
        public r a(final cq \u2603, final v \u2603, final Random \u2603) {
            final v \u26032 = \u2603;
            \u26032.d = true;
            \u26032.b[cq.b.a()].d = true;
            return new m(\u2603, \u26032, \u2603);
        }
    }
    
    static class a implements i
    {
        private a() {
        }
        
        @Override
        public boolean a(final v \u2603) {
            return \u2603.c[cq.f.a()] && !\u2603.b[cq.f.a()].d;
        }
        
        @Override
        public r a(final cq \u2603, final v \u2603, final Random \u2603) {
            final v \u26032 = \u2603;
            \u26032.d = true;
            \u26032.b[cq.f.a()].d = true;
            return new k(\u2603, \u26032, \u2603);
        }
    }
    
    static class e implements i
    {
        private e() {
        }
        
        @Override
        public boolean a(final v \u2603) {
            return \u2603.c[cq.c.a()] && !\u2603.b[cq.c.a()].d;
        }
        
        @Override
        public r a(final cq \u2603, final v \u2603, final Random \u2603) {
            v \u26032 = \u2603;
            if (!\u2603.c[cq.c.a()] || \u2603.b[cq.c.a()].d) {
                \u26032 = \u2603.b[cq.d.a()];
            }
            \u26032.d = true;
            \u26032.b[cq.c.a()].d = true;
            return new o(\u2603, \u26032, \u2603);
        }
    }
    
    static class b implements i
    {
        private b() {
        }
        
        @Override
        public boolean a(final v \u2603) {
            if (\u2603.c[cq.f.a()] && !\u2603.b[cq.f.a()].d && \u2603.c[cq.b.a()] && !\u2603.b[cq.b.a()].d) {
                final v v = \u2603.b[cq.f.a()];
                return v.c[cq.b.a()] && !v.b[cq.b.a()].d;
            }
            return false;
        }
        
        @Override
        public r a(final cq \u2603, final v \u2603, final Random \u2603) {
            \u2603.d = true;
            \u2603.b[cq.f.a()].d = true;
            \u2603.b[cq.b.a()].d = true;
            \u2603.b[cq.f.a()].b[cq.b.a()].d = true;
            return new l(\u2603, \u2603, \u2603);
        }
    }
    
    static class d implements i
    {
        private d() {
        }
        
        @Override
        public boolean a(final v \u2603) {
            if (\u2603.c[cq.c.a()] && !\u2603.b[cq.c.a()].d && \u2603.c[cq.b.a()] && !\u2603.b[cq.b.a()].d) {
                final v v = \u2603.b[cq.c.a()];
                return v.c[cq.b.a()] && !v.b[cq.b.a()].d;
            }
            return false;
        }
        
        @Override
        public r a(final cq \u2603, final v \u2603, final Random \u2603) {
            \u2603.d = true;
            \u2603.b[cq.c.a()].d = true;
            \u2603.b[cq.b.a()].d = true;
            \u2603.b[cq.c.a()].b[cq.b.a()].d = true;
            return new n(\u2603, \u2603, \u2603);
        }
    }
    
    interface i
    {
        boolean a(final v p0);
        
        r a(final cq p0, final v p1, final Random p2);
    }
}
