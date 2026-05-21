package androidx.core.app.unusedapprestrictions;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback;

/* JADX INFO: loaded from: classes.dex */
public interface IUnusedAppRestrictionsBackportService extends IInterface {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f4577k = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportService".replace('$', '.');

    public static abstract class Stub extends Binder implements IUnusedAppRestrictionsBackportService {

        public static class a implements IUnusedAppRestrictionsBackportService {

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public IBinder f4578l;

            public a(IBinder iBinder) {
                this.f4578l = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4578l;
            }
        }

        public static IUnusedAppRestrictionsBackportService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IUnusedAppRestrictionsBackportService.f4577k);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IUnusedAppRestrictionsBackportService)) ? new a(iBinder) : (IUnusedAppRestrictionsBackportService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) {
            String str = IUnusedAppRestrictionsBackportService.f4577k;
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
            u0(IUnusedAppRestrictionsBackportCallback.Stub.asInterface(parcel.readStrongBinder()));
            return true;
        }
    }

    void u0(IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback);
}
