// 
// Decompiled by Procyon v0.5.36
// 

public class abj
{
    void a(final abt \u2603) {
        for (final zd zd : zd.values()) {
            \u2603.a(new zx(zy.cE, 1, zd.b()), "###", "###", " | ", '#', new zx(afi.L, 1, zd.a()), '|', zy.y);
        }
        \u2603.a(new b());
        \u2603.a(new a());
    }
    
    static class b implements abs
    {
        private b() {
        }
        
        @Override
        public boolean a(final xp \u2603, final adm \u2603) {
            zx \u26032 = null;
            zx \u26033 = null;
            for (int i = 0; i < \u2603.o_(); ++i) {
                final zx a = \u2603.a(i);
                if (a != null) {
                    if (a.b() != zy.cE) {
                        return false;
                    }
                    if (\u26032 != null && \u26033 != null) {
                        return false;
                    }
                    final int b = aku.b(a);
                    final boolean b2 = aku.c(a) > 0;
                    if (\u26032 != null) {
                        if (b2) {
                            return false;
                        }
                        if (b != aku.b(\u26032)) {
                            return false;
                        }
                        \u26033 = a;
                    }
                    else if (\u26033 != null) {
                        if (!b2) {
                            return false;
                        }
                        if (b != aku.b(\u26033)) {
                            return false;
                        }
                        \u26032 = a;
                    }
                    else if (b2) {
                        \u26032 = a;
                    }
                    else {
                        \u26033 = a;
                    }
                }
            }
            return \u26032 != null && \u26033 != null;
        }
        
        @Override
        public zx a(final xp \u2603) {
            for (int i = 0; i < \u2603.o_(); ++i) {
                final zx a = \u2603.a(i);
                if (a != null) {
                    if (aku.c(a) > 0) {
                        final zx k = a.k();
                        k.b = 1;
                        return k;
                    }
                }
            }
            return null;
        }
        
        @Override
        public int a() {
            return 2;
        }
        
        @Override
        public zx b() {
            return null;
        }
        
        @Override
        public zx[] b(final xp \u2603) {
            final zx[] array = new zx[\u2603.o_()];
            for (int i = 0; i < array.length; ++i) {
                final zx a = \u2603.a(i);
                if (a != null) {
                    if (a.b().r()) {
                        array[i] = new zx(a.b().q());
                    }
                    else if (a.n() && aku.c(a) > 0) {
                        array[i] = a.k();
                        array[i].b = 1;
                    }
                }
            }
            return array;
        }
    }
    
    static class a implements abs
    {
        private a() {
        }
        
        @Override
        public boolean a(final xp \u2603, final adm \u2603) {
            boolean b = false;
            for (int i = 0; i < \u2603.o_(); ++i) {
                final zx a = \u2603.a(i);
                if (a != null) {
                    if (a.b() == zy.cE) {
                        if (b) {
                            return false;
                        }
                        if (aku.c(a) >= 6) {
                            return false;
                        }
                        b = true;
                    }
                }
            }
            return b && this.c(\u2603) != null;
        }
        
        @Override
        public zx a(final xp \u2603) {
            zx k = null;
            for (int i = 0; i < \u2603.o_(); ++i) {
                final zx a = \u2603.a(i);
                if (a != null) {
                    if (a.b() == zy.cE) {
                        k = a.k();
                        k.b = 1;
                        break;
                    }
                }
            }
            final aku.a c = this.c(\u2603);
            if (c != null) {
                int j = 0;
                for (int l = 0; l < \u2603.o_(); ++l) {
                    final zx a2 = \u2603.a(l);
                    if (a2 != null && a2.b() == zy.aW) {
                        j = a2.i();
                        break;
                    }
                }
                final dn a3 = k.a("BlockEntityTag", true);
                du c2 = null;
                if (a3.b("Patterns", 9)) {
                    c2 = a3.c("Patterns", 10);
                }
                else {
                    c2 = new du();
                    a3.a("Patterns", c2);
                }
                final dn \u26032 = new dn();
                \u26032.a("Pattern", c.b());
                \u26032.a("Color", j);
                c2.a(\u26032);
            }
            return k;
        }
        
        @Override
        public int a() {
            return 10;
        }
        
        @Override
        public zx b() {
            return null;
        }
        
        @Override
        public zx[] b(final xp \u2603) {
            final zx[] array = new zx[\u2603.o_()];
            for (int i = 0; i < array.length; ++i) {
                final zx a = \u2603.a(i);
                if (a != null && a.b().r()) {
                    array[i] = new zx(a.b().q());
                }
            }
            return array;
        }
        
        private aku.a c(final xp \u2603) {
            for (final aku.a a : aku.a.values()) {
                if (a.d()) {
                    boolean b = true;
                    if (a.e()) {
                        boolean b2 = false;
                        boolean b3 = false;
                        for (int \u26032 = 0; \u26032 < \u2603.o_() && b; ++\u26032) {
                            final zx a2 = \u2603.a(\u26032);
                            if (a2 != null) {
                                if (a2.b() != zy.cE) {
                                    if (a2.b() == zy.aW) {
                                        if (b3) {
                                            b = false;
                                            break;
                                        }
                                        b3 = true;
                                    }
                                    else {
                                        if (b2 || !a2.a(a.f())) {
                                            b = false;
                                            break;
                                        }
                                        b2 = true;
                                    }
                                }
                            }
                        }
                        if (!b2) {
                            b = false;
                        }
                    }
                    else if (\u2603.o_() == a.c().length * a.c()[0].length()) {
                        int j = -1;
                        for (int \u26033 = 0; \u26033 < \u2603.o_() && b; ++\u26033) {
                            final int \u26032 = \u26033 / 3;
                            final int n = \u26033 % 3;
                            final zx a3 = \u2603.a(\u26033);
                            if (a3 == null || a3.b() == zy.cE) {
                                if (a.c()[\u26032].charAt(n) != ' ') {
                                    b = false;
                                    break;
                                }
                            }
                            else {
                                if (a3.b() != zy.aW) {
                                    b = false;
                                    break;
                                }
                                if (j != -1 && j != a3.i()) {
                                    b = false;
                                    break;
                                }
                                if (a.c()[\u26032].charAt(n) == ' ') {
                                    b = false;
                                    break;
                                }
                                j = a3.i();
                            }
                        }
                    }
                    else {
                        b = false;
                    }
                    if (b) {
                        return a;
                    }
                }
            }
            return null;
        }
    }
}
