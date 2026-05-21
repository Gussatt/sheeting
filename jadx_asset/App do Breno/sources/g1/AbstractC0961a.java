package g1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: g1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0961a implements IInterface {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final IBinder f7297l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f7298m;

    public AbstractC0961a(IBinder iBinder, String str) {
        this.f7297l = iBinder;
        this.f7298m = str;
    }

    public final Parcel a(int i4, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f7297l.transact(i4, parcel, parcelObtain, 0);
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

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f7297l;
    }

    public final Parcel r() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f7298m);
        return parcelObtain;
    }
}
