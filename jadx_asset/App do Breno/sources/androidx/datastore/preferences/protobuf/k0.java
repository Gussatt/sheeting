package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f4790a = c(1, 3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f4791b = c(1, 4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f4792c = c(2, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f4793d = c(3, 2);

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'q' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static class b {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public static final b f4794A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public static final b f4795B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public static final b f4796C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final b f4797D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public static final b f4798E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public static final b f4799F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public static final /* synthetic */ b[] f4800G;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final b f4801o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final b f4802p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final b f4803q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final b f4804r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final b f4805s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final b f4806t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final b f4807u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final b f4808v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final b f4809w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final b f4810x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final b f4811y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final b f4812z;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final c f4813m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f4814n;

        public enum a extends b {
            public a(String str, int i4, c cVar, int i5) {
                super(str, i4, cVar, i5);
            }
        }

        /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k0$b$b, reason: collision with other inner class name */
        public enum C0091b extends b {
            public C0091b(String str, int i4, c cVar, int i5) {
                super(str, i4, cVar, i5);
            }
        }

        public enum c extends b {
            public c(String str, int i4, c cVar, int i5) {
                super(str, i4, cVar, i5);
            }
        }

        public enum d extends b {
            public d(String str, int i4, c cVar, int i5) {
                super(str, i4, cVar, i5);
            }
        }

        static {
            b bVar = new b("DOUBLE", 0, c.DOUBLE, 1);
            f4801o = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            f4802p = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            f4803q = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            f4804r = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            f4805s = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            f4806t = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            f4807u = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            f4808v = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            f4809w = aVar;
            c cVar3 = c.MESSAGE;
            C0091b c0091b = new C0091b("GROUP", 9, cVar3, 3);
            f4810x = c0091b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            f4811y = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            f4812z = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            f4794A = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            f4795B = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            f4796C = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            f4797D = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            f4798E = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            f4799F = bVar14;
            f4800G = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c0091b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f4800G.clone();
        }

        public c d() {
            return this.f4813m;
        }

        public int f() {
            return this.f4814n;
        }

        public b(String str, int i4, c cVar, int i5) {
            this.f4813m = cVar;
            this.f4814n = i5;
        }
    }

    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(AbstractC0584f.f4709n),
        ENUM(null),
        MESSAGE(null);


        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Object f4825m;

        c(Object obj) {
            this.f4825m = obj;
        }
    }

    public static int a(int i4) {
        return i4 >>> 3;
    }

    public static int b(int i4) {
        return i4 & 7;
    }

    public static int c(int i4, int i5) {
        return (i4 << 3) | i5;
    }
}
