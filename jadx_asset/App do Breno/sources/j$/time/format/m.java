package j$.time.format;

/* JADX INFO: loaded from: classes2.dex */
final class m implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j$.time.temporal.a f8403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v f8404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f8405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile i f8406d;

    m(j$.time.temporal.a aVar, v vVar, b bVar) {
        this.f8403a = aVar;
        this.f8404b = vVar;
        this.f8405c = bVar;
    }

    @Override // j$.time.format.f
    public final boolean o(p pVar, StringBuilder sb) {
        String strA;
        Long lE = pVar.e(this.f8403a);
        if (lE == null) {
            return false;
        }
        j$.time.chrono.m mVar = (j$.time.chrono.m) pVar.d().a(j$.time.temporal.s.a());
        if (mVar == null || mVar == j$.time.chrono.t.f8358d) {
            b bVar = this.f8405c;
            long jLongValue = lE.longValue();
            v vVar = this.f8404b;
            pVar.c();
            strA = bVar.f8383a.a(jLongValue, vVar);
        } else {
            b bVar2 = this.f8405c;
            long jLongValue2 = lE.longValue();
            v vVar2 = this.f8404b;
            pVar.c();
            strA = bVar2.f8383a.a(jLongValue2, vVar2);
        }
        if (strA != null) {
            sb.append(strA);
            return true;
        }
        if (this.f8406d == null) {
            this.f8406d = new i(this.f8403a, 1, 19, u.NORMAL);
        }
        return this.f8406d.o(pVar, sb);
    }

    public final String toString() {
        v vVar = v.FULL;
        j$.time.temporal.a aVar = this.f8403a;
        v vVar2 = this.f8404b;
        if (vVar2 == vVar) {
            return "Text(" + aVar + ")";
        }
        return "Text(" + aVar + "," + vVar2 + ")";
    }
}
