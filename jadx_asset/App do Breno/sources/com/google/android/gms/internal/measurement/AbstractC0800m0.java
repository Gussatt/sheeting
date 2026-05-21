package com.google.android.gms.internal.measurement;

import android.os.Build;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0800m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f6883a;

    static {
        f6883a = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }
}
