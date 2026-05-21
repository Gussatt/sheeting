package H2;

import K2.j;
import java.util.List;
import w2.C1608a;

/* JADX INFO: loaded from: classes.dex */
public abstract class L3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P f1803a;

    public L3(P p4) {
        X2.l.e(p4, "pigeonRegistrar");
        this.f1803a = p4;
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
        return this.f1803a;
    }

    public final void c(E5 e5, final W2.l lVar) {
        X2.l.e(e5, "pigeon_instanceArg");
        X2.l.e(lVar, "callback");
        if (b().c()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else {
            if (b().d().f(e5)) {
                j.a aVar2 = K2.j.f2509n;
                lVar.k(K2.j.a(K2.j.b(K2.p.f2516a)));
                return;
            }
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebViewPoint.pigeon_newInstance";
            new C1608a(b().a(), "dev.flutter.pigeon.webview_flutter_android.WebViewPoint.pigeon_newInstance", b().b()).d(L2.m.i(Long.valueOf(b().d().c(e5)), Long.valueOf(e(e5)), Long.valueOf(f(e5))), new C1608a.e() { // from class: H2.K3
                @Override // w2.C1608a.e
                public final void a(Object obj) {
                    L3.d(lVar, str, obj);
                }
            });
        }
    }

    public abstract long e(E5 e5);

    public abstract long f(E5 e5);
}
