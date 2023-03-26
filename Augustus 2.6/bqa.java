import com.google.common.collect.Maps;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public class bqa extends dd<jy, bpy>
{
    private Map<jy, bpy> a;
    
    @Override
    protected Map<jy, bpy> b() {
        return this.a = (Map<jy, bpy>)Maps.newHashMap();
    }
    
    public void a(final bpy \u2603) {
        this.a(\u2603.c(), \u2603);
    }
    
    public void a() {
        this.a.clear();
    }
}
