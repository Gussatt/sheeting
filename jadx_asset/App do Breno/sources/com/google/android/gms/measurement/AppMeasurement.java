package com.google.android.gms.measurement;

import V0.AbstractC0549h;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.F0;
import com.google.firebase.analytics.FirebaseAnalytics;
import i1.AbstractC1043c;
import i1.C1041a;
import i1.C1042b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k1.AbstractC1195e4;
import k1.C1363z3;
import k1.InterfaceC1246k5;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class AppMeasurement {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile AppMeasurement f7040b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1043c f7041a;

    public static class ConditionalUserProperty {
        public boolean mActive;
        public String mAppId;
        public long mCreationTimestamp;
        public String mExpiredEventName;
        public Bundle mExpiredEventParams;
        public String mName;
        public String mOrigin;
        public long mTimeToLive;
        public String mTimedOutEventName;
        public Bundle mTimedOutEventParams;
        public String mTriggerEventName;
        public long mTriggerTimeout;
        public String mTriggeredEventName;
        public Bundle mTriggeredEventParams;
        public long mTriggeredTimestamp;
        public Object mValue;

        public ConditionalUserProperty(Bundle bundle) {
            AbstractC0549h.j(bundle);
            this.mAppId = (String) AbstractC1195e4.a(bundle, "app_id", String.class, null);
            this.mOrigin = (String) AbstractC1195e4.a(bundle, "origin", String.class, null);
            this.mName = (String) AbstractC1195e4.a(bundle, "name", String.class, null);
            this.mValue = AbstractC1195e4.a(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) AbstractC1195e4.a(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) AbstractC1195e4.a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) AbstractC1195e4.a(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) AbstractC1195e4.a(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) AbstractC1195e4.a(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) AbstractC1195e4.a(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) AbstractC1195e4.a(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) AbstractC1195e4.a(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) AbstractC1195e4.a(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) AbstractC1195e4.a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) AbstractC1195e4.a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) AbstractC1195e4.a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }
    }

    public AppMeasurement(C1363z3 c1363z3) {
        this.f7041a = new C1041a(c1363z3);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        if (f7040b == null) {
            synchronized (AppMeasurement.class) {
                if (f7040b == null) {
                    InterfaceC1246k5 interfaceC1246k5 = (InterfaceC1246k5) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    if (interfaceC1246k5 != null) {
                        f7040b = new AppMeasurement(interfaceC1246k5);
                    } else {
                        f7040b = new AppMeasurement(C1363z3.J(context, new F0(0L, 0L, true, null, null, null, null, null), null));
                    }
                }
            }
        }
        return f7040b;
    }

    public void beginAdUnitExposure(String str) {
        this.f7041a.c(str);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f7041a.d(str, str2, bundle);
    }

    public void endAdUnitExposure(String str) {
        this.f7041a.i(str);
    }

    public long generateEventId() {
        return this.f7041a.b();
    }

    public String getAppInstanceId() {
        return this.f7041a.f();
    }

    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List listE = this.f7041a.e(str, str2);
        ArrayList arrayList = new ArrayList(listE == null ? 0 : listE.size());
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            arrayList.add(new ConditionalUserProperty((Bundle) it.next()));
        }
        return arrayList;
    }

    public String getCurrentScreenClass() {
        return this.f7041a.g();
    }

    public String getCurrentScreenName() {
        return this.f7041a.j();
    }

    public String getGmpAppId() {
        return this.f7041a.r();
    }

    public int getMaxUserProperties(String str) {
        return this.f7041a.a(str);
    }

    public Map<String, Object> getUserProperties(String str, String str2, boolean z3) {
        return this.f7041a.h(str, str2, z3);
    }

    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f7041a.l(str, str2, bundle);
    }

    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        AbstractC0549h.j(conditionalUserProperty);
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            AbstractC1195e4.b(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        AbstractC1043c abstractC1043c = this.f7041a;
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        abstractC1043c.k(bundle);
    }

    public AppMeasurement(InterfaceC1246k5 interfaceC1246k5) {
        this.f7041a = new C1042b(interfaceC1246k5);
    }
}
