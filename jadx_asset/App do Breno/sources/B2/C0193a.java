package B2;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: B2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0193a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0003a f290c = new C0003a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f292b;

    /* JADX INFO: renamed from: B2.a$a, reason: collision with other inner class name */
    public static final class C0003a {
        public /* synthetic */ C0003a(X2.g gVar) {
            this();
        }

        public final C0193a a(List list) {
            X2.l.e(list, "pigeonVar_list");
            Object obj = list.get(0);
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.String");
            return new C0193a((String) obj, (Map) list.get(1));
        }

        public C0003a() {
        }
    }

    public C0193a(String str, Map map) {
        X2.l.e(str, "name");
        this.f291a = str;
        this.f292b = map;
    }

    public final List a() {
        return L2.m.i(this.f291a, this.f292b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0193a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return Z.f289a.a(a(), ((C0193a) obj).a());
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return "AnalyticsEvent(name=" + this.f291a + ", parameters=" + this.f292b + ')';
    }
}
