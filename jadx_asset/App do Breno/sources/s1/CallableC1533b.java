package s1;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: s1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1533b implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseAnalytics f11332a;

    public CallableC1533b(FirebaseAnalytics firebaseAnalytics) {
        this.f11332a = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        return this.f11332a.f7055a.C();
    }
}
