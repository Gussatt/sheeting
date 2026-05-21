package H2;

import H2.B1;
import K2.j;
import android.net.http.SslCertificate;
import java.util.List;
import w2.C1608a;
import w2.InterfaceC1609b;
import w2.InterfaceC1615h;

/* JADX INFO: loaded from: classes.dex */
public abstract class B1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f1717b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P f1718a;

    public static final class a {
        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public static final void f(B1 b12, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
            try {
                listB = L2.l.b(b12.b((SslCertificate.DName) obj2));
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public static final void g(B1 b12, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
            try {
                listB = L2.l.b(b12.c((SslCertificate.DName) obj2));
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public static final void h(B1 b12, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
            try {
                listB = L2.l.b(b12.d((SslCertificate.DName) obj2));
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public static final void i(B1 b12, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
            try {
                listB = L2.l.b(b12.f((SslCertificate.DName) obj2));
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public final void e(InterfaceC1609b interfaceC1609b, final B1 b12) {
            InterfaceC1615h c0295b;
            P pE;
            X2.l.e(interfaceC1609b, "binaryMessenger");
            if (b12 == null || (pE = b12.e()) == null || (c0295b = pE.b()) == null) {
                c0295b = new C0295b();
            }
            C1608a c1608a = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getCName", c0295b);
            if (b12 != null) {
                c1608a.e(new C1608a.d() { // from class: H2.x1
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        B1.a.f(b12, obj, eVar);
                    }
                });
            } else {
                c1608a.e(null);
            }
            C1608a c1608a2 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getDName", c0295b);
            if (b12 != null) {
                c1608a2.e(new C1608a.d() { // from class: H2.y1
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        B1.a.g(b12, obj, eVar);
                    }
                });
            } else {
                c1608a2.e(null);
            }
            C1608a c1608a3 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getOName", c0295b);
            if (b12 != null) {
                c1608a3.e(new C1608a.d() { // from class: H2.z1
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        B1.a.h(b12, obj, eVar);
                    }
                });
            } else {
                c1608a3.e(null);
            }
            C1608a c1608a4 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getUName", c0295b);
            if (b12 != null) {
                c1608a4.e(new C1608a.d() { // from class: H2.A1
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        B1.a.i(b12, obj, eVar);
                    }
                });
            } else {
                c1608a4.e(null);
            }
        }

        public a() {
        }
    }

    public B1(P p4) {
        X2.l.e(p4, "pigeonRegistrar");
        this.f1718a = p4;
    }

    public static final void h(W2.l lVar, String str, Object obj) {
        if (!(obj instanceof List)) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(Q.f1841a.a(str)))));
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            j.a aVar2 = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.p.f2516a)));
            return;
        }
        j.a aVar3 = K2.j.f2509n;
        Object obj2 = list.get(0);
        X2.l.c(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        X2.l.c(obj3, "null cannot be cast to non-null type kotlin.String");
        lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a((String) obj2, (String) obj3, (String) list.get(2))))));
    }

    public abstract String b(SslCertificate.DName dName);

    public abstract String c(SslCertificate.DName dName);

    public abstract String d(SslCertificate.DName dName);

    public P e() {
        return this.f1718a;
    }

    public abstract String f(SslCertificate.DName dName);

    public final void g(SslCertificate.DName dName, final W2.l lVar) {
        X2.l.e(dName, "pigeon_instanceArg");
        X2.l.e(lVar, "callback");
        if (e().c()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (e().d().f(dName)) {
            j.a aVar2 = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.p.f2516a)));
        } else {
            final String str = "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.pigeon_newInstance";
            new C1608a(e().a(), "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.pigeon_newInstance", e().b()).d(L2.l.b(Long.valueOf(e().d().c(dName))), new C1608a.e() { // from class: H2.w1
                @Override // w2.C1608a.e
                public final void a(Object obj) {
                    B1.h(lVar, str, obj);
                }
            });
        }
    }
}
