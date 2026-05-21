package H2;

import H2.AbstractC0325f1;
import K2.j;
import android.webkit.HttpAuthHandler;
import java.util.List;
import w2.C1608a;
import w2.InterfaceC1609b;
import w2.InterfaceC1615h;

/* JADX INFO: renamed from: H2.f1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0325f1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f2041b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P f2042a;

    /* JADX INFO: renamed from: H2.f1$a */
    public static final class a {
        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public static final void e(AbstractC0325f1 abstractC0325f1, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
            try {
                listB = L2.l.b(Boolean.valueOf(abstractC0325f1.g((HttpAuthHandler) obj2)));
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public static final void f(AbstractC0325f1 abstractC0325f1, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
            try {
                abstractC0325f1.b((HttpAuthHandler) obj2);
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public static final void g(AbstractC0325f1 abstractC0325f1, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
            HttpAuthHandler httpAuthHandler = (HttpAuthHandler) obj2;
            Object obj3 = list.get(1);
            X2.l.c(obj3, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj3;
            Object obj4 = list.get(2);
            X2.l.c(obj4, "null cannot be cast to non-null type kotlin.String");
            try {
                abstractC0325f1.f(httpAuthHandler, str, (String) obj4);
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public final void d(InterfaceC1609b interfaceC1609b, final AbstractC0325f1 abstractC0325f1) {
            InterfaceC1615h c0295b;
            P pC;
            X2.l.e(interfaceC1609b, "binaryMessenger");
            if (abstractC0325f1 == null || (pC = abstractC0325f1.c()) == null || (c0295b = pC.b()) == null) {
                c0295b = new C0295b();
            }
            C1608a c1608a = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.useHttpAuthUsernamePassword", c0295b);
            if (abstractC0325f1 != null) {
                c1608a.e(new C1608a.d() { // from class: H2.c1
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        AbstractC0325f1.a.e(abstractC0325f1, obj, eVar);
                    }
                });
            } else {
                c1608a.e(null);
            }
            C1608a c1608a2 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.cancel", c0295b);
            if (abstractC0325f1 != null) {
                c1608a2.e(new C1608a.d() { // from class: H2.d1
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        AbstractC0325f1.a.f(abstractC0325f1, obj, eVar);
                    }
                });
            } else {
                c1608a2.e(null);
            }
            C1608a c1608a3 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.proceed", c0295b);
            if (abstractC0325f1 != null) {
                c1608a3.e(new C1608a.d() { // from class: H2.e1
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        AbstractC0325f1.a.g(abstractC0325f1, obj, eVar);
                    }
                });
            } else {
                c1608a3.e(null);
            }
        }

        public a() {
        }
    }

    public AbstractC0325f1(P p4) {
        X2.l.e(p4, "pigeonRegistrar");
        this.f2042a = p4;
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

    public abstract void b(HttpAuthHandler httpAuthHandler);

    public P c() {
        return this.f2042a;
    }

    public final void d(HttpAuthHandler httpAuthHandler, final W2.l lVar) {
        X2.l.e(httpAuthHandler, "pigeon_instanceArg");
        X2.l.e(lVar, "callback");
        if (c().c()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (c().d().f(httpAuthHandler)) {
            j.a aVar2 = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.p.f2516a)));
        } else {
            final String str = "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.pigeon_newInstance";
            new C1608a(c().a(), "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.pigeon_newInstance", c().b()).d(L2.l.b(Long.valueOf(c().d().c(httpAuthHandler))), new C1608a.e() { // from class: H2.b1
                @Override // w2.C1608a.e
                public final void a(Object obj) {
                    AbstractC0325f1.e(lVar, str, obj);
                }
            });
        }
    }

    public abstract void f(HttpAuthHandler httpAuthHandler, String str, String str2);

    public abstract boolean g(HttpAuthHandler httpAuthHandler);
}
