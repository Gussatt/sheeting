package k1;

/* JADX INFO: renamed from: k1.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1272o {
    UNSET('0'),
    REMOTE_DEFAULT('1'),
    REMOTE_DELEGATION('2'),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    CHILD_ACCOUNT('6'),
    TCF('7'),
    REMOTE_ENFORCED_DEFAULT('8'),
    FAILSAFE('9');


    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final char f9634m;

    EnumC1272o(char c4) {
        this.f9634m = c4;
    }

    public static EnumC1272o f(char c4) {
        for (EnumC1272o enumC1272o : values()) {
            if (enumC1272o.f9634m == c4) {
                return enumC1272o;
            }
        }
        return UNSET;
    }
}
