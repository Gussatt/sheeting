package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class u implements n {
    public static final u BCE;
    public static final u CE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ u[] f8359a;

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f8359a.clone();
    }

    static {
        u uVar = new u("BCE", 0);
        BCE = uVar;
        u uVar2 = new u("CE", 1);
        CE = uVar2;
        f8359a = new u[]{uVar, uVar2};
    }

    @Override // j$.time.chrono.n
    public final int o() {
        return ordinal();
    }
}
