package android.support.customtabs;

import O.h;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public interface ICustomTabsCallback extends IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f4055a = "android$support$customtabs$ICustomTabsCallback".replace('$', '.');

    public static abstract class Stub extends Binder implements ICustomTabsCallback {

        public static class a implements ICustomTabsCallback {

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public IBinder f4056l;

            public a(IBinder iBinder) {
                this.f4056l = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4056l;
            }
        }

        public static ICustomTabsCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ICustomTabsCallback.f4055a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ICustomTabsCallback)) ? new a(iBinder) : (ICustomTabsCallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) {
            String str = ICustomTabsCallback.f4055a;
            if (i4 >= 1 && i4 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i4 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i4) {
                case 2:
                    r0(parcel.readInt(), (Bundle) a.c(parcel, Bundle.CREATOR));
                    return true;
                case 3:
                    X(parcel.readString(), (Bundle) a.c(parcel, Bundle.CREATOR));
                    return true;
                case h.LONG_FIELD_NUMBER /* 4 */:
                    T0((Bundle) a.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case h.STRING_FIELD_NUMBER /* 5 */:
                    Q0(parcel.readString(), (Bundle) a.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case h.STRING_SET_FIELD_NUMBER /* 6 */:
                    Z0(parcel.readInt(), (Uri) a.c(parcel, Uri.CREATOR), parcel.readInt() != 0, (Bundle) a.c(parcel, Bundle.CREATOR));
                    return true;
                case h.DOUBLE_FIELD_NUMBER /* 7 */:
                    Bundle bundleY0 = y0(parcel.readString(), (Bundle) a.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    a.d(parcel2, bundleY0, 1);
                    return true;
                case h.BYTES_FIELD_NUMBER /* 8 */:
                    z(parcel.readInt(), parcel.readInt(), (Bundle) a.c(parcel, Bundle.CREATOR));
                    return true;
                case 9:
                    k0((Bundle) a.c(parcel, Bundle.CREATOR));
                    return true;
                case 10:
                    c0(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (Bundle) a.c(parcel, Bundle.CREATOR));
                    return true;
                case 11:
                    d1((Bundle) a.c(parcel, Bundle.CREATOR));
                    return true;
                case 12:
                    i1((Bundle) a.c(parcel, Bundle.CREATOR));
                    return true;
                default:
                    return super.onTransact(i4, parcel, parcel2, i5);
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

    void Q0(String str, Bundle bundle);

    void T0(Bundle bundle);

    void X(String str, Bundle bundle);

    void Z0(int i4, Uri uri, boolean z3, Bundle bundle);

    void c0(int i4, int i5, int i6, int i7, int i8, Bundle bundle);

    void d1(Bundle bundle);

    void i1(Bundle bundle);

    void k0(Bundle bundle);

    void r0(int i4, Bundle bundle);

    Bundle y0(String str, Bundle bundle);

    void z(int i4, int i5, Bundle bundle);
}
