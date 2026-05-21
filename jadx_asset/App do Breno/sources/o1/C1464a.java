package o1;

/* JADX INFO: renamed from: o1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1464a extends AbstractC1470g {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C1464a f10737m = new C1464a();

    public static AbstractC1470g e() {
        return f10737m;
    }

    @Override // o1.AbstractC1470g
    public Object b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // o1.AbstractC1470g
    public boolean c() {
        return false;
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return 2040732332;
    }

    public String toString() {
        return "Optional.absent()";
    }
}
