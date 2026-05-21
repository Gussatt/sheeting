package L2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends l {
    public static ArrayList d(Object... objArr) {
        X2.l.e(objArr, "elements");
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C0482e(objArr, true));
    }

    public static final Collection e(Object[] objArr) {
        X2.l.e(objArr, "<this>");
        return new C0482e(objArr, false);
    }

    public static List f() {
        return w.f2761m;
    }

    public static c3.c g(Collection collection) {
        X2.l.e(collection, "<this>");
        return new c3.c(0, collection.size() - 1);
    }

    public static int h(List list) {
        X2.l.e(list, "<this>");
        return list.size() - 1;
    }

    public static List i(Object... objArr) {
        X2.l.e(objArr, "elements");
        return objArr.length > 0 ? i.c(objArr) : f();
    }

    public static List j(Object... objArr) {
        X2.l.e(objArr, "elements");
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C0482e(objArr, true));
    }

    public static final List k(List list) {
        X2.l.e(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : l.b(list.get(0)) : f();
    }

    public static void l() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
