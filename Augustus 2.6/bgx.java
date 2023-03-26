import java.util.Collection;
import java.util.Collections;
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.Map;
import com.google.common.collect.Maps;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class bgx extends bgu
{
    private final amo<?> a;
    private final String c;
    private final List<amo<?>> d;
    
    private bgx(final amo<?> \u2603, final String \u2603, final List<amo<?>> \u2603) {
        this.a = \u2603;
        this.c = \u2603;
        this.d = \u2603;
    }
    
    @Override
    protected bov a(final alz \u2603) {
        final Map<amo, Comparable> linkedHashMap = (Map<amo, Comparable>)Maps.newLinkedHashMap((Map<?, ?>)\u2603.b());
        String s;
        if (this.a == null) {
            s = afh.c.c(\u2603.c()).toString();
        }
        else {
            s = this.a.a(linkedHashMap.remove(this.a));
        }
        if (this.c != null) {
            s += this.c;
        }
        for (final amo<?> amo : this.d) {
            linkedHashMap.remove(amo);
        }
        return new bov(s, this.a(linkedHashMap));
    }
    
    public static class a
    {
        private amo<?> a;
        private String b;
        private final List<amo<?>> c;
        
        public a() {
            this.c = (List<amo<?>>)Lists.newArrayList();
        }
        
        public a a(final amo<?> \u2603) {
            this.a = \u2603;
            return this;
        }
        
        public a a(final String \u2603) {
            this.b = \u2603;
            return this;
        }
        
        public a a(final amo<?>... \u2603) {
            Collections.addAll(this.c, \u2603);
            return this;
        }
        
        public bgx a() {
            return new bgx(this.a, this.b, this.c, null);
        }
    }
}
