package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class D extends LinkedHashMap {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final D f4636n;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f4637m;

    static {
        D d4 = new D();
        f4636n = d4;
        d4.m();
    }

    public D() {
        this.f4637m = true;
    }

    public static int a(Map map) {
        int iB = 0;
        for (Map.Entry entry : map.entrySet()) {
            iB += b(entry.getValue()) ^ b(entry.getKey());
        }
        return iB;
    }

    public static int b(Object obj) {
        return obj instanceof byte[] ? AbstractC0598u.d((byte[]) obj) : obj.hashCode();
    }

    public static void c(Map map) {
        for (Object obj : map.keySet()) {
            AbstractC0598u.a(obj);
            AbstractC0598u.a(map.get(obj));
        }
    }

    public static D g() {
        return f4636n;
    }

    public static boolean i(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    public static boolean k(Map map, Map map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !i(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        h();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && k(this, (Map) obj);
    }

    public final void h() {
        if (!l()) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return a(this);
    }

    public boolean l() {
        return this.f4637m;
    }

    public void m() {
        this.f4637m = false;
    }

    public void n(D d4) {
        h();
        if (d4.isEmpty()) {
            return;
        }
        putAll(d4);
    }

    public D o() {
        return isEmpty() ? new D() : new D(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        h();
        AbstractC0598u.a(obj);
        AbstractC0598u.a(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        h();
        c(map);
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        h();
        return super.remove(obj);
    }

    public D(Map map) {
        super(map);
        this.f4637m = true;
    }
}
