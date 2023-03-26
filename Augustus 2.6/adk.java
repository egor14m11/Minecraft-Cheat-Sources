import java.util.Set;
import java.util.Iterator;
import java.util.TreeMap;

// 
// Decompiled by Procyon v0.5.36
// 

public class adk
{
    private TreeMap<String, a> a;
    
    public adk() {
        this.a = new TreeMap<String, a>();
        this.a("doFireTick", "true", b.b);
        this.a("mobGriefing", "true", b.b);
        this.a("keepInventory", "false", b.b);
        this.a("doMobSpawning", "true", b.b);
        this.a("doMobLoot", "true", b.b);
        this.a("doTileDrops", "true", b.b);
        this.a("doEntityDrops", "true", b.b);
        this.a("commandBlockOutput", "true", b.b);
        this.a("naturalRegeneration", "true", b.b);
        this.a("doDaylightCycle", "true", b.b);
        this.a("logAdminCommands", "true", b.b);
        this.a("showDeathMessages", "true", b.b);
        this.a("randomTickSpeed", "3", b.c);
        this.a("sendCommandFeedback", "true", b.b);
        this.a("reducedDebugInfo", "false", b.b);
    }
    
    public void a(final String \u2603, final String \u2603, final b \u2603) {
        this.a.put(\u2603, new a(\u2603, \u2603));
    }
    
    public void a(final String \u2603, final String \u2603) {
        final a a = this.a.get(\u2603);
        if (a != null) {
            a.a(\u2603);
        }
        else {
            this.a(\u2603, \u2603, b.a);
        }
    }
    
    public String a(final String \u2603) {
        final a a = this.a.get(\u2603);
        if (a != null) {
            return a.a();
        }
        return "";
    }
    
    public boolean b(final String \u2603) {
        final a a = this.a.get(\u2603);
        return a != null && a.b();
    }
    
    public int c(final String \u2603) {
        final a a = this.a.get(\u2603);
        if (a != null) {
            return a.c();
        }
        return 0;
    }
    
    public dn a() {
        final dn dn = new dn();
        for (final String s : this.a.keySet()) {
            final a a = this.a.get(s);
            dn.a(s, a.a());
        }
        return dn;
    }
    
    public void a(final dn \u2603) {
        final Set<String> c = \u2603.c();
        for (final String \u26033 : c) {
            final String \u26032 = \u26033;
            final String j = \u2603.j(\u26032);
            this.a(\u26033, j);
        }
    }
    
    public String[] b() {
        final Set<String> keySet = this.a.keySet();
        return keySet.toArray(new String[keySet.size()]);
    }
    
    public boolean e(final String \u2603) {
        return this.a.containsKey(\u2603);
    }
    
    public boolean a(final String \u2603, final b \u2603) {
        final a a = this.a.get(\u2603);
        return a != null && (a.e() == \u2603 || \u2603 == b.a);
    }
    
    static class a
    {
        private String a;
        private boolean b;
        private int c;
        private double d;
        private final b e;
        
        public a(final String \u2603, final b \u2603) {
            this.e = \u2603;
            this.a(\u2603);
        }
        
        public void a(final String \u2603) {
            this.a = \u2603;
            this.b = Boolean.parseBoolean(\u2603);
            this.c = (this.b ? 1 : 0);
            try {
                this.c = Integer.parseInt(\u2603);
            }
            catch (NumberFormatException ex) {}
            try {
                this.d = Double.parseDouble(\u2603);
            }
            catch (NumberFormatException ex2) {}
        }
        
        public String a() {
            return this.a;
        }
        
        public boolean b() {
            return this.b;
        }
        
        public int c() {
            return this.c;
        }
        
        public b e() {
            return this.e;
        }
    }
    
    public enum b
    {
        a, 
        b, 
        c;
    }
}
