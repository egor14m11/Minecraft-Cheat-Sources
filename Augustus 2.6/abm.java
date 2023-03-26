import java.util.List;
import com.google.common.collect.Lists;

// 
// Decompiled by Procyon v0.5.36
// 

public class abm implements abs
{
    private zx a;
    
    @Override
    public boolean a(final xp \u2603, final adm \u2603) {
        this.a = null;
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        for (int i = 0; i < \u2603.o_(); ++i) {
            final zx a = \u2603.a(i);
            if (a != null) {
                if (a.b() == zy.H) {
                    ++n2;
                }
                else if (a.b() == zy.cc) {
                    ++n4;
                }
                else if (a.b() == zy.aW) {
                    ++n3;
                }
                else if (a.b() == zy.aK) {
                    ++n;
                }
                else if (a.b() == zy.aT) {
                    ++n5;
                }
                else if (a.b() == zy.i) {
                    ++n5;
                }
                else if (a.b() == zy.bL) {
                    ++n6;
                }
                else if (a.b() == zy.G) {
                    ++n6;
                }
                else if (a.b() == zy.bx) {
                    ++n6;
                }
                else {
                    if (a.b() != zy.bX) {
                        return false;
                    }
                    ++n6;
                }
            }
        }
        n5 += n3 + n6;
        if (n2 > 3 || n > 1) {
            return false;
        }
        if (n2 >= 1 && n == 1 && n5 == 0) {
            this.a = new zx(zy.cb);
            if (n4 > 0) {
                final dn dn = new dn();
                final dn dn2 = new dn();
                final du \u26032 = new du();
                for (int j = 0; j < \u2603.o_(); ++j) {
                    final zx a2 = \u2603.a(j);
                    if (a2 != null) {
                        if (a2.b() == zy.cc) {
                            if (a2.n() && a2.o().b("Explosion", 10)) {
                                \u26032.a(a2.o().m("Explosion"));
                            }
                        }
                    }
                }
                dn2.a("Explosions", \u26032);
                dn2.a("Flight", (byte)n2);
                dn.a("Fireworks", dn2);
                this.a.d(dn);
            }
            return true;
        }
        if (n2 == 1 && n == 0 && n4 == 0 && n3 > 0 && n6 <= 1) {
            this.a = new zx(zy.cc);
            final dn dn = new dn();
            final dn dn2 = new dn();
            byte \u26033 = 0;
            final List<Integer> arrayList = (List<Integer>)Lists.newArrayList();
            for (int k = 0; k < \u2603.o_(); ++k) {
                final zx a3 = \u2603.a(k);
                if (a3 != null) {
                    if (a3.b() == zy.aW) {
                        arrayList.add(ze.a[a3.i() & 0xF]);
                    }
                    else if (a3.b() == zy.aT) {
                        dn2.a("Flicker", true);
                    }
                    else if (a3.b() == zy.i) {
                        dn2.a("Trail", true);
                    }
                    else if (a3.b() == zy.bL) {
                        \u26033 = 1;
                    }
                    else if (a3.b() == zy.G) {
                        \u26033 = 4;
                    }
                    else if (a3.b() == zy.bx) {
                        \u26033 = 2;
                    }
                    else if (a3.b() == zy.bX) {
                        \u26033 = 3;
                    }
                }
            }
            final int[] \u26034 = new int[arrayList.size()];
            for (int l = 0; l < \u26034.length; ++l) {
                \u26034[l] = arrayList.get(l);
            }
            dn2.a("Colors", \u26034);
            dn2.a("Type", \u26033);
            dn.a("Explosion", dn2);
            this.a.d(dn);
            return true;
        }
        if (n2 != 0 || n != 0 || n4 != 1 || n3 <= 0 || n3 != n5) {
            return false;
        }
        final List<Integer> arrayList2 = (List<Integer>)Lists.newArrayList();
        for (int \u26035 = 0; \u26035 < \u2603.o_(); ++\u26035) {
            final zx a4 = \u2603.a(\u26035);
            if (a4 != null) {
                if (a4.b() == zy.aW) {
                    arrayList2.add(ze.a[a4.i() & 0xF]);
                }
                else if (a4.b() == zy.cc) {
                    this.a = a4.k();
                    this.a.b = 1;
                }
            }
        }
        final int[] \u26036 = new int[arrayList2.size()];
        for (int n7 = 0; n7 < \u26036.length; ++n7) {
            \u26036[n7] = arrayList2.get(n7);
        }
        if (this.a == null || !this.a.n()) {
            return false;
        }
        final dn m = this.a.o().m("Explosion");
        if (m == null) {
            return false;
        }
        m.a("FadeColors", \u26036);
        return true;
    }
    
    @Override
    public zx a(final xp \u2603) {
        return this.a.k();
    }
    
    @Override
    public int a() {
        return 10;
    }
    
    @Override
    public zx b() {
        return this.a;
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
}
