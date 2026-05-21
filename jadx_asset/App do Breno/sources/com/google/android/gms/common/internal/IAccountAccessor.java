package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.common.zzb;
import g1.AbstractC0964d;

/* JADX INFO: loaded from: classes.dex */
public interface IAccountAccessor extends IInterface {

    public static abstract class Stub extends zzb implements IAccountAccessor {
        public static IAccountAccessor asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return iInterfaceQueryLocalInterface instanceof IAccountAccessor ? (IAccountAccessor) iInterfaceQueryLocalInterface : new l(iBinder);
        }

        @Override // com.google.android.gms.internal.common.zzb
        public final boolean a(int i4, Parcel parcel, Parcel parcel2, int i5) {
            if (i4 != 2) {
                return false;
            }
            Account accountB = b();
            parcel2.writeNoException();
            AbstractC0964d.d(parcel2, accountB);
            return true;
        }
    }

    Account b();
}
