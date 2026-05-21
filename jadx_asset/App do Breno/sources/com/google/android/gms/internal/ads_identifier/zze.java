package com.google.android.gms.internal.ads_identifier;

import android.os.IBinder;
import android.os.IInterface;
import e1.C0928c;
import e1.InterfaceC0929d;

/* JADX INFO: loaded from: classes.dex */
public abstract class zze extends zzb implements InterfaceC0929d {
    public static InterfaceC0929d zza(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC0929d ? (InterfaceC0929d) iInterfaceQueryLocalInterface : new C0928c(iBinder);
    }
}
