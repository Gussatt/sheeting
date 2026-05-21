package U0;

import com.google.android.gms.common.api.internal.zact;

/* JADX INFO: loaded from: classes.dex */
public final class L implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m1.j f3524m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ zact f3525n;

    public L(zact zactVar, m1.j jVar) {
        this.f3525n = zactVar;
        this.f3524m = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zact.q1(this.f3525n, this.f3524m);
    }
}
