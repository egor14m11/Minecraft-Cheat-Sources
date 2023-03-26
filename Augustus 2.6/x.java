import org.apache.logging.log4j.LogManager;
import java.util.List;
import java.io.FileWriter;
import java.io.File;
import java.util.Date;
import java.text.SimpleDateFormat;
import net.minecraft.server.MinecraftServer;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class x extends i
{
    private static final Logger a;
    private long b;
    private int c;
    
    @Override
    public String c() {
        return "debug";
    }
    
    @Override
    public int a() {
        return 3;
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.debug.usage";
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        if (\u2603.length < 1) {
            throw new cf("commands.debug.usage", new Object[0]);
        }
        if (\u2603[0].equals("start")) {
            if (\u2603.length != 1) {
                throw new cf("commands.debug.usage", new Object[0]);
            }
            i.a(\u2603, this, "commands.debug.start", new Object[0]);
            MinecraftServer.N().au();
            this.b = MinecraftServer.az();
            this.c = MinecraftServer.N().at();
        }
        else {
            if (!\u2603[0].equals("stop")) {
                throw new cf("commands.debug.usage", new Object[0]);
            }
            if (\u2603.length != 1) {
                throw new cf("commands.debug.usage", new Object[0]);
            }
            if (!MinecraftServer.N().c.a) {
                throw new bz("commands.debug.notStarted", new Object[0]);
            }
            final long az = MinecraftServer.az();
            final int at = MinecraftServer.N().at();
            final long \u26032 = az - this.b;
            final int n = at - this.c;
            this.a(\u26032, n);
            MinecraftServer.N().c.a = false;
            i.a(\u2603, this, "commands.debug.stop", \u26032 / 1000.0f, n);
        }
    }
    
    private void a(final long \u2603, final int \u2603) {
        final File file = new File(MinecraftServer.N().d("debug"), "profile-results-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + ".txt");
        file.getParentFile().mkdirs();
        try {
            final FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(this.b(\u2603, \u2603));
            fileWriter.close();
        }
        catch (Throwable throwable) {
            x.a.error("Could not save profiler results to " + file, throwable);
        }
    }
    
    private String b(final long \u2603, final int \u2603) {
        final StringBuilder \u26032 = new StringBuilder();
        \u26032.append("---- Minecraft Profiler Results ----\n");
        \u26032.append("// ");
        \u26032.append(d());
        \u26032.append("\n\n");
        \u26032.append("Time span: ").append(\u2603).append(" ms\n");
        \u26032.append("Tick span: ").append(\u2603).append(" ticks\n");
        \u26032.append("// This is approximately ").append(String.format("%.2f", \u2603 / (\u2603 / 1000.0f))).append(" ticks per second. It should be ").append(20).append(" ticks per second\n\n");
        \u26032.append("--- BEGIN PROFILE DUMP ---\n\n");
        this.a(0, "root", \u26032);
        \u26032.append("--- END PROFILE DUMP ---\n\n");
        return \u26032.toString();
    }
    
    private void a(final int \u2603, final String \u2603, final StringBuilder \u2603) {
        final List<nt.a> b = MinecraftServer.N().c.b(\u2603);
        if (b == null || b.size() < 3) {
            return;
        }
        for (int i = 1; i < b.size(); ++i) {
            final nt.a a = b.get(i);
            \u2603.append(String.format("[%02d] ", \u2603));
            for (int j = 0; j < \u2603; ++j) {
                \u2603.append(" ");
            }
            \u2603.append(a.c).append(" - ").append(String.format("%.2f", a.a)).append("%/").append(String.format("%.2f", a.b)).append("%\n");
            if (!a.c.equals("unspecified")) {
                try {
                    this.a(\u2603 + 1, \u2603 + "." + a.c, \u2603);
                }
                catch (Exception obj) {
                    \u2603.append("[[ EXCEPTION ").append(obj).append(" ]]");
                }
            }
        }
    }
    
    private static String d() {
        final String[] array = { "Shiny numbers!", "Am I not running fast enough? :(", "I'm working as hard as I can!", "Will I ever be good enough for you? :(", "Speedy. Zoooooom!", "Hello world", "40% better than a crash report.", "Now with extra numbers", "Now with less numbers", "Now with the same numbers", "You should add flames to things, it makes them go faster!", "Do you feel the need for... optimization?", "*cracks redstone whip*", "Maybe if you treated it better then it'll have more motivation to work faster! Poor server." };
        try {
            return array[(int)(System.nanoTime() % array.length)];
        }
        catch (Throwable t) {
            return "Witty comment unavailable :(";
        }
    }
    
    @Override
    public List<String> a(final m \u2603, final String[] \u2603, final cj \u2603) {
        if (\u2603.length == 1) {
            return i.a(\u2603, "start", "stop");
        }
        return null;
    }
    
    static {
        a = LogManager.getLogger();
    }
}
