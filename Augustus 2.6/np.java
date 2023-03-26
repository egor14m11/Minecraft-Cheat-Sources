import java.lang.reflect.Array;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReadWriteLock;

// 
// Decompiled by Procyon v0.5.36
// 

public class np<T>
{
    private final T[] a;
    private final Class<? extends T> b;
    private final ReadWriteLock c;
    private int d;
    private int e;
    
    public np(final Class<? extends T> \u2603, final int \u2603) {
        this.c = new ReentrantReadWriteLock();
        this.b = \u2603;
        this.a = (T[])Array.newInstance(\u2603, \u2603);
    }
    
    public T a(final T \u2603) {
        this.c.writeLock().lock();
        this.a[this.e] = \u2603;
        this.e = (this.e + 1) % this.b();
        if (this.d < this.b()) {
            ++this.d;
        }
        this.c.writeLock().unlock();
        return \u2603;
    }
    
    public int b() {
        this.c.readLock().lock();
        final int length = this.a.length;
        this.c.readLock().unlock();
        return length;
    }
    
    public T[] c() {
        final T[] array = (T[])Array.newInstance(this.b, this.d);
        this.c.readLock().lock();
        for (int i = 0; i < this.d; ++i) {
            int n = (this.e - this.d + i) % this.b();
            if (n < 0) {
                n += this.b();
            }
            array[i] = this.a[n];
        }
        this.c.readLock().unlock();
        return array;
    }
}
