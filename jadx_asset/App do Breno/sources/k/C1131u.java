package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import c.AbstractC0645i;
import java.lang.ref.WeakReference;
import u.d;

/* JADX INFO: renamed from: k.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1131u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f8835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Y f8836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Y f8837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Y f8838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Y f8839e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Y f8840f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Y f8841g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Y f8842h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C1135y f8843i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f8844j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8845k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Typeface f8846l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f8847m;

    public C1131u(TextView textView) {
        this.f8835a = textView;
        this.f8843i = new C1135y(textView);
    }

    public static Y d(Context context, C1116e c1116e, int i4) {
        ColorStateList colorStateListE = c1116e.e(context, i4);
        if (colorStateListE == null) {
            return null;
        }
        Y y3 = new Y();
        y3.f8767d = true;
        y3.f8764a = colorStateListE;
        return y3;
    }

    public final void A(int i4, float f4) {
        this.f8843i.u(i4, f4);
    }

    public void B(Typeface typeface) {
        if (this.f8847m) {
            this.f8835a.setTypeface(typeface);
            this.f8846l = typeface;
        }
    }

    public final void C(Context context, a0 a0Var) {
        String strM;
        this.f8844j = a0Var.i(AbstractC0645i.f5869p2, this.f8844j);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            int i5 = a0Var.i(AbstractC0645i.f5881s2, -1);
            this.f8845k = i5;
            if (i5 != -1) {
                this.f8844j &= 2;
            }
        }
        if (!a0Var.o(AbstractC0645i.f5877r2) && !a0Var.o(AbstractC0645i.f5885t2)) {
            if (a0Var.o(AbstractC0645i.f5865o2)) {
                this.f8847m = false;
                int i6 = a0Var.i(AbstractC0645i.f5865o2, 1);
                if (i6 == 1) {
                    this.f8846l = Typeface.SANS_SERIF;
                    return;
                } else if (i6 == 2) {
                    this.f8846l = Typeface.SERIF;
                    return;
                } else {
                    if (i6 != 3) {
                        return;
                    }
                    this.f8846l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f8846l = null;
        int i7 = a0Var.o(AbstractC0645i.f5885t2) ? AbstractC0645i.f5885t2 : AbstractC0645i.f5877r2;
        int i8 = this.f8845k;
        int i9 = this.f8844j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceH = a0Var.h(i7, this.f8844j, new a(this, i8, i9));
                if (typefaceH != null) {
                    if (i4 < 28 || this.f8845k == -1) {
                        this.f8846l = typefaceH;
                    } else {
                        this.f8846l = Typeface.create(Typeface.create(typefaceH, 0), this.f8845k, (this.f8844j & 2) != 0);
                    }
                }
                this.f8847m = this.f8846l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f8846l != null || (strM = a0Var.m(i7)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f8845k == -1) {
            this.f8846l = Typeface.create(strM, this.f8844j);
        } else {
            this.f8846l = Typeface.create(Typeface.create(strM, 0), this.f8845k, (this.f8844j & 2) != 0);
        }
    }

    public final void a(Drawable drawable, Y y3) {
        if (drawable == null || y3 == null) {
            return;
        }
        C1116e.g(drawable, y3, this.f8835a.getDrawableState());
    }

    public void b() {
        if (this.f8836b != null || this.f8837c != null || this.f8838d != null || this.f8839e != null) {
            Drawable[] compoundDrawables = this.f8835a.getCompoundDrawables();
            a(compoundDrawables[0], this.f8836b);
            a(compoundDrawables[1], this.f8837c);
            a(compoundDrawables[2], this.f8838d);
            a(compoundDrawables[3], this.f8839e);
        }
        if (this.f8840f == null && this.f8841g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f8835a.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f8840f);
        a(compoundDrawablesRelative[2], this.f8841g);
    }

    public void c() {
        this.f8843i.a();
    }

    public int e() {
        return this.f8843i.g();
    }

    public int f() {
        return this.f8843i.h();
    }

    public int g() {
        return this.f8843i.i();
    }

    public int[] h() {
        return this.f8843i.j();
    }

    public int i() {
        return this.f8843i.k();
    }

    public ColorStateList j() {
        Y y3 = this.f8842h;
        if (y3 != null) {
            return y3.f8764a;
        }
        return null;
    }

    public PorterDuff.Mode k() {
        Y y3 = this.f8842h;
        if (y3 != null) {
            return y3.f8765b;
        }
        return null;
    }

    public boolean l() {
        return this.f8843i.o();
    }

    public void m(AttributeSet attributeSet, int i4) {
        boolean zA;
        boolean z3;
        String strM;
        String strM2;
        Drawable drawable;
        Drawable drawable2;
        Context context = this.f8835a.getContext();
        C1116e c1116eB = C1116e.b();
        a0 a0VarR = a0.r(context, attributeSet, AbstractC0645i.f5740M, i4, 0);
        int iL = a0VarR.l(AbstractC0645i.f5744N, -1);
        if (a0VarR.o(AbstractC0645i.f5756Q)) {
            this.f8836b = d(context, c1116eB, a0VarR.l(AbstractC0645i.f5756Q, 0));
        }
        if (a0VarR.o(AbstractC0645i.f5748O)) {
            this.f8837c = d(context, c1116eB, a0VarR.l(AbstractC0645i.f5748O, 0));
        }
        if (a0VarR.o(AbstractC0645i.f5760R)) {
            this.f8838d = d(context, c1116eB, a0VarR.l(AbstractC0645i.f5760R, 0));
        }
        if (a0VarR.o(AbstractC0645i.f5752P)) {
            this.f8839e = d(context, c1116eB, a0VarR.l(AbstractC0645i.f5752P, 0));
        }
        int i5 = Build.VERSION.SDK_INT;
        if (a0VarR.o(AbstractC0645i.f5764S)) {
            this.f8840f = d(context, c1116eB, a0VarR.l(AbstractC0645i.f5764S, 0));
        }
        if (a0VarR.o(AbstractC0645i.f5768T)) {
            this.f8841g = d(context, c1116eB, a0VarR.l(AbstractC0645i.f5768T, 0));
        }
        a0VarR.s();
        boolean z4 = this.f8835a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (iL != -1) {
            a0 a0VarP = a0.p(context, iL, AbstractC0645i.f5857m2);
            if (z4 || !a0VarP.o(AbstractC0645i.f5893v2)) {
                zA = false;
                z3 = false;
            } else {
                zA = a0VarP.a(AbstractC0645i.f5893v2, false);
                z3 = true;
            }
            C(context, a0VarP);
            strM2 = a0VarP.o(AbstractC0645i.f5897w2) ? a0VarP.m(AbstractC0645i.f5897w2) : null;
            strM = (i5 < 26 || !a0VarP.o(AbstractC0645i.f5889u2)) ? null : a0VarP.m(AbstractC0645i.f5889u2);
            a0VarP.s();
        } else {
            zA = false;
            z3 = false;
            strM = null;
            strM2 = null;
        }
        a0 a0VarR2 = a0.r(context, attributeSet, AbstractC0645i.f5857m2, i4, 0);
        if (!z4 && a0VarR2.o(AbstractC0645i.f5893v2)) {
            zA = a0VarR2.a(AbstractC0645i.f5893v2, false);
            z3 = true;
        }
        if (a0VarR2.o(AbstractC0645i.f5897w2)) {
            strM2 = a0VarR2.m(AbstractC0645i.f5897w2);
        }
        if (i5 >= 26 && a0VarR2.o(AbstractC0645i.f5889u2)) {
            strM = a0VarR2.m(AbstractC0645i.f5889u2);
        }
        if (i5 >= 28 && a0VarR2.o(AbstractC0645i.f5861n2) && a0VarR2.e(AbstractC0645i.f5861n2, -1) == 0) {
            this.f8835a.setTextSize(0, 0.0f);
        }
        C(context, a0VarR2);
        a0VarR2.s();
        if (!z4 && z3) {
            r(zA);
        }
        Typeface typeface = this.f8846l;
        if (typeface != null) {
            if (this.f8845k == -1) {
                this.f8835a.setTypeface(typeface, this.f8844j);
            } else {
                this.f8835a.setTypeface(typeface);
            }
        }
        if (strM != null) {
            this.f8835a.setFontVariationSettings(strM);
        }
        if (strM2 != null) {
            this.f8835a.setTextLocales(LocaleList.forLanguageTags(strM2));
        }
        this.f8843i.p(attributeSet, i4);
        if (H.b.f1694a && this.f8843i.k() != 0) {
            int[] iArrJ = this.f8843i.j();
            if (iArrJ.length > 0) {
                if (this.f8835a.getAutoSizeStepGranularity() != -1.0f) {
                    this.f8835a.setAutoSizeTextTypeUniformWithConfiguration(this.f8843i.h(), this.f8843i.g(), this.f8843i.i(), 0);
                } else {
                    this.f8835a.setAutoSizeTextTypeUniformWithPresetSizes(iArrJ, 0);
                }
            }
        }
        a0 a0VarQ = a0.q(context, attributeSet, AbstractC0645i.f5772U);
        int iL2 = a0VarQ.l(AbstractC0645i.f5807c0, -1);
        Drawable drawableC = iL2 != -1 ? c1116eB.c(context, iL2) : null;
        int iL3 = a0VarQ.l(AbstractC0645i.f5832h0, -1);
        Drawable drawableC2 = iL3 != -1 ? c1116eB.c(context, iL3) : null;
        int iL4 = a0VarQ.l(AbstractC0645i.f5812d0, -1);
        Drawable drawableC3 = iL4 != -1 ? c1116eB.c(context, iL4) : null;
        int iL5 = a0VarQ.l(AbstractC0645i.f5797a0, -1);
        Drawable drawableC4 = iL5 != -1 ? c1116eB.c(context, iL5) : null;
        int iL6 = a0VarQ.l(AbstractC0645i.f5817e0, -1);
        Drawable drawableC5 = iL6 != -1 ? c1116eB.c(context, iL6) : null;
        int iL7 = a0VarQ.l(AbstractC0645i.f5802b0, -1);
        if (iL7 != -1) {
            Drawable drawableC6 = c1116eB.c(context, iL7);
            drawable = drawableC4;
            drawable2 = drawableC6;
        } else {
            drawable = drawableC4;
            drawable2 = null;
        }
        x(drawableC, drawableC2, drawableC3, drawable, drawableC5, drawable2);
        if (a0VarQ.o(AbstractC0645i.f5822f0)) {
            H.g.f(this.f8835a, a0VarQ.c(AbstractC0645i.f5822f0));
        }
        if (a0VarQ.o(AbstractC0645i.f5827g0)) {
            H.g.g(this.f8835a, G.d(a0VarQ.i(AbstractC0645i.f5827g0, -1), null));
        }
        int iE = a0VarQ.e(AbstractC0645i.f5837i0, -1);
        int iE2 = a0VarQ.e(AbstractC0645i.f5842j0, -1);
        int iE3 = a0VarQ.e(AbstractC0645i.f5847k0, -1);
        a0VarQ.s();
        if (iE != -1) {
            H.g.h(this.f8835a, iE);
        }
        if (iE2 != -1) {
            H.g.i(this.f8835a, iE2);
        }
        if (iE3 != -1) {
            H.g.j(this.f8835a, iE3);
        }
    }

    public void n(boolean z3, int i4, int i5, int i6, int i7) {
        if (H.b.f1694a) {
            return;
        }
        c();
    }

    public void o() {
        b();
    }

    public void p(Context context, int i4) {
        String strM;
        a0 a0VarP = a0.p(context, i4, AbstractC0645i.f5857m2);
        if (a0VarP.o(AbstractC0645i.f5893v2)) {
            r(a0VarP.a(AbstractC0645i.f5893v2, false));
        }
        int i5 = Build.VERSION.SDK_INT;
        if (a0VarP.o(AbstractC0645i.f5861n2) && a0VarP.e(AbstractC0645i.f5861n2, -1) == 0) {
            this.f8835a.setTextSize(0, 0.0f);
        }
        C(context, a0VarP);
        if (i5 >= 26 && a0VarP.o(AbstractC0645i.f5889u2) && (strM = a0VarP.m(AbstractC0645i.f5889u2)) != null) {
            this.f8835a.setFontVariationSettings(strM);
        }
        a0VarP.s();
        Typeface typeface = this.f8846l;
        if (typeface != null) {
            this.f8835a.setTypeface(typeface, this.f8844j);
        }
    }

    public void q(Runnable runnable) {
        this.f8835a.post(runnable);
    }

    public void r(boolean z3) {
        this.f8835a.setAllCaps(z3);
    }

    public void s(int i4, int i5, int i6, int i7) {
        this.f8843i.q(i4, i5, i6, i7);
    }

    public void t(int[] iArr, int i4) {
        this.f8843i.r(iArr, i4);
    }

    public void u(int i4) {
        this.f8843i.s(i4);
    }

    public void v(ColorStateList colorStateList) {
        if (this.f8842h == null) {
            this.f8842h = new Y();
        }
        Y y3 = this.f8842h;
        y3.f8764a = colorStateList;
        y3.f8767d = colorStateList != null;
        y();
    }

    public void w(PorterDuff.Mode mode) {
        if (this.f8842h == null) {
            this.f8842h = new Y();
        }
        Y y3 = this.f8842h;
        y3.f8765b = mode;
        y3.f8766c = mode != null;
        y();
    }

    public final void x(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f8835a.getCompoundDrawablesRelative();
            TextView textView = this.f8835a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.f8835a.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            TextView textView2 = this.f8835a;
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            Drawable drawable8 = compoundDrawablesRelative2[2];
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f8835a.getCompoundDrawables();
        TextView textView3 = this.f8835a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    public final void y() {
        Y y3 = this.f8842h;
        this.f8836b = y3;
        this.f8837c = y3;
        this.f8838d = y3;
        this.f8839e = y3;
        this.f8840f = y3;
        this.f8841g = y3;
    }

    public void z(int i4, float f4) {
        if (H.b.f1694a || l()) {
            return;
        }
        A(i4, f4);
    }

    /* JADX INFO: renamed from: k.u$a */
    public static class a extends d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference f8848a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8849b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f8850c;

        /* JADX INFO: renamed from: k.u$a$a, reason: collision with other inner class name */
        public class RunnableC0133a implements Runnable {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public final WeakReference f8851m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public final Typeface f8852n;

            public RunnableC0133a(WeakReference weakReference, Typeface typeface) {
                this.f8851m = weakReference;
                this.f8852n = typeface;
            }

            @Override // java.lang.Runnable
            public void run() {
                C1131u c1131u = (C1131u) this.f8851m.get();
                if (c1131u == null) {
                    return;
                }
                c1131u.B(this.f8852n);
            }
        }

        public a(C1131u c1131u, int i4, int i5) {
            this.f8848a = new WeakReference(c1131u);
            this.f8849b = i4;
            this.f8850c = i5;
        }

        @Override // u.d.a
        public void g(Typeface typeface) {
            int i4;
            C1131u c1131u = (C1131u) this.f8848a.get();
            if (c1131u == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 28 && (i4 = this.f8849b) != -1) {
                typeface = Typeface.create(typeface, i4, (this.f8850c & 2) != 0);
            }
            c1131u.q(new RunnableC0133a(this.f8848a, typeface));
        }

        @Override // u.d.a
        public void f(int i4) {
        }
    }
}
