package R;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class S {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f3099f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f3100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f3101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f3102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3104e;

    public static final class a {
        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public final S a(ViewGroup viewGroup, B b4) {
            X2.l.e(viewGroup, "container");
            X2.l.e(b4, "fragmentManager");
            T tF0 = b4.f0();
            X2.l.d(tF0, "fragmentManager.specialEffectsControllerFactory");
            return b(viewGroup, tF0);
        }

        public final S b(ViewGroup viewGroup, T t4) {
            X2.l.e(viewGroup, "container");
            X2.l.e(t4, "factory");
            Object tag = viewGroup.getTag(Q.b.f2910b);
            if (tag instanceof S) {
                return (S) tag;
            }
            S sA = t4.a(viewGroup);
            X2.l.d(sA, "factory.createController(container)");
            viewGroup.setTag(Q.b.f2910b, sA);
            return sA;
        }

        public a() {
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f3105a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f3106b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f3107c;

        public final void a(ViewGroup viewGroup) {
            X2.l.e(viewGroup, "container");
            if (!this.f3107c) {
                c(viewGroup);
            }
            this.f3107c = true;
        }

        public boolean b() {
            return this.f3105a;
        }

        public abstract void c(ViewGroup viewGroup);

        public abstract void d(ViewGroup viewGroup);

        public void e(ViewGroup viewGroup) {
            X2.l.e(viewGroup, "container");
        }

        public final void f(ViewGroup viewGroup) {
            X2.l.e(viewGroup, "container");
            if (!this.f3106b) {
                e(viewGroup);
            }
            this.f3106b = true;
        }
    }

    public static final class c extends d {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final H f3108l;

        /* JADX WARN: Illegal instructions before constructor call */
        public c(d.b bVar, d.a aVar, H h4) {
            X2.l.e(bVar, "finalState");
            X2.l.e(aVar, "lifecycleImpact");
            X2.l.e(h4, "fragmentStateManager");
            AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497oK = h4.k();
            X2.l.d(abstractComponentCallbacksC0497oK, "fragmentStateManager.fragment");
            super(bVar, aVar, abstractComponentCallbacksC0497oK);
            this.f3108l = h4;
        }

        @Override // R.S.d
        public void e() {
            super.e();
            i().f3260o = false;
            this.f3108l.m();
        }

        @Override // R.S.d
        public void q() {
            if (o()) {
                return;
            }
            super.q();
            if (j() != d.a.ADDING) {
                if (j() == d.a.REMOVING) {
                    AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497oK = this.f3108l.k();
                    X2.l.d(abstractComponentCallbacksC0497oK, "fragmentStateManager.fragment");
                    View viewT0 = abstractComponentCallbacksC0497oK.T0();
                    X2.l.d(viewT0, "fragment.requireView()");
                    if (B.m0(2)) {
                        Log.v("FragmentManager", "Clearing focus " + viewT0.findFocus() + " on view " + viewT0 + " for Fragment " + abstractComponentCallbacksC0497oK);
                    }
                    viewT0.clearFocus();
                    return;
                }
                return;
            }
            AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497oK2 = this.f3108l.k();
            X2.l.d(abstractComponentCallbacksC0497oK2, "fragmentStateManager.fragment");
            View viewFindFocus = abstractComponentCallbacksC0497oK2.f3228J.findFocus();
            if (viewFindFocus != null) {
                abstractComponentCallbacksC0497oK2.Y0(viewFindFocus);
                if (B.m0(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + abstractComponentCallbacksC0497oK2);
                }
            }
            View viewT02 = i().T0();
            X2.l.d(viewT02, "this.fragment.requireView()");
            if (viewT02.getParent() == null) {
                this.f3108l.b();
                viewT02.setAlpha(0.0f);
            }
            if (viewT02.getAlpha() == 0.0f && viewT02.getVisibility() == 0) {
                viewT02.setVisibility(4);
            }
            viewT02.setAlpha(abstractComponentCallbacksC0497oK2.H());
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b f3109a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a f3110b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AbstractComponentCallbacksC0497o f3111c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f3112d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f3113e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f3114f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f3115g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f3116h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f3117i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final List f3118j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final List f3119k;

        public enum a {
            NONE,
            ADDING,
            REMOVING
        }

        public enum b {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;


            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public static final a f3124m = new a(null);

            public static final class a {
                public /* synthetic */ a(X2.g gVar) {
                    this();
                }

                public final b a(View view) {
                    X2.l.e(view, "<this>");
                    return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? b.INVISIBLE : b(view.getVisibility());
                }

                public final b b(int i4) {
                    if (i4 == 0) {
                        return b.VISIBLE;
                    }
                    if (i4 == 4) {
                        return b.INVISIBLE;
                    }
                    if (i4 == 8) {
                        return b.GONE;
                    }
                    throw new IllegalArgumentException("Unknown visibility " + i4);
                }

                public a() {
                }
            }

            /* JADX INFO: renamed from: R.S$d$b$b, reason: collision with other inner class name */
            public /* synthetic */ class C0066b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f3130a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.REMOVED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.VISIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.GONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.INVISIBLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f3130a = iArr;
                }
            }

            public static final b g(int i4) {
                return f3124m.b(i4);
            }

            public final void f(View view, ViewGroup viewGroup) {
                X2.l.e(view, "view");
                X2.l.e(viewGroup, "container");
                int i4 = C0066b.f3130a[ordinal()];
                if (i4 == 1) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup2 != null) {
                        if (B.m0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup2);
                        }
                        viewGroup2.removeView(view);
                        return;
                    }
                    return;
                }
                if (i4 == 2) {
                    if (B.m0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    ViewParent parent2 = view.getParent();
                    if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                        if (B.m0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + viewGroup);
                        }
                        viewGroup.addView(view);
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i4 == 3) {
                    if (B.m0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (i4 != 4) {
                    return;
                }
                if (B.m0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        public /* synthetic */ class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f3131a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ADDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.REMOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f3131a = iArr;
            }
        }

        public d(b bVar, a aVar, AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o) {
            X2.l.e(bVar, "finalState");
            X2.l.e(aVar, "lifecycleImpact");
            X2.l.e(abstractComponentCallbacksC0497o, "fragment");
            this.f3109a = bVar;
            this.f3110b = aVar;
            this.f3111c = abstractComponentCallbacksC0497o;
            this.f3112d = new ArrayList();
            this.f3117i = true;
            ArrayList arrayList = new ArrayList();
            this.f3118j = arrayList;
            this.f3119k = arrayList;
        }

        public final void a(Runnable runnable) {
            X2.l.e(runnable, "listener");
            this.f3112d.add(runnable);
        }

        public final void b(b bVar) {
            X2.l.e(bVar, "effect");
            this.f3118j.add(bVar);
        }

        public final void c(ViewGroup viewGroup) {
            X2.l.e(viewGroup, "container");
            this.f3116h = false;
            if (this.f3113e) {
                return;
            }
            this.f3113e = true;
            if (this.f3118j.isEmpty()) {
                e();
                return;
            }
            Iterator it = L2.u.F(this.f3119k).iterator();
            while (it.hasNext()) {
                ((b) it.next()).a(viewGroup);
            }
        }

        public final void d(ViewGroup viewGroup, boolean z3) {
            X2.l.e(viewGroup, "container");
            if (this.f3113e) {
                return;
            }
            if (z3) {
                this.f3115g = true;
            }
            c(viewGroup);
        }

        public void e() {
            this.f3116h = false;
            if (this.f3114f) {
                return;
            }
            if (B.m0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f3114f = true;
            Iterator it = this.f3112d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void f(b bVar) {
            X2.l.e(bVar, "effect");
            if (this.f3118j.remove(bVar) && this.f3118j.isEmpty()) {
                e();
            }
        }

        public final List g() {
            return this.f3119k;
        }

        public final b h() {
            return this.f3109a;
        }

        public final AbstractComponentCallbacksC0497o i() {
            return this.f3111c;
        }

        public final a j() {
            return this.f3110b;
        }

        public final boolean k() {
            return this.f3117i;
        }

        public final boolean l() {
            return this.f3113e;
        }

        public final boolean m() {
            return this.f3114f;
        }

        public final boolean n() {
            return this.f3115g;
        }

        public final boolean o() {
            return this.f3116h;
        }

        public final void p(b bVar, a aVar) {
            X2.l.e(bVar, "finalState");
            X2.l.e(aVar, "lifecycleImpact");
            int i4 = c.f3131a[aVar.ordinal()];
            if (i4 == 1) {
                if (this.f3109a == b.REMOVED) {
                    if (B.m0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f3111c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f3110b + " to ADDING.");
                    }
                    this.f3109a = b.VISIBLE;
                    this.f3110b = a.ADDING;
                    this.f3117i = true;
                    return;
                }
                return;
            }
            if (i4 == 2) {
                if (B.m0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f3111c + " mFinalState = " + this.f3109a + " -> REMOVED. mLifecycleImpact  = " + this.f3110b + " to REMOVING.");
                }
                this.f3109a = b.REMOVED;
                this.f3110b = a.REMOVING;
                this.f3117i = true;
                return;
            }
            if (i4 == 3 && this.f3109a != b.REMOVED) {
                if (B.m0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f3111c + " mFinalState = " + this.f3109a + " -> " + bVar + '.');
                }
                this.f3109a = bVar;
            }
        }

        public void q() {
            this.f3116h = true;
        }

        public final void r(boolean z3) {
            this.f3117i = z3;
        }

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + this.f3109a + " lifecycleImpact = " + this.f3110b + " fragment = " + this.f3111c + '}';
        }
    }

    public /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3132a;

        static {
            int[] iArr = new int[d.a.values().length];
            try {
                iArr[d.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f3132a = iArr;
        }
    }

    public S(ViewGroup viewGroup) {
        X2.l.e(viewGroup, "container");
        this.f3100a = viewGroup;
        this.f3101b = new ArrayList();
        this.f3102c = new ArrayList();
    }

    public static final void g(S s4, c cVar) {
        X2.l.e(s4, "this$0");
        X2.l.e(cVar, "$operation");
        if (s4.f3101b.contains(cVar)) {
            d.b bVarH = cVar.h();
            View view = cVar.i().f3228J;
            X2.l.d(view, "operation.fragment.mView");
            bVarH.f(view, s4.f3100a);
        }
    }

    public static final void h(S s4, c cVar) {
        X2.l.e(s4, "this$0");
        X2.l.e(cVar, "$operation");
        s4.f3101b.remove(cVar);
        s4.f3102c.remove(cVar);
    }

    public static final S t(ViewGroup viewGroup, B b4) {
        return f3099f.a(viewGroup, b4);
    }

    public static final S u(ViewGroup viewGroup, T t4) {
        return f3099f.b(viewGroup, t4);
    }

    public final void c(d dVar) {
        X2.l.e(dVar, "operation");
        if (dVar.k()) {
            d.b bVarH = dVar.h();
            View viewT0 = dVar.i().T0();
            X2.l.d(viewT0, "operation.fragment.requireView()");
            bVarH.f(viewT0, this.f3100a);
            dVar.r(false);
        }
    }

    public abstract void d(List list, boolean z3);

    public void e(List list) {
        X2.l.e(list, "operations");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            L2.r.o(arrayList, ((d) it.next()).g());
        }
        List listF = L2.u.F(L2.u.I(arrayList));
        int size = listF.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((b) listF.get(i4)).d(this.f3100a);
        }
        int size2 = list.size();
        for (int i5 = 0; i5 < size2; i5++) {
            c((d) list.get(i5));
        }
        List listF2 = L2.u.F(list);
        int size3 = listF2.size();
        for (int i6 = 0; i6 < size3; i6++) {
            d dVar = (d) listF2.get(i6);
            if (dVar.g().isEmpty()) {
                dVar.e();
            }
        }
    }

    public final void f(d.b bVar, d.a aVar, H h4) {
        synchronized (this.f3101b) {
            try {
                AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497oK = h4.k();
                X2.l.d(abstractComponentCallbacksC0497oK, "fragmentStateManager.fragment");
                d dVarN = n(abstractComponentCallbacksC0497oK);
                if (dVarN == null) {
                    if (h4.k().f3260o) {
                        AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497oK2 = h4.k();
                        X2.l.d(abstractComponentCallbacksC0497oK2, "fragmentStateManager.fragment");
                        dVarN = o(abstractComponentCallbacksC0497oK2);
                    } else {
                        dVarN = null;
                    }
                }
                if (dVarN != null) {
                    dVarN.p(bVar, aVar);
                    return;
                }
                final c cVar = new c(bVar, aVar, h4);
                this.f3101b.add(cVar);
                cVar.a(new Runnable() { // from class: R.P
                    @Override // java.lang.Runnable
                    public final void run() {
                        S.g(this.f3095m, cVar);
                    }
                });
                cVar.a(new Runnable() { // from class: R.Q
                    @Override // java.lang.Runnable
                    public final void run() {
                        S.h(this.f3097m, cVar);
                    }
                });
                K2.p pVar = K2.p.f2516a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(d.b bVar, H h4) {
        X2.l.e(bVar, "finalState");
        X2.l.e(h4, "fragmentStateManager");
        if (B.m0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + h4.k());
        }
        f(bVar, d.a.ADDING, h4);
    }

    public final void j(H h4) {
        X2.l.e(h4, "fragmentStateManager");
        if (B.m0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + h4.k());
        }
        f(d.b.GONE, d.a.NONE, h4);
    }

    public final void k(H h4) {
        X2.l.e(h4, "fragmentStateManager");
        if (B.m0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + h4.k());
        }
        f(d.b.REMOVED, d.a.REMOVING, h4);
    }

    public final void l(H h4) {
        X2.l.e(h4, "fragmentStateManager");
        if (B.m0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + h4.k());
        }
        f(d.b.VISIBLE, d.a.NONE, h4);
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m() {
        /*
            Method dump skipped, instruction units count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R.S.m():void");
    }

    public final d n(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o) {
        Object next;
        Iterator it = this.f3101b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            d dVar = (d) next;
            if (X2.l.a(dVar.i(), abstractComponentCallbacksC0497o) && !dVar.l()) {
                break;
            }
        }
        return (d) next;
    }

    public final d o(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o) {
        Object next;
        Iterator it = this.f3102c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            d dVar = (d) next;
            if (X2.l.a(dVar.i(), abstractComponentCallbacksC0497o) && !dVar.l()) {
                break;
            }
        }
        return (d) next;
    }

    public final void p() {
        if (B.m0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zIsAttachedToWindow = this.f3100a.isAttachedToWindow();
        synchronized (this.f3101b) {
            try {
                x();
                w(this.f3101b);
                for (d dVar : L2.u.H(this.f3102c)) {
                    if (B.m0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.f3100a + " is not attached to window. ") + "Cancelling running operation " + dVar);
                    }
                    dVar.c(this.f3100a);
                }
                for (d dVar2 : L2.u.H(this.f3101b)) {
                    if (B.m0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.f3100a + " is not attached to window. ") + "Cancelling pending operation " + dVar2);
                    }
                    dVar2.c(this.f3100a);
                }
                K2.p pVar = K2.p.f2516a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void q() {
        if (this.f3104e) {
            if (B.m0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.f3104e = false;
            m();
        }
    }

    public final d.a r(H h4) {
        X2.l.e(h4, "fragmentStateManager");
        AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497oK = h4.k();
        X2.l.d(abstractComponentCallbacksC0497oK, "fragmentStateManager.fragment");
        d dVarN = n(abstractComponentCallbacksC0497oK);
        d.a aVarJ = dVarN != null ? dVarN.j() : null;
        d dVarO = o(abstractComponentCallbacksC0497oK);
        d.a aVarJ2 = dVarO != null ? dVarO.j() : null;
        int i4 = aVarJ == null ? -1 : e.f3132a[aVarJ.ordinal()];
        return (i4 == -1 || i4 == 1) ? aVarJ2 : aVarJ;
    }

    public final ViewGroup s() {
        return this.f3100a;
    }

    public final void v() {
        Object objPrevious;
        synchronized (this.f3101b) {
            try {
                x();
                List list = this.f3101b;
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    d dVar = (d) objPrevious;
                    d.b.a aVar = d.b.f3124m;
                    View view = dVar.i().f3228J;
                    X2.l.d(view, "operation.fragment.mView");
                    d.b bVarA = aVar.a(view);
                    d.b bVarH = dVar.h();
                    d.b bVar = d.b.VISIBLE;
                    if (bVarH == bVar && bVarA != bVar) {
                        break;
                    }
                }
                d dVar2 = (d) objPrevious;
                AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497oI = dVar2 != null ? dVar2.i() : null;
                this.f3104e = abstractComponentCallbacksC0497oI != null ? abstractComponentCallbacksC0497oI.d0() : false;
                K2.p pVar = K2.p.f2516a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void w(List list) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((d) list.get(i4)).q();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            L2.r.o(arrayList, ((d) it.next()).g());
        }
        List listF = L2.u.F(L2.u.I(arrayList));
        int size2 = listF.size();
        for (int i5 = 0; i5 < size2; i5++) {
            ((b) listF.get(i5)).f(this.f3100a);
        }
    }

    public final void x() {
        for (d dVar : this.f3101b) {
            if (dVar.j() == d.a.ADDING) {
                View viewT0 = dVar.i().T0();
                X2.l.d(viewT0, "fragment.requireView()");
                dVar.p(d.b.f3124m.b(viewT0.getVisibility()), d.a.NONE);
            }
        }
    }

    public final void y(boolean z3) {
        this.f3103d = z3;
    }
}
