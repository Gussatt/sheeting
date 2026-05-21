package k1;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class G6 {
    public static /* synthetic */ Map.Entry a(Object obj, Object obj2) {
        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }
}
