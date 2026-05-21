package j$.time.format;

/* JADX INFO: loaded from: classes2.dex */
final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char f8385a;

    d(char c4) {
        this.f8385a = c4;
    }

    @Override // j$.time.format.f
    public final boolean o(p pVar, StringBuilder sb) {
        sb.append(this.f8385a);
        return true;
    }

    public final String toString() {
        char c4 = this.f8385a;
        if (c4 == '\'') {
            return "''";
        }
        return "'" + c4 + "'";
    }
}
