import java.awt.image.BufferedImage;
import java.util.Set;
import java.io.IOException;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.5.36
// 

public interface bnk
{
    InputStream a(final jy p0) throws IOException;
    
    boolean b(final jy p0);
    
    Set<String> c();
    
     <T extends bnw> T a(final bny p0, final String p1) throws IOException;
    
    BufferedImage a() throws IOException;
    
    String b();
}
