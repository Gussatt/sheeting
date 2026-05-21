package L2;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class E extends D {
    public static Set b() {
        return y.f2763m;
    }

    public static final Set c(Set set) {
        X2.l.e(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : D.a(set.iterator().next()) : b();
    }

    public static Set d(Object... objArr) {
        X2.l.e(objArr, "elements");
        return j.A(objArr);
    }
}
