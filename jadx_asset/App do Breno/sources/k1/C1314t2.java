package k1;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* JADX INFO: renamed from: k1.t2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1314t2 extends com.google.android.gms.internal.measurement.P implements InterfaceC1322u2 {
    public C1314t2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    @Override // k1.InterfaceC1322u2
    public final void I0(List list) {
        Parcel parcelA = a();
        parcelA.writeTypedList(list);
        o1(2, parcelA);
    }
}
