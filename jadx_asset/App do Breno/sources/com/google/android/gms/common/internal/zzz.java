package com.google.android.gms.common.internal;

import V0.C;
import V0.a0;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zzb;
import g1.AbstractC0964d;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzz extends zzb implements C {
    public zzz() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static C zzg(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return iInterfaceQueryLocalInterface instanceof C ? (C) iInterfaceQueryLocalInterface : new a0(iBinder);
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean a(int i4, Parcel parcel, Parcel parcel2, int i5) {
        if (i4 == 1) {
            IObjectWrapper iObjectWrapperD = d();
            parcel2.writeNoException();
            AbstractC0964d.e(parcel2, iObjectWrapperD);
        } else {
            if (i4 != 2) {
                return false;
            }
            int iC = c();
            parcel2.writeNoException();
            parcel2.writeInt(iC);
        }
        return true;
    }
}
