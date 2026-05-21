package U0;

import S0.C0504b;
import V0.AbstractC0549h;
import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: loaded from: classes.dex */
public final class W implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final U f3536m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y f3537n;

    public W(Y y3, U u4) {
        this.f3537n = y3;
        this.f3536m = u4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f3537n.f3538c) {
            C0504b c0504bB = this.f3536m.b();
            if (c0504bB.h()) {
                Y y3 = this.f3537n;
                y3.f3581b.startActivityForResult(GoogleApiActivity.a(y3.b(), (PendingIntent) AbstractC0549h.j(c0504bB.g()), this.f3536m.a(), false), 1);
                return;
            }
            Y y4 = this.f3537n;
            if (y4.f3541f.b(y4.b(), c0504bB.d(), null) != null) {
                Y y5 = this.f3537n;
                y5.f3541f.v(y5.b(), y5.f3581b, c0504bB.d(), 2, this.f3537n);
                return;
            }
            if (c0504bB.d() != 18) {
                this.f3537n.l(c0504bB, this.f3536m.a());
                return;
            }
            Y y6 = this.f3537n;
            Dialog dialogQ = y6.f3541f.q(y6.b(), y6);
            Y y7 = this.f3537n;
            y7.f3541f.r(y7.b().getApplicationContext(), new V(this, dialogQ));
        }
    }
}
