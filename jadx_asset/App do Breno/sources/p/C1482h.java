package p;

/* JADX INFO: renamed from: p.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1482h implements Cloneable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Object f10905q = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f10906m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int[] f10907n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object[] f10908o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f10909p;

    public C1482h() {
        this(10);
    }

    public void a(int i4, Object obj) {
        int i5 = this.f10909p;
        if (i5 != 0 && i4 <= this.f10907n[i5 - 1]) {
            l(i4, obj);
            return;
        }
        if (this.f10906m && i5 >= this.f10907n.length) {
            g();
        }
        int i6 = this.f10909p;
        if (i6 >= this.f10907n.length) {
            int iE = AbstractC1477c.e(i6 + 1);
            int[] iArr = new int[iE];
            Object[] objArr = new Object[iE];
            int[] iArr2 = this.f10907n;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f10908o;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f10907n = iArr;
            this.f10908o = objArr;
        }
        this.f10907n[i6] = i4;
        this.f10908o[i6] = obj;
        this.f10909p = i6 + 1;
    }

    public void b() {
        int i4 = this.f10909p;
        Object[] objArr = this.f10908o;
        for (int i5 = 0; i5 < i4; i5++) {
            objArr[i5] = null;
        }
        this.f10909p = 0;
        this.f10906m = false;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C1482h clone() {
        try {
            C1482h c1482h = (C1482h) super.clone();
            c1482h.f10907n = (int[]) this.f10907n.clone();
            c1482h.f10908o = (Object[]) this.f10908o.clone();
            return c1482h;
        } catch (CloneNotSupportedException e4) {
            throw new AssertionError(e4);
        }
    }

    public final void g() {
        int i4 = this.f10909p;
        int[] iArr = this.f10907n;
        Object[] objArr = this.f10908o;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            Object obj = objArr[i6];
            if (obj != f10905q) {
                if (i6 != i5) {
                    iArr[i5] = iArr[i6];
                    objArr[i5] = obj;
                    objArr[i6] = null;
                }
                i5++;
            }
        }
        this.f10906m = false;
        this.f10909p = i5;
    }

    public Object h(int i4) {
        return i(i4, null);
    }

    public Object i(int i4, Object obj) {
        Object obj2;
        int iA = AbstractC1477c.a(this.f10907n, this.f10909p, i4);
        return (iA < 0 || (obj2 = this.f10908o[iA]) == f10905q) ? obj : obj2;
    }

    public int k(int i4) {
        if (this.f10906m) {
            g();
        }
        return this.f10907n[i4];
    }

    public void l(int i4, Object obj) {
        int iA = AbstractC1477c.a(this.f10907n, this.f10909p, i4);
        if (iA >= 0) {
            this.f10908o[iA] = obj;
            return;
        }
        int i5 = ~iA;
        int i6 = this.f10909p;
        if (i5 < i6) {
            Object[] objArr = this.f10908o;
            if (objArr[i5] == f10905q) {
                this.f10907n[i5] = i4;
                objArr[i5] = obj;
                return;
            }
        }
        if (this.f10906m && i6 >= this.f10907n.length) {
            g();
            i5 = ~AbstractC1477c.a(this.f10907n, this.f10909p, i4);
        }
        int i7 = this.f10909p;
        if (i7 >= this.f10907n.length) {
            int iE = AbstractC1477c.e(i7 + 1);
            int[] iArr = new int[iE];
            Object[] objArr2 = new Object[iE];
            int[] iArr2 = this.f10907n;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f10908o;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f10907n = iArr;
            this.f10908o = objArr2;
        }
        int i8 = this.f10909p;
        if (i8 - i5 != 0) {
            int[] iArr3 = this.f10907n;
            int i9 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i9, i8 - i5);
            Object[] objArr4 = this.f10908o;
            System.arraycopy(objArr4, i5, objArr4, i9, this.f10909p - i5);
        }
        this.f10907n[i5] = i4;
        this.f10908o[i5] = obj;
        this.f10909p++;
    }

    public int m() {
        if (this.f10906m) {
            g();
        }
        return this.f10909p;
    }

    public Object n(int i4) {
        if (this.f10906m) {
            g();
        }
        return this.f10908o[i4];
    }

    public String toString() {
        if (m() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f10909p * 28);
        sb.append('{');
        for (int i4 = 0; i4 < this.f10909p; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            sb.append(k(i4));
            sb.append('=');
            Object objN = n(i4);
            if (objN != this) {
                sb.append(objN);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C1482h(int i4) {
        this.f10906m = false;
        if (i4 == 0) {
            this.f10907n = AbstractC1477c.f10867a;
            this.f10908o = AbstractC1477c.f10869c;
        } else {
            int iE = AbstractC1477c.e(i4);
            this.f10907n = new int[iE];
            this.f10908o = new Object[iE];
        }
    }
}
