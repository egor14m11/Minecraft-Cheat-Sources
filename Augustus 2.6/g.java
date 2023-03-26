import java.util.concurrent.ExecutionException;
import org.apache.logging.log4j.Logger;
import java.util.concurrent.FutureTask;

// 
// Decompiled by Procyon v0.5.36
// 

public class g
{
    public static a a() {
        final String lowerCase = System.getProperty("os.name").toLowerCase();
        if (lowerCase.contains("win")) {
            return a.c;
        }
        if (lowerCase.contains("mac")) {
            return a.d;
        }
        if (lowerCase.contains("solaris")) {
            return a.b;
        }
        if (lowerCase.contains("sunos")) {
            return a.b;
        }
        if (lowerCase.contains("linux")) {
            return a.a;
        }
        if (lowerCase.contains("unix")) {
            return a.a;
        }
        return a.e;
    }
    
    public static <V> V a(final FutureTask<V> \u2603, final Logger \u2603) {
        try {
            \u2603.run();
            return \u2603.get();
        }
        catch (ExecutionException throwable) {
            \u2603.fatal("Error executing task", throwable);
        }
        catch (InterruptedException throwable2) {
            \u2603.fatal("Error executing task", throwable2);
        }
        return null;
    }
    
    public enum a
    {
        a, 
        b, 
        c, 
        d, 
        e;
    }
}
