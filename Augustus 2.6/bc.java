import java.util.Map;
import java.util.Set;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Arrays;
import net.minecraft.server.MinecraftServer;
import java.util.Iterator;
import java.util.List;
import com.google.common.collect.Lists;

// 
// Decompiled by Procyon v0.5.36
// 

public class bc extends i
{
    @Override
    public String c() {
        return "scoreboard";
    }
    
    @Override
    public int a() {
        return 2;
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.scoreboard.usage";
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        if (this.b(\u2603, \u2603)) {
            return;
        }
        if (\u2603.length < 1) {
            throw new cf("commands.scoreboard.usage", new Object[0]);
        }
        if (\u2603[0].equalsIgnoreCase("objectives")) {
            if (\u2603.length == 1) {
                throw new cf("commands.scoreboard.objectives.usage", new Object[0]);
            }
            if (\u2603[1].equalsIgnoreCase("list")) {
                this.d(\u2603);
            }
            else if (\u2603[1].equalsIgnoreCase("add")) {
                if (\u2603.length < 4) {
                    throw new cf("commands.scoreboard.objectives.add.usage", new Object[0]);
                }
                this.b(\u2603, \u2603, 2);
            }
            else if (\u2603[1].equalsIgnoreCase("remove")) {
                if (\u2603.length != 3) {
                    throw new cf("commands.scoreboard.objectives.remove.usage", new Object[0]);
                }
                this.h(\u2603, \u2603[2]);
            }
            else {
                if (!\u2603[1].equalsIgnoreCase("setdisplay")) {
                    throw new cf("commands.scoreboard.objectives.usage", new Object[0]);
                }
                if (\u2603.length != 3 && \u2603.length != 4) {
                    throw new cf("commands.scoreboard.objectives.setdisplay.usage", new Object[0]);
                }
                this.j(\u2603, \u2603, 2);
            }
        }
        else if (\u2603[0].equalsIgnoreCase("players")) {
            if (\u2603.length == 1) {
                throw new cf("commands.scoreboard.players.usage", new Object[0]);
            }
            if (\u2603[1].equalsIgnoreCase("list")) {
                if (\u2603.length > 3) {
                    throw new cf("commands.scoreboard.players.list.usage", new Object[0]);
                }
                this.k(\u2603, \u2603, 2);
            }
            else if (\u2603[1].equalsIgnoreCase("add")) {
                if (\u2603.length < 5) {
                    throw new cf("commands.scoreboard.players.add.usage", new Object[0]);
                }
                this.l(\u2603, \u2603, 2);
            }
            else if (\u2603[1].equalsIgnoreCase("remove")) {
                if (\u2603.length < 5) {
                    throw new cf("commands.scoreboard.players.remove.usage", new Object[0]);
                }
                this.l(\u2603, \u2603, 2);
            }
            else if (\u2603[1].equalsIgnoreCase("set")) {
                if (\u2603.length < 5) {
                    throw new cf("commands.scoreboard.players.set.usage", new Object[0]);
                }
                this.l(\u2603, \u2603, 2);
            }
            else if (\u2603[1].equalsIgnoreCase("reset")) {
                if (\u2603.length != 3 && \u2603.length != 4) {
                    throw new cf("commands.scoreboard.players.reset.usage", new Object[0]);
                }
                this.m(\u2603, \u2603, 2);
            }
            else if (\u2603[1].equalsIgnoreCase("enable")) {
                if (\u2603.length != 4) {
                    throw new cf("commands.scoreboard.players.enable.usage", new Object[0]);
                }
                this.n(\u2603, \u2603, 2);
            }
            else if (\u2603[1].equalsIgnoreCase("test")) {
                if (\u2603.length != 5 && \u2603.length != 6) {
                    throw new cf("commands.scoreboard.players.test.usage", new Object[0]);
                }
                this.o(\u2603, \u2603, 2);
            }
            else {
                if (!\u2603[1].equalsIgnoreCase("operation")) {
                    throw new cf("commands.scoreboard.players.usage", new Object[0]);
                }
                if (\u2603.length != 7) {
                    throw new cf("commands.scoreboard.players.operation.usage", new Object[0]);
                }
                this.p(\u2603, \u2603, 2);
            }
        }
        else {
            if (!\u2603[0].equalsIgnoreCase("teams")) {
                throw new cf("commands.scoreboard.usage", new Object[0]);
            }
            if (\u2603.length == 1) {
                throw new cf("commands.scoreboard.teams.usage", new Object[0]);
            }
            if (\u2603[1].equalsIgnoreCase("list")) {
                if (\u2603.length > 3) {
                    throw new cf("commands.scoreboard.teams.list.usage", new Object[0]);
                }
                this.f(\u2603, \u2603, 2);
            }
            else if (\u2603[1].equalsIgnoreCase("add")) {
                if (\u2603.length < 3) {
                    throw new cf("commands.scoreboard.teams.add.usage", new Object[0]);
                }
                this.c(\u2603, \u2603, 2);
            }
            else if (\u2603[1].equalsIgnoreCase("remove")) {
                if (\u2603.length != 3) {
                    throw new cf("commands.scoreboard.teams.remove.usage", new Object[0]);
                }
                this.e(\u2603, \u2603, 2);
            }
            else if (\u2603[1].equalsIgnoreCase("empty")) {
                if (\u2603.length != 3) {
                    throw new cf("commands.scoreboard.teams.empty.usage", new Object[0]);
                }
                this.i(\u2603, \u2603, 2);
            }
            else if (\u2603[1].equalsIgnoreCase("join")) {
                if (\u2603.length < 4 && (\u2603.length != 3 || !(\u2603 instanceof wn))) {
                    throw new cf("commands.scoreboard.teams.join.usage", new Object[0]);
                }
                this.g(\u2603, \u2603, 2);
            }
            else if (\u2603[1].equalsIgnoreCase("leave")) {
                if (\u2603.length < 3 && !(\u2603 instanceof wn)) {
                    throw new cf("commands.scoreboard.teams.leave.usage", new Object[0]);
                }
                this.h(\u2603, \u2603, 2);
            }
            else {
                if (!\u2603[1].equalsIgnoreCase("option")) {
                    throw new cf("commands.scoreboard.teams.usage", new Object[0]);
                }
                if (\u2603.length != 4 && \u2603.length != 5) {
                    throw new cf("commands.scoreboard.teams.option.usage", new Object[0]);
                }
                this.d(\u2603, \u2603, 2);
            }
        }
    }
    
    private boolean b(final m \u2603, final String[] \u2603) throws bz {
        int n = -1;
        for (int i = 0; i < \u2603.length; ++i) {
            if (this.b(\u2603, i)) {
                if ("*".equals(\u2603[i])) {
                    if (n >= 0) {
                        throw new bz("commands.scoreboard.noMultiWildcard", new Object[0]);
                    }
                    n = i;
                }
            }
        }
        if (n < 0) {
            return false;
        }
        final List<String> arrayList = (List<String>)Lists.newArrayList((Iterable<?>)this.d().d());
        final String s = \u2603[n];
        final List<String> arrayList2 = (List<String>)Lists.newArrayList();
        for (final String s2 : arrayList) {
            \u2603[n] = s2;
            try {
                this.a(\u2603, \u2603);
                arrayList2.add(s2);
            }
            catch (bz bz) {
                final fb fb = new fb(bz.getMessage(), bz.a());
                fb.b().a(a.m);
                \u2603.a(fb);
            }
        }
        \u2603[n] = s;
        \u2603.a(n.a.c, arrayList2.size());
        if (arrayList2.size() == 0) {
            throw new cf("commands.scoreboard.allMatchesFailed", new Object[0]);
        }
        return true;
    }
    
    protected auo d() {
        return MinecraftServer.N().a(0).Z();
    }
    
    protected auk a(final String \u2603, final boolean \u2603) throws bz {
        final auo d = this.d();
        final auk b = d.b(\u2603);
        if (b == null) {
            throw new bz("commands.scoreboard.objectiveNotFound", new Object[] { \u2603 });
        }
        if (\u2603 && b.c().b()) {
            throw new bz("commands.scoreboard.objectiveReadOnly", new Object[] { \u2603 });
        }
        return b;
    }
    
    protected aul e(final String \u2603) throws bz {
        final auo d = this.d();
        final aul d2 = d.d(\u2603);
        if (d2 == null) {
            throw new bz("commands.scoreboard.teamNotFound", new Object[] { \u2603 });
        }
        return d2;
    }
    
    protected void b(m \u2603, final String[] \u2603, final int \u2603) throws bz {
        final String s = \u2603[\u2603++];
        final String s2 = \u2603[\u2603++];
        final auo d = this.d();
        final auu \u26032 = auu.a.get(s2);
        if (\u26032 == null) {
            throw new cf("commands.scoreboard.objectives.add.wrongType", new Object[] { s2 });
        }
        if (d.b(s) != null) {
            throw new bz("commands.scoreboard.objectives.add.alreadyExists", new Object[] { s });
        }
        if (s.length() > 16) {
            throw new cc("commands.scoreboard.objectives.add.tooLong", new Object[] { s, 16 });
        }
        if (s.length() == 0) {
            throw new cf("commands.scoreboard.objectives.add.usage", new Object[0]);
        }
        if (\u2603.length > \u2603) {
            final String c = i.a(\u2603, \u2603, \u2603).c();
            if (c.length() > 32) {
                throw new cc("commands.scoreboard.objectives.add.displayTooLong", new Object[] { c, 32 });
            }
            if (c.length() > 0) {
                d.a(s, \u26032).a(c);
            }
            else {
                d.a(s, \u26032);
            }
        }
        else {
            d.a(s, \u26032);
        }
        i.a(\u2603, this, "commands.scoreboard.objectives.add.success", s);
    }
    
    protected void c(m \u2603, final String[] \u2603, final int \u2603) throws bz {
        final String s = \u2603[\u2603++];
        final auo d = this.d();
        if (d.d(s) != null) {
            throw new bz("commands.scoreboard.teams.add.alreadyExists", new Object[] { s });
        }
        if (s.length() > 16) {
            throw new cc("commands.scoreboard.teams.add.tooLong", new Object[] { s, 16 });
        }
        if (s.length() == 0) {
            throw new cf("commands.scoreboard.teams.add.usage", new Object[0]);
        }
        if (\u2603.length > \u2603) {
            final String c = i.a(\u2603, \u2603, \u2603).c();
            if (c.length() > 32) {
                throw new cc("commands.scoreboard.teams.add.displayTooLong", new Object[] { c, 32 });
            }
            if (c.length() > 0) {
                d.e(s).a(c);
            }
            else {
                d.e(s);
            }
        }
        else {
            d.e(s);
        }
        i.a(\u2603, this, "commands.scoreboard.teams.add.success", s);
    }
    
    protected void d(final m \u2603, final String[] \u2603, int \u2603) throws bz {
        final aul e = this.e(\u2603[\u2603++]);
        if (e == null) {
            return;
        }
        final String lowerCase = \u2603[\u2603++].toLowerCase();
        if (!lowerCase.equalsIgnoreCase("color") && !lowerCase.equalsIgnoreCase("friendlyfire") && !lowerCase.equalsIgnoreCase("seeFriendlyInvisibles") && !lowerCase.equalsIgnoreCase("nametagVisibility") && !lowerCase.equalsIgnoreCase("deathMessageVisibility")) {
            throw new cf("commands.scoreboard.teams.option.usage", new Object[0]);
        }
        if (\u2603.length != 4) {
            final String \u26032 = \u2603[\u2603];
            if (lowerCase.equalsIgnoreCase("color")) {
                final a b = a.b(\u26032);
                if (b == null || b.c()) {
                    throw new cf("commands.scoreboard.teams.option.noValue", new Object[] { lowerCase, i.a(a.a(true, false)) });
                }
                e.a(b);
                e.b(b.toString());
                e.c(a.v.toString());
            }
            else if (lowerCase.equalsIgnoreCase("friendlyfire")) {
                if (!\u26032.equalsIgnoreCase("true") && !\u26032.equalsIgnoreCase("false")) {
                    throw new cf("commands.scoreboard.teams.option.noValue", new Object[] { lowerCase, i.a(Arrays.asList("true", "false")) });
                }
                e.a(\u26032.equalsIgnoreCase("true"));
            }
            else if (lowerCase.equalsIgnoreCase("seeFriendlyInvisibles")) {
                if (!\u26032.equalsIgnoreCase("true") && !\u26032.equalsIgnoreCase("false")) {
                    throw new cf("commands.scoreboard.teams.option.noValue", new Object[] { lowerCase, i.a(Arrays.asList("true", "false")) });
                }
                e.b(\u26032.equalsIgnoreCase("true"));
            }
            else if (lowerCase.equalsIgnoreCase("nametagVisibility")) {
                final auq.a a = auq.a.a(\u26032);
                if (a == null) {
                    throw new cf("commands.scoreboard.teams.option.noValue", new Object[] { lowerCase, i.a((Object[])auq.a.a()) });
                }
                e.a(a);
            }
            else if (lowerCase.equalsIgnoreCase("deathMessageVisibility")) {
                final auq.a a = auq.a.a(\u26032);
                if (a == null) {
                    throw new cf("commands.scoreboard.teams.option.noValue", new Object[] { lowerCase, i.a((Object[])auq.a.a()) });
                }
                e.b(a);
            }
            i.a(\u2603, this, "commands.scoreboard.teams.option.success", lowerCase, e.b(), \u26032);
            return;
        }
        if (lowerCase.equalsIgnoreCase("color")) {
            throw new cf("commands.scoreboard.teams.option.noValue", new Object[] { lowerCase, i.a(a.a(true, false)) });
        }
        if (lowerCase.equalsIgnoreCase("friendlyfire") || lowerCase.equalsIgnoreCase("seeFriendlyInvisibles")) {
            throw new cf("commands.scoreboard.teams.option.noValue", new Object[] { lowerCase, i.a(Arrays.asList("true", "false")) });
        }
        if (lowerCase.equalsIgnoreCase("nametagVisibility") || lowerCase.equalsIgnoreCase("deathMessageVisibility")) {
            throw new cf("commands.scoreboard.teams.option.noValue", new Object[] { lowerCase, i.a((Object[])auq.a.a()) });
        }
        throw new cf("commands.scoreboard.teams.option.usage", new Object[0]);
    }
    
    protected void e(final m \u2603, final String[] \u2603, final int \u2603) throws bz {
        final auo d = this.d();
        final aul e = this.e(\u2603[\u2603]);
        if (e == null) {
            return;
        }
        d.d(e);
        i.a(\u2603, this, "commands.scoreboard.teams.remove.success", e.b());
    }
    
    protected void f(final m \u2603, final String[] \u2603, final int \u2603) throws bz {
        final auo d = this.d();
        if (\u2603.length > \u2603) {
            final aul e = this.e(\u2603[\u2603]);
            if (e == null) {
                return;
            }
            final Collection<String> d2 = e.d();
            \u2603.a(n.a.e, d2.size());
            if (d2.size() <= 0) {
                throw new bz("commands.scoreboard.teams.list.player.empty", new Object[] { e.b() });
            }
            final fb fb = new fb("commands.scoreboard.teams.list.player.count", new Object[] { d2.size(), e.b() });
            fb.b().a(a.c);
            \u2603.a(fb);
            \u2603.a(new fa(i.a(d2.toArray())));
        }
        else {
            final Collection<aul> g = d.g();
            \u2603.a(n.a.e, g.size());
            if (g.size() <= 0) {
                throw new bz("commands.scoreboard.teams.list.empty", new Object[0]);
            }
            final fb fb2 = new fb("commands.scoreboard.teams.list.count", new Object[] { g.size() });
            fb2.b().a(a.c);
            \u2603.a(fb2);
            for (final aul aul : g) {
                \u2603.a(new fb("commands.scoreboard.teams.list.entry", new Object[] { aul.b(), aul.c(), aul.d().size() }));
            }
        }
    }
    
    protected void g(final m \u2603, final String[] \u2603, int \u2603) throws bz {
        final auo d = this.d();
        final String \u26032 = \u2603[\u2603++];
        final Set<String> hashSet = (Set<String>)Sets.newHashSet();
        final Set<String> hashSet2 = (Set<String>)Sets.newHashSet();
        if (\u2603 instanceof wn && \u2603 == \u2603.length) {
            final String e_ = i.b(\u2603).e_();
            if (d.a(e_, \u26032)) {
                hashSet.add(e_);
            }
            else {
                hashSet2.add(e_);
            }
        }
        else {
            while (\u2603 < \u2603.length) {
                final String e_ = \u2603[\u2603++];
                if (e_.startsWith("@")) {
                    final List<pk> c = i.c(\u2603, e_);
                    for (final pk pk : c) {
                        final String e = i.e(\u2603, pk.aK().toString());
                        if (d.a(e, \u26032)) {
                            hashSet.add(e);
                        }
                        else {
                            hashSet2.add(e);
                        }
                    }
                }
                else {
                    final String e2 = i.e(\u2603, e_);
                    if (d.a(e2, \u26032)) {
                        hashSet.add(e2);
                    }
                    else {
                        hashSet2.add(e2);
                    }
                }
            }
        }
        if (!hashSet.isEmpty()) {
            \u2603.a(n.a.c, hashSet.size());
            i.a(\u2603, this, "commands.scoreboard.teams.join.success", hashSet.size(), \u26032, i.a((Object[])hashSet.toArray(new String[hashSet.size()])));
        }
        if (!hashSet2.isEmpty()) {
            throw new bz("commands.scoreboard.teams.join.failure", new Object[] { hashSet2.size(), \u26032, i.a((Object[])hashSet2.toArray(new String[hashSet2.size()])) });
        }
    }
    
    protected void h(final m \u2603, String[] \u2603, final int \u2603) throws bz {
        final auo d = this.d();
        final Set<String> hashSet = (Set<String>)Sets.newHashSet();
        final Set<String> hashSet2 = (Set<String>)Sets.newHashSet();
        if (\u2603 instanceof wn && \u2603 == \u2603.length) {
            final String e_ = i.b(\u2603).e_();
            if (d.f(e_)) {
                hashSet.add(e_);
            }
            else {
                hashSet2.add(e_);
            }
        }
        else {
            while (\u2603 < \u2603.length) {
                final String e_ = \u2603[\u2603++];
                if (e_.startsWith("@")) {
                    final List<pk> c = i.c(\u2603, e_);
                    for (final pk pk : c) {
                        final String e = i.e(\u2603, pk.aK().toString());
                        if (d.f(e)) {
                            hashSet.add(e);
                        }
                        else {
                            hashSet2.add(e);
                        }
                    }
                }
                else {
                    final String e2 = i.e(\u2603, e_);
                    if (d.f(e2)) {
                        hashSet.add(e2);
                    }
                    else {
                        hashSet2.add(e2);
                    }
                }
            }
        }
        if (!hashSet.isEmpty()) {
            \u2603.a(n.a.c, hashSet.size());
            i.a(\u2603, this, "commands.scoreboard.teams.leave.success", hashSet.size(), i.a((Object[])hashSet.toArray(new String[hashSet.size()])));
        }
        if (!hashSet2.isEmpty()) {
            throw new bz("commands.scoreboard.teams.leave.failure", new Object[] { hashSet2.size(), i.a((Object[])hashSet2.toArray(new String[hashSet2.size()])) });
        }
    }
    
    protected void i(final m \u2603, final String[] \u2603, final int \u2603) throws bz {
        final auo d = this.d();
        final aul e = this.e(\u2603[\u2603]);
        if (e == null) {
            return;
        }
        final Collection<String> arrayList = (Collection<String>)Lists.newArrayList((Iterable<?>)e.d());
        \u2603.a(n.a.c, arrayList.size());
        if (arrayList.isEmpty()) {
            throw new bz("commands.scoreboard.teams.empty.alreadyEmpty", new Object[] { e.b() });
        }
        for (final String \u26032 : arrayList) {
            d.a(\u26032, e);
        }
        i.a(\u2603, this, "commands.scoreboard.teams.empty.success", arrayList.size(), e.b());
    }
    
    protected void h(final m \u2603, final String \u2603) throws bz {
        final auo d = this.d();
        final auk a = this.a(\u2603, false);
        d.k(a);
        i.a(\u2603, this, "commands.scoreboard.objectives.remove.success", \u2603);
    }
    
    protected void d(final m \u2603) throws bz {
        final auo d = this.d();
        final Collection<auk> c = d.c();
        if (c.size() > 0) {
            final fb fb = new fb("commands.scoreboard.objectives.list.count", new Object[] { c.size() });
            fb.b().a(a.c);
            \u2603.a(fb);
            for (final auk auk : c) {
                \u2603.a(new fb("commands.scoreboard.objectives.list.entry", new Object[] { auk.b(), auk.d(), auk.c().a() }));
            }
            return;
        }
        throw new bz("commands.scoreboard.objectives.list.empty", new Object[0]);
    }
    
    protected void j(m \u2603, final String[] \u2603, final int \u2603) throws bz {
        final auo d = this.d();
        final String \u26032 = \u2603[\u2603++];
        final int i = auo.i(\u26032);
        auk a = null;
        if (\u2603.length == 4) {
            a = this.a(\u2603[\u2603], false);
        }
        if (i < 0) {
            throw new bz("commands.scoreboard.objectives.setdisplay.invalidSlot", new Object[] { \u26032 });
        }
        d.a(i, a);
        if (a != null) {
            i.a(\u2603, this, "commands.scoreboard.objectives.setdisplay.successSet", auo.b(i), a.b());
        }
        else {
            i.a(\u2603, this, "commands.scoreboard.objectives.setdisplay.successCleared", auo.b(i));
        }
    }
    
    protected void k(final m \u2603, final String[] \u2603, final int \u2603) throws bz {
        final auo d = this.d();
        if (\u2603.length > \u2603) {
            final String e = i.e(\u2603, \u2603[\u2603]);
            final Map<auk, aum> c = d.c(e);
            \u2603.a(n.a.e, c.size());
            if (c.size() <= 0) {
                throw new bz("commands.scoreboard.players.list.player.empty", new Object[] { e });
            }
            final fb fb = new fb("commands.scoreboard.players.list.player.count", new Object[] { c.size(), e });
            fb.b().a(a.c);
            \u2603.a(fb);
            for (final aum aum : c.values()) {
                \u2603.a(new fb("commands.scoreboard.players.list.player.entry", new Object[] { aum.c(), aum.d().d(), aum.d().b() }));
            }
        }
        else {
            final Collection<String> d2 = d.d();
            \u2603.a(n.a.e, d2.size());
            if (d2.size() <= 0) {
                throw new bz("commands.scoreboard.players.list.empty", new Object[0]);
            }
            final fb fb2 = new fb("commands.scoreboard.players.list.count", new Object[] { d2.size() });
            fb2.b().a(a.c);
            \u2603.a(fb2);
            \u2603.a(new fa(i.a(d2.toArray())));
        }
    }
    
    protected void l(final m \u2603, String[] \u2603, final int \u2603) throws bz {
        final String s = \u2603[\u2603 - 1];
        final int n = \u2603;
        final String e = i.e(\u2603, \u2603[\u2603++]);
        if (e.length() > 40) {
            throw new cc("commands.scoreboard.players.name.tooLong", new Object[] { e, 40 });
        }
        final auk a = this.a(\u2603[\u2603++], true);
        final int \u26032 = s.equalsIgnoreCase("set") ? i.a(\u2603[\u2603++]) : i.a(\u2603[\u2603++], 0);
        if (\u2603.length > \u2603) {
            final pk b = i.b(\u2603, \u2603[n]);
            try {
                final dn a2 = ed.a(i.a(\u2603, \u2603));
                final dn dn = new dn();
                b.e(dn);
                if (!dy.a(a2, dn, true)) {
                    throw new bz("commands.scoreboard.players.set.tagMismatch", new Object[] { e });
                }
            }
            catch (ec ec) {
                throw new bz("commands.scoreboard.players.set.tagError", new Object[] { ec.getMessage() });
            }
        }
        final auo d = this.d();
        final aum c = d.c(e, a);
        if (s.equalsIgnoreCase("set")) {
            c.c(\u26032);
        }
        else if (s.equalsIgnoreCase("add")) {
            c.a(\u26032);
        }
        else {
            c.b(\u26032);
        }
        i.a(\u2603, this, "commands.scoreboard.players.set.success", a.b(), e, c.c());
    }
    
    protected void m(m \u2603, final String[] \u2603, final int \u2603) throws bz {
        final auo d = this.d();
        final String e = i.e(\u2603, \u2603[\u2603++]);
        if (\u2603.length > \u2603) {
            final auk a = this.a(\u2603[\u2603++], false);
            d.d(e, a);
            i.a(\u2603, this, "commands.scoreboard.players.resetscore.success", a.b(), e);
        }
        else {
            d.d(e, null);
            i.a(\u2603, this, "commands.scoreboard.players.reset.success", e);
        }
    }
    
    protected void n(final m \u2603, String[] \u2603, final int \u2603) throws bz {
        final auo d = this.d();
        final String d2 = i.d(\u2603, \u2603[\u2603++]);
        if (d2.length() > 40) {
            throw new cc("commands.scoreboard.players.name.tooLong", new Object[] { d2, 40 });
        }
        final auk a = this.a(\u2603[\u2603], false);
        if (a.c() != auu.c) {
            throw new bz("commands.scoreboard.players.enable.noTrigger", new Object[] { a.b() });
        }
        final aum c = d.c(d2, a);
        c.a(false);
        i.a(\u2603, this, "commands.scoreboard.players.enable.success", a.b(), d2);
    }
    
    protected void o(final m \u2603, final String[] \u2603, int \u2603) throws bz {
        final auo d = this.d();
        final String e = i.e(\u2603, \u2603[\u2603++]);
        if (e.length() > 40) {
            throw new cc("commands.scoreboard.players.name.tooLong", new Object[] { e, 40 });
        }
        final auk a = this.a(\u2603[\u2603++], false);
        if (!d.b(e, a)) {
            throw new bz("commands.scoreboard.players.test.notFound", new Object[] { a.b(), e });
        }
        final int i = \u2603[\u2603].equals("*") ? Integer.MIN_VALUE : i.a(\u2603[\u2603]);
        final int n = (++\u2603 >= \u2603.length || \u2603[\u2603].equals("*")) ? Integer.MAX_VALUE : i.a(\u2603[\u2603], i);
        final aum c = d.c(e, a);
        if (c.c() < i || c.c() > n) {
            throw new bz("commands.scoreboard.players.test.failed", new Object[] { c.c(), i, n });
        }
        i.a(\u2603, this, "commands.scoreboard.players.test.success", c.c(), i, n);
    }
    
    protected void p(m \u2603, final String[] \u2603, final int \u2603) throws bz {
        final auo d = this.d();
        final String e = i.e(\u2603, \u2603[\u2603++]);
        final auk a = this.a(\u2603[\u2603++], true);
        final String s = \u2603[\u2603++];
        final String e2 = i.e(\u2603, \u2603[\u2603++]);
        final auk a2 = this.a(\u2603[\u2603], false);
        if (e.length() > 40) {
            throw new cc("commands.scoreboard.players.name.tooLong", new Object[] { e, 40 });
        }
        if (e2.length() > 40) {
            throw new cc("commands.scoreboard.players.name.tooLong", new Object[] { e2, 40 });
        }
        final aum c = d.c(e, a);
        if (!d.b(e2, a2)) {
            throw new bz("commands.scoreboard.players.operation.notFound", new Object[] { a2.b(), e2 });
        }
        final aum c2 = d.c(e2, a2);
        if (s.equals("+=")) {
            c.c(c.c() + c2.c());
        }
        else if (s.equals("-=")) {
            c.c(c.c() - c2.c());
        }
        else if (s.equals("*=")) {
            c.c(c.c() * c2.c());
        }
        else if (s.equals("/=")) {
            if (c2.c() != 0) {
                c.c(c.c() / c2.c());
            }
        }
        else if (s.equals("%=")) {
            if (c2.c() != 0) {
                c.c(c.c() % c2.c());
            }
        }
        else if (s.equals("=")) {
            c.c(c2.c());
        }
        else if (s.equals("<")) {
            c.c(Math.min(c.c(), c2.c()));
        }
        else if (s.equals(">")) {
            c.c(Math.max(c.c(), c2.c()));
        }
        else {
            if (!s.equals("><")) {
                throw new bz("commands.scoreboard.players.operation.invalidOperation", new Object[] { s });
            }
            final int c3 = c.c();
            c.c(c2.c());
            c2.c(c3);
        }
        i.a(\u2603, this, "commands.scoreboard.players.operation.success", new Object[0]);
    }
    
    @Override
    public List<String> a(final m \u2603, final String[] \u2603, final cj \u2603) {
        if (\u2603.length == 1) {
            return i.a(\u2603, "objectives", "players", "teams");
        }
        if (\u2603[0].equalsIgnoreCase("objectives")) {
            if (\u2603.length == 2) {
                return i.a(\u2603, "list", "add", "remove", "setdisplay");
            }
            if (\u2603[1].equalsIgnoreCase("add")) {
                if (\u2603.length == 4) {
                    final Set<String> keySet = auu.a.keySet();
                    return i.a(\u2603, keySet);
                }
            }
            else if (\u2603[1].equalsIgnoreCase("remove")) {
                if (\u2603.length == 3) {
                    return i.a(\u2603, this.a(false));
                }
            }
            else if (\u2603[1].equalsIgnoreCase("setdisplay")) {
                if (\u2603.length == 3) {
                    return i.a(\u2603, auo.h());
                }
                if (\u2603.length == 4) {
                    return i.a(\u2603, this.a(false));
                }
            }
        }
        else if (\u2603[0].equalsIgnoreCase("players")) {
            if (\u2603.length == 2) {
                return i.a(\u2603, "set", "add", "remove", "reset", "list", "enable", "test", "operation");
            }
            if (\u2603[1].equalsIgnoreCase("set") || \u2603[1].equalsIgnoreCase("add") || \u2603[1].equalsIgnoreCase("remove") || \u2603[1].equalsIgnoreCase("reset")) {
                if (\u2603.length == 3) {
                    return i.a(\u2603, MinecraftServer.N().K());
                }
                if (\u2603.length == 4) {
                    return i.a(\u2603, this.a(true));
                }
            }
            else if (\u2603[1].equalsIgnoreCase("enable")) {
                if (\u2603.length == 3) {
                    return i.a(\u2603, MinecraftServer.N().K());
                }
                if (\u2603.length == 4) {
                    return i.a(\u2603, this.e());
                }
            }
            else if (\u2603[1].equalsIgnoreCase("list") || \u2603[1].equalsIgnoreCase("test")) {
                if (\u2603.length == 3) {
                    return i.a(\u2603, this.d().d());
                }
                if (\u2603.length == 4 && \u2603[1].equalsIgnoreCase("test")) {
                    return i.a(\u2603, this.a(false));
                }
            }
            else if (\u2603[1].equalsIgnoreCase("operation")) {
                if (\u2603.length == 3) {
                    return i.a(\u2603, this.d().d());
                }
                if (\u2603.length == 4) {
                    return i.a(\u2603, this.a(true));
                }
                if (\u2603.length == 5) {
                    return i.a(\u2603, "+=", "-=", "*=", "/=", "%=", "=", "<", ">", "><");
                }
                if (\u2603.length == 6) {
                    return i.a(\u2603, MinecraftServer.N().K());
                }
                if (\u2603.length == 7) {
                    return i.a(\u2603, this.a(false));
                }
            }
        }
        else if (\u2603[0].equalsIgnoreCase("teams")) {
            if (\u2603.length == 2) {
                return i.a(\u2603, "add", "remove", "join", "leave", "empty", "list", "option");
            }
            if (\u2603[1].equalsIgnoreCase("join")) {
                if (\u2603.length == 3) {
                    return i.a(\u2603, this.d().f());
                }
                if (\u2603.length >= 4) {
                    return i.a(\u2603, MinecraftServer.N().K());
                }
            }
            else {
                if (\u2603[1].equalsIgnoreCase("leave")) {
                    return i.a(\u2603, MinecraftServer.N().K());
                }
                if (\u2603[1].equalsIgnoreCase("empty") || \u2603[1].equalsIgnoreCase("list") || \u2603[1].equalsIgnoreCase("remove")) {
                    if (\u2603.length == 3) {
                        return i.a(\u2603, this.d().f());
                    }
                }
                else if (\u2603[1].equalsIgnoreCase("option")) {
                    if (\u2603.length == 3) {
                        return i.a(\u2603, this.d().f());
                    }
                    if (\u2603.length == 4) {
                        return i.a(\u2603, "color", "friendlyfire", "seeFriendlyInvisibles", "nametagVisibility", "deathMessageVisibility");
                    }
                    if (\u2603.length == 5) {
                        if (\u2603[3].equalsIgnoreCase("color")) {
                            return i.a(\u2603, a.a(true, false));
                        }
                        if (\u2603[3].equalsIgnoreCase("nametagVisibility") || \u2603[3].equalsIgnoreCase("deathMessageVisibility")) {
                            return i.a(\u2603, auq.a.a());
                        }
                        if (\u2603[3].equalsIgnoreCase("friendlyfire") || \u2603[3].equalsIgnoreCase("seeFriendlyInvisibles")) {
                            return i.a(\u2603, "true", "false");
                        }
                    }
                }
            }
        }
        return null;
    }
    
    protected List<String> a(final boolean \u2603) {
        final Collection<auk> c = this.d().c();
        final List<String> arrayList = (List<String>)Lists.newArrayList();
        for (final auk auk : c) {
            if (!\u2603 || !auk.c().b()) {
                arrayList.add(auk.b());
            }
        }
        return arrayList;
    }
    
    protected List<String> e() {
        final Collection<auk> c = this.d().c();
        final List<String> arrayList = (List<String>)Lists.newArrayList();
        for (final auk auk : c) {
            if (auk.c() == auu.c) {
                arrayList.add(auk.b());
            }
        }
        return arrayList;
    }
    
    @Override
    public boolean b(final String[] \u2603, final int \u2603) {
        if (!\u2603[0].equalsIgnoreCase("players")) {
            return \u2603[0].equalsIgnoreCase("teams") && \u2603 == 2;
        }
        if (\u2603.length > 1 && \u2603[1].equalsIgnoreCase("operation")) {
            return \u2603 == 2 || \u2603 == 5;
        }
        return \u2603 == 2;
    }
}
