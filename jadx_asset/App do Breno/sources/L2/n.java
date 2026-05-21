package L2;

import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public abstract class n extends m {
    public static int m(Iterable iterable, int i4) {
        X2.l.e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i4;
    }
}
