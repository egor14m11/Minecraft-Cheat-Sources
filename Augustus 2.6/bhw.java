import java.util.Queue;
import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.Set;
import java.util.BitSet;

// 
// Decompiled by Procyon v0.5.36
// 

public class bhw
{
    private static final int a;
    private static final int b;
    private static final int c;
    private final BitSet d;
    private static final int[] e;
    private int f;
    
    public bhw() {
        this.d = new BitSet(4096);
        this.f = 4096;
    }
    
    public void a(final cj \u2603) {
        this.d.set(c(\u2603), true);
        --this.f;
    }
    
    private static int c(final cj \u2603) {
        return a(\u2603.n() & 0xF, \u2603.o() & 0xF, \u2603.p() & 0xF);
    }
    
    private static int a(final int \u2603, final int \u2603, final int \u2603) {
        return \u2603 << 0 | \u2603 << 8 | \u2603 << 4;
    }
    
    public bhx a() {
        final bhx bhx = new bhx();
        if (4096 - this.f < 256) {
            bhx.a(true);
        }
        else if (this.f == 0) {
            bhx.a(false);
        }
        else {
            for (final int n : bhw.e) {
                if (!this.d.get(n)) {
                    bhx.a(this.a(n));
                }
            }
        }
        return bhx;
    }
    
    public Set<cq> b(final cj \u2603) {
        return this.a(c(\u2603));
    }
    
    private Set<cq> a(final int \u2603) {
        final Set<cq> none = EnumSet.noneOf(cq.class);
        final Queue<Integer> linkedList = (Queue<Integer>)Lists.newLinkedList();
        linkedList.add(nl.a(\u2603));
        this.d.set(\u2603, true);
        while (!linkedList.isEmpty()) {
            final int intValue = linkedList.poll();
            this.a(intValue, none);
            for (final cq \u26032 : cq.values()) {
                final int a = this.a(intValue, \u26032);
                if (a >= 0 && !this.d.get(a)) {
                    this.d.set(a, true);
                    linkedList.add(nl.a(a));
                }
            }
        }
        return none;
    }
    
    private void a(final int \u2603, final Set<cq> \u2603) {
        final int n = \u2603 >> 0 & 0xF;
        if (n == 0) {
            \u2603.add(cq.e);
        }
        else if (n == 15) {
            \u2603.add(cq.f);
        }
        final int n2 = \u2603 >> 8 & 0xF;
        if (n2 == 0) {
            \u2603.add(cq.a);
        }
        else if (n2 == 15) {
            \u2603.add(cq.b);
        }
        final int n3 = \u2603 >> 4 & 0xF;
        if (n3 == 0) {
            \u2603.add(cq.c);
        }
        else if (n3 == 15) {
            \u2603.add(cq.d);
        }
    }
    
    private int a(final int \u2603, final cq \u2603) {
        switch (bhw$1.a[\u2603.ordinal()]) {
            case 1: {
                if ((\u2603 >> 8 & 0xF) == 0x0) {
                    return -1;
                }
                return \u2603 - bhw.c;
            }
            case 2: {
                if ((\u2603 >> 8 & 0xF) == 0xF) {
                    return -1;
                }
                return \u2603 + bhw.c;
            }
            case 3: {
                if ((\u2603 >> 4 & 0xF) == 0x0) {
                    return -1;
                }
                return \u2603 - bhw.b;
            }
            case 4: {
                if ((\u2603 >> 4 & 0xF) == 0xF) {
                    return -1;
                }
                return \u2603 + bhw.b;
            }
            case 5: {
                if ((\u2603 >> 0 & 0xF) == 0x0) {
                    return -1;
                }
                return \u2603 - bhw.a;
            }
            case 6: {
                if ((\u2603 >> 0 & 0xF) == 0xF) {
                    return -1;
                }
                return \u2603 + bhw.a;
            }
            default: {
                return -1;
            }
        }
    }
    
    static {
        a = (int)Math.pow(16.0, 0.0);
        b = (int)Math.pow(16.0, 1.0);
        c = (int)Math.pow(16.0, 2.0);
        e = new int[1352];
        final int n = 0;
        final int n2 = 15;
        int n3 = 0;
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                for (int k = 0; k < 16; ++k) {
                    if (i == 0 || i == 15 || j == 0 || j == 15 || k == 0 || k == 15) {
                        bhw.e[n3++] = a(i, j, k);
                    }
                }
            }
        }
    }
}
