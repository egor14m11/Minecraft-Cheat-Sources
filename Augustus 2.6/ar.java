import com.google.common.collect.Lists;
import java.util.List;
import com.mojang.authlib.GameProfile;
import net.minecraft.server.MinecraftServer;

// 
// Decompiled by Procyon v0.5.36
// 

public class ar extends i
{
    @Override
    public String c() {
        return "op";
    }
    
    @Override
    public int a() {
        return 3;
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.op.usage";
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        if (\u2603.length != 1 || \u2603[0].length() <= 0) {
            throw new cf("commands.op.usage", new Object[0]);
        }
        final MinecraftServer n = MinecraftServer.N();
        final GameProfile a = n.aF().a(\u2603[0]);
        if (a == null) {
            throw new bz("commands.op.failed", new Object[] { \u2603[0] });
        }
        n.ap().a(a);
        i.a(\u2603, this, "commands.op.success", \u2603[0]);
    }
    
    @Override
    public List<String> a(final m \u2603, final String[] \u2603, final cj \u2603) {
        if (\u2603.length == 1) {
            final String \u26032 = \u2603[\u2603.length - 1];
            final List<String> arrayList = (List<String>)Lists.newArrayList();
            for (final GameProfile \u26033 : MinecraftServer.N().L()) {
                if (!MinecraftServer.N().ap().h(\u26033) && i.a(\u26032, \u26033.getName())) {
                    arrayList.add(\u26033.getName());
                }
            }
            return arrayList;
        }
        return null;
    }
}
