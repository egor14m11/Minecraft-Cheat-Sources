import net.minecraft.server.MinecraftServer;
import java.util.Collection;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class z extends i
{
    @Override
    public String c() {
        return "effect";
    }
    
    @Override
    public int a() {
        return 2;
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.effect.usage";
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        if (\u2603.length < 2) {
            throw new cf("commands.effect.usage", new Object[0]);
        }
        final pr pr = i.a(\u2603, \u2603[0], (Class<? extends pr>)pr.class);
        if (\u2603[1].equals("clear")) {
            if (pr.bl().isEmpty()) {
                throw new bz("commands.effect.failure.notActive.all", new Object[] { pr.e_() });
            }
            pr.bk();
            i.a(\u2603, this, "commands.effect.success.removed.all", pr.e_());
        }
        else {
            int \u26032;
            try {
                \u26032 = i.a(\u2603[1], 1);
            }
            catch (cb cb) {
                final pe b = pe.b(\u2603[1]);
                if (b == null) {
                    throw cb;
                }
                \u26032 = b.H;
            }
            int \u26033 = 600;
            int a = 30;
            int a2 = 0;
            if (\u26032 < 0 || \u26032 >= pe.a.length || pe.a[\u26032] == null) {
                throw new cb("commands.effect.notFound", new Object[] { \u26032 });
            }
            final pe pe = pe.a[\u26032];
            if (\u2603.length >= 3) {
                a = i.a(\u2603[2], 0, 1000000);
                if (pe.b()) {
                    \u26033 = a;
                }
                else {
                    \u26033 = a * 20;
                }
            }
            else if (pe.b()) {
                \u26033 = 1;
            }
            if (\u2603.length >= 4) {
                a2 = i.a(\u2603[3], 0, 255);
            }
            boolean \u26034 = true;
            if (\u2603.length >= 5 && "true".equalsIgnoreCase(\u2603[4])) {
                \u26034 = false;
            }
            if (a > 0) {
                final pf \u26035 = new pf(\u26032, \u26033, a2, false, \u26034);
                pr.c(\u26035);
                i.a(\u2603, this, "commands.effect.success", new fb(\u26035.g(), new Object[0]), \u26032, a2, pr.e_(), a);
                return;
            }
            if (pr.k(\u26032)) {
                pr.m(\u26032);
                i.a(\u2603, this, "commands.effect.success.removed", new fb(pe.a(), new Object[0]), pr.e_());
                return;
            }
            throw new bz("commands.effect.failure.notActive", new Object[] { new fb(pe.a(), new Object[0]), pr.e_() });
        }
    }
    
    @Override
    public List<String> a(final m \u2603, final String[] \u2603, final cj \u2603) {
        if (\u2603.length == 1) {
            return i.a(\u2603, this.d());
        }
        if (\u2603.length == 2) {
            return i.a(\u2603, pe.c());
        }
        if (\u2603.length == 5) {
            return i.a(\u2603, "true", "false");
        }
        return null;
    }
    
    protected String[] d() {
        return MinecraftServer.N().K();
    }
    
    @Override
    public boolean b(final String[] \u2603, final int \u2603) {
        return \u2603 == 0;
    }
}
