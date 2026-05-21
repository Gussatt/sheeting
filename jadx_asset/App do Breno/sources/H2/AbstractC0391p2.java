package H2;

import K2.j;
import android.webkit.WebResourceRequest;
import java.util.List;
import java.util.Map;
import w2.C1608a;

/* JADX INFO: renamed from: H2.p2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0391p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P f2114a;

    public AbstractC0391p2(P p4) {
        X2.l.e(p4, "pigeonRegistrar");
        this.f2114a = p4;
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

    public P b() {
        return this.f2114a;
    }

    public abstract boolean c(WebResourceRequest webResourceRequest);

    public abstract boolean d(WebResourceRequest webResourceRequest);

    public abstract Boolean e(WebResourceRequest webResourceRequest);

    public abstract String f(WebResourceRequest webResourceRequest);

    public final void g(WebResourceRequest webResourceRequest, final W2.l lVar) {
        X2.l.e(webResourceRequest, "pigeon_instanceArg");
        X2.l.e(lVar, "callback");
        if (b().c()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
            return;
        }
        if (b().d().f(webResourceRequest)) {
            j.a aVar2 = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.p.f2516a)));
            return;
        }
        long jC = b().d().c(webResourceRequest);
        String strJ = j(webResourceRequest);
        boolean zD = d(webResourceRequest);
        Boolean boolE = e(webResourceRequest);
        boolean zC = c(webResourceRequest);
        final String str = "dev.flutter.pigeon.webview_flutter_android.WebResourceRequest.pigeon_newInstance";
        new C1608a(b().a(), "dev.flutter.pigeon.webview_flutter_android.WebResourceRequest.pigeon_newInstance", b().b()).d(L2.m.i(Long.valueOf(jC), strJ, Boolean.valueOf(zD), boolE, Boolean.valueOf(zC), f(webResourceRequest), i(webResourceRequest)), new C1608a.e() { // from class: H2.o2
            @Override // w2.C1608a.e
            public final void a(Object obj) {
                AbstractC0391p2.h(lVar, str, obj);
            }
        });
    }

    public abstract Map i(WebResourceRequest webResourceRequest);

    public abstract String j(WebResourceRequest webResourceRequest);
}
