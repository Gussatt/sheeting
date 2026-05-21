package k2;

/* JADX INFO: renamed from: k2.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1373g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1371e f10046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runnable f10047b;

    public C1373g(InterfaceC1371e interfaceC1371e, Runnable runnable) {
        this.f10046a = interfaceC1371e;
        this.f10047b = runnable;
    }

    public void a() {
        this.f10047b.run();
    }
}
