package com.google.android.gms.internal.measurement;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzda extends zzbn implements A0 {
    public zzda() {
        super("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
    }

    @Override // com.google.android.gms.internal.measurement.zzbn
    public final boolean a(int i4, Parcel parcel, Parcel parcel2, int i5) {
        if (i4 != 2) {
            return false;
        }
        e();
        return true;
    }
}
