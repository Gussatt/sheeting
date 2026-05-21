package H2;

import H2.AbstractC0290a1;
import K2.j;
import android.webkit.GeolocationPermissions;
import java.util.List;
import w2.C1608a;
import w2.InterfaceC1609b;
import w2.InterfaceC1615h;

/* JADX INFO: renamed from: H2.a1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0290a1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f1977b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P f1978a;

    /* JADX INFO: renamed from: H2.a1$a */
    public static final class a {
        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public static final void c(AbstractC0290a1 abstractC0290a1, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type android.webkit.GeolocationPermissions.Callback");
            GeolocationPermissions.Callback callback = (GeolocationPermissions.Callback) obj2;
            Object obj3 = list.get(1);
            X2.l.c(obj3, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj3;
            Object obj4 = list.get(2);
            X2.l.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
            Object obj5 = list.get(3);
            X2.l.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                abstractC0290a1.c(callback, str, zBooleanValue, ((Boolean) obj5).booleanValue());
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public final void b(InterfaceC1609b interfaceC1609b, final AbstractC0290a1 abstractC0290a1) {
            InterfaceC1615h c0295b;
            P pB;
            X2.l.e(interfaceC1609b, "binaryMessenger");
            if (abstractC0290a1 == null || (pB = abstractC0290a1.b()) == null || (c0295b = pB.b()) == null) {
                c0295b = new C0295b();
            }
            C1608a c1608a = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.invoke", c0295b);
            if (abstractC0290a1 != null) {
                c1608a.e(new C1608a.d() { // from class: H2.Z0
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        AbstractC0290a1.a.c(abstractC0290a1, obj, eVar);
                    }
                });
            } else {
                c1608a.e(null);
            }
        }

        public a() {
        }
    }

    public AbstractC0290a1(P p4) {
        X2.l.e(p4, "pigeonRegistrar");
        this.f1978a = p4;
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
        return this.f1978a;
    }

    public abstract void c(GeolocationPermissions.Callback callback, String str, boolean z3, boolean z4);

    public final void d(GeolocationPermissions.Callback callback, final W2.l lVar) {
        X2.l.e(callback, "pigeon_instanceArg");
        X2.l.e(lVar, "callback");
        if (b().c()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (b().d().f(callback)) {
            j.a aVar2 = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.p.f2516a)));
        } else {
            final String str = "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.pigeon_newInstance";
            new C1608a(b().a(), "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.pigeon_newInstance", b().b()).d(L2.l.b(Long.valueOf(b().d().c(callback))), new C1608a.e() { // from class: H2.Y0
                @Override // w2.C1608a.e
                public final void a(Object obj) {
                    AbstractC0290a1.e(lVar, str, obj);
                }
            });
        }
    }
}
