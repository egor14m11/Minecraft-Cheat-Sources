import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class aoy extends aot
{
    private final afh a;
    private final boolean b;
    
    public aoy(final afh \u2603, final boolean \u2603) {
        this.a = \u2603;
        this.b = \u2603;
    }
    
    @Override
    public boolean b(final adm \u2603, final Random \u2603, final cj \u2603) {
        if (\u2603.p(\u2603.a()).c() != afi.aV) {
            return false;
        }
        if (\u2603.p(\u2603).c().t() != arm.a && \u2603.p(\u2603).c() != afi.aV) {
            return false;
        }
        int n = 0;
        if (\u2603.p(\u2603.e()).c() == afi.aV) {
            ++n;
        }
        if (\u2603.p(\u2603.f()).c() == afi.aV) {
            ++n;
        }
        if (\u2603.p(\u2603.c()).c() == afi.aV) {
            ++n;
        }
        if (\u2603.p(\u2603.d()).c() == afi.aV) {
            ++n;
        }
        if (\u2603.p(\u2603.b()).c() == afi.aV) {
            ++n;
        }
        int n2 = 0;
        if (\u2603.d(\u2603.e())) {
            ++n2;
        }
        if (\u2603.d(\u2603.f())) {
            ++n2;
        }
        if (\u2603.d(\u2603.c())) {
            ++n2;
        }
        if (\u2603.d(\u2603.d())) {
            ++n2;
        }
        if (\u2603.d(\u2603.b())) {
            ++n2;
        }
        if ((!this.b && n == 4 && n2 == 1) || n == 5) {
            \u2603.a(\u2603, this.a.Q(), 2);
            \u2603.a(this.a, \u2603, \u2603);
        }
        return true;
    }
}
