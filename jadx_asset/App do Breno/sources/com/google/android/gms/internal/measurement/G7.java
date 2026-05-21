package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class G7 extends AbstractC0783k {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0890x3 f6352o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Map f6353p;

    public G7(C0890x3 c0890x3) {
        super("require");
        this.f6353p = new HashMap();
        this.f6352o = c0890x3;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0783k
    public final r a(U1 u12, List list) {
        r rVar;
        AbstractC0873v2.h("require", 1, list);
        String strG = u12.b((r) list.get(0)).g();
        Map map = this.f6353p;
        if (map.containsKey(strG)) {
            return (r) map.get(strG);
        }
        Map map2 = this.f6352o.f7008a;
        if (map2.containsKey(strG)) {
            try {
                rVar = (r) ((Callable) map2.get(strG)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(strG)));
            }
        } else {
            rVar = r.f6932b;
        }
        if (rVar instanceof AbstractC0783k) {
            this.f6353p.put(strG, (AbstractC0783k) rVar);
        }
        return rVar;
    }
}
