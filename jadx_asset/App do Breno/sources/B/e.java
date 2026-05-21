package B;

import X2.l;

/* JADX INFO: loaded from: classes.dex */
public class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f42a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f43b;

    public e(int i4) {
        if (i4 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f42a = new Object[i4];
    }

    @Override // B.d
    public boolean a(Object obj) {
        l.e(obj, "instance");
        if (c(obj)) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i4 = this.f43b;
        Object[] objArr = this.f42a;
        if (i4 >= objArr.length) {
            return false;
        }
        objArr[i4] = obj;
        this.f43b = i4 + 1;
        return true;
    }

    @Override // B.d
    public Object b() {
        int i4 = this.f43b;
        if (i4 <= 0) {
            return null;
        }
        int i5 = i4 - 1;
        Object obj = this.f42a[i5];
        l.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        this.f42a[i5] = null;
        this.f43b--;
        return obj;
    }

    public final boolean c(Object obj) {
        int i4 = this.f43b;
        for (int i5 = 0; i5 < i4; i5++) {
            if (this.f42a[i5] == obj) {
                return true;
            }
        }
        return false;
    }
}
