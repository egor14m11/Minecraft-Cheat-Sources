import com.google.common.collect.Lists;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class bae implements bag
{
    private final List<bah> a;
    
    public bae() {
        (this.a = (List<bah>)Lists.newArrayList()).add(new bak());
        this.a.add(new bal());
    }
    
    @Override
    public List<bah> a() {
        return this.a;
    }
    
    @Override
    public eu b() {
        return new fa("Press a key to select a command, and again to use it.");
    }
}
