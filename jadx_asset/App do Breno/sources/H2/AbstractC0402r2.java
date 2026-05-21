package H2;

import K2.j;
import android.webkit.WebResourceResponse;
import java.util.List;
import w2.C1608a;

/* JADX INFO: renamed from: H2.r2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0402r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P f2130a;

    public AbstractC0402r2(P p4) {
        X2.l.e(p4, "pigeonRegistrar");
        this.f2130a = p4;
    }

    public static final void d(W2.l lVar, String str, Object obj) {
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
        return this.f2130a;
    }

    public final void c(WebResourceResponse webResourceResponse, final W2.l lVar) {
        X2.l.e(webResourceResponse, "pigeon_instanceArg");
        X2.l.e(lVar, "callback");
        if (b().c()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (b().d().f(webResourceResponse)) {
            j.a aVar2 = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.p.f2516a)));
        } else {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebResourceResponse.pigeon_newInstance";
            new C1608a(b().a(), "dev.flutter.pigeon.webview_flutter_android.WebResourceResponse.pigeon_newInstance", b().b()).d(L2.m.i(Long.valueOf(b().d().c(webResourceResponse)), Long.valueOf(e(webResourceResponse))), new C1608a.e() { // from class: H2.q2
                @Override // w2.C1608a.e
                public final void a(Object obj) {
                    AbstractC0402r2.d(lVar, str, obj);
                }
            });
        }
    }

    public abstract long e(WebResourceResponse webResourceResponse);
}
