package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.common.zzb;

/* JADX INFO: loaded from: classes.dex */
public interface ICancelToken extends IInterface {

    public static abstract class Stub extends zzb implements ICancelToken {
        public static ICancelToken asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            return iInterfaceQueryLocalInterface instanceof ICancelToken ? (ICancelToken) iInterfaceQueryLocalInterface : new m(iBinder);
        }

        @Override // com.google.android.gms.internal.common.zzb
        public final boolean a(int i4, Parcel parcel, Parcel parcel2, int i5) {
            if (i4 != 2) {
                return false;
            }
            cancel();
            return true;
        }
    }

    void cancel();
}
