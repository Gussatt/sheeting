package q3;

import N2.i;
import java.util.concurrent.atomic.AtomicReferenceArray;
import m3.C;

/* JADX INFO: loaded from: classes.dex */
public final class f extends C {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AtomicReferenceArray f11121q;

    public f(long j4, f fVar, int i4) {
        super(j4, fVar, i4);
        this.f11121q = new AtomicReferenceArray(e.f11120f);
    }

    @Override // m3.C
    public int n() {
        return e.f11120f;
    }

    @Override // m3.C
    public void o(int i4, Throwable th, i iVar) {
        r().set(i4, e.f11119e);
        p();
    }

    public final AtomicReferenceArray r() {
        return this.f11121q;
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.f10514o + ", hashCode=" + hashCode() + ']';
    }
}
