package i2;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f7694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runnable f7695b;

    public m(l lVar, Runnable runnable) {
        this.f7694a = lVar;
        this.f7695b = runnable;
    }

    public Integer a() {
        l lVar = this.f7694a;
        if (lVar != null) {
            return Integer.valueOf(lVar.a());
        }
        return null;
    }

    public boolean b() {
        l lVar = this.f7694a;
        return lVar != null && lVar.b();
    }
}
