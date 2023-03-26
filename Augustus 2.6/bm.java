import java.util.Collection;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class bm extends i
{
    @Override
    public String c() {
        return "summon";
    }
    
    @Override
    public int a() {
        return 2;
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.summon.usage";
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        if (\u2603.length < 1) {
            throw new cf("commands.summon.usage", new Object[0]);
        }
        final String s = \u2603[0];
        cj c = \u2603.c();
        final aui d = \u2603.d();
        double \u26032 = d.a;
        double \u26033 = d.b;
        double \u26034 = d.c;
        if (\u2603.length >= 4) {
            \u26032 = i.b(\u26032, \u2603[1], true);
            \u26033 = i.b(\u26033, \u2603[2], false);
            \u26034 = i.b(\u26034, \u2603[3], true);
            c = new cj(\u26032, \u26033, \u26034);
        }
        final adm e = \u2603.e();
        if (!e.e(c)) {
            throw new bz("commands.summon.outOfWorld", new Object[0]);
        }
        if ("LightningBolt".equals(s)) {
            e.c(new uv(e, \u26032, \u26033, \u26034));
            i.a(\u2603, this, "commands.summon.success", new Object[0]);
            return;
        }
        dn a = new dn();
        boolean b = false;
        if (\u2603.length >= 5) {
            final eu a2 = i.a(\u2603, \u2603, 4);
            try {
                a = ed.a(a2.c());
                b = true;
            }
            catch (ec ec) {
                throw new bz("commands.summon.tagError", new Object[] { ec.getMessage() });
            }
        }
        a.a("id", s);
        pk a3;
        try {
            a3 = pm.a(a, e);
        }
        catch (RuntimeException ex) {
            throw new bz("commands.summon.failed", new Object[0]);
        }
        if (a3 == null) {
            throw new bz("commands.summon.failed", new Object[0]);
        }
        a3.b(\u26032, \u26033, \u26034, a3.y, a3.z);
        if (!b && a3 instanceof ps) {
            ((ps)a3).a(e.E(new cj(a3)), null);
        }
        e.d(a3);
        pk pk = a3;
        pk a4;
        for (dn m = a; pk != null && m.b("Riding", 10); pk = a4, m = m.m("Riding")) {
            a4 = pm.a(m.m("Riding"), e);
            if (a4 != null) {
                a4.b(\u26032, \u26033, \u26034, a4.y, a4.z);
                e.d(a4);
                pk.a(a4);
            }
        }
        i.a(\u2603, this, "commands.summon.success", new Object[0]);
    }
    
    @Override
    public List<String> a(final m \u2603, final String[] \u2603, final cj \u2603) {
        if (\u2603.length == 1) {
            return i.a(\u2603, pm.b());
        }
        if (\u2603.length > 1 && \u2603.length <= 4) {
            return i.a(\u2603, 1, \u2603);
        }
        return null;
    }
}
