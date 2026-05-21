package v2;

import o2.C1472a;
import w2.C1608a;
import w2.C1623p;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f11615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f11616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1608a f11618d;

    public enum a {
        DETACHED,
        RESUMED,
        INACTIVE,
        HIDDEN,
        PAUSED
    }

    public k(C1472a c1472a) {
        this(new C1608a(c1472a, "flutter/lifecycle", C1623p.f11897b));
    }

    public void a() {
        g(this.f11615a, true);
    }

    public void b() {
        g(a.DETACHED, this.f11617c);
    }

    public void c() {
        g(a.INACTIVE, this.f11617c);
    }

    public void d() {
        g(a.PAUSED, this.f11617c);
    }

    public void e() {
        g(a.RESUMED, this.f11617c);
    }

    public void f() {
        g(this.f11615a, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(v2.k.a r3, boolean r4) {
        /*
            r2 = this;
            v2.k$a r0 = r2.f11615a
            if (r0 != r3) goto L9
            boolean r1 = r2.f11617c
            if (r4 != r1) goto L9
            goto L35
        L9:
            if (r3 != 0) goto L10
            if (r0 != 0) goto L10
            r2.f11617c = r4
            return
        L10:
            int r0 = r3.ordinal()
            if (r0 == 0) goto L2c
            r1 = 1
            if (r0 == r1) goto L24
            r1 = 2
            if (r0 == r1) goto L2c
            r1 = 3
            if (r0 == r1) goto L2c
            r1 = 4
            if (r0 == r1) goto L2c
            r0 = 0
            goto L2d
        L24:
            if (r4 == 0) goto L29
            v2.k$a r0 = v2.k.a.RESUMED
            goto L2d
        L29:
            v2.k$a r0 = v2.k.a.INACTIVE
            goto L2d
        L2c:
            r0 = r3
        L2d:
            r2.f11615a = r3
            r2.f11617c = r4
            v2.k$a r3 = r2.f11616b
            if (r0 != r3) goto L36
        L35:
            return
        L36:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "AppLifecycleState."
            r3.append(r4)
            java.lang.String r4 = r0.name()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r1)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "Sending "
            r4.append(r1)
            r4.append(r3)
            java.lang.String r1 = " message."
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            java.lang.String r1 = "LifecycleChannel"
            l2.AbstractC1388b.f(r1, r4)
            w2.a r4 = r2.f11618d
            r4.c(r3)
            r2.f11616b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.k.g(v2.k$a, boolean):void");
    }

    public k(C1608a c1608a) {
        this.f11615a = null;
        this.f11616b = null;
        this.f11617c = true;
        this.f11618d = c1608a;
    }
}
