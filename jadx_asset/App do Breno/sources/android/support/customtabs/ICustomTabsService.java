package android.support.customtabs;

import O.h;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.customtabs.ICustomTabsCallback;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface ICustomTabsService extends IInterface {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f4057b = "android$support$customtabs$ICustomTabsService".replace('$', '.');

    public static abstract class Stub extends Binder implements ICustomTabsService {

        public static class a implements ICustomTabsService {

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public IBinder f4058l;

            public a(IBinder iBinder) {
                this.f4058l = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4058l;
            }
        }

        public static ICustomTabsService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ICustomTabsService.f4057b);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ICustomTabsService)) ? new a(iBinder) : (ICustomTabsService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) {
            String str = ICustomTabsService.f4057b;
            if (i4 >= 1 && i4 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i4 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i4) {
                case 2:
                    boolean zU0 = U0(parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(zU0 ? 1 : 0);
                    return true;
                case 3:
                    boolean zQ = Q(ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(zQ ? 1 : 0);
                    return true;
                case h.LONG_FIELD_NUMBER /* 4 */:
                    ICustomTabsCallback iCustomTabsCallbackAsInterface = ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder());
                    Uri uri = (Uri) a.c(parcel, Uri.CREATOR);
                    Parcelable.Creator creator = Bundle.CREATOR;
                    boolean zO = O(iCustomTabsCallbackAsInterface, uri, (Bundle) a.c(parcel, creator), parcel.createTypedArrayList(creator));
                    parcel2.writeNoException();
                    parcel2.writeInt(zO ? 1 : 0);
                    return true;
                case h.STRING_FIELD_NUMBER /* 5 */:
                    Bundle bundleA0 = A0(parcel.readString(), (Bundle) a.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    a.d(parcel2, bundleA0, 1);
                    return true;
                case h.STRING_SET_FIELD_NUMBER /* 6 */:
                    boolean zM0 = m0(ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), (Bundle) a.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zM0 ? 1 : 0);
                    return true;
                case h.DOUBLE_FIELD_NUMBER /* 7 */:
                    boolean zW0 = w0(ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), (Uri) a.c(parcel, Uri.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zW0 ? 1 : 0);
                    return true;
                case h.BYTES_FIELD_NUMBER /* 8 */:
                    int I3 = I(ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), (Bundle) a.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(I3);
                    return true;
                case 9:
                    boolean zR = R(ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), (Uri) a.c(parcel, Uri.CREATOR), (Bundle) a.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zR ? 1 : 0);
                    return true;
                case 10:
                    boolean zV = V(ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), (Bundle) a.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zV ? 1 : 0);
                    return true;
                case 11:
                    boolean zS = S(ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), (Uri) a.c(parcel, Uri.CREATOR), (Bundle) a.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zS ? 1 : 0);
                    return true;
                case 12:
                    boolean zJ0 = j0(ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), (Uri) a.c(parcel, Uri.CREATOR), parcel.readInt(), (Bundle) a.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zJ0 ? 1 : 0);
                    return true;
                case 13:
                    boolean zE1 = e1(ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), (Bundle) a.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zE1 ? 1 : 0);
                    return true;
                case 14:
                    boolean zG0 = g0(ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readStrongBinder(), (Bundle) a.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zG0 ? 1 : 0);
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

    Bundle A0(String str, Bundle bundle);

    int I(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle);

    boolean O(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle, List list);

    boolean Q(ICustomTabsCallback iCustomTabsCallback);

    boolean R(ICustomTabsCallback iCustomTabsCallback, int i4, Uri uri, Bundle bundle);

    boolean S(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle);

    boolean U0(long j4);

    boolean V(ICustomTabsCallback iCustomTabsCallback, Bundle bundle);

    boolean e1(ICustomTabsCallback iCustomTabsCallback, Bundle bundle);

    boolean g0(ICustomTabsCallback iCustomTabsCallback, IBinder iBinder, Bundle bundle);

    boolean j0(ICustomTabsCallback iCustomTabsCallback, Uri uri, int i4, Bundle bundle);

    boolean m0(ICustomTabsCallback iCustomTabsCallback, Bundle bundle);

    boolean w0(ICustomTabsCallback iCustomTabsCallback, Uri uri);
}
