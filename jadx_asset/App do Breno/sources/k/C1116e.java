package k;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import c.AbstractC0637a;
import c.AbstractC0638b;
import c.AbstractC0640d;
import e.AbstractC0921a;
import k.Q;
import v.AbstractC1582a;

/* JADX INFO: renamed from: k.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1116e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f8804b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C1116e f8805c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Q f8806a;

    /* JADX INFO: renamed from: k.e$a */
    public static class a implements Q.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f8807a = {AbstractC0640d.f5610S, AbstractC0640d.f5608Q, AbstractC0640d.f5612a};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f8808b = {AbstractC0640d.f5626o, AbstractC0640d.f5593B, AbstractC0640d.f5631t, AbstractC0640d.f5627p, AbstractC0640d.f5628q, AbstractC0640d.f5630s, AbstractC0640d.f5629r};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f8809c = {AbstractC0640d.f5607P, AbstractC0640d.f5609R, AbstractC0640d.f5622k, AbstractC0640d.f5600I, AbstractC0640d.f5601J, AbstractC0640d.f5603L, AbstractC0640d.f5605N, AbstractC0640d.f5602K, AbstractC0640d.f5604M, AbstractC0640d.f5606O};

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int[] f8810d = {AbstractC0640d.f5634w, AbstractC0640d.f5620i, AbstractC0640d.f5633v};

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f8811e = {AbstractC0640d.f5599H, AbstractC0640d.f5611T};

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int[] f8812f = {AbstractC0640d.f5614c, AbstractC0640d.f5618g, AbstractC0640d.f5615d, AbstractC0640d.f5619h};

        /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x006b A[RETURN] */
        @Override // k.Q.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean a(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = k.C1116e.a()
                int[] r1 = r6.f8807a
                boolean r1 = r6.f(r1, r8)
                r2 = 1
                r3 = 0
                r4 = -1
                if (r1 == 0) goto L15
                int r8 = c.AbstractC0637a.f5567l
            L11:
                r1 = r0
                r5 = r2
            L13:
                r0 = r4
                goto L4e
            L15:
                int[] r1 = r6.f8809c
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L20
                int r8 = c.AbstractC0637a.f5565j
                goto L11
            L20:
                int[] r1 = r6.f8810d
                boolean r1 = r6.f(r1, r8)
                r5 = 16842801(0x1010031, float:2.3693695E-38)
                if (r1 == 0) goto L32
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            L2d:
                r1 = r0
                r0 = r4
                r8 = r5
            L30:
                r5 = r2
                goto L4e
            L32:
                int r1 = c.AbstractC0640d.f5632u
                if (r8 != r1) goto L45
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                r1 = 16842800(0x1010030, float:2.3693693E-38)
                r5 = r0
                r0 = r8
                r8 = r1
                r1 = r5
                goto L30
            L45:
                int r1 = c.AbstractC0640d.f5623l
                if (r8 != r1) goto L4a
                goto L2d
            L4a:
                r1 = r0
                r8 = r3
                r5 = r8
                goto L13
            L4e:
                if (r5 == 0) goto L6b
                boolean r3 = k.G.a(r9)
                if (r3 == 0) goto L5a
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L5a:
                int r7 = k.W.b(r7, r8)
                android.graphics.PorterDuffColorFilter r7 = k.C1116e.d(r7, r1)
                r9.setColorFilter(r7)
                if (r0 == r4) goto L6a
                r9.setAlpha(r0)
            L6a:
                return r2
            L6b:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: k.C1116e.a.a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // k.Q.c
        public PorterDuff.Mode b(int i4) {
            if (i4 == AbstractC0640d.f5597F) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // k.Q.c
        public Drawable c(Q q4, Context context, int i4) {
            if (i4 == AbstractC0640d.f5621j) {
                return new LayerDrawable(new Drawable[]{q4.i(context, AbstractC0640d.f5620i), q4.i(context, AbstractC0640d.f5622k)});
            }
            return null;
        }

        @Override // k.Q.c
        public ColorStateList d(Context context, int i4) {
            if (i4 == AbstractC0640d.f5624m) {
                return AbstractC0921a.a(context, AbstractC0638b.f5578c);
            }
            if (i4 == AbstractC0640d.f5598G) {
                return AbstractC0921a.a(context, AbstractC0638b.f5581f);
            }
            if (i4 == AbstractC0640d.f5597F) {
                return k(context);
            }
            if (i4 == AbstractC0640d.f5617f) {
                return j(context);
            }
            if (i4 == AbstractC0640d.f5613b) {
                return g(context);
            }
            if (i4 == AbstractC0640d.f5616e) {
                return i(context);
            }
            if (i4 == AbstractC0640d.f5595D || i4 == AbstractC0640d.f5596E) {
                return AbstractC0921a.a(context, AbstractC0638b.f5580e);
            }
            if (f(this.f8808b, i4)) {
                return W.d(context, AbstractC0637a.f5567l);
            }
            if (f(this.f8811e, i4)) {
                return AbstractC0921a.a(context, AbstractC0638b.f5577b);
            }
            if (f(this.f8812f, i4)) {
                return AbstractC0921a.a(context, AbstractC0638b.f5576a);
            }
            if (i4 == AbstractC0640d.f5592A) {
                return AbstractC0921a.a(context, AbstractC0638b.f5579d);
            }
            return null;
        }

        @Override // k.Q.c
        public boolean e(Context context, int i4, Drawable drawable) {
            if (i4 == AbstractC0640d.f5594C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                l(layerDrawable.findDrawableByLayerId(R.id.background), W.b(context, AbstractC0637a.f5567l), C1116e.f8804b);
                l(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), W.b(context, AbstractC0637a.f5567l), C1116e.f8804b);
                l(layerDrawable.findDrawableByLayerId(R.id.progress), W.b(context, AbstractC0637a.f5565j), C1116e.f8804b);
                return true;
            }
            if (i4 != AbstractC0640d.f5636y && i4 != AbstractC0640d.f5635x && i4 != AbstractC0640d.f5637z) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            l(layerDrawable2.findDrawableByLayerId(R.id.background), W.a(context, AbstractC0637a.f5567l), C1116e.f8804b);
            l(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), W.b(context, AbstractC0637a.f5565j), C1116e.f8804b);
            l(layerDrawable2.findDrawableByLayerId(R.id.progress), W.b(context, AbstractC0637a.f5565j), C1116e.f8804b);
            return true;
        }

        public final boolean f(int[] iArr, int i4) {
            for (int i5 : iArr) {
                if (i5 == i4) {
                    return true;
                }
            }
            return false;
        }

        public final ColorStateList g(Context context) {
            return h(context, 0);
        }

        public final ColorStateList h(Context context, int i4) {
            int iB = W.b(context, AbstractC0637a.f5566k);
            return new ColorStateList(new int[][]{W.f8751b, W.f8754e, W.f8752c, W.f8758i}, new int[]{W.a(context, AbstractC0637a.f5564i), AbstractC1582a.b(iB, i4), AbstractC1582a.b(iB, i4), i4});
        }

        public final ColorStateList i(Context context) {
            return h(context, W.b(context, AbstractC0637a.f5563h));
        }

        public final ColorStateList j(Context context) {
            return h(context, W.b(context, AbstractC0637a.f5564i));
        }

        public final ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList colorStateListD = W.d(context, AbstractC0637a.f5568m);
            if (colorStateListD == null || !colorStateListD.isStateful()) {
                iArr[0] = W.f8751b;
                iArr2[0] = W.a(context, AbstractC0637a.f5568m);
                iArr[1] = W.f8755f;
                iArr2[1] = W.b(context, AbstractC0637a.f5565j);
                iArr[2] = W.f8758i;
                iArr2[2] = W.b(context, AbstractC0637a.f5568m);
            } else {
                int[] iArr3 = W.f8751b;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
                iArr[1] = W.f8755f;
                iArr2[1] = W.b(context, AbstractC0637a.f5565j);
                iArr[2] = W.f8758i;
                iArr2[2] = colorStateListD.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        public final void l(Drawable drawable, int i4, PorterDuff.Mode mode) {
            if (G.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = C1116e.f8804b;
            }
            drawable.setColorFilter(C1116e.d(i4, mode));
        }
    }

    public static synchronized C1116e b() {
        try {
            if (f8805c == null) {
                f();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f8805c;
    }

    public static synchronized PorterDuffColorFilter d(int i4, PorterDuff.Mode mode) {
        return Q.k(i4, mode);
    }

    public static synchronized void f() {
        if (f8805c == null) {
            C1116e c1116e = new C1116e();
            f8805c = c1116e;
            c1116e.f8806a = Q.g();
            f8805c.f8806a.s(new a());
        }
    }

    public static void g(Drawable drawable, Y y3, int[] iArr) {
        Q.u(drawable, y3, iArr);
    }

    public synchronized Drawable c(Context context, int i4) {
        return this.f8806a.i(context, i4);
    }

    public synchronized ColorStateList e(Context context, int i4) {
        return this.f8806a.l(context, i4);
    }
}
