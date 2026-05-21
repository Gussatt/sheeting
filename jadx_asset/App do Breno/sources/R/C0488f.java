package R;

import C.AbstractC0241y;
import C.ViewTreeObserverOnPreDrawListenerC0236t;
import R.AbstractC0499q;
import R.C0488f;
import R.S;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p.C1475a;
import y.C1644a;

/* JADX INFO: renamed from: R.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0488f extends S {

    /* JADX INFO: renamed from: R.f$a */
    public static final class a extends S.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b f3158d;

        /* JADX INFO: renamed from: R.f$a$a, reason: collision with other inner class name */
        public static final class AnimationAnimationListenerC0067a implements Animation.AnimationListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ S.d f3159a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ViewGroup f3160b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ View f3161c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ a f3162d;

            public AnimationAnimationListenerC0067a(S.d dVar, ViewGroup viewGroup, View view, a aVar) {
                this.f3159a = dVar;
                this.f3160b = viewGroup;
                this.f3161c = view;
                this.f3162d = aVar;
            }

            public static final void b(ViewGroup viewGroup, View view, a aVar) {
                X2.l.e(viewGroup, "$container");
                X2.l.e(aVar, "this$0");
                viewGroup.endViewTransition(view);
                aVar.g().a().f(aVar);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                X2.l.e(animation, "animation");
                final ViewGroup viewGroup = this.f3160b;
                final View view = this.f3161c;
                final a aVar = this.f3162d;
                viewGroup.post(new Runnable() { // from class: R.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0488f.a.AnimationAnimationListenerC0067a.b(viewGroup, view, aVar);
                    }
                });
                if (B.m0(2)) {
                    Log.v("FragmentManager", "Animation from operation " + this.f3159a + " has ended.");
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                X2.l.e(animation, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                X2.l.e(animation, "animation");
                if (B.m0(2)) {
                    Log.v("FragmentManager", "Animation from operation " + this.f3159a + " has reached onAnimationStart.");
                }
            }
        }

        public a(b bVar) {
            X2.l.e(bVar, "animationInfo");
            this.f3158d = bVar;
        }

        @Override // R.S.b
        public void c(ViewGroup viewGroup) {
            X2.l.e(viewGroup, "container");
            S.d dVarA = this.f3158d.a();
            View view = dVarA.i().f3228J;
            view.clearAnimation();
            viewGroup.endViewTransition(view);
            this.f3158d.a().f(this);
            if (B.m0(2)) {
                Log.v("FragmentManager", "Animation from operation " + dVarA + " has been cancelled.");
            }
        }

        @Override // R.S.b
        public void d(ViewGroup viewGroup) {
            X2.l.e(viewGroup, "container");
            if (this.f3158d.b()) {
                this.f3158d.a().f(this);
                return;
            }
            Context context = viewGroup.getContext();
            S.d dVarA = this.f3158d.a();
            View view = dVarA.i().f3228J;
            b bVar = this.f3158d;
            X2.l.d(context, "context");
            AbstractC0499q.a aVarC = bVar.c(context);
            if (aVarC == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Animation animation = aVarC.f3295a;
            if (animation == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (dVarA.h() != S.d.b.REMOVED) {
                view.startAnimation(animation);
                this.f3158d.a().f(this);
                return;
            }
            viewGroup.startViewTransition(view);
            AbstractC0499q.b bVar2 = new AbstractC0499q.b(animation, viewGroup, view);
            bVar2.setAnimationListener(new AnimationAnimationListenerC0067a(dVarA, viewGroup, view, this));
            view.startAnimation(bVar2);
            if (B.m0(2)) {
                Log.v("FragmentManager", "Animation from operation " + dVarA + " has started.");
            }
        }

        public final b g() {
            return this.f3158d;
        }
    }

    /* JADX INFO: renamed from: R.f$b */
    public static final class b extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f3163b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f3164c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public AbstractC0499q.a f3165d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(S.d dVar, boolean z3) {
            super(dVar);
            X2.l.e(dVar, "operation");
            this.f3163b = z3;
        }

        public final AbstractC0499q.a c(Context context) {
            X2.l.e(context, "context");
            if (this.f3164c) {
                return this.f3165d;
            }
            AbstractC0499q.a aVarB = AbstractC0499q.b(context, a().i(), a().h() == S.d.b.VISIBLE, this.f3163b);
            this.f3165d = aVarB;
            this.f3164c = true;
            return aVarB;
        }
    }

    /* JADX INFO: renamed from: R.f$c */
    public static final class c extends S.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b f3166d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public AnimatorSet f3167e;

        /* JADX INFO: renamed from: R.f$c$a */
        public static final class a extends AnimatorListenerAdapter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ViewGroup f3168a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ View f3169b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ boolean f3170c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ S.d f3171d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ c f3172e;

            public a(ViewGroup viewGroup, View view, boolean z3, S.d dVar, c cVar) {
                this.f3168a = viewGroup;
                this.f3169b = view;
                this.f3170c = z3;
                this.f3171d = dVar;
                this.f3172e = cVar;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                X2.l.e(animator, "anim");
                this.f3168a.endViewTransition(this.f3169b);
                if (this.f3170c) {
                    S.d.b bVarH = this.f3171d.h();
                    View view = this.f3169b;
                    X2.l.d(view, "viewToAnimate");
                    bVarH.f(view, this.f3168a);
                }
                this.f3172e.g().a().f(this.f3172e);
                if (B.m0(2)) {
                    Log.v("FragmentManager", "Animator from operation " + this.f3171d + " has ended.");
                }
            }
        }

        public c(b bVar) {
            X2.l.e(bVar, "animatorInfo");
            this.f3166d = bVar;
        }

        @Override // R.S.b
        public boolean b() {
            return true;
        }

        @Override // R.S.b
        public void c(ViewGroup viewGroup) {
            X2.l.e(viewGroup, "container");
            AnimatorSet animatorSet = this.f3167e;
            if (animatorSet == null) {
                this.f3166d.a().f(this);
                return;
            }
            S.d dVarA = this.f3166d.a();
            if (!dVarA.n()) {
                animatorSet.end();
            } else if (Build.VERSION.SDK_INT >= 26) {
                d.f3173a.a(animatorSet);
            }
            if (B.m0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Animator from operation ");
                sb.append(dVarA);
                sb.append(" has been canceled");
                sb.append(dVarA.n() ? " with seeking." : ".");
                sb.append(' ');
                Log.v("FragmentManager", sb.toString());
            }
        }

        @Override // R.S.b
        public void d(ViewGroup viewGroup) {
            X2.l.e(viewGroup, "container");
            S.d dVarA = this.f3166d.a();
            AnimatorSet animatorSet = this.f3167e;
            if (animatorSet == null) {
                this.f3166d.a().f(this);
                return;
            }
            animatorSet.start();
            if (B.m0(2)) {
                Log.v("FragmentManager", "Animator from operation " + dVarA + " has started.");
            }
        }

        @Override // R.S.b
        public void e(ViewGroup viewGroup) {
            c cVar;
            X2.l.e(viewGroup, "container");
            if (this.f3166d.b()) {
                return;
            }
            Context context = viewGroup.getContext();
            b bVar = this.f3166d;
            X2.l.d(context, "context");
            AbstractC0499q.a aVarC = bVar.c(context);
            this.f3167e = aVarC != null ? aVarC.f3296b : null;
            S.d dVarA = this.f3166d.a();
            AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497oI = dVarA.i();
            boolean z3 = dVarA.h() == S.d.b.GONE;
            View view = abstractComponentCallbacksC0497oI.f3228J;
            viewGroup.startViewTransition(view);
            AnimatorSet animatorSet = this.f3167e;
            if (animatorSet != null) {
                cVar = this;
                animatorSet.addListener(new a(viewGroup, view, z3, dVarA, cVar));
            } else {
                cVar = this;
            }
            AnimatorSet animatorSet2 = cVar.f3167e;
            if (animatorSet2 != null) {
                animatorSet2.setTarget(view);
            }
        }

        public final b g() {
            return this.f3166d;
        }
    }

    /* JADX INFO: renamed from: R.f$d */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f3173a = new d();

        public final void a(AnimatorSet animatorSet) {
            X2.l.e(animatorSet, "animatorSet");
            animatorSet.reverse();
        }

        public final void b(AnimatorSet animatorSet, long j4) {
            X2.l.e(animatorSet, "animatorSet");
            animatorSet.setCurrentPlayTime(j4);
        }
    }

    /* JADX INFO: renamed from: R.f$e */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final S.d f3174a;

        public e(S.d dVar) {
            X2.l.e(dVar, "operation");
            this.f3174a = dVar;
        }

        public final S.d a() {
            return this.f3174a;
        }

        public final boolean b() {
            View view = this.f3174a.i().f3228J;
            S.d.b bVarA = view != null ? S.d.b.f3124m.a(view) : null;
            S.d.b bVarH = this.f3174a.h();
            if (bVarA == bVarH) {
                return true;
            }
            S.d.b bVar = S.d.b.VISIBLE;
            return (bVarA == bVar || bVarH == bVar) ? false : true;
        }
    }

    /* JADX INFO: renamed from: R.f$f, reason: collision with other inner class name */
    public static final class C0068f extends S.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f3175d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final S.d f3176e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final S.d f3177f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final M f3178g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Object f3179h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final ArrayList f3180i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final ArrayList f3181j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final C1475a f3182k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final ArrayList f3183l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final ArrayList f3184m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final C1475a f3185n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final C1475a f3186o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final boolean f3187p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final C1644a f3188q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f3189r;

        /* JADX INFO: renamed from: R.f$f$a */
        public static final class a extends X2.m implements W2.a {

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public final /* synthetic */ ViewGroup f3191o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public final /* synthetic */ Object f3192p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ViewGroup viewGroup, Object obj) {
                super(0);
                this.f3191o = viewGroup;
                this.f3192p = obj;
            }

            public final void a() {
                C0068f.this.u().e(this.f3191o, this.f3192p);
            }

            @Override // W2.a
            public /* bridge */ /* synthetic */ Object e() {
                a();
                return K2.p.f2516a;
            }
        }

        /* JADX INFO: renamed from: R.f$f$b */
        public static final class b extends X2.m implements W2.a {

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public final /* synthetic */ ViewGroup f3194o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public final /* synthetic */ Object f3195p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public final /* synthetic */ X2.y f3196q;

            /* JADX INFO: renamed from: R.f$f$b$a */
            public static final class a extends X2.m implements W2.a {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                public final /* synthetic */ C0068f f3197n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                public final /* synthetic */ ViewGroup f3198o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(C0068f c0068f, ViewGroup viewGroup) {
                    super(0);
                    this.f3197n = c0068f;
                    this.f3198o = viewGroup;
                }

                public static final void c(C0068f c0068f, ViewGroup viewGroup) {
                    X2.l.e(c0068f, "this$0");
                    X2.l.e(viewGroup, "$container");
                    Iterator it = c0068f.v().iterator();
                    while (it.hasNext()) {
                        S.d dVarA = ((g) it.next()).a();
                        View viewV = dVarA.i().V();
                        if (viewV != null) {
                            dVarA.h().f(viewV, viewGroup);
                        }
                    }
                }

                public final void b() {
                    if (B.m0(2)) {
                        Log.v("FragmentManager", "Animating to start");
                    }
                    M mU = this.f3197n.u();
                    Object objR = this.f3197n.r();
                    X2.l.b(objR);
                    final C0068f c0068f = this.f3197n;
                    final ViewGroup viewGroup = this.f3198o;
                    mU.d(objR, new Runnable() { // from class: R.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            C0488f.C0068f.b.a.c(c0068f, viewGroup);
                        }
                    });
                }

                @Override // W2.a
                public /* bridge */ /* synthetic */ Object e() {
                    b();
                    return K2.p.f2516a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(ViewGroup viewGroup, Object obj, X2.y yVar) {
                super(0);
                this.f3194o = viewGroup;
                this.f3195p = obj;
                this.f3196q = yVar;
            }

            public final void a() {
                C0068f c0068f = C0068f.this;
                c0068f.B(c0068f.u().j(this.f3194o, this.f3195p));
                boolean z3 = C0068f.this.r() != null;
                Object obj = this.f3195p;
                ViewGroup viewGroup = this.f3194o;
                if (!z3) {
                    throw new IllegalStateException(("Unable to start transition " + obj + " for container " + viewGroup + '.').toString());
                }
                this.f3196q.f3992m = new a(C0068f.this, viewGroup);
                if (B.m0(2)) {
                    Log.v("FragmentManager", "Started executing operations from " + C0068f.this.s() + " to " + C0068f.this.t());
                }
            }

            @Override // W2.a
            public /* bridge */ /* synthetic */ Object e() {
                a();
                return K2.p.f2516a;
            }
        }

        public C0068f(List list, S.d dVar, S.d dVar2, M m4, Object obj, ArrayList arrayList, ArrayList arrayList2, C1475a c1475a, ArrayList arrayList3, ArrayList arrayList4, C1475a c1475a2, C1475a c1475a3, boolean z3) {
            X2.l.e(list, "transitionInfos");
            X2.l.e(m4, "transitionImpl");
            X2.l.e(arrayList, "sharedElementFirstOutViews");
            X2.l.e(arrayList2, "sharedElementLastInViews");
            X2.l.e(c1475a, "sharedElementNameMapping");
            X2.l.e(arrayList3, "enteringNames");
            X2.l.e(arrayList4, "exitingNames");
            X2.l.e(c1475a2, "firstOutViews");
            X2.l.e(c1475a3, "lastInViews");
            this.f3175d = list;
            this.f3176e = dVar;
            this.f3177f = dVar2;
            this.f3178g = m4;
            this.f3179h = obj;
            this.f3180i = arrayList;
            this.f3181j = arrayList2;
            this.f3182k = c1475a;
            this.f3183l = arrayList3;
            this.f3184m = arrayList4;
            this.f3185n = c1475a2;
            this.f3186o = c1475a3;
            this.f3187p = z3;
            this.f3188q = new C1644a();
        }

        public static final void o(S.d dVar, S.d dVar2, C0068f c0068f) {
            X2.l.e(c0068f, "this$0");
            K.a(dVar.i(), dVar2.i(), c0068f.f3187p, c0068f.f3186o, false);
        }

        public static final void p(M m4, View view, Rect rect) {
            X2.l.e(m4, "$impl");
            X2.l.e(rect, "$lastInEpicenterRect");
            m4.k(view, rect);
        }

        public static final void q(ArrayList arrayList) {
            X2.l.e(arrayList, "$transitioningViews");
            K.d(arrayList, 4);
        }

        public static final void x(S.d dVar, C0068f c0068f) {
            X2.l.e(dVar, "$operation");
            X2.l.e(c0068f, "this$0");
            if (B.m0(2)) {
                Log.v("FragmentManager", "Transition for operation " + dVar + " has completed");
            }
            dVar.f(c0068f);
        }

        public static final void y(X2.y yVar) {
            X2.l.e(yVar, "$seekCancelLambda");
            W2.a aVar = (W2.a) yVar.f3992m;
            if (aVar != null) {
                aVar.e();
            }
        }

        public static final void z(S.d dVar, C0068f c0068f) {
            X2.l.e(dVar, "$operation");
            X2.l.e(c0068f, "this$0");
            if (B.m0(2)) {
                Log.v("FragmentManager", "Transition for operation " + dVar + " has completed");
            }
            dVar.f(c0068f);
        }

        public final void A(ArrayList arrayList, ViewGroup viewGroup, W2.a aVar) {
            K.d(arrayList, 4);
            ArrayList arrayListQ = this.f3178g.q(this.f3181j);
            if (B.m0(2)) {
                Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
                Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
                for (Object obj : this.f3180i) {
                    X2.l.d(obj, "sharedElementFirstOutViews");
                    View view = (View) obj;
                    Log.v("FragmentManager", "View: " + view + " Name: " + AbstractC0241y.q(view));
                }
                Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
                for (Object obj2 : this.f3181j) {
                    X2.l.d(obj2, "sharedElementLastInViews");
                    View view2 = (View) obj2;
                    Log.v("FragmentManager", "View: " + view2 + " Name: " + AbstractC0241y.q(view2));
                }
            }
            aVar.e();
            this.f3178g.x(viewGroup, this.f3180i, this.f3181j, arrayListQ, this.f3182k);
            K.d(arrayList, 0);
            this.f3178g.z(this.f3179h, this.f3180i, this.f3181j);
        }

        public final void B(Object obj) {
            this.f3189r = obj;
        }

        @Override // R.S.b
        public boolean b() {
            if (!this.f3178g.m()) {
                return false;
            }
            List<g> list = this.f3175d;
            if (list == null || !list.isEmpty()) {
                for (g gVar : list) {
                    if (Build.VERSION.SDK_INT < 34 || gVar.f() == null || !this.f3178g.n(gVar.f())) {
                        return false;
                    }
                }
            }
            Object obj = this.f3179h;
            return obj == null || this.f3178g.n(obj);
        }

        @Override // R.S.b
        public void c(ViewGroup viewGroup) {
            X2.l.e(viewGroup, "container");
            this.f3188q.a();
        }

        @Override // R.S.b
        public void d(ViewGroup viewGroup) {
            X2.l.e(viewGroup, "container");
            if (!viewGroup.isLaidOut()) {
                for (g gVar : this.f3175d) {
                    S.d dVarA = gVar.a();
                    if (B.m0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Completing operation " + dVarA);
                    }
                    gVar.a().f(this);
                }
                return;
            }
            Object obj = this.f3189r;
            if (obj != null) {
                M m4 = this.f3178g;
                X2.l.b(obj);
                m4.c(obj);
                if (B.m0(2)) {
                    Log.v("FragmentManager", "Ending execution of operations from " + this.f3176e + " to " + this.f3177f);
                    return;
                }
                return;
            }
            K2.i iVarN = n(viewGroup, this.f3177f, this.f3176e);
            ArrayList arrayList = (ArrayList) iVarN.a();
            Object objB = iVarN.b();
            List list = this.f3175d;
            ArrayList<S.d> arrayList2 = new ArrayList(L2.n.m(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(((g) it.next()).a());
            }
            for (final S.d dVar : arrayList2) {
                this.f3178g.v(dVar.i(), objB, this.f3188q, new Runnable() { // from class: R.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0488f.C0068f.x(dVar, this);
                    }
                });
            }
            A(arrayList, viewGroup, new a(viewGroup, objB));
            if (B.m0(2)) {
                Log.v("FragmentManager", "Completed executing operations from " + this.f3176e + " to " + this.f3177f);
            }
        }

        @Override // R.S.b
        public void e(ViewGroup viewGroup) {
            X2.l.e(viewGroup, "container");
            if (!viewGroup.isLaidOut()) {
                Iterator it = this.f3175d.iterator();
                while (it.hasNext()) {
                    S.d dVarA = ((g) it.next()).a();
                    if (B.m0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Skipping onStart for operation " + dVarA);
                    }
                }
                return;
            }
            if (w() && this.f3179h != null && !b()) {
                Log.i("FragmentManager", "Ignoring shared elements transition " + this.f3179h + " between " + this.f3176e + " and " + this.f3177f + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
            }
            if (b() && w()) {
                final X2.y yVar = new X2.y();
                K2.i iVarN = n(viewGroup, this.f3177f, this.f3176e);
                ArrayList arrayList = (ArrayList) iVarN.a();
                Object objB = iVarN.b();
                List list = this.f3175d;
                ArrayList<S.d> arrayList2 = new ArrayList(L2.n.m(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((g) it2.next()).a());
                }
                for (final S.d dVar : arrayList2) {
                    this.f3178g.w(dVar.i(), objB, this.f3188q, new Runnable() { // from class: R.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            C0488f.C0068f.y(yVar);
                        }
                    }, new Runnable() { // from class: R.h
                        @Override // java.lang.Runnable
                        public final void run() {
                            C0488f.C0068f.z(dVar, this);
                        }
                    });
                }
                A(arrayList, viewGroup, new b(viewGroup, objB, yVar));
            }
        }

        public final void m(ArrayList arrayList, View view) {
            if (!(view instanceof ViewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (C.D.a(viewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = viewGroup.getChildAt(i4);
                if (childAt.getVisibility() == 0) {
                    X2.l.d(childAt, "child");
                    m(arrayList, childAt);
                }
            }
        }

        public final K2.i n(ViewGroup viewGroup, S.d dVar, final S.d dVar2) {
            final S.d dVar3 = dVar;
            View view = new View(viewGroup.getContext());
            final Rect rect = new Rect();
            Iterator it = this.f3175d.iterator();
            boolean z3 = false;
            View view2 = null;
            while (it.hasNext()) {
                if (((g) it.next()).g() && dVar2 != null && dVar3 != null && !this.f3182k.isEmpty() && this.f3179h != null) {
                    K.a(dVar3.i(), dVar2.i(), this.f3187p, this.f3185n, true);
                    ViewTreeObserverOnPreDrawListenerC0236t.a(viewGroup, new Runnable() { // from class: R.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            C0488f.C0068f.o(dVar3, dVar2, this);
                        }
                    });
                    this.f3180i.addAll(this.f3185n.values());
                    if (!this.f3184m.isEmpty()) {
                        Object obj = this.f3184m.get(0);
                        X2.l.d(obj, "exitingNames[0]");
                        view2 = (View) this.f3185n.get((String) obj);
                        this.f3178g.u(this.f3179h, view2);
                    }
                    this.f3181j.addAll(this.f3186o.values());
                    if (!this.f3183l.isEmpty()) {
                        Object obj2 = this.f3183l.get(0);
                        X2.l.d(obj2, "enteringNames[0]");
                        final View view3 = (View) this.f3186o.get((String) obj2);
                        if (view3 != null) {
                            final M m4 = this.f3178g;
                            ViewTreeObserverOnPreDrawListenerC0236t.a(viewGroup, new Runnable() { // from class: R.k
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C0488f.C0068f.p(m4, view3, rect);
                                }
                            });
                            z3 = true;
                        }
                    }
                    this.f3178g.y(this.f3179h, view, this.f3180i);
                    M m5 = this.f3178g;
                    Object obj3 = this.f3179h;
                    m5.s(obj3, null, null, null, null, obj3, this.f3181j);
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = this.f3175d.iterator();
            Object objP = null;
            Object objP2 = null;
            while (it2.hasNext()) {
                g gVar = (g) it2.next();
                S.d dVarA = gVar.a();
                boolean z4 = z3;
                Object objH = this.f3178g.h(gVar.f());
                if (objH != null) {
                    final ArrayList arrayList2 = new ArrayList();
                    Iterator it3 = it2;
                    View view4 = dVarA.i().f3228J;
                    X2.l.d(view4, "operation.fragment.mView");
                    m(arrayList2, view4);
                    if (this.f3179h != null && (dVarA == dVar2 || dVarA == dVar3)) {
                        if (dVarA == dVar2) {
                            arrayList2.removeAll(L2.u.I(this.f3180i));
                        } else {
                            arrayList2.removeAll(L2.u.I(this.f3181j));
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        this.f3178g.a(objH, view);
                    } else {
                        this.f3178g.b(objH, arrayList2);
                        this.f3178g.s(objH, objH, arrayList2, null, null, null, null);
                        if (dVarA.h() == S.d.b.GONE) {
                            dVarA.r(false);
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList3.remove(dVarA.i().f3228J);
                            this.f3178g.r(objH, dVarA.i().f3228J, arrayList3);
                            ViewTreeObserverOnPreDrawListenerC0236t.a(viewGroup, new Runnable() { // from class: R.l
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C0488f.C0068f.q(arrayList2);
                                }
                            });
                        }
                    }
                    if (dVarA.h() == S.d.b.VISIBLE) {
                        arrayList.addAll(arrayList2);
                        if (z4) {
                            this.f3178g.t(objH, rect);
                        }
                        if (B.m0(2)) {
                            Log.v("FragmentManager", "Entering Transition: " + objH);
                            Log.v("FragmentManager", ">>>>> EnteringViews <<<<<");
                            for (Object obj4 : arrayList2) {
                                X2.l.d(obj4, "transitioningViews");
                                Log.v("FragmentManager", "View: " + ((View) obj4));
                            }
                        }
                    } else {
                        this.f3178g.u(objH, view2);
                        if (B.m0(2)) {
                            Log.v("FragmentManager", "Exiting Transition: " + objH);
                            Log.v("FragmentManager", ">>>>> ExitingViews <<<<<");
                            for (Object obj5 : arrayList2) {
                                X2.l.d(obj5, "transitioningViews");
                                Log.v("FragmentManager", "View: " + ((View) obj5));
                            }
                        }
                    }
                    if (gVar.h()) {
                        objP = this.f3178g.p(objP, objH, null);
                    } else {
                        objP2 = this.f3178g.p(objP2, objH, null);
                    }
                    dVar3 = dVar;
                    z3 = z4;
                    it2 = it3;
                } else {
                    dVar3 = dVar;
                    z3 = z4;
                }
            }
            Object objO = this.f3178g.o(objP, objP2, this.f3179h);
            if (B.m0(2)) {
                Log.v("FragmentManager", "Final merged transition: " + objO);
            }
            return new K2.i(arrayList, objO);
        }

        public final Object r() {
            return this.f3189r;
        }

        public final S.d s() {
            return this.f3176e;
        }

        public final S.d t() {
            return this.f3177f;
        }

        public final M u() {
            return this.f3178g;
        }

        public final List v() {
            return this.f3175d;
        }

        public final boolean w() {
            List list = this.f3175d;
            if (list != null && list.isEmpty()) {
                return true;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!((g) it.next()).a().i().f3260o) {
                    return false;
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: R.f$g */
    public static final class g extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f3199b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f3200c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f3201d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(S.d dVar, boolean z3, boolean z4) {
            Object objL;
            super(dVar);
            X2.l.e(dVar, "operation");
            S.d.b bVarH = dVar.h();
            S.d.b bVar = S.d.b.VISIBLE;
            if (bVarH == bVar) {
                AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497oI = dVar.i();
                objL = z3 ? abstractComponentCallbacksC0497oI.I() : abstractComponentCallbacksC0497oI.s();
            } else {
                AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497oI2 = dVar.i();
                objL = z3 ? abstractComponentCallbacksC0497oI2.L() : abstractComponentCallbacksC0497oI2.v();
            }
            this.f3199b = objL;
            this.f3200c = dVar.h() == bVar ? z3 ? dVar.i().n() : dVar.i().m() : true;
            this.f3201d = z4 ? z3 ? dVar.i().N() : dVar.i().M() : null;
        }

        public final M c() {
            M mD = d(this.f3199b);
            M mD2 = d(this.f3201d);
            if (mD == null || mD2 == null || mD == mD2) {
                return mD == null ? mD2 : mD;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + a().i() + " returned Transition " + this.f3199b + " which uses a different Transition  type than its shared element transition " + this.f3201d).toString());
        }

        public final M d(Object obj) {
            if (obj == null) {
                return null;
            }
            M m4 = K.f3064b;
            if (m4 != null && m4.g(obj)) {
                return m4;
            }
            M m5 = K.f3065c;
            if (m5 != null && m5.g(obj)) {
                return m5;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + a().i() + " is not a valid framework Transition or AndroidX Transition");
        }

        public final Object e() {
            return this.f3201d;
        }

        public final Object f() {
            return this.f3199b;
        }

        public final boolean g() {
            return this.f3201d != null;
        }

        public final boolean h() {
            return this.f3200c;
        }
    }

    /* JADX INFO: renamed from: R.f$h */
    public static final class h extends X2.m implements W2.l {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Collection f3202n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Collection collection) {
            super(1);
            this.f3202n = collection;
        }

        @Override // W2.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean k(Map.Entry entry) {
            X2.l.e(entry, "entry");
            return Boolean.valueOf(L2.u.s(this.f3202n, AbstractC0241y.q((View) entry.getValue())));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0488f(ViewGroup viewGroup) {
        super(viewGroup);
        X2.l.e(viewGroup, "container");
    }

    public static final void B(C0488f c0488f, S.d dVar) {
        X2.l.e(c0488f, "this$0");
        X2.l.e(dVar, "$operation");
        c0488f.c(dVar);
    }

    public final void A(List list) {
        ArrayList<b> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            L2.r.o(arrayList2, ((b) it.next()).a().g());
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        Iterator it2 = list.iterator();
        boolean z3 = false;
        while (it2.hasNext()) {
            b bVar = (b) it2.next();
            Context context = s().getContext();
            S.d dVarA = bVar.a();
            X2.l.d(context, "context");
            AbstractC0499q.a aVarC = bVar.c(context);
            if (aVarC != null) {
                if (aVarC.f3296b == null) {
                    arrayList.add(bVar);
                } else {
                    AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497oI = dVarA.i();
                    if (dVarA.g().isEmpty()) {
                        if (dVarA.h() == S.d.b.GONE) {
                            dVarA.r(false);
                        }
                        dVarA.b(new c(bVar));
                        z3 = true;
                    } else if (B.m0(2)) {
                        Log.v("FragmentManager", "Ignoring Animator set on " + abstractComponentCallbacksC0497oI + " as this Fragment was involved in a Transition.");
                    }
                }
            }
        }
        for (b bVar2 : arrayList) {
            S.d dVarA2 = bVar2.a();
            AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497oI2 = dVarA2.i();
            if (zIsEmpty) {
                if (!z3) {
                    dVarA2.b(new a(bVar2));
                } else if (B.m0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC0497oI2 + " as Animations cannot run alongside Animators.");
                }
            } else if (B.m0(2)) {
                Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC0497oI2 + " as Animations cannot run alongside Transitions.");
            }
        }
    }

    public final void C(List list, boolean z3, S.d dVar, S.d dVar2) {
        Object objA;
        Iterator it;
        ArrayList arrayList;
        K2.i iVarA;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!((g) obj).b()) {
                arrayList2.add(obj);
            }
        }
        ArrayList<g> arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (((g) obj2).c() != null) {
                arrayList3.add(obj2);
            }
        }
        M m4 = null;
        for (g gVar : arrayList3) {
            M mC = gVar.c();
            if (m4 != null && mC != m4) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + gVar.a().i() + " returned Transition " + gVar.f() + " which uses a different Transition type than other Fragments.").toString());
            }
            m4 = mC;
        }
        if (m4 == null) {
            return;
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        C1475a c1475a = new C1475a();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        C1475a c1475a2 = new C1475a();
        C1475a c1475a3 = new C1475a();
        ArrayList arrayListP = arrayList6;
        Iterator it2 = arrayList3.iterator();
        ArrayList arrayListO = arrayList7;
        loop3: while (true) {
            objA = null;
            while (it2.hasNext()) {
                g gVar2 = (g) it2.next();
                if (gVar2.g() && dVar != null && dVar2 != null) {
                    objA = m4.A(m4.h(gVar2.e()));
                    arrayListO = dVar2.i().O();
                    X2.l.d(arrayListO, "lastIn.fragment.sharedElementSourceNames");
                    ArrayList arrayListO2 = dVar.i().O();
                    X2.l.d(arrayListO2, "firstOut.fragment.sharedElementSourceNames");
                    ArrayList arrayListP2 = dVar.i().P();
                    X2.l.d(arrayListP2, "firstOut.fragment.sharedElementTargetNames");
                    int size = arrayListP2.size();
                    it = it2;
                    int i4 = 0;
                    while (i4 < size) {
                        ArrayList arrayList8 = arrayList3;
                        int iIndexOf = arrayListO.indexOf(arrayListP2.get(i4));
                        int i5 = size;
                        if (iIndexOf != -1) {
                            arrayListO.set(iIndexOf, arrayListO2.get(i4));
                        }
                        i4++;
                        arrayList3 = arrayList8;
                        size = i5;
                    }
                    arrayList = arrayList3;
                    arrayListP = dVar2.i().P();
                    X2.l.d(arrayListP, "lastIn.fragment.sharedElementTargetNames");
                    if (z3) {
                        dVar.i().t();
                        dVar2.i().w();
                        iVarA = K2.m.a(null, null);
                    } else {
                        dVar.i().w();
                        dVar2.i().t();
                        iVarA = K2.m.a(null, null);
                    }
                    i.d.a(iVarA.a());
                    i.d.a(iVarA.b());
                    int i6 = 0;
                    for (int size2 = arrayListO.size(); i6 < size2; size2 = size2) {
                        Object obj3 = arrayListO.get(i6);
                        X2.l.d(obj3, "exitingNames[i]");
                        Object obj4 = arrayListP.get(i6);
                        X2.l.d(obj4, "enteringNames[i]");
                        c1475a.put((String) obj3, (String) obj4);
                        i6++;
                    }
                    if (B.m0(2)) {
                        Log.v("FragmentManager", ">>> entering view names <<<");
                        for (Iterator it3 = arrayListP.iterator(); it3.hasNext(); it3 = it3) {
                            Log.v("FragmentManager", "Name: " + ((String) it3.next()));
                        }
                        Log.v("FragmentManager", ">>> exiting view names <<<");
                        for (Iterator it4 = arrayListO.iterator(); it4.hasNext(); it4 = it4) {
                            Log.v("FragmentManager", "Name: " + ((String) it4.next()));
                        }
                    }
                    View view = dVar.i().f3228J;
                    X2.l.d(view, "firstOut.fragment.mView");
                    D(c1475a2, view);
                    c1475a2.o(arrayListO);
                    c1475a.o(c1475a2.keySet());
                    View view2 = dVar2.i().f3228J;
                    X2.l.d(view2, "lastIn.fragment.mView");
                    D(c1475a3, view2);
                    c1475a3.o(arrayListP);
                    c1475a3.o(c1475a.values());
                    K.c(c1475a, c1475a3);
                    Collection collectionKeySet = c1475a.keySet();
                    X2.l.d(collectionKeySet, "sharedElementNameMapping.keys");
                    E(c1475a2, collectionKeySet);
                    Collection collectionValues = c1475a.values();
                    X2.l.d(collectionValues, "sharedElementNameMapping.values");
                    E(c1475a3, collectionValues);
                    if (c1475a.isEmpty()) {
                        break;
                    }
                } else {
                    it = it2;
                    arrayList = arrayList3;
                }
                it2 = it;
                arrayList3 = arrayList;
            }
            Log.i("FragmentManager", "Ignoring shared elements transition " + objA + " between " + dVar + " and " + dVar2 + " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element.");
            arrayList4.clear();
            arrayList5.clear();
            it2 = it;
            arrayList3 = arrayList;
        }
        ArrayList arrayList9 = arrayList3;
        if (objA == null) {
            if (arrayList9.isEmpty()) {
                return;
            }
            Iterator it5 = arrayList9.iterator();
            while (it5.hasNext()) {
                if (((g) it5.next()).f() == null) {
                }
            }
            return;
        }
        C0068f c0068f = new C0068f(arrayList9, dVar, dVar2, m4, objA, arrayList4, arrayList5, c1475a, arrayListP, arrayListO, c1475a2, c1475a3, z3);
        Iterator it6 = arrayList9.iterator();
        while (it6.hasNext()) {
            ((g) it6.next()).a().b(c0068f);
        }
    }

    public final void D(Map map, View view) {
        String strQ = AbstractC0241y.q(view);
        if (strQ != null) {
            map.put(strQ, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = viewGroup.getChildAt(i4);
                if (childAt.getVisibility() == 0) {
                    X2.l.d(childAt, "child");
                    D(map, childAt);
                }
            }
        }
    }

    public final void E(C1475a c1475a, Collection collection) {
        Set setEntrySet = c1475a.entrySet();
        X2.l.d(setEntrySet, "entries");
        L2.r.r(setEntrySet, new h(collection));
    }

    public final void F(List list) {
        AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497oI = ((S.d) L2.u.A(list)).i();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            S.d dVar = (S.d) it.next();
            dVar.i().f3231M.f3277b = abstractComponentCallbacksC0497oI.f3231M.f3277b;
            dVar.i().f3231M.f3278c = abstractComponentCallbacksC0497oI.f3231M.f3278c;
            dVar.i().f3231M.f3279d = abstractComponentCallbacksC0497oI.f3231M.f3279d;
            dVar.i().f3231M.f3280e = abstractComponentCallbacksC0497oI.f3231M.f3280e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b9  */
    @Override // R.S
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(java.util.List r9, boolean r10) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R.C0488f.d(java.util.List, boolean):void");
    }
}
