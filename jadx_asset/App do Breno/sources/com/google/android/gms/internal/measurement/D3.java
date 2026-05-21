package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class D3 extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F3 f6315a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D3(F3 f32, Handler handler) {
        super(null);
        this.f6315a = f32;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z3) {
        this.f6315a.f6337a.set(true);
    }
}
