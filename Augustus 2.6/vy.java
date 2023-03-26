import org.apache.logging.log4j.LogManager;
import java.util.UUID;
import java.util.Collection;
import java.util.Iterator;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class vy
{
    private static final Logger f;
    public static final qb a;
    public static final qb b;
    public static final qb c;
    public static final qb d;
    public static final qb e;
    
    public static du a(final qf \u2603) {
        final du du = new du();
        for (final qc \u26032 : \u2603.a()) {
            du.a(a(\u26032));
        }
        return du;
    }
    
    private static dn a(final qc \u2603) {
        final dn dn = new dn();
        final qb a = \u2603.a();
        dn.a("Name", a.a());
        dn.a("Base", \u2603.b());
        final Collection<qd> c = \u2603.c();
        if (c != null && !c.isEmpty()) {
            final du \u26032 = new du();
            for (final qd \u26033 : c) {
                if (\u26033.e()) {
                    \u26032.a(a(\u26033));
                }
            }
            dn.a("Modifiers", \u26032);
        }
        return dn;
    }
    
    private static dn a(final qd \u2603) {
        final dn dn = new dn();
        dn.a("Name", \u2603.b());
        dn.a("Amount", \u2603.d());
        dn.a("Operation", \u2603.c());
        dn.a("UUIDMost", \u2603.a().getMostSignificantBits());
        dn.a("UUIDLeast", \u2603.a().getLeastSignificantBits());
        return dn;
    }
    
    public static void a(final qf \u2603, final du \u2603) {
        for (int i = 0; i < \u2603.c(); ++i) {
            final dn b = \u2603.b(i);
            final qc a = \u2603.a(b.j("Name"));
            if (a != null) {
                a(a, b);
            }
            else {
                vy.f.warn("Ignoring unknown attribute '" + b.j("Name") + "'");
            }
        }
    }
    
    private static void a(final qc \u2603, final dn \u2603) {
        \u2603.a(\u2603.i("Base"));
        if (\u2603.b("Modifiers", 9)) {
            final du c = \u2603.c("Modifiers", 10);
            for (int i = 0; i < c.c(); ++i) {
                final qd a = a(c.b(i));
                if (a != null) {
                    final qd a2 = \u2603.a(a.a());
                    if (a2 != null) {
                        \u2603.c(a2);
                    }
                    \u2603.b(a);
                }
            }
        }
    }
    
    public static qd a(final dn \u2603) {
        final UUID \u26032 = new UUID(\u2603.g("UUIDMost"), \u2603.g("UUIDLeast"));
        try {
            return new qd(\u26032, \u2603.j("Name"), \u2603.i("Amount"), \u2603.f("Operation"));
        }
        catch (Exception ex) {
            vy.f.warn("Unable to create attribute: " + ex.getMessage());
            return null;
        }
    }
    
    static {
        f = LogManager.getLogger();
        a = new qj(null, "generic.maxHealth", 20.0, 0.0, 1024.0).a("Max Health").a(true);
        b = new qj(null, "generic.followRange", 32.0, 0.0, 2048.0).a("Follow Range");
        c = new qj(null, "generic.knockbackResistance", 0.0, 0.0, 1.0).a("Knockback Resistance");
        d = new qj(null, "generic.movementSpeed", 0.699999988079071, 0.0, 1024.0).a("Movement Speed").a(true);
        e = new qj(null, "generic.attackDamage", 2.0, 0.0, 2048.0);
    }
}
