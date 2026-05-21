package k1;

import android.os.Bundle;

/* JADX INFO: renamed from: k1.w5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1341w5 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Bundle f9895m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1333v5 f9896n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1333v5 f9897o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f9898p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C5 f9899q;

    public RunnableC1341w5(C5 c5, Bundle bundle, C1333v5 c1333v5, C1333v5 c1333v52, long j4) {
        this.f9895m = bundle;
        this.f9896n = c1333v5;
        this.f9897o = c1333v52;
        this.f9898p = j4;
        this.f9899q = c5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5.x(this.f9899q, this.f9895m, this.f9896n, this.f9897o, this.f9898p);
    }
}
