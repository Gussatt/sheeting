package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zab;
import f1.AbstractC0943b;

/* JADX INFO: loaded from: classes.dex */
public interface IStatusCallback extends IInterface {

    public static abstract class Stub extends zab implements IStatusCallback {
        public static IStatusCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            return iInterfaceQueryLocalInterface instanceof IStatusCallback ? (IStatusCallback) iInterfaceQueryLocalInterface : new a(iBinder);
        }

        @Override // com.google.android.gms.internal.base.zab
        public final boolean o1(int i4, Parcel parcel, Parcel parcel2, int i5) {
            if (i4 != 1) {
                return false;
            }
            Status status = (Status) AbstractC0943b.a(parcel, Status.CREATOR);
            AbstractC0943b.b(parcel);
            v0(status);
            return true;
        }
    }

    void v0(Status status);
}
