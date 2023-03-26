import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class ih implements ff<ic>
{
    private String a;
    private int b;
    private wn.b c;
    private boolean d;
    private int e;
    
    public ih() {
    }
    
    public ih(final String \u2603, final int \u2603, final wn.b \u2603, final boolean \u2603, final int \u2603) {
        this.a = \u2603;
        this.b = \u2603;
        this.c = \u2603;
        this.d = \u2603;
        this.e = \u2603;
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.c(7);
        this.b = \u2603.readByte();
        this.c = wn.b.a(\u2603.readByte());
        this.d = \u2603.readBoolean();
        this.e = \u2603.readUnsignedByte();
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.a(this.a);
        \u2603.writeByte(this.b);
        \u2603.writeByte(this.c.a());
        \u2603.writeBoolean(this.d);
        \u2603.writeByte(this.e);
    }
    
    @Override
    public void a(final ic \u2603) {
        \u2603.a(this);
    }
    
    public String a() {
        return this.a;
    }
    
    public wn.b c() {
        return this.c;
    }
    
    public boolean d() {
        return this.d;
    }
    
    public int e() {
        return this.e;
    }
}
