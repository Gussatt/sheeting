package f1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: f1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0942a implements IInterface {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final IBinder f7199l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f7200m;

    public AbstractC0942a(IBinder iBinder, String str) {
        this.f7199l = iBinder;
        this.f7200m = str;
    }

    public final Parcel a() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f7200m);
        return parcelObtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f7199l;
    }

    public final void r(int i4, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f7199l.transact(i4, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    public final void u(int i4, Parcel parcel) {
        try {
            this.f7199l.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
