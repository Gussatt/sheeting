package k1;

import android.content.BroadcastReceiver;

/* JADX INFO: loaded from: classes.dex */
public final class C7 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1363z3 f8931a;

    public C7(C1363z3 c1363z3) {
        this.f8931a = c1363z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReceive(android.content.Context r3, android.content.Intent r4) {
        /*
            r2 = this;
            if (r4 != 0) goto L12
            k1.z3 r3 = r2.f8931a
            k1.K2 r3 = r3.c()
            k1.I2 r3 = r3.w()
            java.lang.String r4 = "App receiver called with null intent"
            r3.a(r4)
            return
        L12:
            java.lang.String r3 = r4.getAction()
            if (r3 != 0) goto L28
            k1.z3 r3 = r2.f8931a
            k1.K2 r3 = r3.c()
            k1.I2 r3 = r3.w()
            java.lang.String r4 = "App receiver called with null action"
            r3.a(r4)
            return
        L28:
            int r4 = r3.hashCode()
            r0 = -1928239649(0xffffffff8d1165df, float:-4.4804198E-31)
            r1 = 1
            if (r4 == r0) goto L42
            r0 = 1279883384(0x4c497878, float:5.2814304E7)
            if (r4 == r0) goto L38
            goto L4c
        L38:
            java.lang.String r4 = "com.google.android.gms.measurement.BATCHES_AVAILABLE"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L4c
            r3 = r1
            goto L4d
        L42:
            java.lang.String r4 = "com.google.android.gms.measurement.TRIGGERS_AVAILABLE"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L4c
            r3 = 0
            goto L4d
        L4c:
            r3 = -1
        L4d:
            r4 = 0
            if (r3 == 0) goto L8a
            if (r3 == r1) goto L62
            k1.z3 r3 = r2.f8931a
            k1.K2 r3 = r3.c()
            k1.I2 r3 = r3.w()
            java.lang.String r4 = "App receiver called with unknown action"
            r3.a(r4)
            return
        L62:
            k1.z3 r3 = r2.f8931a
            k1.n r0 = r3.B()
            k1.o2 r1 = k1.AbstractC1291q2.f9707S0
            boolean r4 = r0.P(r4, r1)
            if (r4 == 0) goto L9b
            k1.K2 r4 = r3.c()
            k1.I2 r4 = r4.v()
            java.lang.String r0 = "[sgtm] App Receiver notified batches are available"
            r4.a(r0)
            k1.s3 r3 = r3.e()
            k1.B7 r4 = new k1.B7
            r4.<init>()
            r3.A(r4)
            return
        L8a:
            k1.z3 r3 = r2.f8931a
            com.google.android.gms.internal.measurement.X6.b()
            k1.n r0 = r3.B()
            k1.o2 r1 = k1.AbstractC1291q2.f9717X0
            boolean r4 = r0.P(r4, r1)
            if (r4 != 0) goto L9c
        L9b:
            return
        L9c:
            k1.K2 r4 = r3.c()
            k1.I2 r4 = r4.v()
            java.lang.String r0 = "App receiver notified triggers are available"
            r4.a(r0)
            k1.s3 r4 = r3.e()
            k1.A7 r0 = new k1.A7
            r0.<init>()
            r4.A(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.C7.onReceive(android.content.Context, android.content.Intent):void");
    }
}
