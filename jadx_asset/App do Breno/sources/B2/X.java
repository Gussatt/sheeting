package B2;

import B2.InterfaceC0216y;
import K2.j;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import n1.AbstractC1445l;
import n1.AbstractC1448o;
import n1.C1446m;
import n1.InterfaceC1439f;
import r1.C1509f;
import s2.InterfaceC1536a;
import w2.C1617j;
import w2.InterfaceC1609b;

/* JADX INFO: loaded from: classes.dex */
public final class X implements FlutterFirebasePlugin, InterfaceC1536a, InterfaceC0216y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public FirebaseAnalytics f286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1617j f287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InterfaceC1609b f288e;

    public static final void K(C1446m c1446m) {
        try {
            c1446m.c(null);
        } catch (Exception e4) {
            c1446m.b(e4);
        }
    }

    public static final void L(X x3, W2.l lVar, AbstractC1445l abstractC1445l) {
        X2.l.e(abstractC1445l, "task");
        x3.i0(abstractC1445l, lVar);
    }

    public static final void M(C1446m c1446m) {
        try {
            c1446m.c(new HashMap());
        } catch (Exception e4) {
            c1446m.b(e4);
        }
    }

    public static final void N(X x3, W2.l lVar, AbstractC1445l abstractC1445l) {
        X2.l.e(abstractC1445l, "task");
        x3.i0(abstractC1445l, lVar);
    }

    public static final void P(C1446m c1446m, X x3) {
        try {
            FirebaseAnalytics firebaseAnalytics = x3.f286c;
            if (firebaseAnalytics == null) {
                X2.l.o("analytics");
                firebaseAnalytics = null;
            }
            c1446m.c(AbstractC1448o.a(firebaseAnalytics.a()));
        } catch (Exception e4) {
            c1446m.b(e4);
        }
    }

    public static final void R(C1446m c1446m, X x3) {
        try {
            FirebaseAnalytics firebaseAnalytics = x3.f286c;
            if (firebaseAnalytics == null) {
                X2.l.o("analytics");
                firebaseAnalytics = null;
            }
            c1446m.c(AbstractC1448o.a(firebaseAnalytics.b()));
        } catch (Exception e4) {
            c1446m.b(e4);
        }
    }

    public static final void T(Map map, X x3, C1446m c1446m) {
        try {
            Object obj = map.get("eventName");
            Objects.requireNonNull(obj);
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj;
            Bundle bundleJ = x3.J((Map) map.get("parameters"));
            FirebaseAnalytics firebaseAnalytics = x3.f286c;
            if (firebaseAnalytics == null) {
                X2.l.o("analytics");
                firebaseAnalytics = null;
            }
            firebaseAnalytics.c(str, bundleJ);
            c1446m.c(null);
        } catch (Exception e4) {
            c1446m.b(e4);
        }
    }

    public static final void V(X x3, C1446m c1446m) {
        try {
            FirebaseAnalytics firebaseAnalytics = x3.f286c;
            if (firebaseAnalytics == null) {
                X2.l.o("analytics");
                firebaseAnalytics = null;
            }
            firebaseAnalytics.d();
            c1446m.c(null);
        } catch (Exception e4) {
            c1446m.b(e4);
        }
    }

    public static final void X(X x3, boolean z3, C1446m c1446m) {
        try {
            FirebaseAnalytics firebaseAnalytics = x3.f286c;
            if (firebaseAnalytics == null) {
                X2.l.o("analytics");
                firebaseAnalytics = null;
            }
            firebaseAnalytics.e(z3);
            c1446m.c(null);
        } catch (Exception e4) {
            c1446m.b(e4);
        }
    }

    public static final void Z(Map map, X x3, C1446m c1446m) {
        try {
            Boolean bool = (Boolean) map.get("adStorageConsentGranted");
            Boolean bool2 = (Boolean) map.get("analyticsStorageConsentGranted");
            Boolean bool3 = (Boolean) map.get("adPersonalizationSignalsConsentGranted");
            Boolean bool4 = (Boolean) map.get("adUserDataConsentGranted");
            HashMap map2 = new HashMap();
            if (bool != null) {
                map2.put(FirebaseAnalytics.b.AD_STORAGE, bool.booleanValue() ? FirebaseAnalytics.a.GRANTED : FirebaseAnalytics.a.DENIED);
            }
            if (bool2 != null) {
                map2.put(FirebaseAnalytics.b.ANALYTICS_STORAGE, bool2.booleanValue() ? FirebaseAnalytics.a.GRANTED : FirebaseAnalytics.a.DENIED);
            }
            if (bool3 != null) {
                map2.put(FirebaseAnalytics.b.AD_PERSONALIZATION, bool3.booleanValue() ? FirebaseAnalytics.a.GRANTED : FirebaseAnalytics.a.DENIED);
            }
            if (bool4 != null) {
                map2.put(FirebaseAnalytics.b.AD_USER_DATA, bool4.booleanValue() ? FirebaseAnalytics.a.GRANTED : FirebaseAnalytics.a.DENIED);
            }
            FirebaseAnalytics firebaseAnalytics = x3.f286c;
            if (firebaseAnalytics == null) {
                X2.l.o("analytics");
                firebaseAnalytics = null;
            }
            firebaseAnalytics.f(map2);
            c1446m.c(null);
        } catch (Exception e4) {
            c1446m.b(e4);
        }
    }

    public static final void b0(X x3, Map map, C1446m c1446m) {
        try {
            FirebaseAnalytics firebaseAnalytics = x3.f286c;
            if (firebaseAnalytics == null) {
                X2.l.o("analytics");
                firebaseAnalytics = null;
            }
            firebaseAnalytics.g(x3.J(map));
            c1446m.c(null);
        } catch (Exception e4) {
            c1446m.b(e4);
        }
    }

    public static final void d0(X x3, long j4, C1446m c1446m) {
        try {
            FirebaseAnalytics firebaseAnalytics = x3.f286c;
            if (firebaseAnalytics == null) {
                X2.l.o("analytics");
                firebaseAnalytics = null;
            }
            firebaseAnalytics.h(j4);
            c1446m.c(null);
        } catch (Exception e4) {
            c1446m.b(e4);
        }
    }

    public static final void f0(X x3, String str, C1446m c1446m) {
        try {
            FirebaseAnalytics firebaseAnalytics = x3.f286c;
            if (firebaseAnalytics == null) {
                X2.l.o("analytics");
                firebaseAnalytics = null;
            }
            firebaseAnalytics.i(str);
            c1446m.c(null);
        } catch (Exception e4) {
            c1446m.b(e4);
        }
    }

    public static final void h0(X x3, String str, String str2, C1446m c1446m) {
        try {
            FirebaseAnalytics firebaseAnalytics = x3.f286c;
            if (firebaseAnalytics == null) {
                X2.l.o("analytics");
                firebaseAnalytics = null;
            }
            firebaseAnalytics.j(str, str2);
            c1446m.c(null);
        } catch (Exception e4) {
            c1446m.b(e4);
        }
    }

    public static final void l0(X x3, W2.l lVar, AbstractC1445l abstractC1445l) {
        X2.l.e(abstractC1445l, "task");
        x3.j0(abstractC1445l, lVar);
    }

    public static final void m0(X x3, W2.l lVar, AbstractC1445l abstractC1445l) {
        X2.l.e(abstractC1445l, "task");
        x3.j0(abstractC1445l, lVar);
    }

    public static final void n0(X x3, W2.l lVar, AbstractC1445l abstractC1445l) {
        X2.l.e(abstractC1445l, "task");
        x3.j0(abstractC1445l, lVar);
    }

    public static final void o0(X x3, W2.l lVar, AbstractC1445l abstractC1445l) {
        X2.l.e(abstractC1445l, "task");
        x3.j0(abstractC1445l, lVar);
    }

    public static final void p0(X x3, W2.l lVar, AbstractC1445l abstractC1445l) {
        X2.l.e(abstractC1445l, "task");
        x3.j0(abstractC1445l, lVar);
    }

    public static final void q0(X x3, W2.l lVar, AbstractC1445l abstractC1445l) {
        X2.l.e(abstractC1445l, "task");
        x3.j0(abstractC1445l, lVar);
    }

    public static final void r0(X x3, W2.l lVar, AbstractC1445l abstractC1445l) {
        X2.l.e(abstractC1445l, "task");
        x3.j0(abstractC1445l, lVar);
    }

    public static final void s0(X x3, W2.l lVar, AbstractC1445l abstractC1445l) {
        X2.l.e(abstractC1445l, "task");
        x3.j0(abstractC1445l, lVar);
    }

    public final Bundle J(Map map) {
        if (map == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                bundle.putString(str, (String) value);
            } else if (value instanceof Integer) {
                bundle.putLong(str, ((Number) value).intValue());
            } else if (value instanceof Long) {
                bundle.putLong(str, ((Number) value).longValue());
            } else if (value instanceof Double) {
                bundle.putDouble(str, ((Number) value).doubleValue());
            } else if (value instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) value).booleanValue());
            } else if (value == null) {
                bundle.putString(str, null);
            } else if (value instanceof Iterable) {
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (Object obj : (Iterable) value) {
                    if (obj instanceof Map) {
                        arrayList.add(J((Map) obj));
                    } else if (obj != null) {
                        throw new IllegalArgumentException("Unsupported value type: " + obj.getClass().getCanonicalName() + " in list at key " + str);
                    }
                }
                bundle.putParcelableArrayList(str, arrayList);
            } else {
                if (!(value instanceof Map)) {
                    throw new IllegalArgumentException("Unsupported value type: " + value.getClass().getCanonicalName());
                }
                bundle.putParcelable(str, J((Map) value));
            }
        }
        return bundle;
    }

    public final AbstractC1445l O() {
        final C1446m c1446m = new C1446m();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: B2.J
            @Override // java.lang.Runnable
            public final void run() {
                X.P(c1446m, this);
            }
        });
        AbstractC1445l abstractC1445lA = c1446m.a();
        X2.l.d(abstractC1445lA, "getTask(...)");
        return abstractC1445lA;
    }

    public final AbstractC1445l Q() {
        final C1446m c1446m = new C1446m();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: B2.E
            @Override // java.lang.Runnable
            public final void run() {
                X.R(c1446m, this);
            }
        });
        AbstractC1445l abstractC1445lA = c1446m.a();
        X2.l.d(abstractC1445lA, "getTask(...)");
        return abstractC1445lA;
    }

    public final AbstractC1445l S(final Map map) {
        final C1446m c1446m = new C1446m();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: B2.I
            @Override // java.lang.Runnable
            public final void run() {
                X.T(map, this, c1446m);
            }
        });
        AbstractC1445l abstractC1445lA = c1446m.a();
        X2.l.d(abstractC1445lA, "getTask(...)");
        return abstractC1445lA;
    }

    public final AbstractC1445l U() {
        final C1446m c1446m = new C1446m();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: B2.M
            @Override // java.lang.Runnable
            public final void run() {
                X.V(this.f264m, c1446m);
            }
        });
        AbstractC1445l abstractC1445lA = c1446m.a();
        X2.l.d(abstractC1445lA, "getTask(...)");
        return abstractC1445lA;
    }

    public final AbstractC1445l W(final boolean z3) {
        final C1446m c1446m = new C1446m();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: B2.D
            @Override // java.lang.Runnable
            public final void run() {
                X.X(this.f241m, z3, c1446m);
            }
        });
        AbstractC1445l abstractC1445lA = c1446m.a();
        X2.l.d(abstractC1445lA, "getTask(...)");
        return abstractC1445lA;
    }

    public final AbstractC1445l Y(final Map map) {
        final C1446m c1446m = new C1446m();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: B2.H
            @Override // java.lang.Runnable
            public final void run() {
                X.Z(map, this, c1446m);
            }
        });
        AbstractC1445l abstractC1445lA = c1446m.a();
        X2.l.d(abstractC1445lA, "getTask(...)");
        return abstractC1445lA;
    }

    @Override // B2.InterfaceC0216y
    public void a(String str, final W2.l lVar) {
        X2.l.e(lVar, "callback");
        e0(str).c(new InterfaceC1439f() { // from class: B2.P
            @Override // n1.InterfaceC1439f
            public final void a(AbstractC1445l abstractC1445l) {
                X.r0(this.f272a, lVar, abstractC1445l);
            }
        });
    }

    public final AbstractC1445l a0(final Map map) {
        final C1446m c1446m = new C1446m();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: B2.G
            @Override // java.lang.Runnable
            public final void run() {
                X.b0(this.f249m, map, c1446m);
            }
        });
        AbstractC1445l abstractC1445lA = c1446m.a();
        X2.l.d(abstractC1445lA, "getTask(...)");
        return abstractC1445lA;
    }

    @Override // B2.InterfaceC0216y
    public void b(final W2.l lVar) {
        X2.l.e(lVar, "callback");
        U().c(new InterfaceC1439f() { // from class: B2.V
            @Override // n1.InterfaceC1439f
            public final void a(AbstractC1445l abstractC1445l) {
                X.m0(this.f282a, lVar, abstractC1445l);
            }
        });
    }

    @Override // s2.InterfaceC1536a
    public void c(InterfaceC1536a.b bVar) {
        X2.l.e(bVar, "binding");
        InterfaceC1609b interfaceC1609bB = bVar.b();
        X2.l.d(interfaceC1609bB, "getBinaryMessenger(...)");
        Context contextA = bVar.a();
        X2.l.d(contextA, "getApplicationContext(...)");
        k0(interfaceC1609bB, contextA);
    }

    public final AbstractC1445l c0(final long j4) {
        final C1446m c1446m = new C1446m();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: B2.K
            @Override // java.lang.Runnable
            public final void run() {
                X.d0(this.f260m, j4, c1446m);
            }
        });
        AbstractC1445l abstractC1445lA = c1446m.a();
        X2.l.d(abstractC1445lA, "getTask(...)");
        return abstractC1445lA;
    }

    @Override // B2.InterfaceC0216y
    public void d(final W2.l lVar) {
        X2.l.e(lVar, "callback");
        O().c(new InterfaceC1439f() { // from class: B2.S
            @Override // n1.InterfaceC1439f
            public final void a(AbstractC1445l abstractC1445l) {
                X.L(this.f276a, lVar, abstractC1445l);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public AbstractC1445l didReinitializeFirebaseCore() {
        final C1446m c1446m = new C1446m();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: B2.L
            @Override // java.lang.Runnable
            public final void run() {
                X.K(c1446m);
            }
        });
        AbstractC1445l abstractC1445lA = c1446m.a();
        X2.l.d(abstractC1445lA, "getTask(...)");
        return abstractC1445lA;
    }

    @Override // B2.InterfaceC0216y
    public void e(Map map, final W2.l lVar) {
        X2.l.e(map, "event");
        X2.l.e(lVar, "callback");
        S(map).c(new InterfaceC1439f() { // from class: B2.W
            @Override // n1.InterfaceC1439f
            public final void a(AbstractC1445l abstractC1445l) {
                X.l0(this.f284a, lVar, abstractC1445l);
            }
        });
    }

    public final AbstractC1445l e0(final String str) {
        final C1446m c1446m = new C1446m();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: B2.F
            @Override // java.lang.Runnable
            public final void run() {
                X.f0(this.f246m, str, c1446m);
            }
        });
        AbstractC1445l abstractC1445lA = c1446m.a();
        X2.l.d(abstractC1445lA, "getTask(...)");
        return abstractC1445lA;
    }

    @Override // B2.InterfaceC0216y
    public void f(Map map, final W2.l lVar) {
        X2.l.e(map, "consent");
        X2.l.e(lVar, "callback");
        Y(map).c(new InterfaceC1439f() { // from class: B2.T
            @Override // n1.InterfaceC1439f
            public final void a(AbstractC1445l abstractC1445l) {
                X.o0(this.f278a, lVar, abstractC1445l);
            }
        });
    }

    @Override // B2.InterfaceC0216y
    public void g(String str, String str2, final W2.l lVar) {
        X2.l.e(str, "name");
        X2.l.e(lVar, "callback");
        g0(str, str2).c(new InterfaceC1439f() { // from class: B2.B
            @Override // n1.InterfaceC1439f
            public final void a(AbstractC1445l abstractC1445l) {
                X.s0(this.f237a, lVar, abstractC1445l);
            }
        });
    }

    public final AbstractC1445l g0(final String str, final String str2) {
        final C1446m c1446m = new C1446m();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: B2.N
            @Override // java.lang.Runnable
            public final void run() {
                X.h0(this.f266m, str, str2, c1446m);
            }
        });
        AbstractC1445l abstractC1445lA = c1446m.a();
        X2.l.d(abstractC1445lA, "getTask(...)");
        return abstractC1445lA;
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public AbstractC1445l getPluginConstantsForFirebaseApp(C1509f c1509f) {
        final C1446m c1446m = new C1446m();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: B2.A
            @Override // java.lang.Runnable
            public final void run() {
                X.M(c1446m);
            }
        });
        AbstractC1445l abstractC1445lA = c1446m.a();
        X2.l.d(abstractC1445lA, "getTask(...)");
        return abstractC1445lA;
    }

    @Override // B2.InterfaceC0216y
    public void h(long j4, final W2.l lVar) {
        X2.l.e(lVar, "callback");
        c0(j4).c(new InterfaceC1439f() { // from class: B2.Q
            @Override // n1.InterfaceC1439f
            public final void a(AbstractC1445l abstractC1445l) {
                X.q0(this.f274a, lVar, abstractC1445l);
            }
        });
    }

    @Override // B2.InterfaceC0216y
    public void i(Map map, W2.l lVar) {
        X2.l.e(map, "arguments");
        X2.l.e(lVar, "callback");
        j.a aVar = K2.j.f2509n;
        lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0217z("unimplemented", "initiateOnDeviceConversionMeasurement is only available on iOS.", null)))));
    }

    public final void i0(AbstractC1445l abstractC1445l, W2.l lVar) {
        String message;
        if (abstractC1445l.m()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(abstractC1445l.j())));
            return;
        }
        Exception excI = abstractC1445l.i();
        if (excI == null || (message = excI.getMessage()) == null) {
            message = "An unknown error occurred";
        }
        j.a aVar2 = K2.j.f2509n;
        lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0217z("firebase_analytics", message, null)))));
    }

    @Override // B2.InterfaceC0216y
    public void j(boolean z3, final W2.l lVar) {
        X2.l.e(lVar, "callback");
        W(z3).c(new InterfaceC1439f() { // from class: B2.C
            @Override // n1.InterfaceC1439f
            public final void a(AbstractC1445l abstractC1445l) {
                X.n0(this.f239a, lVar, abstractC1445l);
            }
        });
    }

    public final void j0(AbstractC1445l abstractC1445l, W2.l lVar) {
        String message;
        if (abstractC1445l.m()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.p.f2516a)));
            return;
        }
        Exception excI = abstractC1445l.i();
        if (excI == null || (message = excI.getMessage()) == null) {
            message = "An unknown error occurred";
        }
        j.a aVar2 = K2.j.f2509n;
        lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0217z("firebase_analytics", message, null)))));
    }

    @Override // B2.InterfaceC0216y
    public void k(Map map, final W2.l lVar) {
        X2.l.e(lVar, "callback");
        a0(map).c(new InterfaceC1439f() { // from class: B2.U
            @Override // n1.InterfaceC1439f
            public final void a(AbstractC1445l abstractC1445l) {
                X.p0(this.f280a, lVar, abstractC1445l);
            }
        });
    }

    public final void k0(InterfaceC1609b interfaceC1609b, Context context) {
        this.f286c = FirebaseAnalytics.getInstance(context);
        this.f287d = new C1617j(interfaceC1609b, "plugins.flutter.io/firebase_analytics");
        InterfaceC0216y.a.A(InterfaceC0216y.f315a, interfaceC1609b, this, null, 4, null);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_analytics", this);
        this.f288e = interfaceC1609b;
    }

    @Override // B2.InterfaceC0216y
    public void l(final W2.l lVar) {
        X2.l.e(lVar, "callback");
        Q().c(new InterfaceC1439f() { // from class: B2.O
            @Override // n1.InterfaceC1439f
            public final void a(AbstractC1445l abstractC1445l) {
                X.N(this.f270a, lVar, abstractC1445l);
            }
        });
    }

    @Override // s2.InterfaceC1536a
    public void r(InterfaceC1536a.b bVar) {
        X2.l.e(bVar, "binding");
        C1617j c1617j = this.f287d;
        if (c1617j != null) {
            c1617j.e(null);
        }
        InterfaceC1609b interfaceC1609b = this.f288e;
        if (interfaceC1609b == null) {
            throw new IllegalStateException("Required value was null.");
        }
        InterfaceC0216y.a aVar = InterfaceC0216y.f315a;
        X2.l.b(interfaceC1609b);
        InterfaceC0216y.a.A(aVar, interfaceC1609b, null, null, 4, null);
        this.f287d = null;
        this.f288e = null;
    }
}
