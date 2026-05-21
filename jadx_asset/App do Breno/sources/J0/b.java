package J0;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M0.a f2278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f2279b;

    public b(M0.a aVar, Map map) {
        if (aVar == null) {
            throw new NullPointerException("Null clock");
        }
        this.f2278a = aVar;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f2279b = map;
    }

    @Override // J0.f
    public M0.a e() {
        return this.f2278a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f2278a.equals(fVar.e()) && this.f2279b.equals(fVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // J0.f
    public Map h() {
        return this.f2279b;
    }

    public int hashCode() {
        return ((this.f2278a.hashCode() ^ 1000003) * 1000003) ^ this.f2279b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f2278a + ", values=" + this.f2279b + "}";
    }
}
