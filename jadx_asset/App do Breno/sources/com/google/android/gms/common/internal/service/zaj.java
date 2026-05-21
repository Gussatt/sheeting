package com.google.android.gms.common.internal.service;

import X0.b;
import android.os.Parcel;
import com.google.android.gms.internal.base.zab;
import f1.AbstractC0943b;

/* JADX INFO: loaded from: classes.dex */
public abstract class zaj extends zab implements b {
    @Override // com.google.android.gms.internal.base.zab
    public final boolean o1(int i4, Parcel parcel, Parcel parcel2, int i5) {
        if (i4 != 1) {
            return false;
        }
        int i6 = parcel.readInt();
        AbstractC0943b.b(parcel);
        P0(i6);
        return true;
    }
}
