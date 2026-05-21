package p1;

import java.util.NoSuchElementException;
import o1.AbstractC1471h;

/* JADX INFO: renamed from: p1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1485a extends AbstractC1484A {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f10912m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f10913n;

    public AbstractC1485a(int i4, int i5) {
        AbstractC1471h.j(i5, i4);
        this.f10912m = i4;
        this.f10913n = i5;
    }

    public abstract Object c(int i4);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f10913n < this.f10912m;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f10913n > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i4 = this.f10913n;
        this.f10913n = i4 + 1;
        return c(i4);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f10913n;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i4 = this.f10913n - 1;
        this.f10913n = i4;
        return c(i4);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f10913n - 1;
    }
}
