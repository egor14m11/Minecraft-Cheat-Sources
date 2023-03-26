import org.apache.logging.log4j.LogManager;
import java.util.Iterator;
import java.io.DataInput;
import java.io.IOException;
import java.io.DataOutput;
import com.google.common.collect.Lists;
import java.util.List;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class du extends eb
{
    private static final Logger b;
    private List<eb> c;
    private byte d;
    
    public du() {
        this.c = (List<eb>)Lists.newArrayList();
        this.d = 0;
    }
    
    @Override
    void a(final DataOutput \u2603) throws IOException {
        if (!this.c.isEmpty()) {
            this.d = this.c.get(0).a();
        }
        else {
            this.d = 0;
        }
        \u2603.writeByte(this.d);
        \u2603.writeInt(this.c.size());
        for (int i = 0; i < this.c.size(); ++i) {
            this.c.get(i).a(\u2603);
        }
    }
    
    @Override
    void a(final DataInput \u2603, final int \u2603, final dw \u2603) throws IOException {
        \u2603.a(296L);
        if (\u2603 > 512) {
            throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
        }
        this.d = \u2603.readByte();
        final int int1 = \u2603.readInt();
        if (this.d == 0 && int1 > 0) {
            throw new RuntimeException("Missing type on ListTag");
        }
        \u2603.a(32L * int1);
        this.c = (List<eb>)Lists.newArrayListWithCapacity(int1);
        for (int i = 0; i < int1; ++i) {
            final eb a = eb.a(this.d);
            a.a(\u2603, \u2603 + 1, \u2603);
            this.c.add(a);
        }
    }
    
    @Override
    public byte a() {
        return 9;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < this.c.size(); ++i) {
            if (i != 0) {
                sb.append(',');
            }
            sb.append(i).append(':').append(this.c.get(i));
        }
        return sb.append(']').toString();
    }
    
    public void a(final eb \u2603) {
        if (\u2603.a() == 0) {
            du.b.warn("Invalid TagEnd added to ListTag");
            return;
        }
        if (this.d == 0) {
            this.d = \u2603.a();
        }
        else if (this.d != \u2603.a()) {
            du.b.warn("Adding mismatching tag types to tag list");
            return;
        }
        this.c.add(\u2603);
    }
    
    public void a(final int \u2603, final eb \u2603) {
        if (\u2603.a() == 0) {
            du.b.warn("Invalid TagEnd added to ListTag");
            return;
        }
        if (\u2603 < 0 || \u2603 >= this.c.size()) {
            du.b.warn("index out of bounds to set tag in tag list");
            return;
        }
        if (this.d == 0) {
            this.d = \u2603.a();
        }
        else if (this.d != \u2603.a()) {
            du.b.warn("Adding mismatching tag types to tag list");
            return;
        }
        this.c.set(\u2603, \u2603);
    }
    
    public eb a(final int \u2603) {
        return this.c.remove(\u2603);
    }
    
    @Override
    public boolean c_() {
        return this.c.isEmpty();
    }
    
    public dn b(final int \u2603) {
        if (\u2603 < 0 || \u2603 >= this.c.size()) {
            return new dn();
        }
        final eb eb = this.c.get(\u2603);
        if (eb.a() == 10) {
            return (dn)eb;
        }
        return new dn();
    }
    
    public int[] c(final int \u2603) {
        if (\u2603 < 0 || \u2603 >= this.c.size()) {
            return new int[0];
        }
        final eb eb = this.c.get(\u2603);
        if (eb.a() == 11) {
            return ((ds)eb).c();
        }
        return new int[0];
    }
    
    public double d(final int \u2603) {
        if (\u2603 < 0 || \u2603 >= this.c.size()) {
            return 0.0;
        }
        final eb eb = this.c.get(\u2603);
        if (eb.a() == 6) {
            return ((dp)eb).g();
        }
        return 0.0;
    }
    
    public float e(final int \u2603) {
        if (\u2603 < 0 || \u2603 >= this.c.size()) {
            return 0.0f;
        }
        final eb eb = this.c.get(\u2603);
        if (eb.a() == 5) {
            return ((dr)eb).h();
        }
        return 0.0f;
    }
    
    public String f(final int \u2603) {
        if (\u2603 < 0 || \u2603 >= this.c.size()) {
            return "";
        }
        final eb eb = this.c.get(\u2603);
        if (eb.a() == 8) {
            return eb.a_();
        }
        return eb.toString();
    }
    
    public eb g(final int \u2603) {
        if (\u2603 < 0 || \u2603 >= this.c.size()) {
            return new dq();
        }
        return this.c.get(\u2603);
    }
    
    public int c() {
        return this.c.size();
    }
    
    @Override
    public eb b() {
        final du du = new du();
        du.d = this.d;
        for (final eb eb : this.c) {
            final eb b = eb.b();
            du.c.add(b);
        }
        return du;
    }
    
    @Override
    public boolean equals(final Object \u2603) {
        if (super.equals(\u2603)) {
            final du du = (du)\u2603;
            if (this.d == du.d) {
                return this.c.equals(du.c);
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return super.hashCode() ^ this.c.hashCode();
    }
    
    public int f() {
        return this.d;
    }
    
    static {
        b = LogManager.getLogger();
    }
}
