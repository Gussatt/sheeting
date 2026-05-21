package f2;

import P2.k;
import W2.p;
import X2.l;
import X2.m;
import android.util.Log;
import c2.C0676b;
import g3.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: f2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0952c implements InterfaceC0958i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f7208g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N2.i f7209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V1.h f7210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0676b f7211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC0950a f7212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final K2.f f7213e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q3.a f7214f;

    /* JADX INFO: renamed from: f2.c$a */
    public static final class a {
        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: f2.c$b */
    public static final class b extends m implements W2.a {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ L.h f7215n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(L.h hVar) {
            super(0);
            this.f7215n = hVar;
        }

        @Override // W2.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0957h e() {
            return new C0957h(this.f7215n);
        }
    }

    /* JADX INFO: renamed from: f2.c$c, reason: collision with other inner class name */
    public static final class C0120c extends P2.d {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Object f7216p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Object f7217q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f7218r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f7220t;

        public C0120c(N2.e eVar) {
            super(eVar);
        }

        @Override // P2.a
        public final Object q(Object obj) {
            this.f7218r = obj;
            this.f7220t |= Integer.MIN_VALUE;
            return C0952c.this.c(this);
        }
    }

    /* JADX INFO: renamed from: f2.c$d */
    public static final class d extends k implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Object f7221q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f7222r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f7223s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f7224t;

        public d(N2.e eVar) {
            super(2, eVar);
        }

        @Override // P2.a
        public final N2.e m(Object obj, N2.e eVar) {
            d dVar = C0952c.this.new d(eVar);
            dVar.f7224t = obj;
            return dVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:56:0x0154, code lost:
        
            if (r13.j(r0, r12) == r4) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x0195, code lost:
        
            if (r13.k(r0, r12) == r4) goto L66;
         */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00fc  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x011d  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x013d  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x015a  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x015d  */
        @Override // P2.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object q(java.lang.Object r13) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 430
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: f2.C0952c.d.q(java.lang.Object):java.lang.Object");
        }

        @Override // W2.p
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object j(JSONObject jSONObject, N2.e eVar) {
            return ((d) m(jSONObject, eVar)).q(K2.p.f2516a);
        }
    }

    /* JADX INFO: renamed from: f2.c$e */
    public static final class e extends k implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f7226q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f7227r;

        public e(N2.e eVar) {
            super(2, eVar);
        }

        @Override // P2.a
        public final N2.e m(Object obj, N2.e eVar) {
            e eVar2 = new e(eVar);
            eVar2.f7227r = obj;
            return eVar2;
        }

        @Override // P2.a
        public final Object q(Object obj) throws Throwable {
            O2.c.c();
            if (this.f7226q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            K2.k.b(obj);
            Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.f7227r));
            return K2.p.f2516a;
        }

        @Override // W2.p
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object j(String str, N2.e eVar) {
            return ((e) m(str, eVar)).q(K2.p.f2516a);
        }
    }

    public C0952c(N2.i iVar, V1.h hVar, C0676b c0676b, InterfaceC0950a interfaceC0950a, L.h hVar2) {
        l.e(iVar, "backgroundDispatcher");
        l.e(hVar, "firebaseInstallationsApi");
        l.e(c0676b, "appInfo");
        l.e(interfaceC0950a, "configsFetcher");
        l.e(hVar2, "dataStore");
        this.f7209a = iVar;
        this.f7210b = hVar;
        this.f7211c = c0676b;
        this.f7212d = interfaceC0950a;
        this.f7213e = K2.g.a(new b(hVar2));
        this.f7214f = q3.c.b(false, 1, null);
    }

    @Override // f2.InterfaceC0958i
    public Boolean a() {
        return f().g();
    }

    @Override // f2.InterfaceC0958i
    public Double b() {
        return f().f();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00c7 A[Catch: all -> 0x004f, TRY_LEAVE, TryCatch #2 {all -> 0x004f, blocks: (B:21:0x004a, B:47:0x00b9, B:49:0x00c7, B:52:0x00d2), top: B:64:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d2 A[Catch: all -> 0x004f, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x004f, blocks: (B:21:0x004a, B:47:0x00b9, B:49:0x00c7, B:52:0x00d2), top: B:64:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // f2.InterfaceC0958i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(N2.e r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.C0952c.c(N2.e):java.lang.Object");
    }

    @Override // f2.InterfaceC0958i
    public g3.a d() {
        Integer numE = f().e();
        if (numE == null) {
            return null;
        }
        a.C0121a c0121a = g3.a.f7303n;
        return g3.a.f(g3.c.h(numE.intValue(), g3.d.f7313q));
    }

    public final C0957h f() {
        return (C0957h) this.f7213e.getValue();
    }

    public final String g(String str) {
        return new f3.e("/").a(str, "");
    }
}
