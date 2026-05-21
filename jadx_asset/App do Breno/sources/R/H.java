package R;

import C.AbstractC0241y;
import R.S;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.AbstractC0609f;

/* JADX INFO: loaded from: classes.dex */
public class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f3023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I f3024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0497o f3025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3026d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3027e = -1;

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3030a;

        static {
            int[] iArr = new int[AbstractC0609f.b.values().length];
            f3030a = iArr;
            try {
                iArr[AbstractC0609f.b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3030a[AbstractC0609f.b.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3030a[AbstractC0609f.b.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3030a[AbstractC0609f.b.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public H(w wVar, I i4, AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o) {
        this.f3023a = wVar;
        this.f3024b = i4;
        this.f3025c = abstractComponentCallbacksC0497o;
    }

    public void a() {
        if (B.m0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f3025c);
        }
        Bundle bundle = this.f3025c.f3248c;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        this.f3025c.z0(bundle2);
        this.f3023a.a(this.f3025c, bundle2, false);
    }

    public void b() {
        AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497oS = B.S(this.f3025c.f3227I);
        AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497oC = this.f3025c.C();
        if (abstractComponentCallbacksC0497oS != null && !abstractComponentCallbacksC0497oS.equals(abstractComponentCallbacksC0497oC)) {
            AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o = this.f3025c;
            S.c.m(abstractComponentCallbacksC0497o, abstractComponentCallbacksC0497oS, abstractComponentCallbacksC0497o.f3271z);
        }
        int iH = this.f3024b.h(this.f3025c);
        AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o2 = this.f3025c;
        abstractComponentCallbacksC0497o2.f3227I.addView(abstractComponentCallbacksC0497o2.f3228J, iH);
    }

    public void c() {
        if (B.m0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f3025c);
        }
        AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o = this.f3025c;
        AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o2 = abstractComponentCallbacksC0497o.f3254i;
        H hL = null;
        if (abstractComponentCallbacksC0497o2 != null) {
            H hL2 = this.f3024b.l(abstractComponentCallbacksC0497o2.f3252g);
            if (hL2 == null) {
                throw new IllegalStateException("Fragment " + this.f3025c + " declared target fragment " + this.f3025c.f3254i + " that does not belong to this FragmentManager!");
            }
            AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o3 = this.f3025c;
            abstractComponentCallbacksC0497o3.f3255j = abstractComponentCallbacksC0497o3.f3254i.f3252g;
            abstractComponentCallbacksC0497o3.f3254i = null;
            hL = hL2;
        } else {
            String str = abstractComponentCallbacksC0497o.f3255j;
            if (str != null && (hL = this.f3024b.l(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f3025c + " declared target fragment " + this.f3025c.f3255j + " that does not belong to this FragmentManager!");
            }
        }
        if (hL != null) {
            hL.m();
        }
        AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o4 = this.f3025c;
        abstractComponentCallbacksC0497o4.f3267v.b0();
        abstractComponentCallbacksC0497o4.getClass();
        AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o5 = this.f3025c;
        abstractComponentCallbacksC0497o5.f3269x = abstractComponentCallbacksC0497o5.f3267v.d0();
        this.f3023a.f(this.f3025c, false);
        this.f3025c.A0();
        this.f3023a.b(this.f3025c, false);
    }

    public int d() {
        AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o = this.f3025c;
        if (abstractComponentCallbacksC0497o.f3267v == null) {
            return abstractComponentCallbacksC0497o.f3246b;
        }
        int iMin = this.f3027e;
        int i4 = b.f3030a[abstractComponentCallbacksC0497o.f3237S.ordinal()];
        if (i4 != 1) {
            iMin = i4 != 2 ? i4 != 3 ? i4 != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0) : Math.min(iMin, 1) : Math.min(iMin, 5);
        }
        AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o2 = this.f3025c;
        if (abstractComponentCallbacksC0497o2.f3262q) {
            if (abstractComponentCallbacksC0497o2.f3263r) {
                iMin = Math.max(this.f3027e, 2);
                View view = this.f3025c.f3228J;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f3027e < 4 ? Math.min(iMin, abstractComponentCallbacksC0497o2.f3246b) : Math.min(iMin, 1);
            }
        }
        if (!this.f3025c.f3258m) {
            iMin = Math.min(iMin, 1);
        }
        AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o3 = this.f3025c;
        ViewGroup viewGroup = abstractComponentCallbacksC0497o3.f3227I;
        S.d.a aVarR = viewGroup != null ? S.t(viewGroup, abstractComponentCallbacksC0497o3.D()).r(this) : null;
        if (aVarR == S.d.a.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (aVarR == S.d.a.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else {
            AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o4 = this.f3025c;
            if (abstractComponentCallbacksC0497o4.f3259n) {
                iMin = abstractComponentCallbacksC0497o4.b0() ? Math.min(iMin, 1) : Math.min(iMin, -1);
            }
        }
        AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o5 = this.f3025c;
        if (abstractComponentCallbacksC0497o5.f3229K && abstractComponentCallbacksC0497o5.f3246b < 5) {
            iMin = Math.min(iMin, 4);
        }
        AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o6 = this.f3025c;
        if (abstractComponentCallbacksC0497o6.f3260o && abstractComponentCallbacksC0497o6.f3227I != null) {
            iMin = Math.max(iMin, 3);
        }
        if (B.m0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + this.f3025c);
        }
        return iMin;
    }

    public void e() {
        if (B.m0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f3025c);
        }
        Bundle bundle = this.f3025c.f3248c;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o = this.f3025c;
        if (abstractComponentCallbacksC0497o.f3235Q) {
            abstractComponentCallbacksC0497o.f3246b = 1;
            abstractComponentCallbacksC0497o.U0();
        } else {
            this.f3023a.g(abstractComponentCallbacksC0497o, bundle2, false);
            this.f3025c.C0(bundle2);
            this.f3023a.c(this.f3025c, bundle2, false);
        }
    }

    public void f() {
        String resourceName;
        if (this.f3025c.f3262q) {
            return;
        }
        if (B.m0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f3025c);
        }
        Bundle bundle = this.f3025c.f3248c;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterG0 = this.f3025c.G0(bundle2);
        AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o = this.f3025c;
        ViewGroup viewGroup2 = abstractComponentCallbacksC0497o.f3227I;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i4 = abstractComponentCallbacksC0497o.f3271z;
            if (i4 != 0) {
                if (i4 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f3025c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC0497o.f3267v.Y().a(this.f3025c.f3271z);
                if (viewGroup == null) {
                    AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o2 = this.f3025c;
                    if (!abstractComponentCallbacksC0497o2.f3264s) {
                        try {
                            resourceName = abstractComponentCallbacksC0497o2.J().getResourceName(this.f3025c.f3271z);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f3025c.f3271z) + " (" + resourceName + ") for fragment " + this.f3025c);
                    }
                } else if (!(viewGroup instanceof C0500s)) {
                    S.c.l(this.f3025c, viewGroup);
                }
            }
        }
        AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o3 = this.f3025c;
        abstractComponentCallbacksC0497o3.f3227I = viewGroup;
        abstractComponentCallbacksC0497o3.D0(layoutInflaterG0, viewGroup, bundle2);
        if (this.f3025c.f3228J != null) {
            if (B.m0(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + this.f3025c);
            }
            this.f3025c.f3228J.setSaveFromParentEnabled(false);
            AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o4 = this.f3025c;
            abstractComponentCallbacksC0497o4.f3228J.setTag(Q.b.f2909a, abstractComponentCallbacksC0497o4);
            if (viewGroup != null) {
                b();
            }
            AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o5 = this.f3025c;
            if (abstractComponentCallbacksC0497o5.f3220B) {
                abstractComponentCallbacksC0497o5.f3228J.setVisibility(8);
            }
            if (this.f3025c.f3228J.isAttachedToWindow()) {
                AbstractC0241y.D(this.f3025c.f3228J);
            } else {
                View view = this.f3025c.f3228J;
                view.addOnAttachStateChangeListener(new a(view));
            }
            this.f3025c.O0();
            w wVar = this.f3023a;
            AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o6 = this.f3025c;
            wVar.l(abstractComponentCallbacksC0497o6, abstractComponentCallbacksC0497o6.f3228J, bundle2, false);
            int visibility = this.f3025c.f3228J.getVisibility();
            this.f3025c.d1(this.f3025c.f3228J.getAlpha());
            AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o7 = this.f3025c;
            if (abstractComponentCallbacksC0497o7.f3227I != null && visibility == 0) {
                View viewFindFocus = abstractComponentCallbacksC0497o7.f3228J.findFocus();
                if (viewFindFocus != null) {
                    this.f3025c.Y0(viewFindFocus);
                    if (B.m0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + this.f3025c);
                    }
                }
                this.f3025c.f3228J.setAlpha(0.0f);
            }
        }
        this.f3025c.f3246b = 2;
    }

    public void g() {
        AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497oE;
        if (B.m0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f3025c);
        }
        AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o = this.f3025c;
        boolean z3 = abstractComponentCallbacksC0497o.f3259n && !abstractComponentCallbacksC0497o.b0();
        if (z3) {
            AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o2 = this.f3025c;
            if (!abstractComponentCallbacksC0497o2.f3261p) {
                this.f3024b.z(abstractComponentCallbacksC0497o2.f3252g, null);
            }
        }
        if (z3 || this.f3024b.n().n(this.f3025c)) {
            this.f3025c.getClass();
            throw null;
        }
        String str = this.f3025c.f3255j;
        if (str != null && (abstractComponentCallbacksC0497oE = this.f3024b.e(str)) != null && abstractComponentCallbacksC0497oE.f3222D) {
            this.f3025c.f3254i = abstractComponentCallbacksC0497oE;
        }
        this.f3025c.f3246b = 0;
    }

    public void h() {
        View view;
        if (B.m0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f3025c);
        }
        AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o = this.f3025c;
        ViewGroup viewGroup = abstractComponentCallbacksC0497o.f3227I;
        if (viewGroup != null && (view = abstractComponentCallbacksC0497o.f3228J) != null) {
            viewGroup.removeView(view);
        }
        this.f3025c.E0();
        this.f3023a.m(this.f3025c, false);
        AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o2 = this.f3025c;
        abstractComponentCallbacksC0497o2.f3227I = null;
        abstractComponentCallbacksC0497o2.f3228J = null;
        abstractComponentCallbacksC0497o2.f3239U = null;
        abstractComponentCallbacksC0497o2.f3240V.d(null);
        this.f3025c.f3263r = false;
    }

    public void i() {
        if (B.m0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f3025c);
        }
        this.f3025c.F0();
        this.f3023a.d(this.f3025c, false);
        AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o = this.f3025c;
        abstractComponentCallbacksC0497o.f3246b = -1;
        abstractComponentCallbacksC0497o.getClass();
        AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o2 = this.f3025c;
        abstractComponentCallbacksC0497o2.f3269x = null;
        abstractComponentCallbacksC0497o2.f3267v = null;
        if ((!abstractComponentCallbacksC0497o2.f3259n || abstractComponentCallbacksC0497o2.b0()) && !this.f3024b.n().n(this.f3025c)) {
            return;
        }
        if (B.m0(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + this.f3025c);
        }
        this.f3025c.X();
    }

    public void j() {
        AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o = this.f3025c;
        if (abstractComponentCallbacksC0497o.f3262q && abstractComponentCallbacksC0497o.f3263r && !abstractComponentCallbacksC0497o.f3265t) {
            if (B.m0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f3025c);
            }
            Bundle bundle = this.f3025c.f3248c;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o2 = this.f3025c;
            abstractComponentCallbacksC0497o2.D0(abstractComponentCallbacksC0497o2.G0(bundle2), null, bundle2);
            View view = this.f3025c.f3228J;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o3 = this.f3025c;
                abstractComponentCallbacksC0497o3.f3228J.setTag(Q.b.f2909a, abstractComponentCallbacksC0497o3);
                AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o4 = this.f3025c;
                if (abstractComponentCallbacksC0497o4.f3220B) {
                    abstractComponentCallbacksC0497o4.f3228J.setVisibility(8);
                }
                this.f3025c.O0();
                w wVar = this.f3023a;
                AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o5 = this.f3025c;
                wVar.l(abstractComponentCallbacksC0497o5, abstractComponentCallbacksC0497o5.f3228J, bundle2, false);
                this.f3025c.f3246b = 2;
            }
        }
    }

    public AbstractComponentCallbacksC0497o k() {
        return this.f3025c;
    }

    public final boolean l(View view) {
        if (view == this.f3025c.f3228J) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f3025c.f3228J) {
                return true;
            }
        }
        return false;
    }

    public void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f3026d) {
            if (B.m0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + k());
                return;
            }
            return;
        }
        try {
            this.f3026d = true;
            boolean z3 = false;
            while (true) {
                int iD = d();
                AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o = this.f3025c;
                int i4 = abstractComponentCallbacksC0497o.f3246b;
                if (iD == i4) {
                    if (!z3 && i4 == -1 && abstractComponentCallbacksC0497o.f3259n && !abstractComponentCallbacksC0497o.b0() && !this.f3025c.f3261p) {
                        if (B.m0(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f3025c);
                        }
                        this.f3024b.n().e(this.f3025c, true);
                        this.f3024b.q(this);
                        if (B.m0(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + this.f3025c);
                        }
                        this.f3025c.X();
                    }
                    AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o2 = this.f3025c;
                    if (abstractComponentCallbacksC0497o2.f3233O) {
                        if (abstractComponentCallbacksC0497o2.f3228J != null && (viewGroup = abstractComponentCallbacksC0497o2.f3227I) != null) {
                            S sT = S.t(viewGroup, abstractComponentCallbacksC0497o2.D());
                            if (this.f3025c.f3220B) {
                                sT.j(this);
                            } else {
                                sT.l(this);
                            }
                        }
                        AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o3 = this.f3025c;
                        B b4 = abstractComponentCallbacksC0497o3.f3267v;
                        if (b4 != null) {
                            b4.k0(abstractComponentCallbacksC0497o3);
                        }
                        AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o4 = this.f3025c;
                        abstractComponentCallbacksC0497o4.f3233O = false;
                        abstractComponentCallbacksC0497o4.p0(abstractComponentCallbacksC0497o4.f3220B);
                        this.f3025c.f3268w.y();
                    }
                    this.f3026d = false;
                    return;
                }
                if (iD <= i4) {
                    switch (i4 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            if (abstractComponentCallbacksC0497o.f3261p && this.f3024b.o(abstractComponentCallbacksC0497o.f3252g) == null) {
                                this.f3024b.z(this.f3025c.f3252g, p());
                            }
                            g();
                            break;
                        case 1:
                            h();
                            this.f3025c.f3246b = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC0497o.f3263r = false;
                            abstractComponentCallbacksC0497o.f3246b = 2;
                            break;
                        case 3:
                            if (B.m0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f3025c);
                            }
                            AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o5 = this.f3025c;
                            if (abstractComponentCallbacksC0497o5.f3261p) {
                                this.f3024b.z(abstractComponentCallbacksC0497o5.f3252g, p());
                            } else if (abstractComponentCallbacksC0497o5.f3228J != null && abstractComponentCallbacksC0497o5.f3249d == null) {
                                q();
                            }
                            AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o6 = this.f3025c;
                            if (abstractComponentCallbacksC0497o6.f3228J != null && (viewGroup2 = abstractComponentCallbacksC0497o6.f3227I) != null) {
                                S.t(viewGroup2, abstractComponentCallbacksC0497o6.D()).k(this);
                            }
                            this.f3025c.f3246b = 3;
                            break;
                        case O.h.LONG_FIELD_NUMBER /* 4 */:
                            t();
                            break;
                        case O.h.STRING_FIELD_NUMBER /* 5 */:
                            abstractComponentCallbacksC0497o.f3246b = 5;
                            break;
                        case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
                            n();
                            break;
                    }
                } else {
                    switch (i4 + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case O.h.LONG_FIELD_NUMBER /* 4 */:
                            if (abstractComponentCallbacksC0497o.f3228J != null && (viewGroup3 = abstractComponentCallbacksC0497o.f3227I) != null) {
                                S.t(viewGroup3, abstractComponentCallbacksC0497o.D()).i(S.d.b.g(this.f3025c.f3228J.getVisibility()), this);
                            }
                            this.f3025c.f3246b = 4;
                            break;
                        case O.h.STRING_FIELD_NUMBER /* 5 */:
                            s();
                            break;
                        case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
                            abstractComponentCallbacksC0497o.f3246b = 6;
                            break;
                        case O.h.DOUBLE_FIELD_NUMBER /* 7 */:
                            o();
                            break;
                    }
                }
                z3 = true;
            }
        } catch (Throwable th) {
            this.f3026d = false;
            throw th;
        }
    }

    public void n() {
        if (B.m0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f3025c);
        }
        this.f3025c.I0();
        this.f3023a.e(this.f3025c, false);
    }

    public void o() {
        if (B.m0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f3025c);
        }
        View viewX = this.f3025c.x();
        if (viewX != null && l(viewX)) {
            boolean zRequestFocus = viewX.requestFocus();
            if (B.m0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("requestFocus: Restoring focused view ");
                sb.append(viewX);
                sb.append(" ");
                sb.append(zRequestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(this.f3025c);
                sb.append(" resulting in focused view ");
                sb.append(this.f3025c.f3228J.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        this.f3025c.Y0(null);
        this.f3025c.K0();
        this.f3023a.h(this.f3025c, false);
        this.f3024b.z(this.f3025c.f3252g, null);
        AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o = this.f3025c;
        abstractComponentCallbacksC0497o.f3248c = null;
        abstractComponentCallbacksC0497o.f3249d = null;
        abstractComponentCallbacksC0497o.f3250e = null;
    }

    public Bundle p() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o = this.f3025c;
        if (abstractComponentCallbacksC0497o.f3246b == -1 && (bundle = abstractComponentCallbacksC0497o.f3248c) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new G(this.f3025c));
        if (this.f3025c.f3246b > -1) {
            Bundle bundle3 = new Bundle();
            this.f3025c.L0(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f3023a.i(this.f3025c, bundle3, false);
            Bundle bundle4 = new Bundle();
            this.f3025c.f3242X.e(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleD0 = this.f3025c.f3268w.D0();
            if (!bundleD0.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleD0);
            }
            if (this.f3025c.f3228J != null) {
                q();
            }
            SparseArray<? extends Parcelable> sparseArray = this.f3025c.f3249d;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = this.f3025c.f3250e;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = this.f3025c.f3253h;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public void q() {
        if (this.f3025c.f3228J == null) {
            return;
        }
        if (B.m0(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + this.f3025c + " with view " + this.f3025c.f3228J);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f3025c.f3228J.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f3025c.f3249d = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f3025c.f3239U.g(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f3025c.f3250e = bundle;
    }

    public void r(int i4) {
        this.f3027e = i4;
    }

    public void s() {
        if (B.m0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f3025c);
        }
        this.f3025c.M0();
        this.f3023a.j(this.f3025c, false);
    }

    public void t() {
        if (B.m0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f3025c);
        }
        this.f3025c.N0();
        this.f3023a.k(this.f3025c, false);
    }

    public H(w wVar, I i4, AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o, Bundle bundle) {
        this.f3023a = wVar;
        this.f3024b = i4;
        this.f3025c = abstractComponentCallbacksC0497o;
        abstractComponentCallbacksC0497o.f3249d = null;
        abstractComponentCallbacksC0497o.f3250e = null;
        abstractComponentCallbacksC0497o.f3266u = 0;
        abstractComponentCallbacksC0497o.f3263r = false;
        abstractComponentCallbacksC0497o.f3258m = false;
        AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o2 = abstractComponentCallbacksC0497o.f3254i;
        abstractComponentCallbacksC0497o.f3255j = abstractComponentCallbacksC0497o2 != null ? abstractComponentCallbacksC0497o2.f3252g : null;
        abstractComponentCallbacksC0497o.f3254i = null;
        abstractComponentCallbacksC0497o.f3248c = bundle;
        abstractComponentCallbacksC0497o.f3253h = bundle.getBundle("arguments");
    }

    public class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f3028b;

        public a(View view) {
            this.f3028b = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f3028b.removeOnAttachStateChangeListener(this);
            AbstractC0241y.D(this.f3028b);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}
