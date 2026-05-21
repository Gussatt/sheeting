package L2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class q extends p {
    public static final void n(List list, Comparator comparator) {
        X2.l.e(list, "<this>");
        X2.l.e(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
