import com.google.common.base.Function;
import com.google.common.collect.Iterators;
import java.util.Iterator;
import com.google.common.collect.Lists;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class es implements eu
{
    protected List<eu> a;
    private ez b;
    
    public es() {
        this.a = (List<eu>)Lists.newArrayList();
    }
    
    @Override
    public eu a(final eu \u2603) {
        \u2603.b().a(this.b());
        this.a.add(\u2603);
        return this;
    }
    
    @Override
    public List<eu> a() {
        return this.a;
    }
    
    @Override
    public eu a(final String \u2603) {
        return this.a(new fa(\u2603));
    }
    
    @Override
    public eu a(final ez \u2603) {
        this.b = \u2603;
        for (final eu eu : this.a) {
            eu.b().a(this.b());
        }
        return this;
    }
    
    @Override
    public ez b() {
        if (this.b == null) {
            this.b = new ez();
            for (final eu eu : this.a) {
                eu.b().a(this.b);
            }
        }
        return this.b;
    }
    
    @Override
    public Iterator<eu> iterator() {
        return Iterators.concat((Iterator<? extends eu>)Iterators.forArray(this), (Iterator<? extends eu>)a(this.a));
    }
    
    @Override
    public final String c() {
        final StringBuilder sb = new StringBuilder();
        for (final eu eu : this) {
            sb.append(eu.e());
        }
        return sb.toString();
    }
    
    @Override
    public final String d() {
        final StringBuilder sb = new StringBuilder();
        for (final eu eu : this) {
            sb.append(eu.b().k());
            sb.append(eu.e());
            sb.append(a.v);
        }
        return sb.toString();
    }
    
    public static Iterator<eu> a(final Iterable<eu> \u2603) {
        Iterator<eu> fromIterator = Iterators.concat(Iterators.transform(\u2603.iterator(), (Function<? super eu, ? extends Iterator<? extends eu>>)new Function<eu, Iterator<eu>>() {
            public Iterator<eu> a(final eu \u2603) {
                return \u2603.iterator();
            }
        }));
        fromIterator = Iterators.transform(fromIterator, (Function<? super eu, ? extends eu>)new Function<eu, eu>() {
            public eu a(final eu \u2603) {
                final eu f = \u2603.f();
                f.a(f.b().n());
                return f;
            }
        });
        return fromIterator;
    }
    
    @Override
    public boolean equals(final Object \u2603) {
        if (this == \u2603) {
            return true;
        }
        if (\u2603 instanceof es) {
            final es es = (es)\u2603;
            return this.a.equals(es.a) && this.b().equals(es.b());
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return 31 * this.b.hashCode() + this.a.hashCode();
    }
    
    @Override
    public String toString() {
        return "BaseComponent{style=" + this.b + ", siblings=" + this.a + '}';
    }
}
