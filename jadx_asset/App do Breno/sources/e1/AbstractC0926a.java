package e1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: e1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0926a implements IInterface {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final IBinder f7181l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f7182m = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

    public AbstractC0926a(IBinder iBinder, String str) {
        this.f7181l = iBinder;
    }

    public final Parcel a() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f7182m);
        return parcelObtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f7181l;
    }

    public final Parcel r(int i4, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f7181l.transact(i4, parcel, parcelObtain, 0);
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
}
