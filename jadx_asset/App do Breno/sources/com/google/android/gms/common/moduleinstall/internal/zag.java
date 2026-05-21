package com.google.android.gms.common.moduleinstall.internal;

import Y0.d;
import Z0.b;
import android.os.Parcel;
import com.google.android.gms.internal.base.zab;
import f1.AbstractC0943b;

/* JADX INFO: loaded from: classes.dex */
public abstract class zag extends zab implements b {
    @Override // com.google.android.gms.internal.base.zab
    public final boolean o1(int i4, Parcel parcel, Parcel parcel2, int i5) {
        if (i4 != 1) {
            return false;
        }
        d dVar = (d) AbstractC0943b.a(parcel, d.CREATOR);
        AbstractC0943b.b(parcel);
        f0(dVar);
        return true;
    }
}
