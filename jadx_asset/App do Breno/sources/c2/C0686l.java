package c2;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import f2.C0955f;
import h3.AbstractC1010i;
import r1.C1509f;

/* JADX INFO: renamed from: c2.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0686l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f6074c = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1509f f6075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0955f f6076b;

    /* JADX INFO: renamed from: c2.l$a */
    public static final class a extends P2.k implements W2.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f6077q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ N2.i f6079s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0669F f6080t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(N2.i iVar, InterfaceC0669F interfaceC0669F, N2.e eVar) {
            super(2, eVar);
            this.f6079s = iVar;
            this.f6080t = interfaceC0669F;
        }

        public static final void x(String str, r1.n nVar) {
            Log.w(FirebaseSessionsRegistrar.TAG, "FirebaseApp instance deleted. Sessions library will stop collecting data.");
            C0672I.f6003b.a(null);
        }

        @Override // P2.a
        public final N2.e m(Object obj, N2.e eVar) {
            return C0686l.this.new a(this.f6079s, this.f6080t, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
        
            if (r6.g(r5) == r0) goto L25;
         */
        @Override // P2.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object q(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = O2.c.c()
                int r1 = r5.f6077q
                java.lang.String r2 = "FirebaseSessions"
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L20
                if (r1 == r4) goto L1c
                if (r1 != r3) goto L14
                K2.k.b(r6)
                goto L62
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                K2.k.b(r6)
                goto L2e
            L20:
                K2.k.b(r6)
                d2.a r6 = d2.C0919a.f7146a
                r5.f6077q = r4
                java.lang.Object r6 = r6.c(r5)
                if (r6 != r0) goto L2e
                goto L61
            L2e:
                java.util.Map r6 = (java.util.Map) r6
                java.util.Collection r6 = r6.values()
                if (r6 == 0) goto L3d
                boolean r1 = r6.isEmpty()
                if (r1 == 0) goto L3d
                goto L94
            L3d:
                java.util.Iterator r6 = r6.iterator()
            L41:
                boolean r1 = r6.hasNext()
                if (r1 == 0) goto L94
                java.lang.Object r1 = r6.next()
                d2.b r1 = (d2.InterfaceC0920b) r1
                boolean r1 = r1.c()
                if (r1 == 0) goto L41
                c2.l r6 = c2.C0686l.this
                f2.f r6 = c2.C0686l.b(r6)
                r5.f6077q = r3
                java.lang.Object r6 = r6.g(r5)
                if (r6 != r0) goto L62
            L61:
                return r0
            L62:
                c2.l r6 = c2.C0686l.this
                f2.f r6 = c2.C0686l.b(r6)
                boolean r6 = r6.d()
                if (r6 != 0) goto L74
                java.lang.String r6 = "Sessions SDK disabled. Not listening to lifecycle events."
                android.util.Log.d(r2, r6)
                goto L99
            L74:
                c2.D r6 = new c2.D
                N2.i r0 = r5.f6079s
                r6.<init>(r0)
                c2.F r0 = r5.f6080t
                r6.i(r0)
                c2.I r0 = c2.C0672I.f6003b
                r0.a(r6)
                c2.l r6 = c2.C0686l.this
                r1.f r6 = c2.C0686l.a(r6)
                c2.k r0 = new c2.k
                r0.<init>()
                r6.h(r0)
                goto L99
            L94:
                java.lang.String r6 = "No Sessions subscribers. Not listening to lifecycle events."
                android.util.Log.d(r2, r6)
            L99:
                K2.p r6 = K2.p.f2516a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: c2.C0686l.a.q(java.lang.Object):java.lang.Object");
        }

        @Override // W2.p
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public final Object j(h3.I i4, N2.e eVar) {
            return ((a) m(i4, eVar)).q(K2.p.f2516a);
        }
    }

    /* JADX INFO: renamed from: c2.l$b */
    public static final class b {
        public /* synthetic */ b(X2.g gVar) {
            this();
        }

        public b() {
        }
    }

    public C0686l(C1509f c1509f, C0955f c0955f, N2.i iVar, InterfaceC0669F interfaceC0669F) {
        X2.l.e(c1509f, "firebaseApp");
        X2.l.e(c0955f, "settings");
        X2.l.e(iVar, "backgroundDispatcher");
        X2.l.e(interfaceC0669F, "lifecycleServiceBinder");
        this.f6075a = c1509f;
        this.f6076b = c0955f;
        Log.d(FirebaseSessionsRegistrar.TAG, "Initializing Firebase Sessions SDK.");
        Context applicationContext = c1509f.m().getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(C0672I.f6003b);
            AbstractC1010i.d(h3.J.a(iVar), null, null, new a(iVar, interfaceC0669F, null), 3, null);
            return;
        }
        Log.e(FirebaseSessionsRegistrar.TAG, "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
    }
}
