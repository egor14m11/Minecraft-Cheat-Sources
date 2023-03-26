import org.lwjgl.opengl.GL11;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.5.36
// 

public class bmt
{
    private int a;
    private final bmu b;
    private int c;
    
    public bmt(final bmu \u2603) {
        this.b = \u2603;
        this.a = bqs.e();
    }
    
    public void a() {
        bqs.g(bqs.R, this.a);
    }
    
    public void a(final ByteBuffer \u2603) {
        this.a();
        bqs.a(bqs.R, \u2603, 35044);
        this.b();
        this.c = \u2603.limit() / this.b.g();
    }
    
    public void a(final int \u2603) {
        GL11.glDrawArrays(\u2603, 0, this.c);
    }
    
    public void b() {
        bqs.g(bqs.R, 0);
    }
    
    public void c() {
        if (this.a >= 0) {
            bqs.g(this.a);
            this.a = -1;
        }
    }
}
