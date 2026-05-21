package n0;

/* JADX INFO: loaded from: classes.dex */
public final class i extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f10604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f10605e;

    public i(Object obj, String str, j jVar, g gVar) {
        X2.l.e(obj, "value");
        X2.l.e(str, "tag");
        X2.l.e(jVar, "verificationMode");
        X2.l.e(gVar, "logger");
        this.f10602b = obj;
        this.f10603c = str;
        this.f10604d = jVar;
        this.f10605e = gVar;
    }

    @Override // n0.h
    public Object a() {
        return this.f10602b;
    }

    @Override // n0.h
    public h c(String str, W2.l lVar) {
        X2.l.e(str, "message");
        X2.l.e(lVar, "condition");
        return ((Boolean) lVar.k(this.f10602b)).booleanValue() ? this : new f(this.f10602b, this.f10603c, str, this.f10605e, this.f10604d);
    }
}
