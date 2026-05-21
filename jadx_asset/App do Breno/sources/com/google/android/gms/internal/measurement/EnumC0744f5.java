package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'o' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0744f5 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final EnumC0744f5 f6710n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final EnumC0744f5 f6711o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final EnumC0744f5 f6712p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final EnumC0744f5 f6713q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final EnumC0744f5 f6714r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final EnumC0744f5 f6715s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final EnumC0744f5 f6716t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final EnumC0744f5 f6717u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final EnumC0744f5 f6718v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final EnumC0744f5 f6719w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ EnumC0744f5[] f6720x;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Class f6721m;

    static {
        EnumC0744f5 enumC0744f5 = new EnumC0744f5("VOID", 0, Void.class, Void.class, null);
        f6710n = enumC0744f5;
        Class cls = Integer.TYPE;
        EnumC0744f5 enumC0744f52 = new EnumC0744f5("INT", 1, cls, Integer.class, 0);
        f6711o = enumC0744f52;
        EnumC0744f5 enumC0744f53 = new EnumC0744f5("LONG", 2, Long.TYPE, Long.class, 0L);
        f6712p = enumC0744f53;
        EnumC0744f5 enumC0744f54 = new EnumC0744f5("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f6713q = enumC0744f54;
        EnumC0744f5 enumC0744f55 = new EnumC0744f5("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f6714r = enumC0744f55;
        EnumC0744f5 enumC0744f56 = new EnumC0744f5("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f6715s = enumC0744f56;
        EnumC0744f5 enumC0744f57 = new EnumC0744f5("STRING", 6, String.class, String.class, "");
        f6716t = enumC0744f57;
        EnumC0744f5 enumC0744f58 = new EnumC0744f5("BYTE_STRING", 7, A4.class, A4.class, A4.f6292n);
        f6717u = enumC0744f58;
        EnumC0744f5 enumC0744f59 = new EnumC0744f5("ENUM", 8, cls, Integer.class, null);
        f6718v = enumC0744f59;
        EnumC0744f5 enumC0744f510 = new EnumC0744f5("MESSAGE", 9, Object.class, Object.class, null);
        f6719w = enumC0744f510;
        f6720x = new EnumC0744f5[]{enumC0744f5, enumC0744f52, enumC0744f53, enumC0744f54, enumC0744f55, enumC0744f56, enumC0744f57, enumC0744f58, enumC0744f59, enumC0744f510};
    }

    public EnumC0744f5(String str, int i4, Class cls, Class cls2, Object obj) {
        this.f6721m = cls2;
    }

    public static EnumC0744f5[] values() {
        return (EnumC0744f5[]) f6720x.clone();
    }

    public final Class d() {
        return this.f6721m;
    }
}
