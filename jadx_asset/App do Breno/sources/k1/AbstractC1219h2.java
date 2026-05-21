package k1;

/* JADX INFO: renamed from: k1.h2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1219h2 extends G1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9453b;

    public AbstractC1219h2(C1363z3 c1363z3) {
        super(c1363z3);
        this.f9366a.j();
    }

    public final void i() {
        if (!m()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void j() {
        if (this.f9453b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (n()) {
            return;
        }
        this.f9366a.i();
        this.f9453b = true;
    }

    public final void k() {
        if (this.f9453b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        l();
        this.f9366a.i();
        this.f9453b = true;
    }

    public final boolean m() {
        return this.f9453b;
    }

    public abstract boolean n();

    public void l() {
    }
}
