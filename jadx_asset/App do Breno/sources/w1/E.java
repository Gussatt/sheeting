package w1;

/* JADX INFO: loaded from: classes.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f11784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f11785b;

    public @interface a {
    }

    public E(Class cls, Class cls2) {
        this.f11784a = cls;
        this.f11785b = cls2;
    }

    public static E a(Class cls, Class cls2) {
        return new E(cls, cls2);
    }

    public static E b(Class cls) {
        return new E(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || E.class != obj.getClass()) {
            return false;
        }
        E e4 = (E) obj;
        if (this.f11785b.equals(e4.f11785b)) {
            return this.f11784a.equals(e4.f11784a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f11785b.hashCode() * 31) + this.f11784a.hashCode();
    }

    public String toString() {
        if (this.f11784a == a.class) {
            return this.f11785b.getName();
        }
        return "@" + this.f11784a.getName() + " " + this.f11785b.getName();
    }
}
