package androidx.core.app.unusedapprestrictions;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public interface IUnusedAppRestrictionsBackportCallback extends IInterface {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f4575j = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportCallback".replace('$', '.');

    public static abstract class Stub extends Binder implements IUnusedAppRestrictionsBackportCallback {

        public static class a implements IUnusedAppRestrictionsBackportCallback {

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public IBinder f4576l;

            public a(IBinder iBinder) {
                this.f4576l = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4576l;
            }
        }

        public static IUnusedAppRestrictionsBackportCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IUnusedAppRestrictionsBackportCallback.f4575j);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IUnusedAppRestrictionsBackportCallback)) ? new a(iBinder) : (IUnusedAppRestrictionsBackportCallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) {
            String str = IUnusedAppRestrictionsBackportCallback.f4575j;
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
            B0(parcel.readInt() != 0, parcel.readInt() != 0);
            return true;
        }
    }

    void B0(boolean z3, boolean z4);
}
