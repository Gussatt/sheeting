package H2;

import K2.j;
import java.util.List;
import k0.AbstractC1138b;
import w2.C1608a;

/* JADX INFO: renamed from: H2.n2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0379n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P f2097a;

    public AbstractC0379n2(P p4) {
        X2.l.e(p4, "pigeonRegistrar");
        this.f2097a = p4;
    }

    public static final void f(W2.l lVar, String str, Object obj) {
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

    public abstract String b(AbstractC1138b abstractC1138b);

    public abstract long c(AbstractC1138b abstractC1138b);

    public P d() {
        return this.f2097a;
    }

    public final void e(AbstractC1138b abstractC1138b, final W2.l lVar) {
        X2.l.e(abstractC1138b, "pigeon_instanceArg");
        X2.l.e(lVar, "callback");
        if (d().c()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else {
            if (d().d().f(abstractC1138b)) {
                j.a aVar2 = K2.j.f2509n;
                lVar.k(K2.j.a(K2.j.b(K2.p.f2516a)));
                return;
            }
            long jC = d().d().c(abstractC1138b);
            long jC2 = c(abstractC1138b);
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebResourceErrorCompat.pigeon_newInstance";
            new C1608a(d().a(), "dev.flutter.pigeon.webview_flutter_android.WebResourceErrorCompat.pigeon_newInstance", d().b()).d(L2.m.i(Long.valueOf(jC), Long.valueOf(jC2), b(abstractC1138b)), new C1608a.e() { // from class: H2.m2
                @Override // w2.C1608a.e
                public final void a(Object obj) {
                    AbstractC0379n2.f(lVar, str, obj);
                }
            });
        }
    }
}
