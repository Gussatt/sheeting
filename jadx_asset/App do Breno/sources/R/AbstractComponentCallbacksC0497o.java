package R;

import android.animation.Animator;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.AbstractC0609f;
import androidx.lifecycle.C;
import androidx.lifecycle.InterfaceC0608e;
import androidx.lifecycle.InterfaceC0611h;
import e0.C0925d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import s.AbstractC1524k;

/* JADX INFO: renamed from: R.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC0497o implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.j, androidx.lifecycle.F, InterfaceC0608e, e0.f {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final Object f3218c0 = new Object();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f3219A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f3220B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f3221C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f3222D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f3223E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f3224F;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f3226H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public ViewGroup f3227I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public View f3228J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f3229K;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public e f3231M;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f3233O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public LayoutInflater f3234P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f3235Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public String f3236R;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public androidx.lifecycle.k f3238T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public N f3239U;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public C.b f3241W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public e0.e f3242X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f3243Y;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f3248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SparseArray f3249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Bundle f3250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Boolean f3251f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Bundle f3253h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AbstractComponentCallbacksC0497o f3254i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3256k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f3258m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f3259n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f3260o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f3261p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f3262q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f3263r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f3264s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f3265t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f3266u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public B f3267v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public AbstractComponentCallbacksC0497o f3269x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f3270y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f3271z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3246b = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f3252g = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f3255j = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Boolean f3257l = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public B f3268w = new C();

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f3225G = true;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f3230L = true;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public Runnable f3232N = new a();

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public AbstractC0609f.b f3237S = AbstractC0609f.b.RESUMED;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public androidx.lifecycle.o f3240V = new androidx.lifecycle.o();

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final AtomicInteger f3244Z = new AtomicInteger();

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final ArrayList f3245a0 = new ArrayList();

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final f f3247b0 = new b();

    /* JADX INFO: renamed from: R.o$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractComponentCallbacksC0497o.this.k1();
        }
    }

    /* JADX INFO: renamed from: R.o$b */
    public class b extends f {
        public b() {
            super(null);
        }

        @Override // R.AbstractComponentCallbacksC0497o.f
        public void a() {
            AbstractComponentCallbacksC0497o.this.f3242X.c();
            androidx.lifecycle.x.a(AbstractComponentCallbacksC0497o.this);
            Bundle bundle = AbstractComponentCallbacksC0497o.this.f3248c;
            AbstractComponentCallbacksC0497o.this.f3242X.d(bundle != null ? bundle.getBundle("registryState") : null);
        }
    }

    /* JADX INFO: renamed from: R.o$c */
    public class c extends r {
        public c() {
        }

        @Override // R.r
        public View a(int i4) {
            View view = AbstractComponentCallbacksC0497o.this.f3228J;
            if (view != null) {
                return view.findViewById(i4);
            }
            throw new IllegalStateException("Fragment " + AbstractComponentCallbacksC0497o.this + " does not have a view");
        }

        @Override // R.r
        public boolean b() {
            return AbstractComponentCallbacksC0497o.this.f3228J != null;
        }
    }

    /* JADX INFO: renamed from: R.o$d */
    public class d implements InterfaceC0611h {
        public d() {
        }

        @Override // androidx.lifecycle.InterfaceC0611h
        public void a(androidx.lifecycle.j jVar, AbstractC0609f.a aVar) {
            View view;
            if (aVar != AbstractC0609f.a.ON_STOP || (view = AbstractComponentCallbacksC0497o.this.f3228J) == null) {
                return;
            }
            view.cancelPendingInputEvents();
        }
    }

    /* JADX INFO: renamed from: R.o$e */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f3276a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f3277b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3278c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f3279d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f3280e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f3281f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ArrayList f3282g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public ArrayList f3283h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Object f3284i = null;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f3285j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f3286k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f3287l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Object f3288m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Object f3289n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Boolean f3290o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Boolean f3291p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public float f3292q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public View f3293r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f3294s;

        public e() {
            Object obj = AbstractComponentCallbacksC0497o.f3218c0;
            this.f3285j = obj;
            this.f3286k = null;
            this.f3287l = obj;
            this.f3288m = null;
            this.f3289n = obj;
            this.f3292q = 1.0f;
            this.f3293r = null;
        }
    }

    /* JADX INFO: renamed from: R.o$f */
    public static abstract class f {
        public f() {
        }

        public abstract void a();

        public /* synthetic */ f(a aVar) {
            this();
        }
    }

    public AbstractComponentCallbacksC0497o() {
        W();
    }

    public static /* synthetic */ void f(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o) {
        abstractComponentCallbacksC0497o.f3239U.f(abstractComponentCallbacksC0497o.f3250e);
        abstractComponentCallbacksC0497o.f3250e = null;
    }

    public final int A() {
        AbstractC0609f.b bVar = this.f3237S;
        return (bVar == AbstractC0609f.b.INITIALIZED || this.f3269x == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.f3269x.A());
    }

    public void A0() {
        Iterator it = this.f3245a0.iterator();
        while (it.hasNext()) {
            ((f) it.next()).a();
        }
        this.f3245a0.clear();
        this.f3268w.i(null, g(), this);
        this.f3246b = 0;
        this.f3226H = false;
        throw null;
    }

    public int B() {
        e eVar = this.f3231M;
        if (eVar == null) {
            return 0;
        }
        return eVar.f3281f;
    }

    public void B0(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public final AbstractComponentCallbacksC0497o C() {
        return this.f3269x;
    }

    public void C0(Bundle bundle) {
        this.f3268w.u0();
        this.f3246b = 1;
        this.f3226H = false;
        this.f3238T.a(new d());
        i0(bundle);
        this.f3235Q = true;
        if (this.f3226H) {
            this.f3238T.h(AbstractC0609f.a.ON_CREATE);
            return;
        }
        throw new U("Fragment " + this + " did not call through to super.onCreate()");
    }

    public final B D() {
        B b4 = this.f3267v;
        if (b4 != null) {
            return b4;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public void D0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f3268w.u0();
        this.f3265t = true;
        this.f3239U = new N(this, c(), new Runnable() { // from class: R.n
            @Override // java.lang.Runnable
            public final void run() {
                AbstractComponentCallbacksC0497o.f(this.f3217m);
            }
        });
        View viewL0 = l0(layoutInflater, viewGroup, bundle);
        this.f3228J = viewL0;
        if (viewL0 == null) {
            if (this.f3239U.e()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f3239U = null;
            return;
        }
        this.f3239U.d();
        if (B.m0(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.f3228J + " for Fragment " + this);
        }
        androidx.lifecycle.G.a(this.f3228J, this.f3239U);
        androidx.lifecycle.H.a(this.f3228J, this.f3239U);
        e0.g.a(this.f3228J, this.f3239U);
        this.f3240V.d(this.f3239U);
    }

    public boolean E() {
        e eVar = this.f3231M;
        if (eVar == null) {
            return false;
        }
        return eVar.f3276a;
    }

    public void E0() {
        this.f3268w.w();
        if (this.f3228J != null && this.f3239U.h().b().f(AbstractC0609f.b.CREATED)) {
            this.f3239U.a(AbstractC0609f.a.ON_DESTROY);
        }
        this.f3246b = 1;
        this.f3226H = false;
        m0();
        if (this.f3226H) {
            W.a.a(this).b();
            this.f3265t = false;
        } else {
            throw new U("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    public int F() {
        e eVar = this.f3231M;
        if (eVar == null) {
            return 0;
        }
        return eVar.f3279d;
    }

    public void F0() {
        this.f3246b = -1;
        this.f3226H = false;
        n0();
        this.f3234P = null;
        if (this.f3226H) {
            if (this.f3268w.l0()) {
                return;
            }
            this.f3268w.v();
            this.f3268w = new C();
            return;
        }
        throw new U("Fragment " + this + " did not call through to super.onDetach()");
    }

    public int G() {
        e eVar = this.f3231M;
        if (eVar == null) {
            return 0;
        }
        return eVar.f3280e;
    }

    public LayoutInflater G0(Bundle bundle) {
        LayoutInflater layoutInflaterO0 = o0(bundle);
        this.f3234P = layoutInflaterO0;
        return layoutInflaterO0;
    }

    public float H() {
        e eVar = this.f3231M;
        if (eVar == null) {
            return 1.0f;
        }
        return eVar.f3292q;
    }

    public void H0() {
        onLowMemory();
    }

    public Object I() {
        e eVar = this.f3231M;
        if (eVar == null) {
            return null;
        }
        Object obj = eVar.f3287l;
        return obj == f3218c0 ? v() : obj;
    }

    public void I0() {
        this.f3268w.A();
        if (this.f3228J != null) {
            this.f3239U.a(AbstractC0609f.a.ON_PAUSE);
        }
        this.f3238T.h(AbstractC0609f.a.ON_PAUSE);
        this.f3246b = 6;
        this.f3226H = false;
        r0();
        if (this.f3226H) {
            return;
        }
        throw new U("Fragment " + this + " did not call through to super.onPause()");
    }

    public final Resources J() {
        return S0().getResources();
    }

    public void J0() {
        boolean zQ0 = this.f3267v.q0(this);
        Boolean bool = this.f3257l;
        if (bool == null || bool.booleanValue() != zQ0) {
            this.f3257l = Boolean.valueOf(zQ0);
            s0(zQ0);
            this.f3268w.B();
        }
    }

    public final boolean K() {
        S.c.g(this);
        return this.f3222D;
    }

    public void K0() {
        this.f3268w.u0();
        this.f3268w.K(true);
        this.f3246b = 7;
        this.f3226H = false;
        t0();
        if (!this.f3226H) {
            throw new U("Fragment " + this + " did not call through to super.onResume()");
        }
        androidx.lifecycle.k kVar = this.f3238T;
        AbstractC0609f.a aVar = AbstractC0609f.a.ON_RESUME;
        kVar.h(aVar);
        if (this.f3228J != null) {
            this.f3239U.a(aVar);
        }
        this.f3268w.C();
    }

    public Object L() {
        e eVar = this.f3231M;
        if (eVar == null) {
            return null;
        }
        Object obj = eVar.f3285j;
        return obj == f3218c0 ? s() : obj;
    }

    public void L0(Bundle bundle) {
        u0(bundle);
    }

    public Object M() {
        e eVar = this.f3231M;
        if (eVar == null) {
            return null;
        }
        return eVar.f3288m;
    }

    public void M0() {
        this.f3268w.u0();
        this.f3268w.K(true);
        this.f3246b = 5;
        this.f3226H = false;
        v0();
        if (!this.f3226H) {
            throw new U("Fragment " + this + " did not call through to super.onStart()");
        }
        androidx.lifecycle.k kVar = this.f3238T;
        AbstractC0609f.a aVar = AbstractC0609f.a.ON_START;
        kVar.h(aVar);
        if (this.f3228J != null) {
            this.f3239U.a(aVar);
        }
        this.f3268w.D();
    }

    public Object N() {
        e eVar = this.f3231M;
        if (eVar == null) {
            return null;
        }
        Object obj = eVar.f3289n;
        return obj == f3218c0 ? M() : obj;
    }

    public void N0() {
        this.f3268w.F();
        if (this.f3228J != null) {
            this.f3239U.a(AbstractC0609f.a.ON_STOP);
        }
        this.f3238T.h(AbstractC0609f.a.ON_STOP);
        this.f3246b = 4;
        this.f3226H = false;
        w0();
        if (this.f3226H) {
            return;
        }
        throw new U("Fragment " + this + " did not call through to super.onStop()");
    }

    public ArrayList O() {
        ArrayList arrayList;
        e eVar = this.f3231M;
        return (eVar == null || (arrayList = eVar.f3282g) == null) ? new ArrayList() : arrayList;
    }

    public void O0() {
        Bundle bundle = this.f3248c;
        x0(this.f3228J, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.f3268w.G();
    }

    public ArrayList P() {
        ArrayList arrayList;
        e eVar = this.f3231M;
        return (eVar == null || (arrayList = eVar.f3283h) == null) ? new ArrayList() : arrayList;
    }

    public void P0(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    public final String Q() {
        return this.f3219A;
    }

    public final void Q0(f fVar) {
        if (this.f3246b >= 0) {
            fVar.a();
        } else {
            this.f3245a0.add(fVar);
        }
    }

    public final AbstractComponentCallbacksC0497o R() {
        return S(true);
    }

    public final AbstractActivityC0498p R0() {
        j();
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final AbstractComponentCallbacksC0497o S(boolean z3) {
        String str;
        if (z3) {
            S.c.i(this);
        }
        AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o = this.f3254i;
        if (abstractComponentCallbacksC0497o != null) {
            return abstractComponentCallbacksC0497o;
        }
        B b4 = this.f3267v;
        if (b4 == null || (str = this.f3255j) == null) {
            return null;
        }
        return b4.O(str);
    }

    public final Context S0() {
        Context contextQ = q();
        if (contextQ != null) {
            return contextQ;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final int T() {
        S.c.h(this);
        return this.f3256k;
    }

    public final View T0() {
        View viewV = V();
        if (viewV != null) {
            return viewV;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public boolean U() {
        return this.f3230L;
    }

    public void U0() {
        Bundle bundle;
        Bundle bundle2 = this.f3248c;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.f3268w.B0(bundle);
        this.f3268w.u();
    }

    public View V() {
        return this.f3228J;
    }

    public final void V0() {
        if (B.m0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.f3228J != null) {
            Bundle bundle = this.f3248c;
            W0(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        }
        this.f3248c = null;
    }

    public final void W() {
        this.f3238T = new androidx.lifecycle.k(this);
        this.f3242X = e0.e.a(this);
        this.f3241W = null;
        if (this.f3245a0.contains(this.f3247b0)) {
            return;
        }
        Q0(this.f3247b0);
    }

    public final void W0(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f3249d;
        if (sparseArray != null) {
            this.f3228J.restoreHierarchyState(sparseArray);
            this.f3249d = null;
        }
        this.f3226H = false;
        y0(bundle);
        if (this.f3226H) {
            if (this.f3228J != null) {
                this.f3239U.a(AbstractC0609f.a.ON_CREATE);
            }
        } else {
            throw new U("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    public void X() {
        W();
        this.f3236R = this.f3252g;
        this.f3252g = UUID.randomUUID().toString();
        this.f3258m = false;
        this.f3259n = false;
        this.f3262q = false;
        this.f3263r = false;
        this.f3264s = false;
        this.f3266u = 0;
        this.f3267v = null;
        this.f3268w = new C();
        this.f3270y = 0;
        this.f3271z = 0;
        this.f3219A = null;
        this.f3220B = false;
        this.f3221C = false;
    }

    public void X0(int i4, int i5, int i6, int i7) {
        if (this.f3231M == null && i4 == 0 && i5 == 0 && i6 == 0 && i7 == 0) {
            return;
        }
        i().f3277b = i4;
        i().f3278c = i5;
        i().f3279d = i6;
        i().f3280e = i7;
    }

    public final boolean Y() {
        return false;
    }

    public void Y0(View view) {
        i().f3293r = view;
    }

    public final boolean Z() {
        return this.f3221C;
    }

    public void Z0(boolean z3) {
        if (this.f3224F != z3) {
            this.f3224F = z3;
            if (Y() && !a0()) {
                throw null;
            }
        }
    }

    public final boolean a0() {
        if (this.f3220B) {
            return true;
        }
        B b4 = this.f3267v;
        return b4 != null && b4.p0(this.f3269x);
    }

    public void a1(boolean z3) {
        if (this.f3225G != z3) {
            this.f3225G = z3;
            if (this.f3224F && Y() && !a0()) {
                throw null;
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0608e
    public V.a b() {
        Application application;
        Context applicationContext = S0().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && B.m0(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + S0().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        V.b bVar = new V.b();
        if (application != null) {
            bVar.b(C.a.f4952e, application);
        }
        bVar.b(androidx.lifecycle.x.f5027a, this);
        bVar.b(androidx.lifecycle.x.f5028b, this);
        if (o() != null) {
            bVar.b(androidx.lifecycle.x.f5029c, o());
        }
        return bVar;
    }

    public final boolean b0() {
        return this.f3266u > 0;
    }

    public void b1(int i4) {
        if (this.f3231M == null && i4 == 0) {
            return;
        }
        i();
        this.f3231M.f3281f = i4;
    }

    @Override // androidx.lifecycle.F
    public androidx.lifecycle.E c() {
        if (this.f3267v == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (A() != AbstractC0609f.b.INITIALIZED.ordinal()) {
            return this.f3267v.i0(this);
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    public final boolean c0() {
        return this.f3263r;
    }

    public void c1(boolean z3) {
        if (this.f3231M == null) {
            return;
        }
        i().f3276a = z3;
    }

    public boolean d0() {
        e eVar = this.f3231M;
        if (eVar == null) {
            return false;
        }
        return eVar.f3294s;
    }

    public void d1(float f4) {
        i().f3292q = f4;
    }

    public final boolean e0() {
        return this.f3259n;
    }

    public void e1(boolean z3) {
        S.c.j(this);
        this.f3222D = z3;
        B b4 = this.f3267v;
        if (b4 == null) {
            this.f3223E = true;
        } else if (z3) {
            b4.h(this);
        } else {
            b4.z0(this);
        }
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final boolean f0() {
        return this.f3246b >= 7;
    }

    public void f1(ArrayList arrayList, ArrayList arrayList2) {
        i();
        e eVar = this.f3231M;
        eVar.f3282g = arrayList;
        eVar.f3283h = arrayList2;
    }

    public r g() {
        return new c();
    }

    public final boolean g0() {
        View view;
        return (!Y() || a0() || (view = this.f3228J) == null || view.getWindowToken() == null || this.f3228J.getVisibility() != 0) ? false : true;
    }

    public void g1(boolean z3) {
        S.c.k(this, z3);
        if (!this.f3230L && z3 && this.f3246b < 5 && this.f3267v != null && Y() && this.f3235Q) {
            B b4 = this.f3267v;
            b4.w0(b4.q(this));
        }
        this.f3230L = z3;
        this.f3229K = this.f3246b < 5 && !z3;
        if (this.f3248c != null) {
            this.f3251f = Boolean.valueOf(z3);
        }
    }

    @Override // androidx.lifecycle.j
    public AbstractC0609f h() {
        return this.f3238T;
    }

    public void h0(Bundle bundle) {
        this.f3226H = true;
    }

    public void h1(Intent intent) {
        i1(intent, null);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final e i() {
        if (this.f3231M == null) {
            this.f3231M = new e();
        }
        return this.f3231M;
    }

    public void i0(Bundle bundle) {
        this.f3226H = true;
        U0();
        if (this.f3268w.r0(1)) {
            return;
        }
        this.f3268w.u();
    }

    public void i1(Intent intent, Bundle bundle) {
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final AbstractActivityC0498p j() {
        return null;
    }

    public Animation j0(int i4, boolean z3, int i5) {
        return null;
    }

    public void j1(Intent intent, int i4, Bundle bundle) {
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public Animator k0(int i4, boolean z3, int i5) {
        return null;
    }

    public void k1() {
        if (this.f3231M == null || !i().f3294s) {
            return;
        }
        i().f3294s = false;
    }

    @Override // e0.f
    public final C0925d l() {
        return this.f3242X.b();
    }

    public View l0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i4 = this.f3243Y;
        if (i4 != 0) {
            return layoutInflater.inflate(i4, viewGroup, false);
        }
        return null;
    }

    public void l1(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    public boolean m() {
        Boolean bool;
        e eVar = this.f3231M;
        if (eVar == null || (bool = eVar.f3291p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void m0() {
        this.f3226H = true;
    }

    public boolean n() {
        Boolean bool;
        e eVar = this.f3231M;
        if (eVar == null || (bool = eVar.f3290o) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void n0() {
        this.f3226H = true;
    }

    public final Bundle o() {
        return this.f3253h;
    }

    public LayoutInflater o0(Bundle bundle) {
        return z(bundle);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.f3226H = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        R0();
        throw null;
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f3226H = true;
    }

    public final B p() {
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public Context q() {
        return null;
    }

    public void q0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f3226H = true;
    }

    public int r() {
        e eVar = this.f3231M;
        if (eVar == null) {
            return 0;
        }
        return eVar.f3277b;
    }

    public void r0() {
        this.f3226H = true;
    }

    public Object s() {
        e eVar = this.f3231M;
        if (eVar == null) {
            return null;
        }
        return eVar.f3284i;
    }

    public void startActivityForResult(Intent intent, int i4) {
        j1(intent, i4, null);
    }

    public AbstractC1524k t() {
        e eVar = this.f3231M;
        if (eVar == null) {
            return null;
        }
        eVar.getClass();
        return null;
    }

    public void t0() {
        this.f3226H = true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.f3252g);
        if (this.f3270y != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f3270y));
        }
        if (this.f3219A != null) {
            sb.append(" tag=");
            sb.append(this.f3219A);
        }
        sb.append(")");
        return sb.toString();
    }

    public int u() {
        e eVar = this.f3231M;
        if (eVar == null) {
            return 0;
        }
        return eVar.f3278c;
    }

    public Object v() {
        e eVar = this.f3231M;
        if (eVar == null) {
            return null;
        }
        return eVar.f3286k;
    }

    public void v0() {
        this.f3226H = true;
    }

    public AbstractC1524k w() {
        e eVar = this.f3231M;
        if (eVar == null) {
            return null;
        }
        eVar.getClass();
        return null;
    }

    public void w0() {
        this.f3226H = true;
    }

    public View x() {
        e eVar = this.f3231M;
        if (eVar == null) {
            return null;
        }
        return eVar.f3293r;
    }

    public final int y() {
        return this.f3270y;
    }

    public void y0(Bundle bundle) {
        this.f3226H = true;
    }

    public LayoutInflater z(Bundle bundle) {
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void z0(Bundle bundle) {
        this.f3268w.u0();
        this.f3246b = 3;
        this.f3226H = false;
        h0(bundle);
        if (this.f3226H) {
            V0();
            this.f3268w.s();
        } else {
            throw new U("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
    }

    public void p0(boolean z3) {
    }

    public void s0(boolean z3) {
    }

    public void u0(Bundle bundle) {
    }

    public void x0(View view, Bundle bundle) {
    }
}
