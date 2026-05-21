package k1;

import V0.AbstractC0549h;
import java.net.URL;
import java.util.Map;

/* JADX INFO: renamed from: k1.o5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1278o5 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final URL f9642m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final byte[] f9643n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final InterfaceC1254l5 f9644o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f9645p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Map f9646q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1286p5 f9647r;

    public RunnableC1278o5(C1286p5 c1286p5, String str, URL url, byte[] bArr, Map map, InterfaceC1254l5 interfaceC1254l5) {
        this.f9647r = c1286p5;
        AbstractC0549h.d(str);
        AbstractC0549h.j(url);
        AbstractC0549h.j(interfaceC1254l5);
        this.f9642m = url;
        this.f9643n = bArr;
        this.f9644o = interfaceC1254l5;
        this.f9645p = str;
        this.f9646q = map;
    }

    public final void b(final int i4, final Exception exc, final byte[] bArr, final Map map) {
        this.f9647r.f9366a.e().A(new Runnable() { // from class: k1.m5
            @Override // java.lang.Runnable
            public final void run() {
                RunnableC1278o5 runnableC1278o5 = this.f9579m;
                runnableC1278o5.f9644o.a(runnableC1278o5.f9645p, i4, exc, bArr, map);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x015d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v0, types: [k1.o5] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.RunnableC1278o5.run():void");
    }
}
