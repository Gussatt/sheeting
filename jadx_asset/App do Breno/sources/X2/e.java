package X2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e implements d3.b, d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f3975b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f3976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f3977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashMap f3978e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashMap f3979f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Map f3980g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f3981a;

    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        public final String a(Class cls) {
            String str;
            l.e(cls, "jClass");
            String str2 = null;
            if (cls.isAnonymousClass() || cls.isLocalClass()) {
                return null;
            }
            if (!cls.isArray()) {
                String str3 = (String) e.f3979f.get(cls.getName());
                return str3 == null ? cls.getCanonicalName() : str3;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) e.f3979f.get(componentType.getName())) != null) {
                str2 = str + "Array";
            }
            return str2 == null ? "kotlin.Array" : str2;
        }

        public final String b(Class cls) {
            String str;
            l.e(cls, "jClass");
            String str2 = null;
            if (cls.isAnonymousClass()) {
                return null;
            }
            if (!cls.isLocalClass()) {
                if (!cls.isArray()) {
                    String str3 = (String) e.f3980g.get(cls.getName());
                    return str3 == null ? cls.getSimpleName() : str3;
                }
                Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive() && (str = (String) e.f3980g.get(componentType.getName())) != null) {
                    str2 = str + "Array";
                }
                return str2 == null ? "Array" : str2;
            }
            String simpleName = cls.getSimpleName();
            Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                l.b(simpleName);
                String strU = f3.q.U(simpleName, enclosingMethod.getName() + '$', null, 2, null);
                if (strU != null) {
                    return strU;
                }
            }
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor == null) {
                l.b(simpleName);
                return f3.q.T(simpleName, '$', null, 2, null);
            }
            l.b(simpleName);
            return f3.q.U(simpleName, enclosingConstructor.getName() + '$', null, 2, null);
        }

        public final boolean c(Object obj, Class cls) {
            l.e(cls, "jClass");
            Map map = e.f3976c;
            l.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) map.get(cls);
            if (num != null) {
                return C.e(obj, num.intValue());
            }
            if (cls.isPrimitive()) {
                cls = V2.a.b(V2.a.c(cls));
            }
            return cls.isInstance(obj);
        }

        public a() {
        }
    }

    static {
        List listI = L2.m.i(W2.a.class, W2.l.class, W2.p.class, W2.q.class, W2.r.class, W2.s.class, W2.t.class, W2.u.class, W2.v.class, W2.w.class, W2.b.class, W2.c.class, W2.d.class, W2.e.class, W2.f.class, W2.g.class, W2.h.class, W2.i.class, W2.j.class, W2.k.class, W2.m.class, W2.n.class, W2.o.class);
        ArrayList arrayList = new ArrayList(L2.n.m(listI, 10));
        int i4 = 0;
        for (Object obj : listI) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                L2.m.l();
            }
            arrayList.add(K2.m.a((Class) obj, Integer.valueOf(i4)));
            i4 = i5;
        }
        f3976c = L2.C.j(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        f3977d = map;
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        f3978e = map2;
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        l.d(collectionValues, "<get-values>(...)");
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            l.b(str);
            sb.append(f3.q.W(str, '.', null, 2, null));
            sb.append("CompanionObject");
            K2.i iVarA = K2.m.a(sb.toString(), str + ".Companion");
            map3.put(iVarA.c(), iVarA.d());
        }
        for (Map.Entry entry : f3976c.entrySet()) {
            map3.put(((Class) entry.getKey()).getName(), "kotlin.Function" + ((Number) entry.getValue()).intValue());
        }
        f3979f = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(L2.B.a(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            l.b(str2);
            linkedHashMap.put(key, f3.q.W(str2, '.', null, 2, null));
        }
        f3980g = linkedHashMap;
    }

    public e(Class cls) {
        l.e(cls, "jClass");
        this.f3981a = cls;
    }

    @Override // d3.b
    public String a() {
        return f3975b.a(d());
    }

    @Override // d3.b
    public boolean b(Object obj) {
        return f3975b.c(obj, d());
    }

    @Override // d3.b
    public String c() {
        return f3975b.b(d());
    }

    @Override // X2.d
    public Class d() {
        return this.f3981a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof e) && l.a(V2.a.b(this), V2.a.b((d3.b) obj));
    }

    public int hashCode() {
        return V2.a.b(this).hashCode();
    }

    public String toString() {
        return d() + " (Kotlin reflection is not available)";
    }
}
