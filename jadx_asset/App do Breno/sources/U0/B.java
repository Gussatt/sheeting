package U0;

import S0.C0504b;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class B implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0504b f3500m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C f3501n;

    public B(C c4, C0504b c0504b) {
        this.f3501n = c4;
        this.f3500m = c0504b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C c4 = this.f3501n;
        C0540y c0540y = (C0540y) c4.f3507f.f3574j.get(c4.f3503b);
        if (c0540y == null) {
            return;
        }
        if (!this.f3500m.i()) {
            c0540y.H(this.f3500m, null);
            return;
        }
        this.f3501n.f3506e = true;
        if (this.f3501n.f3502a.o()) {
            this.f3501n.i();
            return;
        }
        try {
            C c5 = this.f3501n;
            c5.f3502a.d(null, c5.f3502a.c());
        } catch (SecurityException e4) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e4);
            this.f3501n.f3502a.e("Failed to get service from broker.");
            c0540y.H(new C0504b(10), null);
        }
    }
}
