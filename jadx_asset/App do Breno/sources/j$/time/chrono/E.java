package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class E implements n {
    public static final E BEFORE_ROC;
    public static final E ROC;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ E[] f8316a;

    public static E valueOf(String str) {
        return (E) Enum.valueOf(E.class, str);
    }

    public static E[] values() {
        return (E[]) f8316a.clone();
    }

    static {
        E e4 = new E("BEFORE_ROC", 0);
        BEFORE_ROC = e4;
        E e5 = new E("ROC", 1);
        ROC = e5;
        f8316a = new E[]{e4, e5};
    }

    @Override // j$.time.chrono.n
    public final int o() {
        return ordinal();
    }
}
