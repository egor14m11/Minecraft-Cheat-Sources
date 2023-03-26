import org.apache.logging.log4j.LogManager;
import java.util.Iterator;
import java.util.Collection;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class aup extends ate
{
    private static final Logger b;
    private auo c;
    private dn d;
    
    public aup() {
        this("scoreboard");
    }
    
    public aup(final String \u2603) {
        super(\u2603);
    }
    
    public void a(final auo \u2603) {
        this.c = \u2603;
        if (this.d != null) {
            this.a(this.d);
        }
    }
    
    @Override
    public void a(final dn \u2603) {
        if (this.c == null) {
            this.d = \u2603;
            return;
        }
        this.b(\u2603.c("Objectives", 10));
        this.c(\u2603.c("PlayerScores", 10));
        if (\u2603.b("DisplaySlots", 10)) {
            this.c(\u2603.m("DisplaySlots"));
        }
        if (\u2603.b("Teams", 9)) {
            this.a(\u2603.c("Teams", 10));
        }
    }
    
    protected void a(final du \u2603) {
        for (int i = 0; i < \u2603.c(); ++i) {
            final dn b = \u2603.b(i);
            String \u26032 = b.j("Name");
            if (\u26032.length() > 16) {
                \u26032 = \u26032.substring(0, 16);
            }
            final aul e = this.c.e(\u26032);
            String \u26033 = b.j("DisplayName");
            if (\u26033.length() > 32) {
                \u26033 = \u26033.substring(0, 32);
            }
            e.a(\u26033);
            if (b.b("TeamColor", 8)) {
                e.a(a.b(b.j("TeamColor")));
            }
            e.b(b.j("Prefix"));
            e.c(b.j("Suffix"));
            if (b.b("AllowFriendlyFire", 99)) {
                e.a(b.n("AllowFriendlyFire"));
            }
            if (b.b("SeeFriendlyInvisibles", 99)) {
                e.b(b.n("SeeFriendlyInvisibles"));
            }
            if (b.b("NameTagVisibility", 8)) {
                final auq.a a = auq.a.a(b.j("NameTagVisibility"));
                if (a != null) {
                    e.a(a);
                }
            }
            if (b.b("DeathMessageVisibility", 8)) {
                final auq.a a = auq.a.a(b.j("DeathMessageVisibility"));
                if (a != null) {
                    e.b(a);
                }
            }
            this.a(e, b.c("Players", 8));
        }
    }
    
    protected void a(final aul \u2603, final du \u2603) {
        for (int i = 0; i < \u2603.c(); ++i) {
            this.c.a(\u2603.f(i), \u2603.b());
        }
    }
    
    protected void c(final dn \u2603) {
        for (int i = 0; i < 19; ++i) {
            if (\u2603.b("slot_" + i, 8)) {
                final String j = \u2603.j("slot_" + i);
                final auk b = this.c.b(j);
                this.c.a(i, b);
            }
        }
    }
    
    protected void b(final du \u2603) {
        for (int i = 0; i < \u2603.c(); ++i) {
            final dn b = \u2603.b(i);
            final auu \u26032 = auu.a.get(b.j("CriteriaName"));
            if (\u26032 != null) {
                String \u26033 = b.j("Name");
                if (\u26033.length() > 16) {
                    \u26033 = \u26033.substring(0, 16);
                }
                final auk a = this.c.a(\u26033, \u26032);
                a.a(b.j("DisplayName"));
                a.a(auu.a.a(b.j("RenderType")));
            }
        }
    }
    
    protected void c(final du \u2603) {
        for (int i = 0; i < \u2603.c(); ++i) {
            final dn b = \u2603.b(i);
            final auk b2 = this.c.b(b.j("Objective"));
            String \u26032 = b.j("Name");
            if (\u26032.length() > 40) {
                \u26032 = \u26032.substring(0, 40);
            }
            final aum c = this.c.c(\u26032, b2);
            c.c(b.f("Score"));
            if (b.c("Locked")) {
                c.a(b.n("Locked"));
            }
        }
    }
    
    @Override
    public void b(final dn \u2603) {
        if (this.c == null) {
            aup.b.warn("Tried to save scoreboard without having a scoreboard...");
            return;
        }
        \u2603.a("Objectives", this.b());
        \u2603.a("PlayerScores", this.e());
        \u2603.a("Teams", this.a());
        this.d(\u2603);
    }
    
    protected du a() {
        final du du = new du();
        final Collection<aul> g = this.c.g();
        for (final aul aul : g) {
            final dn \u2603 = new dn();
            \u2603.a("Name", aul.b());
            \u2603.a("DisplayName", aul.c());
            if (aul.l().b() >= 0) {
                \u2603.a("TeamColor", aul.l().e());
            }
            \u2603.a("Prefix", aul.e());
            \u2603.a("Suffix", aul.f());
            \u2603.a("AllowFriendlyFire", aul.g());
            \u2603.a("SeeFriendlyInvisibles", aul.h());
            \u2603.a("NameTagVisibility", aul.i().e);
            \u2603.a("DeathMessageVisibility", aul.j().e);
            final du \u26032 = new du();
            for (final String \u26033 : aul.d()) {
                \u26032.a(new ea(\u26033));
            }
            \u2603.a("Players", \u26032);
            du.a(\u2603);
        }
        return du;
    }
    
    protected void d(final dn \u2603) {
        final dn \u26032 = new dn();
        boolean b = false;
        for (int i = 0; i < 19; ++i) {
            final auk a = this.c.a(i);
            if (a != null) {
                \u26032.a("slot_" + i, a.b());
                b = true;
            }
        }
        if (b) {
            \u2603.a("DisplaySlots", \u26032);
        }
    }
    
    protected du b() {
        final du du = new du();
        final Collection<auk> c = this.c.c();
        for (final auk auk : c) {
            if (auk.c() == null) {
                continue;
            }
            final dn \u2603 = new dn();
            \u2603.a("Name", auk.b());
            \u2603.a("CriteriaName", auk.c().a());
            \u2603.a("DisplayName", auk.d());
            \u2603.a("RenderType", auk.e().a());
            du.a(\u2603);
        }
        return du;
    }
    
    protected du e() {
        final du du = new du();
        final Collection<aum> e = this.c.e();
        for (final aum aum : e) {
            if (aum.d() == null) {
                continue;
            }
            final dn \u2603 = new dn();
            \u2603.a("Name", aum.e());
            \u2603.a("Objective", aum.d().b());
            \u2603.a("Score", aum.c());
            \u2603.a("Locked", aum.g());
            du.a(\u2603);
        }
        return du;
    }
    
    static {
        b = LogManager.getLogger();
    }
}
