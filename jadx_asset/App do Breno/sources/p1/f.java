package p1;

import java.io.Serializable;
import java.util.Comparator;
import o1.AbstractC1471h;

/* JADX INFO: loaded from: classes.dex */
public final class f extends r implements Serializable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Comparator f10924m;

    public f(Comparator comparator) {
        this.f10924m = (Comparator) AbstractC1471h.h(comparator);
    }

    @Override // p1.r, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f10924m.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            return this.f10924m.equals(((f) obj).f10924m);
        }
        return false;
    }

    public int hashCode() {
        return this.f10924m.hashCode();
    }

    public String toString() {
        return this.f10924m.toString();
    }
}
