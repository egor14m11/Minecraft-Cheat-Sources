import java.util.List;
import com.google.common.collect.Lists;
import org.lwjgl.util.glu.Project;
import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class ayy extends ayl
{
    private static final jy C;
    private static final jy D;
    private static final bay E;
    private final wm F;
    private Random G;
    private xs H;
    public int u;
    public float v;
    public float w;
    public float x;
    public float y;
    public float z;
    public float A;
    zx B;
    private final op I;
    
    public ayy(final wm \u2603, final adm \u2603, final op \u2603) {
        super(new xs(\u2603, \u2603));
        this.G = new Random();
        this.F = \u2603;
        this.H = (xs)this.h;
        this.I = \u2603;
    }
    
    @Override
    protected void b(final int \u2603, final int \u2603) {
        this.q.a(this.I.f_().c(), 12, 5, 4210752);
        this.q.a(this.F.f_().c(), 8, this.g - 96 + 2, 4210752);
    }
    
    @Override
    public void e() {
        super.e();
        this.a();
    }
    
    @Override
    protected void a(final int \u2603, final int \u2603, final int \u2603) {
        super.a(\u2603, \u2603, \u2603);
        final int n = (this.l - this.f) / 2;
        final int n2 = (this.m - this.g) / 2;
        for (int i = 0; i < 3; ++i) {
            final int n3 = \u2603 - (n + 60);
            final int n4 = \u2603 - (n2 + 14 + 19 * i);
            if (n3 >= 0 && n4 >= 0 && n3 < 108 && n4 < 19 && this.H.a(this.j.h, i)) {
                this.j.c.a(this.H.d, i);
            }
        }
    }
    
    @Override
    protected void a(final float \u2603, final int \u2603, final int \u2603) {
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.j.P().a(ayy.C);
        final int \u26032 = (this.l - this.f) / 2;
        final int \u26033 = (this.m - this.g) / 2;
        this.b(\u26032, \u26033, 0, 0, this.f, this.g);
        bfl.E();
        bfl.n(5889);
        bfl.E();
        bfl.D();
        final avr avr = new avr(this.j);
        bfl.b((avr.a() - 320) / 2 * avr.e(), (avr.b() - 240) / 2 * avr.e(), 320 * avr.e(), 240 * avr.e());
        bfl.b(-0.34f, 0.23f, 0.0f);
        Project.gluPerspective(90.0f, 1.3333334f, 9.0f, 80.0f);
        final float n = 1.0f;
        bfl.n(5888);
        bfl.D();
        avc.b();
        bfl.b(0.0f, 3.3f, -16.0f);
        bfl.a(n, n, n);
        final float n2 = 5.0f;
        bfl.a(n2, n2, n2);
        bfl.b(180.0f, 0.0f, 0.0f, 1.0f);
        this.j.P().a(ayy.D);
        bfl.b(20.0f, 1.0f, 0.0f, 0.0f);
        final float \u26034 = this.A + (this.z - this.A) * \u2603;
        bfl.b((1.0f - \u26034) * 0.2f, (1.0f - \u26034) * 0.1f, (1.0f - \u26034) * 0.25f);
        bfl.b(-(1.0f - \u26034) * 90.0f - 90.0f, 0.0f, 1.0f, 0.0f);
        bfl.b(180.0f, 1.0f, 0.0f, 0.0f);
        float \u26035 = this.w + (this.v - this.w) * \u2603 + 0.25f;
        float \u26036 = this.w + (this.v - this.w) * \u2603 + 0.75f;
        \u26035 = (\u26035 - ns.b((double)\u26035)) * 1.6f - 0.3f;
        \u26036 = (\u26036 - ns.b((double)\u26036)) * 1.6f - 0.3f;
        if (\u26035 < 0.0f) {
            \u26035 = 0.0f;
        }
        if (\u26036 < 0.0f) {
            \u26036 = 0.0f;
        }
        if (\u26035 > 1.0f) {
            \u26035 = 1.0f;
        }
        if (\u26036 > 1.0f) {
            \u26036 = 1.0f;
        }
        bfl.B();
        ayy.E.a(null, 0.0f, \u26035, \u26036, \u26034, 0.0f, 0.0625f);
        bfl.C();
        avc.a();
        bfl.n(5889);
        bfl.b(0, 0, this.j.d, this.j.e);
        bfl.F();
        bfl.n(5888);
        bfl.F();
        avc.a();
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        ayx.a().a(this.H.f);
        final int e = this.H.e();
        for (int i = 0; i < 3; ++i) {
            final int n3 = \u26032 + 60;
            final int n4 = n3 + 20;
            final int n5 = 86;
            final String b = ayx.a().b();
            this.e = 0.0f;
            this.j.P().a(ayy.C);
            final int j = this.H.g[i];
            bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
            if (j == 0) {
                this.b(n3, \u26033 + 14 + 19 * i, 0, 185, 108, 19);
            }
            else {
                final String string = "" + j;
                avn avn = this.j.l;
                int n6 = 6839882;
                if ((e < i + 1 || this.j.h.bB < j) && !this.j.h.bA.d) {
                    this.b(n3, \u26033 + 14 + 19 * i, 0, 185, 108, 19);
                    this.b(n3 + 1, \u26033 + 15 + 19 * i, 16 * i, 239, 16, 16);
                    avn.a(b, n4, \u26033 + 16 + 19 * i, n5, (n6 & 0xFEFEFE) >> 1);
                    n6 = 4226832;
                }
                else {
                    final int n7 = \u2603 - (\u26032 + 60);
                    final int n8 = \u2603 - (\u26033 + 14 + 19 * i);
                    if (n7 >= 0 && n8 >= 0 && n7 < 108 && n8 < 19) {
                        this.b(n3, \u26033 + 14 + 19 * i, 0, 204, 108, 19);
                        n6 = 16777088;
                    }
                    else {
                        this.b(n3, \u26033 + 14 + 19 * i, 0, 166, 108, 19);
                    }
                    this.b(n3 + 1, \u26033 + 15 + 19 * i, 16 * i, 223, 16, 16);
                    avn.a(b, n4, \u26033 + 16 + 19 * i, n5, n6);
                    n6 = 8453920;
                }
                avn = this.j.k;
                avn.a(string, (float)(n4 + 86 - avn.a(string)), (float)(\u26033 + 16 + 19 * i + 7), n6);
            }
        }
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final float \u2603) {
        super.a(\u2603, \u2603, \u2603);
        final boolean d = this.j.h.bA.d;
        final int e = this.H.e();
        for (int i = 0; i < 3; ++i) {
            final int n = this.H.g[i];
            final int n2 = this.H.h[i];
            final int n3 = i + 1;
            if (this.c(60, 14 + 19 * i, 108, 17, \u2603, \u2603) && n > 0 && n2 >= 0) {
                final List<String> arrayList = (List<String>)Lists.newArrayList();
                if (n2 >= 0 && aci.c(n2 & 0xFF) != null) {
                    final String str = aci.c(n2 & 0xFF).d((n2 & 0xFF00) >> 8);
                    arrayList.add(a.p.toString() + a.u.toString() + bnq.a("container.enchant.clue", str));
                }
                if (!d) {
                    if (n2 >= 0) {
                        arrayList.add("");
                    }
                    if (this.j.h.bB < n) {
                        arrayList.add(a.m.toString() + "Level Requirement: " + this.H.g[i]);
                    }
                    else {
                        String str = "";
                        if (n3 == 1) {
                            str = bnq.a("container.enchant.lapis.one", new Object[0]);
                        }
                        else {
                            str = bnq.a("container.enchant.lapis.many", n3);
                        }
                        if (e >= n3) {
                            arrayList.add(a.h.toString() + "" + str);
                        }
                        else {
                            arrayList.add(a.m.toString() + "" + str);
                        }
                        if (n3 == 1) {
                            str = bnq.a("container.enchant.level.one", new Object[0]);
                        }
                        else {
                            str = bnq.a("container.enchant.level.many", n3);
                        }
                        arrayList.add(a.h.toString() + "" + str);
                    }
                }
                this.a(arrayList, \u2603, \u2603);
                break;
            }
        }
    }
    
    public void a() {
        final zx d = this.h.a(0).d();
        if (!zx.b(d, this.B)) {
            this.B = d;
            do {
                this.x += this.G.nextInt(4) - this.G.nextInt(4);
            } while (this.v <= this.x + 1.0f && this.v >= this.x - 1.0f);
        }
        ++this.u;
        this.w = this.v;
        this.A = this.z;
        boolean b = false;
        for (int i = 0; i < 3; ++i) {
            if (this.H.g[i] != 0) {
                b = true;
            }
        }
        if (b) {
            this.z += 0.2f;
        }
        else {
            this.z -= 0.2f;
        }
        this.z = ns.a(this.z, 0.0f, 1.0f);
        float a = (this.x - this.v) * 0.4f;
        final float \u2603 = 0.2f;
        a = ns.a(a, -\u2603, \u2603);
        this.y += (a - this.y) * 0.9f;
        this.v += this.y;
    }
    
    static {
        C = new jy("textures/gui/container/enchanting_table.png");
        D = new jy("textures/entity/enchanting_table_book.png");
        E = new bay();
    }
}
