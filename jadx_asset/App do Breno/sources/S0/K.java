package S0;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class K extends M {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Callable f3413f;

    public /* synthetic */ K(Callable callable, L l4) {
        super();
        this.f3413f = callable;
    }

    @Override // S0.M
    public final String a() {
        try {
            return (String) this.f3413f.call();
        } catch (Exception e4) {
            throw new RuntimeException(e4);
        }
    }
}
