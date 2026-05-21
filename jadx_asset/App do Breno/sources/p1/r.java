package p1;

import java.util.Comparator;
import o1.InterfaceC1466c;

/* JADX INFO: loaded from: classes.dex */
public abstract class r implements Comparator {
    public static r a(Comparator comparator) {
        return comparator instanceof r ? (r) comparator : new f(comparator);
    }

    public r b(InterfaceC1466c interfaceC1466c) {
        return new c(interfaceC1466c, this);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);
}
