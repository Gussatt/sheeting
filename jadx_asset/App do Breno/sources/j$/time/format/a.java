package j$.time.format;

import j$.time.ZoneOffset;
import j$.time.w;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements j$.time.temporal.t {
    @Override // j$.time.temporal.t
    public final Object a(j$.time.temporal.n nVar) {
        w wVar = (w) nVar.a(j$.time.temporal.s.g());
        if (wVar == null || (wVar instanceof ZoneOffset)) {
            return null;
        }
        return wVar;
    }
}
