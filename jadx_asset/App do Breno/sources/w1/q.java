package w1;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E f11841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11843c;

    public q(Class cls, int i4, int i5) {
        this(E.b(cls), i4, i5);
    }

    public static q a(Class cls) {
        return new q(cls, 0, 2);
    }

    public static String b(int i4) {
        if (i4 == 0) {
            return "direct";
        }
        if (i4 == 1) {
            return "provider";
        }
        if (i4 == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i4);
    }

    public static q h(Class cls) {
        return new q(cls, 0, 1);
    }

    public static q i(Class cls) {
        return new q(cls, 1, 0);
    }

    public static q j(E e4) {
        return new q(e4, 1, 0);
    }

    public static q k(Class cls) {
        return new q(cls, 1, 1);
    }

    public static q l(E e4) {
        return new q(e4, 1, 1);
    }

    public static q m(Class cls) {
        return new q(cls, 2, 0);
    }

    public E c() {
        return this.f11841a;
    }

    public boolean d() {
        return this.f11843c == 2;
    }

    public boolean e() {
        return this.f11843c == 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f11841a.equals(qVar.f11841a) && this.f11842b == qVar.f11842b && this.f11843c == qVar.f11843c) {
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        return this.f11842b == 1;
    }

    public boolean g() {
        return this.f11842b == 2;
    }

    public int hashCode() {
        return ((((this.f11841a.hashCode() ^ 1000003) * 1000003) ^ this.f11842b) * 1000003) ^ this.f11843c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f11841a);
        sb.append(", type=");
        int i4 = this.f11842b;
        sb.append(i4 == 1 ? "required" : i4 == 0 ? "optional" : "set");
        sb.append(", injection=");
        sb.append(b(this.f11843c));
        sb.append("}");
        return sb.toString();
    }

    public q(E e4, int i4, int i5) {
        this.f11841a = (E) AbstractC1601D.c(e4, "Null dependency anInterface.");
        this.f11842b = i4;
        this.f11843c = i5;
    }
}
