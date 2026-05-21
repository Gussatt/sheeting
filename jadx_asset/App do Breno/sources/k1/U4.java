package k1;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class U4 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f9249m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f9250n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f9251o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1238j5 f9252p;

    public U4(C1238j5 c1238j5, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f9249m = atomicReference;
        this.f9250n = str2;
        this.f9251o = str3;
        this.f9252p = c1238j5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9252p.f9366a.O().u(this.f9249m, null, this.f9250n, this.f9251o);
    }
}
