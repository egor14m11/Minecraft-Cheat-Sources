import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class he implements ff<fj>
{
    private int a;
    private oj b;
    private adp.a c;
    private adr d;
    
    public he() {
    }
    
    public he(final int \u2603, final oj \u2603, final adr \u2603, final adp.a \u2603) {
        this.a = \u2603;
        this.b = \u2603;
        this.c = \u2603;
        this.d = \u2603;
    }
    
    @Override
    public void a(final fj \u2603) {
        \u2603.a(this);
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.readInt();
        this.b = oj.a(\u2603.readUnsignedByte());
        this.c = adp.a.a(\u2603.readUnsignedByte());
        this.d = adr.a(\u2603.c(16));
        if (this.d == null) {
            this.d = adr.b;
        }
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.writeInt(this.a);
        \u2603.writeByte(this.b.a());
        \u2603.writeByte(this.c.a());
        \u2603.a(this.d.a());
    }
    
    public int a() {
        return this.a;
    }
    
    public oj b() {
        return this.b;
    }
    
    public adp.a c() {
        return this.c;
    }
    
    public adr d() {
        return this.d;
    }
}
