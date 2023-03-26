import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class bpv implements km
{
    private final Random a;
    private final ave b;
    private bpj c;
    private int d;
    
    public bpv(final ave \u2603) {
        this.a = new Random();
        this.d = 100;
        this.b = \u2603;
    }
    
    @Override
    public void c() {
        final a x = this.b.X();
        if (this.c != null) {
            if (!x.a().equals(this.c.a())) {
                this.b.W().b(this.c);
                this.d = ns.a(this.a, 0, x.b() / 2);
            }
            if (!this.b.W().c(this.c)) {
                this.c = null;
                this.d = Math.min(ns.a(this.a, x.b(), x.c()), this.d);
            }
        }
        if (this.c == null && this.d-- <= 0) {
            this.a(x);
        }
    }
    
    public void a(final a \u2603) {
        this.c = bpf.a(\u2603.a());
        this.b.W().a(this.c);
        this.d = Integer.MAX_VALUE;
    }
    
    public void a() {
        if (this.c != null) {
            this.b.W().b(this.c);
            this.c = null;
            this.d = 0;
        }
    }
    
    public enum a
    {
        a(new jy("minecraft:music.menu"), 20, 600), 
        b(new jy("minecraft:music.game"), 12000, 24000), 
        c(new jy("minecraft:music.game.creative"), 1200, 3600), 
        d(new jy("minecraft:music.game.end.credits"), Integer.MAX_VALUE, Integer.MAX_VALUE), 
        e(new jy("minecraft:music.game.nether"), 1200, 3600), 
        f(new jy("minecraft:music.game.end.dragon"), 0, 0), 
        g(new jy("minecraft:music.game.end"), 6000, 24000);
        
        private final jy h;
        private final int i;
        private final int j;
        
        private a(final jy \u2603, final int \u2603, final int \u2603) {
            this.h = \u2603;
            this.i = \u2603;
            this.j = \u2603;
        }
        
        public jy a() {
            return this.h;
        }
        
        public int b() {
            return this.i;
        }
        
        public int c() {
            return this.j;
        }
    }
}
