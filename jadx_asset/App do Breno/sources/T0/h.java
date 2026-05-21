package T0;

import S0.C0506d;

/* JADX INFO: loaded from: classes.dex */
public final class h extends UnsupportedOperationException {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C0506d f3481m;

    public h(C0506d c0506d) {
        this.f3481m = c0506d;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f3481m));
    }
}
