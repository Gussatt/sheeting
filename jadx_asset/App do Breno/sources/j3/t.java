package j3;

/* JADX INFO: loaded from: classes.dex */
public interface t {

    public static final class a {
        public static /* synthetic */ boolean a(t tVar, Throwable th, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
            }
            if ((i4 & 1) != 0) {
                th = null;
            }
            return tVar.n(th);
        }
    }

    Object B(Object obj);

    boolean E();

    Object m(Object obj, N2.e eVar);

    boolean n(Throwable th);

    void s(W2.l lVar);
}
