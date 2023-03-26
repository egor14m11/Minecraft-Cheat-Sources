import com.google.common.collect.Maps;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public class bez extends oq implements oo
{
    private String a;
    private Map<Integer, Integer> b;
    
    public bez(final String \u2603, final eu \u2603, final int \u2603) {
        super(\u2603, \u2603);
        this.b = (Map<Integer, Integer>)Maps.newHashMap();
        this.a = \u2603;
    }
    
    @Override
    public int a_(final int \u2603) {
        if (this.b.containsKey(\u2603)) {
            return this.b.get(\u2603);
        }
        return 0;
    }
    
    @Override
    public void b(final int \u2603, final int \u2603) {
        this.b.put(\u2603, \u2603);
    }
    
    @Override
    public int g() {
        return this.b.size();
    }
    
    @Override
    public boolean r_() {
        return false;
    }
    
    @Override
    public void a(final on \u2603) {
    }
    
    @Override
    public on i() {
        return on.a;
    }
    
    @Override
    public String k() {
        return this.a;
    }
    
    @Override
    public xi a(final wm \u2603, final wn \u2603) {
        throw new UnsupportedOperationException();
    }
}
