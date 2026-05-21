package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0879w0 extends P implements InterfaceC0887x0 {
    public C0879w0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0887x0
    public final void k(Bundle bundle) {
        Parcel parcelA = a();
        Q.d(parcelA, bundle);
        u(1, parcelA);
    }
}
