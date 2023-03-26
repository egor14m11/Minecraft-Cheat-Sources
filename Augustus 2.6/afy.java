// 
// Decompiled by Procyon v0.5.36
// 

public class afy extends afh
{
    protected afy() {
        super(arm.d);
        this.a(yz.c);
    }
    
    @Override
    public boolean a(final adm \u2603, final cj \u2603, final alz \u2603, final wn \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (\u2603.D) {
            return true;
        }
        \u2603.a(new a(\u2603, \u2603));
        \u2603.b(na.Z);
        return true;
    }
    
    public static class a implements ol
    {
        private final adm a;
        private final cj b;
        
        public a(final adm \u2603, final cj \u2603) {
            this.a = \u2603;
            this.b = \u2603;
        }
        
        @Override
        public String e_() {
            return null;
        }
        
        @Override
        public boolean l_() {
            return false;
        }
        
        @Override
        public eu f_() {
            return new fb(afi.ai.a() + ".name", new Object[0]);
        }
        
        @Override
        public xi a(final wm \u2603, final wn \u2603) {
            return new xq(\u2603, this.a, this.b);
        }
        
        @Override
        public String k() {
            return "minecraft:crafting_table";
        }
    }
}
