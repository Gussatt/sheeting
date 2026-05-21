package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class B implements Z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final I f4625b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I f4626a;

    public class a implements I {
        @Override // androidx.datastore.preferences.protobuf.I
        public H a(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // androidx.datastore.preferences.protobuf.I
        public boolean b(Class cls) {
            return false;
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4627a;

        static {
            int[] iArr = new int[T.values().length];
            f4627a = iArr;
            try {
                iArr[T.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static class c implements I {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public I[] f4628a;

        public c(I... iArr) {
            this.f4628a = iArr;
        }

        @Override // androidx.datastore.preferences.protobuf.I
        public H a(Class cls) {
            for (I i4 : this.f4628a) {
                if (i4.b(cls)) {
                    return i4.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // androidx.datastore.preferences.protobuf.I
        public boolean b(Class cls) {
            for (I i4 : this.f4628a) {
                if (i4.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public B() {
        this(c());
    }

    public static boolean b(H h4) {
        return b.f4627a[h4.b().ordinal()] != 1;
    }

    public static I c() {
        return new c(C0596s.c(), d());
    }

    public static I d() {
        if (U.f4671d) {
            return f4625b;
        }
        try {
            return (I) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f4625b;
        }
    }

    public static Y e(Class cls, H h4) {
        if (f(cls)) {
            return M.N(cls, h4, Q.b(), A.b(), a0.K(), b(h4) ? AbstractC0594p.b() : null, G.b());
        }
        O oA = Q.a();
        AbstractC0592n abstractC0592nA = null;
        InterfaceC0602y interfaceC0602yA = A.a();
        f0 f0VarJ = a0.J();
        if (b(h4)) {
            abstractC0592nA = AbstractC0594p.a();
        }
        return M.N(cls, h4, oA, interfaceC0602yA, f0VarJ, abstractC0592nA, G.a());
    }

    public static boolean f(Class cls) {
        return U.f4671d || AbstractC0597t.class.isAssignableFrom(cls);
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public Y a(Class cls) {
        a0.G(cls);
        H hA = this.f4626a.a(cls);
        return hA.a() ? f(cls) ? N.l(a0.K(), AbstractC0594p.b(), hA.c()) : N.l(a0.J(), AbstractC0594p.a(), hA.c()) : e(cls, hA);
    }

    public B(I i4) {
        this.f4626a = (I) AbstractC0598u.b(i4, "messageInfoFactory");
    }
}
