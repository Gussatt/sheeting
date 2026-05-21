package h0;

import C.AbstractC0241y;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: h0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0978d extends N {

    /* JADX INFO: renamed from: h0.d$a */
    public class a extends AbstractC0987m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f7387a;

        public a(View view) {
            this.f7387a = view;
        }

        @Override // h0.AbstractC0986l.f
        public void e(AbstractC0986l abstractC0986l) {
            AbstractC0972A.g(this.f7387a, 1.0f);
            AbstractC0972A.a(this.f7387a);
            abstractC0986l.T(this);
        }
    }

    /* JADX INFO: renamed from: h0.d$b */
    public static class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f7389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f7390b = false;

        public b(View view) {
            this.f7389a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC0972A.g(this.f7389a, 1.0f);
            if (this.f7390b) {
                this.f7389a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (AbstractC0241y.s(this.f7389a) && this.f7389a.getLayerType() == 0) {
                this.f7390b = true;
                this.f7389a.setLayerType(2, null);
            }
        }
    }

    public C0978d(int i4) {
        m0(i4);
    }

    public static float o0(s sVar, float f4) {
        Float f5;
        return (sVar == null || (f5 = (Float) sVar.f7472a.get("android:fade:transitionAlpha")) == null) ? f4 : f5.floatValue();
    }

    @Override // h0.N
    public Animator i0(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        float fO0 = o0(sVar, 0.0f);
        return n0(view, fO0 != 1.0f ? fO0 : 0.0f, 1.0f);
    }

    @Override // h0.N
    public Animator k0(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        AbstractC0972A.e(view);
        return n0(view, o0(sVar, 1.0f), 0.0f);
    }

    @Override // h0.N, h0.AbstractC0986l
    public void n(s sVar) {
        super.n(sVar);
        sVar.f7472a.put("android:fade:transitionAlpha", Float.valueOf(AbstractC0972A.c(sVar.f7473b)));
    }

    public final Animator n0(View view, float f4, float f5) {
        if (f4 == f5) {
            return null;
        }
        AbstractC0972A.g(view, f4);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) AbstractC0972A.f7322b, f5);
        objectAnimatorOfFloat.addListener(new b(view));
        a(new a(view));
        return objectAnimatorOfFloat;
    }
}
