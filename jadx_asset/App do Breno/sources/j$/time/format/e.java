package j$.time.format;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f[] f8386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f8387b;

    e(ArrayList arrayList, boolean z3) {
        this((f[]) arrayList.toArray(new f[arrayList.size()]), z3);
    }

    e(f[] fVarArr, boolean z3) {
        this.f8386a = fVarArr;
        this.f8387b = z3;
    }

    public final e a() {
        return !this.f8387b ? this : new e(this.f8386a, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        r9.setLength(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
    
        return true;
     */
    @Override // j$.time.format.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean o(j$.time.format.p r8, java.lang.StringBuilder r9) {
        /*
            r7 = this;
            int r0 = r9.length()
            boolean r1 = r7.f8387b
            if (r1 == 0) goto Lb
            r8.g()
        Lb:
            j$.time.format.f[] r2 = r7.f8386a     // Catch: java.lang.Throwable -> L23
            int r3 = r2.length     // Catch: java.lang.Throwable -> L23
            r4 = 0
        Lf:
            r5 = 1
            if (r4 >= r3) goto L28
            r6 = r2[r4]     // Catch: java.lang.Throwable -> L23
            boolean r6 = r6.o(r8, r9)     // Catch: java.lang.Throwable -> L23
            if (r6 != 0) goto L25
            r9.setLength(r0)     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L2d
            r8.a()
            return r5
        L23:
            r9 = move-exception
            goto L2e
        L25:
            int r4 = r4 + 1
            goto Lf
        L28:
            if (r1 == 0) goto L2d
            r8.a()
        L2d:
            return r5
        L2e:
            if (r1 == 0) goto L33
            r8.a()
        L33:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.e.o(j$.time.format.p, java.lang.StringBuilder):boolean");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        f[] fVarArr = this.f8386a;
        if (fVarArr != null) {
            boolean z3 = this.f8387b;
            sb.append(z3 ? "[" : "(");
            for (f fVar : fVarArr) {
                sb.append(fVar);
            }
            sb.append(z3 ? "]" : ")");
        }
        return sb.toString();
    }
}
