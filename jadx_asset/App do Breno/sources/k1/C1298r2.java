package k1;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: k1.r2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1298r2 extends com.google.android.gms.internal.measurement.P implements InterfaceC1306s2 {
    public C1298r2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // k1.InterfaceC1306s2
    public final void C0(x7 x7Var) {
        Parcel parcelA = a();
        com.google.android.gms.internal.measurement.Q.d(parcelA, x7Var);
        u(26, parcelA);
    }

    @Override // k1.InterfaceC1306s2
    public final String D(x7 x7Var) {
        Parcel parcelA = a();
        com.google.android.gms.internal.measurement.Q.d(parcelA, x7Var);
        Parcel parcelR = r(11, parcelA);
        String string = parcelR.readString();
        parcelR.recycle();
        return string;
    }

    @Override // k1.InterfaceC1306s2
    public final void E0(s7 s7Var, x7 x7Var) {
        Parcel parcelA = a();
        com.google.android.gms.internal.measurement.Q.d(parcelA, s7Var);
        com.google.android.gms.internal.measurement.Q.d(parcelA, x7Var);
        u(2, parcelA);
    }

    @Override // k1.InterfaceC1306s2
    public final List F(String str, String str2, boolean z3, x7 x7Var) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        parcelA.writeString(str2);
        ClassLoader classLoader = com.google.android.gms.internal.measurement.Q.f6554a;
        parcelA.writeInt(z3 ? 1 : 0);
        com.google.android.gms.internal.measurement.Q.d(parcelA, x7Var);
        Parcel parcelR = r(14, parcelA);
        ArrayList arrayListCreateTypedArrayList = parcelR.createTypedArrayList(s7.CREATOR);
        parcelR.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // k1.InterfaceC1306s2
    public final void G0(x7 x7Var, C1216h c1216h) {
        Parcel parcelA = a();
        com.google.android.gms.internal.measurement.Q.d(parcelA, x7Var);
        com.google.android.gms.internal.measurement.Q.d(parcelA, c1216h);
        u(30, parcelA);
    }

    @Override // k1.InterfaceC1306s2
    public final List H0(String str, String str2, String str3) {
        Parcel parcelA = a();
        parcelA.writeString(null);
        parcelA.writeString(str2);
        parcelA.writeString(str3);
        Parcel parcelR = r(17, parcelA);
        ArrayList arrayListCreateTypedArrayList = parcelR.createTypedArrayList(C1232j.CREATOR);
        parcelR.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // k1.InterfaceC1306s2
    public final void N(C1150J c1150j, x7 x7Var) {
        Parcel parcelA = a();
        com.google.android.gms.internal.measurement.Q.d(parcelA, c1150j);
        com.google.android.gms.internal.measurement.Q.d(parcelA, x7Var);
        u(1, parcelA);
    }

    @Override // k1.InterfaceC1306s2
    public final void T(x7 x7Var) {
        Parcel parcelA = a();
        com.google.android.gms.internal.measurement.Q.d(parcelA, x7Var);
        u(4, parcelA);
    }

    @Override // k1.InterfaceC1306s2
    public final void V0(x7 x7Var, Bundle bundle, InterfaceC1322u2 interfaceC1322u2) {
        Parcel parcelA = a();
        com.google.android.gms.internal.measurement.Q.d(parcelA, x7Var);
        com.google.android.gms.internal.measurement.Q.d(parcelA, bundle);
        com.google.android.gms.internal.measurement.Q.e(parcelA, interfaceC1322u2);
        u(31, parcelA);
    }

    @Override // k1.InterfaceC1306s2
    public final void W0(C1232j c1232j, x7 x7Var) {
        Parcel parcelA = a();
        com.google.android.gms.internal.measurement.Q.d(parcelA, c1232j);
        com.google.android.gms.internal.measurement.Q.d(parcelA, x7Var);
        u(12, parcelA);
    }

    @Override // k1.InterfaceC1306s2
    public final void Z(x7 x7Var, S6 s6, InterfaceC1338w2 interfaceC1338w2) {
        Parcel parcelA = a();
        com.google.android.gms.internal.measurement.Q.d(parcelA, x7Var);
        com.google.android.gms.internal.measurement.Q.d(parcelA, s6);
        com.google.android.gms.internal.measurement.Q.e(parcelA, interfaceC1338w2);
        u(29, parcelA);
    }

    @Override // k1.InterfaceC1306s2
    public final void a0(x7 x7Var) {
        Parcel parcelA = a();
        com.google.android.gms.internal.measurement.Q.d(parcelA, x7Var);
        u(25, parcelA);
    }

    @Override // k1.InterfaceC1306s2
    public final void a1(x7 x7Var) {
        Parcel parcelA = a();
        com.google.android.gms.internal.measurement.Q.d(parcelA, x7Var);
        u(20, parcelA);
    }

    @Override // k1.InterfaceC1306s2
    public final C1288q b1(x7 x7Var) {
        Parcel parcelA = a();
        com.google.android.gms.internal.measurement.Q.d(parcelA, x7Var);
        Parcel parcelR = r(21, parcelA);
        C1288q c1288q = (C1288q) com.google.android.gms.internal.measurement.Q.a(parcelR, C1288q.CREATOR);
        parcelR.recycle();
        return c1288q;
    }

    @Override // k1.InterfaceC1306s2
    public final void f1(x7 x7Var) {
        Parcel parcelA = a();
        com.google.android.gms.internal.measurement.Q.d(parcelA, x7Var);
        u(6, parcelA);
    }

    @Override // k1.InterfaceC1306s2
    public final void g1(x7 x7Var) {
        Parcel parcelA = a();
        com.google.android.gms.internal.measurement.Q.d(parcelA, x7Var);
        u(27, parcelA);
    }

    @Override // k1.InterfaceC1306s2
    public final List h1(String str, String str2, x7 x7Var) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        parcelA.writeString(str2);
        com.google.android.gms.internal.measurement.Q.d(parcelA, x7Var);
        Parcel parcelR = r(16, parcelA);
        ArrayList arrayListCreateTypedArrayList = parcelR.createTypedArrayList(C1232j.CREATOR);
        parcelR.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // k1.InterfaceC1306s2
    public final void j1(long j4, String str, String str2, String str3) {
        Parcel parcelA = a();
        parcelA.writeLong(j4);
        parcelA.writeString(str);
        parcelA.writeString(str2);
        parcelA.writeString(str3);
        u(10, parcelA);
    }

    @Override // k1.InterfaceC1306s2
    public final void l0(Bundle bundle, x7 x7Var) {
        Parcel parcelA = a();
        com.google.android.gms.internal.measurement.Q.d(parcelA, bundle);
        com.google.android.gms.internal.measurement.Q.d(parcelA, x7Var);
        u(19, parcelA);
    }

    @Override // k1.InterfaceC1306s2
    public final List n1(String str, String str2, String str3, boolean z3) {
        Parcel parcelA = a();
        parcelA.writeString(null);
        parcelA.writeString(str2);
        parcelA.writeString(str3);
        ClassLoader classLoader = com.google.android.gms.internal.measurement.Q.f6554a;
        parcelA.writeInt(z3 ? 1 : 0);
        Parcel parcelR = r(15, parcelA);
        ArrayList arrayListCreateTypedArrayList = parcelR.createTypedArrayList(s7.CREATOR);
        parcelR.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // k1.InterfaceC1306s2
    public final byte[] t0(C1150J c1150j, String str) {
        Parcel parcelA = a();
        com.google.android.gms.internal.measurement.Q.d(parcelA, c1150j);
        parcelA.writeString(str);
        Parcel parcelR = r(9, parcelA);
        byte[] bArrCreateByteArray = parcelR.createByteArray();
        parcelR.recycle();
        return bArrCreateByteArray;
    }

    @Override // k1.InterfaceC1306s2
    public final void y(x7 x7Var) {
        Parcel parcelA = a();
        com.google.android.gms.internal.measurement.Q.d(parcelA, x7Var);
        u(18, parcelA);
    }
}
