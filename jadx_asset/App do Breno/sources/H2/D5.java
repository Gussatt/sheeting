package H2;

import H2.AbstractC0324f0;
import s2.InterfaceC1536a;
import t2.InterfaceC1544a;

/* JADX INFO: loaded from: classes.dex */
public class D5 implements InterfaceC1536a, InterfaceC1544a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC1536a.b f1745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public O3 f1746d;

    @Override // s2.InterfaceC1536a
    public void c(InterfaceC1536a.b bVar) {
        this.f1745c = bVar;
        this.f1746d = new O3(bVar.b(), bVar.a(), new AbstractC0324f0.a(bVar.a().getAssets(), bVar.c()));
        bVar.d().a("plugins.flutter.io/webview", new C0338h0(this.f1746d.d()));
        this.f1746d.I();
    }

    @Override // t2.InterfaceC1544a
    public void d() {
        this.f1746d.R(this.f1745c.a());
    }

    @Override // t2.InterfaceC1544a
    public void f(t2.c cVar) {
        this.f1746d.R(cVar.d());
    }

    @Override // t2.InterfaceC1544a
    public void h(t2.c cVar) {
        O3 o32 = this.f1746d;
        if (o32 != null) {
            o32.R(cVar.d());
        }
    }

    @Override // t2.InterfaceC1544a
    public void i() {
        this.f1746d.R(this.f1745c.a());
    }

    @Override // s2.InterfaceC1536a
    public void r(InterfaceC1536a.b bVar) {
        O3 o32 = this.f1746d;
        if (o32 != null) {
            o32.J();
            this.f1746d.d().n();
            this.f1746d = null;
        }
    }
}
