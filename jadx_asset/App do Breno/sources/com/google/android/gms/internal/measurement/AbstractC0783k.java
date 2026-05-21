package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0783k implements r, InterfaceC0807n {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f6862m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Map f6863n = new HashMap();

    public AbstractC0783k(String str) {
        this.f6862m = str;
    }

    public abstract r a(U1 u12, List list);

    public final String b() {
        return this.f6862m;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public r d() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC0783k)) {
            return false;
        }
        AbstractC0783k abstractC0783k = (AbstractC0783k) obj;
        String str = this.f6862m;
        if (str != null) {
            return str.equals(abstractC0783k.f6862m);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Double f() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final String g() {
        return this.f6862m;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0807n
    public final boolean h(String str) {
        return this.f6863n.containsKey(str);
    }

    public final int hashCode() {
        String str = this.f6862m;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Boolean i() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Iterator k() {
        return AbstractC0791l.b(this.f6863n);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r l(String str, U1 u12, List list) {
        return "toString".equals(str) ? new C0870v(this.f6862m) : AbstractC0791l.a(this, new C0870v(str), u12, list);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0807n
    public final r o(String str) {
        Map map = this.f6863n;
        return map.containsKey(str) ? (r) map.get(str) : r.f6932b;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0807n
    public final void p(String str, r rVar) {
        if (rVar == null) {
            this.f6863n.remove(str);
        } else {
            this.f6863n.put(str, rVar);
        }
    }
}
