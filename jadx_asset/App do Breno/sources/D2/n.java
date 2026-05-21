package D2;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import io.flutter.plugins.firebase.crashlytics.FirebaseCrashlyticsTestCrash;
import io.flutter.plugins.firebase.crashlytics.FlutterError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import n1.AbstractC1445l;
import n1.AbstractC1448o;
import n1.C1446m;
import n1.InterfaceC1439f;
import r1.C1509f;
import s2.InterfaceC1536a;
import w2.C1616i;
import w2.C1617j;
import w2.InterfaceC1609b;

/* JADX INFO: loaded from: classes.dex */
public class n implements FlutterFirebasePlugin, InterfaceC1536a, C1617j.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1617j f907c;

    public class a extends HashMap {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f908m;

        public a(boolean z3) {
            this.f908m = z3;
            put("unsentReports", Boolean.valueOf(z3));
        }
    }

    public class b extends HashMap {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f910m;

        public b(boolean z3) {
            this.f910m = z3;
            put("didCrashOnPreviousExecution", Boolean.valueOf(z3));
        }
    }

    public class c extends HashMap {
        public c() {
            put("isCrashlyticsCollectionEnabled", Boolean.valueOf(n.this.y(C1509f.o())));
        }
    }

    public class d extends HashMap {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C1509f f913m;

        public d(C1509f c1509f) {
            this.f913m = c1509f;
            if (c1509f.q().equals("[DEFAULT]")) {
                put("isCrashlyticsCollectionEnabled", Boolean.valueOf(n.this.y(C1509f.o())));
            }
        }
    }

    public static Boolean F(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
            }
        } catch (PackageManager.NameNotFoundException e4) {
            z1.g.f().e("Could not read data collection permission from manifest", e4);
        }
        return Boolean.TRUE;
    }

    public static /* synthetic */ void a(C1446m c1446m) {
        try {
            y1.h.e().i();
            c1446m.c(null);
        } catch (Exception e4) {
            c1446m.b(e4);
        }
    }

    public static /* synthetic */ void d(C1446m c1446m) {
        try {
            c1446m.c(null);
        } catch (Exception e4) {
            c1446m.b(e4);
        }
    }

    public static /* synthetic */ void e() {
        throw new FirebaseCrashlyticsTestCrash();
    }

    public static /* synthetic */ void h(Map map, C1446m c1446m) {
        try {
            Object obj = map.get("message");
            Objects.requireNonNull(obj);
            y1.h.e().g((String) obj);
            c1446m.c(null);
        } catch (Exception e4) {
            c1446m.b(e4);
        }
    }

    public static /* synthetic */ void j(C1617j.d dVar, AbstractC1445l abstractC1445l) {
        if (abstractC1445l.m()) {
            dVar.a(abstractC1445l.j());
        } else {
            Exception excI = abstractC1445l.i();
            dVar.b("firebase_crashlytics", excI != null ? excI.getMessage() : "An unknown error occurred", null);
        }
    }

    public static /* synthetic */ void l(Map map, C1446m c1446m) {
        try {
            Object obj = map.get("identifier");
            Objects.requireNonNull(obj);
            y1.h.e().l((String) obj);
            c1446m.c(null);
        } catch (Exception e4) {
            c1446m.b(e4);
        }
    }

    public static /* synthetic */ void n(C1446m c1446m) {
        try {
            y1.h.e().c();
            c1446m.c(null);
        } catch (Exception e4) {
            c1446m.b(e4);
        }
    }

    public static /* synthetic */ void o(Map map, C1446m c1446m) {
        try {
            Object obj = map.get("key");
            Objects.requireNonNull(obj);
            Object obj2 = map.get("value");
            Objects.requireNonNull(obj2);
            y1.h.e().k((String) obj, (String) obj2);
            c1446m.c(null);
        } catch (Exception e4) {
            c1446m.b(e4);
        }
    }

    public final /* synthetic */ void A(C1446m c1446m) {
        try {
            c1446m.c(new b(y1.h.e().d()));
        } catch (Exception e4) {
            c1446m.b(e4);
        }
    }

    public final /* synthetic */ void B(C1446m c1446m, C1509f c1509f) {
        try {
            c1446m.c(new d(c1509f));
        } catch (Exception e4) {
            c1446m.b(e4);
        }
    }

    public final /* synthetic */ void C(Map map, C1446m c1446m) {
        FlutterError flutterError;
        try {
            y1.h hVarE = y1.h.e();
            Object obj = map.get("exception");
            Objects.requireNonNull(obj);
            String str = (String) obj;
            String str2 = (String) map.get("reason");
            Object obj2 = map.get("information");
            Objects.requireNonNull(obj2);
            String str3 = (String) obj2;
            Object obj3 = map.get("fatal");
            Objects.requireNonNull(obj3);
            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
            Object obj4 = map.get("buildId");
            Objects.requireNonNull(obj4);
            String str4 = (String) obj4;
            Object obj5 = map.get("loadingUnits");
            Objects.requireNonNull(obj5);
            List list = (List) obj5;
            if (str4.length() > 0) {
                y1.i.b(str4);
            }
            y1.i.c(list);
            if (str2 != null) {
                hVarE.k("flutter_error_reason", "thrown " + str2);
                flutterError = new FlutterError(str + ". Error thrown " + str2 + ".");
            } else {
                flutterError = new FlutterError(str);
            }
            hVarE.k("flutter_error_exception", str);
            ArrayList arrayList = new ArrayList();
            Object obj6 = map.get("stackTraceElements");
            Objects.requireNonNull(obj6);
            Iterator it = ((List) obj6).iterator();
            while (it.hasNext()) {
                StackTraceElement stackTraceElementV = v((Map) it.next());
                if (stackTraceElementV != null) {
                    arrayList.add(stackTraceElementV);
                }
            }
            flutterError.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            if (!str3.isEmpty()) {
                hVarE.g(str3);
            }
            if (zBooleanValue) {
                y1.i.a(flutterError);
            } else {
                hVarE.h(flutterError);
            }
            c1446m.c(null);
        } catch (Exception e4) {
            c1446m.b(e4);
        }
    }

    public final /* synthetic */ void D(Map map, C1446m c1446m) {
        try {
            Object obj = map.get("enabled");
            Objects.requireNonNull(obj);
            y1.h.e().j((Boolean) obj);
            c1446m.c(new c());
        } catch (Exception e4) {
            c1446m.b(e4);
        }
    }

    public final AbstractC1445l E(final Map map) {
        final C1446m c1446m = new C1446m();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: D2.c
            @Override // java.lang.Runnable
            public final void run() {
                n.h(map, c1446m);
            }
        });
        return c1446m.a();
    }

    public final AbstractC1445l G(final Map map) {
        final C1446m c1446m = new C1446m();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: D2.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f893m.C(map, c1446m);
            }
        });
        return c1446m.a();
    }

    public final AbstractC1445l H() {
        final C1446m c1446m = new C1446m();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: D2.l
            @Override // java.lang.Runnable
            public final void run() {
                n.a(c1446m);
            }
        });
        return c1446m.a();
    }

    public final AbstractC1445l I(final Map map) {
        final C1446m c1446m = new C1446m();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: D2.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f896m.D(map, c1446m);
            }
        });
        return c1446m.a();
    }

    public final AbstractC1445l J(final Map map) {
        final C1446m c1446m = new C1446m();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: D2.b
            @Override // java.lang.Runnable
            public final void run() {
                n.o(map, c1446m);
            }
        });
        return c1446m.a();
    }

    public final AbstractC1445l K(final Map map) {
        final C1446m c1446m = new C1446m();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: D2.j
            @Override // java.lang.Runnable
            public final void run() {
                n.l(map, c1446m);
            }
        });
        return c1446m.a();
    }

    @Override // s2.InterfaceC1536a
    public void c(InterfaceC1536a.b bVar) {
        x(bVar.b());
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public AbstractC1445l didReinitializeFirebaseCore() {
        final C1446m c1446m = new C1446m();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: D2.e
            @Override // java.lang.Runnable
            public final void run() {
                n.d(c1446m);
            }
        });
        return c1446m.a();
    }

    @Override // w2.C1617j.c
    public void g(C1616i c1616i, final C1617j.d dVar) {
        AbstractC1445l abstractC1445lU;
        String str = c1616i.f11879a;
        str.getClass();
        switch (str) {
            case "Crashlytics#didCrashOnPreviousExecution":
                abstractC1445lU = u();
                break;
            case "Crashlytics#recordError":
                abstractC1445lU = G((Map) c1616i.b());
                break;
            case "Crashlytics#checkForUnsentReports":
                abstractC1445lU = q();
                break;
            case "Crashlytics#sendUnsentReports":
                abstractC1445lU = H();
                break;
            case "Crashlytics#setCrashlyticsCollectionEnabled":
                abstractC1445lU = I((Map) c1616i.b());
                break;
            case "Crashlytics#log":
                abstractC1445lU = E((Map) c1616i.b());
                break;
            case "Crashlytics#setCustomKey":
                abstractC1445lU = J((Map) c1616i.b());
                break;
            case "Crashlytics#deleteUnsentReports":
                abstractC1445lU = t();
                break;
            case "Crashlytics#setUserIdentifier":
                abstractC1445lU = K((Map) c1616i.b());
                break;
            case "Crashlytics#crash":
                s();
                return;
            default:
                dVar.c();
                return;
        }
        abstractC1445lU.c(new InterfaceC1439f() { // from class: D2.f
            @Override // n1.InterfaceC1439f
            public final void a(AbstractC1445l abstractC1445l) {
                n.j(dVar, abstractC1445l);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public AbstractC1445l getPluginConstantsForFirebaseApp(final C1509f c1509f) {
        final C1446m c1446m = new C1446m();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: D2.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f884m.B(c1446m, c1509f);
            }
        });
        return c1446m.a();
    }

    public final AbstractC1445l q() {
        final C1446m c1446m = new C1446m();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: D2.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f899m.z(c1446m);
            }
        });
        return c1446m.a();
    }

    @Override // s2.InterfaceC1536a
    public void r(InterfaceC1536a.b bVar) {
        C1617j c1617j = this.f907c;
        if (c1617j != null) {
            c1617j.e(null);
            this.f907c = null;
        }
    }

    public final void s() {
        new Handler(Looper.myLooper()).postDelayed(new Runnable() { // from class: D2.d
            @Override // java.lang.Runnable
            public final void run() {
                n.e();
            }
        }, 50L);
    }

    public final AbstractC1445l t() {
        final C1446m c1446m = new C1446m();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: D2.k
            @Override // java.lang.Runnable
            public final void run() {
                n.n(c1446m);
            }
        });
        return c1446m.a();
    }

    public final AbstractC1445l u() {
        final C1446m c1446m = new C1446m();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: D2.m
            @Override // java.lang.Runnable
            public final void run() {
                this.f905m.A(c1446m);
            }
        });
        return c1446m.a();
    }

    public final StackTraceElement v(Map map) {
        try {
            String str = (String) map.get("file");
            String str2 = (String) map.get("line");
            String str3 = (String) map.get("class");
            String str4 = (String) map.get("method");
            if (str3 == null) {
                str3 = "";
            }
            Objects.requireNonNull(str2);
            return new StackTraceElement(str3, str4, str, Integer.parseInt(str2));
        } catch (Exception unused) {
            Log.e("FLTFirebaseCrashlytics", "Unable to generate stack trace element from Dart error.");
            return null;
        }
    }

    public final SharedPreferences w(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    public final void x(InterfaceC1609b interfaceC1609b) {
        C1617j c1617j = new C1617j(interfaceC1609b, "plugins.flutter.io/firebase_crashlytics");
        this.f907c = c1617j;
        c1617j.e(this);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_crashlytics", this);
    }

    public final boolean y(C1509f c1509f) {
        SharedPreferences sharedPreferencesW = w(c1509f.m());
        if (sharedPreferencesW.contains("firebase_crashlytics_collection_enabled")) {
            return sharedPreferencesW.getBoolean("firebase_crashlytics_collection_enabled", true);
        }
        Boolean boolF = F(c1509f.m());
        y1.h.e().j(boolF);
        return boolF.booleanValue();
    }

    public final /* synthetic */ void z(C1446m c1446m) {
        try {
            c1446m.c(new a(((Boolean) AbstractC1448o.a(y1.h.e().b())).booleanValue()));
        } catch (Exception e4) {
            c1446m.b(e4);
        }
    }
}
