package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public interface IResultReceiver extends IInterface {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f4069i = "android$support$v4$os$IResultReceiver".replace('$', '.');

    public static abstract class Stub extends Binder implements IResultReceiver {

        public static class a implements IResultReceiver {

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public IBinder f4070l;

            public a(IBinder iBinder) {
                this.f4070l = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4070l;
            }
        }

        public static IResultReceiver asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IResultReceiver.f4069i);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IResultReceiver)) ? new a(iBinder) : (IResultReceiver) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) {
            String str = IResultReceiver.f4069i;
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
