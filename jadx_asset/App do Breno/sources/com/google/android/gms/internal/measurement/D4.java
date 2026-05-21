package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public abstract class D4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f6316a = 0;

    public /* synthetic */ D4(C4 c4) {
    }

    public static int a(int i4) {
        return (i4 >>> 1) ^ (-(i4 & 1));
    }

    public static long b(long j4) {
        return (j4 >>> 1) ^ (-(1 & j4));
    }
}
