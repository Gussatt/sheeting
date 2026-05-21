package e2;

/* JADX INFO: renamed from: e2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0935c implements InterfaceC0934b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0935c f7188b = new C0935c(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7189a;

    public C0935c(Object obj) {
        this.f7189a = obj;
    }

    public static InterfaceC0934b a(Object obj) {
        return new C0935c(AbstractC0936d.c(obj, "instance cannot be null"));
    }

    @Override // J2.a
    public Object get() {
        return this.f7189a;
    }
}
