package H2;

import K2.j;
import java.security.PrivateKey;
import java.util.List;
import w2.C1608a;

/* JADX INFO: renamed from: H2.o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0384o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P f2099a;

    public C0384o1(P p4) {
        X2.l.e(p4, "pigeonRegistrar");
        this.f2099a = p4;
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
        return this.f2099a;
    }

    public final void c(PrivateKey privateKey, final W2.l lVar) {
        X2.l.e(privateKey, "pigeon_instanceArg");
        X2.l.e(lVar, "callback");
        if (b().c()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (b().d().f(privateKey)) {
            j.a aVar2 = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.p.f2516a)));
        } else {
            final String str = "dev.flutter.pigeon.webview_flutter_android.PrivateKey.pigeon_newInstance";
            new C1608a(b().a(), "dev.flutter.pigeon.webview_flutter_android.PrivateKey.pigeon_newInstance", b().b()).d(L2.l.b(Long.valueOf(b().d().c(privateKey))), new C1608a.e() { // from class: H2.n1
                @Override // w2.C1608a.e
                public final void a(Object obj) {
                    C0384o1.d(lVar, str, obj);
                }
            });
        }
    }
}
