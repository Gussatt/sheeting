package com.google.android.gms.common.internal;

import V0.E;
import V0.F;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.zzb;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzaf extends zzb implements F {
    public static F zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return iInterfaceQueryLocalInterface instanceof F ? (F) iInterfaceQueryLocalInterface : new E(iBinder);
    }
}
