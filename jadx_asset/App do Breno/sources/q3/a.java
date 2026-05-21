package q3;

/* JADX INFO: loaded from: classes.dex */
public interface a {

    /* JADX INFO: renamed from: q3.a$a, reason: collision with other inner class name */
    public static final class C0162a {
        public static /* synthetic */ boolean a(a aVar, Object obj, int i4, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
            }
            if ((i4 & 1) != 0) {
                obj = null;
            }
            return aVar.b(obj);
        }

        public static /* synthetic */ void b(a aVar, Object obj, int i4, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
            }
            if ((i4 & 1) != 0) {
                obj = null;
            }
            aVar.a(obj);
        }
    }

    void a(Object obj);

    boolean b(Object obj);

    Object c(Object obj, N2.e eVar);

    boolean d();
}
