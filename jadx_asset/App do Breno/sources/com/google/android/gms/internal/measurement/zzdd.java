package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzdd extends zzbn implements C0 {
    public zzdd() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.zzbn
    public final boolean a(int i4, Parcel parcel, Parcel parcel2, int i5) {
        if (i4 == 1) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            Bundle bundle = (Bundle) Q.a(parcel, Bundle.CREATOR);
            long j4 = parcel.readLong();
            Q.c(parcel);
            Y0(string, string2, bundle, j4);
            parcel2.writeNoException();
        } else {
            if (i4 != 2) {
                return false;
            }
            int iE = e();
            parcel2.writeNoException();
            parcel2.writeInt(iE);
        }
        return true;
    }
}
