import org.apache.logging.log4j.LogManager;
import java.io.InputStream;
import java.util.Iterator;
import java.io.IOException;
import java.awt.image.ImageObserver;
import java.awt.Image;
import java.awt.image.BufferedImage;
import com.google.common.collect.Lists;
import java.util.List;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class bmd extends bly
{
    private static final Logger g;
    public final List<String> f;
    
    public bmd(final String... \u2603) {
        this.f = Lists.newArrayList(\u2603);
    }
    
    @Override
    public void a(final bni \u2603) throws IOException {
        this.c();
        BufferedImage \u26032 = null;
        try {
            for (final String \u26033 : this.f) {
                if (\u26033 == null) {
                    continue;
                }
                final InputStream b = \u2603.a(new jy(\u26033)).b();
                final BufferedImage a = bml.a(b);
                if (\u26032 == null) {
                    \u26032 = new BufferedImage(a.getWidth(), a.getHeight(), 2);
                }
                \u26032.getGraphics().drawImage(a, 0, 0, null);
            }
        }
        catch (IOException throwable) {
            bmd.g.error("Couldn't load layered image", throwable);
            return;
        }
        bml.a(this.b(), \u26032);
    }
    
    static {
        g = LogManager.getLogger();
    }
}
