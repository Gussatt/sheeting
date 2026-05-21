package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0738f implements Iterable, r, InterfaceC0807n {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final SortedMap f6705m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Map f6706n;

    public C0738f() {
        this.f6705m = new TreeMap();
        this.f6706n = new TreeMap();
    }

    public final void A(int i4) {
        SortedMap sortedMap = this.f6705m;
        int iIntValue = ((Integer) sortedMap.lastKey()).intValue();
        if (i4 > iIntValue || i4 < 0) {
            return;
        }
        sortedMap.remove(Integer.valueOf(i4));
        if (i4 == iIntValue) {
            int i5 = i4 - 1;
            Integer numValueOf = Integer.valueOf(i5);
            if (sortedMap.containsKey(numValueOf) || i5 < 0) {
                return;
            }
            sortedMap.put(numValueOf, r.f6932b);
            return;
        }
        while (true) {
            i4++;
            if (i4 > ((Integer) sortedMap.lastKey()).intValue()) {
                return;
            }
            Integer numValueOf2 = Integer.valueOf(i4);
            r rVar = (r) sortedMap.get(numValueOf2);
            if (rVar != null) {
                sortedMap.put(Integer.valueOf(i4 - 1), rVar);
                sortedMap.remove(numValueOf2);
            }
        }
    }

    public final void B(int i4, r rVar) {
        if (i4 > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i4 < 0) {
            throw new IndexOutOfBoundsException("Out of bounds index: " + i4);
        }
        if (rVar == null) {
            this.f6705m.remove(Integer.valueOf(i4));
        } else {
            this.f6705m.put(Integer.valueOf(i4), rVar);
        }
    }

    public final boolean C(int i4) {
        if (i4 >= 0) {
            SortedMap sortedMap = this.f6705m;
            if (i4 <= ((Integer) sortedMap.lastKey()).intValue()) {
                return sortedMap.containsKey(Integer.valueOf(i4));
            }
        }
        throw new IndexOutOfBoundsException("Out of bounds index: " + i4);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r d() {
        C0738f c0738f = new C0738f();
        for (Map.Entry entry : this.f6705m.entrySet()) {
            if (entry.getValue() instanceof InterfaceC0807n) {
                c0738f.f6705m.put((Integer) entry.getKey(), (r) entry.getValue());
            } else {
                c0738f.f6705m.put((Integer) entry.getKey(), ((r) entry.getValue()).d());
            }
        }
        return c0738f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0738f)) {
            return false;
        }
        C0738f c0738f = (C0738f) obj;
        if (t() != c0738f.t()) {
            return false;
        }
        SortedMap sortedMap = this.f6705m;
        if (sortedMap.isEmpty()) {
            return c0738f.f6705m.isEmpty();
        }
        for (int iIntValue = ((Integer) sortedMap.firstKey()).intValue(); iIntValue <= ((Integer) sortedMap.lastKey()).intValue(); iIntValue++) {
            if (!u(iIntValue).equals(c0738f.u(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Double f() {
        SortedMap sortedMap = this.f6705m;
        return sortedMap.size() == 1 ? u(0).f() : sortedMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final String g() {
        return v(",");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0807n
    public final boolean h(String str) {
        return "length".equals(str) || this.f6706n.containsKey(str);
    }

    public final int hashCode() {
        return this.f6705m.hashCode() * 31;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Boolean i() {
        return Boolean.TRUE;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0729e(this);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Iterator k() {
        return new C0720d(this, this.f6705m.keySet().iterator(), this.f6706n.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r l(String str, U1 u12, List list) {
        return ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) ? E.a(str, this, u12, list) : AbstractC0791l.a(this, new C0870v(str), u12, list);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0807n
    public final r o(String str) {
        r rVar;
        return "length".equals(str) ? new C0774j(Double.valueOf(t())) : (!h(str) || (rVar = (r) this.f6706n.get(str)) == null) ? r.f6932b : rVar;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0807n
    public final void p(String str, r rVar) {
        if (rVar == null) {
            this.f6706n.remove(str);
        } else {
            this.f6706n.put(str, rVar);
        }
    }

    public final int s() {
        return this.f6705m.size();
    }

    public final int t() {
        SortedMap sortedMap = this.f6705m;
        if (sortedMap.isEmpty()) {
            return 0;
        }
        return ((Integer) sortedMap.lastKey()).intValue() + 1;
    }

    public final String toString() {
        return v(",");
    }

    public final r u(int i4) {
        r rVar;
        if (i4 < t()) {
            return (!C(i4) || (rVar = (r) this.f6705m.get(Integer.valueOf(i4))) == null) ? r.f6932b : rVar;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final String v(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (!this.f6705m.isEmpty()) {
            int i4 = 0;
            while (true) {
                str2 = str == null ? "" : str;
                if (i4 >= t()) {
                    break;
                }
                r rVarU = u(i4);
                sb.append(str2);
                if (!(rVarU instanceof C0878w) && !(rVarU instanceof C0823p)) {
                    sb.append(rVarU.g());
                }
                i4++;
            }
            sb.delete(0, str2.length());
        }
        return sb.toString();
    }

    public final Iterator w() {
        return this.f6705m.keySet().iterator();
    }

    public final List x() {
        ArrayList arrayList = new ArrayList(t());
        for (int i4 = 0; i4 < t(); i4++) {
            arrayList.add(u(i4));
        }
        return arrayList;
    }

    public final void y() {
        this.f6705m.clear();
    }

    public final void z(int i4, r rVar) {
        if (i4 < 0) {
            throw new IllegalArgumentException("Invalid value index: " + i4);
        }
        if (i4 >= t()) {
            B(i4, rVar);
            return;
        }
        SortedMap sortedMap = this.f6705m;
        for (int iIntValue = ((Integer) sortedMap.lastKey()).intValue(); iIntValue >= i4; iIntValue--) {
            Integer numValueOf = Integer.valueOf(iIntValue);
            r rVar2 = (r) sortedMap.get(numValueOf);
            if (rVar2 != null) {
                B(iIntValue + 1, rVar2);
                sortedMap.remove(numValueOf);
            }
        }
        B(i4, rVar);
    }

    public C0738f(List list) {
        this();
        if (list != null) {
            for (int i4 = 0; i4 < list.size(); i4++) {
                B(i4, (r) list.get(i4));
            }
        }
    }
}
