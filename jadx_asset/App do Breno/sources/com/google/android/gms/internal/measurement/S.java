package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class S extends P implements T {
    public S(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // com.google.android.gms.internal.measurement.T
    public final Bundle k(Bundle bundle) {
        Parcel parcelA = a();
        Q.d(parcelA, bundle);
        Parcel parcelR = r(1, parcelA);
        Bundle bundle2 = (Bundle) Q.a(parcelR, Bundle.CREATOR);
        parcelR.recycle();
        return bundle2;
    }
}
