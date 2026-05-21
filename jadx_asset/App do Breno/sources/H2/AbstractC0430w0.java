package H2;

import H2.AbstractC0430w0;
import K2.j;
import java.security.cert.Certificate;
import java.util.List;
import w2.C1608a;
import w2.InterfaceC1609b;
import w2.InterfaceC1615h;

/* JADX INFO: renamed from: H2.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0430w0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f2180b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P f2181a;

    /* JADX INFO: renamed from: H2.w0$a */
    public static final class a {
        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public static final void c(AbstractC0430w0 abstractC0430w0, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type java.security.cert.Certificate");
            try {
                listB = L2.l.b(abstractC0430w0.b((Certificate) obj2));
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public final void b(InterfaceC1609b interfaceC1609b, final AbstractC0430w0 abstractC0430w0) {
            InterfaceC1615h c0295b;
            P pC;
            X2.l.e(interfaceC1609b, "binaryMessenger");
            if (abstractC0430w0 == null || (pC = abstractC0430w0.c()) == null || (c0295b = pC.b()) == null) {
                c0295b = new C0295b();
            }
            C1608a c1608a = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.Certificate.getEncoded", c0295b);
            if (abstractC0430w0 != null) {
                c1608a.e(new C1608a.d() { // from class: H2.v0
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        AbstractC0430w0.a.c(abstractC0430w0, obj, eVar);
                    }
                });
            } else {
                c1608a.e(null);
            }
        }

        public a() {
        }
    }

    public AbstractC0430w0(P p4) {
        X2.l.e(p4, "pigeonRegistrar");
        this.f2181a = p4;
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

    public abstract byte[] b(Certificate certificate);

    public P c() {
        return this.f2181a;
    }

    public final void d(Certificate certificate, final W2.l lVar) {
        X2.l.e(certificate, "pigeon_instanceArg");
        X2.l.e(lVar, "callback");
        if (c().c()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (c().d().f(certificate)) {
            j.a aVar2 = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.p.f2516a)));
        } else {
            final String str = "dev.flutter.pigeon.webview_flutter_android.Certificate.pigeon_newInstance";
            new C1608a(c().a(), "dev.flutter.pigeon.webview_flutter_android.Certificate.pigeon_newInstance", c().b()).d(L2.l.b(Long.valueOf(c().d().c(certificate))), new C1608a.e() { // from class: H2.u0
                @Override // w2.C1608a.e
                public final void a(Object obj) {
                    AbstractC0430w0.e(lVar, str, obj);
                }
            });
        }
    }
}
