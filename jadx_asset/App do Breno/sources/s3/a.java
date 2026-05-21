package s3;

import android.os.Build;
import s2.InterfaceC1536a;
import w2.C1616i;
import w2.C1617j;

/* JADX INFO: loaded from: classes.dex */
public class a implements InterfaceC1536a, C1617j.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1617j f11342c;

    @Override // s2.InterfaceC1536a
    public void c(InterfaceC1536a.b bVar) {
        C1617j c1617j = new C1617j(bVar.b(), "flutter_native_splash");
        this.f11342c = c1617j;
        c1617j.e(this);
    }

    @Override // w2.C1617j.c
    public void g(C1616i c1616i, C1617j.d dVar) {
        if (!c1616i.f11879a.equals("getPlatformVersion")) {
            dVar.c();
            return;
        }
        dVar.a("Android " + Build.VERSION.RELEASE);
    }

    @Override // s2.InterfaceC1536a
    public void r(InterfaceC1536a.b bVar) {
        this.f11342c.e(null);
    }
}
