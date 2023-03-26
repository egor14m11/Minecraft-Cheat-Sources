import java.util.Iterator;
import net.minecraft.realms.RealmsButton;
import java.util.List;
import java.util.Collections;
import com.google.common.collect.Lists;
import net.minecraft.realms.RealmsScreen;

// 
// Decompiled by Procyon v0.5.36
// 

public class awr extends axu
{
    private RealmsScreen a;
    
    public awr(final RealmsScreen \u2603) {
        this.a = \u2603;
        super.n = Collections.synchronizedList((List<avs>)Lists.newArrayList());
    }
    
    public RealmsScreen a() {
        return this.a;
    }
    
    @Override
    public void b() {
        this.a.init();
        super.b();
    }
    
    public void a(final String \u2603, final int \u2603, final int \u2603, final int \u2603) {
        super.a(this.q, \u2603, \u2603, \u2603, \u2603);
    }
    
    public void b(final String \u2603, final int \u2603, final int \u2603, final int \u2603) {
        super.c(this.q, \u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    public void b(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        this.a.blit(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        super.b(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    public void a(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    public void c() {
        super.c();
    }
    
    @Override
    public boolean d() {
        return super.d();
    }
    
    @Override
    public void b_(final int \u2603) {
        super.b_(\u2603);
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final float \u2603) {
        this.a.render(\u2603, \u2603, \u2603);
    }
    
    public void a(final zx \u2603, final int \u2603, final int \u2603) {
        super.a(\u2603, \u2603, \u2603);
    }
    
    public void a(final String \u2603, final int \u2603, final int \u2603) {
        super.a(\u2603, \u2603, \u2603);
    }
    
    public void a(final List<String> \u2603, final int \u2603, final int \u2603) {
        super.a(\u2603, \u2603, \u2603);
    }
    
    @Override
    public void e() {
        this.a.tick();
        super.e();
    }
    
    public int h() {
        return this.q.a;
    }
    
    public int c(final String \u2603) {
        return this.q.a(\u2603);
    }
    
    public void c(final String \u2603, final int \u2603, final int \u2603, final int \u2603) {
        this.q.a(\u2603, (float)\u2603, (float)\u2603, \u2603);
    }
    
    public List<String> a(final String \u2603, final int \u2603) {
        return this.q.c(\u2603, \u2603);
    }
    
    public final void a(final avs \u2603) {
        this.a.buttonClicked(((awp)\u2603).f());
    }
    
    public void i() {
        super.n.clear();
    }
    
    public void a(final RealmsButton \u2603) {
        super.n.add(\u2603.getProxy());
    }
    
    public List<RealmsButton> j() {
        final List<RealmsButton> arrayListWithExpectedSize = (List<RealmsButton>)Lists.newArrayListWithExpectedSize(super.n.size());
        for (final avs avs : super.n) {
            arrayListWithExpectedSize.add(((awp)avs).f());
        }
        return arrayListWithExpectedSize;
    }
    
    public void b(final RealmsButton \u2603) {
        super.n.remove(\u2603);
    }
    
    public void a(final int \u2603, final int \u2603, final int \u2603) {
        this.a.mouseClicked(\u2603, \u2603, \u2603);
        super.a(\u2603, \u2603, \u2603);
    }
    
    @Override
    public void k() {
        this.a.mouseEvent();
        super.k();
    }
    
    @Override
    public void l() {
        this.a.keyboardEvent();
        super.l();
    }
    
    public void b(final int \u2603, final int \u2603, final int \u2603) {
        this.a.mouseReleased(\u2603, \u2603, \u2603);
    }
    
    public void a(final int \u2603, final int \u2603, final int \u2603, final long \u2603) {
        this.a.mouseDragged(\u2603, \u2603, \u2603, \u2603);
    }
    
    public void a(final char \u2603, final int \u2603) {
        this.a.keyPressed(\u2603, \u2603);
    }
    
    @Override
    public void a(final boolean \u2603, final int \u2603) {
        this.a.confirmResult(\u2603, \u2603);
    }
    
    @Override
    public void m() {
        this.a.removed();
        super.m();
    }
}
