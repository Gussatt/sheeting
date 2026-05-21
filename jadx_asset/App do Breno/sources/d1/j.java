package d1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import g1.AbstractC0961a;
import g1.AbstractC0964d;

/* JADX INFO: loaded from: classes.dex */
public final class j extends AbstractC0961a implements IInterface {
    public j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final IObjectWrapper o1(IObjectWrapper iObjectWrapper, String str, int i4, IObjectWrapper iObjectWrapper2) {
        Parcel parcelR = r();
        AbstractC0964d.e(parcelR, iObjectWrapper);
        parcelR.writeString(str);
        parcelR.writeInt(i4);
        AbstractC0964d.e(parcelR, iObjectWrapper2);
        Parcel parcelA = a(3, parcelR);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelA.readStrongBinder());
        parcelA.recycle();
        return iObjectWrapperAsInterface;
    }

    public final IObjectWrapper u(IObjectWrapper iObjectWrapper, String str, int i4, IObjectWrapper iObjectWrapper2) {
        Parcel parcelR = r();
        AbstractC0964d.e(parcelR, iObjectWrapper);
        parcelR.writeString(str);
        parcelR.writeInt(i4);
        AbstractC0964d.e(parcelR, iObjectWrapper2);
        Parcel parcelA = a(2, parcelR);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelA.readStrongBinder());
        parcelA.recycle();
        return iObjectWrapperAsInterface;
    }
}
