package H;

import C.AbstractC0241y;
import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f1664s = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f1667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Runnable f1668e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1671h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1672i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f1676m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f1677n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1678o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f1679p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f1680q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f1681r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0048a f1665b = new C0048a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Interpolator f1666c = new AccelerateInterpolator();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float[] f1669f = {0.0f, 0.0f};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f1670g = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float[] f1673j = {0.0f, 0.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float[] f1674k = {0.0f, 0.0f};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float[] f1675l = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: H.a$a, reason: collision with other inner class name */
    public static class C0048a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1682a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1683b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f1684c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f1685d;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f1691j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f1692k;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f1686e = Long.MIN_VALUE;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f1690i = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f1687f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f1688g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f1689h = 0;

        public void a() {
            if (this.f1687f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fG = g(e(jCurrentAnimationTimeMillis));
            long j4 = jCurrentAnimationTimeMillis - this.f1687f;
            this.f1687f = jCurrentAnimationTimeMillis;
            float f4 = j4 * fG;
            this.f1688g = (int) (this.f1684c * f4);
            this.f1689h = (int) (f4 * this.f1685d);
        }

        public int b() {
            return this.f1688g;
        }

        public int c() {
            return this.f1689h;
        }

        public int d() {
            float f4 = this.f1684c;
            return (int) (f4 / Math.abs(f4));
        }

        public final float e(long j4) {
            if (j4 < this.f1686e) {
                return 0.0f;
            }
            long j5 = this.f1690i;
            if (j5 < 0 || j4 < j5) {
                return a.e((j4 - r0) / this.f1682a, 0.0f, 1.0f) * 0.5f;
            }
            float f4 = this.f1691j;
            return (1.0f - f4) + (f4 * a.e((j4 - j5) / this.f1692k, 0.0f, 1.0f));
        }

        public int f() {
            float f4 = this.f1685d;
            return (int) (f4 / Math.abs(f4));
        }

        public final float g(float f4) {
            return ((-4.0f) * f4 * f4) + (f4 * 4.0f);
        }

        public boolean h() {
            return this.f1690i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f1690i + ((long) this.f1692k);
        }

        public void i() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f1692k = a.f((int) (jCurrentAnimationTimeMillis - this.f1686e), 0, this.f1683b);
            this.f1691j = e(jCurrentAnimationTimeMillis);
            this.f1690i = jCurrentAnimationTimeMillis;
        }

        public void j(int i4) {
            this.f1683b = i4;
        }

        public void k(int i4) {
            this.f1682a = i4;
        }

        public void l(float f4, float f5) {
            this.f1684c = f4;
            this.f1685d = f5;
        }

        public void m() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f1686e = jCurrentAnimationTimeMillis;
            this.f1690i = -1L;
            this.f1687f = jCurrentAnimationTimeMillis;
            this.f1691j = 0.5f;
            this.f1688g = 0;
            this.f1689h = 0;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.f1679p) {
                if (aVar.f1677n) {
                    aVar.f1677n = false;
                    aVar.f1665b.m();
                }
                C0048a c0048a = a.this.f1665b;
                if (c0048a.h() || !a.this.u()) {
                    a.this.f1679p = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.f1678o) {
                    aVar2.f1678o = false;
                    aVar2.c();
                }
                c0048a.a();
                a.this.j(c0048a.b(), c0048a.c());
                AbstractC0241y.B(a.this.f1667d, this);
            }
        }
    }

    public a(View view) {
        this.f1667d = view;
        float f4 = Resources.getSystem().getDisplayMetrics().density;
        float f5 = (int) ((1575.0f * f4) + 0.5f);
        o(f5, f5);
        float f6 = (int) ((f4 * 315.0f) + 0.5f);
        p(f6, f6);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(f1664s);
        r(500);
        q(500);
    }

    public static float e(float f4, float f5, float f6) {
        return f4 > f6 ? f6 : f4 < f5 ? f5 : f4;
    }

    public static int f(int i4, int i5, int i6) {
        return i4 > i6 ? i6 : i4 < i5 ? i5 : i4;
    }

    public abstract boolean a(int i4);

    public abstract boolean b(int i4);

    public void c() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f1667d.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    public final float d(int i4, float f4, float f5, float f6) {
        float fH = h(this.f1669f[i4], f5, this.f1670g[i4], f4);
        if (fH == 0.0f) {
            return 0.0f;
        }
        float f7 = this.f1673j[i4];
        float f8 = this.f1674k[i4];
        float f9 = this.f1675l[i4];
        float f10 = f7 * f6;
        return fH > 0.0f ? e(fH * f10, f8, f9) : -e((-fH) * f10, f8, f9);
    }

    public final float g(float f4, float f5) {
        if (f5 == 0.0f) {
            return 0.0f;
        }
        int i4 = this.f1671h;
        if (i4 == 0 || i4 == 1) {
            if (f4 < f5) {
                if (f4 >= 0.0f) {
                    return 1.0f - (f4 / f5);
                }
                if (this.f1679p && i4 == 1) {
                    return 1.0f;
                }
            }
        } else if (i4 == 2 && f4 < 0.0f) {
            return f4 / (-f5);
        }
        return 0.0f;
    }

    public final float h(float f4, float f5, float f6, float f7) {
        float interpolation;
        float fE = e(f4 * f5, 0.0f, f6);
        float fG = g(f5 - f7, fE) - g(f7, fE);
        if (fG < 0.0f) {
            interpolation = -this.f1666c.getInterpolation(-fG);
        } else {
            if (fG <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f1666c.getInterpolation(fG);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    public final void i() {
        if (this.f1677n) {
            this.f1679p = false;
        } else {
            this.f1665b.i();
        }
    }

    public abstract void j(int i4, int i5);

    public a k(int i4) {
        this.f1672i = i4;
        return this;
    }

    public a l(int i4) {
        this.f1671h = i4;
        return this;
    }

    public a m(boolean z3) {
        if (this.f1680q && !z3) {
            i();
        }
        this.f1680q = z3;
        return this;
    }

    public a n(float f4, float f5) {
        float[] fArr = this.f1670g;
        fArr[0] = f4;
        fArr[1] = f5;
        return this;
    }

    public a o(float f4, float f5) {
        float[] fArr = this.f1675l;
        fArr[0] = f4 / 1000.0f;
        fArr[1] = f5 / 1000.0f;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f1680q
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.i()
            goto L58
        L1a:
            r5.f1678o = r2
            r5.f1676m = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f1667d
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f1667d
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            H.a$a r7 = r5.f1665b
            r7.l(r0, r6)
            boolean r6 = r5.f1679p
            if (r6 != 0) goto L58
            boolean r6 = r5.u()
            if (r6 == 0) goto L58
            r5.v()
        L58:
            boolean r6 = r5.f1681r
            if (r6 == 0) goto L61
            boolean r6 = r5.f1679p
            if (r6 == 0) goto L61
            return r2
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: H.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public a p(float f4, float f5) {
        float[] fArr = this.f1674k;
        fArr[0] = f4 / 1000.0f;
        fArr[1] = f5 / 1000.0f;
        return this;
    }

    public a q(int i4) {
        this.f1665b.j(i4);
        return this;
    }

    public a r(int i4) {
        this.f1665b.k(i4);
        return this;
    }

    public a s(float f4, float f5) {
        float[] fArr = this.f1669f;
        fArr[0] = f4;
        fArr[1] = f5;
        return this;
    }

    public a t(float f4, float f5) {
        float[] fArr = this.f1673j;
        fArr[0] = f4 / 1000.0f;
        fArr[1] = f5 / 1000.0f;
        return this;
    }

    public boolean u() {
        C0048a c0048a = this.f1665b;
        int iF = c0048a.f();
        int iD = c0048a.d();
        if (iF == 0 || !b(iF)) {
            return iD != 0 && a(iD);
        }
        return true;
    }

    public final void v() {
        int i4;
        if (this.f1668e == null) {
            this.f1668e = new b();
        }
        this.f1679p = true;
        this.f1677n = true;
        if (this.f1676m || (i4 = this.f1672i) <= 0) {
            this.f1668e.run();
        } else {
            AbstractC0241y.C(this.f1667d, this.f1668e, i4);
        }
        this.f1676m = true;
    }
}
