package k1;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: renamed from: k1.i5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1230i5 implements Application.ActivityLifecycleCallbacks, InterfaceC1214g5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1238j5 f9477b;

    public C1230i5(C1238j5 c1238j5) {
        this.f9477b = c1238j5;
    }

    @Override // k1.InterfaceC1214g5
    public final void a(com.google.android.gms.internal.measurement.H0 h02) {
        C1363z3 c1363z3 = this.f9477b.f9366a;
        c1363z3.N().B(h02);
        E6 e6P = c1363z3.P();
        C1363z3 c1363z32 = e6P.f9366a;
        c1363z32.e().A(new RunnableC1350x6(e6P, c1363z32.f().b()));
    }

    @Override // k1.InterfaceC1214g5
    public final void b(com.google.android.gms.internal.measurement.H0 h02) {
        this.f9477b.f9366a.N().A(h02);
    }

    @Override // k1.InterfaceC1214g5
    public final void c(com.google.android.gms.internal.measurement.H0 h02, Bundle bundle) {
        this.f9477b.f9366a.N().D(h02, bundle);
    }

    @Override // k1.InterfaceC1214g5
    public final void d(com.google.android.gms.internal.measurement.H0 h02) {
        C1363z3 c1363z3 = this.f9477b.f9366a;
        E6 e6P = c1363z3.P();
        C1363z3 c1363z32 = e6P.f9366a;
        c1363z32.e().A(new RunnableC1342w6(e6P, c1363z32.f().b()));
        c1363z3.N().C(h02);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
    @Override // k1.InterfaceC1214g5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(com.google.android.gms.internal.measurement.H0 r8, android.os.Bundle r9) throws java.lang.Throwable {
        /*
            r7 = this;
            k1.j5 r0 = r7.f9477b     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            k1.z3 r1 = r0.f9366a     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            k1.K2 r2 = r1.c()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            k1.I2 r2 = r2.v()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            java.lang.String r3 = "onActivityCreated"
            r2.a(r3)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            android.content.Intent r2 = r8.f6358o     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            if (r2 == 0) goto L4c
            android.net.Uri r3 = r2.getData()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            if (r3 == 0) goto L2c
            boolean r4 = r3.isHierarchical()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            if (r4 != 0) goto L22
            goto L2c
        L22:
            r4 = r3
            goto L44
        L24:
            r0 = move-exception
            r2 = r7
            goto Lb6
        L28:
            r0 = move-exception
            r2 = r7
            goto La0
        L2c:
            android.os.Bundle r3 = r2.getExtras()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            r4 = 0
            if (r3 == 0) goto L44
            java.lang.String r5 = "com.android.vending.referral_url"
            java.lang.String r3 = r3.getString(r5)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            if (r5 != 0) goto L44
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            goto L22
        L44:
            if (r4 == 0) goto L4c
            boolean r3 = r4.isHierarchical()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            if (r3 != 0) goto L4e
        L4c:
            r2 = r7
            goto L96
        L4e:
            r1.Q()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            java.lang.String r0 = "android.intent.extra.REFERRER_NAME"
            java.lang.String r0 = r2.getStringExtra(r0)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            java.lang.String r2 = "android-app://com.google.android.googlequicksearchbox/https/www.google.com"
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            if (r2 != 0) goto L74
            java.lang.String r2 = "https://www.google.com"
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            if (r2 != 0) goto L74
            java.lang.String r2 = "android-app://com.google.appcrawler"
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            if (r0 == 0) goto L70
            goto L74
        L70:
            java.lang.String r0 = "auto"
        L72:
            r5 = r0
            goto L77
        L74:
            java.lang.String r0 = "gs"
            goto L72
        L77:
            java.lang.String r0 = "referrer"
            java.lang.String r6 = r4.getQueryParameter(r0)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            if (r9 != 0) goto L82
            r0 = 1
        L80:
            r3 = r0
            goto L84
        L82:
            r0 = 0
            goto L80
        L84:
            k1.s3 r0 = r1.e()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            k1.h5 r1 = new k1.h5     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            r2 = r7
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L92 java.lang.RuntimeException -> L94
            r0.A(r1)     // Catch: java.lang.Throwable -> L92 java.lang.RuntimeException -> L94
            goto Lb1
        L92:
            r0 = move-exception
            goto Lb6
        L94:
            r0 = move-exception
            goto La0
        L96:
            k1.z3 r0 = r0.f9366a
        L98:
            k1.C5 r0 = r0.N()
            r0.z(r8, r9)
            return
        La0:
            k1.j5 r1 = r2.f9477b     // Catch: java.lang.Throwable -> L92
            k1.z3 r1 = r1.f9366a     // Catch: java.lang.Throwable -> L92
            k1.K2 r1 = r1.c()     // Catch: java.lang.Throwable -> L92
            k1.I2 r1 = r1.r()     // Catch: java.lang.Throwable -> L92
            java.lang.String r3 = "Throwable caught in onActivityCreated"
            r1.b(r3, r0)     // Catch: java.lang.Throwable -> L92
        Lb1:
            k1.j5 r0 = r2.f9477b
            k1.z3 r0 = r0.f9366a
            goto L98
        Lb6:
            k1.j5 r1 = r2.f9477b
            k1.z3 r1 = r1.f9366a
            k1.C5 r1 = r1.N()
            r1.z(r8, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.C1230i5.e(com.google.android.gms.internal.measurement.H0, android.os.Bundle):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) throws Throwable {
        e(com.google.android.gms.internal.measurement.H0.d(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        b(com.google.android.gms.internal.measurement.H0.d(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(com.google.android.gms.internal.measurement.H0.d(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        d(com.google.android.gms.internal.measurement.H0.d(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        c(com.google.android.gms.internal.measurement.H0.d(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
