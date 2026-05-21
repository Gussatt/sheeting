package com.google.android.gms.common.internal;

import V0.InterfaceC0546e;
import V0.Q;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class g implements IGmsServiceBroker {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final IBinder f6254l;

    public g(IBinder iBinder) {
        this.f6254l = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f6254l;
    }

    @Override // com.google.android.gms.common.internal.IGmsServiceBroker
    public final void k1(InterfaceC0546e interfaceC0546e, b bVar) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(interfaceC0546e != null ? interfaceC0546e.asBinder() : null);
            if (bVar != null) {
                parcelObtain.writeInt(1);
                Q.a(bVar, parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f6254l.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }
}
