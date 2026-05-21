package p1;

import java.util.Map;
import o1.InterfaceC1466c;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class a implements InterfaceC1466c {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final a f10949m = new C0152a("KEY", 0);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final a f10950n = new b("VALUE", 1);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final /* synthetic */ a[] f10951o = d();

        /* JADX INFO: renamed from: p1.o$a$a, reason: collision with other inner class name */
        public enum C0152a extends a {
            public C0152a(String str, int i4) {
                super(str, i4, null);
            }

            @Override // o1.InterfaceC1466c
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry entry) {
                return entry.getKey();
            }
        }

        public enum b extends a {
            public b(String str, int i4) {
                super(str, i4, null);
            }

            @Override // o1.InterfaceC1466c
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry entry) {
                return entry.getValue();
            }
        }

        public a(String str, int i4) {
        }

        public static /* synthetic */ a[] d() {
            return new a[]{f10949m, f10950n};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f10951o.clone();
        }

        public /* synthetic */ a(String str, int i4, n nVar) {
            this(str, i4);
        }
    }

    public static boolean a(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static String b(Map map) {
        StringBuilder sbA = e.a(map.size());
        sbA.append('{');
        boolean z3 = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z3) {
                sbA.append(", ");
            }
            sbA.append(entry.getKey());
            sbA.append('=');
            sbA.append(entry.getValue());
            z3 = false;
        }
        sbA.append('}');
        return sbA.toString();
    }

    public static InterfaceC1466c c() {
        return a.f10950n;
    }
}
