import com.google.common.collect.Maps;
import java.util.Map;
import java.io.InputStream;
import org.apache.commons.io.IOUtils;
import java.io.IOException;
import java.nio.ByteBuffer;
import org.apache.commons.lang3.StringUtils;
import org.lwjgl.BufferUtils;
import java.io.BufferedInputStream;

// 
// Decompiled by Procyon v0.5.36
// 

public class blt
{
    private final a a;
    private final String b;
    private int c;
    private int d;
    
    private blt(final a \u2603, final int \u2603, final String \u2603) {
        this.d = 0;
        this.a = \u2603;
        this.c = \u2603;
        this.b = \u2603;
    }
    
    public void a(final blq \u2603) {
        ++this.d;
        bqs.b(\u2603.h(), this.c);
    }
    
    public void b(final blq \u2603) {
        --this.d;
        if (this.d <= 0) {
            bqs.a(this.c);
            this.a.d().remove(this.b);
        }
    }
    
    public String a() {
        return this.b;
    }
    
    public static blt a(final bni \u2603, final a \u2603, final String \u2603) throws IOException {
        blt blt = \u2603.d().get(\u2603);
        if (blt == null) {
            final jy jy = new jy("shaders/program/" + \u2603 + \u2603.b());
            final BufferedInputStream \u26032 = new BufferedInputStream(\u2603.a(jy).b());
            final byte[] a = a(\u26032);
            final ByteBuffer byteBuffer = BufferUtils.createByteBuffer(a.length);
            byteBuffer.put(a);
            byteBuffer.position(0);
            final int b = bqs.b(\u2603.c());
            bqs.a(b, byteBuffer);
            bqs.c(b);
            if (bqs.c(b, bqs.n) == 0) {
                final String trim = StringUtils.trim(bqs.d(b, 32768));
                final kc kc = new kc("Couldn't compile " + \u2603.a() + " program: " + trim);
                kc.b(jy.a());
                throw kc;
            }
            blt = new blt(\u2603, b, \u2603);
            \u2603.d().put(\u2603, blt);
        }
        return blt;
    }
    
    protected static byte[] a(final BufferedInputStream \u2603) throws IOException {
        try {
            return IOUtils.toByteArray(\u2603);
        }
        finally {
            \u2603.close();
        }
    }
    
    public enum a
    {
        a("vertex", ".vsh", bqs.o), 
        b("fragment", ".fsh", bqs.p);
        
        private final String c;
        private final String d;
        private final int e;
        private final Map<String, blt> f;
        
        private a(final String \u2603, final String \u2603, final int \u2603) {
            this.f = (Map<String, blt>)Maps.newHashMap();
            this.c = \u2603;
            this.d = \u2603;
            this.e = \u2603;
        }
        
        public String a() {
            return this.c;
        }
        
        protected String b() {
            return this.d;
        }
        
        protected int c() {
            return this.e;
        }
        
        protected Map<String, blt> d() {
            return this.f;
        }
    }
}
