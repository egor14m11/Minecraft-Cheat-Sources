import org.apache.logging.log4j.LogManager;
import java.io.OutputStream;
import org.apache.logging.log4j.Logger;
import java.io.PrintStream;

// 
// Decompiled by Procyon v0.5.36
// 

public class kg extends PrintStream
{
    private static final Logger a;
    private final String b;
    
    public kg(final String \u2603, final OutputStream \u2603) {
        super(\u2603);
        this.b = \u2603;
    }
    
    @Override
    public void println(final String \u2603) {
        this.a(\u2603);
    }
    
    @Override
    public void println(final Object \u2603) {
        this.a(String.valueOf(\u2603));
    }
    
    private void a(final String \u2603) {
        final StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        final StackTraceElement stackTraceElement = stackTrace[Math.min(3, stackTrace.length)];
        kg.a.info("[{}]@.({}:{}): {}", new Object[] { this.b, stackTraceElement.getFileName(), stackTraceElement.getLineNumber(), \u2603 });
    }
    
    static {
        a = LogManager.getLogger();
    }
}
