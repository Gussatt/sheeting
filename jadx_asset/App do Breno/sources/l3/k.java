package l3;

/* JADX INFO: loaded from: classes.dex */
public interface k extends k3.d {

    public static final class a {
        public static /* synthetic */ k3.d a(k kVar, N2.i iVar, int i4, j3.a aVar, int i5, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
            }
            if ((i5 & 1) != 0) {
                iVar = N2.j.f2823m;
            }
            if ((i5 & 2) != 0) {
                i4 = -3;
            }
            if ((i5 & 4) != 0) {
                aVar = j3.a.SUSPEND;
            }
            return kVar.d(iVar, i4, aVar);
        }
    }

    k3.d d(N2.i iVar, int i4, j3.a aVar);
}
