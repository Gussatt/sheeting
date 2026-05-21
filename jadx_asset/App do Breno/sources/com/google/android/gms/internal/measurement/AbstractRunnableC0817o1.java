package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC0817o1 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f6905m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f6906n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f6907o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0904z1 f6908p;

    public AbstractRunnableC0817o1(C0904z1 c0904z1, boolean z3) {
        this.f6908p = c0904z1;
        this.f6905m = c0904z1.f7026b.a();
        this.f6906n = c0904z1.f7026b.b();
        this.f6907o = z3;
    }

    public abstract void a();

    public void b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f6908p.f7031g) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e4) {
            this.f6908p.q(e4, false, this.f6907o);
            b();
        }
    }
}
