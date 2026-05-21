package m3;

import h3.K0;

/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N2.i f10527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f10528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final K0[] f10529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10530d;

    public N(N2.i iVar, int i4) {
        this.f10527a = iVar;
        this.f10528b = new Object[i4];
        this.f10529c = new K0[i4];
    }

    public final void a(K0 k02, Object obj) {
        Object[] objArr = this.f10528b;
        int i4 = this.f10530d;
        objArr[i4] = obj;
        K0[] k0Arr = this.f10529c;
        this.f10530d = i4 + 1;
        X2.l.c(k02, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        k0Arr[i4] = k02;
    }

    public final void b(N2.i iVar) {
        int length = this.f10529c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i4 = length - 1;
            K0 k02 = this.f10529c[length];
            X2.l.b(k02);
            k02.j(iVar, this.f10528b[length]);
            if (i4 < 0) {
                return;
            } else {
                length = i4;
            }
        }
    }
}
