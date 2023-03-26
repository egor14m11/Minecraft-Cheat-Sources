import net.minecraft.server.MinecraftServer;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class ae extends i
{
    @Override
    public String c() {
        return "xp";
    }
    
    @Override
    public int a() {
        return 2;
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.xp.usage";
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        if (\u2603.length <= 0) {
            throw new cf("commands.xp.usage", new Object[0]);
        }
        String substring = \u2603[0];
        final boolean b = substring.endsWith("l") || substring.endsWith("L");
        if (b && substring.length() > 1) {
            substring = substring.substring(0, substring.length() - 1);
        }
        int a = i.a(substring);
        final boolean b2 = a < 0;
        if (b2) {
            a *= -1;
        }
        final wn wn = (\u2603.length > 1) ? i.a(\u2603, \u2603[1]) : i.b(\u2603);
        if (b) {
            \u2603.a(n.a.e, wn.bB);
            if (b2) {
                wn.a(-a);
                i.a(\u2603, this, "commands.xp.success.negative.levels", a, wn.e_());
            }
            else {
                wn.a(a);
                i.a(\u2603, this, "commands.xp.success.levels", a, wn.e_());
            }
        }
        else {
            \u2603.a(n.a.e, wn.bC);
            if (b2) {
                throw new bz("commands.xp.failure.widthdrawXp", new Object[0]);
            }
            wn.u(a);
            i.a(\u2603, this, "commands.xp.success", a, wn.e_());
        }
    }
    
    @Override
    public List<String> a(final m \u2603, final String[] \u2603, final cj \u2603) {
        if (\u2603.length == 2) {
            return i.a(\u2603, this.d());
        }
        return null;
    }
    
    protected String[] d() {
        return MinecraftServer.N().K();
    }
    
    @Override
    public boolean b(final String[] \u2603, final int \u2603) {
        return \u2603 == 1;
    }
}
