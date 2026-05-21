package h3;

/* JADX INFO: loaded from: classes.dex */
public abstract class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m3.F f7582a = new m3.F("COMPLETING_ALREADY");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m3.F f7583b = new m3.F("COMPLETING_WAITING_CHILDREN");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m3.F f7584c = new m3.F("COMPLETING_RETRY");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m3.F f7585d = new m3.F("TOO_LATE_TO_CANCEL");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m3.F f7586e = new m3.F("SEALED");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Z f7587f = new Z(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Z f7588g = new Z(true);

    public static final Object g(Object obj) {
        return obj instanceof InterfaceC1017l0 ? new C1019m0((InterfaceC1017l0) obj) : obj;
    }

    public static final Object h(Object obj) {
        InterfaceC1017l0 interfaceC1017l0;
        C1019m0 c1019m0 = obj instanceof C1019m0 ? (C1019m0) obj : null;
        return (c1019m0 == null || (interfaceC1017l0 = c1019m0.f7550a) == null) ? obj : interfaceC1017l0;
    }
}
