package k1;

import V0.AbstractC0549h;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class N2 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final M2 f9149m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f9150n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Throwable f9151o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final byte[] f9152p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f9153q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Map f9154r;

    public /* synthetic */ N2(String str, M2 m22, int i4, Throwable th, byte[] bArr, Map map, P2 p22) {
        AbstractC0549h.j(m22);
        this.f9149m = m22;
        this.f9150n = i4;
        this.f9151o = th;
        this.f9152p = bArr;
        this.f9153q = str;
        this.f9154r = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9149m.a(this.f9153q, this.f9150n, this.f9151o, this.f9152p, this.f9154r);
    }
}
