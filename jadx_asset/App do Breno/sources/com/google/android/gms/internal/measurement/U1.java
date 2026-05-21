package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class U1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U1 f6592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0902z f6593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f6594c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f6595d = new HashMap();

    public U1(U1 u12, C0902z c0902z) {
        this.f6592a = u12;
        this.f6593b = c0902z;
    }

    public final U1 a() {
        return new U1(this, this.f6593b);
    }

    public final r b(r rVar) {
        return this.f6593b.a(this, rVar);
    }

    public final r c(C0738f c0738f) {
        r rVarA = r.f6932b;
        Iterator itW = c0738f.w();
        while (itW.hasNext()) {
            rVarA = this.f6593b.a(this, c0738f.u(((Integer) itW.next()).intValue()));
            if (rVarA instanceof C0756h) {
                break;
            }
        }
        return rVarA;
    }

    public final r d(String str) {
        Map map = this.f6594c;
        if (map.containsKey(str)) {
            return (r) map.get(str);
        }
        U1 u12 = this.f6592a;
        if (u12 != null) {
            return u12.d(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", str));
    }

    public final void e(String str, r rVar) {
        if (this.f6595d.containsKey(str)) {
            return;
        }
        if (rVar == null) {
            this.f6594c.remove(str);
        } else {
            this.f6594c.put(str, rVar);
        }
    }

    public final void f(String str, r rVar) {
        e(str, rVar);
        this.f6595d.put(str, Boolean.TRUE);
    }

    public final void g(String str, r rVar) {
        U1 u12;
        Map map = this.f6594c;
        if (!map.containsKey(str) && (u12 = this.f6592a) != null && u12.h(str)) {
            u12.g(str, rVar);
        } else {
            if (this.f6595d.containsKey(str)) {
                return;
            }
            if (rVar == null) {
                map.remove(str);
            } else {
                map.put(str, rVar);
            }
        }
    }

    public final boolean h(String str) {
        if (this.f6594c.containsKey(str)) {
            return true;
        }
        U1 u12 = this.f6592a;
        if (u12 != null) {
            return u12.h(str);
        }
        return false;
    }
}
