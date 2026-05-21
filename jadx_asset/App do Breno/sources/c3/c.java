package c3;

import X2.g;

/* JADX INFO: loaded from: classes.dex */
public final class c extends c3.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f6156q = new a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final c f6157r = new c(1, 0);

    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        public a() {
        }
    }

    public c(int i4, int i5) {
        super(i4, i5, 1);
    }

    @Override // c3.a
    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (isEmpty() && ((c) obj).isEmpty()) {
            return true;
        }
        c cVar = (c) obj;
        return d() == cVar.d() && f() == cVar.f();
    }

    @Override // c3.a
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (d() * 31) + f();
    }

    @Override // c3.a
    public boolean isEmpty() {
        return d() > f();
    }

    @Override // c3.a
    public String toString() {
        return d() + ".." + f();
    }
}
