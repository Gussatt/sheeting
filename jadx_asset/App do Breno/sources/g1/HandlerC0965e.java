package g1;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: g1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class HandlerC0965e extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Looper f7300a;

    public HandlerC0965e(Looper looper) {
        super(looper);
        this.f7300a = Looper.getMainLooper();
    }

    public HandlerC0965e(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f7300a = Looper.getMainLooper();
    }
}
