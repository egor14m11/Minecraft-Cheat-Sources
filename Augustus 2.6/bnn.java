import org.apache.logging.log4j.LogManager;
import com.google.common.collect.Iterables;
import com.google.common.base.Function;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Iterator;
import com.google.common.collect.Sets;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Set;
import java.util.List;
import java.util.Map;
import com.google.common.base.Joiner;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class bnn implements bng
{
    private static final Logger a;
    private static final Joiner b;
    private final Map<String, bnb> c;
    private final List<bnj> d;
    private final Set<String> e;
    private final bny f;
    
    public bnn(final bny \u2603) {
        this.c = (Map<String, bnb>)Maps.newHashMap();
        this.d = (List<bnj>)Lists.newArrayList();
        this.e = (Set<String>)Sets.newLinkedHashSet();
        this.f = \u2603;
    }
    
    public void a(final bnk \u2603) {
        for (final String s : \u2603.c()) {
            this.e.add(s);
            bnb bnb = this.c.get(s);
            if (bnb == null) {
                bnb = new bnb(this.f);
                this.c.put(s, bnb);
            }
            bnb.a(\u2603);
        }
    }
    
    @Override
    public Set<String> a() {
        return this.e;
    }
    
    @Override
    public bnh a(final jy \u2603) throws IOException {
        final bni bni = this.c.get(\u2603.b());
        if (bni != null) {
            return bni.a(\u2603);
        }
        throw new FileNotFoundException(\u2603.toString());
    }
    
    @Override
    public List<bnh> b(final jy \u2603) throws IOException {
        final bni bni = this.c.get(\u2603.b());
        if (bni != null) {
            return bni.b(\u2603);
        }
        throw new FileNotFoundException(\u2603.toString());
    }
    
    private void b() {
        this.c.clear();
        this.e.clear();
    }
    
    @Override
    public void a(final List<bnk> \u2603) {
        this.b();
        bnn.a.info("Reloading ResourceManager: " + bnn.b.join(Iterables.transform((Iterable<bnk>)\u2603, (Function<? super bnk, ?>)new Function<bnk, String>() {
            public String a(final bnk \u2603) {
                return \u2603.b();
            }
        })));
        for (final bnk \u26032 : \u2603) {
            this.a(\u26032);
        }
        this.c();
    }
    
    @Override
    public void a(final bnj \u2603) {
        this.d.add(\u2603);
        \u2603.a(this);
    }
    
    private void c() {
        for (final bnj bnj : this.d) {
            bnj.a(this);
        }
    }
    
    static {
        a = LogManager.getLogger();
        b = Joiner.on(", ");
    }
}
