import java.util.List;
import net.minecraft.server.MinecraftServer;

// 
// Decompiled by Procyon v0.5.36
// 

public class ag extends i
{
    @Override
    public String c() {
        return "difficulty";
    }
    
    @Override
    public int a() {
        return 2;
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.difficulty.usage";
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        if (\u2603.length <= 0) {
            throw new cf("commands.difficulty.usage", new Object[0]);
        }
        final oj e = this.e(\u2603[0]);
        MinecraftServer.N().a(e);
        i.a(\u2603, this, "commands.difficulty.success", new fb(e.b(), new Object[0]));
    }
    
    protected oj e(final String \u2603) throws cb {
        if (\u2603.equalsIgnoreCase("peaceful") || \u2603.equalsIgnoreCase("p")) {
            return oj.a;
        }
        if (\u2603.equalsIgnoreCase("easy") || \u2603.equalsIgnoreCase("e")) {
            return oj.b;
        }
        if (\u2603.equalsIgnoreCase("normal") || \u2603.equalsIgnoreCase("n")) {
            return oj.c;
        }
        if (\u2603.equalsIgnoreCase("hard") || \u2603.equalsIgnoreCase("h")) {
            return oj.d;
        }
        return oj.a(i.a(\u2603, 0, 3));
    }
    
    @Override
    public List<String> a(final m \u2603, final String[] \u2603, final cj \u2603) {
        if (\u2603.length == 1) {
            return i.a(\u2603, "peaceful", "easy", "normal", "hard");
        }
        return null;
    }
}
