package android.support.customtabs.trusted;

import O.h;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public interface ITrustedWebActivityService extends IInterface {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f4065f = "android$support$customtabs$trusted$ITrustedWebActivityService".replace('$', '.');

    public static abstract class Stub extends Binder implements ITrustedWebActivityService {

        public static class a implements ITrustedWebActivityService {

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public IBinder f4066l;

            public a(IBinder iBinder) {
                this.f4066l = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4066l;
            }
        }

        public static ITrustedWebActivityService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ITrustedWebActivityService.f4065f);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ITrustedWebActivityService)) ? new a(iBinder) : (ITrustedWebActivityService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) {
            String str = ITrustedWebActivityService.f4065f;
            if (i4 >= 1 && i4 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i4 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i4) {
                case 2:
                    Bundle bundleI0 = i0((Bundle) a.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    a.d(parcel2, bundleI0, 1);
                    return true;
                case 3:
                    e0((Bundle) a.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case h.LONG_FIELD_NUMBER /* 4 */:
                    int iA = A();
                    parcel2.writeNoException();
                    parcel2.writeInt(iA);
                    return true;
                case h.STRING_FIELD_NUMBER /* 5 */:
                    Bundle bundleW = W();
                    parcel2.writeNoException();
                    a.d(parcel2, bundleW, 1);
                    return true;
                case h.STRING_SET_FIELD_NUMBER /* 6 */:
                    Bundle bundleH = H((Bundle) a.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    a.d(parcel2, bundleH, 1);
                    return true;
                case h.DOUBLE_FIELD_NUMBER /* 7 */:
                    Bundle bundleC = C();
                    parcel2.writeNoException();
                    a.d(parcel2, bundleC, 1);
                    return true;
                case h.BYTES_FIELD_NUMBER /* 8 */:
                default:
                    return super.onTransact(i4, parcel, parcel2, i5);
                case 9:
                    Bundle bundleK0 = K0(parcel.readString(), (Bundle) a.c(parcel, Bundle.CREATOR), parcel.readStrongBinder());
                    parcel2.writeNoException();
                    a.d(parcel2, bundleK0, 1);
                    return true;
            }
        }
    }

    public static class a {
        public static Object c(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static void d(Parcel parcel, Parcelable parcelable, int i4) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i4);
            }
        }
    }

    int A();

    Bundle C();

    Bundle H(Bundle bundle);

    Bundle K0(String str, Bundle bundle, IBinder iBinder);

    Bundle W();

    void e0(Bundle bundle);

    Bundle i0(Bundle bundle);
}
