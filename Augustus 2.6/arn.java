// 
// Decompiled by Procyon v0.5.36
// 

public class arn
{
    public static final arn[] a;
    public static final arn b;
    public static final arn c;
    public static final arn d;
    public static final arn e;
    public static final arn f;
    public static final arn g;
    public static final arn h;
    public static final arn i;
    public static final arn j;
    public static final arn k;
    public static final arn l;
    public static final arn m;
    public static final arn n;
    public static final arn o;
    public static final arn p;
    public static final arn q;
    public static final arn r;
    public static final arn s;
    public static final arn t;
    public static final arn u;
    public static final arn v;
    public static final arn w;
    public static final arn x;
    public static final arn y;
    public static final arn z;
    public static final arn A;
    public static final arn B;
    public static final arn C;
    public static final arn D;
    public static final arn E;
    public static final arn F;
    public static final arn G;
    public static final arn H;
    public static final arn I;
    public static final arn J;
    public static final arn K;
    public final int L;
    public final int M;
    
    private arn(final int \u2603, final int \u2603) {
        if (\u2603 < 0 || \u2603 > 63) {
            throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
        }
        this.M = \u2603;
        this.L = \u2603;
        arn.a[\u2603] = this;
    }
    
    public int a(final int \u2603) {
        int n = 220;
        if (\u2603 == 3) {
            n = 135;
        }
        if (\u2603 == 2) {
            n = 255;
        }
        if (\u2603 == 1) {
            n = 220;
        }
        if (\u2603 == 0) {
            n = 180;
        }
        final int n2 = (this.L >> 16 & 0xFF) * n / 255;
        final int n3 = (this.L >> 8 & 0xFF) * n / 255;
        final int n4 = (this.L & 0xFF) * n / 255;
        return 0xFF000000 | n2 << 16 | n3 << 8 | n4;
    }
    
    static {
        a = new arn[64];
        b = new arn(0, 0);
        c = new arn(1, 8368696);
        d = new arn(2, 16247203);
        e = new arn(3, 13092807);
        f = new arn(4, 16711680);
        g = new arn(5, 10526975);
        h = new arn(6, 10987431);
        i = new arn(7, 31744);
        j = new arn(8, 16777215);
        k = new arn(9, 10791096);
        l = new arn(10, 9923917);
        m = new arn(11, 7368816);
        n = new arn(12, 4210943);
        o = new arn(13, 9402184);
        p = new arn(14, 16776437);
        q = new arn(15, 14188339);
        r = new arn(16, 11685080);
        s = new arn(17, 6724056);
        t = new arn(18, 15066419);
        u = new arn(19, 8375321);
        v = new arn(20, 15892389);
        w = new arn(21, 5000268);
        x = new arn(22, 10066329);
        y = new arn(23, 5013401);
        z = new arn(24, 8339378);
        A = new arn(25, 3361970);
        B = new arn(26, 6704179);
        C = new arn(27, 6717235);
        D = new arn(28, 10040115);
        E = new arn(29, 1644825);
        F = new arn(30, 16445005);
        G = new arn(31, 6085589);
        H = new arn(32, 4882687);
        I = new arn(33, 55610);
        J = new arn(34, 8476209);
        K = new arn(35, 7340544);
    }
}
