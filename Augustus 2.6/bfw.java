import org.lwjgl.opengl.GL11;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.5.36
// 

public class bfw
{
    public int a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public float[] i;
    public int j;
    
    public bfw(final int \u2603, final int \u2603, final boolean \u2603) {
        this.e = \u2603;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        (this.i = new float[4])[0] = 1.0f;
        this.i[1] = 1.0f;
        this.i[2] = 1.0f;
        this.i[3] = 0.0f;
        this.a(\u2603, \u2603);
    }
    
    public void a(final int \u2603, final int \u2603) {
        if (!bqs.i()) {
            this.c = \u2603;
            this.d = \u2603;
            return;
        }
        bfl.j();
        if (this.f >= 0) {
            this.a();
        }
        this.b(\u2603, \u2603);
        this.b();
        bqs.h(bqs.c, 0);
    }
    
    public void a() {
        if (!bqs.i()) {
            return;
        }
        this.d();
        this.e();
        if (this.h > -1) {
            bqs.h(this.h);
            this.h = -1;
        }
        if (this.g > -1) {
            bml.a(this.g);
            this.g = -1;
        }
        if (this.f > -1) {
            bqs.h(bqs.c, 0);
            bqs.i(this.f);
            this.f = -1;
        }
    }
    
    public void b(final int \u2603, final int \u2603) {
        this.c = \u2603;
        this.d = \u2603;
        this.a = \u2603;
        this.b = \u2603;
        if (!bqs.i()) {
            this.f();
            return;
        }
        this.f = bqs.g();
        this.g = bml.a();
        if (this.e) {
            this.h = bqs.h();
        }
        this.a(9728);
        bfl.i(this.g);
        GL11.glTexImage2D(3553, 0, 32856, this.a, this.b, 0, 6408, 5121, (ByteBuffer)null);
        bqs.h(bqs.c, this.f);
        bqs.a(bqs.c, bqs.e, 3553, this.g, 0);
        if (this.e) {
            bqs.i(bqs.d, this.h);
            bqs.a(bqs.d, 33190, this.a, this.b);
            bqs.b(bqs.c, bqs.f, bqs.d, this.h);
        }
        this.f();
        this.d();
    }
    
    public void a(final int \u2603) {
        if (bqs.i()) {
            this.j = \u2603;
            bfl.i(this.g);
            GL11.glTexParameterf(3553, 10241, (float)\u2603);
            GL11.glTexParameterf(3553, 10240, (float)\u2603);
            GL11.glTexParameterf(3553, 10242, 10496.0f);
            GL11.glTexParameterf(3553, 10243, 10496.0f);
            bfl.i(0);
        }
    }
    
    public void b() {
        final int j = bqs.j(bqs.c);
        if (j == bqs.g) {
            return;
        }
        if (j == bqs.h) {
            throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT");
        }
        if (j == bqs.i) {
            throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT");
        }
        if (j == bqs.j) {
            throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER");
        }
        if (j == bqs.k) {
            throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER");
        }
        throw new RuntimeException("glCheckFramebufferStatus returned unknown status:" + j);
    }
    
    public void c() {
        if (bqs.i()) {
            bfl.i(this.g);
        }
    }
    
    public void d() {
        if (bqs.i()) {
            bfl.i(0);
        }
    }
    
    public void a(final boolean \u2603) {
        if (bqs.i()) {
            bqs.h(bqs.c, this.f);
            if (\u2603) {
                bfl.b(0, 0, this.c, this.d);
            }
        }
    }
    
    public void e() {
        if (bqs.i()) {
            bqs.h(bqs.c, 0);
        }
    }
    
    public void a(final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        this.i[0] = \u2603;
        this.i[1] = \u2603;
        this.i[2] = \u2603;
        this.i[3] = \u2603;
    }
    
    public void c(final int \u2603, final int \u2603) {
        this.a(\u2603, \u2603, true);
    }
    
    public void a(final int \u2603, final int \u2603, final boolean \u2603) {
        if (!bqs.i()) {
            return;
        }
        bfl.a(true, true, true, false);
        bfl.i();
        bfl.a(false);
        bfl.n(5889);
        bfl.D();
        bfl.a(0.0, \u2603, \u2603, 0.0, 1000.0, 3000.0);
        bfl.n(5888);
        bfl.D();
        bfl.b(0.0f, 0.0f, -2000.0f);
        bfl.b(0, 0, \u2603, \u2603);
        bfl.w();
        bfl.f();
        bfl.c();
        if (\u2603) {
            bfl.k();
            bfl.g();
        }
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.c();
        final float n = (float)\u2603;
        final float n2 = (float)\u2603;
        final float n3 = this.c / (float)this.a;
        final float n4 = this.d / (float)this.b;
        final bfx a = bfx.a();
        final bfd c = a.c();
        c.a(7, bms.i);
        c.b(0.0, n2, 0.0).a(0.0, 0.0).b(255, 255, 255, 255).d();
        c.b(n, n2, 0.0).a(n3, 0.0).b(255, 255, 255, 255).d();
        c.b(n, 0.0, 0.0).a(n3, n4).b(255, 255, 255, 255).d();
        c.b(0.0, 0.0, 0.0).a(0.0, n4).b(255, 255, 255, 255).d();
        a.b();
        this.d();
        bfl.a(true);
        bfl.a(true, true, true, true);
    }
    
    public void f() {
        this.a(true);
        bfl.a(this.i[0], this.i[1], this.i[2], this.i[3]);
        int \u2603 = 16384;
        if (this.e) {
            bfl.a(1.0);
            \u2603 |= 0x100;
        }
        bfl.m(\u2603);
        this.e();
    }
}
