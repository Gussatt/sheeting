package H2;

import H2.N0;
import K2.j;
import android.webkit.WebChromeClient;
import java.util.List;
import w2.C1608a;
import w2.InterfaceC1609b;
import w2.InterfaceC1615h;

/* JADX INFO: loaded from: classes.dex */
public abstract class N0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f1813b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P f1814a;

    public static final class a {
        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public static final void c(N0 n02, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type android.webkit.WebChromeClient.CustomViewCallback");
            try {
                n02.c((WebChromeClient.CustomViewCallback) obj2);
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public final void b(InterfaceC1609b interfaceC1609b, final N0 n02) {
            InterfaceC1615h c0295b;
            P pB;
            X2.l.e(interfaceC1609b, "binaryMessenger");
            if (n02 == null || (pB = n02.b()) == null || (c0295b = pB.b()) == null) {
                c0295b = new C0295b();
            }
            C1608a c1608a = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.onCustomViewHidden", c0295b);
            if (n02 != null) {
                c1608a.e(new C1608a.d() { // from class: H2.M0
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        N0.a.c(n02, obj, eVar);
                    }
                });
            } else {
                c1608a.e(null);
            }
        }

        public a() {
        }
    }

    public N0(P p4) {
        X2.l.e(p4, "pigeonRegistrar");
        this.f1814a = p4;
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

    public P b() {
        return this.f1814a;
    }

    public abstract void c(WebChromeClient.CustomViewCallback customViewCallback);

    public final void d(WebChromeClient.CustomViewCallback customViewCallback, final W2.l lVar) {
        X2.l.e(customViewCallback, "pigeon_instanceArg");
        X2.l.e(lVar, "callback");
        if (b().c()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (b().d().f(customViewCallback)) {
            j.a aVar2 = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.p.f2516a)));
        } else {
            final String str = "dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.pigeon_newInstance";
            new C1608a(b().a(), "dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.pigeon_newInstance", b().b()).d(L2.l.b(Long.valueOf(b().d().c(customViewCallback))), new C1608a.e() { // from class: H2.L0
                @Override // w2.C1608a.e
                public final void a(Object obj) {
                    N0.e(lVar, str, obj);
                }
            });
        }
    }
}
