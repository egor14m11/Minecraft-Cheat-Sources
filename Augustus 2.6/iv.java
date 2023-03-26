import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class iv implements ff<ic>
{
    private int a;
    
    public iv() {
    }
    
    public iv(final int \u2603) {
        this.a = \u2603;
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.readShort();
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.writeShort(this.a);
    }
    
    @Override
    public void a(final ic \u2603) {
        \u2603.a(this);
    }
    
    public int a() {
        return this.a;
    }
}
