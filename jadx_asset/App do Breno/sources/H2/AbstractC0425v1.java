package H2;

import H2.AbstractC0425v1;
import K2.j;
import android.net.http.SslCertificate;
import java.security.cert.X509Certificate;
import java.util.List;
import w2.C1608a;
import w2.InterfaceC1609b;
import w2.InterfaceC1615h;

/* JADX INFO: renamed from: H2.v1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0425v1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f2172b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P f2173a;

    /* JADX INFO: renamed from: H2.v1$a */
    public static final class a {
        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public static final void g(AbstractC0425v1 abstractC0425v1, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate");
            try {
                listB = L2.l.b(abstractC0425v1.b((SslCertificate) obj2));
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public static final void h(AbstractC0425v1 abstractC0425v1, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate");
            try {
                listB = L2.l.b(abstractC0425v1.c((SslCertificate) obj2));
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public static final void i(AbstractC0425v1 abstractC0425v1, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate");
            try {
                listB = L2.l.b(abstractC0425v1.e((SslCertificate) obj2));
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public static final void j(AbstractC0425v1 abstractC0425v1, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate");
            try {
                listB = L2.l.b(abstractC0425v1.f((SslCertificate) obj2));
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public static final void k(AbstractC0425v1 abstractC0425v1, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate");
            try {
                listB = L2.l.b(abstractC0425v1.g((SslCertificate) obj2));
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public final void f(InterfaceC1609b interfaceC1609b, final AbstractC0425v1 abstractC0425v1) {
            InterfaceC1615h c0295b;
            P pD;
            X2.l.e(interfaceC1609b, "binaryMessenger");
            if (abstractC0425v1 == null || (pD = abstractC0425v1.d()) == null || (c0295b = pD.b()) == null) {
                c0295b = new C0295b();
            }
            C1608a c1608a = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getIssuedBy", c0295b);
            if (abstractC0425v1 != null) {
                c1608a.e(new C1608a.d() { // from class: H2.q1
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        AbstractC0425v1.a.g(abstractC0425v1, obj, eVar);
                    }
                });
            } else {
                c1608a.e(null);
            }
            C1608a c1608a2 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getIssuedTo", c0295b);
            if (abstractC0425v1 != null) {
                c1608a2.e(new C1608a.d() { // from class: H2.r1
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        AbstractC0425v1.a.h(abstractC0425v1, obj, eVar);
                    }
                });
            } else {
                c1608a2.e(null);
            }
            C1608a c1608a3 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getValidNotAfterMsSinceEpoch", c0295b);
            if (abstractC0425v1 != null) {
                c1608a3.e(new C1608a.d() { // from class: H2.s1
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        AbstractC0425v1.a.i(abstractC0425v1, obj, eVar);
                    }
                });
            } else {
                c1608a3.e(null);
            }
            C1608a c1608a4 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getValidNotBeforeMsSinceEpoch", c0295b);
            if (abstractC0425v1 != null) {
                c1608a4.e(new C1608a.d() { // from class: H2.t1
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        AbstractC0425v1.a.j(abstractC0425v1, obj, eVar);
                    }
                });
            } else {
                c1608a4.e(null);
            }
            C1608a c1608a5 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getX509Certificate", c0295b);
            if (abstractC0425v1 != null) {
                c1608a5.e(new C1608a.d() { // from class: H2.u1
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        AbstractC0425v1.a.k(abstractC0425v1, obj, eVar);
                    }
                });
            } else {
                c1608a5.e(null);
            }
        }

        public a() {
        }
    }

    public AbstractC0425v1(P p4) {
        X2.l.e(p4, "pigeonRegistrar");
        this.f2173a = p4;
    }

    public static final void i(W2.l lVar, String str, Object obj) {
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

    public abstract SslCertificate.DName b(SslCertificate sslCertificate);

    public abstract SslCertificate.DName c(SslCertificate sslCertificate);

    public P d() {
        return this.f2173a;
    }

    public abstract Long e(SslCertificate sslCertificate);

    public abstract Long f(SslCertificate sslCertificate);

    public abstract X509Certificate g(SslCertificate sslCertificate);

    public final void h(SslCertificate sslCertificate, final W2.l lVar) {
        X2.l.e(sslCertificate, "pigeon_instanceArg");
        X2.l.e(lVar, "callback");
        if (d().c()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (d().d().f(sslCertificate)) {
            j.a aVar2 = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.p.f2516a)));
        } else {
            final String str = "dev.flutter.pigeon.webview_flutter_android.SslCertificate.pigeon_newInstance";
            new C1608a(d().a(), "dev.flutter.pigeon.webview_flutter_android.SslCertificate.pigeon_newInstance", d().b()).d(L2.l.b(Long.valueOf(d().d().c(sslCertificate))), new C1608a.e() { // from class: H2.p1
                @Override // w2.C1608a.e
                public final void a(Object obj) {
                    AbstractC0425v1.i(lVar, str, obj);
                }
            });
        }
    }
}
