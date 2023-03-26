import com.google.common.collect.ImmutableSet;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.File;
import java.util.Map;
import java.util.Set;

// 
// Decompiled by Procyon v0.5.36
// 

public class bna implements bnk
{
    public static final Set<String> a;
    private final Map<String, File> b;
    
    public bna(final Map<String, File> \u2603) {
        this.b = \u2603;
    }
    
    @Override
    public InputStream a(final jy \u2603) throws IOException {
        final InputStream d = this.d(\u2603);
        if (d != null) {
            return d;
        }
        final InputStream c = this.c(\u2603);
        if (c != null) {
            return c;
        }
        throw new FileNotFoundException(\u2603.a());
    }
    
    public InputStream c(final jy \u2603) throws FileNotFoundException {
        final File file = this.b.get(\u2603.toString());
        return (file == null || !file.isFile()) ? null : new FileInputStream(file);
    }
    
    private InputStream d(final jy \u2603) {
        return bna.class.getResourceAsStream("/assets/" + \u2603.b() + "/" + \u2603.a());
    }
    
    @Override
    public boolean b(final jy \u2603) {
        return this.d(\u2603) != null || this.b.containsKey(\u2603.toString());
    }
    
    @Override
    public Set<String> c() {
        return bna.a;
    }
    
    @Override
    public <T extends bnw> T a(final bny \u2603, final String \u2603) throws IOException {
        try {
            final InputStream \u26032 = new FileInputStream(this.b.get("pack.mcmeta"));
            return bmx.a(\u2603, \u26032, \u2603);
        }
        catch (RuntimeException ex) {
            return null;
        }
        catch (FileNotFoundException ex2) {
            return null;
        }
    }
    
    @Override
    public BufferedImage a() throws IOException {
        return bml.a(bna.class.getResourceAsStream("/" + new jy("pack.png").a()));
    }
    
    @Override
    public String b() {
        return "Default";
    }
    
    static {
        a = ImmutableSet.of("minecraft", "realms");
    }
}
