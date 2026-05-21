package L2;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class D {
    public static final Set a(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        X2.l.d(setSingleton, "singleton(...)");
        return setSingleton;
    }
}
