package o1;

/* JADX INFO: loaded from: classes.dex */
public final class i extends AbstractC1470g {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f10746m;

    public i(Object obj) {
        this.f10746m = obj;
    }

    @Override // o1.AbstractC1470g
    public Object b() {
        return this.f10746m;
    }

    @Override // o1.AbstractC1470g
    public boolean c() {
        return true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f10746m.equals(((i) obj).f10746m);
        }
        return false;
    }

    public int hashCode() {
        return this.f10746m.hashCode() + 1502476572;
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f10746m);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 13);
        sb.append("Optional.of(");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }
}
