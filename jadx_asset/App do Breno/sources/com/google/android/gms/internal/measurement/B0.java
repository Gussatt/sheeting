package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class B0 extends P implements C0 {
    public B0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.C0
    public final void Y0(String str, String str2, Bundle bundle, long j4) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        parcelA.writeString(str2);
        Q.d(parcelA, bundle);
        parcelA.writeLong(j4);
        u(1, parcelA);
    }

    @Override // com.google.android.gms.internal.measurement.C0
    public final int e() {
        Parcel parcelR = r(2, a());
        int i4 = parcelR.readInt();
        parcelR.recycle();
        return i4;
    }
}
