import java.util.concurrent.Callable;
import java.util.Set;
import java.io.DataInput;
import java.io.IOException;
import java.util.Iterator;
import java.io.DataOutput;
import com.google.common.collect.Maps;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public class dn extends eb
{
    private Map<String, eb> b;
    
    public dn() {
        this.b = (Map<String, eb>)Maps.newHashMap();
    }
    
    @Override
    void a(final DataOutput \u2603) throws IOException {
        for (final String \u26032 : this.b.keySet()) {
            final eb \u26033 = this.b.get(\u26032);
            a(\u26032, \u26033, \u2603);
        }
        \u2603.writeByte(0);
    }
    
    @Override
    void a(final DataInput \u2603, final int \u2603, final dw \u2603) throws IOException {
        \u2603.a(384L);
        if (\u2603 > 512) {
            throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
        }
        this.b.clear();
        byte a;
        while ((a = a(\u2603, \u2603)) != 0) {
            final String b = b(\u2603, \u2603);
            \u2603.a(224 + 16 * b.length());
            final eb a2 = a(a, b, \u2603, \u2603 + 1, \u2603);
            if (this.b.put(b, a2) != null) {
                \u2603.a(288L);
            }
        }
    }
    
    public Set<String> c() {
        return this.b.keySet();
    }
    
    @Override
    public byte a() {
        return 10;
    }
    
    public void a(final String \u2603, final eb \u2603) {
        this.b.put(\u2603, \u2603);
    }
    
    public void a(final String \u2603, final byte \u2603) {
        this.b.put(\u2603, new dm(\u2603));
    }
    
    public void a(final String \u2603, final short \u2603) {
        this.b.put(\u2603, new dz(\u2603));
    }
    
    public void a(final String \u2603, final int \u2603) {
        this.b.put(\u2603, new dt(\u2603));
    }
    
    public void a(final String \u2603, final long \u2603) {
        this.b.put(\u2603, new dv(\u2603));
    }
    
    public void a(final String \u2603, final float \u2603) {
        this.b.put(\u2603, new dr(\u2603));
    }
    
    public void a(final String \u2603, final double \u2603) {
        this.b.put(\u2603, new dp(\u2603));
    }
    
    public void a(final String \u2603, final String \u2603) {
        this.b.put(\u2603, new ea(\u2603));
    }
    
    public void a(final String \u2603, final byte[] \u2603) {
        this.b.put(\u2603, new dl(\u2603));
    }
    
    public void a(final String \u2603, final int[] \u2603) {
        this.b.put(\u2603, new ds(\u2603));
    }
    
    public void a(final String \u2603, final boolean \u2603) {
        this.a(\u2603, (byte)(\u2603 ? 1 : 0));
    }
    
    public eb a(final String \u2603) {
        return this.b.get(\u2603);
    }
    
    public byte b(final String \u2603) {
        final eb eb = this.b.get(\u2603);
        if (eb != null) {
            return eb.a();
        }
        return 0;
    }
    
    public boolean c(final String \u2603) {
        return this.b.containsKey(\u2603);
    }
    
    public boolean b(final String \u2603, final int \u2603) {
        final int b = this.b(\u2603);
        if (b == \u2603) {
            return true;
        }
        if (\u2603 == 99) {
            return b == 1 || b == 2 || b == 3 || b == 4 || b == 5 || b == 6;
        }
        if (b > 0) {}
        return false;
    }
    
    public byte d(final String \u2603) {
        try {
            if (!this.b(\u2603, 99)) {
                return 0;
            }
            return this.b.get(\u2603).f();
        }
        catch (ClassCastException ex) {
            return 0;
        }
    }
    
    public short e(final String \u2603) {
        try {
            if (!this.b(\u2603, 99)) {
                return 0;
            }
            return this.b.get(\u2603).e();
        }
        catch (ClassCastException ex) {
            return 0;
        }
    }
    
    public int f(final String \u2603) {
        try {
            if (!this.b(\u2603, 99)) {
                return 0;
            }
            return this.b.get(\u2603).d();
        }
        catch (ClassCastException ex) {
            return 0;
        }
    }
    
    public long g(final String \u2603) {
        try {
            if (!this.b(\u2603, 99)) {
                return 0L;
            }
            return this.b.get(\u2603).c();
        }
        catch (ClassCastException ex) {
            return 0L;
        }
    }
    
    public float h(final String \u2603) {
        try {
            if (!this.b(\u2603, 99)) {
                return 0.0f;
            }
            return this.b.get(\u2603).h();
        }
        catch (ClassCastException ex) {
            return 0.0f;
        }
    }
    
    public double i(final String \u2603) {
        try {
            if (!this.b(\u2603, 99)) {
                return 0.0;
            }
            return this.b.get(\u2603).g();
        }
        catch (ClassCastException ex) {
            return 0.0;
        }
    }
    
    public String j(final String \u2603) {
        try {
            if (!this.b(\u2603, 8)) {
                return "";
            }
            return this.b.get(\u2603).a_();
        }
        catch (ClassCastException ex) {
            return "";
        }
    }
    
    public byte[] k(final String \u2603) {
        try {
            if (!this.b(\u2603, 7)) {
                return new byte[0];
            }
            return this.b.get(\u2603).c();
        }
        catch (ClassCastException \u26032) {
            throw new e(this.a(\u2603, 7, \u26032));
        }
    }
    
    public int[] l(final String \u2603) {
        try {
            if (!this.b(\u2603, 11)) {
                return new int[0];
            }
            return this.b.get(\u2603).c();
        }
        catch (ClassCastException \u26032) {
            throw new e(this.a(\u2603, 11, \u26032));
        }
    }
    
    public dn m(final String \u2603) {
        try {
            if (!this.b(\u2603, 10)) {
                return new dn();
            }
            return this.b.get(\u2603);
        }
        catch (ClassCastException \u26032) {
            throw new e(this.a(\u2603, 10, \u26032));
        }
    }
    
    public du c(final String \u2603, final int \u2603) {
        try {
            if (this.b(\u2603) != 9) {
                return new du();
            }
            final du du = this.b.get(\u2603);
            if (du.c() > 0 && du.f() != \u2603) {
                return new du();
            }
            return du;
        }
        catch (ClassCastException \u26032) {
            throw new e(this.a(\u2603, 9, \u26032));
        }
    }
    
    public boolean n(final String \u2603) {
        return this.d(\u2603) != 0;
    }
    
    public void o(final String \u2603) {
        this.b.remove(\u2603);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        for (final Map.Entry<String, eb> entry : this.b.entrySet()) {
            if (sb.length() != 1) {
                sb.append(',');
            }
            sb.append(entry.getKey()).append(':').append(entry.getValue());
        }
        return sb.append('}').toString();
    }
    
    @Override
    public boolean c_() {
        return this.b.isEmpty();
    }
    
    private b a(final String \u2603, final int \u2603, final ClassCastException \u2603) {
        final b a = b.a(\u2603, "Reading NBT data");
        final c a2 = a.a("Corrupt NBT tag", 1);
        a2.a("Tag type found", new Callable<String>() {
            public String a() throws Exception {
                return eb.a[dn.this.b.get(\u2603).a()];
            }
        });
        a2.a("Tag type expected", new Callable<String>() {
            public String a() throws Exception {
                return eb.a[\u2603];
            }
        });
        a2.a("Tag name", \u2603);
        return a;
    }
    
    @Override
    public eb b() {
        final dn dn = new dn();
        for (final String \u2603 : this.b.keySet()) {
            dn.a(\u2603, this.b.get(\u2603).b());
        }
        return dn;
    }
    
    @Override
    public boolean equals(final Object \u2603) {
        if (super.equals(\u2603)) {
            final dn dn = (dn)\u2603;
            return this.b.entrySet().equals(dn.b.entrySet());
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return super.hashCode() ^ this.b.hashCode();
    }
    
    private static void a(final String \u2603, final eb \u2603, final DataOutput \u2603) throws IOException {
        \u2603.writeByte(\u2603.a());
        if (\u2603.a() == 0) {
            return;
        }
        \u2603.writeUTF(\u2603);
        \u2603.a(\u2603);
    }
    
    private static byte a(final DataInput \u2603, final dw \u2603) throws IOException {
        return \u2603.readByte();
    }
    
    private static String b(final DataInput \u2603, final dw \u2603) throws IOException {
        return \u2603.readUTF();
    }
    
    static eb a(final byte \u2603, final String \u2603, final DataInput \u2603, final int \u2603, final dw \u2603) throws IOException {
        final eb a = eb.a(\u2603);
        try {
            a.a(\u2603, \u2603, \u2603);
        }
        catch (IOException \u26032) {
            final b a2 = b.a(\u26032, "Loading NBT data");
            final c a3 = a2.a("NBT Tag");
            a3.a("Tag name", \u2603);
            a3.a("Tag type", \u2603);
            throw new e(a2);
        }
        return a;
    }
    
    public void a(final dn \u2603) {
        for (final String s : \u2603.b.keySet()) {
            final eb eb = \u2603.b.get(s);
            if (eb.a() == 10) {
                if (this.b(s, 10)) {
                    final dn m = this.m(s);
                    m.a((dn)eb);
                }
                else {
                    this.a(s, eb.b());
                }
            }
            else {
                this.a(s, eb.b());
            }
        }
    }
}
