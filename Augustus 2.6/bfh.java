import com.google.common.collect.Lists;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class bfh
{
    private double c;
    private double d;
    private double e;
    protected List<bht> a;
    protected boolean b;
    
    public bfh() {
        this.a = (List<bht>)Lists.newArrayListWithCapacity(17424);
    }
    
    public void a(final double \u2603, final double \u2603, final double \u2603) {
        this.b = true;
        this.a.clear();
        this.c = \u2603;
        this.d = \u2603;
        this.e = \u2603;
    }
    
    public void a(final bht \u2603) {
        final cj j = \u2603.j();
        bfl.b((float)(j.n() - this.c), (float)(j.o() - this.d), (float)(j.p() - this.e));
    }
    
    public void a(final bht \u2603, final adf \u2603) {
        this.a.add(\u2603);
    }
    
    public abstract void a(final adf p0);
}
