package V0;

import S0.C0504b;
import android.app.PendingIntent;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public abstract class B extends M {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f3620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f3621f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(com.google.android.gms.common.internal.a aVar, int i4, Bundle bundle) {
        super(aVar, Boolean.TRUE);
        this.f3621f = aVar;
        this.f3619d = i4;
        this.f3620e = bundle;
    }

    @Override // V0.M
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        if (this.f3619d != 0) {
            this.f3621f.i0(1, null);
            Bundle bundle = this.f3620e;
            f(new C0504b(this.f3619d, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
        } else {
            if (g()) {
                return;
            }
            this.f3621f.i0(1, null);
            f(new C0504b(8, null));
        }
    }

    public abstract void f(C0504b c0504b);

    public abstract boolean g();

    @Override // V0.M
    public final void b() {
    }
}
