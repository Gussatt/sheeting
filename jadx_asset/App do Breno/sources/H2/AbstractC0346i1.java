package H2;

import H2.AbstractC0346i1;
import K2.j;
import java.util.List;
import w2.C1608a;
import w2.InterfaceC1609b;
import w2.InterfaceC1615h;

/* JADX INFO: renamed from: H2.i1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0346i1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f2062b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P f2063a;

    /* JADX INFO: renamed from: H2.i1$a */
    public static final class a {
        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public static final void c(AbstractC0346i1 abstractC0346i1, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type kotlin.Long");
            long jLongValue = ((Long) obj2).longValue();
            Object obj3 = list.get(1);
            X2.l.c(obj3, "null cannot be cast to non-null type kotlin.String");
            try {
                abstractC0346i1.b().d().b(abstractC0346i1.c((String) obj3), jLongValue);
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public final void b(InterfaceC1609b interfaceC1609b, final AbstractC0346i1 abstractC0346i1) {
            InterfaceC1615h c0295b;
            P pB;
            X2.l.e(interfaceC1609b, "binaryMessenger");
            if (abstractC0346i1 == null || (pB = abstractC0346i1.b()) == null || (c0295b = pB.b()) == null) {
                c0295b = new C0295b();
            }
            C1608a c1608a = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.pigeon_defaultConstructor", c0295b);
            if (abstractC0346i1 != null) {
                c1608a.e(new C1608a.d() { // from class: H2.h1
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        AbstractC0346i1.a.c(abstractC0346i1, obj, eVar);
                    }
                });
            } else {
                c1608a.e(null);
            }
        }

        public a() {
        }
    }

    public AbstractC0346i1(P p4) {
        X2.l.e(p4, "pigeonRegistrar");
        this.f2063a = p4;
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

    public P b() {
        return this.f2063a;
    }

    public abstract C0371m0 c(String str);

    public final void d(C0371m0 c0371m0, W2.l lVar) {
        X2.l.e(c0371m0, "pigeon_instanceArg");
        X2.l.e(lVar, "callback");
        if (b().c()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (b().d().f(c0371m0)) {
            j.a aVar2 = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.p.f2516a)));
        } else {
            j.a aVar3 = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("new-instance-error", "Attempting to create a new Dart instance of JavaScriptChannel, but the class has a nonnull callback method.", "")))));
        }
    }

    public final void e(C0371m0 c0371m0, String str, final W2.l lVar) {
        X2.l.e(c0371m0, "pigeon_instanceArg");
        X2.l.e(str, "messageArg");
        X2.l.e(lVar, "callback");
        if (b().c()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else {
            final String str2 = "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.postMessage";
            new C1608a(b().a(), "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.postMessage", b().b()).d(L2.m.i(c0371m0, str), new C1608a.e() { // from class: H2.g1
                @Override // w2.C1608a.e
                public final void a(Object obj) {
                    AbstractC0346i1.f(lVar, str2, obj);
                }
            });
        }
    }
}
