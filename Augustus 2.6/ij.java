import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class ij implements ff<ic>
{
    private int a;
    private int b;
    
    public ij() {
    }
    
    public ij(final int \u2603, final int \u2603) {
        this.a = \u2603;
        this.b = \u2603;
    }
    
    @Override
    public void a(final ic \u2603) {
        \u2603.a(this);
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.readByte();
        this.b = \u2603.readByte();
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.writeByte(this.a);
        \u2603.writeByte(this.b);
    }
    
    public int a() {
        return this.a;
    }
    
    public int b() {
        return this.b;
    }
}
