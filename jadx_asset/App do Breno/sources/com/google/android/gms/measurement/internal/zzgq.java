package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.Q;
import com.google.android.gms.internal.measurement.zzbn;
import k1.InterfaceC1338w2;
import k1.U6;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzgq extends zzbn implements InterfaceC1338w2 {
    public zzgq() {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    @Override // com.google.android.gms.internal.measurement.zzbn
    public final boolean a(int i4, Parcel parcel, Parcel parcel2, int i5) {
        if (i4 != 2) {
            return false;
        }
        U6 u6 = (U6) Q.a(parcel, U6.CREATOR);
        Q.c(parcel);
        b0(u6);
        return true;
    }
}
