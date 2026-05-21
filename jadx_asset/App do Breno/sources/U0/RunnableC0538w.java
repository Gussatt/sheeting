package U0;

/* JADX INFO: renamed from: U0.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0538w implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0539x f3601m;

    public RunnableC0538w(C0539x c0539x) {
        this.f3601m = c0539x;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0540y c0540y = this.f3601m.f3602a;
        c0540y.f3604m.e(c0540y.f3604m.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
