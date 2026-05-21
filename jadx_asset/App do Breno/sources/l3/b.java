package l3;

import K2.j;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public d[] f10264m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f10265n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f10266o;

    public final d e() {
        d dVarF;
        synchronized (this) {
            try {
                d[] dVarArrG = this.f10264m;
                if (dVarArrG == null) {
                    dVarArrG = g(2);
                    this.f10264m = dVarArrG;
                } else if (this.f10265n >= dVarArrG.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(dVarArrG, dVarArrG.length * 2);
                    X2.l.d(objArrCopyOf, "copyOf(this, newSize)");
                    this.f10264m = (d[]) objArrCopyOf;
                    dVarArrG = (d[]) objArrCopyOf;
                }
                int i4 = this.f10266o;
                do {
                    dVarF = dVarArrG[i4];
                    if (dVarF == null) {
                        dVarF = f();
                        dVarArrG[i4] = dVarF;
                    }
                    i4++;
                    if (i4 >= dVarArrG.length) {
                        i4 = 0;
                    }
                    X2.l.c(dVarF, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!dVarF.a(this));
                this.f10266o = i4;
                this.f10265n++;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVarF;
    }

    public abstract d f();

    public abstract d[] g(int i4);

    public final void h(d dVar) {
        int i4;
        N2.e[] eVarArrB;
        synchronized (this) {
            try {
                int i5 = this.f10265n - 1;
                this.f10265n = i5;
                if (i5 == 0) {
                    this.f10266o = 0;
                }
                X2.l.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                eVarArrB = dVar.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (N2.e eVar : eVarArrB) {
            if (eVar != null) {
                j.a aVar = K2.j.f2509n;
                eVar.p(K2.j.b(K2.p.f2516a));
            }
        }
    }

    public final d[] i() {
        return this.f10264m;
    }
}
