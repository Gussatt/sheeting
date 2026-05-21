package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0902z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f7022a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f7023b = new M();

    public C0902z() {
        b(new C0886x());
        b(new A());
        b(new B());
        b(new F());
        b(new K());
        b(new L());
        b(new N());
    }

    public final r a(U1 u12, r rVar) {
        AbstractC0873v2.c(u12);
        if (!(rVar instanceof C0846s)) {
            return rVar;
        }
        C0846s c0846s = (C0846s) rVar;
        ArrayList arrayListB = c0846s.b();
        String strA = c0846s.a();
        Map map = this.f7022a;
        return (map.containsKey(strA) ? (AbstractC0894y) map.get(strA) : this.f7023b).a(strA, u12, arrayListB);
    }

    public final void b(AbstractC0894y abstractC0894y) {
        Iterator it = abstractC0894y.f7016a.iterator();
        while (it.hasNext()) {
            this.f7022a.put(((O) it.next()).f().toString(), abstractC0894y);
        }
    }
}
