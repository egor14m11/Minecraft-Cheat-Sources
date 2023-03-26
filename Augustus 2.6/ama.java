import com.google.common.collect.Table;
import com.google.common.collect.HashBasedTable;
import java.util.Collections;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Iterables;
import com.google.common.base.Objects;
import java.util.Iterator;
import java.util.Collection;
import java.util.Map;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Comparator;
import com.google.common.collect.ImmutableList;
import com.google.common.base.Function;
import com.google.common.base.Joiner;

// 
// Decompiled by Procyon v0.5.36
// 

public class ama
{
    private static final Joiner a;
    private static final Function<amo, String> b;
    private final afh c;
    private final ImmutableList<amo> d;
    private final ImmutableList<alz> e;
    
    public ama(final afh \u2603, final amo... \u2603) {
        this.c = \u2603;
        Arrays.sort(\u2603, new Comparator<amo>() {
            public int a(final amo \u2603, final amo \u2603) {
                return \u2603.a().compareTo(\u2603.a());
            }
        });
        this.d = (ImmutableList<amo>)ImmutableList.copyOf(\u2603);
        final Map<Map<amo, Comparable>, a> linkedHashMap = (Map<Map<amo, Comparable>, a>)Maps.newLinkedHashMap();
        final List<a> arrayList = (List<a>)Lists.newArrayList();
        final Iterable<List<Comparable>> a = (Iterable<List<Comparable>>)cm.a((Iterable<? extends Iterable<? extends Comparable>>)this.e());
        for (final List<Comparable> \u26032 : a) {
            final Map<amo, Comparable> b = (Map<amo, Comparable>)cw.b(this.d, \u26032);
            final a a2 = new a(\u2603, (ImmutableMap)ImmutableMap.copyOf((Map<?, ?>)b));
            linkedHashMap.put(b, a2);
            arrayList.add(a2);
        }
        for (final a a3 : arrayList) {
            a3.a(linkedHashMap);
        }
        this.e = ImmutableList.copyOf((Collection<? extends alz>)arrayList);
    }
    
    public ImmutableList<alz> a() {
        return this.e;
    }
    
    private List<Iterable<Comparable>> e() {
        final List<Iterable<Comparable>> arrayList = (List<Iterable<Comparable>>)Lists.newArrayList();
        for (int i = 0; i < this.d.size(); ++i) {
            arrayList.add(this.d.get(i).c());
        }
        return arrayList;
    }
    
    public alz b() {
        return this.e.get(0);
    }
    
    public afh c() {
        return this.c;
    }
    
    public Collection<amo> d() {
        return this.d;
    }
    
    @Override
    public String toString() {
        return Objects.toStringHelper((Object)this).add("block", afh.c.c(this.c)).add("properties", (Object)Iterables.transform((Iterable<amo>)this.d, (Function<? super amo, ?>)ama.b)).toString();
    }
    
    static {
        a = Joiner.on(", ");
        b = new Function<amo, String>() {
            public String a(final amo \u2603) {
                return (\u2603 == null) ? "<NULL>" : \u2603.a();
            }
        };
    }
    
    static class a extends aly
    {
        private final afh a;
        private final ImmutableMap<amo, Comparable> b;
        private ImmutableTable<amo, Comparable, alz> c;
        
        private a(final afh \u2603, final ImmutableMap<amo, Comparable> \u2603) {
            this.a = \u2603;
            this.b = \u2603;
        }
        
        @Override
        public Collection<amo> a() {
            return (Collection<amo>)Collections.unmodifiableCollection((Collection<? extends amo>)this.b.keySet());
        }
        
        @Override
        public <T extends Comparable<T>> T b(final amo<T> \u2603) {
            if (!this.b.containsKey(\u2603)) {
                throw new IllegalArgumentException("Cannot get property " + \u2603 + " as it does not exist in " + this.a.P());
            }
            return \u2603.b().cast(this.b.get(\u2603));
        }
        
        @Override
        public <T extends Comparable<T>, V extends T> alz a(final amo<T> \u2603, final V \u2603) {
            if (!this.b.containsKey(\u2603)) {
                throw new IllegalArgumentException("Cannot set property " + \u2603 + " as it does not exist in " + this.a.P());
            }
            if (!\u2603.c().contains(\u2603)) {
                throw new IllegalArgumentException("Cannot set property " + \u2603 + " to " + \u2603 + " on block " + afh.c.c(this.a) + ", it is not an allowed value");
            }
            if (this.b.get(\u2603) == \u2603) {
                return this;
            }
            return (alz)this.c.get(\u2603, \u2603);
        }
        
        @Override
        public ImmutableMap<amo, Comparable> b() {
            return this.b;
        }
        
        @Override
        public afh c() {
            return this.a;
        }
        
        @Override
        public boolean equals(final Object \u2603) {
            return this == \u2603;
        }
        
        @Override
        public int hashCode() {
            return this.b.hashCode();
        }
        
        public void a(final Map<Map<amo, Comparable>, a> \u2603) {
            if (this.c != null) {
                throw new IllegalStateException();
            }
            final Table<amo, Comparable, alz> create = (Table<amo, Comparable, alz>)HashBasedTable.create();
            for (final amo<? extends Comparable> \u26032 : this.b.keySet()) {
                for (final Comparable \u26033 : \u26032.c()) {
                    if (\u26033 != this.b.get(\u26032)) {
                        create.put(\u26032, \u26033, \u2603.get(this.b(\u26032, \u26033)));
                    }
                }
            }
            this.c = (ImmutableTable<amo, Comparable, alz>)ImmutableTable.copyOf((Table<? extends amo, ? extends Comparable, ? extends alz>)create);
        }
        
        private Map<amo, Comparable> b(final amo \u2603, final Comparable \u2603) {
            final Map<amo, Comparable> hashMap = (Map<amo, Comparable>)Maps.newHashMap((Map<?, ?>)this.b);
            hashMap.put(\u2603, \u2603);
            return hashMap;
        }
    }
}
