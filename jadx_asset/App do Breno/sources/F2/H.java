package F2;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class H {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f1482c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1484b;

    public static final class a {
        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public final H a(List list) {
            X2.l.e(list, "pigeonVar_list");
            String str = (String) list.get(0);
            Object obj = list.get(1);
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.Boolean");
            return new H(str, ((Boolean) obj).booleanValue());
        }

        public a() {
        }
    }

    public H(String str, boolean z3) {
        this.f1483a = str;
        this.f1484b = z3;
    }

    public final String a() {
        return this.f1483a;
    }

    public final List b() {
        return L2.m.i(this.f1483a, Boolean.valueOf(this.f1484b));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h4 = (H) obj;
        return X2.l.a(this.f1483a, h4.f1483a) && this.f1484b == h4.f1484b;
    }

    public int hashCode() {
        String str = this.f1483a;
        return ((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.f1484b);
    }

    public String toString() {
        return "SharedPreferencesPigeonOptions(fileName=" + this.f1483a + ", useDataStore=" + this.f1484b + ')';
    }
}
