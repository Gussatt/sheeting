package h1;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: h1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC0991a extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Looper f7482a;

    public HandlerC0991a(Looper looper) {
        super(looper);
        this.f7482a = Looper.getMainLooper();
    }
}
