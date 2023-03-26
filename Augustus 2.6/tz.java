// 
// Decompiled by Procyon v0.5.36
// 

public abstract class tz extends ps implements pi
{
    public tz(final adm \u2603) {
        super(\u2603);
    }
    
    @Override
    public boolean aY() {
        return true;
    }
    
    @Override
    public boolean bR() {
        return true;
    }
    
    @Override
    public boolean bS() {
        return this.o.a(this.aR(), this);
    }
    
    @Override
    public int w() {
        return 120;
    }
    
    @Override
    protected boolean C() {
        return true;
    }
    
    @Override
    protected int b(final wn \u2603) {
        return 1 + this.o.s.nextInt(3);
    }
    
    @Override
    public void K() {
        int az = this.az();
        super.K();
        if (this.ai() && !this.V()) {
            this.h(--az);
            if (this.az() == -20) {
                this.h(0);
                this.a(ow.f, 2.0f);
            }
        }
        else {
            this.h(300);
        }
    }
    
    @Override
    public boolean aL() {
        return false;
    }
}
