package X2;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0567a implements Iterator, Y2.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object[] f3965m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f3966n;

    public C0567a(Object[] objArr) {
        l.e(objArr, "array");
        this.f3965m = objArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f3966n < this.f3965m.length;
    }

    @Override // java.util.Iterator
    public Object next() {
        try {
            Object[] objArr = this.f3965m;
            int i4 = this.f3966n;
            this.f3966n = i4 + 1;
            return objArr[i4];
        } catch (ArrayIndexOutOfBoundsException e4) {
            this.f3966n--;
            throw new NoSuchElementException(e4.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
