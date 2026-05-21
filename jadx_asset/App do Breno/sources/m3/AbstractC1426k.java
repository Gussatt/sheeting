package m3;

/* JADX INFO: renamed from: m3.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1426k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final F f10545a = new F("UNDEFINED");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final F f10546b = new F("REUSABLE_CLAIMED");

    /* JADX WARN: Removed duplicated region for block: B:27:0x008f A[Catch: all -> 0x0068, DONT_GENERATE, TryCatch #0 {all -> 0x0068, blocks: (B:11:0x003f, B:13:0x004d, B:15:0x0053, B:28:0x0092, B:18:0x006a, B:20:0x007a, B:25:0x0089, B:27:0x008f, B:33:0x009f, B:36:0x00a8, B:35:0x00a5, B:23:0x0080), top: B:45:0x003f, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(N2.e r6, java.lang.Object r7, W2.l r8) {
        /*
            boolean r0 = r6 instanceof m3.C1425j
            if (r0 == 0) goto Lb3
            m3.j r6 = (m3.C1425j) r6
            java.lang.Object r8 = h3.D.b(r7, r8)
            h3.F r0 = r6.f10541p
            N2.i r1 = r6.b()
            boolean r0 = r0.S(r1)
            r1 = 1
            if (r0 == 0) goto L26
            r6.f10543r = r8
            r6.f7520o = r1
            h3.F r7 = r6.f10541p
            N2.i r8 = r6.b()
            r7.R(r8, r6)
            goto Lad
        L26:
            h3.L0 r0 = h3.L0.f7509a
            h3.a0 r0 = r0.b()
            boolean r2 = r0.b0()
            if (r2 == 0) goto L3b
            r6.f10543r = r8
            r6.f7520o = r1
            r0.X(r6)
            goto Lad
        L3b:
            r0.Z(r1)
            r2 = 0
            N2.i r3 = r6.b()     // Catch: java.lang.Throwable -> L68
            h3.q0$b r4 = h3.InterfaceC1027q0.f7558k     // Catch: java.lang.Throwable -> L68
            N2.i$b r3 = r3.d(r4)     // Catch: java.lang.Throwable -> L68
            h3.q0 r3 = (h3.InterfaceC1027q0) r3     // Catch: java.lang.Throwable -> L68
            if (r3 == 0) goto L6a
            boolean r4 = r3.c()     // Catch: java.lang.Throwable -> L68
            if (r4 != 0) goto L6a
            java.util.concurrent.CancellationException r7 = r3.C()     // Catch: java.lang.Throwable -> L68
            r6.a(r8, r7)     // Catch: java.lang.Throwable -> L68
            K2.j$a r8 = K2.j.f2509n     // Catch: java.lang.Throwable -> L68
            java.lang.Object r7 = K2.k.a(r7)     // Catch: java.lang.Throwable -> L68
            java.lang.Object r7 = K2.j.b(r7)     // Catch: java.lang.Throwable -> L68
            r6.p(r7)     // Catch: java.lang.Throwable -> L68
            goto L92
        L68:
            r7 = move-exception
            goto La9
        L6a:
            N2.e r8 = r6.f10542q     // Catch: java.lang.Throwable -> L68
            java.lang.Object r3 = r6.f10544s     // Catch: java.lang.Throwable -> L68
            N2.i r4 = r8.b()     // Catch: java.lang.Throwable -> L68
            java.lang.Object r3 = m3.J.c(r4, r3)     // Catch: java.lang.Throwable -> L68
            m3.F r5 = m3.J.f10520a     // Catch: java.lang.Throwable -> L68
            if (r3 == r5) goto L7f
            h3.N0 r8 = h3.E.g(r8, r4, r3)     // Catch: java.lang.Throwable -> L68
            goto L80
        L7f:
            r8 = r2
        L80:
            N2.e r5 = r6.f10542q     // Catch: java.lang.Throwable -> L9c
            r5.p(r7)     // Catch: java.lang.Throwable -> L9c
            K2.p r7 = K2.p.f2516a     // Catch: java.lang.Throwable -> L9c
            if (r8 == 0) goto L8f
            boolean r7 = r8.V0()     // Catch: java.lang.Throwable -> L68
            if (r7 == 0) goto L92
        L8f:
            m3.J.a(r4, r3)     // Catch: java.lang.Throwable -> L68
        L92:
            boolean r7 = r0.e0()     // Catch: java.lang.Throwable -> L68
            if (r7 != 0) goto L92
        L98:
            r0.U(r1)
            goto Lad
        L9c:
            r7 = move-exception
            if (r8 == 0) goto La5
            boolean r8 = r8.V0()     // Catch: java.lang.Throwable -> L68
            if (r8 == 0) goto La8
        La5:
            m3.J.a(r4, r3)     // Catch: java.lang.Throwable -> L68
        La8:
            throw r7     // Catch: java.lang.Throwable -> L68
        La9:
            r6.g(r7, r2)     // Catch: java.lang.Throwable -> Lae
            goto L98
        Lad:
            return
        Lae:
            r6 = move-exception
            r0.U(r1)
            throw r6
        Lb3:
            r6.p(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.AbstractC1426k.b(N2.e, java.lang.Object, W2.l):void");
    }

    public static /* synthetic */ void c(N2.e eVar, Object obj, W2.l lVar, int i4, Object obj2) {
        if ((i4 & 2) != 0) {
            lVar = null;
        }
        b(eVar, obj, lVar);
    }
}
