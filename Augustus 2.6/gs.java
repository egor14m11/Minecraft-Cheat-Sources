import java.io.IOException;
import org.apache.commons.lang3.Validate;

// 
// Decompiled by Procyon v0.5.36
// 

public class gs implements ff<fj>
{
    private String a;
    private int b;
    private int c;
    private int d;
    private float e;
    private int f;
    
    public gs() {
        this.c = Integer.MAX_VALUE;
    }
    
    public gs(final String \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603, float \u2603) {
        this.c = Integer.MAX_VALUE;
        Validate.notNull(\u2603, "name", new Object[0]);
        this.a = \u2603;
        this.b = (int)(\u2603 * 8.0);
        this.c = (int)(\u2603 * 8.0);
        this.d = (int)(\u2603 * 8.0);
        this.e = \u2603;
        this.f = (int)(\u2603 * 63.0f);
        \u2603 = ns.a(\u2603, 0.0f, 255.0f);
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.c(256);
        this.b = \u2603.readInt();
        this.c = \u2603.readInt();
        this.d = \u2603.readInt();
        this.e = \u2603.readFloat();
        this.f = \u2603.readUnsignedByte();
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.a(this.a);
        \u2603.writeInt(this.b);
        \u2603.writeInt(this.c);
        \u2603.writeInt(this.d);
        \u2603.writeFloat(this.e);
        \u2603.writeByte(this.f);
    }
    
    public String a() {
        return this.a;
    }
    
    public double b() {
        return this.b / 8.0f;
    }
    
    public double c() {
        return this.c / 8.0f;
    }
    
    public double d() {
        return this.d / 8.0f;
    }
    
    public float e() {
        return this.e;
    }
    
    public float f() {
        return this.f / 63.0f;
    }
    
    @Override
    public void a(final fj \u2603) {
        \u2603.a(this);
    }
}
