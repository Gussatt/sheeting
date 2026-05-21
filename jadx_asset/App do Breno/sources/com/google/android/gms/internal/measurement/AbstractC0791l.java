package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0791l {
    public static r a(InterfaceC0807n interfaceC0807n, r rVar, U1 u12, List list) {
        if (interfaceC0807n.h(rVar.g())) {
            r rVarO = interfaceC0807n.o(rVar.g());
            if (rVarO instanceof AbstractC0783k) {
                return ((AbstractC0783k) rVarO).a(u12, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", rVar.g()));
        }
        if (!"hasOwnProperty".equals(rVar.g())) {
            throw new IllegalArgumentException(String.format("Object has no function %s", rVar.g()));
        }
        AbstractC0873v2.h("hasOwnProperty", 1, list);
        return interfaceC0807n.h(u12.b((r) list.get(0)).g()) ? r.f6937g : r.f6938h;
    }

    public static Iterator b(Map map) {
        return new C0799m(map.keySet().iterator());
    }
}
