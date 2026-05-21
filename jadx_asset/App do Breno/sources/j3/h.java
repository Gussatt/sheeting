package j3;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f8620a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f8621b = new c();

    public static final class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f8622a;

        public a(Throwable th) {
            this.f8622a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && X2.l.a(this.f8622a, ((a) obj).f8622a);
        }

        public int hashCode() {
            Throwable th = this.f8622a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // j3.h.c
        public String toString() {
            return "Closed(" + this.f8622a + ')';
        }
    }

    public static final class b {
        public /* synthetic */ b(X2.g gVar) {
            this();
        }

        public final Object a(Throwable th) {
            return h.b(new a(th));
        }

        public final Object b() {
            return h.b(h.f8621b);
        }

        public final Object c(Object obj) {
            return h.b(obj);
        }

        public b() {
        }
    }

    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    public static final Throwable c(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null) {
            return aVar.f8622a;
        }
        return null;
    }

    public static final Object d(Object obj) {
        if (obj instanceof c) {
            return null;
        }
        return obj;
    }

    public static final boolean e(Object obj) {
        return obj instanceof a;
    }

    public static final boolean f(Object obj) {
        return !(obj instanceof c);
    }

    public static Object b(Object obj) {
        return obj;
    }
}
