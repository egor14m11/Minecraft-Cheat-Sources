import java.util.Random;
import com.google.common.base.Predicate;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class amx extends amy
{
    public amx(final adm \u2603, final int \u2603, final int \u2603) {
        super(\u2603, \u2603, \u2603);
    }
    
    @Override
    public boolean a(final int \u2603, final int \u2603) {
        return \u2603 == this.a && \u2603 == this.b;
    }
    
    @Override
    public int b(final int \u2603, final int \u2603) {
        return 0;
    }
    
    public void a() {
    }
    
    @Override
    public void b() {
    }
    
    @Override
    public afh a(final cj \u2603) {
        return afi.a;
    }
    
    @Override
    public int b(final cj \u2603) {
        return 255;
    }
    
    @Override
    public int c(final cj \u2603) {
        return 0;
    }
    
    @Override
    public int a(final ads \u2603, final cj \u2603) {
        return \u2603.c;
    }
    
    @Override
    public void a(final ads \u2603, final cj \u2603, final int \u2603) {
    }
    
    @Override
    public int a(final cj \u2603, final int \u2603) {
        return 0;
    }
    
    @Override
    public void a(final pk \u2603) {
    }
    
    @Override
    public void b(final pk \u2603) {
    }
    
    @Override
    public void a(final pk \u2603, final int \u2603) {
    }
    
    @Override
    public boolean d(final cj \u2603) {
        return false;
    }
    
    @Override
    public akw a(final cj \u2603, final a \u2603) {
        return null;
    }
    
    @Override
    public void a(final akw \u2603) {
    }
    
    @Override
    public void a(final cj \u2603, final akw \u2603) {
    }
    
    @Override
    public void e(final cj \u2603) {
    }
    
    @Override
    public void c() {
    }
    
    @Override
    public void d() {
    }
    
    @Override
    public void e() {
    }
    
    @Override
    public void a(final pk \u2603, final aug \u2603, final List<pk> \u2603, final Predicate<? super pk> \u2603) {
    }
    
    @Override
    public <T extends pk> void a(final Class<? extends T> \u2603, final aug \u2603, final List<T> \u2603, final Predicate<? super T> \u2603) {
    }
    
    @Override
    public boolean a(final boolean \u2603) {
        return false;
    }
    
    @Override
    public Random a(final long \u2603) {
        return new Random(this.p().J() + this.a * this.a * 4987142 + this.a * 5947611 + this.b * this.b * 4392871L + this.b * 389711 ^ \u2603);
    }
    
    @Override
    public boolean f() {
        return true;
    }
    
    @Override
    public boolean c(final int \u2603, final int \u2603) {
        return true;
    }
}
