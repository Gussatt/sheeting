package U0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class F extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f3509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E f3510b;

    public F(E e4) {
        this.f3510b = e4;
    }

    public final void a(Context context) {
        this.f3509a = context;
    }

    public final synchronized void b() {
        try {
            Context context = this.f3509a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f3509a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f3510b.a();
            b();
        }
    }
}
