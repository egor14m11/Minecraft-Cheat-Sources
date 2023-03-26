import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.ObjectUtils;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import com.google.common.collect.Maps;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public class pz
{
    private final pk a;
    private boolean b;
    private static final Map<Class<?>, Integer> c;
    private final Map<Integer, a> d;
    private boolean e;
    private ReadWriteLock f;
    
    public pz(final pk \u2603) {
        this.b = true;
        this.d = (Map<Integer, a>)Maps.newHashMap();
        this.f = new ReentrantReadWriteLock();
        this.a = \u2603;
    }
    
    public <T> void a(final int \u2603, final T \u2603) {
        final Integer n = pz.c.get(\u2603.getClass());
        if (n == null) {
            throw new IllegalArgumentException("Unknown data type: " + \u2603.getClass());
        }
        if (\u2603 > 31) {
            throw new IllegalArgumentException("Data value id is too big with " + \u2603 + "! (Max is " + 31 + ")");
        }
        if (this.d.containsKey(\u2603)) {
            throw new IllegalArgumentException("Duplicate id value for " + \u2603 + "!");
        }
        final a a = new a(n, \u2603, \u2603);
        this.f.writeLock().lock();
        this.d.put(\u2603, a);
        this.f.writeLock().unlock();
        this.b = false;
    }
    
    public void a(final int \u2603, final int \u2603) {
        final a a = new a(\u2603, \u2603, null);
        this.f.writeLock().lock();
        this.d.put(\u2603, a);
        this.f.writeLock().unlock();
        this.b = false;
    }
    
    public byte a(final int \u2603) {
        return (byte)this.j(\u2603).b();
    }
    
    public short b(final int \u2603) {
        return (short)this.j(\u2603).b();
    }
    
    public int c(final int \u2603) {
        return (int)this.j(\u2603).b();
    }
    
    public float d(final int \u2603) {
        return (float)this.j(\u2603).b();
    }
    
    public String e(final int \u2603) {
        return (String)this.j(\u2603).b();
    }
    
    public zx f(final int \u2603) {
        return (zx)this.j(\u2603).b();
    }
    
    private a j(final int \u2603) {
        this.f.readLock().lock();
        a a;
        try {
            a = this.d.get(\u2603);
        }
        catch (Throwable \u26032) {
            final b a2 = b.a(\u26032, "Getting synched entity data");
            final c a3 = a2.a("Synched entity data");
            a3.a("Data ID", \u2603);
            throw new e(a2);
        }
        this.f.readLock().unlock();
        return a;
    }
    
    public dc h(final int \u2603) {
        return (dc)this.j(\u2603).b();
    }
    
    public <T> void b(final int \u2603, final T \u2603) {
        final a j = this.j(\u2603);
        if (ObjectUtils.notEqual(\u2603, j.b())) {
            j.a(\u2603);
            this.a.i(\u2603);
            j.a(true);
            this.e = true;
        }
    }
    
    public void i(final int \u2603) {
        this.j(\u2603).d = true;
        this.e = true;
    }
    
    public boolean a() {
        return this.e;
    }
    
    public static void a(final List<a> \u2603, final em \u2603) throws IOException {
        if (\u2603 != null) {
            for (final a \u26032 : \u2603) {
                a(\u2603, \u26032);
            }
        }
        \u2603.writeByte(127);
    }
    
    public List<a> b() {
        List<a> arrayList = null;
        if (this.e) {
            this.f.readLock().lock();
            for (final a a : this.d.values()) {
                if (a.d()) {
                    a.a(false);
                    if (arrayList == null) {
                        arrayList = (List<a>)Lists.newArrayList();
                    }
                    arrayList.add(a);
                }
            }
            this.f.readLock().unlock();
        }
        this.e = false;
        return arrayList;
    }
    
    public void a(final em \u2603) throws IOException {
        this.f.readLock().lock();
        for (final a \u26032 : this.d.values()) {
            a(\u2603, \u26032);
        }
        this.f.readLock().unlock();
        \u2603.writeByte(127);
    }
    
    public List<a> c() {
        List<a> arrayList = null;
        this.f.readLock().lock();
        for (final a a : this.d.values()) {
            if (arrayList == null) {
                arrayList = (List<a>)Lists.newArrayList();
            }
            arrayList.add(a);
        }
        this.f.readLock().unlock();
        return arrayList;
    }
    
    private static void a(final em \u2603, final a \u2603) throws IOException {
        final int \u26032 = (\u2603.c() << 5 | (\u2603.a() & 0x1F)) & 0xFF;
        \u2603.writeByte(\u26032);
        switch (\u2603.c()) {
            case 0: {
                \u2603.writeByte((byte)\u2603.b());
                break;
            }
            case 1: {
                \u2603.writeShort((short)\u2603.b());
                break;
            }
            case 2: {
                \u2603.writeInt((int)\u2603.b());
                break;
            }
            case 3: {
                \u2603.writeFloat((float)\u2603.b());
                break;
            }
            case 4: {
                \u2603.a((String)\u2603.b());
                break;
            }
            case 5: {
                final zx \u26033 = (zx)\u2603.b();
                \u2603.a(\u26033);
                break;
            }
            case 6: {
                final cj cj = (cj)\u2603.b();
                \u2603.writeInt(cj.n());
                \u2603.writeInt(cj.o());
                \u2603.writeInt(cj.p());
                break;
            }
            case 7: {
                final dc dc = (dc)\u2603.b();
                \u2603.writeFloat(dc.b());
                \u2603.writeFloat(dc.c());
                \u2603.writeFloat(dc.d());
                break;
            }
        }
    }
    
    public static List<a> b(final em \u2603) throws IOException {
        List<a> arrayList = null;
        for (int i = \u2603.readByte(); i != 127; i = \u2603.readByte()) {
            if (arrayList == null) {
                arrayList = (List<a>)Lists.newArrayList();
            }
            final int n = (i & 0xE0) >> 5;
            final int n2 = i & 0x1F;
            a a = null;
            switch (n) {
                case 0: {
                    a = new a(n, n2, \u2603.readByte());
                    break;
                }
                case 1: {
                    a = new a(n, n2, \u2603.readShort());
                    break;
                }
                case 2: {
                    a = new a(n, n2, \u2603.readInt());
                    break;
                }
                case 3: {
                    a = new a(n, n2, \u2603.readFloat());
                    break;
                }
                case 4: {
                    a = new a(n, n2, \u2603.c(32767));
                    break;
                }
                case 5: {
                    a = new a(n, n2, \u2603.i());
                    break;
                }
                case 6: {
                    final int int1 = \u2603.readInt();
                    final int int2 = \u2603.readInt();
                    final int int3 = \u2603.readInt();
                    a = new a(n, n2, new cj(int1, int2, int3));
                    break;
                }
                case 7: {
                    final float float1 = \u2603.readFloat();
                    final float float2 = \u2603.readFloat();
                    final float float3 = \u2603.readFloat();
                    a = new a(n, n2, new dc(float1, float2, float3));
                    break;
                }
            }
            arrayList.add(a);
        }
        return arrayList;
    }
    
    public void a(final List<a> \u2603) {
        this.f.writeLock().lock();
        for (final a a : \u2603) {
            final a a2 = this.d.get(a.a());
            if (a2 != null) {
                a2.a(a.b());
                this.a.i(a.a());
            }
        }
        this.f.writeLock().unlock();
        this.e = true;
    }
    
    public boolean d() {
        return this.b;
    }
    
    public void e() {
        this.e = false;
    }
    
    static {
        (c = Maps.newHashMap()).put(Byte.class, 0);
        pz.c.put(Short.class, 1);
        pz.c.put(Integer.class, 2);
        pz.c.put(Float.class, 3);
        pz.c.put(String.class, 4);
        pz.c.put(zx.class, 5);
        pz.c.put(cj.class, 6);
        pz.c.put(dc.class, 7);
    }
    
    public static class a
    {
        private final int a;
        private final int b;
        private Object c;
        private boolean d;
        
        public a(final int \u2603, final int \u2603, final Object \u2603) {
            this.b = \u2603;
            this.c = \u2603;
            this.a = \u2603;
            this.d = true;
        }
        
        public int a() {
            return this.b;
        }
        
        public void a(final Object \u2603) {
            this.c = \u2603;
        }
        
        public Object b() {
            return this.c;
        }
        
        public int c() {
            return this.a;
        }
        
        public boolean d() {
            return this.d;
        }
        
        public void a(final boolean \u2603) {
            this.d = \u2603;
        }
    }
}
