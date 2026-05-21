package L;

/* JADX INFO: loaded from: classes.dex */
public final class e extends v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2524c;

    public e(Object obj, int i4, int i5) {
        super(i5, null);
        this.f2523b = obj;
        this.f2524c = i4;
    }

    public final void b() {
        Object obj = this.f2523b;
        if ((obj != null ? obj.hashCode() : 0) != this.f2524c) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
    }

    public final Object c() {
        return this.f2523b;
    }
}
