package c3;

import L2.z;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class b extends z {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f6152m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f6153n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f6154o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f6155p;

    public b(int i4, int i5, int i6) {
        this.f6152m = i6;
        this.f6153n = i5;
        boolean z3 = false;
        if (i6 <= 0 ? i4 >= i5 : i4 <= i5) {
            z3 = true;
        }
        this.f6154o = z3;
        this.f6155p = z3 ? i4 : i5;
    }

    @Override // L2.z
    public int c() {
        int i4 = this.f6155p;
        if (i4 != this.f6153n) {
            this.f6155p = this.f6152m + i4;
            return i4;
        }
        if (!this.f6154o) {
            throw new NoSuchElementException();
        }
        this.f6154o = false;
        return i4;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f6154o;
    }
}
