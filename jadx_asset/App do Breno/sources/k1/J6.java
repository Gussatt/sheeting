package k1;

import V0.AbstractC0549h;

/* JADX INFO: loaded from: classes.dex */
public final class J6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b1.d f9100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f9101b;

    public J6(b1.d dVar) {
        AbstractC0549h.j(dVar);
        this.f9100a = dVar;
    }

    public final void a() {
        this.f9101b = 0L;
    }

    public final void b() {
        this.f9101b = this.f9100a.b();
    }

    public final boolean c(long j4) {
        return this.f9101b == 0 || this.f9100a.b() - this.f9101b >= 3600000;
    }
}
