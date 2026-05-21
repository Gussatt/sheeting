package o3;

import h3.M;

/* JADX INFO: loaded from: classes.dex */
public final class k extends h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Runnable f10839o;

    public k(Runnable runnable, long j4, i iVar) {
        super(j4, iVar);
        this.f10839o = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f10839o.run();
        } finally {
            this.f10837n.a();
        }
    }

    public String toString() {
        return "Task[" + M.a(this.f10839o) + '@' + M.b(this.f10839o) + ", " + this.f10836m + ", " + this.f10837n + ']';
    }
}
