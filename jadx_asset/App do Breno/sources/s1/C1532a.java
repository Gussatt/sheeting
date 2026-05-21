package s1;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: s1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1532a extends ThreadPoolExecutor {
    public C1532a(FirebaseAnalytics firebaseAnalytics, int i4, int i5, long j4, TimeUnit timeUnit, BlockingQueue blockingQueue) {
        super(0, 1, 30L, timeUnit, blockingQueue);
    }
}
