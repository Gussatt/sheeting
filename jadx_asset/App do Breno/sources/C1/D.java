package C1;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import n1.AbstractC1445l;
import r1.C1509f;
import z1.InterfaceC1662a;

/* JADX INFO: loaded from: classes.dex */
public class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1509f f515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J f516c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public E f519f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public E f520g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f521h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public r f522i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final O f523j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final I1.g f524k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final B1.b f525l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final A1.a f526m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C0256n f527n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final InterfaceC1662a f528o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z1.l f529p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final D1.f f530q;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f518e = System.currentTimeMillis();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final U f517d = new U();

    public D(C1509f c1509f, O o4, InterfaceC1662a interfaceC1662a, J j4, B1.b bVar, A1.a aVar, I1.g gVar, C0256n c0256n, z1.l lVar, D1.f fVar) {
        this.f515b = c1509f;
        this.f516c = j4;
        this.f514a = c1509f.m();
        this.f523j = o4;
        this.f528o = interfaceC1662a;
        this.f525l = bVar;
        this.f526m = aVar;
        this.f524k = gVar;
        this.f527n = c0256n;
        this.f529p = lVar;
        this.f530q = fVar;
    }

    public static /* synthetic */ void c(D d4, Throwable th) throws Throwable {
        d4.f522i.W("com.crashlytics.on-demand.recorded-exceptions", Integer.toString(d4.f517d.b()));
        d4.f522i.W("com.crashlytics.on-demand.dropped-exceptions", Integer.toString(d4.f517d.a()));
        d4.f522i.O(Thread.currentThread(), th);
    }

    public static String s() {
        return "19.4.2";
    }

    public static boolean t(String str, boolean z3) {
        if (!z3) {
            z1.g.f().i("Configured not to require a build ID.");
            return true;
        }
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", ".     |  | ");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".   \\ |  | /");
        Log.e("FirebaseCrashlytics", ".    \\    /");
        Log.e("FirebaseCrashlytics", ".     \\  /");
        Log.e("FirebaseCrashlytics", ".      \\/");
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", ".      /\\");
        Log.e("FirebaseCrashlytics", ".     /  \\");
        Log.e("FirebaseCrashlytics", ".    /    \\");
        Log.e("FirebaseCrashlytics", ".   / |  | \\");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".");
        return false;
    }

    public AbstractC1445l A() {
        return this.f522i.U();
    }

    public void B(Boolean bool) {
        this.f516c.h(bool);
    }

    public void C(final String str, final String str2) {
        this.f530q.f877a.d(new Runnable() { // from class: C1.w
            @Override // java.lang.Runnable
            public final void run() {
                this.f690m.f522i.V(str, str2);
            }
        });
    }

    public void D(final String str, final String str2) {
        this.f530q.f877a.d(new Runnable() { // from class: C1.x
            @Override // java.lang.Runnable
            public final void run() {
                this.f693m.f522i.W(str, str2);
            }
        });
    }

    public void E(final String str) {
        this.f530q.f877a.d(new Runnable() { // from class: C1.v
            @Override // java.lang.Runnable
            public final void run() {
                this.f688m.f522i.X(str);
            }
        });
    }

    public final void k() {
        try {
            this.f521h = Boolean.TRUE.equals((Boolean) this.f530q.f877a.c().submit(new Callable() { // from class: C1.y
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(this.f696a.f522i.t());
                }
            }).get(3L, TimeUnit.SECONDS));
        } catch (Exception unused) {
            this.f521h = false;
        }
    }

    public AbstractC1445l l() {
        return this.f522i.n();
    }

    public AbstractC1445l m() {
        return this.f522i.s();
    }

    public boolean n() {
        return this.f521h;
    }

    public boolean o() {
        return this.f519f.c();
    }

    public final void p(K1.j jVar) {
        D1.f.c();
        y();
        try {
            try {
                this.f525l.a(new B1.a() { // from class: C1.B
                    @Override // B1.a
                    public final void a(String str) {
                        this.f510a.u(str);
                    }
                });
                this.f522i.T();
                if (!jVar.b().f2462b.f2469a) {
                    z1.g.f().b("Collection of crash reports disabled in Crashlytics settings.");
                    throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                }
                if (!this.f522i.A(jVar)) {
                    z1.g.f().k("Previous sessions could not be finalized.");
                }
                this.f522i.Y(jVar.a());
                x();
            } catch (Exception e4) {
                z1.g.f().e("Crashlytics encountered a problem during asynchronous initialization.", e4);
                x();
            }
        } catch (Throwable th) {
            x();
            throw th;
        }
    }

    public AbstractC1445l q(final K1.j jVar) {
        return this.f530q.f877a.d(new Runnable() { // from class: C1.s
            @Override // java.lang.Runnable
            public final void run() {
                this.f681m.p(jVar);
            }
        });
    }

    public final void r(final K1.j jVar) {
        Future<?> futureSubmit = this.f530q.f877a.c().submit(new Runnable() { // from class: C1.A
            @Override // java.lang.Runnable
            public final void run() {
                this.f508m.p(jVar);
            }
        });
        z1.g.f().b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e4) {
            z1.g.f().e("Crashlytics was interrupted during initialization.", e4);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e5) {
            z1.g.f().e("Crashlytics encountered a problem during initialization.", e5);
        } catch (TimeoutException e6) {
            z1.g.f().e("Crashlytics timed out during initialization.", e6);
        }
    }

    public void u(final String str) {
        final long jCurrentTimeMillis = System.currentTimeMillis() - this.f518e;
        this.f530q.f877a.d(new Runnable() { // from class: C1.z
            @Override // java.lang.Runnable
            public final void run() {
                D d4 = this.f697m;
                d4.f530q.f878b.d(new Runnable() { // from class: C1.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f683m.f522i.c0(j, str);
                    }
                });
            }
        });
    }

    public void v(final Throwable th, final Map map) {
        this.f530q.f877a.d(new Runnable() { // from class: C1.C
            @Override // java.lang.Runnable
            public final void run() {
                this.f511m.f522i.b0(Thread.currentThread(), th, map);
            }
        });
    }

    public void w(final Throwable th) {
        z1.g.f().b("Recorded on-demand fatal events: " + this.f517d.b());
        z1.g.f().b("Dropped on-demand fatal events: " + this.f517d.a());
        this.f530q.f877a.d(new Runnable() { // from class: C1.u
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                D.c(this.f686m, th);
            }
        });
    }

    public void x() {
        D1.f.c();
        try {
            if (this.f519f.d()) {
                return;
            }
            z1.g.f().k("Initialization marker file was not properly removed.");
        } catch (Exception e4) {
            z1.g.f().e("Problem encountered deleting Crashlytics initialization marker.", e4);
        }
    }

    public void y() {
        D1.f.c();
        this.f519f.a();
        z1.g.f().i("Initialization marker file was created.");
    }

    public boolean z(C0244b c0244b, K1.j jVar) {
        if (!t(c0244b.f585b, AbstractC0252j.i(this.f514a, "com.crashlytics.RequireBuildId", true))) {
            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        }
        String strC = new C0251i().c();
        try {
            this.f520g = new E("crash_marker", this.f524k);
            this.f519f = new E("initialization_marker", this.f524k);
            E1.o oVar = new E1.o(strC, this.f524k, this.f530q);
            E1.f fVar = new E1.f(this.f524k);
            L1.a aVar = new L1.a(1024, new L1.c(10));
            this.f529p.b(oVar);
            this.f522i = new r(this.f514a, this.f523j, this.f516c, this.f524k, this.f520g, c0244b, oVar, fVar, i0.j(this.f514a, this.f523j, this.f524k, c0244b, fVar, oVar, aVar, jVar, this.f517d, this.f527n, this.f530q), this.f528o, this.f526m, this.f527n, this.f530q);
            boolean zO = o();
            k();
            this.f522i.y(strC, Thread.getDefaultUncaughtExceptionHandler(), jVar);
            if (!zO || !AbstractC0252j.d(this.f514a)) {
                z1.g.f().b("Successfully configured exception handler.");
                return true;
            }
            z1.g.f().b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
            r(jVar);
            return false;
        } catch (Exception e4) {
            z1.g.f().e("Crashlytics was not started due to an exception during initialization", e4);
            this.f522i = null;
            return false;
        }
    }
}
