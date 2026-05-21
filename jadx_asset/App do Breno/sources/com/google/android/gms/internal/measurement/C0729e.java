package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0729e implements Iterator {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f6684m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0738f f6685n;

    public C0729e(C0738f c0738f) {
        this.f6685n = c0738f;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6684m < this.f6685n.t();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        C0738f c0738f = this.f6685n;
        if (this.f6684m < c0738f.t()) {
            int i4 = this.f6684m;
            this.f6684m = i4 + 1;
            return c0738f.u(i4);
        }
        throw new NoSuchElementException("Out of bounds index: " + this.f6684m);
    }
}
