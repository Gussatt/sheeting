package L2;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: renamed from: L2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0481d extends AbstractList implements List, Y2.a {
    public abstract int d();

    public abstract Object f(int i4);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i4) {
        return f(i4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return d();
    }
}
