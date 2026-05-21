package G2;

import G2.a;
import android.util.Log;
import s2.InterfaceC1536a;
import t2.InterfaceC1544a;

/* JADX INFO: loaded from: classes.dex */
public final class i implements InterfaceC1536a, InterfaceC1544a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h f1663c;

    @Override // s2.InterfaceC1536a
    public void c(InterfaceC1536a.b bVar) {
        this.f1663c = new h(bVar.a());
        a.d.i(bVar.b(), this.f1663c);
    }

    @Override // t2.InterfaceC1544a
    public void d() {
        h hVar = this.f1663c;
        if (hVar == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            hVar.s(null);
        }
    }

    @Override // t2.InterfaceC1544a
    public void f(t2.c cVar) {
        h(cVar);
    }

    @Override // t2.InterfaceC1544a
    public void h(t2.c cVar) {
        h hVar = this.f1663c;
        if (hVar == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            hVar.s(cVar.d());
        }
    }

    @Override // t2.InterfaceC1544a
    public void i() {
        d();
    }

    @Override // s2.InterfaceC1536a
    public void r(InterfaceC1536a.b bVar) {
        if (this.f1663c == null) {
            Log.wtf("UrlLauncherPlugin", "Already detached from the engine.");
        } else {
            a.d.i(bVar.b(), null);
            this.f1663c = null;
        }
    }
}
