import java.io.IOException;
import java.util.Collection;

// 
// Decompiled by Procyon v0.5.36
// 

public class gu implements ff<fj>
{
    private int a;
    private byte b;
    private atf[] c;
    private int d;
    private int e;
    private int f;
    private int g;
    private byte[] h;
    
    public gu() {
    }
    
    public gu(final int \u2603, final byte \u2603, final Collection<atf> \u2603, final byte[] \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        this.a = \u2603;
        this.b = \u2603;
        this.c = \u2603.toArray(new atf[\u2603.size()]);
        this.d = \u2603;
        this.e = \u2603;
        this.f = \u2603;
        this.g = \u2603;
        this.h = new byte[\u2603 * \u2603];
        for (int i = 0; i < \u2603; ++i) {
            for (int j = 0; j < \u2603; ++j) {
                this.h[i + j * \u2603] = \u2603[\u2603 + i + (\u2603 + j) * 128];
            }
        }
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.e();
        this.b = \u2603.readByte();
        this.c = new atf[\u2603.e()];
        for (int i = 0; i < this.c.length; ++i) {
            final short n = \u2603.readByte();
            this.c[i] = new atf((byte)(n >> 4 & 0xF), \u2603.readByte(), \u2603.readByte(), (byte)(n & 0xF));
        }
        this.f = \u2603.readUnsignedByte();
        if (this.f > 0) {
            this.g = \u2603.readUnsignedByte();
            this.d = \u2603.readUnsignedByte();
            this.e = \u2603.readUnsignedByte();
            this.h = \u2603.a();
        }
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.b(this.a);
        \u2603.writeByte(this.b);
        \u2603.b(this.c.length);
        for (final atf atf : this.c) {
            \u2603.writeByte((atf.a() & 0xF) << 4 | (atf.d() & 0xF));
            \u2603.writeByte(atf.b());
            \u2603.writeByte(atf.c());
        }
        \u2603.writeByte(this.f);
        if (this.f > 0) {
            \u2603.writeByte(this.g);
            \u2603.writeByte(this.d);
            \u2603.writeByte(this.e);
            \u2603.a(this.h);
        }
    }
    
    @Override
    public void a(final fj \u2603) {
        \u2603.a(this);
    }
    
    public int a() {
        return this.a;
    }
    
    public void a(final atg \u2603) {
        \u2603.e = this.b;
        \u2603.h.clear();
        for (int i = 0; i < this.c.length; ++i) {
            final atf atf = this.c[i];
            \u2603.h.put("icon-" + i, atf);
        }
        for (int i = 0; i < this.f; ++i) {
            for (int j = 0; j < this.g; ++j) {
                \u2603.f[this.d + i + (this.e + j) * 128] = this.h[i + j * this.f];
            }
        }
    }
}
