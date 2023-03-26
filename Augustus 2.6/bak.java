import com.google.common.collect.ComparisonChain;
import java.util.Comparator;
import java.util.Iterator;
import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import com.google.common.collect.Ordering;

// 
// Decompiled by Procyon v0.5.36
// 

public class bak implements bag, bah
{
    private static final Ordering<bdc> a;
    private final List<bah> b;
    
    public bak() {
        this(bak.a.sortedCopy(ave.A().u().d()));
    }
    
    public bak(final Collection<bdc> \u2603) {
        this.b = (List<bah>)Lists.newArrayList();
        for (final bdc bdc : bak.a.sortedCopy(\u2603)) {
            if (bdc.b() != adp.a.e) {
                this.b.add(new bad(bdc.a()));
            }
        }
    }
    
    @Override
    public List<bah> a() {
        return this.b;
    }
    
    @Override
    public eu b() {
        return new fa("Select a player to teleport to");
    }
    
    @Override
    public void a(final baf \u2603) {
        \u2603.a(this);
    }
    
    @Override
    public eu A_() {
        return new fa("Teleport to player");
    }
    
    @Override
    public void a(final float \u2603, final int \u2603) {
        ave.A().P().a(awm.a);
        avp.a(0, 0, 0.0f, 0.0f, 16, 16, 256.0f, 256.0f);
    }
    
    @Override
    public boolean B_() {
        return !this.b.isEmpty();
    }
    
    static {
        a = Ordering.from((Comparator<bdc>)new Comparator<bdc>() {
            public int a(final bdc \u2603, final bdc \u2603) {
                return ComparisonChain.start().compare(\u2603.a().getId(), \u2603.a().getId()).result();
            }
        });
    }
}
