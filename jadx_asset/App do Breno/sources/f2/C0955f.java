package f2;

import W2.l;
import X2.m;
import X2.z;
import android.content.Context;
import android.util.Log;
import c2.C0676b;
import c2.t;
import c2.u;
import g3.a;
import r1.C1506c;
import r1.C1509f;

/* JADX INFO: renamed from: f2.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0955f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f7242c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Z2.a f7243d = O.a.b(u.f6104a.b(), new M.b(a.f7246n), null, null, 12, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0958i f7244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0958i f7245b;

    /* JADX INFO: renamed from: f2.f$a */
    public static final class a extends m implements l {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final a f7246n = new a();

        public a() {
            super(1);
        }

        @Override // W2.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final P.f k(L.c cVar) {
            X2.l.e(cVar, "ex");
            Log.w("SessionsSettings", "CorruptionException in settings DataStore in " + t.f6103a.e() + '.', cVar);
            return P.g.a();
        }
    }

    /* JADX INFO: renamed from: f2.f$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ d3.i[] f7247a = {z.f(new X2.t(b.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        public /* synthetic */ b(X2.g gVar) {
            this();
        }

        public final L.h b(Context context) {
            return (L.h) C0955f.f7243d.a(context, f7247a[0]);
        }

        public final C0955f c() {
            return ((com.google.firebase.sessions.b) r1.m.a(C1506c.f11192a).k(com.google.firebase.sessions.b.class)).c();
        }

        public b() {
        }
    }

    /* JADX INFO: renamed from: f2.f$c */
    public static final class c extends P2.d {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Object f7248p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f7249q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f7251s;

        public c(N2.e eVar) {
            super(eVar);
        }

        @Override // P2.a
        public final Object q(Object obj) {
            this.f7249q = obj;
            this.f7251s |= Integer.MIN_VALUE;
            return C0955f.this.g(this);
        }
    }

    public C0955f(InterfaceC0958i interfaceC0958i, InterfaceC0958i interfaceC0958i2) {
        X2.l.e(interfaceC0958i, "localOverrideSettings");
        X2.l.e(interfaceC0958i2, "remoteSettings");
        this.f7244a = interfaceC0958i;
        this.f7245b = interfaceC0958i2;
    }

    public final double b() {
        Double dB = this.f7244a.b();
        if (dB != null) {
            double dDoubleValue = dB.doubleValue();
            if (e(dDoubleValue)) {
                return dDoubleValue;
            }
        }
        Double dB2 = this.f7245b.b();
        if (dB2 == null) {
            return 1.0d;
        }
        double dDoubleValue2 = dB2.doubleValue();
        if (e(dDoubleValue2)) {
            return dDoubleValue2;
        }
        return 1.0d;
    }

    public final long c() {
        g3.a aVarD = this.f7244a.d();
        if (aVarD != null) {
            long jG = aVarD.G();
            if (f(jG)) {
                return jG;
            }
        }
        g3.a aVarD2 = this.f7245b.d();
        if (aVarD2 != null) {
            long jG2 = aVarD2.G();
            if (f(jG2)) {
                return jG2;
            }
        }
        a.C0121a c0121a = g3.a.f7303n;
        return g3.c.h(30, g3.d.f7314r);
    }

    public final boolean d() {
        Boolean boolA = this.f7244a.a();
        if (boolA != null) {
            return boolA.booleanValue();
        }
        Boolean boolA2 = this.f7245b.a();
        if (boolA2 != null) {
            return boolA2.booleanValue();
        }
        return true;
    }

    public final boolean e(double d4) {
        return 0.0d <= d4 && d4 <= 1.0d;
    }

    public final boolean f(long j4) {
        return g3.a.C(j4) && g3.a.x(j4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (r6.c(r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(N2.e r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof f2.C0955f.c
            if (r0 == 0) goto L13
            r0 = r6
            f2.f$c r0 = (f2.C0955f.c) r0
            int r1 = r0.f7251s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7251s = r1
            goto L18
        L13:
            f2.f$c r0 = new f2.f$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f7249q
            java.lang.Object r1 = O2.c.c()
            int r2 = r0.f7251s
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            K2.k.b(r6)
            goto L5b
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.f7248p
            f2.f r2 = (f2.C0955f) r2
            K2.k.b(r6)
            goto L4d
        L3c:
            K2.k.b(r6)
            f2.i r6 = r5.f7244a
            r0.f7248p = r5
            r0.f7251s = r4
            java.lang.Object r6 = r6.c(r0)
            if (r6 != r1) goto L4c
            goto L5a
        L4c:
            r2 = r5
        L4d:
            f2.i r6 = r2.f7245b
            r2 = 0
            r0.f7248p = r2
            r0.f7251s = r3
            java.lang.Object r6 = r6.c(r0)
            if (r6 != r1) goto L5b
        L5a:
            return r1
        L5b:
            K2.p r6 = K2.p.f2516a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.C0955f.g(N2.e):java.lang.Object");
    }

    public C0955f(Context context, N2.i iVar, N2.i iVar2, V1.h hVar, C0676b c0676b) {
        this(new C0951b(context), new C0952c(iVar2, hVar, c0676b, new C0953d(c0676b, iVar, null, 4, null), f7242c.b(context)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0955f(C1509f c1509f, N2.i iVar, N2.i iVar2, V1.h hVar) {
        X2.l.e(c1509f, "firebaseApp");
        X2.l.e(iVar, "blockingDispatcher");
        X2.l.e(iVar2, "backgroundDispatcher");
        X2.l.e(hVar, "firebaseInstallationsApi");
        Context contextM = c1509f.m();
        X2.l.d(contextM, "firebaseApp.applicationContext");
        this(contextM, iVar, iVar2, hVar, c2.z.f6146a.b(c1509f));
    }
}
