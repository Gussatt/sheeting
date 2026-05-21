package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0862u implements Iterator {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f6971m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0870v f6972n;

    public C0862u(C0870v c0870v) {
        this.f6972n = c0870v;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6971m < this.f6972n.f6979m.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        C0870v c0870v = this.f6972n;
        int i4 = this.f6971m;
        if (i4 >= c0870v.f6979m.length()) {
            throw new NoSuchElementException();
        }
        String str = c0870v.f6979m;
        this.f6971m = i4 + 1;
        return new C0870v(String.valueOf(str.charAt(i4)));
    }
}
