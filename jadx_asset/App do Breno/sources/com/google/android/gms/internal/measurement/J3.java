package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class J3 extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ K3 f6377a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J3(K3 k32, Handler handler) {
        super(null);
        this.f6377a = k32;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z3) {
        this.f6377a.f();
    }
}
