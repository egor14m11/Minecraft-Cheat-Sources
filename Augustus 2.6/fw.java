import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class fw implements ff<fj>
{
    private oj a;
    private boolean b;
    
    public fw() {
    }
    
    public fw(final oj \u2603, final boolean \u2603) {
        this.a = \u2603;
        this.b = \u2603;
    }
    
    @Override
    public void a(final fj \u2603) {
        \u2603.a(this);
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = oj.a(\u2603.readUnsignedByte());
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.writeByte(this.a.a());
    }
    
    public boolean a() {
        return this.b;
    }
    
    public oj b() {
        return this.a;
    }
}
