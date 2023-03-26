import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class fz implements ff<fj>
{
    private adg a;
    private a[] b;
    
    public fz() {
    }
    
    public fz(final int \u2603, final short[] \u2603, final amy \u2603) {
        this.a = new adg(\u2603.a, \u2603.b);
        this.b = new a[\u2603];
        for (int i = 0; i < this.b.length; ++i) {
            this.b[i] = new a(\u2603[i], \u2603);
        }
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = new adg(\u2603.readInt(), \u2603.readInt());
        this.b = new a[\u2603.e()];
        for (int i = 0; i < this.b.length; ++i) {
            this.b[i] = new a(\u2603.readShort(), afh.d.a(\u2603.e()));
        }
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.writeInt(this.a.a);
        \u2603.writeInt(this.a.b);
        \u2603.b(this.b.length);
        for (final a a : this.b) {
            \u2603.writeShort(a.b());
            \u2603.b(afh.d.b(a.c()));
        }
    }
    
    @Override
    public void a(final fj \u2603) {
        \u2603.a(this);
    }
    
    public a[] a() {
        return this.b;
    }
    
    public class a
    {
        private final short b;
        private final alz c;
        
        public a(final short \u2603, final alz \u2603) {
            this.b = \u2603;
            this.c = \u2603;
        }
        
        public a(final short \u2603, final amy \u2603) {
            this.b = \u2603;
            this.c = \u2603.g(this.a());
        }
        
        public cj a() {
            return new cj(fz.this.a.a(this.b >> 12 & 0xF, this.b & 0xFF, this.b >> 8 & 0xF));
        }
        
        public short b() {
            return this.b;
        }
        
        public alz c() {
            return this.c;
        }
    }
}
