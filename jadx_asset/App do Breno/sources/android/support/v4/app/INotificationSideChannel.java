package android.support.v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public interface INotificationSideChannel extends IInterface {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f4067g = "android$support$v4$app$INotificationSideChannel".replace('$', '.');

    public static abstract class Stub extends Binder implements INotificationSideChannel {

        public static class a implements INotificationSideChannel {

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public IBinder f4068l;

            public a(IBinder iBinder) {
                this.f4068l = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4068l;
            }
        }

        public static INotificationSideChannel asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(INotificationSideChannel.f4067g);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof INotificationSideChannel)) ? new a(iBinder) : (INotificationSideChannel) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) {
            String str = INotificationSideChannel.f4067g;
            if (i4 >= 1 && i4 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i4 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i4 == 1) {
                X0(parcel.readString(), parcel.readInt(), parcel.readString(), (Notification) a.b(parcel, Notification.CREATOR));
            } else if (i4 == 2) {
                G(parcel.readString(), parcel.readInt(), parcel.readString());
            } else {
                if (i4 != 3) {
                    return super.onTransact(i4, parcel, parcel2, i5);
                }
                s0(parcel.readString());
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

    void G(String str, int i4, String str2);

    void X0(String str, int i4, String str2, Notification notification);

    void s0(String str);
}
