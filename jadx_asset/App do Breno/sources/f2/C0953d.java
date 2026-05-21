package f2;

import P2.k;
import W2.p;
import X2.l;
import android.net.Uri;
import c2.C0676b;
import h3.AbstractC1006g;
import h3.I;
import java.net.URL;
import java.util.Map;

/* JADX INFO: renamed from: f2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0953d implements InterfaceC0950a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f7228d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0676b f7229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final N2.i f7230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7231c;

    /* JADX INFO: renamed from: f2.d$a */
    public static final class a {
        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: f2.d$b */
    public static final class b extends k implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f7232q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Map f7234s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ p f7235t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ p f7236u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Map map, p pVar, p pVar2, N2.e eVar) {
            super(2, eVar);
            this.f7234s = map;
            this.f7235t = pVar;
            this.f7236u = pVar2;
        }

        @Override // P2.a
        public final N2.e m(Object obj, N2.e eVar) {
            return C0953d.this.new b(this.f7234s, this.f7235t, this.f7236u, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x00cb, code lost:
        
            if (r8.j(r1, r7) == r0) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00e0, code lost:
        
            if (r1.j(r3, r7) != r0) goto L37;
         */
        @Override // P2.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object q(java.lang.Object r8) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 230
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: f2.C0953d.b.q(java.lang.Object):java.lang.Object");
        }

        @Override // W2.p
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object j(I i4, N2.e eVar) {
            return ((b) m(i4, eVar)).q(K2.p.f2516a);
        }
    }

    public C0953d(C0676b c0676b, N2.i iVar, String str) {
        l.e(c0676b, "appInfo");
        l.e(iVar, "blockingDispatcher");
        l.e(str, "baseUrl");
        this.f7229a = c0676b;
        this.f7230b = iVar;
        this.f7231c = str;
    }

    @Override // f2.InterfaceC0950a
    public Object a(Map map, p pVar, p pVar2, N2.e eVar) {
        Object objG = AbstractC1006g.g(this.f7230b, new b(map, pVar, pVar2, null), eVar);
        return objG == O2.c.c() ? objG : K2.p.f2516a;
    }

    public final URL c() {
        return new URL(new Uri.Builder().scheme("https").authority(this.f7231c).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp").appendPath(this.f7229a.b()).appendPath("settings").appendQueryParameter("build_version", this.f7229a.a().a()).appendQueryParameter("display_version", this.f7229a.a().f()).build().toString());
    }

    public /* synthetic */ C0953d(C0676b c0676b, N2.i iVar, String str, int i4, X2.g gVar) {
        this(c0676b, iVar, (i4 & 4) != 0 ? "firebase-settings.crashlytics.com" : str);
    }
}
