package L2;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class z implements Iterator, Y2.a {
    public abstract int c();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(c());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
