package s1;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: s1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1534c implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseAnalytics f11333a;

    public CallableC1534c(FirebaseAnalytics firebaseAnalytics) {
        this.f11333a = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        return this.f11333a.f7055a.A();
    }
}
