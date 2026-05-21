package p;

/* JADX INFO: renamed from: p.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1478d implements Cloneable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Object f10870q = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f10871m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long[] f10872n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object[] f10873o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f10874p;

    public C1478d() {
        this(10);
    }

    public void a() {
        int i4 = this.f10874p;
        Object[] objArr = this.f10873o;
        for (int i5 = 0; i5 < i4; i5++) {
            objArr[i5] = null;
        }
        this.f10874p = 0;
        this.f10871m = false;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C1478d clone() {
        try {
            C1478d c1478d = (C1478d) super.clone();
            c1478d.f10872n = (long[]) this.f10872n.clone();
            c1478d.f10873o = (Object[]) this.f10873o.clone();
            return c1478d;
        } catch (CloneNotSupportedException e4) {
            throw new AssertionError(e4);
        }
    }

    public void c(long j4) {
        n(j4);
    }

    public final void g() {
        int i4 = this.f10874p;
        long[] jArr = this.f10872n;
        Object[] objArr = this.f10873o;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            Object obj = objArr[i6];
            if (obj != f10870q) {
                if (i6 != i5) {
                    jArr[i5] = jArr[i6];
                    objArr[i5] = obj;
                    objArr[i6] = null;
                }
                i5++;
            }
        }
        this.f10871m = false;
        this.f10874p = i5;
    }

    public Object h(long j4) {
        return i(j4, null);
    }

    public Object i(long j4, Object obj) {
        Object obj2;
        int iB = AbstractC1477c.b(this.f10872n, this.f10874p, j4);
        return (iB < 0 || (obj2 = this.f10873o[iB]) == f10870q) ? obj : obj2;
    }

    public int k(long j4) {
        if (this.f10871m) {
            g();
        }
        return AbstractC1477c.b(this.f10872n, this.f10874p, j4);
    }

    public long l(int i4) {
        if (this.f10871m) {
            g();
        }
        return this.f10872n[i4];
    }

    public void m(long j4, Object obj) {
        int iB = AbstractC1477c.b(this.f10872n, this.f10874p, j4);
        if (iB >= 0) {
            this.f10873o[iB] = obj;
            return;
        }
        int i4 = ~iB;
        int i5 = this.f10874p;
        if (i4 < i5) {
            Object[] objArr = this.f10873o;
            if (objArr[i4] == f10870q) {
                this.f10872n[i4] = j4;
                objArr[i4] = obj;
                return;
            }
        }
        if (this.f10871m && i5 >= this.f10872n.length) {
            g();
            i4 = ~AbstractC1477c.b(this.f10872n, this.f10874p, j4);
        }
        int i6 = this.f10874p;
        if (i6 >= this.f10872n.length) {
            int iF = AbstractC1477c.f(i6 + 1);
            long[] jArr = new long[iF];
            Object[] objArr2 = new Object[iF];
            long[] jArr2 = this.f10872n;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f10873o;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f10872n = jArr;
            this.f10873o = objArr2;
        }
        int i7 = this.f10874p;
        if (i7 - i4 != 0) {
            long[] jArr3 = this.f10872n;
            int i8 = i4 + 1;
            System.arraycopy(jArr3, i4, jArr3, i8, i7 - i4);
            Object[] objArr4 = this.f10873o;
            System.arraycopy(objArr4, i4, objArr4, i8, this.f10874p - i4);
        }
        this.f10872n[i4] = j4;
        this.f10873o[i4] = obj;
        this.f10874p++;
    }

    public void n(long j4) {
        int iB = AbstractC1477c.b(this.f10872n, this.f10874p, j4);
        if (iB >= 0) {
            Object[] objArr = this.f10873o;
            Object obj = objArr[iB];
            Object obj2 = f10870q;
            if (obj != obj2) {
                objArr[iB] = obj2;
                this.f10871m = true;
            }
        }
    }

    public int o() {
        if (this.f10871m) {
            g();
        }
        return this.f10874p;
    }

    public Object p(int i4) {
        if (this.f10871m) {
            g();
        }
        return this.f10873o[i4];
    }

    public String toString() {
        if (o() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f10874p * 28);
        sb.append('{');
        for (int i4 = 0; i4 < this.f10874p; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            sb.append(l(i4));
            sb.append('=');
            Object objP = p(i4);
            if (objP != this) {
                sb.append(objP);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C1478d(int i4) {
        this.f10871m = false;
        if (i4 == 0) {
            this.f10872n = AbstractC1477c.f10868b;
            this.f10873o = AbstractC1477c.f10869c;
        } else {
            int iF = AbstractC1477c.f(i4);
            this.f10872n = new long[iF];
            this.f10873o = new Object[iF];
        }
    }
}
