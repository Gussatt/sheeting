package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.s4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0851s4 extends AbstractC0859t4 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f6950m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f6951n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ A4 f6952o;

    public C0851s4(A4 a4) {
        this.f6952o = a4;
        this.f6951n = a4.g();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0875v4
    public final byte a() {
        int i4 = this.f6950m;
        if (i4 >= this.f6951n) {
            throw new NoSuchElementException();
        }
        this.f6950m = i4 + 1;
        return this.f6952o.f(i4);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6950m < this.f6951n;
    }
}
