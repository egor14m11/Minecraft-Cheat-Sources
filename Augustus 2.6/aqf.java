import java.util.Iterator;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public class aqf extends aqq
{
    private double d;
    
    public aqf() {
        this.d = 0.004;
    }
    
    @Override
    public String a() {
        return "Mineshaft";
    }
    
    public aqf(final Map<String, String> \u2603) {
        this.d = 0.004;
        for (final Map.Entry<String, String> entry : \u2603.entrySet()) {
            if (entry.getKey().equals("chance")) {
                this.d = ns.a(entry.getValue(), this.d);
            }
        }
    }
    
    @Override
    protected boolean a(final int \u2603, final int \u2603) {
        return this.b.nextDouble() < this.d && this.b.nextInt(80) < Math.max(Math.abs(\u2603), Math.abs(\u2603));
    }
    
    @Override
    protected aqu b(final int \u2603, final int \u2603) {
        return new aqh(this.c, this.b, \u2603, \u2603);
    }
}
