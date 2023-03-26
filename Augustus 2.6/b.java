import org.apache.logging.log4j.LogManager;
import java.io.FileWriter;
import java.util.Date;
import java.text.SimpleDateFormat;
import org.apache.commons.io.IOUtils;
import java.io.Writer;
import java.io.PrintWriter;
import java.io.StringWriter;
import org.apache.commons.lang3.ArrayUtils;
import java.util.Iterator;
import java.lang.management.RuntimeMXBean;
import java.lang.management.ManagementFactory;
import java.util.concurrent.Callable;
import com.google.common.collect.Lists;
import java.io.File;
import java.util.List;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class b
{
    private static final Logger a;
    private final String b;
    private final Throwable c;
    private final c d;
    private final List<c> e;
    private File f;
    private boolean g;
    private StackTraceElement[] h;
    
    public b(final String \u2603, final Throwable \u2603) {
        this.d = new c(this, "System Details");
        this.e = (List<c>)Lists.newArrayList();
        this.g = true;
        this.h = new StackTraceElement[0];
        this.b = \u2603;
        this.c = \u2603;
        this.h();
    }
    
    private void h() {
        this.d.a("Minecraft Version", new Callable<String>() {
            public String a() {
                return "1.8.8";
            }
        });
        this.d.a("Operating System", new Callable<String>() {
            public String a() {
                return System.getProperty("os.name") + " (" + System.getProperty("os.arch") + ") version " + System.getProperty("os.version");
            }
        });
        this.d.a("Java Version", new Callable<String>() {
            public String a() {
                return System.getProperty("java.version") + ", " + System.getProperty("java.vendor");
            }
        });
        this.d.a("Java VM Version", new Callable<String>() {
            public String a() {
                return System.getProperty("java.vm.name") + " (" + System.getProperty("java.vm.info") + "), " + System.getProperty("java.vm.vendor");
            }
        });
        this.d.a("Memory", new Callable<String>() {
            public String a() {
                final Runtime runtime = Runtime.getRuntime();
                final long maxMemory = runtime.maxMemory();
                final long totalMemory = runtime.totalMemory();
                final long freeMemory = runtime.freeMemory();
                final long lng = maxMemory / 1024L / 1024L;
                final long lng2 = totalMemory / 1024L / 1024L;
                final long lng3 = freeMemory / 1024L / 1024L;
                return freeMemory + " bytes (" + lng3 + " MB) / " + totalMemory + " bytes (" + lng2 + " MB) up to " + maxMemory + " bytes (" + lng + " MB)";
            }
        });
        this.d.a("JVM Flags", new Callable<String>() {
            public String a() {
                final RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
                final List<String> inputArguments = runtimeMXBean.getInputArguments();
                int i = 0;
                final StringBuilder sb = new StringBuilder();
                for (final String str : inputArguments) {
                    if (str.startsWith("-X")) {
                        if (i++ > 0) {
                            sb.append(" ");
                        }
                        sb.append(str);
                    }
                }
                return String.format("%d total; %s", i, sb.toString());
            }
        });
        this.d.a("IntCache", new Callable<String>() {
            public String a() throws Exception {
                return asc.b();
            }
        });
    }
    
    public String a() {
        return this.b;
    }
    
    public Throwable b() {
        return this.c;
    }
    
    public void a(final StringBuilder \u2603) {
        if ((this.h == null || this.h.length <= 0) && this.e.size() > 0) {
            this.h = ArrayUtils.subarray(this.e.get(0).a(), 0, 1);
        }
        if (this.h != null && this.h.length > 0) {
            \u2603.append("-- Head --\n");
            \u2603.append("Stacktrace:\n");
            for (final StackTraceElement stackTraceElement : this.h) {
                \u2603.append("\t").append("at ").append(stackTraceElement.toString());
                \u2603.append("\n");
            }
            \u2603.append("\n");
        }
        for (final c c : this.e) {
            c.a(\u2603);
            \u2603.append("\n\n");
        }
        this.d.a(\u2603);
    }
    
    public String d() {
        StringWriter stringWriter = null;
        PrintWriter printWriter = null;
        Throwable c = this.c;
        if (c.getMessage() == null) {
            if (c instanceof NullPointerException) {
                c = new NullPointerException(this.b);
            }
            else if (c instanceof StackOverflowError) {
                c = new StackOverflowError(this.b);
            }
            else if (c instanceof OutOfMemoryError) {
                c = new OutOfMemoryError(this.b);
            }
            c.setStackTrace(this.c.getStackTrace());
        }
        String s = c.toString();
        try {
            stringWriter = new StringWriter();
            printWriter = new PrintWriter(stringWriter);
            c.printStackTrace(printWriter);
            s = stringWriter.toString();
        }
        finally {
            IOUtils.closeQuietly(stringWriter);
            IOUtils.closeQuietly(printWriter);
        }
        return s;
    }
    
    public String e() {
        final StringBuilder \u2603 = new StringBuilder();
        \u2603.append("---- Minecraft Crash Report ----\n");
        \u2603.append("// ");
        \u2603.append(i());
        \u2603.append("\n\n");
        \u2603.append("Time: ");
        \u2603.append(new SimpleDateFormat().format(new Date()));
        \u2603.append("\n");
        \u2603.append("Description: ");
        \u2603.append(this.b);
        \u2603.append("\n\n");
        \u2603.append(this.d());
        \u2603.append("\n\nA detailed walkthrough of the error, its code path and all known details is as follows:\n");
        for (int i = 0; i < 87; ++i) {
            \u2603.append("-");
        }
        \u2603.append("\n\n");
        this.a(\u2603);
        return \u2603.toString();
    }
    
    public File f() {
        return this.f;
    }
    
    public boolean a(final File \u2603) {
        if (this.f != null) {
            return false;
        }
        if (\u2603.getParentFile() != null) {
            \u2603.getParentFile().mkdirs();
        }
        try {
            final FileWriter fileWriter = new FileWriter(\u2603);
            fileWriter.write(this.e());
            fileWriter.close();
            this.f = \u2603;
            return true;
        }
        catch (Throwable throwable) {
            b.a.error("Could not save crash report to " + \u2603, throwable);
            return false;
        }
    }
    
    public c g() {
        return this.d;
    }
    
    public c a(final String \u2603) {
        return this.a(\u2603, 1);
    }
    
    public c a(final String \u2603, final int \u2603) {
        final c c = new c(this, \u2603);
        if (this.g) {
            final int a = c.a(\u2603);
            final StackTraceElement[] stackTrace = this.c.getStackTrace();
            StackTraceElement \u26032 = null;
            StackTraceElement \u26033 = null;
            final int n = stackTrace.length - a;
            if (n < 0) {
                System.out.println("Negative index in crash report handler (" + stackTrace.length + "/" + a + ")");
            }
            if (stackTrace != null && 0 <= n && n < stackTrace.length) {
                \u26032 = stackTrace[n];
                if (stackTrace.length + 1 - a < stackTrace.length) {
                    \u26033 = stackTrace[stackTrace.length + 1 - a];
                }
            }
            this.g = c.a(\u26032, \u26033);
            if (a > 0 && !this.e.isEmpty()) {
                final c c2 = this.e.get(this.e.size() - 1);
                c2.b(a);
            }
            else if (stackTrace != null && stackTrace.length >= a && 0 <= n && n < stackTrace.length) {
                System.arraycopy(stackTrace, 0, this.h = new StackTraceElement[n], 0, this.h.length);
            }
            else {
                this.g = false;
            }
        }
        this.e.add(c);
        return c;
    }
    
    private static String i() {
        final String[] array = { "Who set us up the TNT?", "Everything's going to plan. No, really, that was supposed to happen.", "Uh... Did I do that?", "Oops.", "Why did you do that?", "I feel sad now :(", "My bad.", "I'm sorry, Dave.", "I let you down. Sorry :(", "On the bright side, I bought you a teddy bear!", "Daisy, daisy...", "Oh - I know what I did wrong!", "Hey, that tickles! Hehehe!", "I blame Dinnerbone.", "You should try our sister game, Minceraft!", "Don't be sad. I'll do better next time, I promise!", "Don't be sad, have a hug! <3", "I just don't know what went wrong :(", "Shall we play a game?", "Quite honestly, I wouldn't worry myself about that.", "I bet Cylons wouldn't have this problem.", "Sorry :(", "Surprise! Haha. Well, this is awkward.", "Would you like a cupcake?", "Hi. I'm Minecraft, and I'm a crashaholic.", "Ooh. Shiny.", "This doesn't make any sense!", "Why is it breaking :(", "Don't do that.", "Ouch. That hurt :(", "You're mean.", "This is a token for 1 free hug. Redeem at your nearest Mojangsta: [~~HUG~~]", "There are four lights!", "But it works on my machine." };
        try {
            return array[(int)(System.nanoTime() % array.length)];
        }
        catch (Throwable t) {
            return "Witty comment unavailable :(";
        }
    }
    
    public static b a(final Throwable \u2603, final String \u2603) {
        b a;
        if (\u2603 instanceof e) {
            a = ((e)\u2603).a();
        }
        else {
            a = new b(\u2603, \u2603);
        }
        return a;
    }
    
    static {
        a = LogManager.getLogger();
    }
}
