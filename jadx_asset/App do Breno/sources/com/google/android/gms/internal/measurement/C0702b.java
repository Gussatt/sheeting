package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0702b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p1.k f6650d = p1.k.v("_syn", "_err", "_el");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f6651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f6653c;

    public C0702b(String str, long j4, Map map) {
        this.f6651a = str;
        this.f6652b = j4;
        HashMap map2 = new HashMap();
        this.f6653c = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    public static Object d(String str, Object obj, Object obj2) {
        if (f6650d.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            if (!(obj instanceof String) && obj != null) {
                return obj;
            }
        } else if (!(obj instanceof Double)) {
            if (obj instanceof Long) {
                return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
            }
            if (obj instanceof String) {
                return obj2.toString();
            }
        }
        return obj2;
    }

    public final long a() {
        return this.f6652b;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0702b clone() {
        return new C0702b(this.f6651a, this.f6652b, new HashMap(this.f6653c));
    }

    public final Object c(String str) {
        Map map = this.f6653c;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        return null;
    }

    public final String e() {
        return this.f6651a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0702b)) {
            return false;
        }
        C0702b c0702b = (C0702b) obj;
        if (this.f6652b == c0702b.f6652b && this.f6651a.equals(c0702b.f6651a)) {
            return this.f6653c.equals(c0702b.f6653c);
        }
        return false;
    }

    public final Map f() {
        return this.f6653c;
    }

    public final void g(String str) {
        this.f6651a = str;
    }

    public final void h(String str, Object obj) {
        if (obj == null) {
            this.f6653c.remove(str);
        } else {
            Map map = this.f6653c;
            map.put(str, d(str, map.get(str), obj));
        }
    }

    public final int hashCode() {
        int iHashCode = this.f6651a.hashCode() * 31;
        long j4 = this.f6652b;
        return ((iHashCode + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.f6653c.hashCode();
    }

    public final String toString() {
        return "Event{name='" + this.f6651a + "', timestamp=" + this.f6652b + ", params=" + this.f6653c.toString() + "}";
    }
}
