import org.apache.logging.log4j.LogManager;
import java.awt.image.BufferedImage;
import com.google.gson.JsonObject;
import org.apache.commons.io.IOUtils;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import com.google.common.base.Charsets;
import java.io.IOException;
import java.io.InputStream;
import java.io.File;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class bmx implements bnk
{
    private static final Logger b;
    protected final File a;
    
    public bmx(final File \u2603) {
        this.a = \u2603;
    }
    
    private static String c(final jy \u2603) {
        return String.format("%s/%s/%s", "assets", \u2603.b(), \u2603.a());
    }
    
    protected static String a(final File \u2603, final File \u2603) {
        return \u2603.toURI().relativize(\u2603.toURI()).getPath();
    }
    
    @Override
    public InputStream a(final jy \u2603) throws IOException {
        return this.a(c(\u2603));
    }
    
    @Override
    public boolean b(final jy \u2603) {
        return this.b(c(\u2603));
    }
    
    protected abstract InputStream a(final String p0) throws IOException;
    
    protected abstract boolean b(final String p0);
    
    protected void c(final String \u2603) {
        bmx.b.warn("ResourcePack: ignored non-lowercase namespace: %s in %s", new Object[] { \u2603, this.a });
    }
    
    @Override
    public <T extends bnw> T a(final bny \u2603, final String \u2603) throws IOException {
        return a(\u2603, this.a("pack.mcmeta"), \u2603);
    }
    
    static <T extends bnw> T a(final bny \u2603, final InputStream \u2603, final String \u2603) {
        JsonObject asJsonObject = null;
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(\u2603, Charsets.UTF_8));
            asJsonObject = new JsonParser().parse(bufferedReader).getAsJsonObject();
        }
        catch (RuntimeException cause) {
            throw new JsonParseException(cause);
        }
        finally {
            IOUtils.closeQuietly(bufferedReader);
        }
        return \u2603.a(\u2603, asJsonObject);
    }
    
    @Override
    public BufferedImage a() throws IOException {
        return bml.a(this.a("pack.png"));
    }
    
    @Override
    public String b() {
        return this.a.getName();
    }
    
    static {
        b = LogManager.getLogger();
    }
}
