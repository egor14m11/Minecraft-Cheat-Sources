import java.util.Collection;
import java.util.Random;
import java.util.Iterator;
import com.google.common.collect.Lists;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class bal implements bag, bah
{
    private final List<bah> a;
    
    public bal() {
        this.a = (List<bah>)Lists.newArrayList();
        final ave a = ave.A();
        for (final aul \u2603 : a.f.Z().g()) {
            this.a.add(new a(\u2603));
        }
    }
    
    @Override
    public List<bah> a() {
        return this.a;
    }
    
    @Override
    public eu b() {
        return new fa("Select a team to teleport to");
    }
    
    @Override
    public void a(final baf \u2603) {
        \u2603.a(this);
    }
    
    @Override
    public eu A_() {
        return new fa("Teleport to team member");
    }
    
    @Override
    public void a(final float \u2603, final int \u2603) {
        ave.A().P().a(awm.a);
        avp.a(0, 0, 16.0f, 0.0f, 16, 16, 256.0f, 256.0f);
    }
    
    @Override
    public boolean B_() {
        for (final bah bah : this.a) {
            if (bah.B_()) {
                return true;
            }
        }
        return false;
    }
    
    class a implements bah
    {
        private final aul b;
        private final jy c;
        private final List<bdc> d;
        
        public a(final aul \u2603) {
            this.b = \u2603;
            this.d = (List<bdc>)Lists.newArrayList();
            for (final String \u26032 : \u2603.d()) {
                final bdc a2 = ave.A().u().a(\u26032);
                if (a2 != null) {
                    this.d.add(a2);
                }
            }
            if (!this.d.isEmpty()) {
                final String name = this.d.get(new Random().nextInt(this.d.size())).a().getName();
                bet.a(this.c = bet.c(name), name);
            }
            else {
                this.c = bmz.a();
            }
        }
        
        @Override
        public void a(final baf \u2603) {
            \u2603.a(new bak(this.d));
        }
        
        @Override
        public eu A_() {
            return new fa(this.b.c());
        }
        
        @Override
        public void a(final float \u2603, final int \u2603) {
            int b = -1;
            final String b2 = avn.b(this.b.e());
            if (b2.length() >= 2) {
                b = ave.A().k.b(b2.charAt(1));
            }
            if (b >= 0) {
                final float n = (b >> 16 & 0xFF) / 255.0f;
                final float n2 = (b >> 8 & 0xFF) / 255.0f;
                final float n3 = (b & 0xFF) / 255.0f;
                avp.a(1, 1, 15, 15, ns.b(n * \u2603, n2 * \u2603, n3 * \u2603) | \u2603 << 24);
            }
            ave.A().P().a(this.c);
            bfl.c(\u2603, \u2603, \u2603, \u2603 / 255.0f);
            avp.a(2, 2, 8.0f, 8.0f, 8, 8, 12, 12, 64.0f, 64.0f);
            avp.a(2, 2, 40.0f, 8.0f, 8, 8, 12, 12, 64.0f, 64.0f);
        }
        
        @Override
        public boolean B_() {
            return !this.d.isEmpty();
        }
    }
}
