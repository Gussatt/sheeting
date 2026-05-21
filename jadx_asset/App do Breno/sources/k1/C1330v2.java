package k1;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: k1.v2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1330v2 extends com.google.android.gms.internal.measurement.P implements InterfaceC1338w2 {
    public C1330v2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    @Override // k1.InterfaceC1338w2
    public final void b0(U6 u6) {
        Parcel parcelA = a();
        com.google.android.gms.internal.measurement.Q.d(parcelA, u6);
        o1(2, parcelA);
    }
}
