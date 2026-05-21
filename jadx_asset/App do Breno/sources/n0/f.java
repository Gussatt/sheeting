package n0;

/* JADX INFO: loaded from: classes.dex */
public final class f extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f10596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f10597e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j f10598f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f10599g;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10600a;

        static {
            int[] iArr = new int[j.values().length];
            try {
                iArr[j.STRICT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.LOG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j.QUIET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f10600a = iArr;
        }
    }

    public f(Object obj, String str, String str2, g gVar, j jVar) {
        X2.l.e(obj, "value");
        X2.l.e(str, "tag");
        X2.l.e(str2, "message");
        X2.l.e(gVar, "logger");
        X2.l.e(jVar, "verificationMode");
        this.f10594b = obj;
        this.f10595c = str;
        this.f10596d = str2;
        this.f10597e = gVar;
        this.f10598f = jVar;
        l lVar = new l(b(obj, str2));
        StackTraceElement[] stackTrace = lVar.getStackTrace();
        X2.l.d(stackTrace, "stackTrace");
        lVar.setStackTrace((StackTraceElement[]) L2.j.m(stackTrace, 2).toArray(new StackTraceElement[0]));
        this.f10599g = lVar;
    }

    @Override // n0.h
    public Object a() throws l {
        int i4 = a.f10600a[this.f10598f.ordinal()];
        if (i4 == 1) {
            throw this.f10599g;
        }
        if (i4 == 2) {
            this.f10597e.a(this.f10595c, b(this.f10594b, this.f10596d));
            return null;
        }
        if (i4 == 3) {
            return null;
        }
        throw new K2.h();
    }

    @Override // n0.h
    public h c(String str, W2.l lVar) {
        X2.l.e(str, "message");
        X2.l.e(lVar, "condition");
        return this;
    }
}
