package k1;

/* JADX INFO: renamed from: k1.o2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1275o2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f9635g = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1259m2 f9637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f9638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f9639d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f9640e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Object f9641f = null;

    public /* synthetic */ C1275o2(String str, Object obj, Object obj2, InterfaceC1259m2 interfaceC1259m2, AbstractC1283p2 abstractC1283p2) {
        this.f9636a = str;
        this.f9638c = obj;
        this.f9637b = interfaceC1259m2;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f9639d
            monitor-enter(r0)
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L68
            if (r4 == 0) goto L7
            return r4
        L7:
            k1.g r4 = k1.AbstractC1267n2.f9597a
            if (r4 != 0) goto Le
            java.lang.Object r4 = r3.f9638c
            return r4
        Le:
            java.lang.Object r4 = k1.C1275o2.f9635g
            monitor-enter(r4)
            boolean r0 = k1.C1208g.a()     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L24
            java.lang.Object r0 = r3.f9641f     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L20
            java.lang.Object r0 = r3.f9638c     // Catch: java.lang.Throwable -> L1e
            goto L22
        L1e:
            r0 = move-exception
            goto L66
        L20:
            java.lang.Object r0 = r3.f9641f     // Catch: java.lang.Throwable -> L1e
        L22:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1e
            return r0
        L24:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1e
            java.util.List r4 = k1.AbstractC1291q2.b()     // Catch: java.lang.SecurityException -> L5a
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.SecurityException -> L5a
        L2d:
            boolean r0 = r4.hasNext()     // Catch: java.lang.SecurityException -> L5a
            if (r0 == 0) goto L5a
            java.lang.Object r0 = r4.next()     // Catch: java.lang.SecurityException -> L5a
            k1.o2 r0 = (k1.C1275o2) r0     // Catch: java.lang.SecurityException -> L5a
            boolean r1 = k1.C1208g.a()     // Catch: java.lang.SecurityException -> L5a
            if (r1 != 0) goto L52
            r1 = 0
            k1.m2 r2 = r0.f9637b     // Catch: java.lang.IllegalStateException -> L48 java.lang.SecurityException -> L5a
            if (r2 == 0) goto L48
            java.lang.Object r1 = r2.a()     // Catch: java.lang.IllegalStateException -> L48 java.lang.SecurityException -> L5a
        L48:
            java.lang.Object r2 = k1.C1275o2.f9635g     // Catch: java.lang.SecurityException -> L5a
            monitor-enter(r2)     // Catch: java.lang.SecurityException -> L5a
            r0.f9641f = r1     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4f
            goto L2d
        L4f:
            r4 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4f
            throw r4     // Catch: java.lang.SecurityException -> L5a
        L52:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.SecurityException -> L5a
            java.lang.String r0 = "Refreshing flag cache must be done on a worker thread."
            r4.<init>(r0)     // Catch: java.lang.SecurityException -> L5a
            throw r4     // Catch: java.lang.SecurityException -> L5a
        L5a:
            k1.m2 r4 = r3.f9637b
            if (r4 != 0) goto L61
        L5e:
            java.lang.Object r4 = r3.f9638c
            goto L65
        L61:
            java.lang.Object r4 = r4.a()     // Catch: java.lang.Throwable -> L5e
        L65:
            return r4
        L66:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1e
            throw r0
        L68:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L68
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.C1275o2.a(java.lang.Object):java.lang.Object");
    }

    public final String b() {
        return this.f9636a;
    }
}
