import org.apache.logging.log4j.LogManager;
import com.google.gson.JsonParseException;
import java.io.IOException;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class azq extends azp
{
    private static final Logger c;
    private final bnk d;
    private final jy e;
    
    public azq(final azo \u2603) {
        super(\u2603);
        this.d = this.a.R().a;
        blz a;
        try {
            a = new blz(this.d.a());
        }
        catch (IOException ex) {
            a = bml.a;
        }
        this.e = this.a.P().a("texturepackicon", a);
    }
    
    @Override
    protected int a() {
        return 1;
    }
    
    @Override
    protected String b() {
        try {
            final boj boj = this.d.a(this.a.R().b, "pack");
            if (boj != null) {
                return boj.a().d();
            }
        }
        catch (JsonParseException throwable) {
            azq.c.error("Couldn't load metadata info", throwable);
        }
        catch (IOException throwable2) {
            azq.c.error("Couldn't load metadata info", throwable2);
        }
        return a.m + "Missing " + "pack.mcmeta" + " :(";
    }
    
    @Override
    protected boolean f() {
        return false;
    }
    
    @Override
    protected boolean g() {
        return false;
    }
    
    @Override
    protected boolean h() {
        return false;
    }
    
    @Override
    protected boolean i() {
        return false;
    }
    
    @Override
    protected String c() {
        return "Default";
    }
    
    @Override
    protected void d() {
        this.a.P().a(this.e);
    }
    
    @Override
    protected boolean e() {
        return false;
    }
    
    static {
        c = LogManager.getLogger();
    }
}
