package o3;

import h3.AbstractC1007g0;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends AbstractC1007g0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f10831p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f10832q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f10833r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f10834s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a f10835t = U();

    public f(int i4, int i5, long j4, String str) {
        this.f10831p = i4;
        this.f10832q = i5;
        this.f10833r = j4;
        this.f10834s = str;
    }

    @Override // h3.F
    public void R(N2.i iVar, Runnable runnable) {
        a.j(this.f10835t, runnable, null, false, 6, null);
    }

    public final a U() {
        return new a(this.f10831p, this.f10832q, this.f10833r, this.f10834s);
    }

    public final void V(Runnable runnable, i iVar, boolean z3) {
        this.f10835t.g(runnable, iVar, z3);
    }
}
