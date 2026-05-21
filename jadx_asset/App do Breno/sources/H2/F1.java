package H2;

import H2.F1;
import K2.j;
import android.net.http.SslCertificate;
import android.net.http.SslError;
import java.util.List;
import w2.C1608a;
import w2.InterfaceC1609b;
import w2.InterfaceC1615h;

/* JADX INFO: loaded from: classes.dex */
public abstract class F1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f1756b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P f1757a;

    public static final class a {
        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public static final void d(F1 f12, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type android.net.http.SslError");
            try {
                listB = L2.l.b(f12.d((SslError) obj2));
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public static final void e(F1 f12, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type android.net.http.SslError");
            SslError sslError = (SslError) obj2;
            Object obj3 = list.get(1);
            X2.l.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.SslErrorType");
            try {
                listB = L2.l.b(Boolean.valueOf(f12.e(sslError, (W3) obj3)));
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public final void c(InterfaceC1609b interfaceC1609b, final F1 f12) {
            InterfaceC1615h c0295b;
            P pC;
            X2.l.e(interfaceC1609b, "binaryMessenger");
            if (f12 == null || (pC = f12.c()) == null || (c0295b = pC.b()) == null) {
                c0295b = new C0295b();
            }
            C1608a c1608a = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.SslError.getPrimaryError", c0295b);
            if (f12 != null) {
                c1608a.e(new C1608a.d() { // from class: H2.D1
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        F1.a.d(f12, obj, eVar);
                    }
                });
            } else {
                c1608a.e(null);
            }
            C1608a c1608a2 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.SslError.hasError", c0295b);
            if (f12 != null) {
                c1608a2.e(new C1608a.d() { // from class: H2.E1
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        F1.a.e(f12, obj, eVar);
                    }
                });
            } else {
                c1608a2.e(null);
            }
        }

        public a() {
        }
    }

    public F1(P p4) {
        X2.l.e(p4, "pigeonRegistrar");
        this.f1757a = p4;
    }

    public static final void g(W2.l lVar, String str, Object obj) {
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

    public abstract SslCertificate b(SslError sslError);

    public P c() {
        return this.f1757a;
    }

    public abstract W3 d(SslError sslError);

    public abstract boolean e(SslError sslError, W3 w32);

    public final void f(SslError sslError, final W2.l lVar) {
        X2.l.e(sslError, "pigeon_instanceArg");
        X2.l.e(lVar, "callback");
        if (c().c()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else {
            if (c().d().f(sslError)) {
                j.a aVar2 = K2.j.f2509n;
                lVar.k(K2.j.a(K2.j.b(K2.p.f2516a)));
                return;
            }
            long jC = c().d().c(sslError);
            final String str = "dev.flutter.pigeon.webview_flutter_android.SslError.pigeon_newInstance";
            new C1608a(c().a(), "dev.flutter.pigeon.webview_flutter_android.SslError.pigeon_newInstance", c().b()).d(L2.m.i(Long.valueOf(jC), b(sslError), h(sslError)), new C1608a.e() { // from class: H2.C1
                @Override // w2.C1608a.e
                public final void a(Object obj) {
                    F1.g(lVar, str, obj);
                }
            });
        }
    }

    public abstract String h(SslError sslError);
}
