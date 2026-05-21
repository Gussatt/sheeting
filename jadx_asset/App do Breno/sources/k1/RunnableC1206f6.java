package k1;

import android.content.ComponentName;

/* JADX INFO: renamed from: k1.f6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1206f6 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ComponentName f9435m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ServiceConnectionC1255l6 f9436n;

    public RunnableC1206f6(ServiceConnectionC1255l6 serviceConnectionC1255l6, ComponentName componentName) {
        this.f9435m = componentName;
        this.f9436n = serviceConnectionC1255l6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1263m6.j0(this.f9436n.f9537c, this.f9435m);
    }
}
