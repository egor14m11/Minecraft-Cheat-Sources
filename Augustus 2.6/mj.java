import net.minecraft.server.MinecraftServer;

// 
// Decompiled by Procyon v0.5.36
// 

public class mj implements m
{
    private static final mj a;
    private StringBuffer b;
    
    public mj() {
        this.b = new StringBuffer();
    }
    
    @Override
    public String e_() {
        return "Rcon";
    }
    
    @Override
    public eu f_() {
        return new fa(this.e_());
    }
    
    @Override
    public void a(final eu \u2603) {
        this.b.append(\u2603.c());
    }
    
    @Override
    public boolean a(final int \u2603, final String \u2603) {
        return true;
    }
    
    @Override
    public cj c() {
        return new cj(0, 0, 0);
    }
    
    @Override
    public aui d() {
        return new aui(0.0, 0.0, 0.0);
    }
    
    @Override
    public adm e() {
        return MinecraftServer.N().e();
    }
    
    @Override
    public pk f() {
        return null;
    }
    
    @Override
    public boolean u_() {
        return true;
    }
    
    @Override
    public void a(final n.a \u2603, final int \u2603) {
    }
    
    static {
        a = new mj();
    }
}
