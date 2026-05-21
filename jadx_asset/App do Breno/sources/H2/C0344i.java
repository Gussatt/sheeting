package H2;

import H2.C0344i;
import K2.j;
import java.util.List;
import w2.C1608a;
import w2.InterfaceC1609b;
import w2.InterfaceC1615h;

/* JADX INFO: renamed from: H2.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0344i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f2059b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final K2.f f2060c = K2.g.a(new W2.a() { // from class: H2.e
        @Override // W2.a
        public final Object e() {
            return C0344i.d();
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1609b f2061a;

    /* JADX INFO: renamed from: H2.i$a */
    public static final class a {
        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public static final void e(C0309d c0309d, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type kotlin.Long");
            try {
                c0309d.m(((Long) obj2).longValue());
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public static final void f(C0309d c0309d, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            try {
                c0309d.e();
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public final InterfaceC1615h c() {
            return (InterfaceC1615h) C0344i.f2060c.getValue();
        }

        public final void d(InterfaceC1609b interfaceC1609b, final C0309d c0309d) {
            X2.l.e(interfaceC1609b, "binaryMessenger");
            C1608a c1608a = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference", c());
            if (c0309d != null) {
                c1608a.e(new C1608a.d() { // from class: H2.g
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        C0344i.a.e(c0309d, obj, eVar);
                    }
                });
            } else {
                c1608a.e(null);
            }
            C1608a c1608a2 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.clear", c());
            if (c0309d != null) {
                c1608a2.e(new C1608a.d() { // from class: H2.h
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        C0344i.a.f(c0309d, obj, eVar);
                    }
                });
            } else {
                c1608a2.e(null);
            }
        }

        public a() {
        }
    }

    public C0344i(InterfaceC1609b interfaceC1609b) {
        X2.l.e(interfaceC1609b, "binaryMessenger");
        this.f2061a = interfaceC1609b;
    }

    public static final C0295b d() {
        return new C0295b();
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

    public final void e(long j4, final W2.l lVar) {
        X2.l.e(lVar, "callback");
        final String str = "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference";
        new C1608a(this.f2061a, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference", f2059b.c()).d(L2.l.b(Long.valueOf(j4)), new C1608a.e() { // from class: H2.f
            @Override // w2.C1608a.e
            public final void a(Object obj) {
                C0344i.f(lVar, str, obj);
            }
        });
    }
}
