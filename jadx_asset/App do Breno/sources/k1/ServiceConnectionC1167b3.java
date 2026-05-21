package k1;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.zzbq;

/* JADX INFO: renamed from: k1.b3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC1167b3 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1176c3 f9365b;

    public ServiceConnectionC1167b3(C1176c3 c1176c3, String str) {
        this.f9365b = c1176c3;
        this.f9364a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f9365b.f9383a.c().w().a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            com.google.android.gms.internal.measurement.T tZzb = zzbq.zzb(iBinder);
            if (tZzb == null) {
                this.f9365b.f9383a.c().w().a("Install Referrer Service implementation was not found");
                return;
            }
            C1363z3 c1363z3 = this.f9365b.f9383a;
            c1363z3.c().v().a("Install Referrer Service connected");
            c1363z3.e().A(new RunnableC1158a3(this, tZzb, this));
        } catch (RuntimeException e4) {
            this.f9365b.f9383a.c().w().b("Exception occurred while calling Install Referrer API", e4);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f9365b.f9383a.c().v().a("Install Referrer Service disconnected");
    }
}
