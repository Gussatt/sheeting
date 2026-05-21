package android.support.customtabs;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.customtabs.ICustomTabsCallback;

/* JADX INFO: loaded from: classes.dex */
public interface IPostMessageService extends IInterface {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f4061d = "android$support$customtabs$IPostMessageService".replace('$', '.');

    public static abstract class Stub extends Binder implements IPostMessageService {

        public static class a implements IPostMessageService {

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public IBinder f4062l;

            public a(IBinder iBinder) {
                this.f4062l = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4062l;
            }
        }

        public static IPostMessageService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IPostMessageService.f4061d);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IPostMessageService)) ? new a(iBinder) : (IPostMessageService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) {
            String str = IPostMessageService.f4061d;
            if (i4 >= 1 && i4 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i4 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i4 == 2) {
                N0(ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), (Bundle) a.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
            } else {
                if (i4 != 3) {
                    return super.onTransact(i4, parcel, parcel2, i5);
                }
                l1(ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), (Bundle) a.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
            }
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

    void N0(ICustomTabsCallback iCustomTabsCallback, Bundle bundle);

    void l1(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle);
}
