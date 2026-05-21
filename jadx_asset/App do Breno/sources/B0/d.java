package B0;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f118a;

    public d(List list) {
        if (list == null) {
            throw new NullPointerException("Null logRequests");
        }
        this.f118a = list;
    }

    @Override // B0.n
    public List c() {
        return this.f118a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            return this.f118a.equals(((n) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.f118a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f118a + "}";
    }
}
