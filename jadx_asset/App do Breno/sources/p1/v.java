package p1;

/* JADX INFO: loaded from: classes.dex */
public final class v extends k {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Object[] f10969t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final v f10970u;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final transient Object[] f10971o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final transient int f10972p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final transient Object[] f10973q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final transient int f10974r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final transient int f10975s;

    static {
        Object[] objArr = new Object[0];
        f10969t = objArr;
        f10970u = new v(objArr, 0, objArr, 0, 0);
    }

    public v(Object[] objArr, int i4, Object[] objArr2, int i5, int i6) {
        this.f10971o = objArr;
        this.f10972p = i4;
        this.f10973q = objArr2;
        this.f10974r = i5;
        this.f10975s = i6;
    }

    @Override // p1.h, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        Object[] objArr = this.f10973q;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iB = g.b(obj);
        while (true) {
            int i4 = iB & this.f10974r;
            Object obj2 = objArr[i4];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iB = i4 + 1;
        }
    }

    @Override // p1.h
    public int d(Object[] objArr, int i4) {
        System.arraycopy(this.f10971o, 0, objArr, i4, this.f10975s);
        return i4 + this.f10975s;
    }

    @Override // p1.h
    public Object[] f() {
        return this.f10971o;
    }

    @Override // p1.h
    public int g() {
        return this.f10975s;
    }

    @Override // p1.h
    public int h() {
        return 0;
    }

    @Override // p1.k, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f10972p;
    }

    @Override // p1.k
    public i o() {
        return i.k(this.f10971o, this.f10975s);
    }

    @Override // p1.k
    public boolean p() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public z iterator() {
        return i().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f10975s;
    }
}
