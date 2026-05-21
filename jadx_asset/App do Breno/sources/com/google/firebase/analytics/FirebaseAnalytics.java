package com.google.firebase.analytics;

import V0.AbstractC0549h;
import V1.g;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C0904z1;
import com.google.android.gms.internal.measurement.H0;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import k1.InterfaceC1246k5;
import n1.AbstractC1445l;
import n1.AbstractC1448o;
import s1.C1532a;
import s1.C1535d;
import s1.CallableC1533b;
import s1.CallableC1534c;

/* JADX INFO: loaded from: classes.dex */
public final class FirebaseAnalytics {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile FirebaseAnalytics f7054c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0904z1 f7055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ExecutorService f7056b;

    public enum a {
        GRANTED,
        DENIED
    }

    public enum b {
        AD_STORAGE,
        ANALYTICS_STORAGE,
        AD_USER_DATA,
        AD_PERSONALIZATION
    }

    public FirebaseAnalytics(C0904z1 c0904z1) {
        AbstractC0549h.j(c0904z1);
        this.f7055a = c0904z1;
    }

    public static FirebaseAnalytics getInstance(Context context) {
        if (f7054c == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f7054c == null) {
                        f7054c = new FirebaseAnalytics(C0904z1.z(context, null, null, null, null));
                    }
                } finally {
                }
            }
        }
        return f7054c;
    }

    public static InterfaceC1246k5 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        C0904z1 c0904z1Z = C0904z1.z(context, null, null, null, bundle);
        if (c0904z1Z == null) {
            return null;
        }
        return new C1535d(c0904z1Z);
    }

    public AbstractC1445l a() {
        try {
            return AbstractC1448o.c(l(), new CallableC1533b(this));
        } catch (RuntimeException e4) {
            this.f7055a.a(5, "Failed to schedule task for getAppInstanceId", null, null, null);
            return AbstractC1448o.d(e4);
        }
    }

    public AbstractC1445l b() {
        try {
            return AbstractC1448o.c(l(), new CallableC1534c(this));
        } catch (RuntimeException e4) {
            this.f7055a.a(5, "Failed to schedule task for getSessionId", null, null, null);
            return AbstractC1448o.d(e4);
        }
    }

    public void c(String str, Bundle bundle) {
        this.f7055a.P(str, bundle);
    }

    public void d() {
        this.f7055a.c();
    }

    public void e(boolean z3) {
        this.f7055a.j(Boolean.valueOf(z3));
    }

    public void f(Map map) {
        Bundle bundle = new Bundle();
        a aVar = (a) map.get(b.AD_STORAGE);
        if (aVar != null) {
            int iOrdinal = aVar.ordinal();
            if (iOrdinal == 0) {
                bundle.putString("ad_storage", "granted");
            } else if (iOrdinal == 1) {
                bundle.putString("ad_storage", "denied");
            }
        }
        a aVar2 = (a) map.get(b.ANALYTICS_STORAGE);
        if (aVar2 != null) {
            int iOrdinal2 = aVar2.ordinal();
            if (iOrdinal2 == 0) {
                bundle.putString("analytics_storage", "granted");
            } else if (iOrdinal2 == 1) {
                bundle.putString("analytics_storage", "denied");
            }
        }
        a aVar3 = (a) map.get(b.AD_USER_DATA);
        if (aVar3 != null) {
            int iOrdinal3 = aVar3.ordinal();
            if (iOrdinal3 == 0) {
                bundle.putString("ad_user_data", "granted");
            } else if (iOrdinal3 == 1) {
                bundle.putString("ad_user_data", "denied");
            }
        }
        a aVar4 = (a) map.get(b.AD_PERSONALIZATION);
        if (aVar4 != null) {
            int iOrdinal4 = aVar4.ordinal();
            if (iOrdinal4 == 0) {
                bundle.putString("ad_personalization", "granted");
            } else if (iOrdinal4 == 1) {
                bundle.putString("ad_personalization", "denied");
            }
        }
        this.f7055a.f(bundle);
    }

    public void g(Bundle bundle) {
        if (bundle != null) {
            bundle = new Bundle(bundle);
        }
        this.f7055a.i(bundle);
    }

    public String getFirebaseInstanceId() {
        try {
            return (String) AbstractC1448o.b(g.q().a(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e4) {
            throw new IllegalStateException(e4);
        } catch (ExecutionException e5) {
            throw new IllegalStateException(e5.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    public void h(long j4) {
        this.f7055a.k(j4);
    }

    public void i(String str) {
        this.f7055a.l(str);
    }

    public void j(String str, String str2) {
        this.f7055a.m(null, str, str2, false);
    }

    public final ExecutorService l() throws Throwable {
        FirebaseAnalytics firebaseAnalytics;
        synchronized (FirebaseAnalytics.class) {
            try {
                try {
                    if (this.f7056b == null) {
                        firebaseAnalytics = this;
                        firebaseAnalytics.f7056b = new C1532a(firebaseAnalytics, 0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
                    } else {
                        firebaseAnalytics = this;
                    }
                    return firebaseAnalytics.f7056b;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        this.f7055a.g(H0.d(activity), str, str2);
    }
}
