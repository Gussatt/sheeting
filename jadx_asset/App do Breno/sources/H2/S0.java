package H2;

import K2.j;
import android.webkit.WebChromeClient;
import java.util.List;
import w2.C1608a;

/* JADX INFO: loaded from: classes.dex */
public abstract class S0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P f1864a;

    public S0(P p4) {
        X2.l.e(p4, "pigeonRegistrar");
        this.f1864a = p4;
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

    public abstract List b(WebChromeClient.FileChooserParams fileChooserParams);

    public abstract String c(WebChromeClient.FileChooserParams fileChooserParams);

    public P d() {
        return this.f1864a;
    }

    public abstract boolean e(WebChromeClient.FileChooserParams fileChooserParams);

    public abstract EnumC0310d0 f(WebChromeClient.FileChooserParams fileChooserParams);

    public final void g(WebChromeClient.FileChooserParams fileChooserParams, final W2.l lVar) {
        X2.l.e(fileChooserParams, "pigeon_instanceArg");
        X2.l.e(lVar, "callback");
        if (d().c()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
            return;
        }
        if (d().d().f(fileChooserParams)) {
            j.a aVar2 = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.p.f2516a)));
            return;
        }
        long jC = d().d().c(fileChooserParams);
        boolean zE = e(fileChooserParams);
        final String str = "dev.flutter.pigeon.webview_flutter_android.FileChooserParams.pigeon_newInstance";
        new C1608a(d().a(), "dev.flutter.pigeon.webview_flutter_android.FileChooserParams.pigeon_newInstance", d().b()).d(L2.m.i(Long.valueOf(jC), Boolean.valueOf(zE), b(fileChooserParams), f(fileChooserParams), c(fileChooserParams)), new C1608a.e() { // from class: H2.R0
            @Override // w2.C1608a.e
            public final void a(Object obj) {
                S0.h(lVar, str, obj);
            }
        });
    }
}
