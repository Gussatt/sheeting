package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0815o implements r, InterfaceC0807n {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Map f6903m = new HashMap();

    public final List a() {
        return new ArrayList(this.f6903m.keySet());
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r d() {
        C0815o c0815o = new C0815o();
        for (Map.Entry entry : this.f6903m.entrySet()) {
            if (entry.getValue() instanceof InterfaceC0807n) {
                c0815o.f6903m.put((String) entry.getKey(), (r) entry.getValue());
            } else {
                c0815o.f6903m.put((String) entry.getKey(), ((r) entry.getValue()).d());
            }
        }
        return c0815o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0815o) {
            return this.f6903m.equals(((C0815o) obj).f6903m);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Double f() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final String g() {
        return "[object Object]";
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0807n
    public final boolean h(String str) {
        return this.f6903m.containsKey(str);
    }

    public final int hashCode() {
        return this.f6903m.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Boolean i() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Iterator k() {
        return AbstractC0791l.b(this.f6903m);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public r l(String str, U1 u12, List list) {
        return "toString".equals(str) ? new C0870v(toString()) : AbstractC0791l.a(this, new C0870v(str), u12, list);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0807n
    public final r o(String str) {
        Map map = this.f6903m;
        return map.containsKey(str) ? (r) map.get(str) : r.f6932b;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0807n
    public final void p(String str, r rVar) {
        if (rVar == null) {
            this.f6903m.remove(str);
        } else {
            this.f6903m.put(str, rVar);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        Map map = this.f6903m;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb.append(String.format("%s: %s,", str, map.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }
}
