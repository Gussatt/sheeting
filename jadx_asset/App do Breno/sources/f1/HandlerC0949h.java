package f1;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: f1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class HandlerC0949h extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Looper f7205a;

    public HandlerC0949h(Looper looper) {
        super(looper);
        this.f7205a = Looper.getMainLooper();
    }

    public HandlerC0949h(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f7205a = Looper.getMainLooper();
    }
}
