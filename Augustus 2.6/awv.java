import org.apache.logging.log4j.LogManager;
import org.apache.commons.lang3.StringUtils;
import java.util.Iterator;
import org.lwjgl.input.Mouse;
import org.lwjgl.input.Keyboard;
import com.google.common.collect.Lists;
import java.util.List;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class awv extends axu
{
    private static final Logger f;
    private String g;
    private int h;
    private boolean i;
    private boolean r;
    private int s;
    private List<String> t;
    protected avw a;
    private String u;
    
    public awv() {
        this.g = "";
        this.h = -1;
        this.t = (List<String>)Lists.newArrayList();
        this.u = "";
    }
    
    public awv(final String \u2603) {
        this.g = "";
        this.h = -1;
        this.t = (List<String>)Lists.newArrayList();
        this.u = "";
        this.u = \u2603;
    }
    
    @Override
    public void b() {
        Keyboard.enableRepeatEvents(true);
        this.h = this.j.q.d().c().size();
        (this.a = new avw(0, this.q, 4, this.m - 12, this.l - 4, 12)).f(100);
        this.a.a(false);
        this.a.b(true);
        this.a.a(this.u);
        this.a.d(false);
    }
    
    @Override
    public void m() {
        Keyboard.enableRepeatEvents(false);
        this.j.q.d().d();
    }
    
    @Override
    public void e() {
        this.a.a();
    }
    
    @Override
    protected void a(final char \u2603, final int \u2603) {
        this.r = false;
        if (\u2603 == 15) {
            this.a();
        }
        else {
            this.i = false;
        }
        if (\u2603 == 1) {
            this.j.a((axu)null);
        }
        else if (\u2603 == 28 || \u2603 == 156) {
            final String trim = this.a.b().trim();
            if (trim.length() > 0) {
                this.f(trim);
            }
            this.j.a((axu)null);
        }
        else if (\u2603 == 200) {
            this.b(-1);
        }
        else if (\u2603 == 208) {
            this.b(1);
        }
        else if (\u2603 == 201) {
            this.j.q.d().b(this.j.q.d().i() - 1);
        }
        else if (\u2603 == 209) {
            this.j.q.d().b(-this.j.q.d().i() + 1);
        }
        else {
            this.a.a(\u2603, \u2603);
        }
    }
    
    @Override
    public void k() {
        super.k();
        int eventDWheel = Mouse.getEventDWheel();
        if (eventDWheel != 0) {
            if (eventDWheel > 1) {
                eventDWheel = 1;
            }
            if (eventDWheel < -1) {
                eventDWheel = -1;
            }
            if (!axu.r()) {
                eventDWheel *= 7;
            }
            this.j.q.d().b(eventDWheel);
        }
    }
    
    @Override
    protected void a(final int \u2603, final int \u2603, final int \u2603) {
        if (\u2603 == 0) {
            final eu a = this.j.q.d().a(Mouse.getX(), Mouse.getY());
            if (this.a(a)) {
                return;
            }
        }
        this.a.a(\u2603, \u2603, \u2603);
        super.a(\u2603, \u2603, \u2603);
    }
    
    @Override
    protected void a(final String \u2603, final boolean \u2603) {
        if (\u2603) {
            this.a.a(\u2603);
        }
        else {
            this.a.b(\u2603);
        }
    }
    
    public void a() {
        if (this.i) {
            this.a.b(this.a.a(-1, this.a.i(), false) - this.a.i());
            if (this.s >= this.t.size()) {
                this.s = 0;
            }
        }
        else {
            final int a = this.a.a(-1, this.a.i(), false);
            this.t.clear();
            this.s = 0;
            final String lowerCase = this.a.b().substring(a).toLowerCase();
            final String substring = this.a.b().substring(0, this.a.i());
            this.a(substring, lowerCase);
            if (this.t.isEmpty()) {
                return;
            }
            this.i = true;
            this.a.b(a - this.a.i());
        }
        if (this.t.size() > 1) {
            final StringBuilder sb = new StringBuilder();
            for (final String substring : this.t) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(substring);
            }
            this.j.q.d().a(new fa(sb.toString()), 1);
        }
        this.a.b(this.t.get(this.s++));
    }
    
    private void a(final String \u2603, final String \u2603) {
        if (\u2603.length() < 1) {
            return;
        }
        cj a = null;
        if (this.j.s != null && this.j.s.a == auh.a.b) {
            a = this.j.s.a();
        }
        this.j.h.a.a(new id(\u2603, a));
        this.r = true;
    }
    
    public void b(final int \u2603) {
        int a = this.h + \u2603;
        final int size = this.j.q.d().c().size();
        a = ns.a(a, 0, size);
        if (a == this.h) {
            return;
        }
        if (a == size) {
            this.h = size;
            this.a.a(this.g);
            return;
        }
        if (this.h == size) {
            this.g = this.a.b();
        }
        this.a.a(this.j.q.d().c().get(a));
        this.h = a;
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final float \u2603) {
        avp.a(2, this.m - 14, this.l - 2, this.m - 2, Integer.MIN_VALUE);
        this.a.g();
        final eu a = this.j.q.d().a(Mouse.getX(), Mouse.getY());
        if (a != null && a.b().i() != null) {
            this.a(a, \u2603, \u2603);
        }
        super.a(\u2603, \u2603, \u2603);
    }
    
    public void a(final String[] \u2603) {
        if (this.r) {
            this.i = false;
            this.t.clear();
            for (final String s : \u2603) {
                if (s.length() > 0) {
                    this.t.add(s);
                }
            }
            final String substring = this.a.b().substring(this.a.a(-1, this.a.i(), false));
            final String commonPrefix = StringUtils.getCommonPrefix(\u2603);
            if (commonPrefix.length() > 0 && !substring.equalsIgnoreCase(commonPrefix)) {
                this.a.b(this.a.a(-1, this.a.i(), false) - this.a.i());
                this.a.b(commonPrefix);
            }
            else if (this.t.size() > 0) {
                this.i = true;
                this.a();
            }
        }
    }
    
    @Override
    public boolean d() {
        return false;
    }
    
    static {
        f = LogManager.getLogger();
    }
}
