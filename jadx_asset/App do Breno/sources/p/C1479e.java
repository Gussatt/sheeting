package p;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: p.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1479e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f10875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10879e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10880f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f10881g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f10882h;

    public C1479e(int i4) {
        if (i4 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f10877c = i4;
        this.f10875a = new LinkedHashMap(0, 0.75f, true);
    }

    public Object a(Object obj) {
        return null;
    }

    public final Object c(Object obj) {
        Object objPut;
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                Object obj2 = this.f10875a.get(obj);
                if (obj2 != null) {
                    this.f10881g++;
                    return obj2;
                }
                this.f10882h++;
                Object objA = a(obj);
                if (objA == null) {
                    return null;
                }
                synchronized (this) {
                    try {
                        this.f10879e++;
                        objPut = this.f10875a.put(obj, objA);
                        if (objPut != null) {
                            this.f10875a.put(obj, objPut);
                        } else {
                            this.f10876b += f(obj, objA);
                        }
                    } finally {
                    }
                }
                if (objPut != null) {
                    b(false, obj, objA, objPut);
                    return objPut;
                }
                i(this.f10877c);
                return objA;
            } finally {
            }
        }
    }

    public final Object d(Object obj, Object obj2) {
        Object objPut;
        if (obj == null || obj2 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            try {
                this.f10878d++;
                this.f10876b += f(obj, obj2);
                objPut = this.f10875a.put(obj, obj2);
                if (objPut != null) {
                    this.f10876b -= f(obj, objPut);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (objPut != null) {
            b(false, obj, objPut, obj2);
        }
        i(this.f10877c);
        return objPut;
    }

    public final Object e(Object obj) {
        Object objRemove;
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                objRemove = this.f10875a.remove(obj);
                if (objRemove != null) {
                    this.f10876b -= f(obj, objRemove);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (objRemove != null) {
            b(false, obj, objRemove, null);
        }
        return objRemove;
    }

    public final int f(Object obj, Object obj2) {
        int iG = g(obj, obj2);
        if (iG >= 0) {
            return iG;
        }
        throw new IllegalStateException("Negative size: " + obj + "=" + obj2);
    }

    public int g(Object obj, Object obj2) {
        return 1;
    }

    public final synchronized Map h() {
        return new LinkedHashMap(this.f10875a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(int r5) {
        /*
            r4 = this;
        L0:
            monitor-enter(r4)
            int r0 = r4.f10876b     // Catch: java.lang.Throwable -> L12
            if (r0 < 0) goto L55
            java.util.LinkedHashMap r0 = r4.f10875a     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            int r0 = r4.f10876b     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L55
            goto L14
        L12:
            r5 = move-exception
            goto L74
        L14:
            int r0 = r4.f10876b     // Catch: java.lang.Throwable -> L12
            if (r0 <= r5) goto L53
            java.util.LinkedHashMap r0 = r4.f10875a     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L21
            goto L53
        L21:
            java.util.LinkedHashMap r0 = r4.f10875a     // Catch: java.lang.Throwable -> L12
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L12
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L12
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L12
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L12
            java.util.LinkedHashMap r2 = r4.f10875a     // Catch: java.lang.Throwable -> L12
            r2.remove(r1)     // Catch: java.lang.Throwable -> L12
            int r2 = r4.f10876b     // Catch: java.lang.Throwable -> L12
            int r3 = r4.f(r1, r0)     // Catch: java.lang.Throwable -> L12
            int r2 = r2 - r3
            r4.f10876b = r2     // Catch: java.lang.Throwable -> L12
            int r2 = r4.f10880f     // Catch: java.lang.Throwable -> L12
            r3 = 1
            int r2 = r2 + r3
            r4.f10880f = r2     // Catch: java.lang.Throwable -> L12
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L12
            r2 = 0
            r4.b(r3, r1, r0, r2)
            goto L0
        L53:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L12
            return
        L55:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L12
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
            r0.<init>()     // Catch: java.lang.Throwable -> L12
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L12
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L12
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L12
            throw r5     // Catch: java.lang.Throwable -> L12
        L74:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L12
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p.C1479e.i(int):void");
    }

    public final synchronized String toString() {
        int i4;
        int i5;
        try {
            i4 = this.f10881g;
            i5 = this.f10882h + i4;
        } catch (Throwable th) {
            throw th;
        }
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f10877c), Integer.valueOf(this.f10881g), Integer.valueOf(this.f10882h), Integer.valueOf(i5 != 0 ? (i4 * 100) / i5 : 0));
    }

    public void b(boolean z3, Object obj, Object obj2, Object obj3) {
    }
}
