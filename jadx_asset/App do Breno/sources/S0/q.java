package S0;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import f1.HandlerC0949h;

/* JADX INFO: loaded from: classes.dex */
public final class q extends HandlerC0949h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f3449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0512j f3450c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(C0512j c0512j, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f3450c = c0512j;
        this.f3449b = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i4 = message.what;
        if (i4 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i4);
            return;
        }
        C0512j c0512j = this.f3450c;
        int iG = c0512j.g(this.f3449b);
        if (c0512j.j(iG)) {
            this.f3450c.o(this.f3449b, iG);
        }
    }
}
