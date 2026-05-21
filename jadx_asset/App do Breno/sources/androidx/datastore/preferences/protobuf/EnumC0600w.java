package androidx.datastore.preferences.protobuf;

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
/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0600w {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final EnumC0600w f4930p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final EnumC0600w f4931q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final EnumC0600w f4932r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final EnumC0600w f4933s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final EnumC0600w f4934t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final EnumC0600w f4935u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final EnumC0600w f4936v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final EnumC0600w f4937w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final EnumC0600w f4938x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final EnumC0600w f4939y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ EnumC0600w[] f4940z;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Class f4941m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Class f4942n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f4943o;

    static {
        EnumC0600w enumC0600w = new EnumC0600w("VOID", 0, Void.class, Void.class, null);
        f4930p = enumC0600w;
        Class cls = Integer.TYPE;
        EnumC0600w enumC0600w2 = new EnumC0600w("INT", 1, cls, Integer.class, 0);
        f4931q = enumC0600w2;
        EnumC0600w enumC0600w3 = new EnumC0600w("LONG", 2, Long.TYPE, Long.class, 0L);
        f4932r = enumC0600w3;
        EnumC0600w enumC0600w4 = new EnumC0600w("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f4933s = enumC0600w4;
        EnumC0600w enumC0600w5 = new EnumC0600w("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f4934t = enumC0600w5;
        EnumC0600w enumC0600w6 = new EnumC0600w("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f4935u = enumC0600w6;
        EnumC0600w enumC0600w7 = new EnumC0600w("STRING", 6, String.class, String.class, "");
        f4936v = enumC0600w7;
        EnumC0600w enumC0600w8 = new EnumC0600w("BYTE_STRING", 7, AbstractC0584f.class, AbstractC0584f.class, AbstractC0584f.f4709n);
        f4937w = enumC0600w8;
        EnumC0600w enumC0600w9 = new EnumC0600w("ENUM", 8, cls, Integer.class, null);
        f4938x = enumC0600w9;
        EnumC0600w enumC0600w10 = new EnumC0600w("MESSAGE", 9, Object.class, Object.class, null);
        f4939y = enumC0600w10;
        f4940z = new EnumC0600w[]{enumC0600w, enumC0600w2, enumC0600w3, enumC0600w4, enumC0600w5, enumC0600w6, enumC0600w7, enumC0600w8, enumC0600w9, enumC0600w10};
    }

    public EnumC0600w(String str, int i4, Class cls, Class cls2, Object obj) {
        this.f4941m = cls;
        this.f4942n = cls2;
        this.f4943o = obj;
    }

    public static EnumC0600w valueOf(String str) {
        return (EnumC0600w) Enum.valueOf(EnumC0600w.class, str);
    }

    public static EnumC0600w[] values() {
        return (EnumC0600w[]) f4940z.clone();
    }

    public Class d() {
        return this.f4942n;
    }
}
