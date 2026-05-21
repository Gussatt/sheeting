package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.J;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0579a implements J {
    protected int memoizedHashCode = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0089a implements J.a {
        public static void h(Iterable iterable, List list) {
            AbstractC0598u.a(iterable);
            i(iterable, list);
        }

        public static void i(Iterable iterable, List list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (Object obj : iterable) {
                if (obj == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(obj);
            }
        }

        public static e0 k(J j4) {
            return new e0(j4);
        }
    }

    public static void e(Iterable iterable, List list) {
        AbstractC0089a.h(iterable, list);
    }

    public abstract int f(Y y3);

    public e0 h() {
        return new e0(this);
    }

    public void i(OutputStream outputStream) {
        AbstractC0587i abstractC0587iY = AbstractC0587i.Y(outputStream, AbstractC0587i.C(a()));
        c(abstractC0587iY);
        abstractC0587iY.V();
    }
}
