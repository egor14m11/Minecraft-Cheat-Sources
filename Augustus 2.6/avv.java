import java.util.Iterator;
import java.util.Map;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.Display;
import com.google.common.collect.Lists;
import net.minecraft.client.ClientBrandRetriever;
import java.util.List;
import com.google.common.base.Strings;

// 
// Decompiled by Procyon v0.5.36
// 

public class avv extends avp
{
    private final ave a;
    private final avn f;
    
    public avv(final ave \u2603) {
        this.a = \u2603;
        this.f = \u2603.k;
    }
    
    public void a(final avr \u2603) {
        this.a.A.a("debug");
        bfl.E();
        this.a();
        this.b(\u2603);
        bfl.F();
        if (this.a.t.aD) {
            this.e();
        }
        this.a.A.b();
    }
    
    private boolean d() {
        return this.a.h.cq() || this.a.t.w;
    }
    
    protected void a() {
        final List<String> b = this.b();
        for (int i = 0; i < b.size(); ++i) {
            final String \u2603 = b.get(i);
            if (!Strings.isNullOrEmpty(\u2603)) {
                final int a = this.f.a;
                final int a2 = this.f.a(\u2603);
                final int n = 2;
                final int \u26032 = 2 + a * i;
                avp.a(1, \u26032 - 1, 2 + a2 + 1, \u26032 + a - 1, -1873784752);
                this.f.a(\u2603, 2, \u26032, 14737632);
            }
        }
    }
    
    protected void b(final avr \u2603) {
        final List<String> c = this.c();
        for (int i = 0; i < c.size(); ++i) {
            final String \u26032 = c.get(i);
            if (!Strings.isNullOrEmpty(\u26032)) {
                final int a = this.f.a;
                final int a2 = this.f.a(\u26032);
                final int \u26033 = \u2603.a() - 2 - a2;
                final int \u26034 = 2 + a * i;
                avp.a(\u26033 - 1, \u26034 - 1, \u26033 + a2 + 1, \u26034 + a - 1, -1873784752);
                this.f.a(\u26032, \u26033, \u26034, 14737632);
            }
        }
    }
    
    protected List<String> b() {
        final cj \u2603 = new cj(this.a.ac().s, this.a.ac().aR().b, this.a.ac().u);
        if (this.d()) {
            return Lists.newArrayList("Minecraft 1.8.8 (" + this.a.c() + "/" + ClientBrandRetriever.getClientModName() + ")", this.a.C, this.a.g.f(), this.a.g.g(), "P: " + this.a.j.b() + ". T: " + this.a.f.z(), this.a.f.A(), "", String.format("Chunk-relative: %d %d %d", \u2603.n() & 0xF, \u2603.o() & 0xF, \u2603.p() & 0xF));
        }
        final pk ac = this.a.ac();
        final cq ap = ac.aP();
        String s = "Invalid";
        switch (avv$1.a[ap.ordinal()]) {
            case 1: {
                s = "Towards negative Z";
                break;
            }
            case 2: {
                s = "Towards positive Z";
                break;
            }
            case 3: {
                s = "Towards negative X";
                break;
            }
            case 4: {
                s = "Towards positive X";
                break;
            }
        }
        final List<String> arrayList = Lists.newArrayList("Minecraft 1.8.8 (" + this.a.c() + "/" + ClientBrandRetriever.getClientModName() + ")", this.a.C, this.a.g.f(), this.a.g.g(), "P: " + this.a.j.b() + ". T: " + this.a.f.z(), this.a.f.A(), "", String.format("XYZ: %.3f / %.5f / %.3f", this.a.ac().s, this.a.ac().aR().b, this.a.ac().u), String.format("Block: %d %d %d", \u2603.n(), \u2603.o(), \u2603.p()), String.format("Chunk: %d %d %d in %d %d %d", \u2603.n() & 0xF, \u2603.o() & 0xF, \u2603.p() & 0xF, \u2603.n() >> 4, \u2603.o() >> 4, \u2603.p() >> 4), String.format("Facing: %s (%s) (%.1f / %.1f)", ap, s, ns.g(ac.y), ns.g(ac.z)));
        if (this.a.f != null && this.a.f.e(\u2603)) {
            final amy f = this.a.f.f(\u2603);
            arrayList.add("Biome: " + f.a(\u2603, this.a.f.v()).ah);
            arrayList.add("Light: " + f.a(\u2603, 0) + " (" + f.a(ads.a, \u2603) + " sky, " + f.a(ads.b, \u2603) + " block)");
            ok ok = this.a.f.E(\u2603);
            if (this.a.E() && this.a.G() != null) {
                final lf a = this.a.G().ap().a(this.a.h.aK());
                if (a != null) {
                    ok = a.o.E(new cj(a));
                }
            }
            arrayList.add(String.format("Local Difficulty: %.2f (Day %d)", ok.b(), this.a.f.L() / 24000L));
        }
        if (this.a.o != null && this.a.o.a()) {
            arrayList.add("Shader: " + this.a.o.f().b());
        }
        if (this.a.s != null && this.a.s.a == auh.a.b && this.a.s.a() != null) {
            final cj a2 = this.a.s.a();
            arrayList.add(String.format("Looking at: %d %d %d", a2.n(), a2.o(), a2.p()));
        }
        return arrayList;
    }
    
    protected List<String> c() {
        final long maxMemory = Runtime.getRuntime().maxMemory();
        final long totalMemory = Runtime.getRuntime().totalMemory();
        final long freeMemory = Runtime.getRuntime().freeMemory();
        final long \u2603 = totalMemory - freeMemory;
        final List<String> arrayList = Lists.newArrayList(String.format("Java: %s %dbit", System.getProperty("java.version"), this.a.U() ? 64 : 32), String.format("Mem: % 2d%% %03d/%03dMB", \u2603 * 100L / maxMemory, a(\u2603), a(maxMemory)), String.format("Allocated: % 2d%% %03dMB", totalMemory * 100L / maxMemory, a(totalMemory)), "", String.format("CPU: %s", bqs.j()), "", String.format("Display: %dx%d (%s)", Display.getWidth(), Display.getHeight(), GL11.glGetString(7936)), GL11.glGetString(7937), GL11.glGetString(7938));
        if (this.d()) {
            return arrayList;
        }
        if (this.a.s != null && this.a.s.a == auh.a.b && this.a.s.a() != null) {
            final cj a = this.a.s.a();
            alz \u26032 = this.a.f.p(a);
            if (this.a.f.G() != adr.g) {
                \u26032 = \u26032.c().a(\u26032, this.a.f, a);
            }
            arrayList.add("");
            arrayList.add(String.valueOf(afh.c.c(\u26032.c())));
            for (final Map.Entry<amo, Comparable> entry : \u26032.b().entrySet()) {
                String str = entry.getValue().toString();
                if (entry.getValue() == Boolean.TRUE) {
                    str = a.k + str;
                }
                else if (entry.getValue() == Boolean.FALSE) {
                    str = a.m + str;
                }
                arrayList.add(entry.getKey().a() + ": " + str);
            }
        }
        return arrayList;
    }
    
    private void e() {
        bfl.i();
        final nh aj = this.a.aj();
        final int a = aj.a();
        final int b = aj.b();
        final long[] c = aj.c();
        final avr avr = new avr(this.a);
        int i = a;
        int \u2603 = 0;
        avp.a(0, avr.b() - 60, 240, avr.b(), -1873784752);
        while (i != b) {
            final int a2 = aj.a(c[i], 30);
            final int c2 = this.c(ns.a(a2, 0, 60), 0, 30, 60);
            this.b(\u2603, avr.b(), avr.b() - a2, c2);
            ++\u2603;
            i = aj.b(i + 1);
        }
        avp.a(1, avr.b() - 30 + 1, 14, avr.b() - 30 + 10, -1873784752);
        this.f.a("60", 2, avr.b() - 30 + 2, 14737632);
        this.a(0, 239, avr.b() - 30, -1);
        avp.a(1, avr.b() - 60 + 1, 14, avr.b() - 60 + 10, -1873784752);
        this.f.a("30", 2, avr.b() - 60 + 2, 14737632);
        this.a(0, 239, avr.b() - 60, -1);
        this.a(0, 239, avr.b() - 1, -1);
        this.b(0, avr.b() - 60, avr.b(), -1);
        this.b(239, avr.b() - 60, avr.b(), -1);
        if (this.a.t.g <= 120) {
            this.a(0, 239, avr.b() - 60 + this.a.t.g / 2, -16711681);
        }
        bfl.j();
    }
    
    private int c(final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        if (\u2603 < \u2603) {
            return this.a(-16711936, -256, \u2603 / (float)\u2603);
        }
        return this.a(-256, -65536, (\u2603 - \u2603) / (float)(\u2603 - \u2603));
    }
    
    private int a(final int \u2603, final int \u2603, final float \u2603) {
        final int n = \u2603 >> 24 & 0xFF;
        final int n2 = \u2603 >> 16 & 0xFF;
        final int n3 = \u2603 >> 8 & 0xFF;
        final int n4 = \u2603 & 0xFF;
        final int n5 = \u2603 >> 24 & 0xFF;
        final int n6 = \u2603 >> 16 & 0xFF;
        final int n7 = \u2603 >> 8 & 0xFF;
        final int n8 = \u2603 & 0xFF;
        final int a = ns.a((int)(n + (n5 - n) * \u2603), 0, 255);
        final int a2 = ns.a((int)(n2 + (n6 - n2) * \u2603), 0, 255);
        final int a3 = ns.a((int)(n3 + (n7 - n3) * \u2603), 0, 255);
        final int a4 = ns.a((int)(n4 + (n8 - n4) * \u2603), 0, 255);
        return a << 24 | a2 << 16 | a3 << 8 | a4;
    }
    
    private static long a(final long \u2603) {
        return \u2603 / 1024L / 1024L;
    }
}
