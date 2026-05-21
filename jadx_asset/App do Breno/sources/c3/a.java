package c3;

import L2.z;
import X2.g;

/* JADX INFO: loaded from: classes.dex */
public class a implements Iterable, Y2.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C0113a f6148p = new C0113a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f6149m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f6150n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f6151o;

    /* JADX INFO: renamed from: c3.a$a, reason: collision with other inner class name */
    public static final class C0113a {
        public /* synthetic */ C0113a(g gVar) {
            this();
        }

        public final a a(int i4, int i5, int i6) {
            return new a(i4, i5, i6);
        }

        public C0113a() {
        }
    }

    public a(int i4, int i5, int i6) {
        if (i6 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i6 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f6149m = i4;
        this.f6150n = R2.c.b(i4, i5, i6);
        this.f6151o = i6;
    }

    public final int d() {
        return this.f6149m;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (isEmpty() && ((a) obj).isEmpty()) {
            return true;
        }
        a aVar = (a) obj;
        return this.f6149m == aVar.f6149m && this.f6150n == aVar.f6150n && this.f6151o == aVar.f6151o;
    }

    public final int f() {
        return this.f6150n;
    }

    public final int g() {
        return this.f6151o;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public z iterator() {
        return new b(this.f6149m, this.f6150n, this.f6151o);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f6149m * 31) + this.f6150n) * 31) + this.f6151o;
    }

    public boolean isEmpty() {
        return this.f6151o > 0 ? this.f6149m > this.f6150n : this.f6149m < this.f6150n;
    }

    public String toString() {
        StringBuilder sb;
        int i4;
        if (this.f6151o > 0) {
            sb = new StringBuilder();
            sb.append(this.f6149m);
            sb.append("..");
            sb.append(this.f6150n);
            sb.append(" step ");
            i4 = this.f6151o;
        } else {
            sb = new StringBuilder();
            sb.append(this.f6149m);
            sb.append(" downTo ");
            sb.append(this.f6150n);
            sb.append(" step ");
            i4 = -this.f6151o;
        }
        sb.append(i4);
        return sb.toString();
    }
}
