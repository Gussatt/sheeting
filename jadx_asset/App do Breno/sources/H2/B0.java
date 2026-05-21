package H2;

import H2.B0;
import K2.j;
import android.webkit.ClientCertRequest;
import java.security.PrivateKey;
import java.util.List;
import w2.C1608a;
import w2.InterfaceC1609b;
import w2.InterfaceC1615h;

/* JADX INFO: loaded from: classes.dex */
public abstract class B0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f1715b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P f1716a;

    public static final class a {
        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public static final void e(B0 b02, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
            try {
                b02.b((ClientCertRequest) obj2);
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public static final void f(B0 b02, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
            try {
                b02.d((ClientCertRequest) obj2);
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public static final void g(B0 b02, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
            ClientCertRequest clientCertRequest = (ClientCertRequest) obj2;
            Object obj3 = list.get(1);
            X2.l.c(obj3, "null cannot be cast to non-null type java.security.PrivateKey");
            PrivateKey privateKey = (PrivateKey) obj3;
            Object obj4 = list.get(2);
            X2.l.c(obj4, "null cannot be cast to non-null type kotlin.collections.List<java.security.cert.X509Certificate>");
            try {
                b02.g(clientCertRequest, privateKey, (List) obj4);
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public final void d(InterfaceC1609b interfaceC1609b, final B0 b02) {
            InterfaceC1615h c0295b;
            P pC;
            X2.l.e(interfaceC1609b, "binaryMessenger");
            if (b02 == null || (pC = b02.c()) == null || (c0295b = pC.b()) == null) {
                c0295b = new C0295b();
            }
            C1608a c1608a = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.cancel", c0295b);
            if (b02 != null) {
                c1608a.e(new C1608a.d() { // from class: H2.y0
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        B0.a.e(b02, obj, eVar);
                    }
                });
            } else {
                c1608a.e(null);
            }
            C1608a c1608a2 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.ignore", c0295b);
            if (b02 != null) {
                c1608a2.e(new C1608a.d() { // from class: H2.z0
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        B0.a.f(b02, obj, eVar);
                    }
                });
            } else {
                c1608a2.e(null);
            }
            C1608a c1608a3 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.proceed", c0295b);
            if (b02 != null) {
                c1608a3.e(new C1608a.d() { // from class: H2.A0
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        B0.a.g(b02, obj, eVar);
                    }
                });
            } else {
                c1608a3.e(null);
            }
        }

        public a() {
        }
    }

    public B0(P p4) {
        X2.l.e(p4, "pigeonRegistrar");
        this.f1716a = p4;
    }

    public static final void f(W2.l lVar, String str, Object obj) {
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

    public abstract void b(ClientCertRequest clientCertRequest);

    public P c() {
        return this.f1716a;
    }

    public abstract void d(ClientCertRequest clientCertRequest);

    public final void e(ClientCertRequest clientCertRequest, final W2.l lVar) {
        X2.l.e(clientCertRequest, "pigeon_instanceArg");
        X2.l.e(lVar, "callback");
        if (c().c()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (c().d().f(clientCertRequest)) {
            j.a aVar2 = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.p.f2516a)));
        } else {
            final String str = "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.pigeon_newInstance";
            new C1608a(c().a(), "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.pigeon_newInstance", c().b()).d(L2.l.b(Long.valueOf(c().d().c(clientCertRequest))), new C1608a.e() { // from class: H2.x0
                @Override // w2.C1608a.e
                public final void a(Object obj) {
                    B0.f(lVar, str, obj);
                }
            });
        }
    }

    public abstract void g(ClientCertRequest clientCertRequest, PrivateKey privateKey, List list);
}
