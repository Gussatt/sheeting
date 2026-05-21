package R;

import C.InterfaceC0229l;
import R.J;
import S.c;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC0609f;
import b.AbstractC0615c;
import b.AbstractC0616d;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import s.AbstractC1516c;
import s.AbstractC1522i;

/* JADX INFO: loaded from: classes.dex */
public abstract class B {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static boolean f2942P = false;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f2947E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f2948F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f2949G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f2950H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f2951I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public ArrayList f2952J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public ArrayList f2953K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public ArrayList f2954L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public E f2955M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public c.C0071c f2956N;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2959b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AbstractC0616d f2963f;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public r f2980w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public AbstractComponentCallbacksC0497o f2981x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public AbstractComponentCallbacksC0497o f2982y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f2958a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final I f2960c = new I();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f2961d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v f2962e = new v(this);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C0483a f2964g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2965h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AbstractC0615c f2966i = new a(false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicInteger f2967j = new AtomicInteger();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Map f2968k = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map f2969l = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Map f2970m = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f2971n = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final w f2972o = new w(this);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CopyOnWriteArrayList f2973p = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final B.a f2974q = new B.a() { // from class: R.x
        @Override // B.a
        public final void accept(Object obj) {
            B.d(this.f3311a, (Configuration) obj);
        }
    };

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final B.a f2975r = new B.a() { // from class: R.y
        @Override // B.a
        public final void accept(Object obj) {
            B.a(this.f3312a, (Integer) obj);
        }
    };

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final B.a f2976s = new B.a() { // from class: R.z
        @Override // B.a
        public final void accept(Object obj) {
            B b4 = this.f3313a;
            i.d.a(obj);
            B.c(b4, null);
        }
    };

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final B.a f2977t = new B.a() { // from class: R.A
        @Override // B.a
        public final void accept(Object obj) {
            B b4 = this.f2941a;
            i.d.a(obj);
            B.b(b4, null);
        }
    };

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final InterfaceC0229l f2978u = new b();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f2979v = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public AbstractC0501t f2983z = null;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public AbstractC0501t f2943A = new c();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public T f2944B = null;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public T f2945C = new d();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ArrayDeque f2946D = new ArrayDeque();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public Runnable f2957O = new e();

    public class a extends AbstractC0615c {
        public a(boolean z3) {
            super(z3);
        }
    }

    public class b implements InterfaceC0229l {
        public b() {
        }
    }

    public class c extends AbstractC0501t {
        public c() {
        }

        @Override // R.AbstractC0501t
        public AbstractComponentCallbacksC0497o a(ClassLoader classLoader, String str) {
            B.this.b0();
            B.this.b0();
            throw null;
        }
    }

    public class d implements T {
        public d() {
        }

        @Override // R.T
        public S a(ViewGroup viewGroup) {
            return new C0488f(viewGroup);
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            B.this.K(true);
        }
    }

    public class f implements F {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractComponentCallbacksC0497o f2989a;

        public f(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o) {
            this.f2989a = abstractComponentCallbacksC0497o;
        }
    }

    public static class g implements Parcelable {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public String f2991m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f2992n;

        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i4) {
                return new g[i4];
            }
        }

        public g(Parcel parcel) {
            this.f2991m = parcel.readString();
            this.f2992n = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            parcel.writeString(this.f2991m);
            parcel.writeInt(this.f2992n);
        }
    }

    public interface h {
        boolean a(ArrayList arrayList, ArrayList arrayList2);
    }

    public static int C0(int i4) {
        if (i4 == 4097) {
            return 8194;
        }
        if (i4 == 8194) {
            return 4097;
        }
        if (i4 == 8197) {
            return 4100;
        }
        if (i4 != 4099) {
            return i4 != 4100 ? 0 : 8197;
        }
        return 4099;
    }

    public static void M(ArrayList arrayList, ArrayList arrayList2, int i4, int i5) {
        while (i4 < i5) {
            C0483a c0483a = (C0483a) arrayList.get(i4);
            if (((Boolean) arrayList2.get(i4)).booleanValue()) {
                c0483a.i(-1);
                c0483a.l();
            } else {
                c0483a.i(1);
                c0483a.k();
            }
            i4++;
        }
    }

    public static B R(View view) {
        AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497oS = S(view);
        if (abstractComponentCallbacksC0497oS == null) {
            for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            }
            throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
        }
        if (abstractComponentCallbacksC0497oS.Y()) {
            return abstractComponentCallbacksC0497oS.p();
        }
        throw new IllegalStateException("The Fragment " + abstractComponentCallbacksC0497oS + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
    }

    public static AbstractComponentCallbacksC0497o S(View view) {
        while (view != null) {
            AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497oH0 = h0(view);
            if (abstractComponentCallbacksC0497oH0 != null) {
                return abstractComponentCallbacksC0497oH0;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    public static /* synthetic */ void a(B b4, Integer num) {
        if (b4.o0() && num.intValue() == 80) {
            b4.x(false);
        }
    }

    public static /* synthetic */ void b(B b4, AbstractC1522i abstractC1522i) {
        if (b4.o0()) {
            throw null;
        }
    }

    public static /* synthetic */ void c(B b4, AbstractC1516c abstractC1516c) {
        if (b4.o0()) {
            throw null;
        }
    }

    public static /* synthetic */ void d(B b4, Configuration configuration) {
        if (b4.o0()) {
            b4.t(configuration, false);
        }
    }

    public static AbstractComponentCallbacksC0497o h0(View view) {
        Object tag = view.getTag(Q.b.f2909a);
        if (tag instanceof AbstractComponentCallbacksC0497o) {
            return (AbstractComponentCallbacksC0497o) tag;
        }
        return null;
    }

    public static boolean m0(int i4) {
        return f2942P || Log.isLoggable("FragmentManager", i4);
    }

    public void A() {
        E(5);
    }

    public final void A0() {
        if (this.f2971n.size() <= 0) {
            return;
        }
        i.d.a(this.f2971n.get(0));
        throw null;
    }

    public void B() {
        K0();
        z(this.f2982y);
    }

    public void B0(Parcelable parcelable) {
        if (parcelable == null) {
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && bundle.getBundle(str) != null) {
                throw null;
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && bundle.getBundle(str2) != null) {
                throw null;
            }
        }
        this.f2960c.v(map);
        D d4 = (D) bundle.getParcelable("state");
        if (d4 == null) {
            return;
        }
        this.f2960c.t();
        Iterator it = d4.f2993m.iterator();
        while (it.hasNext()) {
            Bundle bundleZ = this.f2960c.z((String) it.next(), null);
            if (bundleZ != null) {
                AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497oH = this.f2955M.h(((G) bundleZ.getParcelable("state")).f3010n);
                abstractComponentCallbacksC0497oH.getClass();
                if (m0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC0497oH);
                }
                AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497oK = new H(this.f2972o, this.f2960c, abstractComponentCallbacksC0497oH, bundleZ).k();
                abstractComponentCallbacksC0497oK.f3248c = bundleZ;
                abstractComponentCallbacksC0497oK.f3267v = this;
                if (!m0(2)) {
                    throw null;
                }
                Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC0497oK.f3252g + "): " + abstractComponentCallbacksC0497oK);
                throw null;
            }
        }
        for (AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o : this.f2955M.j()) {
            if (!this.f2960c.c(abstractComponentCallbacksC0497o.f3252g)) {
                if (m0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC0497o + " that was not found in the set of active Fragments " + d4.f2993m);
                }
                this.f2955M.l(abstractComponentCallbacksC0497o);
                abstractComponentCallbacksC0497o.f3267v = this;
                H h4 = new H(this.f2972o, this.f2960c, abstractComponentCallbacksC0497o);
                h4.r(1);
                h4.m();
                abstractComponentCallbacksC0497o.f3259n = true;
                h4.m();
            }
        }
        this.f2960c.u(d4.f2994n);
        if (d4.f2995o != null) {
            this.f2961d = new ArrayList(d4.f2995o.length);
            int i4 = 0;
            while (true) {
                C0484b[] c0484bArr = d4.f2995o;
                if (i4 >= c0484bArr.length) {
                    break;
                }
                C0483a c0483aB = c0484bArr[i4].b(this);
                if (m0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i4 + " (index " + c0483aB.f3135v + "): " + c0483aB);
                    PrintWriter printWriter = new PrintWriter(new O("FragmentManager"));
                    c0483aB.j("  ", printWriter, false);
                    printWriter.close();
                }
                this.f2961d.add(c0483aB);
                i4++;
            }
        } else {
            this.f2961d = new ArrayList();
        }
        this.f2967j.set(d4.f2996p);
        String str3 = d4.f2997q;
        if (str3 != null) {
            AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497oO = O(str3);
            this.f2982y = abstractComponentCallbacksC0497oO;
            z(abstractComponentCallbacksC0497oO);
        }
        ArrayList arrayList = d4.f2998r;
        if (arrayList != null) {
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                this.f2968k.put((String) arrayList.get(i5), (C0485c) d4.f2999s.get(i5));
            }
        }
        this.f2946D = new ArrayDeque(d4.f3000t);
    }

    public void C() {
        this.f2948F = false;
        this.f2949G = false;
        this.f2955M.m(false);
        E(7);
    }

    public void D() {
        this.f2948F = false;
        this.f2949G = false;
        this.f2955M.m(false);
        E(5);
    }

    public Bundle D0() {
        C0484b[] c0484bArr;
        Bundle bundle = new Bundle();
        T();
        I();
        K(true);
        this.f2948F = true;
        this.f2955M.m(true);
        ArrayList arrayListW = this.f2960c.w();
        HashMap mapK = this.f2960c.k();
        if (!mapK.isEmpty()) {
            ArrayList arrayListX = this.f2960c.x();
            int size = this.f2961d.size();
            if (size > 0) {
                c0484bArr = new C0484b[size];
                for (int i4 = 0; i4 < size; i4++) {
                    c0484bArr[i4] = new C0484b((C0483a) this.f2961d.get(i4));
                    if (m0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i4 + ": " + this.f2961d.get(i4));
                    }
                }
            } else {
                c0484bArr = null;
            }
            D d4 = new D();
            d4.f2993m = arrayListW;
            d4.f2994n = arrayListX;
            d4.f2995o = c0484bArr;
            d4.f2996p = this.f2967j.get();
            AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o = this.f2982y;
            if (abstractComponentCallbacksC0497o != null) {
                d4.f2997q = abstractComponentCallbacksC0497o.f3252g;
            }
            d4.f2998r.addAll(this.f2968k.keySet());
            d4.f2999s.addAll(this.f2968k.values());
            d4.f3000t = new ArrayList(this.f2946D);
            bundle.putParcelable("state", d4);
            for (String str : this.f2969l.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.f2969l.get(str));
            }
            for (String str2 : mapK.keySet()) {
                bundle.putBundle("fragment_" + str2, (Bundle) mapK.get(str2));
            }
        } else if (m0(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    public final void E(int i4) {
        try {
            this.f2959b = true;
            this.f2960c.d(i4);
            t0(i4, false);
            Iterator it = o().iterator();
            while (it.hasNext()) {
                ((S) it.next()).p();
            }
            this.f2959b = false;
            K(true);
        } catch (Throwable th) {
            this.f2959b = false;
            throw th;
        }
    }

    public void E0(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o, boolean z3) {
        ViewGroup viewGroupZ = Z(abstractComponentCallbacksC0497o);
        if (viewGroupZ == null || !(viewGroupZ instanceof C0500s)) {
            return;
        }
        ((C0500s) viewGroupZ).setDrawDisappearingViewsLast(!z3);
    }

    public void F() {
        this.f2949G = true;
        this.f2955M.m(true);
        E(4);
    }

    public void F0(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o, AbstractC0609f.b bVar) {
        if (abstractComponentCallbacksC0497o.equals(O(abstractComponentCallbacksC0497o.f3252g))) {
            abstractComponentCallbacksC0497o.f3237S = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0497o + " is not an active fragment of FragmentManager " + this);
    }

    public void G() {
        E(2);
    }

    public void G0(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o) {
        if (abstractComponentCallbacksC0497o == null || abstractComponentCallbacksC0497o.equals(O(abstractComponentCallbacksC0497o.f3252g))) {
            AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o2 = this.f2982y;
            this.f2982y = abstractComponentCallbacksC0497o;
            z(abstractComponentCallbacksC0497o2);
            z(this.f2982y);
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0497o + " is not an active fragment of FragmentManager " + this);
    }

    public final void H() {
        if (this.f2951I) {
            this.f2951I = false;
            J0();
        }
    }

    public final void H0(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o) {
        ViewGroup viewGroupZ = Z(abstractComponentCallbacksC0497o);
        if (viewGroupZ == null || abstractComponentCallbacksC0497o.r() + abstractComponentCallbacksC0497o.u() + abstractComponentCallbacksC0497o.F() + abstractComponentCallbacksC0497o.G() <= 0) {
            return;
        }
        if (viewGroupZ.getTag(Q.b.f2911c) == null) {
            viewGroupZ.setTag(Q.b.f2911c, abstractComponentCallbacksC0497o);
        }
        ((AbstractComponentCallbacksC0497o) viewGroupZ.getTag(Q.b.f2911c)).c1(abstractComponentCallbacksC0497o.E());
    }

    public final void I() {
        Iterator it = o().iterator();
        while (it.hasNext()) {
            ((S) it.next()).p();
        }
    }

    public void I0(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o) {
        if (m0(2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC0497o);
        }
        if (abstractComponentCallbacksC0497o.f3220B) {
            abstractComponentCallbacksC0497o.f3220B = false;
            abstractComponentCallbacksC0497o.f3233O = !abstractComponentCallbacksC0497o.f3233O;
        }
    }

    public final void J(boolean z3) {
        if (this.f2959b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (!this.f2950H) {
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        }
        throw new IllegalStateException("FragmentManager has been destroyed");
    }

    public final void J0() {
        Iterator it = this.f2960c.i().iterator();
        while (it.hasNext()) {
            w0((H) it.next());
        }
    }

    public boolean K(boolean z3) {
        J(z3);
        boolean z4 = false;
        while (V(this.f2952J, this.f2953K)) {
            z4 = true;
            this.f2959b = true;
            try {
                y0(this.f2952J, this.f2953K);
            } finally {
                m();
            }
        }
        K0();
        H();
        this.f2960c.b();
        return z4;
    }

    public final void K0() {
        synchronized (this.f2958a) {
            try {
                if (!this.f2958a.isEmpty()) {
                    this.f2966i.b(true);
                    if (m0(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z3 = W() > 0 && q0(this.f2981x);
                if (m0(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z3);
                }
                this.f2966i.b(z3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void L(h hVar, boolean z3) {
        if (z3) {
            return;
        }
        J(z3);
        if (hVar.a(this.f2952J, this.f2953K)) {
            this.f2959b = true;
            try {
                y0(this.f2952J, this.f2953K);
            } finally {
                m();
            }
        }
        K0();
        H();
        this.f2960c.b();
    }

    public final void N(ArrayList arrayList, ArrayList arrayList2, int i4, int i5) {
        boolean z3 = ((C0483a) arrayList.get(i4)).f3052r;
        ArrayList arrayList3 = this.f2954L;
        if (arrayList3 == null) {
            this.f2954L = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.f2954L.addAll(this.f2960c.m());
        AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497oE0 = e0();
        boolean z4 = false;
        for (int i6 = i4; i6 < i5; i6++) {
            C0483a c0483a = (C0483a) arrayList.get(i6);
            abstractComponentCallbacksC0497oE0 = !((Boolean) arrayList2.get(i6)).booleanValue() ? c0483a.m(this.f2954L, abstractComponentCallbacksC0497oE0) : c0483a.o(this.f2954L, abstractComponentCallbacksC0497oE0);
            z4 = z4 || c0483a.f3043i;
        }
        this.f2954L.clear();
        if (!z3 && this.f2979v >= 1) {
            for (int i7 = i4; i7 < i5; i7++) {
                Iterator it = ((C0483a) arrayList.get(i7)).f3037c.iterator();
                while (it.hasNext()) {
                    AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o = ((J.a) it.next()).f3055b;
                    if (abstractComponentCallbacksC0497o != null && abstractComponentCallbacksC0497o.f3267v != null) {
                        this.f2960c.p(q(abstractComponentCallbacksC0497o));
                    }
                }
            }
        }
        M(arrayList, arrayList2, i4, i5);
        boolean zBooleanValue = ((Boolean) arrayList2.get(i5 - 1)).booleanValue();
        if (z4 && !this.f2971n.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(U((C0483a) it2.next()));
            }
            if (this.f2964g == null) {
                Iterator it3 = this.f2971n.iterator();
                while (it3.hasNext()) {
                    i.d.a(it3.next());
                    Iterator it4 = linkedHashSet.iterator();
                    if (it4.hasNext()) {
                        throw null;
                    }
                }
                Iterator it5 = this.f2971n.iterator();
                while (it5.hasNext()) {
                    i.d.a(it5.next());
                    Iterator it6 = linkedHashSet.iterator();
                    if (it6.hasNext()) {
                        throw null;
                    }
                }
            }
        }
        for (int i8 = i4; i8 < i5; i8++) {
            C0483a c0483a2 = (C0483a) arrayList.get(i8);
            if (zBooleanValue) {
                for (int size = c0483a2.f3037c.size() - 1; size >= 0; size--) {
                    AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o2 = ((J.a) c0483a2.f3037c.get(size)).f3055b;
                    if (abstractComponentCallbacksC0497o2 != null) {
                        q(abstractComponentCallbacksC0497o2).m();
                    }
                }
            } else {
                Iterator it7 = c0483a2.f3037c.iterator();
                while (it7.hasNext()) {
                    AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o3 = ((J.a) it7.next()).f3055b;
                    if (abstractComponentCallbacksC0497o3 != null) {
                        q(abstractComponentCallbacksC0497o3).m();
                    }
                }
            }
        }
        t0(this.f2979v, true);
        for (S s4 : p(arrayList, i4, i5)) {
            s4.y(zBooleanValue);
            s4.v();
            s4.m();
        }
        while (i4 < i5) {
            C0483a c0483a3 = (C0483a) arrayList.get(i4);
            if (((Boolean) arrayList2.get(i4)).booleanValue() && c0483a3.f3135v >= 0) {
                c0483a3.f3135v = -1;
            }
            c0483a3.n();
            i4++;
        }
        if (z4) {
            A0();
        }
    }

    public AbstractComponentCallbacksC0497o O(String str) {
        return this.f2960c.e(str);
    }

    public AbstractComponentCallbacksC0497o P(int i4) {
        return this.f2960c.f(i4);
    }

    public AbstractComponentCallbacksC0497o Q(String str) {
        return this.f2960c.g(str);
    }

    public final void T() {
        Iterator it = o().iterator();
        while (it.hasNext()) {
            ((S) it.next()).q();
        }
    }

    public Set U(C0483a c0483a) {
        HashSet hashSet = new HashSet();
        for (int i4 = 0; i4 < c0483a.f3037c.size(); i4++) {
            AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o = ((J.a) c0483a.f3037c.get(i4)).f3055b;
            if (abstractComponentCallbacksC0497o != null && c0483a.f3043i) {
                hashSet.add(abstractComponentCallbacksC0497o);
            }
        }
        return hashSet;
    }

    public final boolean V(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (this.f2958a) {
            if (!this.f2958a.isEmpty()) {
                int size = this.f2958a.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((h) this.f2958a.get(i4)).a(arrayList, arrayList2);
                }
                this.f2958a.clear();
                throw null;
            }
        }
        return false;
    }

    public int W() {
        return this.f2961d.size() + (this.f2964g != null ? 1 : 0);
    }

    public final E X(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o) {
        return this.f2955M.i(abstractComponentCallbacksC0497o);
    }

    public r Y() {
        return this.f2980w;
    }

    public final ViewGroup Z(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o) {
        ViewGroup viewGroup = abstractComponentCallbacksC0497o.f3227I;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC0497o.f3271z > 0 && this.f2980w.b()) {
            View viewA = this.f2980w.a(abstractComponentCallbacksC0497o.f3271z);
            if (viewA instanceof ViewGroup) {
                return (ViewGroup) viewA;
            }
        }
        return null;
    }

    public AbstractC0501t a0() {
        AbstractC0501t abstractC0501t = this.f2983z;
        if (abstractC0501t != null) {
            return abstractC0501t;
        }
        AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o = this.f2981x;
        return abstractComponentCallbacksC0497o != null ? abstractComponentCallbacksC0497o.f3267v.a0() : this.f2943A;
    }

    public AbstractC0502u b0() {
        return null;
    }

    public w c0() {
        return this.f2972o;
    }

    public AbstractComponentCallbacksC0497o d0() {
        return this.f2981x;
    }

    public void e(C0483a c0483a) {
        this.f2961d.add(c0483a);
    }

    public AbstractComponentCallbacksC0497o e0() {
        return this.f2982y;
    }

    public H f(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o) {
        String str = abstractComponentCallbacksC0497o.f3236R;
        if (str != null) {
            S.c.f(abstractComponentCallbacksC0497o, str);
        }
        if (m0(2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC0497o);
        }
        H hQ = q(abstractComponentCallbacksC0497o);
        abstractComponentCallbacksC0497o.f3267v = this;
        this.f2960c.p(hQ);
        if (!abstractComponentCallbacksC0497o.f3221C) {
            this.f2960c.a(abstractComponentCallbacksC0497o);
            abstractComponentCallbacksC0497o.f3259n = false;
            if (abstractComponentCallbacksC0497o.f3228J == null) {
                abstractComponentCallbacksC0497o.f3233O = false;
            }
            if (n0(abstractComponentCallbacksC0497o)) {
                this.f2947E = true;
            }
        }
        return hQ;
    }

    public T f0() {
        T t4 = this.f2944B;
        if (t4 != null) {
            return t4;
        }
        AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o = this.f2981x;
        return abstractComponentCallbacksC0497o != null ? abstractComponentCallbacksC0497o.f3267v.f0() : this.f2945C;
    }

    public void g(F f4) {
        this.f2973p.add(f4);
    }

    public c.C0071c g0() {
        return this.f2956N;
    }

    public void h(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o) {
        this.f2955M.d(abstractComponentCallbacksC0497o);
    }

    public void i(AbstractC0502u abstractC0502u, r rVar, AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o) {
        this.f2980w = rVar;
        this.f2981x = abstractComponentCallbacksC0497o;
        if (abstractComponentCallbacksC0497o != null) {
            g(new f(abstractComponentCallbacksC0497o));
        }
        if (this.f2981x != null) {
            K0();
        }
        if (abstractComponentCallbacksC0497o != null) {
            this.f2955M = abstractComponentCallbacksC0497o.f3267v.X(abstractComponentCallbacksC0497o);
        } else {
            this.f2955M = new E(false);
        }
        this.f2955M.m(s0());
        this.f2960c.y(this.f2955M);
    }

    public androidx.lifecycle.E i0(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o) {
        return this.f2955M.k(abstractComponentCallbacksC0497o);
    }

    public void j(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o) {
        if (m0(2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC0497o);
        }
        if (abstractComponentCallbacksC0497o.f3221C) {
            abstractComponentCallbacksC0497o.f3221C = false;
            if (abstractComponentCallbacksC0497o.f3258m) {
                return;
            }
            this.f2960c.a(abstractComponentCallbacksC0497o);
            if (m0(2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC0497o);
            }
            if (n0(abstractComponentCallbacksC0497o)) {
                this.f2947E = true;
            }
        }
    }

    public void j0(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o) {
        if (m0(2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC0497o);
        }
        if (abstractComponentCallbacksC0497o.f3220B) {
            return;
        }
        abstractComponentCallbacksC0497o.f3220B = true;
        abstractComponentCallbacksC0497o.f3233O = true ^ abstractComponentCallbacksC0497o.f3233O;
        H0(abstractComponentCallbacksC0497o);
    }

    public J k() {
        return new C0483a(this);
    }

    public void k0(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o) {
        if (abstractComponentCallbacksC0497o.f3258m && n0(abstractComponentCallbacksC0497o)) {
            this.f2947E = true;
        }
    }

    public boolean l() {
        boolean zN0 = false;
        for (AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o : this.f2960c.j()) {
            if (abstractComponentCallbacksC0497o != null) {
                zN0 = n0(abstractComponentCallbacksC0497o);
            }
            if (zN0) {
                return true;
            }
        }
        return false;
    }

    public boolean l0() {
        return this.f2950H;
    }

    public final void m() {
        this.f2959b = false;
        this.f2953K.clear();
        this.f2952J.clear();
    }

    public final void n() {
        throw null;
    }

    public final boolean n0(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o) {
        return (abstractComponentCallbacksC0497o.f3224F && abstractComponentCallbacksC0497o.f3225G) || abstractComponentCallbacksC0497o.f3268w.l();
    }

    public final Set o() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f2960c.i().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((H) it.next()).k().f3227I;
            if (viewGroup != null) {
                hashSet.add(S.u(viewGroup, f0()));
            }
        }
        return hashSet;
    }

    public final boolean o0() {
        AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o = this.f2981x;
        if (abstractComponentCallbacksC0497o == null) {
            return true;
        }
        return abstractComponentCallbacksC0497o.Y() && this.f2981x.D().o0();
    }

    public Set p(ArrayList arrayList, int i4, int i5) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i4 < i5) {
            Iterator it = ((C0483a) arrayList.get(i4)).f3037c.iterator();
            while (it.hasNext()) {
                AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o = ((J.a) it.next()).f3055b;
                if (abstractComponentCallbacksC0497o != null && (viewGroup = abstractComponentCallbacksC0497o.f3227I) != null) {
                    hashSet.add(S.t(viewGroup, this));
                }
            }
            i4++;
        }
        return hashSet;
    }

    public boolean p0(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o) {
        if (abstractComponentCallbacksC0497o == null) {
            return false;
        }
        return abstractComponentCallbacksC0497o.a0();
    }

    public H q(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o) {
        H hL = this.f2960c.l(abstractComponentCallbacksC0497o.f3252g);
        if (hL != null) {
            return hL;
        }
        new H(this.f2972o, this.f2960c, abstractComponentCallbacksC0497o);
        throw null;
    }

    public boolean q0(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o) {
        if (abstractComponentCallbacksC0497o == null) {
            return true;
        }
        B b4 = abstractComponentCallbacksC0497o.f3267v;
        return abstractComponentCallbacksC0497o.equals(b4.e0()) && q0(b4.f2981x);
    }

    public void r(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o) {
        if (m0(2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC0497o);
        }
        if (abstractComponentCallbacksC0497o.f3221C) {
            return;
        }
        abstractComponentCallbacksC0497o.f3221C = true;
        if (abstractComponentCallbacksC0497o.f3258m) {
            if (m0(2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC0497o);
            }
            this.f2960c.s(abstractComponentCallbacksC0497o);
            if (n0(abstractComponentCallbacksC0497o)) {
                this.f2947E = true;
            }
            H0(abstractComponentCallbacksC0497o);
        }
    }

    public boolean r0(int i4) {
        return this.f2979v >= i4;
    }

    public void s() {
        this.f2948F = false;
        this.f2949G = false;
        this.f2955M.m(false);
        E(4);
    }

    public boolean s0() {
        return this.f2948F || this.f2949G;
    }

    public void t(Configuration configuration, boolean z3) {
        for (AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o : this.f2960c.m()) {
            if (abstractComponentCallbacksC0497o != null) {
                abstractComponentCallbacksC0497o.B0(configuration);
                if (z3) {
                    abstractComponentCallbacksC0497o.f3268w.t(configuration, true);
                }
            }
        }
    }

    public void t0(int i4, boolean z3) {
        if (i4 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z3 || i4 != this.f2979v) {
            this.f2979v = i4;
            this.f2960c.r();
            J0();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o = this.f2981x;
        if (abstractComponentCallbacksC0497o != null) {
            sb.append(abstractComponentCallbacksC0497o.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f2981x)));
            sb.append("}");
        } else {
            sb.append("null");
        }
        sb.append("}}");
        return sb.toString();
    }

    public void u() {
        this.f2948F = false;
        this.f2949G = false;
        this.f2955M.m(false);
        E(1);
    }

    public void v() {
        this.f2950H = true;
        K(true);
        I();
        n();
        E(-1);
        this.f2980w = null;
        this.f2981x = null;
    }

    public void v0(C0500s c0500s) {
        View view;
        for (H h4 : this.f2960c.i()) {
            AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497oK = h4.k();
            if (abstractComponentCallbacksC0497oK.f3271z == c0500s.getId() && (view = abstractComponentCallbacksC0497oK.f3228J) != null && view.getParent() == null) {
                abstractComponentCallbacksC0497oK.f3227I = c0500s;
                h4.b();
            }
        }
    }

    public void w() {
        E(1);
    }

    public void w0(H h4) {
        AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497oK = h4.k();
        if (abstractComponentCallbacksC0497oK.f3229K) {
            if (this.f2959b) {
                this.f2951I = true;
            } else {
                abstractComponentCallbacksC0497oK.f3229K = false;
                h4.m();
            }
        }
    }

    public void x(boolean z3) {
        for (AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o : this.f2960c.m()) {
            if (abstractComponentCallbacksC0497o != null) {
                abstractComponentCallbacksC0497o.H0();
                if (z3) {
                    abstractComponentCallbacksC0497o.f3268w.x(true);
                }
            }
        }
    }

    public void x0(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o) {
        if (m0(2)) {
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC0497o + " nesting=" + abstractComponentCallbacksC0497o.f3266u);
        }
        boolean zB0 = abstractComponentCallbacksC0497o.b0();
        if (abstractComponentCallbacksC0497o.f3221C && zB0) {
            return;
        }
        this.f2960c.s(abstractComponentCallbacksC0497o);
        if (n0(abstractComponentCallbacksC0497o)) {
            this.f2947E = true;
        }
        abstractComponentCallbacksC0497o.f3259n = true;
        H0(abstractComponentCallbacksC0497o);
    }

    public void y() {
        for (AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o : this.f2960c.j()) {
            if (abstractComponentCallbacksC0497o != null) {
                abstractComponentCallbacksC0497o.p0(abstractComponentCallbacksC0497o.a0());
                abstractComponentCallbacksC0497o.f3268w.y();
            }
        }
    }

    public final void y0(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            if (!((C0483a) arrayList.get(i4)).f3052r) {
                if (i5 != i4) {
                    N(arrayList, arrayList2, i5, i4);
                }
                i5 = i4 + 1;
                if (((Boolean) arrayList2.get(i4)).booleanValue()) {
                    while (i5 < size && ((Boolean) arrayList2.get(i5)).booleanValue() && !((C0483a) arrayList.get(i5)).f3052r) {
                        i5++;
                    }
                }
                N(arrayList, arrayList2, i4, i5);
                i4 = i5 - 1;
            }
            i4++;
        }
        if (i5 != size) {
            N(arrayList, arrayList2, i5, size);
        }
    }

    public final void z(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o) {
        if (abstractComponentCallbacksC0497o == null || !abstractComponentCallbacksC0497o.equals(O(abstractComponentCallbacksC0497o.f3252g))) {
            return;
        }
        abstractComponentCallbacksC0497o.J0();
    }

    public void z0(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o) {
        this.f2955M.l(abstractComponentCallbacksC0497o);
    }

    public void u0() {
    }
}
