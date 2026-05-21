package h0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import h0.AbstractC0986l;

/* JADX INFO: loaded from: classes.dex */
public abstract class N extends AbstractC0986l {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final String[] f7331V = {"android:visibility:visibility", "android:visibility:parent"};

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public int f7332U = 3;

    public class a extends AbstractC0987m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f7333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f7334b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f7335c;

        public a(ViewGroup viewGroup, View view, View view2) {
            this.f7333a = viewGroup;
            this.f7334b = view;
            this.f7335c = view2;
        }

        @Override // h0.AbstractC0987m, h0.AbstractC0986l.f
        public void b(AbstractC0986l abstractC0986l) {
            if (this.f7334b.getParent() == null) {
                x.a(this.f7333a).a(this.f7334b);
            } else {
                N.this.i();
            }
        }

        @Override // h0.AbstractC0987m, h0.AbstractC0986l.f
        public void c(AbstractC0986l abstractC0986l) {
            x.a(this.f7333a).c(this.f7334b);
        }

        @Override // h0.AbstractC0986l.f
        public void e(AbstractC0986l abstractC0986l) {
            this.f7335c.setTag(AbstractC0983i.f7409a, null);
            x.a(this.f7333a).c(this.f7334b);
            abstractC0986l.T(this);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f7343a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f7344b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f7345c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f7346d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ViewGroup f7347e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ViewGroup f7348f;
    }

    private void g0(s sVar) {
        sVar.f7472a.put("android:visibility:visibility", Integer.valueOf(sVar.f7473b.getVisibility()));
        sVar.f7472a.put("android:visibility:parent", sVar.f7473b.getParent());
        int[] iArr = new int[2];
        sVar.f7473b.getLocationOnScreen(iArr);
        sVar.f7472a.put("android:visibility:screenLocation", iArr);
    }

    @Override // h0.AbstractC0986l
    public String[] H() {
        return f7331V;
    }

    @Override // h0.AbstractC0986l
    public boolean J(s sVar, s sVar2) {
        if (sVar == null && sVar2 == null) {
            return false;
        }
        if (sVar != null && sVar2 != null && sVar2.f7472a.containsKey("android:visibility:visibility") != sVar.f7472a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c cVarH0 = h0(sVar, sVar2);
        return cVarH0.f7343a && (cVarH0.f7345c == 0 || cVarH0.f7346d == 0);
    }

    public final c h0(s sVar, s sVar2) {
        c cVar = new c();
        cVar.f7343a = false;
        cVar.f7344b = false;
        if (sVar == null || !sVar.f7472a.containsKey("android:visibility:visibility")) {
            cVar.f7345c = -1;
            cVar.f7347e = null;
        } else {
            cVar.f7345c = ((Integer) sVar.f7472a.get("android:visibility:visibility")).intValue();
            cVar.f7347e = (ViewGroup) sVar.f7472a.get("android:visibility:parent");
        }
        if (sVar2 == null || !sVar2.f7472a.containsKey("android:visibility:visibility")) {
            cVar.f7346d = -1;
            cVar.f7348f = null;
        } else {
            cVar.f7346d = ((Integer) sVar2.f7472a.get("android:visibility:visibility")).intValue();
            cVar.f7348f = (ViewGroup) sVar2.f7472a.get("android:visibility:parent");
        }
        if (sVar != null && sVar2 != null) {
            int i4 = cVar.f7345c;
            int i5 = cVar.f7346d;
            if (i4 != i5 || cVar.f7347e != cVar.f7348f) {
                if (i4 != i5) {
                    if (i4 == 0) {
                        cVar.f7344b = false;
                        cVar.f7343a = true;
                        return cVar;
                    }
                    if (i5 == 0) {
                        cVar.f7344b = true;
                        cVar.f7343a = true;
                        return cVar;
                    }
                } else {
                    if (cVar.f7348f == null) {
                        cVar.f7344b = false;
                        cVar.f7343a = true;
                        return cVar;
                    }
                    if (cVar.f7347e == null) {
                        cVar.f7344b = true;
                        cVar.f7343a = true;
                        return cVar;
                    }
                }
            }
        } else {
            if (sVar == null && cVar.f7346d == 0) {
                cVar.f7344b = true;
                cVar.f7343a = true;
                return cVar;
            }
            if (sVar2 == null && cVar.f7345c == 0) {
                cVar.f7344b = false;
                cVar.f7343a = true;
            }
        }
        return cVar;
    }

    public abstract Animator i0(ViewGroup viewGroup, View view, s sVar, s sVar2);

    public Animator j0(ViewGroup viewGroup, s sVar, int i4, s sVar2, int i5) {
        if ((this.f7332U & 1) != 1 || sVar2 == null) {
            return null;
        }
        if (sVar == null) {
            View view = (View) sVar2.f7473b.getParent();
            if (h0(x(view, false), I(view, false)).f7343a) {
                return null;
            }
        }
        return i0(viewGroup, sVar2.f7473b, sVar, sVar2);
    }

    @Override // h0.AbstractC0986l
    public void k(s sVar) {
        g0(sVar);
    }

    public abstract Animator k0(ViewGroup viewGroup, View view, s sVar, s sVar2);

    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069 A[PHI: r2
      0x0069: PHI (r2v3 android.view.View) = 
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v6 android.view.View)
     binds: [B:26:0x003e, B:31:0x004d, B:37:0x0076, B:39:0x0079, B:41:0x007f, B:43:0x0083, B:34:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.Animator l0(android.view.ViewGroup r10, h0.s r11, int r12, h0.s r13, int r14) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.N.l0(android.view.ViewGroup, h0.s, int, h0.s, int):android.animation.Animator");
    }

    public void m0(int i4) {
        if ((i4 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f7332U = i4;
    }

    @Override // h0.AbstractC0986l
    public void n(s sVar) {
        g0(sVar);
    }

    @Override // h0.AbstractC0986l
    public Animator r(ViewGroup viewGroup, s sVar, s sVar2) {
        c cVarH0 = h0(sVar, sVar2);
        if (!cVarH0.f7343a) {
            return null;
        }
        if (cVarH0.f7347e == null && cVarH0.f7348f == null) {
            return null;
        }
        return cVarH0.f7344b ? j0(viewGroup, sVar, cVarH0.f7345c, sVar2, cVarH0.f7346d) : l0(viewGroup, sVar, cVarH0.f7345c, sVar2, cVarH0.f7346d);
    }

    public static class b extends AnimatorListenerAdapter implements AbstractC0986l.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f7337a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7338b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ViewGroup f7339c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f7340d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f7341e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f7342f = false;

        public b(View view, int i4, boolean z3) {
            this.f7337a = view;
            this.f7338b = i4;
            this.f7339c = (ViewGroup) view.getParent();
            this.f7340d = z3;
            g(true);
        }

        @Override // h0.AbstractC0986l.f
        public void b(AbstractC0986l abstractC0986l) {
            g(true);
        }

        @Override // h0.AbstractC0986l.f
        public void c(AbstractC0986l abstractC0986l) {
            g(false);
        }

        @Override // h0.AbstractC0986l.f
        public void e(AbstractC0986l abstractC0986l) {
            f();
            abstractC0986l.T(this);
        }

        public final void f() {
            if (!this.f7342f) {
                AbstractC0972A.h(this.f7337a, this.f7338b);
                ViewGroup viewGroup = this.f7339c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        public final void g(boolean z3) {
            ViewGroup viewGroup;
            if (!this.f7340d || this.f7341e == z3 || (viewGroup = this.f7339c) == null) {
                return;
            }
            this.f7341e = z3;
            x.c(viewGroup, z3);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f7342f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            if (this.f7342f) {
                return;
            }
            AbstractC0972A.h(this.f7337a, this.f7338b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f7342f) {
                return;
            }
            AbstractC0972A.h(this.f7337a, 0);
        }

        @Override // h0.AbstractC0986l.f
        public void a(AbstractC0986l abstractC0986l) {
        }

        @Override // h0.AbstractC0986l.f
        public void d(AbstractC0986l abstractC0986l) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }
}
