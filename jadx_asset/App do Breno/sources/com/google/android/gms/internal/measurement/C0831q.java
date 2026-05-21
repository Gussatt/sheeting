package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0831q extends AbstractC0783k implements InterfaceC0807n {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f6923o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f6924p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public U1 f6925q;

    public C0831q(C0831q c0831q) {
        super(c0831q.f6862m);
        ArrayList arrayList = new ArrayList(c0831q.f6923o.size());
        this.f6923o = arrayList;
        arrayList.addAll(c0831q.f6923o);
        ArrayList arrayList2 = new ArrayList(c0831q.f6924p.size());
        this.f6924p = arrayList2;
        arrayList2.addAll(c0831q.f6924p);
        this.f6925q = c0831q.f6925q;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0783k
    public final r a(U1 u12, List list) {
        U1 u1A = this.f6925q.a();
        int i4 = 0;
        while (true) {
            List list2 = this.f6923o;
            if (i4 >= list2.size()) {
                break;
            }
            if (i4 < list.size()) {
                u1A.e((String) list2.get(i4), u12.b((r) list.get(i4)));
            } else {
                u1A.e((String) list2.get(i4), r.f6932b);
            }
            i4++;
        }
        for (r rVar : this.f6924p) {
            r rVarB = u1A.b(rVar);
            if (rVarB instanceof C0846s) {
                rVarB = u1A.b(rVar);
            }
            if (rVarB instanceof C0756h) {
                return ((C0756h) rVarB).a();
            }
        }
        return r.f6932b;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0783k, com.google.android.gms.internal.measurement.r
    public final r d() {
        return new C0831q(this);
    }

    public C0831q(String str, List list, List list2, U1 u12) {
        super(str);
        this.f6923o = new ArrayList();
        this.f6925q = u12;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f6923o.add(((r) it.next()).g());
            }
        }
        this.f6924p = new ArrayList(list2);
    }
}
