package F1;

import F1.F;
import java.util.List;

/* JADX INFO: renamed from: F1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0273f extends F.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f1277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1278b;

    /* JADX INFO: renamed from: F1.f$b */
    public static final class b extends F.d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List f1279a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f1280b;

        @Override // F1.F.d.a
        public F.d a() {
            List list = this.f1279a;
            if (list != null) {
                return new C0273f(list, this.f1280b);
            }
            throw new IllegalStateException("Missing required properties: files");
        }

        @Override // F1.F.d.a
        public F.d.a b(List list) {
            if (list == null) {
                throw new NullPointerException("Null files");
            }
            this.f1279a = list;
            return this;
        }

        @Override // F1.F.d.a
        public F.d.a c(String str) {
            this.f1280b = str;
            return this;
        }
    }

    @Override // F1.F.d
    public List b() {
        return this.f1277a;
    }

    @Override // F1.F.d
    public String c() {
        return this.f1278b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.d) {
            F.d dVar = (F.d) obj;
            if (this.f1277a.equals(dVar.b()) && ((str = this.f1278b) != null ? str.equals(dVar.c()) : dVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f1277a.hashCode() ^ 1000003) * 1000003;
        String str = this.f1278b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FilesPayload{files=" + this.f1277a + ", orgId=" + this.f1278b + "}";
    }

    public C0273f(List list, String str) {
        this.f1277a = list;
        this.f1278b = str;
    }
}
