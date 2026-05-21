package K2;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f2509n = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f2510m;

    public static final class a {
        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public a() {
        }
    }

    public static final class b implements Serializable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Throwable f2511m;

        public b(Throwable th) {
            X2.l.e(th, "exception");
            this.f2511m = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && X2.l.a(this.f2511m, ((b) obj).f2511m);
        }

        public int hashCode() {
            return this.f2511m.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f2511m + ')';
        }
    }

    public /* synthetic */ j(Object obj) {
        this.f2510m = obj;
    }

    public static final /* synthetic */ j a(Object obj) {
        return new j(obj);
    }

    public static boolean c(Object obj, Object obj2) {
        return (obj2 instanceof j) && X2.l.a(obj, ((j) obj2).i());
    }

    public static final Throwable d(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f2511m;
        }
        return null;
    }

    public static int e(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean f(Object obj) {
        return obj instanceof b;
    }

    public static final boolean g(Object obj) {
        return !(obj instanceof b);
    }

    public static String h(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f2510m, obj);
    }

    public int hashCode() {
        return e(this.f2510m);
    }

    public final /* synthetic */ Object i() {
        return this.f2510m;
    }

    public String toString() {
        return h(this.f2510m);
    }

    public static Object b(Object obj) {
        return obj;
    }
}
