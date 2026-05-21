package V0;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import g1.AbstractC0961a;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends AbstractC0961a implements C {
    public a0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // V0.C
    public final int c() {
        Parcel parcelA = a(2, r());
        int i4 = parcelA.readInt();
        parcelA.recycle();
        return i4;
    }

    @Override // V0.C
    public final IObjectWrapper d() {
        Parcel parcelA = a(1, r());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelA.readStrongBinder());
        parcelA.recycle();
        return iObjectWrapperAsInterface;
    }
}
