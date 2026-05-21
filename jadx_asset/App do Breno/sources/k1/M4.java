package k1;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class M4 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f9137m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f9138n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f9139o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Bundle f9140p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f9141q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f9142r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f9143s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f9144t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C1238j5 f9145u;

    public M4(C1238j5 c1238j5, String str, String str2, long j4, Bundle bundle, boolean z3, boolean z4, boolean z5, String str3) {
        this.f9137m = str;
        this.f9138n = str2;
        this.f9139o = j4;
        this.f9140p = bundle;
        this.f9141q = z3;
        this.f9142r = z4;
        this.f9143s = z5;
        this.f9144t = str3;
        this.f9145u = c1238j5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9145u.H(this.f9137m, this.f9138n, this.f9139o, this.f9140p, this.f9141q, this.f9142r, this.f9143s, this.f9144t);
    }
}
