package V1;

import n1.C1446m;

/* JADX INFO: loaded from: classes.dex */
public class l implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1446m f3766a;

    public l(C1446m c1446m) {
        this.f3766a = c1446m;
    }

    @Override // V1.o
    public boolean a(W1.d dVar) {
        if (!dVar.l() && !dVar.k() && !dVar.i()) {
            return false;
        }
        this.f3766a.e(dVar.d());
        return true;
    }

    @Override // V1.o
    public boolean b(Exception exc) {
        return false;
    }
}
