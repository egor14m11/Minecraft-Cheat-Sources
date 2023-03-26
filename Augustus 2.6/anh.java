import java.io.ByteArrayOutputStream;
import net.minecraft.server.MinecraftServer;
import java.io.OutputStream;
import java.util.zip.DeflaterOutputStream;
import java.io.DataOutputStream;
import java.util.zip.InflaterInputStream;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import com.google.common.collect.Lists;
import java.util.List;
import java.io.RandomAccessFile;
import java.io.File;

// 
// Decompiled by Procyon v0.5.36
// 

public class anh
{
    private static final byte[] a;
    private final File b;
    private RandomAccessFile c;
    private final int[] d;
    private final int[] e;
    private List<Boolean> f;
    private int g;
    private long h;
    
    public anh(final File \u2603) {
        this.d = new int[1024];
        this.e = new int[1024];
        this.b = \u2603;
        this.g = 0;
        try {
            if (\u2603.exists()) {
                this.h = \u2603.lastModified();
            }
            this.c = new RandomAccessFile(\u2603, "rw");
            if (this.c.length() < 4096L) {
                for (int i = 0; i < 1024; ++i) {
                    this.c.writeInt(0);
                }
                for (int i = 0; i < 1024; ++i) {
                    this.c.writeInt(0);
                }
                this.g += 8192;
            }
            if ((this.c.length() & 0xFFFL) != 0x0L) {
                for (int i = 0; i < (this.c.length() & 0xFFFL); ++i) {
                    this.c.write(0);
                }
            }
            int i = (int)this.c.length() / 4096;
            this.f = (List<Boolean>)Lists.newArrayListWithCapacity(i);
            for (int j = 0; j < i; ++j) {
                this.f.add(true);
            }
            this.f.set(0, false);
            this.f.set(1, false);
            this.c.seek(0L);
            for (int j = 0; j < 1024; ++j) {
                final int n = this.c.readInt();
                this.d[j] = n;
                if (n != 0 && (n >> 8) + (n & 0xFF) <= this.f.size()) {
                    for (int k = 0; k < (n & 0xFF); ++k) {
                        this.f.set((n >> 8) + k, false);
                    }
                }
            }
            for (int j = 0; j < 1024; ++j) {
                final int n = this.c.readInt();
                this.e[j] = n;
            }
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public synchronized DataInputStream a(final int \u2603, final int \u2603) {
        if (this.d(\u2603, \u2603)) {
            return null;
        }
        try {
            final int e = this.e(\u2603, \u2603);
            if (e == 0) {
                return null;
            }
            final int n = e >> 8;
            final int n2 = e & 0xFF;
            if (n + n2 > this.f.size()) {
                return null;
            }
            this.c.seek(n * 4096);
            final int int1 = this.c.readInt();
            if (int1 > 4096 * n2) {
                return null;
            }
            if (int1 <= 0) {
                return null;
            }
            final byte byte1 = this.c.readByte();
            if (byte1 == 1) {
                final byte[] array = new byte[int1 - 1];
                this.c.read(array);
                return new DataInputStream(new BufferedInputStream(new GZIPInputStream(new ByteArrayInputStream(array))));
            }
            if (byte1 == 2) {
                final byte[] array = new byte[int1 - 1];
                this.c.read(array);
                return new DataInputStream(new BufferedInputStream(new InflaterInputStream(new ByteArrayInputStream(array))));
            }
            return null;
        }
        catch (IOException ex) {
            return null;
        }
    }
    
    public DataOutputStream b(final int \u2603, final int \u2603) {
        if (this.d(\u2603, \u2603)) {
            return null;
        }
        return new DataOutputStream(new DeflaterOutputStream(new a(\u2603, \u2603)));
    }
    
    protected synchronized void a(final int \u2603, final int \u2603, final byte[] \u2603, final int \u2603) {
        try {
            final int e = this.e(\u2603, \u2603);
            int size = e >> 8;
            final int n = e & 0xFF;
            final int n2 = (\u2603 + 5) / 4096 + 1;
            if (n2 >= 256) {
                return;
            }
            if (size != 0 && n == n2) {
                this.a(size, \u2603, \u2603);
            }
            else {
                for (int i = 0; i < n; ++i) {
                    this.f.set(size + i, true);
                }
                int i = this.f.indexOf(true);
                int n3 = 0;
                if (i != -1) {
                    for (int j = i; j < this.f.size(); ++j) {
                        if (n3 != 0) {
                            if (this.f.get(j)) {
                                ++n3;
                            }
                            else {
                                n3 = 0;
                            }
                        }
                        else if (this.f.get(j)) {
                            i = j;
                            n3 = 1;
                        }
                        if (n3 >= n2) {
                            break;
                        }
                    }
                }
                if (n3 >= n2) {
                    size = i;
                    this.a(\u2603, \u2603, size << 8 | n2);
                    for (int j = 0; j < n2; ++j) {
                        this.f.set(size + j, false);
                    }
                    this.a(size, \u2603, \u2603);
                }
                else {
                    this.c.seek(this.c.length());
                    size = this.f.size();
                    for (int j = 0; j < n2; ++j) {
                        this.c.write(anh.a);
                        this.f.add(false);
                    }
                    this.g += 4096 * n2;
                    this.a(size, \u2603, \u2603);
                    this.a(\u2603, \u2603, size << 8 | n2);
                }
            }
            this.b(\u2603, \u2603, (int)(MinecraftServer.az() / 1000L));
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    private void a(final int \u2603, final byte[] \u2603, final int \u2603) throws IOException {
        this.c.seek(\u2603 * 4096);
        this.c.writeInt(\u2603 + 1);
        this.c.writeByte(2);
        this.c.write(\u2603, 0, \u2603);
    }
    
    private boolean d(final int \u2603, final int \u2603) {
        return \u2603 < 0 || \u2603 >= 32 || \u2603 < 0 || \u2603 >= 32;
    }
    
    private int e(final int \u2603, final int \u2603) {
        return this.d[\u2603 + \u2603 * 32];
    }
    
    public boolean c(final int \u2603, final int \u2603) {
        return this.e(\u2603, \u2603) != 0;
    }
    
    private void a(final int \u2603, final int \u2603, final int \u2603) throws IOException {
        this.d[\u2603 + \u2603 * 32] = \u2603;
        this.c.seek((\u2603 + \u2603 * 32) * 4);
        this.c.writeInt(\u2603);
    }
    
    private void b(final int \u2603, final int \u2603, final int \u2603) throws IOException {
        this.e[\u2603 + \u2603 * 32] = \u2603;
        this.c.seek(4096 + (\u2603 + \u2603 * 32) * 4);
        this.c.writeInt(\u2603);
    }
    
    public void c() throws IOException {
        if (this.c != null) {
            this.c.close();
        }
    }
    
    static {
        a = new byte[4096];
    }
    
    class a extends ByteArrayOutputStream
    {
        private int b;
        private int c;
        
        public a(final int \u2603, final int \u2603) {
            super(8096);
            this.b = \u2603;
            this.c = \u2603;
        }
        
        @Override
        public void close() {
            anh.this.a(this.b, this.c, this.buf, this.count);
        }
    }
}
