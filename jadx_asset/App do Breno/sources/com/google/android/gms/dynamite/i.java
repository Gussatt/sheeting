package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: loaded from: classes.dex */
public final class i implements DynamiteModule.b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6287a;

    public i(int i4, int i5) {
        this.f6287a = i4;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b.a
    public final int a(Context context, String str) {
        return this.f6287a;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b.a
    public final int b(Context context, String str, boolean z3) {
        return 0;
    }
}
