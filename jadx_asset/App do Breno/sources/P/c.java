package P;

import L2.B;
import L2.n;
import L2.u;
import P.f;
import W2.l;
import X2.m;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class c extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f2877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f2878b;

    public static final class a extends m implements l {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final a f2879n = new a();

        public a() {
            super(1);
        }

        @Override // W2.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence k(Map.Entry entry) {
            X2.l.e(entry, "entry");
            Object value = entry.getValue();
            return "  " + ((f.a) entry.getKey()).a() + " = " + (value instanceof byte[] ? L2.j.t((byte[]) value, ", ", "[", "]", 0, null, null, 56, null) : String.valueOf(entry.getValue()));
        }
    }

    public /* synthetic */ c(Map map, boolean z3, int i4, X2.g gVar) {
        this((i4 & 1) != 0 ? new LinkedHashMap() : map, (i4 & 2) != 0 ? true : z3);
    }

    @Override // P.f
    public Map a() {
        K2.i iVar;
        Set<Map.Entry> setEntrySet = this.f2877a.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(c3.e.a(B.a(n.m(setEntrySet, 10)), 16));
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                X2.l.d(bArrCopyOf, "copyOf(this, size)");
                iVar = new K2.i(key, bArrCopyOf);
            } else {
                iVar = new K2.i(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(iVar.c(), iVar.d());
        }
        return P.a.b(linkedHashMap);
    }

    @Override // P.f
    public Object b(f.a aVar) {
        X2.l.e(aVar, "key");
        Object obj = this.f2877a.get(aVar);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        X2.l.d(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    public final void e() {
        if (this.f2878b.a()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof P.c
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            P.c r6 = (P.c) r6
            java.util.Map r0 = r6.f2877a
            java.util.Map r2 = r5.f2877a
            r3 = 1
            if (r0 != r2) goto L10
            return r3
        L10:
            int r0 = r0.size()
            java.util.Map r2 = r5.f2877a
            int r2 = r2.size()
            if (r0 == r2) goto L1d
            return r1
        L1d:
            java.util.Map r6 = r6.f2877a
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L26
            return r3
        L26:
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L2e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L67
            java.lang.Object r0 = r6.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.util.Map r2 = r5.f2877a
            java.lang.Object r4 = r0.getKey()
            java.lang.Object r2 = r2.get(r4)
            if (r2 == 0) goto L63
            java.lang.Object r0 = r0.getValue()
            boolean r4 = r0 instanceof byte[]
            if (r4 == 0) goto L5e
            boolean r4 = r2 instanceof byte[]
            if (r4 == 0) goto L63
            byte[] r0 = (byte[]) r0
            byte[] r2 = (byte[]) r2
            boolean r0 = java.util.Arrays.equals(r0, r2)
            if (r0 == 0) goto L63
            r0 = r3
            goto L64
        L5e:
            boolean r0 = X2.l.a(r0, r2)
            goto L64
        L63:
            r0 = r1
        L64:
            if (r0 != 0) goto L2e
            return r1
        L67:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: P.c.equals(java.lang.Object):boolean");
    }

    public final void f() {
        e();
        this.f2877a.clear();
    }

    public final void g() {
        this.f2878b.b(true);
    }

    public final void h(f.b... bVarArr) {
        X2.l.e(bVarArr, "pairs");
        e();
        if (bVarArr.length <= 0) {
            return;
        }
        f.b bVar = bVarArr[0];
        throw null;
    }

    public int hashCode() {
        Iterator it = this.f2877a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final Object i(f.a aVar) {
        X2.l.e(aVar, "key");
        e();
        return this.f2877a.remove(aVar);
    }

    public final void j(f.a aVar, Object obj) {
        X2.l.e(aVar, "key");
        k(aVar, obj);
    }

    public final void k(f.a aVar, Object obj) {
        X2.l.e(aVar, "key");
        e();
        if (obj == null) {
            i(aVar);
            return;
        }
        if (obj instanceof Set) {
            this.f2877a.put(aVar, P.a.a((Set) obj));
            return;
        }
        if (!(obj instanceof byte[])) {
            this.f2877a.put(aVar, obj);
            return;
        }
        Map map = this.f2877a;
        byte[] bArr = (byte[]) obj;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        X2.l.d(bArrCopyOf, "copyOf(this, size)");
        map.put(aVar, bArrCopyOf);
    }

    public String toString() {
        return u.z(this.f2877a.entrySet(), ",\n", "{\n", "\n}", 0, null, a.f2879n, 24, null);
    }

    public c(Map map, boolean z3) {
        X2.l.e(map, "preferencesMap");
        this.f2877a = map;
        this.f2878b = new b(z3);
    }
}
