package h3;

/* JADX INFO: loaded from: classes.dex */
public final class Z implements InterfaceC1017l0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f7526m;

    public Z(boolean z3) {
        this.f7526m = z3;
    }

    @Override // h3.InterfaceC1017l0
    public boolean c() {
        return this.f7526m;
    }

    @Override // h3.InterfaceC1017l0
    public C0 h() {
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(c() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
