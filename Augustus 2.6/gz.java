import com.google.common.collect.ForwardingMultimap;
import com.google.common.base.Objects;
import java.io.IOException;
import com.mojang.authlib.properties.Property;
import com.mojang.authlib.GameProfile;
import java.util.Iterator;
import com.google.common.collect.Lists;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class gz implements ff<fj>
{
    private a a;
    private final List<b> b;
    
    public gz() {
        this.b = (List<b>)Lists.newArrayList();
    }
    
    public gz(final a \u2603, final lf... \u2603) {
        this.b = (List<b>)Lists.newArrayList();
        this.a = \u2603;
        for (final lf lf : \u2603) {
            this.b.add(new b(lf.cd(), lf.h, lf.c.b(), lf.E()));
        }
    }
    
    public gz(final a \u2603, final Iterable<lf> \u2603) {
        this.b = (List<b>)Lists.newArrayList();
        this.a = \u2603;
        for (final lf lf : \u2603) {
            this.b.add(new b(lf.cd(), lf.h, lf.c.b(), lf.E()));
        }
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.a(a.class);
        for (int e = \u2603.e(), i = 0; i < e; ++i) {
            GameProfile \u26032 = null;
            int \u26033 = 0;
            adp.a \u26034 = null;
            eu \u26035 = null;
            switch (gz$1.a[this.a.ordinal()]) {
                case 1: {
                    \u26032 = new GameProfile(\u2603.g(), \u2603.c(16));
                    for (int e2 = \u2603.e(), j = 0; j < e2; ++j) {
                        final String c = \u2603.c(32767);
                        final String c2 = \u2603.c(32767);
                        if (\u2603.readBoolean()) {
                            \u26032.getProperties().put(c, new Property(c, c2, \u2603.c(32767)));
                        }
                        else {
                            \u26032.getProperties().put(c, new Property(c, c2));
                        }
                    }
                    \u26034 = adp.a.a(\u2603.e());
                    \u26033 = \u2603.e();
                    if (\u2603.readBoolean()) {
                        \u26035 = \u2603.d();
                        break;
                    }
                    break;
                }
                case 2: {
                    \u26032 = new GameProfile(\u2603.g(), null);
                    \u26034 = adp.a.a(\u2603.e());
                    break;
                }
                case 3: {
                    \u26032 = new GameProfile(\u2603.g(), null);
                    \u26033 = \u2603.e();
                    break;
                }
                case 4: {
                    \u26032 = new GameProfile(\u2603.g(), null);
                    if (\u2603.readBoolean()) {
                        \u26035 = \u2603.d();
                        break;
                    }
                    break;
                }
                case 5: {
                    \u26032 = new GameProfile(\u2603.g(), null);
                    break;
                }
            }
            this.b.add(new b(\u26032, \u26033, \u26034, \u26035));
        }
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.a(this.a);
        \u2603.b(this.b.size());
        for (final b b : this.b) {
            switch (gz$1.a[this.a.ordinal()]) {
                case 1: {
                    \u2603.a(b.a().getId());
                    \u2603.a(b.a().getName());
                    \u2603.b(b.a().getProperties().size());
                    for (final Property property : ((ForwardingMultimap<K, Property>)b.a().getProperties()).values()) {
                        \u2603.a(property.getName());
                        \u2603.a(property.getValue());
                        if (property.hasSignature()) {
                            \u2603.writeBoolean(true);
                            \u2603.a(property.getSignature());
                        }
                        else {
                            \u2603.writeBoolean(false);
                        }
                    }
                    \u2603.b(b.c().a());
                    \u2603.b(b.b());
                    if (b.d() == null) {
                        \u2603.writeBoolean(false);
                        continue;
                    }
                    \u2603.writeBoolean(true);
                    \u2603.a(b.d());
                    continue;
                }
                case 2: {
                    \u2603.a(b.a().getId());
                    \u2603.b(b.c().a());
                    continue;
                }
                case 3: {
                    \u2603.a(b.a().getId());
                    \u2603.b(b.b());
                    continue;
                }
                case 4: {
                    \u2603.a(b.a().getId());
                    if (b.d() == null) {
                        \u2603.writeBoolean(false);
                        continue;
                    }
                    \u2603.writeBoolean(true);
                    \u2603.a(b.d());
                    continue;
                }
                case 5: {
                    \u2603.a(b.a().getId());
                    continue;
                }
            }
        }
    }
    
    @Override
    public void a(final fj \u2603) {
        \u2603.a(this);
    }
    
    public List<b> a() {
        return this.b;
    }
    
    public a b() {
        return this.a;
    }
    
    @Override
    public String toString() {
        return Objects.toStringHelper((Object)this).add("action", (Object)this.a).add("entries", (Object)this.b).toString();
    }
    
    public enum a
    {
        a, 
        b, 
        c, 
        d, 
        e;
    }
    
    public class b
    {
        private final int b;
        private final adp.a c;
        private final GameProfile d;
        private final eu e;
        
        public b(final GameProfile \u2603, final int \u2603, final adp.a \u2603, final eu \u2603) {
            this.d = \u2603;
            this.b = \u2603;
            this.c = \u2603;
            this.e = \u2603;
        }
        
        public GameProfile a() {
            return this.d;
        }
        
        public int b() {
            return this.b;
        }
        
        public adp.a c() {
            return this.c;
        }
        
        public eu d() {
            return this.e;
        }
        
        @Override
        public String toString() {
            return Objects.toStringHelper((Object)this).add("latency", this.b).add("gameMode", (Object)this.c).add("profile", (Object)this.d).add("displayName", (Object)((this.e == null) ? null : eu.a.a(this.e))).toString();
        }
    }
}
