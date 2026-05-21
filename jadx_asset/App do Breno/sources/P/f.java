package P;

import L2.C;
import X2.l;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f2886a;

        public a(String str) {
            l.e(str, "name");
            this.f2886a = str;
        }

        public final String a() {
            return this.f2886a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return l.a(this.f2886a, ((a) obj).f2886a);
            }
            return false;
        }

        public int hashCode() {
            return this.f2886a.hashCode();
        }

        public String toString() {
            return this.f2886a;
        }
    }

    public static final class b {
    }

    public abstract Map a();

    public abstract Object b(a aVar);

    public final c c() {
        return new c(C.n(a()), false);
    }

    public final f d() {
        return new c(C.n(a()), true);
    }
}
