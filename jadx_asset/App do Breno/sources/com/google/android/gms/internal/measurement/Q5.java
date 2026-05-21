package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class Q5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unsafe f6558a;

    public Q5(Unsafe unsafe) {
        this.f6558a = unsafe;
    }

    public abstract double a(Object obj, long j4);

    public abstract float b(Object obj, long j4);

    public abstract void c(Object obj, long j4, boolean z3);

    public abstract void d(Object obj, long j4, byte b4);

    public abstract void e(Object obj, long j4, double d4);

    public abstract void f(Object obj, long j4, float f4);

    public abstract boolean g(Object obj, long j4);
}
