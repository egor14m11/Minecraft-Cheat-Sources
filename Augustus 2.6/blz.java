import java.io.IOException;
import java.awt.image.BufferedImage;

// 
// Decompiled by Procyon v0.5.36
// 

public class blz extends bly
{
    private final int[] f;
    private final int g;
    private final int h;
    
    public blz(final BufferedImage \u2603) {
        this(\u2603.getWidth(), \u2603.getHeight());
        \u2603.getRGB(0, 0, \u2603.getWidth(), \u2603.getHeight(), this.f, 0, \u2603.getWidth());
        this.d();
    }
    
    public blz(final int \u2603, final int \u2603) {
        this.g = \u2603;
        this.h = \u2603;
        this.f = new int[\u2603 * \u2603];
        bml.a(this.b(), \u2603, \u2603);
    }
    
    @Override
    public void a(final bni \u2603) throws IOException {
    }
    
    public void d() {
        bml.a(this.b(), this.f, this.g, this.h);
    }
    
    public int[] e() {
        return this.f;
    }
}
