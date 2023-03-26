import org.apache.logging.log4j.LogManager;
import java.io.InputStream;
import java.awt.Graphics;
import java.io.IOException;
import java.awt.image.ImageObserver;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.List;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class bmc extends bly
{
    private static final Logger f;
    private final jy g;
    private final List<String> h;
    private final List<zd> i;
    
    public bmc(final jy \u2603, final List<String> \u2603, final List<zd> \u2603) {
        this.g = \u2603;
        this.h = \u2603;
        this.i = \u2603;
    }
    
    @Override
    public void a(final bni \u2603) throws IOException {
        this.c();
        BufferedImage \u26032;
        try {
            final BufferedImage a = bml.a(\u2603.a(this.g).b());
            int type = a.getType();
            if (type == 0) {
                type = 6;
            }
            \u26032 = new BufferedImage(a.getWidth(), a.getHeight(), type);
            final Graphics graphics = \u26032.getGraphics();
            graphics.drawImage(a, 0, 0, null);
            for (int n = 0; n < 17 && n < this.h.size() && n < this.i.size(); ++n) {
                final String \u26033 = this.h.get(n);
                final arn e = this.i.get(n).e();
                if (\u26033 != null) {
                    final InputStream b = \u2603.a(new jy(\u26033)).b();
                    final BufferedImage a2 = bml.a(b);
                    if (a2.getWidth() == \u26032.getWidth() && a2.getHeight() == \u26032.getHeight()) {
                        if (a2.getType() == 6) {
                            for (int i = 0; i < a2.getHeight(); ++i) {
                                for (int j = 0; j < a2.getWidth(); ++j) {
                                    final int rgb = a2.getRGB(j, i);
                                    if ((rgb & 0xFF000000) != 0x0) {
                                        final int n2 = (rgb & 0xFF0000) << 8 & 0xFF000000;
                                        final int rgb2 = a.getRGB(j, i);
                                        final int n3 = ns.d(rgb2, e.L) & 0xFFFFFF;
                                        a2.setRGB(j, i, n2 | n3);
                                    }
                                }
                            }
                            \u26032.getGraphics().drawImage(a2, 0, 0, null);
                        }
                    }
                }
            }
        }
        catch (IOException throwable) {
            bmc.f.error("Couldn't load layered image", throwable);
            return;
        }
        bml.a(this.b(), \u26032);
    }
    
    static {
        f = LogManager.getLogger();
    }
}
