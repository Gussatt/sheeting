package H2;

import H2.X0;
import K2.j;
import java.util.List;
import w2.C1608a;
import w2.InterfaceC1609b;
import w2.InterfaceC1615h;

/* JADX INFO: loaded from: classes.dex */
public abstract class X0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f1929b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P f1930a;

    public static final class a {
        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public static final void e(X0 x02, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type kotlin.Long");
            try {
                x02.c().d().b(x02.d(), ((Long) obj2).longValue());
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public static final void f(X0 x02, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
            AbstractC0324f0 abstractC0324f0 = (AbstractC0324f0) obj2;
            Object obj3 = list.get(1);
            X2.l.c(obj3, "null cannot be cast to non-null type kotlin.String");
            try {
                listB = L2.l.b(x02.e(abstractC0324f0, (String) obj3));
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public static final void g(X0 x02, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
            AbstractC0324f0 abstractC0324f0 = (AbstractC0324f0) obj2;
            Object obj3 = list.get(1);
            X2.l.c(obj3, "null cannot be cast to non-null type kotlin.String");
            try {
                listB = L2.l.b(x02.b(abstractC0324f0, (String) obj3));
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public final void d(InterfaceC1609b interfaceC1609b, final X0 x02) {
            InterfaceC1615h c0295b;
            P pC;
            X2.l.e(interfaceC1609b, "binaryMessenger");
            if (x02 == null || (pC = x02.c()) == null || (c0295b = pC.b()) == null) {
                c0295b = new C0295b();
            }
            C1608a c1608a = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.instance", c0295b);
            if (x02 != null) {
                c1608a.e(new C1608a.d() { // from class: H2.U0
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        X0.a.e(x02, obj, eVar);
                    }
                });
            } else {
                c1608a.e(null);
            }
            C1608a c1608a2 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.list", c0295b);
            if (x02 != null) {
                c1608a2.e(new C1608a.d() { // from class: H2.V0
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        X0.a.f(x02, obj, eVar);
                    }
                });
            } else {
                c1608a2.e(null);
            }
            C1608a c1608a3 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.getAssetFilePathByName", c0295b);
            if (x02 != null) {
                c1608a3.e(new C1608a.d() { // from class: H2.W0
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        X0.a.g(x02, obj, eVar);
                    }
                });
            } else {
                c1608a3.e(null);
            }
        }

        public a() {
        }
    }

    public X0(P p4) {
        X2.l.e(p4, "pigeonRegistrar");
        this.f1930a = p4;
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

    public abstract String b(AbstractC0324f0 abstractC0324f0, String str);

    public P c() {
        return this.f1930a;
    }

    public abstract AbstractC0324f0 d();

    public abstract List e(AbstractC0324f0 abstractC0324f0, String str);

    public final void f(AbstractC0324f0 abstractC0324f0, final W2.l lVar) {
        X2.l.e(abstractC0324f0, "pigeon_instanceArg");
        X2.l.e(lVar, "callback");
        if (c().c()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (c().d().f(abstractC0324f0)) {
            j.a aVar2 = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.p.f2516a)));
        } else {
            final String str = "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.pigeon_newInstance";
            new C1608a(c().a(), "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.pigeon_newInstance", c().b()).d(L2.l.b(Long.valueOf(c().d().c(abstractC0324f0))), new C1608a.e() { // from class: H2.T0
                @Override // w2.C1608a.e
                public final void a(Object obj) {
                    X0.g(lVar, str, obj);
                }
            });
        }
    }
}
