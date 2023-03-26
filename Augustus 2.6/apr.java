import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class apr extends aot
{
    private afh a;
    
    public apr(final afh \u2603) {
        this.a = \u2603;
    }
    
    @Override
    public boolean b(final adm \u2603, final Random \u2603, final cj \u2603) {
        if (\u2603.p(\u2603.a()).c() != afi.b) {
            return false;
        }
        if (\u2603.p(\u2603.b()).c() != afi.b) {
            return false;
        }
        if (\u2603.p(\u2603).c().t() != arm.a && \u2603.p(\u2603).c() != afi.b) {
            return false;
        }
        int n = 0;
        if (\u2603.p(\u2603.e()).c() == afi.b) {
            ++n;
        }
        if (\u2603.p(\u2603.f()).c() == afi.b) {
            ++n;
        }
        if (\u2603.p(\u2603.c()).c() == afi.b) {
            ++n;
        }
        if (\u2603.p(\u2603.d()).c() == afi.b) {
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
        if (n == 3 && n2 == 1) {
            \u2603.a(\u2603, this.a.Q(), 2);
            \u2603.a(this.a, \u2603, \u2603);
        }
        return true;
    }
}
