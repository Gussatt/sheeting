package m;

import java.util.HashMap;
import java.util.Map;
import m.C1390b;

/* JADX INFO: renamed from: m.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1389a extends C1390b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final HashMap f10307q = new HashMap();

    public boolean contains(Object obj) {
        return this.f10307q.containsKey(obj);
    }

    @Override // m.C1390b
    public C1390b.c g(Object obj) {
        return (C1390b.c) this.f10307q.get(obj);
    }

    @Override // m.C1390b
    public Object l(Object obj, Object obj2) {
        C1390b.c cVarG = g(obj);
        if (cVarG != null) {
            return cVarG.f10313n;
        }
        this.f10307q.put(obj, k(obj, obj2));
        return null;
    }

    @Override // m.C1390b
    public Object o(Object obj) {
        Object objO = super.o(obj);
        this.f10307q.remove(obj);
        return objO;
    }

    public Map.Entry p(Object obj) {
        if (contains(obj)) {
            return ((C1390b.c) this.f10307q.get(obj)).f10315p;
        }
        return null;
    }
}
