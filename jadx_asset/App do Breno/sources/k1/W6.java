package k1;

/* JADX INFO: loaded from: classes.dex */
public abstract class W6 extends O6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9287c;

    public W6(l7 l7Var) {
        super(l7Var);
        this.f9189b.c0();
    }

    public final void i() {
        if (!k()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void j() {
        if (this.f9287c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        l();
        this.f9189b.A();
        this.f9287c = true;
    }

    public final boolean k() {
        return this.f9287c;
    }

    public abstract boolean l();
}
