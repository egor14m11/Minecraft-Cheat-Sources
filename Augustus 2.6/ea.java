import java.io.DataInput;
import java.io.IOException;
import java.io.DataOutput;

// 
// Decompiled by Procyon v0.5.36
// 

public class ea extends eb
{
    private String b;
    
    public ea() {
        this.b = "";
    }
    
    public ea(final String \u2603) {
        this.b = \u2603;
        if (\u2603 == null) {
            throw new IllegalArgumentException("Empty string not allowed");
        }
    }
    
    @Override
    void a(final DataOutput \u2603) throws IOException {
        \u2603.writeUTF(this.b);
    }
    
    @Override
    void a(final DataInput \u2603, final int \u2603, final dw \u2603) throws IOException {
        \u2603.a(288L);
        this.b = \u2603.readUTF();
        \u2603.a(16 * this.b.length());
    }
    
    @Override
    public byte a() {
        return 8;
    }
    
    @Override
    public String toString() {
        return "\"" + this.b.replace("\"", "\\\"") + "\"";
    }
    
    @Override
    public eb b() {
        return new ea(this.b);
    }
    
    @Override
    public boolean c_() {
        return this.b.isEmpty();
    }
    
    @Override
    public boolean equals(final Object \u2603) {
        if (super.equals(\u2603)) {
            final ea ea = (ea)\u2603;
            return (this.b == null && ea.b == null) || (this.b != null && this.b.equals(ea.b));
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return super.hashCode() ^ this.b.hashCode();
    }
    
    public String a_() {
        return this.b;
    }
}
