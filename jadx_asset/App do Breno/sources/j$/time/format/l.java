package j$.time.format;

import j$.time.w;

/* JADX INFO: loaded from: classes2.dex */
final class l implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f8402b;

    public /* synthetic */ l(Object obj, int i4) {
        this.f8401a = i4;
        this.f8402b = obj;
    }

    @Override // j$.time.format.f
    public final boolean o(p pVar, StringBuilder sb) {
        switch (this.f8401a) {
            case 0:
                sb.append((String) this.f8402b);
                break;
            default:
                w wVar = (w) pVar.f((a) this.f8402b);
                if (wVar != null) {
                    sb.append(wVar.q());
                    break;
                }
                break;
        }
        return true;
    }

    public final String toString() {
        switch (this.f8401a) {
            case 0:
                return "'" + ((String) this.f8402b).replace("'", "''") + "'";
            default:
                return "ZoneRegionId()";
        }
    }
}
