import org.apache.logging.log4j.LogManager;
import java.io.InputStream;
import java.util.Collection;
import java.util.Random;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.apache.commons.io.Charsets;
import com.google.common.collect.Lists;
import java.util.List;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class ayc extends axu
{
    private static final Logger a;
    private static final jy f;
    private static final jy g;
    private int h;
    private List<String> i;
    private int r;
    private float s;
    
    public ayc() {
        this.s = 0.5f;
    }
    
    @Override
    public void e() {
        final bpv r = this.j.r();
        final bpz w = this.j.W();
        if (this.h == 0) {
            r.a();
            r.a(bpv.a.d);
            w.e();
        }
        w.c();
        ++this.h;
        final float n = (this.r + this.m + this.m + 24) / this.s;
        if (this.h > n) {
            this.a();
        }
    }
    
    @Override
    protected void a(final char \u2603, final int \u2603) {
        if (\u2603 == 1) {
            this.a();
        }
    }
    
    private void a() {
        this.j.h.a.a(new ig(ig.a.a));
        this.j.a((axu)null);
    }
    
    @Override
    public boolean d() {
        return true;
    }
    
    @Override
    public void b() {
        if (this.i != null) {
            return;
        }
        this.i = (List<String>)Lists.newArrayList();
        try {
            String s = "";
            final String string = "" + a.p + a.q + a.k + a.l;
            final int n = 274;
            InputStream inputStream = this.j.Q().a(new jy("texts/end.txt")).b();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8));
            final Random random = new Random(8124371L);
            while ((s = bufferedReader.readLine()) != null) {
                String substring;
                String substring2;
                for (s = s.replaceAll("PLAYERNAME", this.j.L().c()); s.contains(string); s = substring + a.p + a.q + "XXXXXXXX".substring(0, random.nextInt(4) + 3) + substring2) {
                    final int i = s.indexOf(string);
                    substring = s.substring(0, i);
                    substring2 = s.substring(i + string.length());
                }
                this.i.addAll(this.j.k.c(s, n));
                this.i.add("");
            }
            inputStream.close();
            for (int i = 0; i < 8; ++i) {
                this.i.add("");
            }
            inputStream = this.j.Q().a(new jy("texts/credits.txt")).b();
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8));
            while ((s = bufferedReader.readLine()) != null) {
                s = s.replaceAll("PLAYERNAME", this.j.L().c());
                s = s.replaceAll("\t", "    ");
                this.i.addAll(this.j.k.c(s, n));
                this.i.add("");
            }
            inputStream.close();
            this.r = this.i.size() * 12;
        }
        catch (Exception throwable) {
            ayc.a.error("Couldn't load credits", throwable);
        }
    }
    
    private void b(final int \u2603, final int \u2603, final float \u2603) {
        final bfx a = bfx.a();
        final bfd c = a.c();
        this.j.P().a(avp.b);
        c.a(7, bms.i);
        final int l = this.l;
        final float n = 0.0f - (this.h + \u2603) * 0.5f * this.s;
        final float n2 = this.m - (this.h + \u2603) * 0.5f * this.s;
        final float n3 = 0.015625f;
        float n4 = (this.h + \u2603 - 0.0f) * 0.02f;
        final float n5 = (this.r + this.m + this.m + 24) / this.s;
        final float n6 = (n5 - 20.0f - (this.h + \u2603)) * 0.005f;
        if (n6 < n4) {
            n4 = n6;
        }
        if (n4 > 1.0f) {
            n4 = 1.0f;
        }
        n4 *= n4;
        n4 = n4 * 96.0f / 255.0f;
        c.b(0.0, this.m, this.e).a(0.0, n * n3).a(n4, n4, n4, 1.0f).d();
        c.b(l, this.m, (double)this.e).a(l * n3, n * n3).a(n4, n4, n4, 1.0f).d();
        c.b(l, 0.0, this.e).a(l * n3, n2 * n3).a(n4, n4, n4, 1.0f).d();
        c.b(0.0, 0.0, this.e).a(0.0, n2 * n3).a(n4, n4, n4, 1.0f).d();
        a.b();
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final float \u2603) {
        this.b(\u2603, \u2603, \u2603);
        final bfx a = bfx.a();
        final bfd c = a.c();
        final int n = 274;
        final int \u26032 = this.l / 2 - n / 2;
        final int n2 = this.m + 50;
        final float \u26033 = -(this.h + \u2603) * this.s;
        bfl.E();
        bfl.b(0.0f, \u26033, 0.0f);
        this.j.P().a(ayc.f);
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.b(\u26032, n2, 0, 0, 155, 44);
        this.b(\u26032 + 155, n2, 0, 45, 155, 44);
        int n3 = n2 + 200;
        for (int i = 0; i < this.i.size(); ++i) {
            if (i == this.i.size() - 1) {
                final float n4 = n3 + \u26033 - (this.m / 2 - 6);
                if (n4 < 0.0f) {
                    bfl.b(0.0f, -n4, 0.0f);
                }
            }
            if (n3 + \u26033 + 12.0f + 8.0f > 0.0f && n3 + \u26033 < this.m) {
                final String \u26034 = this.i.get(i);
                if (\u26034.startsWith("[C]")) {
                    this.q.a(\u26034.substring(3), (float)(\u26032 + (n - this.q.a(\u26034.substring(3))) / 2), (float)n3, 16777215);
                }
                else {
                    this.q.b.setSeed(i * 4238972211L + this.h / 4);
                    this.q.a(\u26034, (float)\u26032, (float)n3, 16777215);
                }
            }
            n3 += 12;
        }
        bfl.F();
        this.j.P().a(ayc.g);
        bfl.l();
        bfl.b(0, 769);
        int i = this.l;
        final int m = this.m;
        c.a(7, bms.i);
        c.b(0.0, m, this.e).a(0.0, 1.0).a(1.0f, 1.0f, 1.0f, 1.0f).d();
        c.b(i, m, (double)this.e).a(1.0, 1.0).a(1.0f, 1.0f, 1.0f, 1.0f).d();
        c.b(i, 0.0, this.e).a(1.0, 0.0).a(1.0f, 1.0f, 1.0f, 1.0f).d();
        c.b(0.0, 0.0, this.e).a(0.0, 0.0).a(1.0f, 1.0f, 1.0f, 1.0f).d();
        a.b();
        bfl.k();
        super.a(\u2603, \u2603, \u2603);
    }
    
    static {
        a = LogManager.getLogger();
        f = new jy("textures/gui/title/minecraft.png");
        g = new jy("textures/misc/vignette.png");
    }
}
