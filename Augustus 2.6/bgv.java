import java.util.Iterator;
import com.google.common.base.Objects;
import java.util.Collection;
import java.util.Collections;
import com.google.common.collect.Sets;
import com.google.common.collect.Maps;
import java.util.Set;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public class bgv
{
    private Map<afh, bgy> a;
    private Set<afh> b;
    
    public bgv() {
        this.a = (Map<afh, bgy>)Maps.newIdentityHashMap();
        this.b = Sets.newIdentityHashSet();
    }
    
    public void a(final afh \u2603, final bgy \u2603) {
        this.a.put(\u2603, \u2603);
    }
    
    public void a(final afh... \u2603) {
        Collections.addAll(this.b, \u2603);
    }
    
    public Map<alz, bov> a() {
        final Map<alz, bov> identityHashMap = (Map<alz, bov>)Maps.newIdentityHashMap();
        for (final afh afh : afh.c) {
            if (this.b.contains(afh)) {
                continue;
            }
            identityHashMap.putAll(((bgy)Objects.firstNonNull((Object)this.a.get(afh), (Object)new bgw())).a(afh));
        }
        return identityHashMap;
    }
}
