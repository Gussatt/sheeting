package H2;

import H2.J1;
import K2.j;
import android.webkit.SslErrorHandler;
import java.util.List;
import w2.C1608a;
import w2.InterfaceC1609b;
import w2.InterfaceC1615h;

/* JADX INFO: loaded from: classes.dex */
public abstract class J1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f1782b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P f1783a;

    public static final class a {
        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public static final void d(J1 j12, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type android.webkit.SslErrorHandler");
            try {
                j12.b((SslErrorHandler) obj2);
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public static final void e(J1 j12, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type android.webkit.SslErrorHandler");
            try {
                j12.f((SslErrorHandler) obj2);
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public final void c(InterfaceC1609b interfaceC1609b, final J1 j12) {
            InterfaceC1615h c0295b;
            P pC;
            X2.l.e(interfaceC1609b, "binaryMessenger");
            if (j12 == null || (pC = j12.c()) == null || (c0295b = pC.b()) == null) {
                c0295b = new C0295b();
            }
            C1608a c1608a = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.cancel", c0295b);
            if (j12 != null) {
                c1608a.e(new C1608a.d() { // from class: H2.H1
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        J1.a.d(j12, obj, eVar);
                    }
                });
            } else {
                c1608a.e(null);
            }
            C1608a c1608a2 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.proceed", c0295b);
            if (j12 != null) {
                c1608a2.e(new C1608a.d() { // from class: H2.I1
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        J1.a.e(j12, obj, eVar);
                    }
                });
            } else {
                c1608a2.e(null);
            }
        }

        public a() {
        }
    }

    public J1(P p4) {
        X2.l.e(p4, "pigeonRegistrar");
        this.f1783a = p4;
    }

    public static final void e(W2.l lVar, String str, Object obj) {
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

    public abstract void b(SslErrorHandler sslErrorHandler);

    public P c() {
        return this.f1783a;
    }

    public final void d(SslErrorHandler sslErrorHandler, final W2.l lVar) {
        X2.l.e(sslErrorHandler, "pigeon_instanceArg");
        X2.l.e(lVar, "callback");
        if (c().c()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (c().d().f(sslErrorHandler)) {
            j.a aVar2 = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.p.f2516a)));
        } else {
            final String str = "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.pigeon_newInstance";
            new C1608a(c().a(), "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.pigeon_newInstance", c().b()).d(L2.l.b(Long.valueOf(c().d().c(sslErrorHandler))), new C1608a.e() { // from class: H2.G1
                @Override // w2.C1608a.e
                public final void a(Object obj) {
                    J1.e(lVar, str, obj);
                }
            });
        }
    }

    public abstract void f(SslErrorHandler sslErrorHandler);
}
