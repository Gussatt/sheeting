package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public interface IResultReceiver2 extends IInterface {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f4071h = "android$support$v4$os$IResultReceiver2".replace('$', '.');

    public static abstract class Stub extends Binder implements IResultReceiver2 {

        public static class a implements IResultReceiver2 {

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public IBinder f4072l;

            public a(IBinder iBinder) {
                this.f4072l = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4072l;
            }
        }

        public static IResultReceiver2 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IResultReceiver2.f4071h);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IResultReceiver2)) ? new a(iBinder) : (IResultReceiver2) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) {
            String str = IResultReceiver2.f4071h;
            if (i4 >= 1 && i4 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i4 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i4 != 1) {
                return super.onTransact(i4, parcel, parcel2, i5);
            }
            v(parcel.readInt(), (Bundle) a.b(parcel, Bundle.CREATOR));
            return true;
        }
    }

    public static class a {
        public static Object b(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    void v(int i4, Bundle bundle);
}
