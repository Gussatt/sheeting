package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzcx extends zzbn implements InterfaceC0887x0 {
    public zzcx() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.zzbn
    public final boolean a(int i4, Parcel parcel, Parcel parcel2, int i5) {
        if (i4 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) Q.a(parcel, Bundle.CREATOR);
        Q.c(parcel);
        k(bundle);
        parcel2.writeNoException();
        return true;
    }
}
