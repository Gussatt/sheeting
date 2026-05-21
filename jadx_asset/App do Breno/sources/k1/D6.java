package k1;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class D6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ E6 f8940a;

    public D6(E6 e6) {
        this.f8940a = e6;
    }

    public final void a() {
        E6 e6 = this.f8940a;
        e6.h();
        C1363z3 c1363z3 = e6.f9366a;
        if (c1363z3.H().A(c1363z3.f().a())) {
            c1363z3.H().f9322n.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                c1363z3.c().v().a("Detected application was in foreground");
                c(c1363z3.f().a(), false);
            }
        }
    }

    public final void b(long j4, boolean z3) {
        E6 e6 = this.f8940a;
        e6.h();
        e6.u();
        C1363z3 c1363z3 = e6.f9366a;
        if (c1363z3.H().A(j4)) {
            c1363z3.H().f9322n.a(true);
            e6.f9366a.D().x();
        }
        c1363z3.H().f9326r.b(j4);
        if (c1363z3.H().f9322n.b()) {
            c(j4, z3);
        }
    }

    public final void c(long j4, boolean z3) {
        E6 e6 = this.f8940a;
        e6.h();
        if (e6.f9366a.o()) {
            C1363z3 c1363z3 = e6.f9366a;
            c1363z3.H().f9326r.b(j4);
            c1363z3.c().v().b("Session started, time", Long.valueOf(c1363z3.f().b()));
            long j5 = j4 / 1000;
            C1363z3 c1363z32 = e6.f9366a;
            c1363z32.K().b0("auto", "_sid", Long.valueOf(j5), j4);
            c1363z3.H().f9327s.b(j5);
            c1363z3.H().f9322n.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j5);
            c1363z32.K().G("auto", "_s", j4, bundle);
            String strA = c1363z3.H().f9332x.a();
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", strA);
            c1363z32.K().G("auto", "_ssr", j4, bundle2);
        }
    }
}
