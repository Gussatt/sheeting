package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0871v0 extends IInterface {
    void beginAdUnitExposure(String str, long j4);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j4);

    void endAdUnitExposure(String str, long j4);

    void generateEventId(InterfaceC0887x0 interfaceC0887x0);

    void getAppInstanceId(InterfaceC0887x0 interfaceC0887x0);

    void getCachedAppInstanceId(InterfaceC0887x0 interfaceC0887x0);

    void getConditionalUserProperties(String str, String str2, InterfaceC0887x0 interfaceC0887x0);

    void getCurrentScreenClass(InterfaceC0887x0 interfaceC0887x0);

    void getCurrentScreenName(InterfaceC0887x0 interfaceC0887x0);

    void getGmpAppId(InterfaceC0887x0 interfaceC0887x0);

    void getMaxUserProperties(String str, InterfaceC0887x0 interfaceC0887x0);

    void getSessionId(InterfaceC0887x0 interfaceC0887x0);

    void getTestFlag(InterfaceC0887x0 interfaceC0887x0, int i4);

    void getUserProperties(String str, String str2, boolean z3, InterfaceC0887x0 interfaceC0887x0);

    void initForTests(Map map);

    void initialize(IObjectWrapper iObjectWrapper, F0 f02, long j4);

    void isDataCollectionEnabled(InterfaceC0887x0 interfaceC0887x0);

    void logEvent(String str, String str2, Bundle bundle, boolean z3, boolean z4, long j4);

    void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC0887x0 interfaceC0887x0, long j4);

    void logHealthData(int i4, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3);

    void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j4);

    void onActivityCreatedByScionActivityInfo(H0 h02, Bundle bundle, long j4);

    void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j4);

    void onActivityDestroyedByScionActivityInfo(H0 h02, long j4);

    void onActivityPaused(IObjectWrapper iObjectWrapper, long j4);

    void onActivityPausedByScionActivityInfo(H0 h02, long j4);

    void onActivityResumed(IObjectWrapper iObjectWrapper, long j4);

    void onActivityResumedByScionActivityInfo(H0 h02, long j4);

    void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, InterfaceC0887x0 interfaceC0887x0, long j4);

    void onActivitySaveInstanceStateByScionActivityInfo(H0 h02, InterfaceC0887x0 interfaceC0887x0, long j4);

    void onActivityStarted(IObjectWrapper iObjectWrapper, long j4);

    void onActivityStartedByScionActivityInfo(H0 h02, long j4);

    void onActivityStopped(IObjectWrapper iObjectWrapper, long j4);

    void onActivityStoppedByScionActivityInfo(H0 h02, long j4);

    void performAction(Bundle bundle, InterfaceC0887x0 interfaceC0887x0, long j4);

    void registerOnMeasurementEventListener(C0 c02);

    void resetAnalyticsData(long j4);

    void retrieveAndUploadBatches(A0 a02);

    void setConditionalUserProperty(Bundle bundle, long j4);

    void setConsent(Bundle bundle, long j4);

    void setConsentThirdParty(Bundle bundle, long j4);

    void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j4);

    void setCurrentScreenByScionActivityInfo(H0 h02, String str, String str2, long j4);

    void setDataCollectionEnabled(boolean z3);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(C0 c02);

    void setInstanceIdProvider(E0 e02);

    void setMeasurementEnabled(boolean z3, long j4);

    void setMinimumSessionDuration(long j4);

    void setSessionTimeoutDuration(long j4);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j4);

    void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z3, long j4);

    void unregisterOnMeasurementEventListener(C0 c02);
}
