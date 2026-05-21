package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class K4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6392b;

    public K4(Object obj, int i4) {
        this.f6391a = obj;
        this.f6392b = i4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof K4)) {
            return false;
        }
        K4 k4 = (K4) obj;
        return this.f6391a == k4.f6391a && this.f6392b == k4.f6392b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f6391a) * 65535) + this.f6392b;
    }
}
