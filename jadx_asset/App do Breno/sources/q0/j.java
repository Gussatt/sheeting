package q0;

import L2.u;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f11054a;

    public j(List list) {
        X2.l.e(list, "displayFeatures");
        this.f11054a = list;
    }

    public final List a() {
        return this.f11054a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !X2.l.a(j.class, obj.getClass())) {
            return false;
        }
        return X2.l.a(this.f11054a, ((j) obj).f11054a);
    }

    public int hashCode() {
        return this.f11054a.hashCode();
    }

    public String toString() {
        return u.z(this.f11054a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, null, null, 56, null);
    }
}
