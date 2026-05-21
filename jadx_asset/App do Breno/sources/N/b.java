package N;

import L.r;
import X2.l;
import t3.AbstractC1552h;
import t3.J;

/* JADX INFO: loaded from: classes.dex */
public class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1552h f2768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J f2769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f2770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final N.a f2771d;

    public static final class a extends P2.d {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Object f2772p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Object f2773q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f2774r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f2776t;

        public a(N2.e eVar) {
            super(eVar);
        }

        @Override // P2.a
        public final Object q(Object obj) {
            this.f2774r = obj;
            this.f2776t |= Integer.MIN_VALUE;
            return b.j(b.this, this);
        }
    }

    public b(AbstractC1552h abstractC1552h, J j4, c cVar) {
        l.e(abstractC1552h, "fileSystem");
        l.e(j4, "path");
        l.e(cVar, "serializer");
        this.f2768a = abstractC1552h;
        this.f2769b = j4;
        this.f2770c = cVar;
        this.f2771d = new N.a(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0090 A[Catch: FileNotFoundException -> 0x008a, TryCatch #8 {FileNotFoundException -> 0x008a, blocks: (B:46:0x0090, B:47:0x0094, B:42:0x0086, B:39:0x0081), top: B:82:0x0081, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0094 A[Catch: FileNotFoundException -> 0x008a, TRY_LEAVE, TryCatch #8 {FileNotFoundException -> 0x008a, blocks: (B:46:0x0090, B:47:0x0094, B:42:0x0086, B:39:0x0081), top: B:82:0x0081, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0081 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object j(N.b r7, N2.e r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N.b.j(N.b, N2.e):java.lang.Object");
    }

    @Override // L.r
    public Object c(N2.e eVar) {
        return j(this, eVar);
    }

    @Override // L.InterfaceC0477b
    public void close() {
        this.f2771d.b(true);
    }

    public final void f() {
        if (this.f2771d.a()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
    }

    public final AbstractC1552h g() {
        return this.f2768a;
    }

    public final J h() {
        return this.f2769b;
    }

    public final c i() {
        return this.f2770c;
    }
}
