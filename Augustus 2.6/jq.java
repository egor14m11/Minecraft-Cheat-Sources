import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class jq implements ff<jp>
{
    private long a;
    
    public jq() {
    }
    
    public jq(final long \u2603) {
        this.a = \u2603;
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.readLong();
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.writeLong(this.a);
    }
    
    @Override
    public void a(final jp \u2603) {
        \u2603.a(this);
    }
}
