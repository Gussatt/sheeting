package io.flutter.embedding.engine;

import I2.h;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.plugin.platform.C1090w;
import io.flutter.plugin.platform.P;
import io.flutter.plugin.platform.Q;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l2.AbstractC1388b;
import l2.C1387a;
import n2.C1451b;
import o2.C1472a;
import q2.d;
import u2.AbstractC1581a;
import v2.C1590A;
import v2.C1591B;
import v2.C1592a;
import v2.f;
import v2.g;
import v2.k;
import v2.l;
import v2.m;
import v2.n;
import v2.o;
import v2.u;
import v2.v;
import v2.w;
import v2.x;
import v2.y;
import v2.z;
import x2.C1643d;
import z2.c;

/* JADX INFO: loaded from: classes.dex */
public class a implements h.a {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static long f7747B = 1;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final Map f7748C = new HashMap();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final b f7749A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlutterJNI f7750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FlutterRenderer f7751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1472a f7752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1451b f7753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1643d f7754e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C1592a f7755f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g f7756g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k f7757h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l f7758i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m f7759j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final n f7760k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f f7761l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final v f7762m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o f7763n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final u f7764o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w f7765p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x f7766q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f7767r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final z f7768s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C1590A f7769t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C1591B f7770u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C1090w f7771v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final P f7772w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Q f7773x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Set f7774y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final long f7775z;

    /* JADX INFO: renamed from: io.flutter.embedding.engine.a$a, reason: collision with other inner class name */
    public class C0127a implements b {
        public C0127a() {
        }

        @Override // io.flutter.embedding.engine.a.b
        public void a() {
        }

        @Override // io.flutter.embedding.engine.a.b
        public void b() {
            AbstractC1388b.f("FlutterEngine", "onPreEngineRestart()");
            Iterator it = a.this.f7774y.iterator();
            while (it.hasNext()) {
                ((b) it.next()).b();
            }
            a.this.f7771v.i0();
            a.this.f7772w.C();
            a.this.f7762m.g();
        }
    }

    public interface b {
        void a();

        void b();
    }

    public a(Context context, d dVar, FlutterJNI flutterJNI, C1090w c1090w, String[] strArr, boolean z3, boolean z4) {
        this(context, dVar, flutterJNI, c1090w, strArr, z3, z4, null);
    }

    public y A() {
        return this.f7767r;
    }

    public z B() {
        return this.f7768s;
    }

    public C1590A C() {
        return this.f7769t;
    }

    public C1591B D() {
        return this.f7770u;
    }

    public final boolean E() {
        return this.f7750a.isAttached();
    }

    public a F(Context context, C1472a.b bVar, String str, List list, C1090w c1090w, boolean z3, boolean z4) {
        if (E()) {
            return new a(context, null, this.f7750a.spawn(bVar.f10765c, bVar.f10764b, str, list, f7747B), c1090w, null, z3, z4);
        }
        throw new IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
    }

    @Override // I2.h.a
    public void a(float f4, float f5, float f6) {
        this.f7750a.updateDisplayMetrics(0, f4, f5, f6);
    }

    public void f(b bVar) {
        this.f7774y.add(bVar);
    }

    public final void g() {
        AbstractC1388b.f("FlutterEngine", "Attaching to JNI.");
        this.f7750a.attachToNative();
        if (!E()) {
            throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
        }
    }

    public void h() {
        AbstractC1388b.f("FlutterEngine", "Destroying.");
        Iterator it = this.f7774y.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a();
        }
        this.f7753d.l();
        this.f7771v.e0();
        this.f7772w.z();
        this.f7752c.m();
        this.f7750a.removeEngineLifecycleListener(this.f7749A);
        this.f7750a.setDeferredComponentManager(null);
        this.f7750a.detachFromNativeAndReleaseResources();
        C1387a.e().a();
        f7748C.remove(Long.valueOf(this.f7775z));
    }

    public C1592a i() {
        return this.f7755f;
    }

    public t2.b j() {
        return this.f7753d;
    }

    public f k() {
        return this.f7761l;
    }

    public C1472a l() {
        return this.f7752c;
    }

    public k m() {
        return this.f7757h;
    }

    public C1643d n() {
        return this.f7754e;
    }

    public m o() {
        return this.f7759j;
    }

    public n p() {
        return this.f7760k;
    }

    public o q() {
        return this.f7763n;
    }

    public C1090w r() {
        return this.f7771v;
    }

    public P s() {
        return this.f7772w;
    }

    public Q t() {
        return this.f7773x;
    }

    public s2.b u() {
        return this.f7753d;
    }

    public u v() {
        return this.f7764o;
    }

    public FlutterRenderer w() {
        return this.f7751b;
    }

    public v x() {
        return this.f7762m;
    }

    public w y() {
        return this.f7765p;
    }

    public x z() {
        return this.f7766q;
    }

    public a(Context context, d dVar, FlutterJNI flutterJNI, C1090w c1090w, String[] strArr, boolean z3, boolean z4, io.flutter.embedding.engine.b bVar) {
        AssetManager assets;
        this.f7774y = new HashSet();
        this.f7749A = new C0127a();
        long j4 = f7747B;
        f7747B = 1 + j4;
        this.f7775z = j4;
        f7748C.put(Long.valueOf(j4), this);
        try {
            assets = context.createPackageContext(context.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assets = context.getAssets();
        }
        C1387a c1387aE = C1387a.e();
        flutterJNI = flutterJNI == null ? c1387aE.d().a() : flutterJNI;
        this.f7750a = flutterJNI;
        C1472a c1472a = new C1472a(flutterJNI, assets, this.f7775z);
        this.f7752c = c1472a;
        c1472a.l();
        C1387a.e().a();
        this.f7755f = new C1592a(c1472a, flutterJNI);
        this.f7756g = new g(c1472a);
        this.f7757h = new k(c1472a);
        l lVar = new l(c1472a);
        this.f7758i = lVar;
        this.f7759j = new m(c1472a);
        this.f7760k = new n(c1472a);
        this.f7761l = new f(c1472a);
        this.f7763n = new o(c1472a);
        this.f7764o = new u(c1472a, context.getPackageManager());
        this.f7762m = new v(c1472a, z4);
        this.f7765p = new w(c1472a);
        this.f7766q = new x(c1472a);
        this.f7767r = new y(c1472a);
        this.f7768s = new z(c1472a);
        this.f7769t = new C1590A(c1472a);
        this.f7770u = new C1591B(c1472a);
        C1643d c1643d = new C1643d(context, lVar);
        this.f7754e = c1643d;
        dVar = dVar == null ? c1387aE.c() : dVar;
        if (!flutterJNI.isAttached()) {
            dVar.o(context.getApplicationContext());
            dVar.f(context, strArr);
        }
        P p4 = new P();
        p4.I(c1090w.X());
        p4.H(flutterJNI);
        c1090w.q0(flutterJNI);
        flutterJNI.addEngineLifecycleListener(this.f7749A);
        flutterJNI.setPlatformViewsController(c1090w);
        flutterJNI.setPlatformViewsController2(p4);
        flutterJNI.setLocalizationPlugin(c1643d);
        c1387aE.a();
        flutterJNI.setDeferredComponentManager(null);
        if (!flutterJNI.isAttached()) {
            g();
        }
        this.f7751b = new FlutterRenderer(flutterJNI);
        this.f7771v = c1090w;
        this.f7772w = p4;
        this.f7773x = new Q(c1090w, p4);
        C1451b c1451b = new C1451b(context.getApplicationContext(), this, dVar, bVar);
        this.f7753d = c1451b;
        c1643d.d(context.getResources().getConfiguration());
        if (z3 && dVar.e()) {
            AbstractC1581a.a(this);
        }
        h.c(context, this);
        c1451b.d(new c(v()));
    }
}
