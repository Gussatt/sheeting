package k3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m3.F;

/* JADX INFO: loaded from: classes.dex */
public final class t extends l3.b implements o, d, l3.k {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f10133q = AtomicReferenceFieldUpdater.newUpdater(t.class, Object.class, "_state");
    private volatile Object _state;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f10134p;

    public static final class a extends P2.d {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Object f10135p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Object f10136q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f10137r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f10138s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f10139t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f10140u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f10142w;

        public a(N2.e eVar) {
            super(eVar);
        }

        @Override // P2.a
        public final Object q(Object obj) {
            this.f10140u = obj;
            this.f10142w |= Integer.MIN_VALUE;
            return t.this.b(null, this);
        }
    }

    public t(Object obj) {
        this._state = obj;
    }

    @Override // k3.e
    public Object a(Object obj, N2.e eVar) {
        setValue(obj);
        return K2.p.f2516a;
    }

    /* JADX WARN: Path cross not found for [B:29:0x008f, B:45:0x00c3], limit reached: 48 */
    /* JADX WARN: Path cross not found for [B:33:0x009c, B:35:0x00a2], limit reached: 48 */
    /* JADX WARN: Path cross not found for [B:35:0x00a2, B:33:0x009c], limit reached: 48 */
    /* JADX WARN: Path cross not found for [B:35:0x00a2, B:43:0x00bd], limit reached: 48 */
    /* JADX WARN: Path cross not found for [B:45:0x00c3, B:29:0x008f], limit reached: 48 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0097 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003e, B:29:0x008f, B:31:0x0097, B:33:0x009c, B:43:0x00bd, B:45:0x00c3, B:35:0x00a2, B:39:0x00a9, B:22:0x005f, B:25:0x0071, B:28:0x0080), top: B:50:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003e, B:29:0x008f, B:31:0x0097, B:33:0x009c, B:43:0x00bd, B:45:0x00c3, B:35:0x00a2, B:39:0x00a9, B:22:0x005f, B:25:0x0071, B:28:0x0080), top: B:50:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c3 A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003e, B:29:0x008f, B:31:0x0097, B:33:0x009c, B:43:0x00bd, B:45:0x00c3, B:35:0x00a2, B:39:0x00a9, B:22:0x005f, B:25:0x0071, B:28:0x0080), top: B:50:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00c1 -> B:29:0x008f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00d3 -> B:29:0x008f). Please report as a decompilation issue!!! */
    @Override // k3.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(k3.e r11, N2.e r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.t.b(k3.e, N2.e):java.lang.Object");
    }

    @Override // k3.o
    public boolean c(Object obj, Object obj2) {
        if (obj == null) {
            obj = l3.m.f10286a;
        }
        if (obj2 == null) {
            obj2 = l3.m.f10286a;
        }
        return l(obj, obj2);
    }

    @Override // l3.k
    public d d(N2.i iVar, int i4, j3.a aVar) {
        return u.d(this, iVar, i4, aVar);
    }

    @Override // k3.o
    public Object getValue() {
        F f4 = l3.m.f10286a;
        Object obj = f10133q.get(this);
        if (obj == f4) {
            return null;
        }
        return obj;
    }

    @Override // l3.b
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public v f() {
        return new v();
    }

    @Override // l3.b
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public v[] g(int i4) {
        return new v[i4];
    }

    public final boolean l(Object obj, Object obj2) {
        int i4;
        l3.d[] dVarArrI;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10133q;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !X2.l.a(obj3, obj)) {
                return false;
            }
            if (X2.l.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i5 = this.f10134p;
            if ((i5 & 1) != 0) {
                this.f10134p = i5 + 2;
                return true;
            }
            int i6 = i5 + 1;
            this.f10134p = i6;
            l3.d[] dVarArrI2 = i();
            K2.p pVar = K2.p.f2516a;
            while (true) {
                v[] vVarArr = (v[]) dVarArrI2;
                if (vVarArr != null) {
                    for (v vVar : vVarArr) {
                        if (vVar != null) {
                            vVar.g();
                        }
                    }
                }
                synchronized (this) {
                    i4 = this.f10134p;
                    if (i4 == i6) {
                        this.f10134p = i6 + 1;
                        return true;
                    }
                    dVarArrI = i();
                    K2.p pVar2 = K2.p.f2516a;
                }
                dVarArrI2 = dVarArrI;
                i6 = i4;
            }
        }
    }

    @Override // k3.o
    public void setValue(Object obj) {
        if (obj == null) {
            obj = l3.m.f10286a;
        }
        l(null, obj);
    }
}
