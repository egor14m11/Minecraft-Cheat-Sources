import java.util.Iterator;
import java.lang.reflect.Array;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.ArrayUtils;
import com.google.common.base.Predicates;
import com.google.common.collect.Maps;
import com.google.common.collect.Lists;
import com.google.common.base.Predicate;
import java.util.Map;
import java.util.List;
import com.google.common.base.Joiner;

// 
// Decompiled by Procyon v0.5.36
// 

public class ame
{
    private static final Joiner a;
    private final List<String[]> b;
    private final Map<Character, Predicate<amc>> c;
    private int d;
    private int e;
    
    private ame() {
        this.b = (List<String[]>)Lists.newArrayList();
        (this.c = (Map<Character, Predicate<amc>>)Maps.newHashMap()).put(' ', Predicates.alwaysTrue());
    }
    
    public ame a(final String... \u2603) {
        if (ArrayUtils.isEmpty(\u2603) || StringUtils.isEmpty(\u2603[0])) {
            throw new IllegalArgumentException("Empty pattern for aisle");
        }
        if (this.b.isEmpty()) {
            this.d = \u2603.length;
            this.e = \u2603[0].length();
        }
        if (\u2603.length != this.d) {
            throw new IllegalArgumentException("Expected aisle with height of " + this.d + ", but was given one with a height of " + \u2603.length + ")");
        }
        for (final String s : \u2603) {
            if (s.length() != this.e) {
                throw new IllegalArgumentException("Not all rows in the given aisle are the correct width (expected " + this.e + ", found one with " + s.length() + ")");
            }
            for (final char c : s.toCharArray()) {
                if (!this.c.containsKey(c)) {
                    this.c.put(c, null);
                }
            }
        }
        this.b.add(\u2603);
        return this;
    }
    
    public static ame a() {
        return new ame();
    }
    
    public ame a(final char \u2603, final Predicate<amc> \u2603) {
        this.c.put(\u2603, \u2603);
        return this;
    }
    
    public amd b() {
        return new amd(this.c());
    }
    
    private Predicate<amc>[][][] c() {
        this.d();
        final Predicate<amc>[][][] array = (Predicate<amc>[][][])Array.newInstance(Predicate.class, this.b.size(), this.d, this.e);
        for (int i = 0; i < this.b.size(); ++i) {
            for (int j = 0; j < this.d; ++j) {
                for (int k = 0; k < this.e; ++k) {
                    array[i][j][k] = this.c.get(this.b.get(i)[j].charAt(k));
                }
            }
        }
        return array;
    }
    
    private void d() {
        final List<Character> arrayList = (List<Character>)Lists.newArrayList();
        for (final Map.Entry<Character, Predicate<amc>> entry : this.c.entrySet()) {
            if (entry.getValue() == null) {
                arrayList.add(entry.getKey());
            }
        }
        if (!arrayList.isEmpty()) {
            throw new IllegalStateException("Predicates for character(s) " + ame.a.join(arrayList) + " are missing");
        }
    }
    
    static {
        a = Joiner.on(",");
    }
}
