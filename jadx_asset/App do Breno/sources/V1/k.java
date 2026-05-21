package V1;

import n1.C1446m;

/* JADX INFO: loaded from: classes.dex */
public class k implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f3764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1446m f3765b;

    public k(p pVar, C1446m c1446m) {
        this.f3764a = pVar;
        this.f3765b = c1446m;
    }

    @Override // V1.o
    public boolean a(W1.d dVar) {
        if (!dVar.k() || this.f3764a.f(dVar)) {
            return false;
        }
        this.f3765b.c(m.a().b(dVar.b()).d(dVar.c()).c(dVar.h()).a());
        return true;
    }

    @Override // V1.o
    public boolean b(Exception exc) {
        this.f3765b.d(exc);
        return true;
    }
}
