package H0;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static Object a(int i4, Object obj, a aVar, c cVar) {
        Object objApply;
        if (i4 < 1) {
            return aVar.apply(obj);
        }
        do {
            objApply = aVar.apply(obj);
            obj = cVar.a(obj, objApply);
            if (obj == null) {
                break;
            }
            i4--;
        } while (i4 >= 1);
        return objApply;
    }
}
