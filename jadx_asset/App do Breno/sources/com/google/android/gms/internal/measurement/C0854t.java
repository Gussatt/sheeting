package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0854t implements Iterator {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f6963m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0870v f6964n;

    public C0854t(C0870v c0870v) {
        this.f6964n = c0870v;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6963m < this.f6964n.f6979m.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        C0870v c0870v = this.f6964n;
        int i4 = this.f6963m;
        if (i4 >= c0870v.f6979m.length()) {
            throw new NoSuchElementException();
        }
        this.f6963m = i4 + 1;
        return new C0870v(String.valueOf(i4));
    }
}
