import org.apache.logging.log4j.LogManager;
import java.io.IOException;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class blu
{
    private static final Logger a;
    private static blu b;
    
    public static void a() {
        blu.b = new blu();
    }
    
    public static blu b() {
        return blu.b;
    }
    
    private blu() {
    }
    
    public void a(final blq \u2603) {
        \u2603.f().b(\u2603);
        \u2603.e().b(\u2603);
        bqs.e(\u2603.h());
    }
    
    public int c() throws kc {
        final int d = bqs.d();
        if (d <= 0) {
            throw new kc("Could not create shader program (returned program ID " + d + ")");
        }
        return d;
    }
    
    public void b(final blq \u2603) throws IOException {
        \u2603.f().a(\u2603);
        \u2603.e().a(\u2603);
        bqs.f(\u2603.h());
        final int a = bqs.a(\u2603.h(), bqs.m);
        if (a == 0) {
            blu.a.warn("Error encountered when linking program containing VS " + \u2603.e().a() + " and FS " + \u2603.f().a() + ". Log output:");
            blu.a.warn(bqs.e(\u2603.h(), 32768));
        }
    }
    
    static {
        a = LogManager.getLogger();
    }
}
