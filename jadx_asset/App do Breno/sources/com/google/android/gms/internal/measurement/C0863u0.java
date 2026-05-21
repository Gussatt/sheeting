package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0863u0 extends P implements InterfaceC0871v0 {
    public C0863u0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public final void beginAdUnitExposure(String str, long j4) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        parcelA.writeLong(j4);
        u(23, parcelA);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        parcelA.writeString(str2);
        Q.d(parcelA, bundle);
        u(9, parcelA);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public final void endAdUnitExposure(String str, long j4) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        parcelA.writeLong(j4);
        u(24, parcelA);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public final void generateEventId(InterfaceC0887x0 interfaceC0887x0) {
        Parcel parcelA = a();
        Q.e(parcelA, interfaceC0887x0);
        u(22, parcelA);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public final void getAppInstanceId(InterfaceC0887x0 interfaceC0887x0) {
        Parcel parcelA = a();
        Q.e(parcelA, interfaceC0887x0);
        u(20, parcelA);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public final void getCachedAppInstanceId(InterfaceC0887x0 interfaceC0887x0) {
        Parcel parcelA = a();
        Q.e(parcelA, interfaceC0887x0);
        u(19, parcelA);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public final void getConditionalUserProperties(String str, String str2, InterfaceC0887x0 interfaceC0887x0) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        parcelA.writeString(str2);
        Q.e(parcelA, interfaceC0887x0);
        u(10, parcelA);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public final void getCurrentScreenClass(InterfaceC0887x0 interfaceC0887x0) {
        Parcel parcelA = a();
        Q.e(parcelA, interfaceC0887x0);
        u(17, parcelA);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public final void getCurrentScreenName(InterfaceC0887x0 interfaceC0887x0) {
        Parcel parcelA = a();
        Q.e(parcelA, interfaceC0887x0);
        u(16, parcelA);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public final void getGmpAppId(InterfaceC0887x0 interfaceC0887x0) {
        Parcel parcelA = a();
        Q.e(parcelA, interfaceC0887x0);
        u(21, parcelA);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public final void getMaxUserProperties(String str, InterfaceC0887x0 interfaceC0887x0) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        Q.e(parcelA, interfaceC0887x0);
        u(6, parcelA);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public final void getSessionId(InterfaceC0887x0 interfaceC0887x0) {
        Parcel parcelA = a();
        Q.e(parcelA, interfaceC0887x0);
        u(46, parcelA);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public final void getUserProperties(String str, String str2, boolean z3, InterfaceC0887x0 interfaceC0887x0) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        parcelA.writeString(str2);
        ClassLoader classLoader = Q.f6554a;
        parcelA.writeInt(z3 ? 1 : 0);
        Q.e(parcelA, interfaceC0887x0);
        u(5, parcelA);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public final void initialize(IObjectWrapper iObjectWrapper, F0 f02, long j4) {
        Parcel parcelA = a();
        Q.e(parcelA, iObjectWrapper);
        Q.d(parcelA, f02);
        parcelA.writeLong(j4);
        u(1, parcelA);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public final void logEvent(String str, String str2, Bundle bundle, boolean z3, boolean z4, long j4) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        parcelA.writeString(str2);
        Q.d(parcelA, bundle);
        parcelA.writeInt(z3 ? 1 : 0);
        parcelA.writeInt(z4 ? 1 : 0);
        parcelA.writeLong(j4);
        u(2, parcelA);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public final void logHealthData(int i4, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        Parcel parcelA = a();
        parcelA.writeInt(5);
        parcelA.writeString(str);
        Q.e(parcelA, iObjectWrapper);
        Q.e(parcelA, iObjectWrapper2);
        Q.e(parcelA, iObjectWrapper3);
        u(33, parcelA);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public final void onActivityCreatedByScionActivityInfo(H0 h02, Bundle bundle, long j4) {
        Parcel parcelA = a();
        Q.d(parcelA, h02);
        Q.d(parcelA, bundle);
        parcelA.writeLong(j4);
        u(53, parcelA);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public final void onActivityDestroyedByScionActivityInfo(H0 h02, long j4) {
        Parcel parcelA = a();
        Q.d(parcelA, h02);
        parcelA.writeLong(j4);
        u(54, parcelA);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public final void onActivityPausedByScionActivityInfo(H0 h02, long j4) {
        Parcel parcelA = a();
        Q.d(parcelA, h02);
        parcelA.writeLong(j4);
        u(55, parcelA);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public final void onActivityResumedByScionActivityInfo(H0 h02, long j4) {
        Parcel parcelA = a();
        Q.d(parcelA, h02);
        parcelA.writeLong(j4);
        u(56, parcelA);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public final void onActivitySaveInstanceStateByScionActivityInfo(H0 h02, InterfaceC0887x0 interfaceC0887x0, long j4) {
        Parcel parcelA = a();
        Q.d(parcelA, h02);
        Q.e(parcelA, interfaceC0887x0);
        parcelA.writeLong(j4);
        u(57, parcelA);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public final void onActivityStartedByScionActivityInfo(H0 h02, long j4) {
        Parcel parcelA = a();
        Q.d(parcelA, h02);
        parcelA.writeLong(j4);
        u(51, parcelA);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public final void onActivityStoppedByScionActivityInfo(H0 h02, long j4) {
        Parcel parcelA = a();
        Q.d(parcelA, h02);
        parcelA.writeLong(j4);
        u(52, parcelA);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public final void registerOnMeasurementEventListener(C0 c02) {
        Parcel parcelA = a();
        Q.e(parcelA, c02);
        u(35, parcelA);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public final void resetAnalyticsData(long j4) {
        Parcel parcelA = a();
        parcelA.writeLong(j4);
        u(12, parcelA);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public final void retrieveAndUploadBatches(A0 a02) {
        Parcel parcelA = a();
        Q.e(parcelA, a02);
        u(58, parcelA);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public final void setConditionalUserProperty(Bundle bundle, long j4) {
        Parcel parcelA = a();
        Q.d(parcelA, bundle);
        parcelA.writeLong(j4);
        u(8, parcelA);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public final void setConsentThirdParty(Bundle bundle, long j4) {
        Parcel parcelA = a();
        Q.d(parcelA, bundle);
        parcelA.writeLong(j4);
        u(45, parcelA);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public final void setCurrentScreenByScionActivityInfo(H0 h02, String str, String str2, long j4) {
        Parcel parcelA = a();
        Q.d(parcelA, h02);
        parcelA.writeString(str);
        parcelA.writeString(str2);
        parcelA.writeLong(j4);
        u(50, parcelA);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public final void setDataCollectionEnabled(boolean z3) {
        Parcel parcelA = a();
        ClassLoader classLoader = Q.f6554a;
        parcelA.writeInt(z3 ? 1 : 0);
        u(39, parcelA);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public final void setDefaultEventParameters(Bundle bundle) {
        Parcel parcelA = a();
        Q.d(parcelA, bundle);
        u(42, parcelA);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public final void setMeasurementEnabled(boolean z3, long j4) {
        Parcel parcelA = a();
        ClassLoader classLoader = Q.f6554a;
        parcelA.writeInt(z3 ? 1 : 0);
        parcelA.writeLong(j4);
        u(11, parcelA);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public final void setSessionTimeoutDuration(long j4) {
        Parcel parcelA = a();
        parcelA.writeLong(j4);
        u(14, parcelA);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public final void setUserId(String str, long j4) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        parcelA.writeLong(j4);
        u(7, parcelA);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public final void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z3, long j4) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        parcelA.writeString(str2);
        Q.e(parcelA, iObjectWrapper);
        parcelA.writeInt(z3 ? 1 : 0);
        parcelA.writeLong(j4);
        u(4, parcelA);
    }
}
