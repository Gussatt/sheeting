package android.support.customtabs;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public interface IEngagementSignalsCallback extends IInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f4059c = "android$support$customtabs$IEngagementSignalsCallback".replace('$', '.');

    public static abstract class Stub extends Binder implements IEngagementSignalsCallback {

        public static class a implements IEngagementSignalsCallback {

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public IBinder f4060l;

            public a(IBinder iBinder) {
                this.f4060l = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4060l;
            }
        }

        public static IEngagementSignalsCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IEngagementSignalsCallback.f4059c);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IEngagementSignalsCallback)) ? new a(iBinder) : (IEngagementSignalsCallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) {
            String str = IEngagementSignalsCallback.f4059c;
            if (i4 >= 1 && i4 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i4 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i4 == 2) {
                c1(parcel.readInt() != 0, (Bundle) a.b(parcel, Bundle.CREATOR));
            } else if (i4 == 3) {
                n0(parcel.readInt(), (Bundle) a.b(parcel, Bundle.CREATOR));
            } else {
                if (i4 != 4) {
                    return super.onTransact(i4, parcel, parcel2, i5);
                }
                L0(parcel.readInt() != 0, (Bundle) a.b(parcel, Bundle.CREATOR));
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

    void L0(boolean z3, Bundle bundle);

    void c1(boolean z3, Bundle bundle);

    void n0(int i4, Bundle bundle);
}
