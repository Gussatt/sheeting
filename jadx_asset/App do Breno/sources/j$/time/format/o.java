package j$.time.format;

import j$.time.chrono.InterfaceC1095b;
import j$.time.w;

/* JADX INFO: loaded from: classes2.dex */
final class o implements j$.time.temporal.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC1095b f8413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f8414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ j$.time.chrono.m f8415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ w f8416d;

    o(InterfaceC1095b interfaceC1095b, j$.time.temporal.n nVar, j$.time.chrono.m mVar, w wVar) {
        this.f8413a = interfaceC1095b;
        this.f8414b = nVar;
        this.f8415c = mVar;
        this.f8416d = wVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [j$.time.temporal.n, java.lang.Object] */
    @Override // j$.time.temporal.n
    public final boolean d(j$.time.temporal.q qVar) {
        InterfaceC1095b interfaceC1095b = this.f8413a;
        if (interfaceC1095b != null && qVar.J()) {
            return interfaceC1095b.d(qVar);
        }
        return this.f8414b.d(qVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [j$.time.temporal.n, java.lang.Object] */
    @Override // j$.time.temporal.n
    public final j$.time.temporal.w k(j$.time.temporal.q qVar) {
        InterfaceC1095b interfaceC1095b = this.f8413a;
        if (interfaceC1095b != null && qVar.J()) {
            return interfaceC1095b.k(qVar);
        }
        return this.f8414b.k(qVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [j$.time.temporal.n, java.lang.Object] */
    @Override // j$.time.temporal.n
    public final long e(j$.time.temporal.q qVar) {
        InterfaceC1095b interfaceC1095b = this.f8413a;
        if (interfaceC1095b != null && qVar.J()) {
            return interfaceC1095b.e(qVar);
        }
        return this.f8414b.e(qVar);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [j$.time.temporal.n, java.lang.Object] */
    @Override // j$.time.temporal.n
    public final Object a(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.s.a()) {
            return this.f8415c;
        }
        if (tVar == j$.time.temporal.s.g()) {
            return this.f8416d;
        }
        if (tVar == j$.time.temporal.s.e()) {
            return this.f8414b.a(tVar);
        }
        return tVar.a(this);
    }

    public final String toString() {
        String str;
        String str2 = "";
        j$.time.chrono.m mVar = this.f8415c;
        if (mVar != null) {
            str = " with chronology " + mVar;
        } else {
            str = "";
        }
        w wVar = this.f8416d;
        if (wVar != null) {
            str2 = " with zone " + wVar;
        }
        return this.f8414b + str + str2;
    }
}
