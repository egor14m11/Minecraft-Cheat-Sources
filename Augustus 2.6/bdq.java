// 
// Decompiled by Procyon v0.5.36
// 

public class bdq
{
    public static class c extends beb
    {
        private int az;
        private final bec aA;
        private du aB;
        boolean a;
        
        public c(final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final bec \u2603, final dn \u2603) {
            super(\u2603, \u2603, \u2603, \u2603, 0.0, 0.0, 0.0);
            this.v = \u2603;
            this.w = \u2603;
            this.x = \u2603;
            this.aA = \u2603;
            this.g = 8;
            if (\u2603 != null) {
                this.aB = \u2603.c("Explosions", 10);
                if (this.aB.c() == 0) {
                    this.aB = null;
                }
                else {
                    this.g = this.aB.c() * 2 - 1;
                    for (int i = 0; i < this.aB.c(); ++i) {
                        final dn b = this.aB.b(i);
                        if (b.n("Flicker")) {
                            this.a = true;
                            this.g += 15;
                            break;
                        }
                    }
                }
            }
        }
        
        @Override
        public void a(final bfd \u2603, final pk \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        }
        
        @Override
        public void t_() {
            if (this.az == 0 && this.aB != null) {
                final boolean b = this.l();
                boolean b2 = false;
                if (this.aB.c() >= 3) {
                    b2 = true;
                }
                else {
                    for (int i = 0; i < this.aB.c(); ++i) {
                        final dn b3 = this.aB.b(i);
                        if (b3.d("Type") == 1) {
                            b2 = true;
                            break;
                        }
                    }
                }
                final String string = "fireworks." + (b2 ? "largeBlast" : "blast") + (b ? "_far" : "");
                this.o.a(this.s, this.t, this.u, string, 20.0f, 0.95f + this.V.nextFloat() * 0.1f, true);
            }
            if (this.az % 2 == 0 && this.aB != null && this.az / 2 < this.aB.c()) {
                final int \u2603 = this.az / 2;
                final dn b4 = this.aB.b(\u2603);
                final int i = b4.d("Type");
                final boolean n = b4.n("Trail");
                final boolean n2 = b4.n("Flicker");
                int[] l = b4.l("Colors");
                final int[] j = b4.l("FadeColors");
                if (l.length == 0) {
                    l = new int[] { ze.a[0] };
                }
                if (i == 1) {
                    this.a(0.5, 4, l, j, n, n2);
                }
                else if (i == 2) {
                    this.a(0.5, new double[][] { { 0.0, 1.0 }, { 0.3455, 0.309 }, { 0.9511, 0.309 }, { 0.3795918367346939, -0.12653061224489795 }, { 0.6122448979591837, -0.8040816326530612 }, { 0.0, -0.35918367346938773 } }, l, j, n, n2, false);
                }
                else if (i == 3) {
                    this.a(0.5, new double[][] { { 0.0, 0.2 }, { 0.2, 0.2 }, { 0.2, 0.6 }, { 0.6, 0.6 }, { 0.6, 0.2 }, { 0.2, 0.2 }, { 0.2, 0.0 }, { 0.4, 0.0 }, { 0.4, -0.6 }, { 0.2, -0.6 }, { 0.2, -0.4 }, { 0.0, -0.4 } }, l, j, n, n2, true);
                }
                else if (i == 4) {
                    this.a(l, j, n, n2);
                }
                else {
                    this.a(0.25, 2, l, j, n, n2);
                }
                final int n3 = l[0];
                final float \u26032 = ((n3 & 0xFF0000) >> 16) / 255.0f;
                final float \u26033 = ((n3 & 0xFF00) >> 8) / 255.0f;
                final float \u26034 = ((n3 & 0xFF) >> 0) / 255.0f;
                final a \u26035 = new a(this.o, this.s, this.t, this.u);
                \u26035.b(\u26032, \u26033, \u26034);
                this.aA.a(\u26035);
            }
            ++this.az;
            if (this.az > this.g) {
                if (this.a) {
                    final boolean b = this.l();
                    final String string2 = "fireworks." + (b ? "twinkle_far" : "twinkle");
                    this.o.a(this.s, this.t, this.u, string2, 20.0f, 0.9f + this.V.nextFloat() * 0.15f, true);
                }
                this.J();
            }
        }
        
        private boolean l() {
            final ave a = ave.A();
            return a == null || a.ac() == null || a.ac().e(this.s, this.t, this.u) >= 256.0;
        }
        
        private void a(final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final int[] \u2603, final int[] \u2603, final boolean \u2603, final boolean \u2603) {
            final b \u26032 = new b(this.o, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, this.aA);
            \u26032.i(0.99f);
            \u26032.a(\u2603);
            \u26032.i(\u2603);
            final int nextInt = this.V.nextInt(\u2603.length);
            \u26032.a(\u2603[nextInt]);
            if (\u2603 != null && \u2603.length > 0) {
                \u26032.b(\u2603[this.V.nextInt(\u2603.length)]);
            }
            this.aA.a(\u26032);
        }
        
        private void a(final double \u2603, final int \u2603, final int[] \u2603, final int[] \u2603, final boolean \u2603, final boolean \u2603) {
            final double s = this.s;
            final double t = this.t;
            final double u = this.u;
            for (int i = -\u2603; i <= \u2603; ++i) {
                for (int j = -\u2603; j <= \u2603; ++j) {
                    for (int k = -\u2603; k <= \u2603; ++k) {
                        final double n = j + (this.V.nextDouble() - this.V.nextDouble()) * 0.5;
                        final double n2 = i + (this.V.nextDouble() - this.V.nextDouble()) * 0.5;
                        final double n3 = k + (this.V.nextDouble() - this.V.nextDouble()) * 0.5;
                        final double n4 = ns.a(n * n + n2 * n2 + n3 * n3) / \u2603 + this.V.nextGaussian() * 0.05;
                        this.a(s, t, u, n / n4, n2 / n4, n3 / n4, \u2603, \u2603, \u2603, \u2603);
                        if (i != -\u2603 && i != \u2603 && j != -\u2603 && j != \u2603) {
                            k += \u2603 * 2 - 1;
                        }
                    }
                }
            }
        }
        
        private void a(final double \u2603, final double[][] \u2603, final int[] \u2603, final int[] \u2603, final boolean \u2603, final boolean \u2603, final boolean \u2603) {
            final double n = \u2603[0][0];
            final double n2 = \u2603[0][1];
            this.a(this.s, this.t, this.u, n * \u2603, n2 * \u2603, 0.0, \u2603, \u2603, \u2603, \u2603);
            final float n3 = this.V.nextFloat() * 3.1415927f;
            final double n4 = \u2603 ? 0.034 : 0.34;
            for (int i = 0; i < 3; ++i) {
                final double n5 = n3 + i * 3.1415927f * n4;
                double n6 = n;
                double n7 = n2;
                for (int j = 1; j < \u2603.length; ++j) {
                    final double n8 = \u2603[j][0];
                    final double n9 = \u2603[j][1];
                    for (double n10 = 0.25; n10 <= 1.0; n10 += 0.25) {
                        double n11 = (n6 + (n8 - n6) * n10) * \u2603;
                        final double \u26032 = (n7 + (n9 - n7) * n10) * \u2603;
                        final double n12 = n11 * Math.sin(n5);
                        n11 *= Math.cos(n5);
                        for (double n13 = -1.0; n13 <= 1.0; n13 += 2.0) {
                            this.a(this.s, this.t, this.u, n11 * n13, \u26032, n12 * n13, \u2603, \u2603, \u2603, \u2603);
                        }
                    }
                    n6 = n8;
                    n7 = n9;
                }
            }
        }
        
        private void a(final int[] \u2603, final int[] \u2603, final boolean \u2603, final boolean \u2603) {
            final double n = this.V.nextGaussian() * 0.05;
            final double n2 = this.V.nextGaussian() * 0.05;
            for (int i = 0; i < 70; ++i) {
                final double \u26032 = this.v * 0.5 + this.V.nextGaussian() * 0.15 + n;
                final double \u26033 = this.x * 0.5 + this.V.nextGaussian() * 0.15 + n2;
                final double \u26034 = this.w * 0.5 + this.V.nextDouble() * 0.5;
                this.a(this.s, this.t, this.u, \u26032, \u26034, \u26033, \u2603, \u2603, \u2603, \u2603);
            }
        }
        
        @Override
        public int a() {
            return 0;
        }
    }
    
    public static class b extends beb
    {
        private int a;
        private boolean az;
        private boolean aA;
        private final bec aB;
        private float aC;
        private float aD;
        private float aE;
        private boolean aF;
        
        public b(final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final bec \u2603) {
            super(\u2603, \u2603, \u2603, \u2603);
            this.a = 160;
            this.v = \u2603;
            this.w = \u2603;
            this.x = \u2603;
            this.aB = \u2603;
            this.h *= 0.75f;
            this.g = 48 + this.V.nextInt(12);
            this.T = false;
        }
        
        public void a(final boolean \u2603) {
            this.az = \u2603;
        }
        
        public void i(final boolean \u2603) {
            this.aA = \u2603;
        }
        
        public void a(final int \u2603) {
            final float n = ((\u2603 & 0xFF0000) >> 16) / 255.0f;
            final float n2 = ((\u2603 & 0xFF00) >> 8) / 255.0f;
            final float n3 = ((\u2603 & 0xFF) >> 0) / 255.0f;
            final float n4 = 1.0f;
            this.b(n * n4, n2 * n4, n3 * n4);
        }
        
        public void b(final int \u2603) {
            this.aC = ((\u2603 & 0xFF0000) >> 16) / 255.0f;
            this.aD = ((\u2603 & 0xFF00) >> 8) / 255.0f;
            this.aE = ((\u2603 & 0xFF) >> 0) / 255.0f;
            this.aF = true;
        }
        
        @Override
        public aug S() {
            return null;
        }
        
        @Override
        public boolean ae() {
            return false;
        }
        
        @Override
        public void a(final bfd \u2603, final pk \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
            if (!this.aA || this.f < this.g / 3 || (this.f + this.g) / 3 % 2 == 0) {
                super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
            }
        }
        
        @Override
        public void t_() {
            this.p = this.s;
            this.q = this.t;
            this.r = this.u;
            if (this.f++ >= this.g) {
                this.J();
            }
            if (this.f > this.g / 2) {
                this.i(1.0f - (this.f - (float)(this.g / 2)) / this.g);
                if (this.aF) {
                    this.ar += (this.aC - this.ar) * 0.2f;
                    this.as += (this.aD - this.as) * 0.2f;
                    this.at += (this.aE - this.at) * 0.2f;
                }
            }
            this.k(this.a + (7 - this.f * 8 / this.g));
            this.w -= 0.004;
            this.d(this.v, this.w, this.x);
            this.v *= 0.9100000262260437;
            this.w *= 0.9100000262260437;
            this.x *= 0.9100000262260437;
            if (this.C) {
                this.v *= 0.699999988079071;
                this.x *= 0.699999988079071;
            }
            if (this.az && this.f < this.g / 2 && (this.f + this.g) % 2 == 0) {
                final b \u2603 = new b(this.o, this.s, this.t, this.u, 0.0, 0.0, 0.0, this.aB);
                \u2603.i(0.99f);
                \u2603.b(this.ar, this.as, this.at);
                \u2603.f = \u2603.g / 2;
                if (this.aF) {
                    \u2603.aF = true;
                    \u2603.aC = this.aC;
                    \u2603.aD = this.aD;
                    \u2603.aE = this.aE;
                }
                \u2603.aA = this.aA;
                this.aB.a(\u2603);
            }
        }
        
        @Override
        public int b(final float \u2603) {
            return 15728880;
        }
        
        @Override
        public float c(final float \u2603) {
            return 1.0f;
        }
    }
    
    public static class a extends beb
    {
        protected a(final adm \u2603, final double \u2603, final double \u2603, final double \u2603) {
            super(\u2603, \u2603, \u2603, \u2603);
            this.g = 4;
        }
        
        @Override
        public void a(final bfd \u2603, final pk \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
            final float n = 0.25f;
            final float n2 = 0.5f;
            final float n3 = 0.125f;
            final float n4 = 0.375f;
            final float n5 = 7.1f * ns.a((this.f + \u2603 - 1.0f) * 0.25f * 3.1415927f);
            this.au = 0.6f - (this.f + \u2603 - 1.0f) * 0.25f * 0.5f;
            final float n6 = (float)(this.p + (this.s - this.p) * \u2603 - a.aw);
            final float n7 = (float)(this.q + (this.t - this.q) * \u2603 - a.ax);
            final float n8 = (float)(this.r + (this.u - this.r) * \u2603 - a.ay);
            final int b = this.b(\u2603);
            final int n9 = b >> 16 & 0xFFFF;
            final int n10 = b & 0xFFFF;
            \u2603.b(n6 - \u2603 * n5 - \u2603 * n5, n7 - \u2603 * n5, (double)(n8 - \u2603 * n5 - \u2603 * n5)).a(0.5, 0.375).a(this.ar, this.as, this.at, this.au).a(n9, n10).d();
            \u2603.b(n6 - \u2603 * n5 + \u2603 * n5, n7 + \u2603 * n5, (double)(n8 - \u2603 * n5 + \u2603 * n5)).a(0.5, 0.125).a(this.ar, this.as, this.at, this.au).a(n9, n10).d();
            \u2603.b(n6 + \u2603 * n5 + \u2603 * n5, n7 + \u2603 * n5, (double)(n8 + \u2603 * n5 + \u2603 * n5)).a(0.25, 0.125).a(this.ar, this.as, this.at, this.au).a(n9, n10).d();
            \u2603.b(n6 + \u2603 * n5 - \u2603 * n5, n7 - \u2603 * n5, (double)(n8 + \u2603 * n5 - \u2603 * n5)).a(0.25, 0.375).a(this.ar, this.as, this.at, this.au).a(n9, n10).d();
        }
    }
    
    public static class d implements bed
    {
        @Override
        public beb a(final int \u2603, final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final int... \u2603) {
            final b b = new b(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, ave.A().j);
            b.i(0.99f);
            return b;
        }
    }
}
