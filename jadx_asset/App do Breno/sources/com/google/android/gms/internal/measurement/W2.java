package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class W2 {
    public static r a(C0882w3 c0882w3) {
        if (c0882w3 == null) {
            return r.f6932b;
        }
        int iO = c0882w3.O() - 1;
        if (iO == 1) {
            return c0882w3.N() ? new C0870v(c0882w3.I()) : r.f6939i;
        }
        if (iO == 2) {
            return c0882w3.M() ? new C0774j(Double.valueOf(c0882w3.F())) : new C0774j(null);
        }
        if (iO == 3) {
            return c0882w3.L() ? new C0747g(Boolean.valueOf(c0882w3.K())) : new C0747g(null);
        }
        if (iO != 4) {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
        List listJ = c0882w3.J();
        ArrayList arrayList = new ArrayList();
        Iterator it = listJ.iterator();
        while (it.hasNext()) {
            arrayList.add(a((C0882w3) it.next()));
        }
        return new C0846s(c0882w3.H(), arrayList);
    }

    public static r b(Object obj) {
        if (obj == null) {
            return r.f6933c;
        }
        if (obj instanceof String) {
            return new C0870v((String) obj);
        }
        if (obj instanceof Double) {
            return new C0774j((Double) obj);
        }
        if (obj instanceof Long) {
            return new C0774j(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C0774j(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C0747g((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            C0738f c0738f = new C0738f();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c0738f.B(c0738f.t(), b(it.next()));
            }
            return c0738f;
        }
        C0815o c0815o = new C0815o();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            r rVarB = b(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                c0815o.p((String) string, rVarB);
            }
        }
        return c0815o;
    }
}
