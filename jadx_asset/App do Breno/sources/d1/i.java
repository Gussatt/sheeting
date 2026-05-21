package d1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import g1.AbstractC0961a;
import g1.AbstractC0964d;

/* JADX INFO: loaded from: classes.dex */
public final class i extends AbstractC0961a implements IInterface {
    public i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int e() {
        Parcel parcelA = a(6, r());
        int i4 = parcelA.readInt();
        parcelA.recycle();
        return i4;
    }

    public final int o1(IObjectWrapper iObjectWrapper, String str, boolean z3) {
        Parcel parcelR = r();
        AbstractC0964d.e(parcelR, iObjectWrapper);
        parcelR.writeString(str);
        parcelR.writeInt(z3 ? 1 : 0);
        Parcel parcelA = a(5, parcelR);
        int i4 = parcelA.readInt();
        parcelA.recycle();
        return i4;
    }

    public final IObjectWrapper p1(IObjectWrapper iObjectWrapper, String str, int i4) {
        Parcel parcelR = r();
        AbstractC0964d.e(parcelR, iObjectWrapper);
        parcelR.writeString(str);
        parcelR.writeInt(i4);
        Parcel parcelA = a(2, parcelR);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelA.readStrongBinder());
        parcelA.recycle();
        return iObjectWrapperAsInterface;
    }

    public final IObjectWrapper q1(IObjectWrapper iObjectWrapper, String str, int i4, IObjectWrapper iObjectWrapper2) {
        Parcel parcelR = r();
        AbstractC0964d.e(parcelR, iObjectWrapper);
        parcelR.writeString(str);
        parcelR.writeInt(i4);
        AbstractC0964d.e(parcelR, iObjectWrapper2);
        Parcel parcelA = a(8, parcelR);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelA.readStrongBinder());
        parcelA.recycle();
        return iObjectWrapperAsInterface;
    }

    public final IObjectWrapper r1(IObjectWrapper iObjectWrapper, String str, int i4) {
        Parcel parcelR = r();
        AbstractC0964d.e(parcelR, iObjectWrapper);
        parcelR.writeString(str);
        parcelR.writeInt(i4);
        Parcel parcelA = a(4, parcelR);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelA.readStrongBinder());
        parcelA.recycle();
        return iObjectWrapperAsInterface;
    }

    public final IObjectWrapper s1(IObjectWrapper iObjectWrapper, String str, boolean z3, long j4) {
        Parcel parcelR = r();
        AbstractC0964d.e(parcelR, iObjectWrapper);
        parcelR.writeString(str);
        parcelR.writeInt(z3 ? 1 : 0);
        parcelR.writeLong(j4);
        Parcel parcelA = a(7, parcelR);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelA.readStrongBinder());
        parcelA.recycle();
        return iObjectWrapperAsInterface;
    }

    public final int u(IObjectWrapper iObjectWrapper, String str, boolean z3) {
        Parcel parcelR = r();
        AbstractC0964d.e(parcelR, iObjectWrapper);
        parcelR.writeString(str);
        parcelR.writeInt(z3 ? 1 : 0);
        Parcel parcelA = a(3, parcelR);
        int i4 = parcelA.readInt();
        parcelA.recycle();
        return i4;
    }
}
