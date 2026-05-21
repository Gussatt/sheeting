package com.google.android.gms.dynamic;

import O.h;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zzb;
import g1.AbstractC0964d;

/* JADX INFO: loaded from: classes.dex */
public interface IFragmentWrapper extends IInterface {

    public static abstract class Stub extends zzb implements IFragmentWrapper {
        public Stub() {
            super("com.google.android.gms.dynamic.IFragmentWrapper");
        }

        public static IFragmentWrapper asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IFragmentWrapper");
            return iInterfaceQueryLocalInterface instanceof IFragmentWrapper ? (IFragmentWrapper) iInterfaceQueryLocalInterface : new a(iBinder);
        }

        @Override // com.google.android.gms.internal.common.zzb
        public final boolean a(int i4, Parcel parcel, Parcel parcel2, int i5) {
            switch (i4) {
                case 2:
                    IObjectWrapper iObjectWrapperI = i();
                    parcel2.writeNoException();
                    AbstractC0964d.e(parcel2, iObjectWrapperI);
                    return true;
                case 3:
                    Bundle bundleD = d();
                    parcel2.writeNoException();
                    AbstractC0964d.d(parcel2, bundleD);
                    return true;
                case h.LONG_FIELD_NUMBER /* 4 */:
                    int iB = b();
                    parcel2.writeNoException();
                    parcel2.writeInt(iB);
                    return true;
                case h.STRING_FIELD_NUMBER /* 5 */:
                    IFragmentWrapper iFragmentWrapperE = e();
                    parcel2.writeNoException();
                    AbstractC0964d.e(parcel2, iFragmentWrapperE);
                    return true;
                case h.STRING_SET_FIELD_NUMBER /* 6 */:
                    IObjectWrapper iObjectWrapperF = f();
                    parcel2.writeNoException();
                    AbstractC0964d.e(parcel2, iObjectWrapperF);
                    return true;
                case h.DOUBLE_FIELD_NUMBER /* 7 */:
                    boolean zQ = q();
                    parcel2.writeNoException();
                    ClassLoader classLoader = AbstractC0964d.f7299a;
                    parcel2.writeInt(zQ ? 1 : 0);
                    return true;
                case h.BYTES_FIELD_NUMBER /* 8 */:
                    String strJ = j();
                    parcel2.writeNoException();
                    parcel2.writeString(strJ);
                    return true;
                case 9:
                    IFragmentWrapper iFragmentWrapperH = h();
                    parcel2.writeNoException();
                    AbstractC0964d.e(parcel2, iFragmentWrapperH);
                    return true;
                case 10:
                    int iC = c();
                    parcel2.writeNoException();
                    parcel2.writeInt(iC);
                    return true;
                case 11:
                    boolean zW = w();
                    parcel2.writeNoException();
                    ClassLoader classLoader2 = AbstractC0964d.f7299a;
                    parcel2.writeInt(zW ? 1 : 0);
                    return true;
                case 12:
                    IObjectWrapper iObjectWrapperG = g();
                    parcel2.writeNoException();
                    AbstractC0964d.e(parcel2, iObjectWrapperG);
                    return true;
                case 13:
                    boolean zM = m();
                    parcel2.writeNoException();
                    ClassLoader classLoader3 = AbstractC0964d.f7299a;
                    parcel2.writeInt(zM ? 1 : 0);
                    return true;
                case 14:
                    boolean zO = o();
                    parcel2.writeNoException();
                    ClassLoader classLoader4 = AbstractC0964d.f7299a;
                    parcel2.writeInt(zO ? 1 : 0);
                    return true;
                case 15:
                    boolean zP = p();
                    parcel2.writeNoException();
                    ClassLoader classLoader5 = AbstractC0964d.f7299a;
                    parcel2.writeInt(zP ? 1 : 0);
                    return true;
                case 16:
                    boolean zS = s();
                    parcel2.writeNoException();
                    ClassLoader classLoader6 = AbstractC0964d.f7299a;
                    parcel2.writeInt(zS ? 1 : 0);
                    return true;
                case 17:
                    boolean zL = l();
                    parcel2.writeNoException();
                    ClassLoader classLoader7 = AbstractC0964d.f7299a;
                    parcel2.writeInt(zL ? 1 : 0);
                    return true;
                case 18:
                    boolean zN = n();
                    parcel2.writeNoException();
                    ClassLoader classLoader8 = AbstractC0964d.f7299a;
                    parcel2.writeInt(zN ? 1 : 0);
                    return true;
                case 19:
                    boolean zT = t();
                    parcel2.writeNoException();
                    ClassLoader classLoader9 = AbstractC0964d.f7299a;
                    parcel2.writeInt(zT ? 1 : 0);
                    return true;
                case 20:
                    IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    AbstractC0964d.b(parcel);
                    M(iObjectWrapperAsInterface);
                    parcel2.writeNoException();
                    return true;
                case 21:
                    boolean zF = AbstractC0964d.f(parcel);
                    AbstractC0964d.b(parcel);
                    x(zF);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    boolean zF2 = AbstractC0964d.f(parcel);
                    AbstractC0964d.b(parcel);
                    P(zF2);
                    parcel2.writeNoException();
                    return true;
                case 23:
                    boolean zF3 = AbstractC0964d.f(parcel);
                    AbstractC0964d.b(parcel);
                    o0(zF3);
                    parcel2.writeNoException();
                    return true;
                case 24:
                    boolean zF4 = AbstractC0964d.f(parcel);
                    AbstractC0964d.b(parcel);
                    O0(zF4);
                    parcel2.writeNoException();
                    return true;
                case 25:
                    Intent intent = (Intent) AbstractC0964d.a(parcel, Intent.CREATOR);
                    AbstractC0964d.b(parcel);
                    z0(intent);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    Intent intent2 = (Intent) AbstractC0964d.a(parcel, Intent.CREATOR);
                    int i6 = parcel.readInt();
                    AbstractC0964d.b(parcel);
                    D0(intent2, i6);
                    parcel2.writeNoException();
                    return true;
                case 27:
                    IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    AbstractC0964d.b(parcel);
                    Y(iObjectWrapperAsInterface2);
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    void D0(Intent intent, int i4);

    void M(IObjectWrapper iObjectWrapper);

    void O0(boolean z3);

    void P(boolean z3);

    void Y(IObjectWrapper iObjectWrapper);

    int b();

    int c();

    Bundle d();

    IFragmentWrapper e();

    IObjectWrapper f();

    IObjectWrapper g();

    IFragmentWrapper h();

    IObjectWrapper i();

    String j();

    boolean l();

    boolean m();

    boolean n();

    boolean o();

    void o0(boolean z3);

    boolean p();

    boolean q();

    boolean s();

    boolean t();

    boolean w();

    void x(boolean z3);

    void z0(Intent intent);
}
