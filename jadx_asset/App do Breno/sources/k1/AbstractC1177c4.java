package k1;

/* JADX INFO: renamed from: k1.c4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1177c4 extends AbstractC1168b4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9384b;

    public AbstractC1177c4(C1363z3 c1363z3) {
        super(c1363z3);
        this.f9366a.j();
    }

    public abstract boolean j();

    public final void k() {
        if (!n()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void l() {
        if (this.f9384b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (j()) {
            return;
        }
        this.f9366a.i();
        this.f9384b = true;
    }

    public final void m() {
        if (this.f9384b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        i();
        this.f9366a.i();
        this.f9384b = true;
    }

    public final boolean n() {
        return this.f9384b;
    }

    public void i() {
    }
}
