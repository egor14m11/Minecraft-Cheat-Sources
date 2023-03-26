import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class au extends i
{
    @Override
    public String c() {
        return "particle";
    }
    
    @Override
    public int a() {
        return 2;
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.particle.usage";
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        if (\u2603.length < 8) {
            throw new cf("commands.particle.usage", new Object[0]);
        }
        boolean b = false;
        cy \u26032 = null;
        for (final cy cy : cy.values()) {
            if (cy.f()) {
                if (\u2603[0].startsWith(cy.b())) {
                    b = true;
                    \u26032 = cy;
                    break;
                }
            }
            else if (\u2603[0].equals(cy.b())) {
                b = true;
                \u26032 = cy;
                break;
            }
        }
        if (!b) {
            throw new bz("commands.particle.notFound", new Object[] { \u2603[0] });
        }
        final String s = \u2603[0];
        final aui d = \u2603.d();
        final double \u26033 = (float)i.b(d.a, \u2603[1], true);
        final double \u26034 = (float)i.b(d.b, \u2603[2], true);
        final double \u26035 = (float)i.b(d.c, \u2603[3], true);
        final double \u26036 = (float)i.c(\u2603[4]);
        final double \u26037 = (float)i.c(\u2603[5]);
        final double \u26038 = (float)i.c(\u2603[6]);
        final double \u26039 = (float)i.c(\u2603[7]);
        int a = 0;
        if (\u2603.length > 8) {
            a = i.a(\u2603[8], 0);
        }
        boolean \u260310 = false;
        if (\u2603.length > 9 && "force".equals(\u2603[9])) {
            \u260310 = true;
        }
        final adm e = \u2603.e();
        if (e instanceof le) {
            final le le = (le)e;
            final int[] \u260311 = new int[\u26032.d()];
            if (\u26032.f()) {
                final String[] split = \u2603[0].split("_", 3);
                for (int j = 1; j < split.length; ++j) {
                    try {
                        \u260311[j - 1] = Integer.parseInt(split[j]);
                    }
                    catch (NumberFormatException ex) {
                        throw new bz("commands.particle.notFound", new Object[] { \u2603[0] });
                    }
                }
            }
            le.a(\u26032, \u260310, \u26033, \u26034, \u26035, a, \u26036, \u26037, \u26038, \u26039, \u260311);
            i.a(\u2603, this, "commands.particle.success", s, Math.max(a, 1));
        }
    }
    
    @Override
    public List<String> a(final m \u2603, final String[] \u2603, final cj \u2603) {
        if (\u2603.length == 1) {
            return i.a(\u2603, cy.a());
        }
        if (\u2603.length > 1 && \u2603.length <= 4) {
            return i.a(\u2603, 1, \u2603);
        }
        if (\u2603.length == 10) {
            return i.a(\u2603, "normal", "force");
        }
        return null;
    }
}
