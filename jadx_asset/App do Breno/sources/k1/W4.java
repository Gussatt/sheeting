package k1;

import com.google.android.gms.internal.measurement.InterfaceC0887x0;

/* JADX INFO: loaded from: classes.dex */
public final class W4 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0887x0 f9284m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1238j5 f9285n;

    public W4(C1238j5 c1238j5, InterfaceC0887x0 interfaceC0887x0) {
        this.f9284m = interfaceC0887x0;
        this.f9285n = c1238j5;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r8 = this;
            k1.j5 r0 = r8.f9285n
            k1.z3 r1 = r0.f9366a
            k1.E6 r1 = r1.P()
            k1.z3 r1 = r1.f9366a
            k1.Z2 r2 = r1.H()
            k1.i4 r2 = r2.t()
            k1.h4 r3 = k1.EnumC1221h4.ANALYTICS_STORAGE
            boolean r2 = r2.r(r3)
            r3 = 0
            if (r2 != 0) goto L2a
            k1.K2 r1 = r1.c()
            k1.I2 r1 = r1.x()
            java.lang.String r2 = "Analytics storage consent denied; will not get session id"
            r1.a(r2)
        L28:
            r1 = r3
            goto L5b
        L2a:
            k1.Z2 r2 = r1.H()
            b1.d r4 = r1.f()
            long r4 = r4.a()
            boolean r2 = r2.A(r4)
            if (r2 != 0) goto L28
            k1.Z2 r2 = r1.H()
            k1.V2 r2 = r2.f9327s
            long r4 = r2.a()
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 != 0) goto L4d
            goto L28
        L4d:
            k1.Z2 r1 = r1.H()
            k1.V2 r1 = r1.f9327s
            long r1 = r1.a()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
        L5b:
            if (r1 == 0) goto L6d
            k1.z3 r0 = r0.f9366a
            com.google.android.gms.internal.measurement.x0 r2 = r8.f9284m
            k1.w7 r0 = r0.Q()
            long r3 = r1.longValue()
            r0.M(r2, r3)
            return
        L6d:
            com.google.android.gms.internal.measurement.x0 r0 = r8.f9284m     // Catch: android.os.RemoteException -> L73
            r0.k(r3)     // Catch: android.os.RemoteException -> L73
            return
        L73:
            r0 = move-exception
            k1.j5 r1 = r8.f9285n
            k1.z3 r1 = r1.f9366a
            k1.K2 r1 = r1.c()
            k1.I2 r1 = r1.r()
            java.lang.String r2 = "getSessionId failed with exception"
            r1.b(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.W4.run():void");
    }
}
