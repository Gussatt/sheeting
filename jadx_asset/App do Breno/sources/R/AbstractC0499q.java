package R;

import C.ViewTreeObserverOnPreDrawListenerC0236t;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: R.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0499q {
    public static int a(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o, boolean z3, boolean z4) {
        return z4 ? z3 ? abstractComponentCallbacksC0497o.F() : abstractComponentCallbacksC0497o.G() : z3 ? abstractComponentCallbacksC0497o.r() : abstractComponentCallbacksC0497o.u();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0071 A[Catch: RuntimeException -> 0x0077, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0077, blocks: (B:32:0x006b, B:34:0x0071), top: B:45:0x006b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static R.AbstractC0499q.a b(android.content.Context r4, R.AbstractComponentCallbacksC0497o r5, boolean r6, boolean r7) {
        /*
            int r0 = r5.B()
            int r7 = a(r5, r6, r7)
            r1 = 0
            r5.X0(r1, r1, r1, r1)
            android.view.ViewGroup r1 = r5.f3227I
            r2 = 0
            if (r1 == 0) goto L20
            int r3 = Q.b.f2911c
            java.lang.Object r1 = r1.getTag(r3)
            if (r1 == 0) goto L20
            android.view.ViewGroup r1 = r5.f3227I
            int r3 = Q.b.f2911c
            r1.setTag(r3, r2)
        L20:
            android.view.ViewGroup r1 = r5.f3227I
            if (r1 == 0) goto L2b
            android.animation.LayoutTransition r1 = r1.getLayoutTransition()
            if (r1 == 0) goto L2b
            return r2
        L2b:
            android.view.animation.Animation r1 = r5.j0(r0, r6, r7)
            if (r1 == 0) goto L37
            R.q$a r4 = new R.q$a
            r4.<init>(r1)
            return r4
        L37:
            android.animation.Animator r5 = r5.k0(r0, r6, r7)
            if (r5 == 0) goto L43
            R.q$a r4 = new R.q$a
            r4.<init>(r5)
            return r4
        L43:
            if (r7 != 0) goto L4b
            if (r0 == 0) goto L4b
            int r7 = d(r4, r0, r6)
        L4b:
            if (r7 == 0) goto L87
            android.content.res.Resources r5 = r4.getResources()
            java.lang.String r5 = r5.getResourceTypeName(r7)
            java.lang.String r6 = "anim"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L6b
            android.view.animation.Animation r6 = android.view.animation.AnimationUtils.loadAnimation(r4, r7)     // Catch: android.content.res.Resources.NotFoundException -> L69 java.lang.RuntimeException -> L6b
            if (r6 == 0) goto L87
            R.q$a r0 = new R.q$a     // Catch: android.content.res.Resources.NotFoundException -> L69 java.lang.RuntimeException -> L6b
            r0.<init>(r6)     // Catch: android.content.res.Resources.NotFoundException -> L69 java.lang.RuntimeException -> L6b
            return r0
        L69:
            r4 = move-exception
            throw r4
        L6b:
            android.animation.Animator r6 = android.animation.AnimatorInflater.loadAnimator(r4, r7)     // Catch: java.lang.RuntimeException -> L77
            if (r6 == 0) goto L87
            R.q$a r0 = new R.q$a     // Catch: java.lang.RuntimeException -> L77
            r0.<init>(r6)     // Catch: java.lang.RuntimeException -> L77
            return r0
        L77:
            r6 = move-exception
            if (r5 != 0) goto L86
            android.view.animation.Animation r4 = android.view.animation.AnimationUtils.loadAnimation(r4, r7)
            if (r4 == 0) goto L87
            R.q$a r5 = new R.q$a
            r5.<init>(r4)
            return r5
        L86:
            throw r6
        L87:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: R.AbstractC0499q.b(android.content.Context, R.o, boolean, boolean):R.q$a");
    }

    public static int c(Context context, int i4) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i4});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static int d(Context context, int i4, boolean z3) {
        if (i4 == 4097) {
            return z3 ? Q.a.f2907e : Q.a.f2908f;
        }
        if (i4 == 8194) {
            return z3 ? Q.a.f2903a : Q.a.f2904b;
        }
        if (i4 == 8197) {
            return z3 ? c(context, R.attr.activityCloseEnterAnimation) : c(context, R.attr.activityCloseExitAnimation);
        }
        if (i4 == 4099) {
            return z3 ? Q.a.f2905c : Q.a.f2906d;
        }
        if (i4 != 4100) {
            return -1;
        }
        return z3 ? c(context, R.attr.activityOpenEnterAnimation) : c(context, R.attr.activityOpenExitAnimation);
    }

    /* JADX INFO: renamed from: R.q$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Animation f3295a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AnimatorSet f3296b;

        public a(Animation animation) {
            this.f3295a = animation;
            this.f3296b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        public a(Animator animator) {
            this.f3295a = null;
            AnimatorSet animatorSet = new AnimatorSet();
            this.f3296b = animatorSet;
            animatorSet.play(animator);
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* JADX INFO: renamed from: R.q$b */
    public static class b extends AnimationSet implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final ViewGroup f3297m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final View f3298n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f3299o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f3300p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public boolean f3301q;

        public b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f3301q = true;
            this.f3297m = viewGroup;
            this.f3298n = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j4, Transformation transformation) {
            this.f3301q = true;
            if (this.f3299o) {
                return !this.f3300p;
            }
            if (!super.getTransformation(j4, transformation)) {
                this.f3299o = true;
                ViewTreeObserverOnPreDrawListenerC0236t.a(this.f3297m, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f3299o || !this.f3301q) {
                this.f3297m.endViewTransition(this.f3298n);
                this.f3300p = true;
            } else {
                this.f3301q = false;
                this.f3297m.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j4, Transformation transformation, float f4) {
            this.f3301q = true;
            if (this.f3299o) {
                return !this.f3300p;
            }
            if (!super.getTransformation(j4, transformation, f4)) {
                this.f3299o = true;
                ViewTreeObserverOnPreDrawListenerC0236t.a(this.f3297m, this);
            }
            return true;
        }
    }
}
