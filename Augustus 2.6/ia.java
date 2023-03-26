import java.io.IOException;
import java.util.UUID;
import java.util.Iterator;
import java.util.Collection;
import com.google.common.collect.Lists;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class ia implements ff<fj>
{
    private int a;
    private final List<a> b;
    
    public ia() {
        this.b = (List<a>)Lists.newArrayList();
    }
    
    public ia(final int \u2603, final Collection<qc> \u2603) {
        this.b = (List<a>)Lists.newArrayList();
        this.a = \u2603;
        for (final qc qc : \u2603) {
            this.b.add(new a(qc.a().a(), qc.b(), qc.c()));
        }
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.e();
        for (int int1 = \u2603.readInt(), i = 0; i < int1; ++i) {
            final String c = \u2603.c(64);
            final double double1 = \u2603.readDouble();
            final List<qd> arrayList = (List<qd>)Lists.newArrayList();
            for (int e = \u2603.e(), j = 0; j < e; ++j) {
                final UUID g = \u2603.g();
                arrayList.add(new qd(g, "Unknown synced attribute modifier", \u2603.readDouble(), \u2603.readByte()));
            }
            this.b.add(new a(c, double1, arrayList));
        }
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.b(this.a);
        \u2603.writeInt(this.b.size());
        for (final a a : this.b) {
            \u2603.a(a.a());
            \u2603.writeDouble(a.b());
            \u2603.b(a.c().size());
            for (final qd qd : a.c()) {
                \u2603.a(qd.a());
                \u2603.writeDouble(qd.d());
                \u2603.writeByte(qd.c());
            }
        }
    }
    
    @Override
    public void a(final fj \u2603) {
        \u2603.a(this);
    }
    
    public int a() {
        return this.a;
    }
    
    public List<a> b() {
        return this.b;
    }
    
    public class a
    {
        private final String b;
        private final double c;
        private final Collection<qd> d;
        
        public a(final String \u2603, final double \u2603, final Collection<qd> \u2603) {
            this.b = \u2603;
            this.c = \u2603;
            this.d = \u2603;
        }
        
        public String a() {
            return this.b;
        }
        
        public double b() {
            return this.c;
        }
        
        public Collection<qd> c() {
            return this.d;
        }
    }
}
