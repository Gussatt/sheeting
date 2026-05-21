package H2;

import K2.j;
import android.webkit.ConsoleMessage;
import java.util.List;
import w2.C1608a;

/* JADX INFO: loaded from: classes.dex */
public abstract class D0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P f1740a;

    public D0(P p4) {
        X2.l.e(p4, "pigeonRegistrar");
        this.f1740a = p4;
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

    public P b() {
        return this.f1740a;
    }

    public abstract U c(ConsoleMessage consoleMessage);

    public abstract long d(ConsoleMessage consoleMessage);

    public abstract String e(ConsoleMessage consoleMessage);

    public final void f(ConsoleMessage consoleMessage, final W2.l lVar) {
        X2.l.e(consoleMessage, "pigeon_instanceArg");
        X2.l.e(lVar, "callback");
        if (b().c()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
            return;
        }
        if (b().d().f(consoleMessage)) {
            j.a aVar2 = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.p.f2516a)));
            return;
        }
        long jC = b().d().c(consoleMessage);
        long jD = d(consoleMessage);
        final String str = "dev.flutter.pigeon.webview_flutter_android.ConsoleMessage.pigeon_newInstance";
        new C1608a(b().a(), "dev.flutter.pigeon.webview_flutter_android.ConsoleMessage.pigeon_newInstance", b().b()).d(L2.m.i(Long.valueOf(jC), Long.valueOf(jD), e(consoleMessage), c(consoleMessage), h(consoleMessage)), new C1608a.e() { // from class: H2.C0
            @Override // w2.C1608a.e
            public final void a(Object obj) {
                D0.g(lVar, str, obj);
            }
        });
    }

    public abstract String h(ConsoleMessage consoleMessage);
}
