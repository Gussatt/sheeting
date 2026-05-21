package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import k1.InterfaceC1277o4;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.p1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC0825p1 extends zzdd {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InterfaceC1277o4 f6913l;

    public BinderC0825p1(InterfaceC1277o4 interfaceC1277o4) {
        this.f6913l = interfaceC1277o4;
    }

    @Override // com.google.android.gms.internal.measurement.C0
    public final void Y0(String str, String str2, Bundle bundle, long j4) {
        this.f6913l.a(str, str2, bundle, j4);
    }

    @Override // com.google.android.gms.internal.measurement.C0
    public final int e() {
        return System.identityHashCode(this.f6913l);
    }
}
