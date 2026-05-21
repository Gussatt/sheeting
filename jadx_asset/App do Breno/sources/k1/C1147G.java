package k1;

import java.util.Iterator;

/* JADX INFO: renamed from: k1.G, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1147G implements Iterator {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Iterator f9040m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1148H f9041n;

    public C1147G(C1148H c1148h) {
        this.f9041n = c1148h;
        this.f9040m = c1148h.f9054m.keySet().iterator();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final String next() {
        return (String) this.f9040m.next();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9040m.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
