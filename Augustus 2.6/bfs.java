import java.awt.Graphics;
import java.awt.image.DataBufferInt;
import java.awt.image.ImageObserver;
import java.awt.Image;
import java.awt.image.BufferedImage;

// 
// Decompiled by Procyon v0.5.36
// 

public class bfs implements bfm
{
    private int[] a;
    private int b;
    private int c;
    
    @Override
    public BufferedImage a(final BufferedImage \u2603) {
        if (\u2603 == null) {
            return null;
        }
        this.b = 64;
        this.c = 64;
        final BufferedImage bufferedImage = new BufferedImage(this.b, this.c, 2);
        final Graphics graphics = bufferedImage.getGraphics();
        graphics.drawImage(\u2603, 0, 0, null);
        if (\u2603.getHeight() == 32) {
            graphics.drawImage(bufferedImage, 24, 48, 20, 52, 4, 16, 8, 20, null);
            graphics.drawImage(bufferedImage, 28, 48, 24, 52, 8, 16, 12, 20, null);
            graphics.drawImage(bufferedImage, 20, 52, 16, 64, 8, 20, 12, 32, null);
            graphics.drawImage(bufferedImage, 24, 52, 20, 64, 4, 20, 8, 32, null);
            graphics.drawImage(bufferedImage, 28, 52, 24, 64, 0, 20, 4, 32, null);
            graphics.drawImage(bufferedImage, 32, 52, 28, 64, 12, 20, 16, 32, null);
            graphics.drawImage(bufferedImage, 40, 48, 36, 52, 44, 16, 48, 20, null);
            graphics.drawImage(bufferedImage, 44, 48, 40, 52, 48, 16, 52, 20, null);
            graphics.drawImage(bufferedImage, 36, 52, 32, 64, 48, 20, 52, 32, null);
            graphics.drawImage(bufferedImage, 40, 52, 36, 64, 44, 20, 48, 32, null);
            graphics.drawImage(bufferedImage, 44, 52, 40, 64, 40, 20, 44, 32, null);
            graphics.drawImage(bufferedImage, 48, 52, 44, 64, 52, 20, 56, 32, null);
        }
        graphics.dispose();
        this.a = ((DataBufferInt)bufferedImage.getRaster().getDataBuffer()).getData();
        this.b(0, 0, 32, 16);
        this.a(32, 0, 64, 32);
        this.b(0, 16, 64, 32);
        this.a(0, 32, 16, 48);
        this.a(16, 32, 40, 48);
        this.a(40, 32, 56, 48);
        this.a(0, 48, 16, 64);
        this.b(16, 48, 48, 64);
        this.a(48, 48, 64, 64);
        return bufferedImage;
    }
    
    @Override
    public void a() {
    }
    
    private void a(final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        if (this.c(\u2603, \u2603, \u2603, \u2603)) {
            return;
        }
        for (int i = \u2603; i < \u2603; ++i) {
            for (int j = \u2603; j < \u2603; ++j) {
                final int[] a = this.a;
                final int n = i + j * this.b;
                a[n] &= 0xFFFFFF;
            }
        }
    }
    
    private void b(final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        for (int i = \u2603; i < \u2603; ++i) {
            for (int j = \u2603; j < \u2603; ++j) {
                final int[] a = this.a;
                final int n = i + j * this.b;
                a[n] |= 0xFF000000;
            }
        }
    }
    
    private boolean c(final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        for (int i = \u2603; i < \u2603; ++i) {
            for (int j = \u2603; j < \u2603; ++j) {
                final int n = this.a[i + j * this.b];
                if ((n >> 24 & 0xFF) < 128) {
                    return true;
                }
            }
        }
        return false;
    }
}
