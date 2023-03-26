import org.apache.commons.io.IOUtils;
import com.google.gson.JsonParser;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import com.google.common.collect.Maps;
import com.google.gson.JsonObject;
import java.io.InputStream;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public class bno implements bnh
{
    private final Map<String, bnw> a;
    private final String b;
    private final jy c;
    private final InputStream d;
    private final InputStream e;
    private final bny f;
    private boolean g;
    private JsonObject h;
    
    public bno(final String \u2603, final jy \u2603, final InputStream \u2603, final InputStream \u2603, final bny \u2603) {
        this.a = (Map<String, bnw>)Maps.newHashMap();
        this.b = \u2603;
        this.c = \u2603;
        this.d = \u2603;
        this.e = \u2603;
        this.f = \u2603;
    }
    
    @Override
    public jy a() {
        return this.c;
    }
    
    @Override
    public InputStream b() {
        return this.d;
    }
    
    @Override
    public boolean c() {
        return this.e != null;
    }
    
    @Override
    public <T extends bnw> T a(final String \u2603) {
        if (!this.c()) {
            return null;
        }
        if (this.h == null && !this.g) {
            this.g = true;
            BufferedReader bufferedReader = null;
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(this.e));
                this.h = new JsonParser().parse(bufferedReader).getAsJsonObject();
            }
            finally {
                IOUtils.closeQuietly(bufferedReader);
            }
        }
        T a = (T)this.a.get(\u2603);
        if (a == null) {
            a = this.f.a(\u2603, this.h);
        }
        return a;
    }
    
    @Override
    public String d() {
        return this.b;
    }
    
    @Override
    public boolean equals(final Object \u2603) {
        if (this == \u2603) {
            return true;
        }
        if (!(\u2603 instanceof bno)) {
            return false;
        }
        final bno bno = (bno)\u2603;
        Label_0054: {
            if (this.c != null) {
                if (this.c.equals(bno.c)) {
                    break Label_0054;
                }
            }
            else if (bno.c == null) {
                break Label_0054;
            }
            return false;
        }
        if (this.b != null) {
            if (this.b.equals(bno.b)) {
                return true;
            }
        }
        else if (bno.b == null) {
            return true;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        int n = (this.b != null) ? this.b.hashCode() : 0;
        n = 31 * n + ((this.c != null) ? this.c.hashCode() : 0);
        return n;
    }
}
