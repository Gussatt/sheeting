package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class P implements IInterface {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final IBinder f6494l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f6495m;

    public P(IBinder iBinder, String str) {
        this.f6494l = iBinder;
        this.f6495m = str;
    }

    public final Parcel a() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f6495m);
        return parcelObtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f6494l;
    }

    public final void o1(int i4, Parcel parcel) {
        try {
            this.f6494l.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public final Parcel r(int i4, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f6494l.transact(i4, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e4) {
                parcelObtain.recycle();
                throw e4;
            }
        } finally {
            parcel.recycle();
        }
    }

    public final void u(int i4, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f6494l.transact(i4, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
