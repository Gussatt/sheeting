package F1;

import F1.F;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class y extends F.e.d.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f1461a;

    public static final class b extends F.e.d.f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List f1462a;

        @Override // F1.F.e.d.f.a
        public F.e.d.f a() {
            List list = this.f1462a;
            if (list != null) {
                return new y(list);
            }
            throw new IllegalStateException("Missing required properties: rolloutAssignments");
        }

        @Override // F1.F.e.d.f.a
        public F.e.d.f.a b(List list) {
            if (list == null) {
                throw new NullPointerException("Null rolloutAssignments");
            }
            this.f1462a = list;
            return this;
        }
    }

    @Override // F1.F.e.d.f
    public List b() {
        return this.f1461a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.f) {
            return this.f1461a.equals(((F.e.d.f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f1461a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f1461a + "}";
    }

    public y(List list) {
        this.f1461a = list;
    }
}
