import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class ayx
{
    private static final ayx a;
    private Random b;
    private String[] c;
    
    private ayx() {
        this.b = new Random();
        this.c = "the elder scrolls klaatu berata niktu xyzzy bless curse light darkness fire air earth water hot dry cold wet ignite snuff embiggen twist shorten stretch fiddle destroy imbue galvanize enchant free limited range of towards inside sphere cube self other ball mental physical grow shrink demon elemental spirit animal creature beast humanoid undead fresh stale ".split(" ");
    }
    
    public static ayx a() {
        return ayx.a;
    }
    
    public String b() {
        final int n = this.b.nextInt(2) + 3;
        String s = "";
        for (int i = 0; i < n; ++i) {
            if (i > 0) {
                s += " ";
            }
            s += this.c[this.b.nextInt(this.c.length)];
        }
        return s;
    }
    
    public void a(final long \u2603) {
        this.b.setSeed(\u2603);
    }
    
    static {
        a = new ayx();
    }
}
