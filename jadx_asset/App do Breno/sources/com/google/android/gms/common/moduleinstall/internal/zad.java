package com.google.android.gms.common.moduleinstall.internal;

import Y0.b;
import Y0.c;
import Z0.a;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zab;
import f1.AbstractC0943b;

/* JADX INFO: loaded from: classes.dex */
public abstract class zad extends zab implements a {
    @Override // com.google.android.gms.internal.base.zab
    public final boolean o1(int i4, Parcel parcel, Parcel parcel2, int i5) {
        if (i4 == 1) {
            Status status = (Status) AbstractC0943b.a(parcel, Status.CREATOR);
            Y0.a aVar = (Y0.a) AbstractC0943b.a(parcel, Y0.a.CREATOR);
            AbstractC0943b.b(parcel);
            p0(status, aVar);
        } else if (i4 == 2) {
            Status status2 = (Status) AbstractC0943b.a(parcel, Status.CREATOR);
            c cVar = (c) AbstractC0943b.a(parcel, c.CREATOR);
            AbstractC0943b.b(parcel);
            B(status2, cVar);
        } else if (i4 == 3) {
            Status status3 = (Status) AbstractC0943b.a(parcel, Status.CREATOR);
            b bVar = (b) AbstractC0943b.a(parcel, b.CREATOR);
            AbstractC0943b.b(parcel);
            L(status3, bVar);
        } else {
            if (i4 != 4) {
                return false;
            }
            Status status4 = (Status) AbstractC0943b.a(parcel, Status.CREATOR);
            AbstractC0943b.b(parcel);
            F0(status4);
        }
        return true;
    }
}
