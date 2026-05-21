package k3;

import m3.F;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final F f10143a = new F("NONE");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final F f10144b = new F("PENDING");

    public static final o a(Object obj) {
        if (obj == null) {
            obj = l3.m.f10286a;
        }
        return new t(obj);
    }

    public static final d d(s sVar, N2.i iVar, int i4, j3.a aVar) {
        return (((i4 < 0 || i4 >= 2) && i4 != -2) || aVar != j3.a.DROP_OLDEST) ? r.a(sVar, iVar, i4, aVar) : sVar;
    }
}
