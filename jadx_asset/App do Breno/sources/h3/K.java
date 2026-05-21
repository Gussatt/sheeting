package h3;

/* JADX INFO: loaded from: classes.dex */
public enum K {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7508a;

        static {
            int[] iArr = new int[K.values().length];
            try {
                iArr[K.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[K.ATOMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[K.UNDISPATCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[K.LAZY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f7508a = iArr;
        }
    }

    public final void f(W2.p pVar, Object obj, N2.e eVar) throws Throwable {
        int i4 = a.f7508a[ordinal()];
        if (i4 == 1) {
            n3.a.d(pVar, obj, eVar, null, 4, null);
            return;
        }
        if (i4 == 2) {
            N2.g.a(pVar, obj, eVar);
        } else if (i4 == 3) {
            n3.b.a(pVar, obj, eVar);
        } else if (i4 != 4) {
            throw new K2.h();
        }
    }

    public final boolean g() {
        return this == LAZY;
    }
}
