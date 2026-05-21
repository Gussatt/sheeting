package android.support.customtabs.trusted;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public interface ITrustedWebActivityCallback extends IInterface {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f4063e = "android$support$customtabs$trusted$ITrustedWebActivityCallback".replace('$', '.');

    public static abstract class Stub extends Binder implements ITrustedWebActivityCallback {

        public static class a implements ITrustedWebActivityCallback {

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public IBinder f4064l;

            public a(IBinder iBinder) {
                this.f4064l = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4064l;
            }
        }

        public static ITrustedWebActivityCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ITrustedWebActivityCallback.f4063e);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ITrustedWebActivityCallback)) ? new a(iBinder) : (ITrustedWebActivityCallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) {
            String str = ITrustedWebActivityCallback.f4063e;
            if (i4 >= 1 && i4 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i4 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i4 != 2) {
                return super.onTransact(i4, parcel, parcel2, i5);
            }
            R0(parcel.readString(), (Bundle) a.b(parcel, Bundle.CREATOR));
            parcel2.writeNoException();
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

    void R0(String str, Bundle bundle);
}
