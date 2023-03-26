// 
// Decompiled by Procyon v0.5.36
// 

public class bou implements bnj
{
    private db<bov, boq> a;
    private final bmh b;
    private final bgc c;
    private boq d;
    
    public bou(final bmh \u2603) {
        this.b = \u2603;
        this.c = new bgc(this);
    }
    
    @Override
    public void a(final bni \u2603) {
        final bot bot = new bot(\u2603, this.b, this.c);
        this.a = bot.a();
        this.d = this.a.a(bot.a);
        this.c.c();
    }
    
    public boq a(final bov \u2603) {
        if (\u2603 == null) {
            return this.d;
        }
        final boq boq = this.a.a(\u2603);
        return (boq == null) ? this.d : boq;
    }
    
    public boq a() {
        return this.d;
    }
    
    public bmh b() {
        return this.b;
    }
    
    public bgc c() {
        return this.c;
    }
}
