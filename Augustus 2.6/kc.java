import org.apache.commons.lang3.StringUtils;
import java.io.FileNotFoundException;
import com.google.common.collect.Lists;
import java.util.List;
import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class kc extends IOException
{
    private final List<a> a;
    private final String b;
    
    public kc(final String \u2603) {
        (this.a = (List<a>)Lists.newArrayList()).add(new a());
        this.b = \u2603;
    }
    
    public kc(final String \u2603, final Throwable \u2603) {
        super(\u2603);
        (this.a = (List<a>)Lists.newArrayList()).add(new a());
        this.b = \u2603;
    }
    
    public void a(final String \u2603) {
        this.a.get(0).a(\u2603);
    }
    
    public void b(final String \u2603) {
        this.a.get(0).a = \u2603;
        this.a.add(0, new a());
    }
    
    @Override
    public String getMessage() {
        return "Invalid " + this.a.get(this.a.size() - 1).toString() + ": " + this.b;
    }
    
    public static kc a(final Exception \u2603) {
        if (\u2603 instanceof kc) {
            return (kc)\u2603;
        }
        String message = \u2603.getMessage();
        if (\u2603 instanceof FileNotFoundException) {
            message = "File not found";
        }
        return new kc(message, \u2603);
    }
    
    public static class a
    {
        private String a;
        private final List<String> b;
        
        private a() {
            this.a = null;
            this.b = (List<String>)Lists.newArrayList();
        }
        
        private void a(final String \u2603) {
            this.b.add(0, \u2603);
        }
        
        public String b() {
            return StringUtils.join(this.b, "->");
        }
        
        @Override
        public String toString() {
            if (this.a != null) {
                if (!this.b.isEmpty()) {
                    return this.a + " " + this.b();
                }
                return this.a;
            }
            else {
                if (!this.b.isEmpty()) {
                    return "(Unknown file) " + this.b();
                }
                return "(Unknown file)";
            }
        }
    }
}
