package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0720d implements Iterator {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Iterator f6672m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Iterator f6673n;

    public C0720d(C0738f c0738f, Iterator it, Iterator it2) {
        this.f6672m = it;
        this.f6673n = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f6672m.hasNext()) {
            return true;
        }
        return this.f6673n.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Iterator it = this.f6672m;
        if (it.hasNext()) {
            return new C0870v(((Integer) it.next()).toString());
        }
        Iterator it2 = this.f6673n;
        if (it2.hasNext()) {
            return new C0870v((String) it2.next());
        }
        throw new NoSuchElementException();
    }
}
