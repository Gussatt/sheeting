package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.n5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0813n5 extends LinkedHashMap {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C0813n5 f6899n;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f6900m;

    static {
        C0813n5 c0813n5 = new C0813n5();
        f6899n = c0813n5;
        c0813n5.f6900m = false;
    }

    public C0813n5() {
        this.f6900m = true;
    }

    public static C0813n5 a() {
        return f6899n;
    }

    public static int i(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof X4) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        Charset charset = AbstractC0717c5.f6667a;
        int length = bArr.length;
        int iB = AbstractC0717c5.b(length, bArr, 0, length);
        if (iB == 0) {
            return 1;
        }
        return iB;
    }

    public final C0813n5 b() {
        return isEmpty() ? new C0813n5() : new C0813n5(this);
    }

    public final void c() {
        this.f6900m = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        k();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    public final void g(C0813n5 c0813n5) {
        k();
        if (c0813n5.isEmpty()) {
            return;
        }
        putAll(c0813n5);
    }

    public final boolean h() {
        return this.f6900m;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int i4 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            i4 += i(entry.getValue()) ^ i(entry.getKey());
        }
        return i4;
    }

    public final void k() {
        if (!this.f6900m) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        k();
        Charset charset = AbstractC0717c5.f6667a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        k();
        for (Object obj : map.keySet()) {
            Charset charset = AbstractC0717c5.f6667a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        k();
        return super.remove(obj);
    }

    public C0813n5(Map map) {
        super(map);
        this.f6900m = true;
    }
}
