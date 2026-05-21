package k1;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class V4 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f9267m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f9268n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f9269o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f9270p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1238j5 f9271q;

    public V4(C1238j5 c1238j5, AtomicReference atomicReference, String str, String str2, String str3, boolean z3) {
        this.f9267m = atomicReference;
        this.f9268n = str2;
        this.f9269o = str3;
        this.f9270p = z3;
        this.f9271q = c1238j5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9271q.f9366a.O().y(this.f9267m, null, this.f9268n, this.f9269o, this.f9270p);
    }
}
