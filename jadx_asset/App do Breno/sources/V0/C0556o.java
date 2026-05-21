package V0;

import T0.a;
import android.os.Bundle;

/* JADX INFO: renamed from: V0.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0556o implements a.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0556o f3712b = a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3713a;

    /* JADX INFO: renamed from: V0.o$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f3714a;

        public /* synthetic */ a(AbstractC0558q abstractC0558q) {
        }

        public C0556o a() {
            return new C0556o(this.f3714a, null);
        }

        public a b(String str) {
            this.f3714a = str;
            return this;
        }
    }

    public /* synthetic */ C0556o(String str, r rVar) {
        this.f3713a = str;
    }

    public static a a() {
        return new a(null);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        String str = this.f3713a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0556o) {
            return AbstractC0548g.a(this.f3713a, ((C0556o) obj).f3713a);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC0548g.b(this.f3713a);
    }
}
