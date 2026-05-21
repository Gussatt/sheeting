package g1;

/* JADX INFO: renamed from: g1.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0967g {
    public static Object a(Class cls, String str, AbstractC0966f... abstractC0966fArr) {
        return b(cls, "isIsolated", null, false, abstractC0966fArr);
    }

    public static Object b(Class cls, String str, Object obj, boolean z3, AbstractC0966f... abstractC0966fArr) {
        int length = abstractC0966fArr.length;
        Class<?>[] clsArr = new Class[length];
        Object[] objArr = new Object[length];
        Object obj2 = null;
        if (abstractC0966fArr.length <= 0) {
            return cls.getDeclaredMethod(str, clsArr).invoke(null, objArr);
        }
        AbstractC0966f abstractC0966f = abstractC0966fArr[0];
        obj2.getClass();
        throw null;
    }
}
