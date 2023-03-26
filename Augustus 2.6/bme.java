import org.apache.logging.log4j.LogManager;
import java.io.IOException;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class bme extends bly
{
    private static final Logger g;
    protected final jy f;
    
    public bme(final jy \u2603) {
        this.f = \u2603;
    }
    
    @Override
    public void a(final bni \u2603) throws IOException {
        this.c();
        InputStream b = null;
        try {
            final bnh a = \u2603.a(this.f);
            b = a.b();
            final BufferedImage a2 = bml.a(b);
            boolean a3 = false;
            boolean b2 = false;
            if (a.c()) {
                try {
                    final bon bon = a.a("texture");
                    if (bon != null) {
                        a3 = bon.a();
                        b2 = bon.b();
                    }
                }
                catch (RuntimeException throwable) {
                    bme.g.warn("Failed reading metadata of: " + this.f, throwable);
                }
            }
            bml.a(this.b(), a2, a3, b2);
        }
        finally {
            if (b != null) {
                b.close();
            }
        }
    }
    
    static {
        g = LogManager.getLogger();
    }
}
