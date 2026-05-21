package h3;

/* JADX INFO: renamed from: h3.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1034y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC1012j f7578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final W2.l f7579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f7580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f7581e;

    public C1034y(Object obj, AbstractC1012j abstractC1012j, W2.l lVar, Object obj2, Throwable th) {
        this.f7577a = obj;
        this.f7578b = abstractC1012j;
        this.f7579c = lVar;
        this.f7580d = obj2;
        this.f7581e = th;
    }

    public static /* synthetic */ C1034y b(C1034y c1034y, Object obj, AbstractC1012j abstractC1012j, W2.l lVar, Object obj2, Throwable th, int i4, Object obj3) {
        if ((i4 & 1) != 0) {
            obj = c1034y.f7577a;
        }
        if ((i4 & 2) != 0) {
            abstractC1012j = c1034y.f7578b;
        }
        if ((i4 & 4) != 0) {
            lVar = c1034y.f7579c;
        }
        if ((i4 & 8) != 0) {
            obj2 = c1034y.f7580d;
        }
        if ((i4 & 16) != 0) {
            th = c1034y.f7581e;
        }
        Throwable th2 = th;
        W2.l lVar2 = lVar;
        return c1034y.a(obj, abstractC1012j, lVar2, obj2, th2);
    }

    public final C1034y a(Object obj, AbstractC1012j abstractC1012j, W2.l lVar, Object obj2, Throwable th) {
        return new C1034y(obj, abstractC1012j, lVar, obj2, th);
    }

    public final boolean c() {
        return this.f7581e != null;
    }

    public final void d(C1018m c1018m, Throwable th) {
        AbstractC1012j abstractC1012j = this.f7578b;
        if (abstractC1012j != null) {
            c1018m.l(abstractC1012j, th);
        }
        W2.l lVar = this.f7579c;
        if (lVar != null) {
            c1018m.m(lVar, th);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1034y)) {
            return false;
        }
        C1034y c1034y = (C1034y) obj;
        return X2.l.a(this.f7577a, c1034y.f7577a) && X2.l.a(this.f7578b, c1034y.f7578b) && X2.l.a(this.f7579c, c1034y.f7579c) && X2.l.a(this.f7580d, c1034y.f7580d) && X2.l.a(this.f7581e, c1034y.f7581e);
    }

    public int hashCode() {
        Object obj = this.f7577a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        AbstractC1012j abstractC1012j = this.f7578b;
        int iHashCode2 = (iHashCode + (abstractC1012j == null ? 0 : abstractC1012j.hashCode())) * 31;
        W2.l lVar = this.f7579c;
        int iHashCode3 = (iHashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f7580d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f7581e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f7577a + ", cancelHandler=" + this.f7578b + ", onCancellation=" + this.f7579c + ", idempotentResume=" + this.f7580d + ", cancelCause=" + this.f7581e + ')';
    }

    public /* synthetic */ C1034y(Object obj, AbstractC1012j abstractC1012j, W2.l lVar, Object obj2, Throwable th, int i4, X2.g gVar) {
        this(obj, (i4 & 2) != 0 ? null : abstractC1012j, (i4 & 4) != 0 ? null : lVar, (i4 & 8) != 0 ? null : obj2, (i4 & 16) != 0 ? null : th);
    }
}
