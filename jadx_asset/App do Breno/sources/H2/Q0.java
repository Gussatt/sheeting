package H2;

import H2.Q0;
import K2.j;
import android.webkit.DownloadListener;
import java.util.List;
import w2.C1608a;
import w2.InterfaceC1609b;
import w2.InterfaceC1615h;

/* JADX INFO: loaded from: classes.dex */
public abstract class Q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f1842b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P f1843a;

    public static final class a {
        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public static final void c(Q0 q02, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type kotlin.Long");
            try {
                q02.b().d().b(q02.e(), ((Long) obj2).longValue());
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public final void b(InterfaceC1609b interfaceC1609b, final Q0 q02) {
            InterfaceC1615h c0295b;
            P pB;
            X2.l.e(interfaceC1609b, "binaryMessenger");
            if (q02 == null || (pB = q02.b()) == null || (c0295b = pB.b()) == null) {
                c0295b = new C0295b();
            }
            C1608a c1608a = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.DownloadListener.pigeon_defaultConstructor", c0295b);
            if (q02 != null) {
                c1608a.e(new C1608a.d() { // from class: H2.P0
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        Q0.a.c(q02, obj, eVar);
                    }
                });
            } else {
                c1608a.e(null);
            }
        }

        public a() {
        }
    }

    public Q0(P p4) {
        X2.l.e(p4, "pigeonRegistrar");
        this.f1843a = p4;
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
        return this.f1843a;
    }

    public final void c(DownloadListener downloadListener, String str, String str2, String str3, String str4, long j4, final W2.l lVar) {
        X2.l.e(downloadListener, "pigeon_instanceArg");
        X2.l.e(str, "urlArg");
        X2.l.e(str2, "userAgentArg");
        X2.l.e(str3, "contentDispositionArg");
        X2.l.e(str4, "mimetypeArg");
        X2.l.e(lVar, "callback");
        if (b().c()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else {
            final String str5 = "dev.flutter.pigeon.webview_flutter_android.DownloadListener.onDownloadStart";
            new C1608a(b().a(), "dev.flutter.pigeon.webview_flutter_android.DownloadListener.onDownloadStart", b().b()).d(L2.m.i(downloadListener, str, str2, str3, str4, Long.valueOf(j4)), new C1608a.e() { // from class: H2.O0
                @Override // w2.C1608a.e
                public final void a(Object obj) {
                    Q0.d(lVar, str5, obj);
                }
            });
        }
    }

    public abstract DownloadListener e();

    public final void f(DownloadListener downloadListener, W2.l lVar) {
        X2.l.e(downloadListener, "pigeon_instanceArg");
        X2.l.e(lVar, "callback");
        if (b().c()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (b().d().f(downloadListener)) {
            j.a aVar2 = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.p.f2516a)));
        } else {
            j.a aVar3 = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("new-instance-error", "Attempting to create a new Dart instance of DownloadListener, but the class has a nonnull callback method.", "")))));
        }
    }
}
