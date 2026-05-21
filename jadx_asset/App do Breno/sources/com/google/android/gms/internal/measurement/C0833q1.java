package com.google.android.gms.internal.measurement;

import V0.AbstractC0549h;
import android.app.Activity;
import android.os.Bundle;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.q1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0833q1 extends AbstractRunnableC0817o1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Bundle f6926q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Activity f6927r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0896y1 f6928s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0833q1(C0896y1 c0896y1, Bundle bundle, Activity activity) {
        super(c0896y1.f7017b, true);
        this.f6926q = bundle;
        this.f6927r = activity;
        this.f6928s = c0896y1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0817o1
    public final void a() {
        Bundle bundle;
        Bundle bundle2 = this.f6926q;
        if (bundle2 != null) {
            bundle = new Bundle();
            if (bundle2.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = bundle2.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        InterfaceC0871v0 interfaceC0871v0 = (InterfaceC0871v0) AbstractC0549h.j(this.f6928s.f7017b.f7033i);
        Activity activity = this.f6927r;
        interfaceC0871v0.onActivityCreatedByScionActivityInfo(H0.d(activity), bundle, this.f6906n);
    }
}
