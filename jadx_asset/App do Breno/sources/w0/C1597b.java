package w0;

import K2.p;
import X2.g;
import X2.l;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import o.C1462c;
import s2.InterfaceC1536a;
import t2.InterfaceC1544a;
import t2.c;
import w2.C1616i;
import w2.C1617j;
import w2.InterfaceC1619l;

/* JADX INFO: renamed from: w0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1597b implements InterfaceC1536a, C1617j.c, InterfaceC1544a, InterfaceC1619l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f11772f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static C1617j.d f11773g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static W2.a f11774h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11775c = 1001;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1617j f11776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f11777e;

    /* JADX INFO: renamed from: w0.b$a */
    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        public a() {
        }
    }

    public static final p e(Activity activity) {
        Intent launchIntentForPackage = activity.getPackageManager().getLaunchIntentForPackage(activity.getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.setPackage(null);
        }
        if (launchIntentForPackage != null) {
            launchIntentForPackage.setFlags(67108864);
        }
        activity.startActivity(launchIntentForPackage);
        return p.f2516a;
    }

    @Override // w2.InterfaceC1619l
    public boolean a(int i4, int i5, Intent intent) {
        C1617j.d dVar;
        if (i4 != this.f11775c || (dVar = f11773g) == null) {
            return false;
        }
        dVar.b("authorization-error/canceled", "The user closed the Custom Tab", null);
        f11773g = null;
        f11774h = null;
        return false;
    }

    @Override // s2.InterfaceC1536a
    public void c(InterfaceC1536a.b bVar) {
        l.e(bVar, "flutterPluginBinding");
        C1617j c1617j = new C1617j(bVar.b(), "com.aboutyou.dart_packages.sign_in_with_apple");
        this.f11776d = c1617j;
        c1617j.e(this);
    }

    @Override // t2.InterfaceC1544a
    public void d() {
        c cVar = this.f11777e;
        if (cVar != null) {
            cVar.b(this);
        }
        this.f11777e = null;
    }

    @Override // t2.InterfaceC1544a
    public void f(c cVar) {
        l.e(cVar, "binding");
        h(cVar);
    }

    @Override // w2.C1617j.c
    public void g(C1616i c1616i, C1617j.d dVar) {
        l.e(c1616i, "call");
        l.e(dVar, "result");
        String str = c1616i.f11879a;
        if (l.a(str, "isAvailable")) {
            dVar.a(Boolean.TRUE);
            return;
        }
        if (!l.a(str, "performAuthorizationRequest")) {
            dVar.c();
            return;
        }
        c cVar = this.f11777e;
        final Activity activityD = cVar != null ? cVar.d() : null;
        if (activityD == null) {
            dVar.b("MISSING_ACTIVITY", "Plugin is not attached to an activity", c1616i.f11880b);
            return;
        }
        String str2 = (String) c1616i.a("url");
        if (str2 == null) {
            dVar.b("MISSING_ARG", "Missing 'url' argument", c1616i.f11880b);
            return;
        }
        C1617j.d dVar2 = f11773g;
        if (dVar2 != null) {
            dVar2.b("NEW_REQUEST", "A new request came in while this was still pending. The previous request (this one) was then cancelled.", null);
        }
        W2.a aVar = f11774h;
        if (aVar != null) {
            l.b(aVar);
            aVar.e();
        }
        f11773g = dVar;
        f11774h = new W2.a() { // from class: w0.a
            @Override // W2.a
            public final Object e() {
                return C1597b.e(activityD);
            }
        };
        C1462c c1462cA = new C1462c.d().a();
        l.d(c1462cA, "build(...)");
        c1462cA.f10719a.setData(Uri.parse(str2));
        activityD.startActivityForResult(c1462cA.f10719a, this.f11775c, c1462cA.f10720b);
    }

    @Override // t2.InterfaceC1544a
    public void h(c cVar) {
        l.e(cVar, "binding");
        this.f11777e = cVar;
        cVar.e(this);
    }

    @Override // t2.InterfaceC1544a
    public void i() {
        d();
    }

    @Override // s2.InterfaceC1536a
    public void r(InterfaceC1536a.b bVar) {
        l.e(bVar, "binding");
        C1617j c1617j = this.f11776d;
        if (c1617j != null) {
            c1617j.e(null);
        }
        this.f11776d = null;
    }
}
