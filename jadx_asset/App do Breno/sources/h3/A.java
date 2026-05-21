package h3;

/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W2.l f7491b;

    public A(Object obj, W2.l lVar) {
        this.f7490a = obj;
        this.f7491b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a4 = (A) obj;
        return X2.l.a(this.f7490a, a4.f7490a) && X2.l.a(this.f7491b, a4.f7491b);
    }

    public int hashCode() {
        Object obj = this.f7490a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f7491b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f7490a + ", onCancellation=" + this.f7491b + ')';
    }
}
