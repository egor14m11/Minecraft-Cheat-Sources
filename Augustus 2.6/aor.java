import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.Iterator;
import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class aor extends aot
{
    private static final amh a;
    private final alz b;
    private final alz c;
    private final alz d;
    
    public aor() {
        this.b = afi.U.Q().a(akb.N, akb.a.b).a(ahh.a, ahh.a.b);
        this.c = afi.A.Q();
        this.d = afi.i.Q();
    }
    
    @Override
    public boolean b(final adm \u2603, final Random \u2603, cj \u2603) {
        while (\u2603.d(\u2603) && \u2603.o() > 2) {
            \u2603 = \u2603.b();
        }
        if (!aor.a.a(\u2603.p(\u2603))) {
            return false;
        }
        for (int i = -2; i <= 2; ++i) {
            for (int j = -2; j <= 2; ++j) {
                if (\u2603.d(\u2603.a(i, -1, j)) && \u2603.d(\u2603.a(i, -2, j))) {
                    return false;
                }
            }
        }
        for (int i = -1; i <= 0; ++i) {
            for (int j = -2; j <= 2; ++j) {
                for (int k = -2; k <= 2; ++k) {
                    \u2603.a(\u2603.a(j, i, k), this.c, 2);
                }
            }
        }
        \u2603.a(\u2603, this.d, 2);
        for (final cq \u26032 : cq.c.a) {
            \u2603.a(\u2603.a(\u26032), this.d, 2);
        }
        for (int i = -2; i <= 2; ++i) {
            for (int j = -2; j <= 2; ++j) {
                if (i == -2 || i == 2 || j == -2 || j == 2) {
                    \u2603.a(\u2603.a(i, 1, j), this.c, 2);
                }
            }
        }
        \u2603.a(\u2603.a(2, 1, 0), this.b, 2);
        \u2603.a(\u2603.a(-2, 1, 0), this.b, 2);
        \u2603.a(\u2603.a(0, 1, 2), this.b, 2);
        \u2603.a(\u2603.a(0, 1, -2), this.b, 2);
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                if (i == 0 && j == 0) {
                    \u2603.a(\u2603.a(i, 4, j), this.c, 2);
                }
                else {
                    \u2603.a(\u2603.a(i, 4, j), this.b, 2);
                }
            }
        }
        for (int i = 1; i <= 3; ++i) {
            \u2603.a(\u2603.a(-1, i, -1), this.c, 2);
            \u2603.a(\u2603.a(-1, i, 1), this.c, 2);
            \u2603.a(\u2603.a(1, i, -1), this.c, 2);
            \u2603.a(\u2603.a(1, i, 1), this.c, 2);
        }
        return true;
    }
    
    static {
        a = amh.a(afi.m).a(ajh.a, (Predicate<? extends ajh.a>)Predicates.equalTo((V)ajh.a.a));
    }
}
