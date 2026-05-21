package K2;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Serializable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f2507m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f2508n;

    public i(Object obj, Object obj2) {
        this.f2507m = obj;
        this.f2508n = obj2;
    }

    public final Object a() {
        return this.f2507m;
    }

    public final Object b() {
        return this.f2508n;
    }

    public final Object c() {
        return this.f2507m;
    }

    public final Object d() {
        return this.f2508n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return X2.l.a(this.f2507m, iVar.f2507m) && X2.l.a(this.f2508n, iVar.f2508n);
    }

    public int hashCode() {
        Object obj = this.f2507m;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f2508n;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f2507m + ", " + this.f2508n + ')';
    }
}
