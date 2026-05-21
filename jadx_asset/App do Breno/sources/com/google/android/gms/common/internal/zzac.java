package com.google.android.gms.common.internal;

import V0.InterfaceC0546e;
import V0.N;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.common.zzb;
import g1.AbstractC0964d;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzac extends zzb implements InterfaceC0546e {
    public zzac() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean a(int i4, Parcel parcel, Parcel parcel2, int i5) {
        if (i4 == 1) {
            int i6 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) AbstractC0964d.a(parcel, Bundle.CREATOR);
            AbstractC0964d.b(parcel);
            m1(i6, strongBinder, bundle);
        } else if (i4 == 2) {
            int i7 = parcel.readInt();
            Bundle bundle2 = (Bundle) AbstractC0964d.a(parcel, Bundle.CREATOR);
            AbstractC0964d.b(parcel);
            x0(i7, bundle2);
        } else {
            if (i4 != 3) {
                return false;
            }
            int i8 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            N n4 = (N) AbstractC0964d.a(parcel, N.CREATOR);
            AbstractC0964d.b(parcel);
            M0(i8, strongBinder2, n4);
        }
        parcel2.writeNoException();
        return true;
    }
}
