package i2;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import j2.AbstractC1110a;
import java.util.HashMap;
import java.util.Map;
import k2.C1370d;
import s2.InterfaceC1536a;
import w2.C1616i;
import w2.C1617j;
import w2.C1622o;
import w2.InterfaceC1609b;

/* JADX INFO: renamed from: i2.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1048D implements InterfaceC1536a, C1617j.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static String f7650j;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static p f7654n;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f7655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1617j f7656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Map f7645e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Map f7646f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f7647g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f7648h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f7649i = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f7651k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f7652l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f7653m = 0;

    /* JADX INFO: renamed from: i2.D$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ k f7657m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ C1617j.d f7658n;

        public a(k kVar, C1617j.d dVar) {
            this.f7657m = kVar;
            this.f7658n = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (C1048D.f7648h) {
                C1048D.this.n(this.f7657m);
            }
            this.f7658n.a(null);
        }
    }

    /* JADX INFO: renamed from: i2.D$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ k f7660m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f7661n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ C1617j.d f7662o;

        public b(k kVar, String str, C1617j.d dVar) {
            this.f7660m = kVar;
            this.f7661n = str;
            this.f7662o = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (C1048D.f7648h) {
                k kVar = this.f7660m;
                if (kVar != null) {
                    C1048D.this.n(kVar);
                }
                try {
                    if (s.c(C1048D.f7649i)) {
                        Log.d("Sqflite", "delete database " + this.f7661n);
                    }
                    k.o(this.f7661n);
                } catch (Exception e4) {
                    Log.e("Sqflite", "error " + e4 + " while closing database " + C1048D.f7653m);
                }
            }
            this.f7662o.a(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0048 A[Catch: all -> 0x003e, Exception -> 0x004c, TryCatch #1 {Exception -> 0x004c, blocks: (B:16:0x0040, B:18:0x0048, B:21:0x004e), top: B:45:0x0040, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004e A[Catch: all -> 0x003e, Exception -> 0x004c, TRY_LEAVE, TryCatch #1 {Exception -> 0x004c, blocks: (B:16:0x0040, B:18:0x0048, B:21:0x004e), top: B:45:0x0040, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void e(boolean r2, java.lang.String r3, w2.C1617j.d r4, java.lang.Boolean r5, i2.k r6, w2.C1616i r7, boolean r8, int r9) {
        /*
            java.lang.Object r0 = i2.C1048D.f7648h
            monitor-enter(r0)
            if (r2 != 0) goto L40
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L3e
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L3e
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = r2.getParent()     // Catch: java.lang.Throwable -> L3e
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L3e
            boolean r2 = r1.exists()     // Catch: java.lang.Throwable -> L3e
            if (r2 != 0) goto L40
            boolean r2 = r1.mkdirs()     // Catch: java.lang.Throwable -> L3e
            if (r2 != 0) goto L40
            boolean r2 = r1.exists()     // Catch: java.lang.Throwable -> L3e
            if (r2 != 0) goto L40
            java.lang.String r2 = "sqlite_error"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r5.<init>()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r6 = "open_failed "
            r5.append(r6)     // Catch: java.lang.Throwable -> L3e
            r5.append(r3)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L3e
            r5 = 0
            r4.b(r2, r3, r5)     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            return
        L3e:
            r2 = move-exception
            goto Laf
        L40:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L4c
            boolean r2 = r2.equals(r5)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L4c
            if (r2 == 0) goto L4e
            r6.H()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L4c
            goto L51
        L4c:
            r2 = move-exception
            goto La5
        L4e:
            r6.G()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L4c
        L51:
            java.lang.Object r2 = i2.C1048D.f7647g     // Catch: java.lang.Throwable -> L3e
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L3e
            if (r8 == 0) goto L62
            java.util.Map r5 = i2.C1048D.f7645e     // Catch: java.lang.Throwable -> L60
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L60
            r5.put(r3, r7)     // Catch: java.lang.Throwable -> L60
            goto L62
        L60:
            r3 = move-exception
            goto La3
        L62:
            java.util.Map r5 = i2.C1048D.f7646f     // Catch: java.lang.Throwable -> L60
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L60
            r5.put(r7, r6)     // Catch: java.lang.Throwable -> L60
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L60
            int r2 = r6.f7683d     // Catch: java.lang.Throwable -> L3e
            boolean r2 = i2.s.b(r2)     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L99
            java.lang.String r2 = "Sqflite"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r5.<init>()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r6 = r6.A()     // Catch: java.lang.Throwable -> L3e
            r5.append(r6)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r6 = "opened "
            r5.append(r6)     // Catch: java.lang.Throwable -> L3e
            r5.append(r9)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r6 = " "
            r5.append(r6)     // Catch: java.lang.Throwable -> L3e
            r5.append(r3)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L3e
            android.util.Log.d(r2, r3)     // Catch: java.lang.Throwable -> L3e
        L99:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            r2 = 0
            java.util.Map r2 = s(r9, r2, r2)
            r4.a(r2)
            return
        La3:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L60
            throw r3     // Catch: java.lang.Throwable -> L3e
        La5:
            k2.d r3 = new k2.d     // Catch: java.lang.Throwable -> L3e
            r3.<init>(r7, r4)     // Catch: java.lang.Throwable -> L3e
            r6.D(r2, r3)     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            return
        Laf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.C1048D.e(boolean, java.lang.String, w2.j$d, java.lang.Boolean, i2.k, w2.i, boolean, int):void");
    }

    public static /* synthetic */ void i(C1616i c1616i, k kVar, C1617j.d dVar) {
        try {
            kVar.f7688i.setLocale(AbstractC1050F.d((String) c1616i.a("locale")));
            dVar.a(null);
        } catch (Exception e4) {
            dVar.b("sqlite_error", "Error calling setLocale: " + e4.getMessage(), null);
        }
    }

    public static boolean q(String str) {
        return str == null || str.equals(":memory:");
    }

    public static Map s(int i4, boolean z3, boolean z4) {
        HashMap map = new HashMap();
        map.put("id", Integer.valueOf(i4));
        if (z3) {
            map.put("recovered", Boolean.TRUE);
        }
        if (z4) {
            map.put("recoveredInTransaction", Boolean.TRUE);
        }
        return map;
    }

    public final void A(final C1616i c1616i, final C1617j.d dVar) {
        final k kVarP = p(c1616i, dVar);
        if (kVarP == null) {
            return;
        }
        f7654n.e(kVarP, new Runnable() { // from class: i2.A
            @Override // java.lang.Runnable
            public final void run() {
                kVarP.v(new C1370d(c1616i, dVar));
            }
        });
    }

    public void B(C1616i c1616i, C1617j.d dVar) {
        if (f7650j == null) {
            f7650j = this.f7655c.getDatabasePath("tekartik_sqflite.db").getParent();
        }
        dVar.a(f7650j);
    }

    public final void C(final C1616i c1616i, final C1617j.d dVar) {
        final k kVarP = p(c1616i, dVar);
        if (kVarP == null) {
            return;
        }
        f7654n.e(kVarP, new Runnable() { // from class: i2.w
            @Override // java.lang.Runnable
            public final void run() {
                kVarP.E(new C1370d(c1616i, dVar));
            }
        });
    }

    public final void D(final C1616i c1616i, final C1617j.d dVar) {
        final int i4;
        k kVar;
        final String str = (String) c1616i.a("path");
        final Boolean bool = (Boolean) c1616i.a("readOnly");
        final boolean zQ = q(str);
        boolean z3 = (Boolean.FALSE.equals(c1616i.a("singleInstance")) || zQ) ? false : true;
        if (z3) {
            synchronized (f7647g) {
                try {
                    if (s.c(f7649i)) {
                        Log.d("Sqflite", "Look for " + str + " in " + f7645e.keySet());
                    }
                    Integer num = (Integer) f7645e.get(str);
                    if (num != null && (kVar = (k) f7646f.get(num)) != null) {
                        if (kVar.f7688i.isOpen()) {
                            if (s.c(f7649i)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(kVar.A());
                                sb.append("re-opened single instance ");
                                sb.append(kVar.F() ? "(in transaction) " : "");
                                sb.append(num);
                                sb.append(" ");
                                sb.append(str);
                                Log.d("Sqflite", sb.toString());
                            }
                            dVar.a(s(num.intValue(), true, kVar.F()));
                            return;
                        }
                        if (s.c(f7649i)) {
                            Log.d("Sqflite", kVar.A() + "single instance database of " + str + " not opened");
                        }
                    }
                } finally {
                }
            }
        }
        Object obj = f7647g;
        synchronized (obj) {
            i4 = f7653m + 1;
            f7653m = i4;
        }
        final k kVar2 = new k(this.f7655c, str, i4, z3, f7649i);
        synchronized (obj) {
            try {
                if (f7654n == null) {
                    p pVarB = p.b("Sqflite", f7652l, f7651k);
                    f7654n = pVarB;
                    pVarB.a();
                    if (s.b(kVar2.f7683d)) {
                        Log.d("Sqflite", kVar2.A() + "starting worker pool with priority " + f7651k);
                    }
                }
                kVar2.f7687h = f7654n;
                if (s.b(kVar2.f7683d)) {
                    Log.d("Sqflite", kVar2.A() + "opened " + i4 + " " + str);
                }
                final boolean z4 = z3;
                f7654n.e(kVar2, new Runnable() { // from class: i2.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1048D.e(zQ, str, dVar, bool, kVar2, c1616i, z4, i4);
                    }
                });
            } finally {
            }
        }
    }

    public void E(C1616i c1616i, C1617j.d dVar) {
        Object objA = c1616i.a("androidThreadPriority");
        if (objA != null) {
            f7651k = ((Integer) objA).intValue();
        }
        Object objA2 = c1616i.a("androidThreadCount");
        if (objA2 != null && !objA2.equals(Integer.valueOf(f7652l))) {
            f7652l = ((Integer) objA2).intValue();
            p pVar = f7654n;
            if (pVar != null) {
                pVar.c();
                f7654n = null;
            }
        }
        Integer numA = s.a(c1616i);
        if (numA != null) {
            f7649i = numA.intValue();
        }
        dVar.a(null);
    }

    public final void F(final C1616i c1616i, final C1617j.d dVar) {
        final k kVarP = p(c1616i, dVar);
        if (kVarP == null) {
            return;
        }
        f7654n.e(kVarP, new Runnable() { // from class: i2.x
            @Override // java.lang.Runnable
            public final void run() {
                kVarP.I(new C1370d(c1616i, dVar));
            }
        });
    }

    public final void G(final C1616i c1616i, final C1617j.d dVar) {
        final k kVarP = p(c1616i, dVar);
        if (kVarP == null) {
            return;
        }
        f7654n.e(kVarP, new Runnable() { // from class: i2.v
            @Override // java.lang.Runnable
            public final void run() {
                kVarP.J(new C1370d(c1616i, dVar));
            }
        });
    }

    public final void H(final C1616i c1616i, final C1617j.d dVar) {
        final k kVarP = p(c1616i, dVar);
        if (kVarP == null) {
            return;
        }
        f7654n.e(kVarP, new Runnable() { // from class: i2.y
            @Override // java.lang.Runnable
            public final void run() {
                C1048D.i(c1616i, kVarP, dVar);
            }
        });
    }

    public final void I(final C1616i c1616i, final C1617j.d dVar) {
        final k kVarP = p(c1616i, dVar);
        if (kVarP == null) {
            return;
        }
        f7654n.e(kVarP, new Runnable() { // from class: i2.B
            @Override // java.lang.Runnable
            public final void run() {
                kVarP.L(new C1370d(c1616i, dVar));
            }
        });
    }

    @Override // s2.InterfaceC1536a
    public void c(InterfaceC1536a.b bVar) {
        t(bVar.a(), bVar.b());
    }

    @Override // w2.C1617j.c
    public void g(C1616i c1616i, C1617j.d dVar) {
        String str = c1616i.f11879a;
        str.getClass();
        switch (str) {
            case "execute":
                A(c1616i, dVar);
                break;
            case "closeDatabase":
                v(c1616i, dVar);
                break;
            case "options":
                E(c1616i, dVar);
                break;
            case "insert":
                C(c1616i, dVar);
                break;
            case "update":
                I(c1616i, dVar);
                break;
            case "androidSetLocale":
                H(c1616i, dVar);
                break;
            case "deleteDatabase":
                z(c1616i, dVar);
                break;
            case "debugMode":
                y(c1616i, dVar);
                break;
            case "openDatabase":
                D(c1616i, dVar);
                break;
            case "batch":
                u(c1616i, dVar);
                break;
            case "debug":
                x(c1616i, dVar);
                break;
            case "query":
                F(c1616i, dVar);
                break;
            case "databaseExists":
                w(c1616i, dVar);
                break;
            case "queryCursorNext":
                G(c1616i, dVar);
                break;
            case "getPlatformVersion":
                dVar.a("Android " + Build.VERSION.RELEASE);
                break;
            case "getDatabasesPath":
                B(c1616i, dVar);
                break;
            default:
                dVar.c();
                break;
        }
    }

    public final void n(k kVar) {
        try {
            if (s.b(kVar.f7683d)) {
                Log.d("Sqflite", kVar.A() + "closing database ");
            }
            kVar.k();
        } catch (Exception e4) {
            Log.e("Sqflite", "error " + e4 + " while closing database " + f7653m);
        }
        synchronized (f7647g) {
            try {
                if (f7646f.isEmpty() && f7654n != null) {
                    if (s.b(kVar.f7683d)) {
                        Log.d("Sqflite", kVar.A() + "stopping thread");
                    }
                    f7654n.c();
                    f7654n = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final k o(int i4) {
        return (k) f7646f.get(Integer.valueOf(i4));
    }

    public final k p(C1616i c1616i, C1617j.d dVar) {
        int iIntValue = ((Integer) c1616i.a("id")).intValue();
        k kVarO = o(iIntValue);
        if (kVarO != null) {
            return kVarO;
        }
        dVar.b("sqlite_error", "database_closed " + iIntValue, null);
        return null;
    }

    @Override // s2.InterfaceC1536a
    public void r(InterfaceC1536a.b bVar) {
        this.f7655c = null;
        this.f7656d.e(null);
        this.f7656d = null;
    }

    public final void t(Context context, InterfaceC1609b interfaceC1609b) {
        this.f7655c = context;
        C1617j c1617j = new C1617j(interfaceC1609b, "com.tekartik.sqflite", C1622o.f11894b, interfaceC1609b.b());
        this.f7656d = c1617j;
        c1617j.e(this);
    }

    public final void u(final C1616i c1616i, final C1617j.d dVar) {
        final k kVarP = p(c1616i, dVar);
        if (kVarP == null) {
            return;
        }
        f7654n.e(kVarP, new Runnable() { // from class: i2.C
            @Override // java.lang.Runnable
            public final void run() {
                kVarP.h(c1616i, dVar);
            }
        });
    }

    public final void v(C1616i c1616i, C1617j.d dVar) {
        Integer num = (Integer) c1616i.a("id");
        int iIntValue = num.intValue();
        k kVarP = p(c1616i, dVar);
        if (kVarP == null) {
            return;
        }
        if (s.b(kVarP.f7683d)) {
            Log.d("Sqflite", kVarP.A() + "closing " + iIntValue + " " + kVarP.f7681b);
        }
        String str = kVarP.f7681b;
        synchronized (f7647g) {
            try {
                f7646f.remove(num);
                if (kVarP.f7680a) {
                    f7645e.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f7654n.e(kVarP, new a(kVarP, dVar));
    }

    public final void w(C1616i c1616i, C1617j.d dVar) {
        dVar.a(Boolean.valueOf(k.x((String) c1616i.a("path"))));
    }

    public final void x(C1616i c1616i, C1617j.d dVar) {
        String str = (String) c1616i.a("cmd");
        HashMap map = new HashMap();
        if ("get".equals(str)) {
            int i4 = f7649i;
            if (i4 > 0) {
                map.put("logLevel", Integer.valueOf(i4));
            }
            Map map2 = f7646f;
            if (!map2.isEmpty()) {
                HashMap map3 = new HashMap();
                for (Map.Entry entry : map2.entrySet()) {
                    k kVar = (k) entry.getValue();
                    HashMap map4 = new HashMap();
                    map4.put("path", kVar.f7681b);
                    map4.put("singleInstance", Boolean.valueOf(kVar.f7680a));
                    int i5 = kVar.f7683d;
                    if (i5 > 0) {
                        map4.put("logLevel", Integer.valueOf(i5));
                    }
                    map3.put(((Integer) entry.getKey()).toString(), map4);
                }
                map.put("databases", map3);
            }
        }
        dVar.a(map);
    }

    public final void y(C1616i c1616i, C1617j.d dVar) {
        AbstractC1110a.f8571a = Boolean.TRUE.equals(c1616i.b());
        AbstractC1110a.f8573c = AbstractC1110a.f8572b && AbstractC1110a.f8571a;
        if (!AbstractC1110a.f8571a) {
            f7649i = 0;
        } else if (AbstractC1110a.f8573c) {
            f7649i = 2;
        } else if (AbstractC1110a.f8571a) {
            f7649i = 1;
        }
        dVar.a(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(w2.C1616i r9, w2.C1617j.d r10) {
        /*
            r8 = this;
            java.lang.String r0 = "path"
            java.lang.Object r9 = r9.a(r0)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r0 = i2.C1048D.f7647g
            monitor-enter(r0)
            int r1 = i2.C1048D.f7649i     // Catch: java.lang.Throwable -> L38
            boolean r1 = i2.s.c(r1)     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L3a
            java.lang.String r1 = "Sqflite"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38
            r2.<init>()     // Catch: java.lang.Throwable -> L38
            java.lang.String r3 = "Look for "
            r2.append(r3)     // Catch: java.lang.Throwable -> L38
            r2.append(r9)     // Catch: java.lang.Throwable -> L38
            java.lang.String r3 = " in "
            r2.append(r3)     // Catch: java.lang.Throwable -> L38
            java.util.Map r3 = i2.C1048D.f7645e     // Catch: java.lang.Throwable -> L38
            java.util.Set r3 = r3.keySet()     // Catch: java.lang.Throwable -> L38
            r2.append(r3)     // Catch: java.lang.Throwable -> L38
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L38
            android.util.Log.d(r1, r2)     // Catch: java.lang.Throwable -> L38
            goto L3a
        L38:
            r9 = move-exception
            goto Lab
        L3a:
            java.util.Map r1 = i2.C1048D.f7645e     // Catch: java.lang.Throwable -> L38
            java.lang.Object r2 = r1.get(r9)     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> L38
            if (r2 == 0) goto L98
            java.util.Map r3 = i2.C1048D.f7646f     // Catch: java.lang.Throwable -> L38
            java.lang.Object r4 = r3.get(r2)     // Catch: java.lang.Throwable -> L38
            i2.k r4 = (i2.k) r4     // Catch: java.lang.Throwable -> L38
            if (r4 == 0) goto L98
            android.database.sqlite.SQLiteDatabase r5 = r4.f7688i     // Catch: java.lang.Throwable -> L38
            boolean r5 = r5.isOpen()     // Catch: java.lang.Throwable -> L38
            if (r5 == 0) goto L98
            int r5 = i2.C1048D.f7649i     // Catch: java.lang.Throwable -> L38
            boolean r5 = i2.s.c(r5)     // Catch: java.lang.Throwable -> L38
            if (r5 == 0) goto L91
            java.lang.String r5 = "Sqflite"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38
            r6.<init>()     // Catch: java.lang.Throwable -> L38
            java.lang.String r7 = r4.A()     // Catch: java.lang.Throwable -> L38
            r6.append(r7)     // Catch: java.lang.Throwable -> L38
            java.lang.String r7 = "found single instance "
            r6.append(r7)     // Catch: java.lang.Throwable -> L38
            boolean r7 = r4.F()     // Catch: java.lang.Throwable -> L38
            if (r7 == 0) goto L7a
            java.lang.String r7 = "(in transaction) "
            goto L7c
        L7a:
            java.lang.String r7 = ""
        L7c:
            r6.append(r7)     // Catch: java.lang.Throwable -> L38
            r6.append(r2)     // Catch: java.lang.Throwable -> L38
            java.lang.String r7 = " "
            r6.append(r7)     // Catch: java.lang.Throwable -> L38
            r6.append(r9)     // Catch: java.lang.Throwable -> L38
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L38
            android.util.Log.d(r5, r6)     // Catch: java.lang.Throwable -> L38
        L91:
            r3.remove(r2)     // Catch: java.lang.Throwable -> L38
            r1.remove(r9)     // Catch: java.lang.Throwable -> L38
            goto L99
        L98:
            r4 = 0
        L99:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            i2.D$b r0 = new i2.D$b
            r0.<init>(r4, r9, r10)
            i2.p r9 = i2.C1048D.f7654n
            if (r9 == 0) goto La7
            r9.e(r4, r0)
            return
        La7:
            r0.run()
            return
        Lab:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.C1048D.z(w2.i, w2.j$d):void");
    }
}
