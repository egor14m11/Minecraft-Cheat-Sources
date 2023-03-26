import java.util.List;
import net.minecraft.server.MinecraftServer;

// 
// Decompiled by Procyon v0.5.36
// 

public class bx extends i
{
    @Override
    public String c() {
        return "worldborder";
    }
    
    @Override
    public int a() {
        return 2;
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.worldborder.usage";
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        if (\u2603.length < 1) {
            throw new cf("commands.worldborder.usage", new Object[0]);
        }
        final ams d = this.d();
        if (\u2603[0].equals("set")) {
            if (\u2603.length != 2 && \u2603.length != 3) {
                throw new cf("commands.worldborder.set.usage", new Object[0]);
            }
            final double d2 = d.j();
            final double n = i.a(\u2603[1], 1.0, 6.0E7);
            final long n2 = (\u2603.length > 2) ? (i.a(\u2603[2], 0L, 9223372036854775L) * 1000L) : 0L;
            if (n2 > 0L) {
                d.a(d2, n, n2);
                if (d2 > n) {
                    i.a(\u2603, this, "commands.worldborder.setSlowly.shrink.success", String.format("%.1f", n), String.format("%.1f", d2), Long.toString(n2 / 1000L));
                }
                else {
                    i.a(\u2603, this, "commands.worldborder.setSlowly.grow.success", String.format("%.1f", n), String.format("%.1f", d2), Long.toString(n2 / 1000L));
                }
            }
            else {
                d.a(n);
                i.a(\u2603, this, "commands.worldborder.set.success", String.format("%.1f", n), String.format("%.1f", d2));
            }
        }
        else if (\u2603[0].equals("add")) {
            if (\u2603.length != 2 && \u2603.length != 3) {
                throw new cf("commands.worldborder.add.usage", new Object[0]);
            }
            final double d2 = d.h();
            final double n = d2 + i.a(\u2603[1], -d2, 6.0E7 - d2);
            final long n2 = d.i() + ((\u2603.length > 2) ? (i.a(\u2603[2], 0L, 9223372036854775L) * 1000L) : 0L);
            if (n2 > 0L) {
                d.a(d2, n, n2);
                if (d2 > n) {
                    i.a(\u2603, this, "commands.worldborder.setSlowly.shrink.success", String.format("%.1f", n), String.format("%.1f", d2), Long.toString(n2 / 1000L));
                }
                else {
                    i.a(\u2603, this, "commands.worldborder.setSlowly.grow.success", String.format("%.1f", n), String.format("%.1f", d2), Long.toString(n2 / 1000L));
                }
            }
            else {
                d.a(n);
                i.a(\u2603, this, "commands.worldborder.set.success", String.format("%.1f", n), String.format("%.1f", d2));
            }
        }
        else if (\u2603[0].equals("center")) {
            if (\u2603.length != 3) {
                throw new cf("commands.worldborder.center.usage", new Object[0]);
            }
            final cj c = \u2603.c();
            final double b = i.b(c.n() + 0.5, \u2603[1], true);
            final double b2 = i.b(c.p() + 0.5, \u2603[2], true);
            d.c(b, b2);
            i.a(\u2603, this, "commands.worldborder.center.success", b, b2);
        }
        else if (\u2603[0].equals("damage")) {
            if (\u2603.length < 2) {
                throw new cf("commands.worldborder.damage.usage", new Object[0]);
            }
            if (\u2603[1].equals("buffer")) {
                if (\u2603.length != 3) {
                    throw new cf("commands.worldborder.damage.buffer.usage", new Object[0]);
                }
                final double d2 = i.a(\u2603[2], 0.0);
                final double n = d.m();
                d.b(d2);
                i.a(\u2603, this, "commands.worldborder.damage.buffer.success", String.format("%.1f", d2), String.format("%.1f", n));
            }
            else if (\u2603[1].equals("amount")) {
                if (\u2603.length != 3) {
                    throw new cf("commands.worldborder.damage.amount.usage", new Object[0]);
                }
                final double d2 = i.a(\u2603[2], 0.0);
                final double n = d.n();
                d.c(d2);
                i.a(\u2603, this, "commands.worldborder.damage.amount.success", String.format("%.2f", d2), String.format("%.2f", n));
            }
        }
        else if (\u2603[0].equals("warning")) {
            if (\u2603.length < 2) {
                throw new cf("commands.worldborder.warning.usage", new Object[0]);
            }
            final int a = i.a(\u2603[2], 0);
            if (\u2603[1].equals("time")) {
                if (\u2603.length != 3) {
                    throw new cf("commands.worldborder.warning.time.usage", new Object[0]);
                }
                final int n3 = d.p();
                d.b(a);
                i.a(\u2603, this, "commands.worldborder.warning.time.success", a, n3);
            }
            else if (\u2603[1].equals("distance")) {
                if (\u2603.length != 3) {
                    throw new cf("commands.worldborder.warning.distance.usage", new Object[0]);
                }
                final int n3 = d.q();
                d.c(a);
                i.a(\u2603, this, "commands.worldborder.warning.distance.success", a, n3);
            }
        }
        else {
            if (!\u2603[0].equals("get")) {
                throw new cf("commands.worldborder.usage", new Object[0]);
            }
            final double d2 = d.h();
            \u2603.a(n.a.e, ns.c(d2 + 0.5));
            \u2603.a(new fb("commands.worldborder.get.success", new Object[] { String.format("%.0f", d2) }));
        }
    }
    
    protected ams d() {
        return MinecraftServer.N().d[0].af();
    }
    
    @Override
    public List<String> a(final m \u2603, final String[] \u2603, final cj \u2603) {
        if (\u2603.length == 1) {
            return i.a(\u2603, "set", "center", "damage", "warning", "add", "get");
        }
        if (\u2603.length == 2 && \u2603[0].equals("damage")) {
            return i.a(\u2603, "buffer", "amount");
        }
        if (\u2603.length >= 2 && \u2603.length <= 3 && \u2603[0].equals("center")) {
            return i.b(\u2603, 1, \u2603);
        }
        if (\u2603.length == 2 && \u2603[0].equals("warning")) {
            return i.a(\u2603, "time", "distance");
        }
        return null;
    }
}
