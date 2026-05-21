package E1;

import L2.C;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f934c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(String str, long j4) {
        this(str, j4, null, 4, null);
        X2.l.e(str, "sessionId");
    }

    public final Map a() {
        return this.f934c;
    }

    public final String b() {
        return this.f932a;
    }

    public final long c() {
        return this.f933b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return X2.l.a(this.f932a, cVar.f932a) && this.f933b == cVar.f933b && X2.l.a(this.f934c, cVar.f934c);
    }

    public int hashCode() {
        return (((this.f932a.hashCode() * 31) + Long.hashCode(this.f933b)) * 31) + this.f934c.hashCode();
    }

    public String toString() {
        return "EventMetadata(sessionId=" + this.f932a + ", timestamp=" + this.f933b + ", additionalCustomKeys=" + this.f934c + ')';
    }

    public c(String str, long j4, Map map) {
        X2.l.e(str, "sessionId");
        X2.l.e(map, "additionalCustomKeys");
        this.f932a = str;
        this.f933b = j4;
        this.f934c = map;
    }

    public /* synthetic */ c(String str, long j4, Map map, int i4, X2.g gVar) {
        this(str, j4, (i4 & 4) != 0 ? C.d() : map);
    }
}
