package k1;

import V0.AbstractC0549h;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes.dex */
public final class S2 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l7 f9223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9225c;

    public S2(l7 l7Var) {
        AbstractC0549h.j(l7Var);
        this.f9223a = l7Var;
    }

    public final void b() {
        l7 l7Var = this.f9223a;
        l7Var.r();
        l7Var.e().h();
        if (this.f9224b) {
            return;
        }
        l7Var.d().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f9225c = l7Var.I0().o();
        l7Var.c().v().b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f9225c));
        this.f9224b = true;
    }

    public final void c() {
        l7 l7Var = this.f9223a;
        l7Var.r();
        l7Var.e().h();
        l7Var.e().h();
        if (this.f9224b) {
            l7Var.c().v().a("Unregistering connectivity change receiver");
            this.f9224b = false;
            this.f9225c = false;
            try {
                l7Var.d().unregisterReceiver(this);
            } catch (IllegalArgumentException e4) {
                this.f9223a.c().r().b("Failed to unregister the network broadcast receiver", e4);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        l7 l7Var = this.f9223a;
        l7Var.r();
        String action = intent.getAction();
        l7Var.c().v().b("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            l7Var.c().w().b("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean zO = l7Var.I0().o();
        if (this.f9225c != zO) {
            this.f9225c = zO;
            l7Var.e().A(new R2(this, zO));
        }
    }
}
