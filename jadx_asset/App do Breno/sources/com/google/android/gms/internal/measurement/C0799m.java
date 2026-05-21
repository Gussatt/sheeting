package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0799m implements Iterator {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Iterator f6882m;

    public C0799m(Iterator it) {
        this.f6882m = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6882m.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new C0870v((String) this.f6882m.next());
    }
}
