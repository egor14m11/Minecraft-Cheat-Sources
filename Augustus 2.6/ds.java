import java.util.Arrays;
import java.io.DataInput;
import java.io.IOException;
import java.io.DataOutput;

// 
// Decompiled by Procyon v0.5.36
// 

public class ds extends eb
{
    private int[] b;
    
    ds() {
    }
    
    public ds(final int[] \u2603) {
        this.b = \u2603;
    }
    
    @Override
    void a(final DataOutput \u2603) throws IOException {
        \u2603.writeInt(this.b.length);
        for (int i = 0; i < this.b.length; ++i) {
            \u2603.writeInt(this.b[i]);
        }
    }
    
    @Override
    void a(final DataInput \u2603, final int \u2603, final dw \u2603) throws IOException {
        \u2603.a(192L);
        final int int1 = \u2603.readInt();
        \u2603.a(32 * int1);
        this.b = new int[int1];
        for (int i = 0; i < int1; ++i) {
            this.b[i] = \u2603.readInt();
        }
    }
    
    @Override
    public byte a() {
        return 11;
    }
    
    @Override
    public String toString() {
        String string = "[";
        for (final int j : this.b) {
            string = string + j + ",";
        }
        return string + "]";
    }
    
    @Override
    public eb b() {
        final int[] \u2603 = new int[this.b.length];
        System.arraycopy(this.b, 0, \u2603, 0, this.b.length);
        return new ds(\u2603);
    }
    
    @Override
    public boolean equals(final Object \u2603) {
        return super.equals(\u2603) && Arrays.equals(this.b, ((ds)\u2603).b);
    }
    
    @Override
    public int hashCode() {
        return super.hashCode() ^ Arrays.hashCode(this.b);
    }
    
    public int[] c() {
        return this.b;
    }
}
