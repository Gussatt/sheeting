package j3;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static final d a(int i4, a aVar, W2.l lVar) {
        if (i4 == -2) {
            return aVar == a.SUSPEND ? new b(d.f8616l.a(), lVar) : new o(1, aVar, lVar);
        }
        if (i4 != -1) {
            return i4 != 0 ? i4 != Integer.MAX_VALUE ? aVar == a.SUSPEND ? new b(i4, lVar) : new o(i4, aVar, lVar) : new b(Integer.MAX_VALUE, lVar) : aVar == a.SUSPEND ? new b(0, lVar) : new o(1, aVar, lVar);
        }
        if (aVar == a.SUSPEND) {
            return new o(1, a.DROP_OLDEST, lVar);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }

    public static /* synthetic */ d b(int i4, a aVar, W2.l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = 0;
        }
        if ((i5 & 2) != 0) {
            aVar = a.SUSPEND;
        }
        if ((i5 & 4) != 0) {
            lVar = null;
        }
        return a(i4, aVar, lVar);
    }
}
