import java.util.Iterator;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Collection;
import java.util.Arrays;
import com.google.common.collect.Sets;
import java.util.Set;
import net.minecraft.server.MinecraftServer;

// 
// Decompiled by Procyon v0.5.36
// 

public class kk extends auo
{
    private final MinecraftServer a;
    private final Set<auk> b;
    private aup c;
    
    public kk(final MinecraftServer \u2603) {
        this.b = (Set<auk>)Sets.newHashSet();
        this.a = \u2603;
    }
    
    @Override
    public void a(final aum \u2603) {
        super.a(\u2603);
        if (this.b.contains(\u2603.d())) {
            this.a.ap().a(new hs(\u2603));
        }
        this.b();
    }
    
    @Override
    public void a(final String \u2603) {
        super.a(\u2603);
        this.a.ap().a(new hs(\u2603));
        this.b();
    }
    
    @Override
    public void a(final String \u2603, final auk \u2603) {
        super.a(\u2603, \u2603);
        this.a.ap().a(new hs(\u2603, \u2603));
        this.b();
    }
    
    @Override
    public void a(final int \u2603, final auk \u2603) {
        final auk a = this.a(\u2603);
        super.a(\u2603, \u2603);
        if (a != \u2603 && a != null) {
            if (this.h(a) > 0) {
                this.a.ap().a(new hj(\u2603, \u2603));
            }
            else {
                this.g(a);
            }
        }
        if (\u2603 != null) {
            if (this.b.contains(\u2603)) {
                this.a.ap().a(new hj(\u2603, \u2603));
            }
            else {
                this.e(\u2603);
            }
        }
        this.b();
    }
    
    @Override
    public boolean a(final String \u2603, final String \u2603) {
        if (super.a(\u2603, \u2603)) {
            final aul d = this.d(\u2603);
            this.a.ap().a(new hr(d, Arrays.asList(\u2603), 3));
            this.b();
            return true;
        }
        return false;
    }
    
    @Override
    public void a(final String \u2603, final aul \u2603) {
        super.a(\u2603, \u2603);
        this.a.ap().a(new hr(\u2603, Arrays.asList(\u2603), 4));
        this.b();
    }
    
    @Override
    public void a(final auk \u2603) {
        super.a(\u2603);
        this.b();
    }
    
    @Override
    public void b(final auk \u2603) {
        super.b(\u2603);
        if (this.b.contains(\u2603)) {
            this.a.ap().a(new hq(\u2603, 2));
        }
        this.b();
    }
    
    @Override
    public void c(final auk \u2603) {
        super.c(\u2603);
        if (this.b.contains(\u2603)) {
            this.g(\u2603);
        }
        this.b();
    }
    
    @Override
    public void a(final aul \u2603) {
        super.a(\u2603);
        this.a.ap().a(new hr(\u2603, 0));
        this.b();
    }
    
    @Override
    public void b(final aul \u2603) {
        super.b(\u2603);
        this.a.ap().a(new hr(\u2603, 2));
        this.b();
    }
    
    @Override
    public void c(final aul \u2603) {
        super.c(\u2603);
        this.a.ap().a(new hr(\u2603, 1));
        this.b();
    }
    
    public void a(final aup \u2603) {
        this.c = \u2603;
    }
    
    protected void b() {
        if (this.c != null) {
            this.c.c();
        }
    }
    
    public List<ff> d(final auk \u2603) {
        final List<ff> arrayList = (List<ff>)Lists.newArrayList();
        arrayList.add(new hq(\u2603, 0));
        for (int i = 0; i < 19; ++i) {
            if (this.a(i) == \u2603) {
                arrayList.add(new hj(i, \u2603));
            }
        }
        for (final aum \u26032 : this.i(\u2603)) {
            arrayList.add(new hs(\u26032));
        }
        return arrayList;
    }
    
    public void e(final auk \u2603) {
        final List<ff> d = this.d(\u2603);
        for (final lf lf : this.a.ap().v()) {
            for (final ff \u26032 : d) {
                lf.a.a(\u26032);
            }
        }
        this.b.add(\u2603);
    }
    
    public List<ff> f(final auk \u2603) {
        final List<ff> arrayList = (List<ff>)Lists.newArrayList();
        arrayList.add(new hq(\u2603, 1));
        for (int i = 0; i < 19; ++i) {
            if (this.a(i) == \u2603) {
                arrayList.add(new hj(i, \u2603));
            }
        }
        return arrayList;
    }
    
    public void g(final auk \u2603) {
        final List<ff> f = this.f(\u2603);
        for (final lf lf : this.a.ap().v()) {
            for (final ff \u26032 : f) {
                lf.a.a(\u26032);
            }
        }
        this.b.remove(\u2603);
    }
    
    public int h(final auk \u2603) {
        int n = 0;
        for (int i = 0; i < 19; ++i) {
            if (this.a(i) == \u2603) {
                ++n;
            }
        }
        return n;
    }
}
