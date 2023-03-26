import org.apache.logging.log4j.LogManager;
import org.apache.commons.io.FileUtils;
import java.net.URL;
import java.net.HttpURLConnection;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class bma extends bme
{
    private static final Logger g;
    private static final AtomicInteger h;
    private final File i;
    private final String j;
    private final bfm k;
    private BufferedImage l;
    private Thread m;
    private boolean n;
    
    public bma(final File \u2603, final String \u2603, final jy \u2603, final bfm \u2603) {
        super(\u2603);
        this.i = \u2603;
        this.j = \u2603;
        this.k = \u2603;
    }
    
    private void g() {
        if (this.n) {
            return;
        }
        if (this.l != null) {
            if (this.f != null) {
                this.c();
            }
            bml.a(super.b(), this.l);
            this.n = true;
        }
    }
    
    @Override
    public int b() {
        this.g();
        return super.b();
    }
    
    public void a(final BufferedImage \u2603) {
        this.l = \u2603;
        if (this.k != null) {
            this.k.a();
        }
    }
    
    @Override
    public void a(final bni \u2603) throws IOException {
        if (this.l == null && this.f != null) {
            super.a(\u2603);
        }
        if (this.m == null) {
            if (this.i != null && this.i.isFile()) {
                bma.g.debug("Loading http texture from local cache ({})", new Object[] { this.i });
                try {
                    this.l = ImageIO.read(this.i);
                    if (this.k != null) {
                        this.a(this.k.a(this.l));
                    }
                }
                catch (IOException throwable) {
                    bma.g.error("Couldn't load skin " + this.i, throwable);
                    this.d();
                }
            }
            else {
                this.d();
            }
        }
    }
    
    protected void d() {
        (this.m = new Thread("Texture Downloader #" + bma.h.incrementAndGet()) {
            @Override
            public void run() {
                HttpURLConnection httpURLConnection = null;
                bma.g.debug("Downloading http texture from {} to {}", new Object[] { bma.this.j, bma.this.i });
                try {
                    httpURLConnection = (HttpURLConnection)new URL(bma.this.j).openConnection(ave.A().O());
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setDoOutput(false);
                    httpURLConnection.connect();
                    if (httpURLConnection.getResponseCode() / 100 != 2) {
                        return;
                    }
                    BufferedImage \u2603;
                    if (bma.this.i != null) {
                        FileUtils.copyInputStreamToFile(httpURLConnection.getInputStream(), bma.this.i);
                        \u2603 = ImageIO.read(bma.this.i);
                    }
                    else {
                        \u2603 = bml.a(httpURLConnection.getInputStream());
                    }
                    if (bma.this.k != null) {
                        \u2603 = bma.this.k.a(\u2603);
                    }
                    bma.this.a(\u2603);
                }
                catch (Exception throwable) {
                    bma.g.error("Couldn't download http texture", throwable);
                }
                finally {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                }
            }
        }).setDaemon(true);
        this.m.start();
    }
    
    static {
        g = LogManager.getLogger();
        h = new AtomicInteger(0);
    }
}
