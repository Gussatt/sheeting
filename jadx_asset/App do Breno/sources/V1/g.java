package V1;

import V0.AbstractC0549h;
import V1.i;
import X1.d;
import X1.f;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import n1.AbstractC1445l;
import n1.AbstractC1448o;
import n1.C1446m;
import r1.C1509f;
import w1.w;

/* JADX INFO: loaded from: classes.dex */
public class g implements h {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object f3742m = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ThreadFactory f3743n = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1509f f3744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X1.c f3745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final W1.c f3746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f3747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w f3748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f3749f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f3750g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ExecutorService f3751h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Executor f3752i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f3753j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Set f3754k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f3755l;

    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicInteger f3756a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f3756a.getAndIncrement())));
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3757a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f3758b;

        static {
            int[] iArr = new int[f.b.values().length];
            f3758b = iArr;
            try {
                iArr[f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3758b[f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3758b[f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[d.b.values().length];
            f3757a = iArr2;
            try {
                iArr2[d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3757a[d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public g(final C1509f c1509f, U1.b bVar, ExecutorService executorService, Executor executor) {
        this(executorService, executor, c1509f, new X1.c(c1509f.m(), bVar), new W1.c(c1509f), p.c(), new w(new U1.b() { // from class: V1.c
            @Override // U1.b
            public final Object get() {
                return g.f(c1509f);
            }
        }), new n());
    }

    public static /* synthetic */ W1.b f(C1509f c1509f) {
        return new W1.b(c1509f);
    }

    public static g q() {
        return r(C1509f.o());
    }

    public static g r(C1509f c1509f) {
        AbstractC0549h.b(c1509f != null, "Null is not a valid value of FirebaseApp.");
        return (g) c1509f.k(h.class);
    }

    public final void A(W1.d dVar) {
        synchronized (this.f3750g) {
            try {
                Iterator it = this.f3755l.iterator();
                while (it.hasNext()) {
                    if (((o) it.next()).a(dVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void B(String str) {
        this.f3753j = str;
    }

    public final synchronized void C(W1.d dVar, W1.d dVar2) {
        if (this.f3754k.size() != 0 && !TextUtils.equals(dVar.d(), dVar2.d())) {
            Iterator it = this.f3754k.iterator();
            if (it.hasNext()) {
                i.d.a(it.next());
                dVar2.d();
                throw null;
            }
        }
    }

    @Override // V1.h
    public AbstractC1445l a() {
        w();
        String strO = o();
        if (strO != null) {
            return AbstractC1448o.e(strO);
        }
        AbstractC1445l abstractC1445lH = h();
        this.f3751h.execute(new Runnable() { // from class: V1.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f3737m.k(false);
            }
        });
        return abstractC1445lH;
    }

    @Override // V1.h
    public AbstractC1445l b(final boolean z3) {
        w();
        AbstractC1445l abstractC1445lG = g();
        this.f3751h.execute(new Runnable() { // from class: V1.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f3738m.k(z3);
            }
        });
        return abstractC1445lG;
    }

    public final AbstractC1445l g() {
        C1446m c1446m = new C1446m();
        i(new k(this.f3747d, c1446m));
        return c1446m.a();
    }

    public final AbstractC1445l h() {
        C1446m c1446m = new C1446m();
        i(new l(c1446m));
        return c1446m.a();
    }

    public final void i(o oVar) {
        synchronized (this.f3750g) {
            this.f3755l.add(oVar);
        }
    }

    public final void j(boolean z3) {
        W1.d dVarY;
        W1.d dVarS = s();
        try {
            if (dVarS.i() || dVarS.l()) {
                dVarY = y(dVarS);
            } else {
                if (!z3 && !this.f3747d.f(dVarS)) {
                    return;
                }
                dVarY = l(dVarS);
            }
            v(dVarY);
            C(dVarS, dVarY);
            if (dVarY.k()) {
                B(dVarY.d());
            }
            if (dVarY.i()) {
                z(new i(i.a.BAD_CONFIG));
            } else if (dVarY.j()) {
                z(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
            } else {
                A(dVarY);
            }
        } catch (i e4) {
            z(e4);
        }
    }

    public final void k(final boolean z3) {
        W1.d dVarT = t();
        if (z3) {
            dVarT = dVarT.p();
        }
        A(dVarT);
        this.f3752i.execute(new Runnable() { // from class: V1.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f3740m.j(z3);
            }
        });
    }

    public final W1.d l(W1.d dVar) throws i {
        X1.f fVarE = this.f3745b.e(m(), dVar.d(), u(), dVar.f());
        int i4 = b.f3758b[fVarE.b().ordinal()];
        if (i4 == 1) {
            return dVar.o(fVarE.c(), fVarE.d(), this.f3747d.b());
        }
        if (i4 == 2) {
            return dVar.q("BAD CONFIG");
        }
        if (i4 != 3) {
            throw new i("Firebase Installations Service is unavailable. Please try again later.", i.a.UNAVAILABLE);
        }
        B(null);
        return dVar.r();
    }

    public String m() {
        return this.f3744a.r().b();
    }

    public String n() {
        return this.f3744a.r().c();
    }

    public final synchronized String o() {
        return this.f3753j;
    }

    public final W1.b p() {
        return (W1.b) this.f3748e.get();
    }

    /* JADX WARN: Finally extract failed */
    public final W1.d s() {
        W1.d dVarD;
        synchronized (f3742m) {
            try {
                V1.b bVarA = V1.b.a(this.f3744a.m(), "generatefid.lock");
                try {
                    dVarD = this.f3746c.d();
                    if (bVarA != null) {
                        bVarA.b();
                    }
                } catch (Throwable th) {
                    if (bVarA != null) {
                        bVarA.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVarD;
    }

    /* JADX WARN: Finally extract failed */
    public final W1.d t() {
        W1.d dVarD;
        synchronized (f3742m) {
            try {
                V1.b bVarA = V1.b.a(this.f3744a.m(), "generatefid.lock");
                try {
                    dVarD = this.f3746c.d();
                    if (dVarD.j()) {
                        dVarD = this.f3746c.b(dVarD.t(x(dVarD)));
                    }
                    if (bVarA != null) {
                        bVarA.b();
                    }
                } catch (Throwable th) {
                    if (bVarA != null) {
                        bVarA.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVarD;
    }

    public String u() {
        return this.f3744a.r().g();
    }

    /* JADX WARN: Finally extract failed */
    public final void v(W1.d dVar) {
        synchronized (f3742m) {
            try {
                V1.b bVarA = V1.b.a(this.f3744a.m(), "generatefid.lock");
                try {
                    this.f3746c.b(dVar);
                    if (bVarA != null) {
                        bVarA.b();
                    }
                } catch (Throwable th) {
                    if (bVarA != null) {
                        bVarA.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void w() {
        AbstractC0549h.e(n(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC0549h.e(u(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC0549h.e(m(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC0549h.b(p.h(n()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC0549h.b(p.g(m()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    public final String x(W1.d dVar) {
        if ((!this.f3744a.q().equals("CHIME_ANDROID_SDK") && !this.f3744a.y()) || !dVar.m()) {
            return this.f3749f.a();
        }
        String strF = p().f();
        return TextUtils.isEmpty(strF) ? this.f3749f.a() : strF;
    }

    public final W1.d y(W1.d dVar) throws i {
        X1.d dVarD = this.f3745b.d(m(), dVar.d(), u(), n(), (dVar.d() == null || dVar.d().length() != 11) ? null : p().i());
        int i4 = b.f3757a[dVarD.e().ordinal()];
        if (i4 == 1) {
            return dVar.s(dVarD.c(), dVarD.d(), this.f3747d.b(), dVarD.b().c(), dVarD.b().d());
        }
        if (i4 == 2) {
            return dVar.q("BAD CONFIG");
        }
        throw new i("Firebase Installations Service is unavailable. Please try again later.", i.a.UNAVAILABLE);
    }

    public final void z(Exception exc) {
        synchronized (this.f3750g) {
            try {
                Iterator it = this.f3755l.iterator();
                while (it.hasNext()) {
                    if (((o) it.next()).b(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public g(ExecutorService executorService, Executor executor, C1509f c1509f, X1.c cVar, W1.c cVar2, p pVar, w wVar, n nVar) {
        this.f3750g = new Object();
        this.f3754k = new HashSet();
        this.f3755l = new ArrayList();
        this.f3744a = c1509f;
        this.f3745b = cVar;
        this.f3746c = cVar2;
        this.f3747d = pVar;
        this.f3748e = wVar;
        this.f3749f = nVar;
        this.f3751h = executorService;
        this.f3752i = executor;
    }
}
