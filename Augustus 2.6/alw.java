import java.util.Collection;
import com.google.common.collect.Lists;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class alw
{
    private final adm a;
    private final cj b;
    private final cj c;
    private final cq d;
    private final List<cj> e;
    private final List<cj> f;
    
    public alw(final adm \u2603, final cj \u2603, final cq \u2603, final boolean \u2603) {
        this.e = (List<cj>)Lists.newArrayList();
        this.f = (List<cj>)Lists.newArrayList();
        this.a = \u2603;
        this.b = \u2603;
        if (\u2603) {
            this.d = \u2603;
            this.c = \u2603.a(\u2603);
        }
        else {
            this.d = \u2603.d();
            this.c = \u2603.a(\u2603, 2);
        }
    }
    
    public boolean a() {
        this.e.clear();
        this.f.clear();
        final afh c = this.a.p(this.c).c();
        if (!als.a(c, this.a, this.c, this.d, false)) {
            if (c.k() != 1) {
                return false;
            }
            this.f.add(this.c);
            return true;
        }
        else {
            if (!this.a(this.c)) {
                return false;
            }
            for (int i = 0; i < this.e.size(); ++i) {
                final cj cj = this.e.get(i);
                if (this.a.p(cj).c() == afi.cE && !this.b(cj)) {
                    return false;
                }
            }
            return true;
        }
    }
    
    private boolean a(final cj \u2603) {
        afh \u26032 = this.a.p(\u2603).c();
        if (\u26032.t() == arm.a) {
            return true;
        }
        if (!als.a(\u26032, this.a, \u2603, this.d, false)) {
            return true;
        }
        if (\u2603.equals(this.b)) {
            return true;
        }
        if (this.e.contains(\u2603)) {
            return true;
        }
        int \u26033 = 1;
        if (\u26033 + this.e.size() > 12) {
            return false;
        }
        while (\u26032 == afi.cE) {
            final cj a = \u2603.a(this.d.d(), \u26033);
            \u26032 = this.a.p(a).c();
            if (\u26032.t() == arm.a || !als.a(\u26032, this.a, a, this.d, false)) {
                break;
            }
            if (a.equals(this.b)) {
                break;
            }
            if (++\u26033 + this.e.size() > 12) {
                return false;
            }
        }
        int \u26034 = 0;
        for (int i = \u26033 - 1; i >= 0; --i) {
            this.e.add(\u2603.a(this.d.d(), i));
            ++\u26034;
        }
        int i = 1;
        while (true) {
            final cj a2 = \u2603.a(this.d, i);
            final int index = this.e.indexOf(a2);
            if (index > -1) {
                this.a(\u26034, index);
                for (int j = 0; j <= index + \u26034; ++j) {
                    final cj cj = this.e.get(j);
                    if (this.a.p(cj).c() == afi.cE && !this.b(cj)) {
                        return false;
                    }
                }
                return true;
            }
            \u26032 = this.a.p(a2).c();
            if (\u26032.t() == arm.a) {
                return true;
            }
            if (!als.a(\u26032, this.a, a2, this.d, true) || a2.equals(this.b)) {
                return false;
            }
            if (\u26032.k() == 1) {
                this.f.add(a2);
                return true;
            }
            if (this.e.size() >= 12) {
                return false;
            }
            this.e.add(a2);
            ++\u26034;
            ++i;
        }
    }
    
    private void a(final int \u2603, final int \u2603) {
        final List<cj> arrayList = (List<cj>)Lists.newArrayList();
        final List<cj> arrayList2 = (List<cj>)Lists.newArrayList();
        final List<cj> arrayList3 = (List<cj>)Lists.newArrayList();
        arrayList.addAll(this.e.subList(0, \u2603));
        arrayList2.addAll(this.e.subList(this.e.size() - \u2603, this.e.size()));
        arrayList3.addAll(this.e.subList(\u2603, this.e.size() - \u2603));
        this.e.clear();
        this.e.addAll(arrayList);
        this.e.addAll(arrayList2);
        this.e.addAll(arrayList3);
    }
    
    private boolean b(final cj \u2603) {
        for (final cq \u26032 : cq.values()) {
            if (\u26032.k() != this.d.k() && !this.a(\u2603.a(\u26032))) {
                return false;
            }
        }
        return true;
    }
    
    public List<cj> c() {
        return this.e;
    }
    
    public List<cj> d() {
        return this.f;
    }
}
