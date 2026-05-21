package N2;

import N2.i;
import W2.p;
import X2.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements i.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i.c f2816m;

    public a(i.c cVar) {
        l.e(cVar, "key");
        this.f2816m = cVar;
    }

    @Override // N2.i
    public i D(i iVar) {
        return i.b.a.d(this, iVar);
    }

    @Override // N2.i
    public i F(i.c cVar) {
        return i.b.a.c(this, cVar);
    }

    @Override // N2.i
    public Object O(Object obj, p pVar) {
        return i.b.a.a(this, obj, pVar);
    }

    @Override // N2.i.b, N2.i
    public i.b d(i.c cVar) {
        return i.b.a.b(this, cVar);
    }

    @Override // N2.i.b
    public i.c getKey() {
        return this.f2816m;
    }
}
