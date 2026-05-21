package T1;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f3483b;

    public a(String str, List list) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f3482a = str;
        if (list == null) {
            throw new NullPointerException("Null usedDates");
        }
        this.f3483b = list;
    }

    @Override // T1.l
    public List b() {
        return this.f3483b;
    }

    @Override // T1.l
    public String c() {
        return this.f3482a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.f3482a.equals(lVar.c()) && this.f3483b.equals(lVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f3482a.hashCode() ^ 1000003) * 1000003) ^ this.f3483b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f3482a + ", usedDates=" + this.f3483b + "}";
    }
}
