package b1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static List a(Object obj) {
        return Collections.singletonList(obj);
    }

    public static List b(Object... objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? Collections.unmodifiableList(Arrays.asList(objArr)) : Collections.singletonList(objArr[0]) : Collections.EMPTY_LIST;
    }
}
