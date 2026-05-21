package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzcu extends zzbn implements InterfaceC0871v0 {
    public zzcu() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static InterfaceC0871v0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC0871v0 ? (InterfaceC0871v0) iInterfaceQueryLocalInterface : new C0863u0(iBinder);
    }

    @Override // com.google.android.gms.internal.measurement.zzbn
    public final boolean a(int i4, Parcel parcel, Parcel parcel2, int i5) {
        InterfaceC0887x0 c0879w0 = null;
        A0 c0895y0 = null;
        InterfaceC0887x0 c0879w02 = null;
        InterfaceC0887x0 c0879w03 = null;
        InterfaceC0887x0 c0879w04 = null;
        InterfaceC0887x0 c0879w05 = null;
        C0 b02 = null;
        C0 b03 = null;
        C0 b04 = null;
        InterfaceC0887x0 c0879w06 = null;
        InterfaceC0887x0 c0879w07 = null;
        InterfaceC0887x0 c0879w08 = null;
        InterfaceC0887x0 c0879w09 = null;
        InterfaceC0887x0 c0879w010 = null;
        InterfaceC0887x0 c0879w011 = null;
        E0 d02 = null;
        InterfaceC0887x0 c0879w012 = null;
        InterfaceC0887x0 c0879w013 = null;
        InterfaceC0887x0 c0879w014 = null;
        InterfaceC0887x0 c0879w015 = null;
        InterfaceC0887x0 c0879w016 = null;
        switch (i4) {
            case 1:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                F0 f02 = (F0) Q.a(parcel, F0.CREATOR);
                long j4 = parcel.readLong();
                Q.c(parcel);
                initialize(iObjectWrapperAsInterface, f02, j4);
                break;
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) Q.a(parcel, Bundle.CREATOR);
                boolean zF = Q.f(parcel);
                boolean zF2 = Q.f(parcel);
                long j5 = parcel.readLong();
                Q.c(parcel);
                logEvent(string, string2, bundle, zF, zF2, j5);
                break;
            case 3:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Bundle bundle2 = (Bundle) Q.a(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c0879w0 = iInterfaceQueryLocalInterface instanceof InterfaceC0887x0 ? (InterfaceC0887x0) iInterfaceQueryLocalInterface : new C0879w0(strongBinder);
                }
                long j6 = parcel.readLong();
                Q.c(parcel);
                logEventAndBundle(string3, string4, bundle2, c0879w0, j6);
                break;
            case O.h.LONG_FIELD_NUMBER /* 4 */:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                boolean zF3 = Q.f(parcel);
                long j7 = parcel.readLong();
                Q.c(parcel);
                setUserProperty(string5, string6, iObjectWrapperAsInterface2, zF3, j7);
                break;
            case O.h.STRING_FIELD_NUMBER /* 5 */:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                boolean zF4 = Q.f(parcel);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c0879w016 = iInterfaceQueryLocalInterface2 instanceof InterfaceC0887x0 ? (InterfaceC0887x0) iInterfaceQueryLocalInterface2 : new C0879w0(strongBinder2);
                }
                Q.c(parcel);
                getUserProperties(string7, string8, zF4, c0879w016);
                break;
            case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
                String string9 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c0879w015 = iInterfaceQueryLocalInterface3 instanceof InterfaceC0887x0 ? (InterfaceC0887x0) iInterfaceQueryLocalInterface3 : new C0879w0(strongBinder3);
                }
                Q.c(parcel);
                getMaxUserProperties(string9, c0879w015);
                break;
            case O.h.DOUBLE_FIELD_NUMBER /* 7 */:
                String string10 = parcel.readString();
                long j8 = parcel.readLong();
                Q.c(parcel);
                setUserId(string10, j8);
                break;
            case O.h.BYTES_FIELD_NUMBER /* 8 */:
                Bundle bundle3 = (Bundle) Q.a(parcel, Bundle.CREATOR);
                long j9 = parcel.readLong();
                Q.c(parcel);
                setConditionalUserProperty(bundle3, j9);
                break;
            case 9:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                Bundle bundle4 = (Bundle) Q.a(parcel, Bundle.CREATOR);
                Q.c(parcel);
                clearConditionalUserProperty(string11, string12, bundle4);
                break;
            case 10:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c0879w014 = iInterfaceQueryLocalInterface4 instanceof InterfaceC0887x0 ? (InterfaceC0887x0) iInterfaceQueryLocalInterface4 : new C0879w0(strongBinder4);
                }
                Q.c(parcel);
                getConditionalUserProperties(string13, string14, c0879w014);
                break;
            case 11:
                boolean zF5 = Q.f(parcel);
                long j10 = parcel.readLong();
                Q.c(parcel);
                setMeasurementEnabled(zF5, j10);
                break;
            case 12:
                long j11 = parcel.readLong();
                Q.c(parcel);
                resetAnalyticsData(j11);
                break;
            case 13:
                long j12 = parcel.readLong();
                Q.c(parcel);
                setMinimumSessionDuration(j12);
                break;
            case 14:
                long j13 = parcel.readLong();
                Q.c(parcel);
                setSessionTimeoutDuration(j13);
                break;
            case 15:
                IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                long j14 = parcel.readLong();
                Q.c(parcel);
                setCurrentScreen(iObjectWrapperAsInterface3, string15, string16, j14);
                break;
            case 16:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c0879w013 = iInterfaceQueryLocalInterface5 instanceof InterfaceC0887x0 ? (InterfaceC0887x0) iInterfaceQueryLocalInterface5 : new C0879w0(strongBinder5);
                }
                Q.c(parcel);
                getCurrentScreenName(c0879w013);
                break;
            case 17:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c0879w012 = iInterfaceQueryLocalInterface6 instanceof InterfaceC0887x0 ? (InterfaceC0887x0) iInterfaceQueryLocalInterface6 : new C0879w0(strongBinder6);
                }
                Q.c(parcel);
                getCurrentScreenClass(c0879w012);
                break;
            case 18:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    d02 = iInterfaceQueryLocalInterface7 instanceof E0 ? (E0) iInterfaceQueryLocalInterface7 : new D0(strongBinder7);
                }
                Q.c(parcel);
                setInstanceIdProvider(d02);
                break;
            case 19:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c0879w011 = iInterfaceQueryLocalInterface8 instanceof InterfaceC0887x0 ? (InterfaceC0887x0) iInterfaceQueryLocalInterface8 : new C0879w0(strongBinder8);
                }
                Q.c(parcel);
                getCachedAppInstanceId(c0879w011);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c0879w010 = iInterfaceQueryLocalInterface9 instanceof InterfaceC0887x0 ? (InterfaceC0887x0) iInterfaceQueryLocalInterface9 : new C0879w0(strongBinder9);
                }
                Q.c(parcel);
                getAppInstanceId(c0879w010);
                break;
            case 21:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c0879w09 = iInterfaceQueryLocalInterface10 instanceof InterfaceC0887x0 ? (InterfaceC0887x0) iInterfaceQueryLocalInterface10 : new C0879w0(strongBinder10);
                }
                Q.c(parcel);
                getGmpAppId(c0879w09);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c0879w08 = iInterfaceQueryLocalInterface11 instanceof InterfaceC0887x0 ? (InterfaceC0887x0) iInterfaceQueryLocalInterface11 : new C0879w0(strongBinder11);
                }
                Q.c(parcel);
                generateEventId(c0879w08);
                break;
            case 23:
                String string17 = parcel.readString();
                long j15 = parcel.readLong();
                Q.c(parcel);
                beginAdUnitExposure(string17, j15);
                break;
            case 24:
                String string18 = parcel.readString();
                long j16 = parcel.readLong();
                Q.c(parcel);
                endAdUnitExposure(string18, j16);
                break;
            case 25:
                IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                long j17 = parcel.readLong();
                Q.c(parcel);
                onActivityStarted(iObjectWrapperAsInterface4, j17);
                break;
            case 26:
                IObjectWrapper iObjectWrapperAsInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                long j18 = parcel.readLong();
                Q.c(parcel);
                onActivityStopped(iObjectWrapperAsInterface5, j18);
                break;
            case 27:
                IObjectWrapper iObjectWrapperAsInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) Q.a(parcel, Bundle.CREATOR);
                long j19 = parcel.readLong();
                Q.c(parcel);
                onActivityCreated(iObjectWrapperAsInterface6, bundle5, j19);
                break;
            case 28:
                IObjectWrapper iObjectWrapperAsInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                long j20 = parcel.readLong();
                Q.c(parcel);
                onActivityDestroyed(iObjectWrapperAsInterface7, j20);
                break;
            case 29:
                IObjectWrapper iObjectWrapperAsInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                long j21 = parcel.readLong();
                Q.c(parcel);
                onActivityPaused(iObjectWrapperAsInterface8, j21);
                break;
            case 30:
                IObjectWrapper iObjectWrapperAsInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                long j22 = parcel.readLong();
                Q.c(parcel);
                onActivityResumed(iObjectWrapperAsInterface9, j22);
                break;
            case 31:
                IObjectWrapper iObjectWrapperAsInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c0879w07 = iInterfaceQueryLocalInterface12 instanceof InterfaceC0887x0 ? (InterfaceC0887x0) iInterfaceQueryLocalInterface12 : new C0879w0(strongBinder12);
                }
                long j23 = parcel.readLong();
                Q.c(parcel);
                onActivitySaveInstanceState(iObjectWrapperAsInterface10, c0879w07, j23);
                break;
            case 32:
                Bundle bundle6 = (Bundle) Q.a(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c0879w06 = iInterfaceQueryLocalInterface13 instanceof InterfaceC0887x0 ? (InterfaceC0887x0) iInterfaceQueryLocalInterface13 : new C0879w0(strongBinder13);
                }
                long j24 = parcel.readLong();
                Q.c(parcel);
                performAction(bundle6, c0879w06, j24);
                break;
            case 33:
                int i6 = parcel.readInt();
                String string19 = parcel.readString();
                IObjectWrapper iObjectWrapperAsInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface13 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                Q.c(parcel);
                logHealthData(i6, string19, iObjectWrapperAsInterface11, iObjectWrapperAsInterface12, iObjectWrapperAsInterface13);
                break;
            case 34:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    b04 = iInterfaceQueryLocalInterface14 instanceof C0 ? (C0) iInterfaceQueryLocalInterface14 : new B0(strongBinder14);
                }
                Q.c(parcel);
                setEventInterceptor(b04);
                break;
            case 35:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    b03 = iInterfaceQueryLocalInterface15 instanceof C0 ? (C0) iInterfaceQueryLocalInterface15 : new B0(strongBinder15);
                }
                Q.c(parcel);
                registerOnMeasurementEventListener(b03);
                break;
            case 36:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    b02 = iInterfaceQueryLocalInterface16 instanceof C0 ? (C0) iInterfaceQueryLocalInterface16 : new B0(strongBinder16);
                }
                Q.c(parcel);
                unregisterOnMeasurementEventListener(b02);
                break;
            case 37:
                HashMap mapB = Q.b(parcel);
                Q.c(parcel);
                initForTests(mapB);
                break;
            case 38:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c0879w05 = iInterfaceQueryLocalInterface17 instanceof InterfaceC0887x0 ? (InterfaceC0887x0) iInterfaceQueryLocalInterface17 : new C0879w0(strongBinder17);
                }
                int i7 = parcel.readInt();
                Q.c(parcel);
                getTestFlag(c0879w05, i7);
                break;
            case 39:
                boolean zF6 = Q.f(parcel);
                Q.c(parcel);
                setDataCollectionEnabled(zF6);
                break;
            case 40:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c0879w04 = iInterfaceQueryLocalInterface18 instanceof InterfaceC0887x0 ? (InterfaceC0887x0) iInterfaceQueryLocalInterface18 : new C0879w0(strongBinder18);
                }
                Q.c(parcel);
                isDataCollectionEnabled(c0879w04);
                break;
            case 41:
            case 47:
            case 49:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) Q.a(parcel, Bundle.CREATOR);
                Q.c(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long j25 = parcel.readLong();
                Q.c(parcel);
                clearMeasurementEnabled(j25);
                break;
            case 44:
                Bundle bundle8 = (Bundle) Q.a(parcel, Bundle.CREATOR);
                long j26 = parcel.readLong();
                Q.c(parcel);
                setConsent(bundle8, j26);
                break;
            case 45:
                Bundle bundle9 = (Bundle) Q.a(parcel, Bundle.CREATOR);
                long j27 = parcel.readLong();
                Q.c(parcel);
                setConsentThirdParty(bundle9, j27);
                break;
            case 46:
                IBinder strongBinder19 = parcel.readStrongBinder();
                if (strongBinder19 != null) {
                    IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c0879w03 = iInterfaceQueryLocalInterface19 instanceof InterfaceC0887x0 ? (InterfaceC0887x0) iInterfaceQueryLocalInterface19 : new C0879w0(strongBinder19);
                }
                Q.c(parcel);
                getSessionId(c0879w03);
                break;
            case 48:
                Intent intent = (Intent) Q.a(parcel, Intent.CREATOR);
                Q.c(parcel);
                setSgtmDebugInfo(intent);
                break;
            case 50:
                H0 h02 = (H0) Q.a(parcel, H0.CREATOR);
                String string20 = parcel.readString();
                String string21 = parcel.readString();
                long j28 = parcel.readLong();
                Q.c(parcel);
                setCurrentScreenByScionActivityInfo(h02, string20, string21, j28);
                break;
            case 51:
                H0 h03 = (H0) Q.a(parcel, H0.CREATOR);
                long j29 = parcel.readLong();
                Q.c(parcel);
                onActivityStartedByScionActivityInfo(h03, j29);
                break;
            case 52:
                H0 h04 = (H0) Q.a(parcel, H0.CREATOR);
                long j30 = parcel.readLong();
                Q.c(parcel);
                onActivityStoppedByScionActivityInfo(h04, j30);
                break;
            case 53:
                H0 h05 = (H0) Q.a(parcel, H0.CREATOR);
                Bundle bundle10 = (Bundle) Q.a(parcel, Bundle.CREATOR);
                long j31 = parcel.readLong();
                Q.c(parcel);
                onActivityCreatedByScionActivityInfo(h05, bundle10, j31);
                break;
            case 54:
                H0 h06 = (H0) Q.a(parcel, H0.CREATOR);
                long j32 = parcel.readLong();
                Q.c(parcel);
                onActivityDestroyedByScionActivityInfo(h06, j32);
                break;
            case 55:
                H0 h07 = (H0) Q.a(parcel, H0.CREATOR);
                long j33 = parcel.readLong();
                Q.c(parcel);
                onActivityPausedByScionActivityInfo(h07, j33);
                break;
            case 56:
                H0 h08 = (H0) Q.a(parcel, H0.CREATOR);
                long j34 = parcel.readLong();
                Q.c(parcel);
                onActivityResumedByScionActivityInfo(h08, j34);
                break;
            case 57:
                H0 h09 = (H0) Q.a(parcel, H0.CREATOR);
                IBinder strongBinder20 = parcel.readStrongBinder();
                if (strongBinder20 != null) {
                    IInterface iInterfaceQueryLocalInterface20 = strongBinder20.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c0879w02 = iInterfaceQueryLocalInterface20 instanceof InterfaceC0887x0 ? (InterfaceC0887x0) iInterfaceQueryLocalInterface20 : new C0879w0(strongBinder20);
                }
                long j35 = parcel.readLong();
                Q.c(parcel);
                onActivitySaveInstanceStateByScionActivityInfo(h09, c0879w02, j35);
                break;
            case 58:
                IBinder strongBinder21 = parcel.readStrongBinder();
                if (strongBinder21 != null) {
                    IInterface iInterfaceQueryLocalInterface21 = strongBinder21.queryLocalInterface("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                    c0895y0 = iInterfaceQueryLocalInterface21 instanceof A0 ? (A0) iInterfaceQueryLocalInterface21 : new C0895y0(strongBinder21);
                }
                Q.c(parcel);
                retrieveAndUploadBatches(c0895y0);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
