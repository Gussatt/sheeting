package F2;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f1619c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K f1621b;

    public static final class a {
        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public final M a(List list) {
            X2.l.e(list, "pigeonVar_list");
            String str = (String) list.get(0);
            Object obj = list.get(1);
            X2.l.c(obj, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.StringListLookupResultType");
            return new M(str, (K) obj);
        }

        public a() {
        }
    }

    public M(String str, K k4) {
        X2.l.e(k4, "type");
        this.f1620a = str;
        this.f1621b = k4;
    }

    public final List a() {
        return L2.m.i(this.f1620a, this.f1621b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m4 = (M) obj;
        return X2.l.a(this.f1620a, m4.f1620a) && this.f1621b == m4.f1621b;
    }

    public int hashCode() {
        String str = this.f1620a;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.f1621b.hashCode();
    }

    public String toString() {
        return "StringListResult(jsonEncodedValue=" + this.f1620a + ", type=" + this.f1621b + ')';
    }
}
