import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class il implements ff<ic>
{
    private int a;
    
    public il() {
    }
    
    public il(final int \u2603) {
        this.a = \u2603;
    }
    
    @Override
    public void a(final ic \u2603) {
        \u2603.a(this);
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.readByte();
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.writeByte(this.a);
    }
}
