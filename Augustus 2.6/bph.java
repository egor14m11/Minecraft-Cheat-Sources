import com.google.common.collect.Lists;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class bph
{
    private final List<a> a;
    private boolean b;
    private bpg c;
    
    public bph() {
        this.a = (List<a>)Lists.newArrayList();
    }
    
    public List<a> a() {
        return this.a;
    }
    
    public boolean b() {
        return this.b;
    }
    
    public void a(final boolean \u2603) {
        this.b = \u2603;
    }
    
    public bpg c() {
        return this.c;
    }
    
    public void a(final bpg \u2603) {
        this.c = \u2603;
    }
    
    public static class a
    {
        private String a;
        private float b;
        private float c;
        private int d;
        private bph.a.a e;
        private boolean f;
        
        public a() {
            this.b = 1.0f;
            this.c = 1.0f;
            this.d = 1;
            this.e = bph.a.a.a;
            this.f = false;
        }
        
        public String a() {
            return this.a;
        }
        
        public void a(final String \u2603) {
            this.a = \u2603;
        }
        
        public float b() {
            return this.b;
        }
        
        public void a(final float \u2603) {
            this.b = \u2603;
        }
        
        public float c() {
            return this.c;
        }
        
        public void b(final float \u2603) {
            this.c = \u2603;
        }
        
        public int d() {
            return this.d;
        }
        
        public void a(final int \u2603) {
            this.d = \u2603;
        }
        
        public bph.a.a e() {
            return this.e;
        }
        
        public void a(final bph.a.a \u2603) {
            this.e = \u2603;
        }
        
        public boolean f() {
            return this.f;
        }
        
        public void a(final boolean \u2603) {
            this.f = \u2603;
        }
        
        public enum a
        {
            a("file"), 
            b("event");
            
            private final String c;
            
            private a(final String \u2603) {
                this.c = \u2603;
            }
            
            public static a a(final String \u2603) {
                for (final a a : values()) {
                    if (a.c.equals(\u2603)) {
                        return a;
                    }
                }
                return null;
            }
        }
    }
}
