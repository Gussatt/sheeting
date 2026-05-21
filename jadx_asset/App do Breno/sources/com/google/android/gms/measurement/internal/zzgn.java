package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.Q;
import com.google.android.gms.internal.measurement.zzbn;
import java.util.ArrayList;
import k1.InterfaceC1322u2;
import k1.K6;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzgn extends zzbn implements InterfaceC1322u2 {
    public zzgn() {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    @Override // com.google.android.gms.internal.measurement.zzbn
    public final boolean a(int i4, Parcel parcel, Parcel parcel2, int i5) {
        if (i4 != 2) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(K6.CREATOR);
        Q.c(parcel);
        I0(arrayListCreateTypedArrayList);
        return true;
    }
}
