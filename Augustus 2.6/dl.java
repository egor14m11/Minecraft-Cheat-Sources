import java.util.Arrays;
import java.io.DataInput;
import java.io.IOException;
import java.io.DataOutput;

// 
// Decompiled by Procyon v0.5.36
// 

public class dl extends eb
{
    private byte[] b;
    
    dl() {
    }
    
    public dl(final byte[] \u2603) {
        this.b = \u2603;
    }
    
    @Override
    void a(final DataOutput \u2603) throws IOException {
        \u2603.writeInt(this.b.length);
        \u2603.write(this.b);
    }
    
    @Override
    void a(final DataInput \u2603, final int \u2603, final dw \u2603) throws IOException {
        \u2603.a(192L);
        final int int1 = \u2603.readInt();
        \u2603.a(8 * int1);
        \u2603.readFully(this.b = new byte[int1]);
    }
    
    @Override
    public byte a() {
        return 7;
    }
    
    @Override
    public String toString() {
        return "[" + this.b.length + " bytes]";
    }
    
    @Override
    public eb b() {
        final byte[] \u2603 = new byte[this.b.length];
        System.arraycopy(this.b, 0, \u2603, 0, this.b.length);
        return new dl(\u2603);
    }
    
    @Override
    public boolean equals(final Object \u2603) {
        return super.equals(\u2603) && Arrays.equals(this.b, ((dl)\u2603).b);
    }
    
    @Override
    public int hashCode() {
        return super.hashCode() ^ Arrays.hashCode(this.b);
    }
    
    public byte[] c() {
        return this.b;
    }
}
