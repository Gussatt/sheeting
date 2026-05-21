package H2;

import H2.AbstractC0372m1;
import K2.j;
import android.webkit.PermissionRequest;
import java.util.List;
import w2.C1608a;
import w2.InterfaceC1609b;
import w2.InterfaceC1615h;

/* JADX INFO: renamed from: H2.m1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0372m1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f2090b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P f2091a;

    /* JADX INFO: renamed from: H2.m1$a */
    public static final class a {
        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public static final void d(AbstractC0372m1 abstractC0372m1, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type android.webkit.PermissionRequest");
            PermissionRequest permissionRequest = (PermissionRequest) obj2;
            Object obj3 = list.get(1);
            X2.l.c(obj3, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            try {
                abstractC0372m1.d(permissionRequest, (List) obj3);
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public static final void e(AbstractC0372m1 abstractC0372m1, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type android.webkit.PermissionRequest");
            try {
                abstractC0372m1.b((PermissionRequest) obj2);
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public final void c(InterfaceC1609b interfaceC1609b, final AbstractC0372m1 abstractC0372m1) {
            InterfaceC1615h c0295b;
            P pC;
            X2.l.e(interfaceC1609b, "binaryMessenger");
            if (abstractC0372m1 == null || (pC = abstractC0372m1.c()) == null || (c0295b = pC.b()) == null) {
                c0295b = new C0295b();
            }
            C1608a c1608a = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.grant", c0295b);
            if (abstractC0372m1 != null) {
                c1608a.e(new C1608a.d() { // from class: H2.k1
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        AbstractC0372m1.a.d(abstractC0372m1, obj, eVar);
                    }
                });
            } else {
                c1608a.e(null);
            }
            C1608a c1608a2 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.deny", c0295b);
            if (abstractC0372m1 != null) {
                c1608a2.e(new C1608a.d() { // from class: H2.l1
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        AbstractC0372m1.a.e(abstractC0372m1, obj, eVar);
                    }
                });
            } else {
                c1608a2.e(null);
            }
        }

        public a() {
        }
    }

    public AbstractC0372m1(P p4) {
        X2.l.e(p4, "pigeonRegistrar");
        this.f2091a = p4;
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

    public abstract void b(PermissionRequest permissionRequest);

    public P c() {
        return this.f2091a;
    }

    public abstract void d(PermissionRequest permissionRequest, List list);

    public final void e(PermissionRequest permissionRequest, final W2.l lVar) {
        X2.l.e(permissionRequest, "pigeon_instanceArg");
        X2.l.e(lVar, "callback");
        if (c().c()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (c().d().f(permissionRequest)) {
            j.a aVar2 = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.p.f2516a)));
        } else {
            long jC = c().d().c(permissionRequest);
            final String str = "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.pigeon_newInstance";
            new C1608a(c().a(), "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.pigeon_newInstance", c().b()).d(L2.m.i(Long.valueOf(jC), g(permissionRequest)), new C1608a.e() { // from class: H2.j1
                @Override // w2.C1608a.e
                public final void a(Object obj) {
                    AbstractC0372m1.f(lVar, str, obj);
                }
            });
        }
    }

    public abstract List g(PermissionRequest permissionRequest);
}
