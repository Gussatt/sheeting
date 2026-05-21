package k3;

import h3.InterfaceC1027q0;
import l3.k;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class j {
    public static final d a(d dVar, int i4, j3.a aVar) {
        if (i4 < 0 && i4 != -2 && i4 != -1) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i4).toString());
        }
        if (i4 == -1 && aVar != j3.a.SUSPEND) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i4 == -1) {
            aVar = j3.a.DROP_OLDEST;
            i4 = 0;
        }
        int i5 = i4;
        j3.a aVar2 = aVar;
        return dVar instanceof l3.k ? k.a.a((l3.k) dVar, null, i5, aVar2, 1, null) : new l3.h(dVar, null, i5, aVar2, 2, null);
    }

    public static /* synthetic */ d b(d dVar, int i4, j3.a aVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = -2;
        }
        if ((i5 & 2) != 0) {
            aVar = j3.a.SUSPEND;
        }
        return f.a(dVar, i4, aVar);
    }

    public static final void c(N2.i iVar) {
        if (iVar.d(InterfaceC1027q0.f7558k) == null) {
            return;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + iVar).toString());
    }

    public static final d d(d dVar) {
        return b(dVar, -1, null, 2, null);
    }

    public static final d e(d dVar, N2.i iVar) {
        c(iVar);
        return X2.l.a(iVar, N2.j.f2823m) ? dVar : dVar instanceof l3.k ? k.a.a((l3.k) dVar, iVar, 0, null, 6, null) : new l3.h(dVar, iVar, 0, null, 12, null);
    }
}
