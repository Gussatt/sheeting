package com.google.android.gms.measurement.internal;

import O.h;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.Q;
import com.google.android.gms.internal.measurement.zzbn;
import java.util.List;
import k1.C1150J;
import k1.C1216h;
import k1.C1232j;
import k1.C1288q;
import k1.C1314t2;
import k1.C1330v2;
import k1.InterfaceC1306s2;
import k1.InterfaceC1322u2;
import k1.InterfaceC1338w2;
import k1.S6;
import k1.s7;
import k1.x7;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzgk extends zzbn implements InterfaceC1306s2 {
    public zzgk() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.internal.measurement.zzbn
    public final boolean a(int i4, Parcel parcel, Parcel parcel2, int i5) {
        InterfaceC1338w2 c1330v2 = null;
        InterfaceC1322u2 c1314t2 = null;
        switch (i4) {
            case 1:
                C1150J c1150j = (C1150J) Q.a(parcel, C1150J.CREATOR);
                x7 x7Var = (x7) Q.a(parcel, x7.CREATOR);
                Q.c(parcel);
                N(c1150j, x7Var);
                parcel2.writeNoException();
                return true;
            case 2:
                s7 s7Var = (s7) Q.a(parcel, s7.CREATOR);
                x7 x7Var2 = (x7) Q.a(parcel, x7.CREATOR);
                Q.c(parcel);
                E0(s7Var, x7Var2);
                parcel2.writeNoException();
                return true;
            case 3:
            case h.BYTES_FIELD_NUMBER /* 8 */:
            case 22:
            case 23:
            case 28:
            default:
                return false;
            case h.LONG_FIELD_NUMBER /* 4 */:
                x7 x7Var3 = (x7) Q.a(parcel, x7.CREATOR);
                Q.c(parcel);
                T(x7Var3);
                parcel2.writeNoException();
                return true;
            case h.STRING_FIELD_NUMBER /* 5 */:
                C1150J c1150j2 = (C1150J) Q.a(parcel, C1150J.CREATOR);
                String string = parcel.readString();
                String string2 = parcel.readString();
                Q.c(parcel);
                E(c1150j2, string, string2);
                parcel2.writeNoException();
                return true;
            case h.STRING_SET_FIELD_NUMBER /* 6 */:
                x7 x7Var4 = (x7) Q.a(parcel, x7.CREATOR);
                Q.c(parcel);
                f1(x7Var4);
                parcel2.writeNoException();
                return true;
            case h.DOUBLE_FIELD_NUMBER /* 7 */:
                x7 x7Var5 = (x7) Q.a(parcel, x7.CREATOR);
                boolean zF = Q.f(parcel);
                Q.c(parcel);
                List listS0 = S0(x7Var5, zF);
                parcel2.writeNoException();
                parcel2.writeTypedList(listS0);
                return true;
            case 9:
                C1150J c1150j3 = (C1150J) Q.a(parcel, C1150J.CREATOR);
                String string3 = parcel.readString();
                Q.c(parcel);
                byte[] bArrT0 = t0(c1150j3, string3);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrT0);
                return true;
            case 10:
                long j4 = parcel.readLong();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                Q.c(parcel);
                j1(j4, string4, string5, string6);
                parcel2.writeNoException();
                return true;
            case 11:
                x7 x7Var6 = (x7) Q.a(parcel, x7.CREATOR);
                Q.c(parcel);
                String strD = D(x7Var6);
                parcel2.writeNoException();
                parcel2.writeString(strD);
                return true;
            case 12:
                C1232j c1232j = (C1232j) Q.a(parcel, C1232j.CREATOR);
                x7 x7Var7 = (x7) Q.a(parcel, x7.CREATOR);
                Q.c(parcel);
                W0(c1232j, x7Var7);
                parcel2.writeNoException();
                return true;
            case 13:
                C1232j c1232j2 = (C1232j) Q.a(parcel, C1232j.CREATOR);
                Q.c(parcel);
                J(c1232j2);
                parcel2.writeNoException();
                return true;
            case 14:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                boolean zF2 = Q.f(parcel);
                x7 x7Var8 = (x7) Q.a(parcel, x7.CREATOR);
                Q.c(parcel);
                List listF = F(string7, string8, zF2, x7Var8);
                parcel2.writeNoException();
                parcel2.writeTypedList(listF);
                return true;
            case 15:
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                boolean zF3 = Q.f(parcel);
                Q.c(parcel);
                List listN1 = n1(string9, string10, string11, zF3);
                parcel2.writeNoException();
                parcel2.writeTypedList(listN1);
                return true;
            case 16:
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                x7 x7Var9 = (x7) Q.a(parcel, x7.CREATOR);
                Q.c(parcel);
                List listH1 = h1(string12, string13, x7Var9);
                parcel2.writeNoException();
                parcel2.writeTypedList(listH1);
                return true;
            case 17:
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                Q.c(parcel);
                List listH0 = H0(string14, string15, string16);
                parcel2.writeNoException();
                parcel2.writeTypedList(listH0);
                return true;
            case 18:
                x7 x7Var10 = (x7) Q.a(parcel, x7.CREATOR);
                Q.c(parcel);
                y(x7Var10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) Q.a(parcel, Bundle.CREATOR);
                x7 x7Var11 = (x7) Q.a(parcel, x7.CREATOR);
                Q.c(parcel);
                l0(bundle, x7Var11);
                parcel2.writeNoException();
                return true;
            case 20:
                x7 x7Var12 = (x7) Q.a(parcel, x7.CREATOR);
                Q.c(parcel);
                a1(x7Var12);
                parcel2.writeNoException();
                return true;
            case 21:
                x7 x7Var13 = (x7) Q.a(parcel, x7.CREATOR);
                Q.c(parcel);
                C1288q c1288qB1 = b1(x7Var13);
                parcel2.writeNoException();
                if (c1288qB1 == null) {
                    parcel2.writeInt(0);
                } else {
                    parcel2.writeInt(1);
                    c1288qB1.writeToParcel(parcel2, 1);
                }
                return true;
            case 24:
                x7 x7Var14 = (x7) Q.a(parcel, x7.CREATOR);
                Bundle bundle2 = (Bundle) Q.a(parcel, Bundle.CREATOR);
                Q.c(parcel);
                List listD0 = d0(x7Var14, bundle2);
                parcel2.writeNoException();
                parcel2.writeTypedList(listD0);
                return true;
            case 25:
                x7 x7Var15 = (x7) Q.a(parcel, x7.CREATOR);
                Q.c(parcel);
                a0(x7Var15);
                parcel2.writeNoException();
                return true;
            case 26:
                x7 x7Var16 = (x7) Q.a(parcel, x7.CREATOR);
                Q.c(parcel);
                C0(x7Var16);
                parcel2.writeNoException();
                return true;
            case 27:
                x7 x7Var17 = (x7) Q.a(parcel, x7.CREATOR);
                Q.c(parcel);
                g1(x7Var17);
                parcel2.writeNoException();
                return true;
            case 29:
                x7 x7Var18 = (x7) Q.a(parcel, x7.CREATOR);
                S6 s6 = (S6) Q.a(parcel, S6.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    c1330v2 = iInterfaceQueryLocalInterface instanceof InterfaceC1338w2 ? (InterfaceC1338w2) iInterfaceQueryLocalInterface : new C1330v2(strongBinder);
                }
                Q.c(parcel);
                Z(x7Var18, s6, c1330v2);
                parcel2.writeNoException();
                return true;
            case 30:
                x7 x7Var19 = (x7) Q.a(parcel, x7.CREATOR);
                C1216h c1216h = (C1216h) Q.a(parcel, C1216h.CREATOR);
                Q.c(parcel);
                G0(x7Var19, c1216h);
                parcel2.writeNoException();
                return true;
            case 31:
                x7 x7Var20 = (x7) Q.a(parcel, x7.CREATOR);
                Bundle bundle3 = (Bundle) Q.a(parcel, Bundle.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    c1314t2 = iInterfaceQueryLocalInterface2 instanceof InterfaceC1322u2 ? (InterfaceC1322u2) iInterfaceQueryLocalInterface2 : new C1314t2(strongBinder2);
                }
                Q.c(parcel);
                V0(x7Var20, bundle3, c1314t2);
                parcel2.writeNoException();
                return true;
        }
    }
}
