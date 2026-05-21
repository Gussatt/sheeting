package o1;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: renamed from: o1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1467d {

    /* JADX INFO: renamed from: o1.d$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10738a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f10739b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a f10740c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f10741d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f10742e;

        /* JADX INFO: renamed from: o1.d$b$a */
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public String f10743a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Object f10744b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public a f10745c;

            public a() {
            }
        }

        public static boolean d(Object obj) {
            return obj instanceof CharSequence ? ((CharSequence) obj).length() == 0 : obj instanceof Collection ? ((Collection) obj).isEmpty() : obj instanceof Map ? ((Map) obj).isEmpty() : obj instanceof AbstractC1470g ? !((AbstractC1470g) obj).c() : obj.getClass().isArray() && Array.getLength(obj) == 0;
        }

        public final a a() {
            a aVar = new a();
            this.f10740c.f10745c = aVar;
            this.f10740c = aVar;
            return aVar;
        }

        public final b b(Object obj) {
            a().f10744b = obj;
            return this;
        }

        public b c(Object obj) {
            return b(obj);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String toString() {
            /*
                r7 = this;
                boolean r0 = r7.f10741d
                boolean r1 = r7.f10742e
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r3 = 32
                r2.<init>(r3)
                java.lang.String r3 = r7.f10738a
                r2.append(r3)
                r3 = 123(0x7b, float:1.72E-43)
                r2.append(r3)
                o1.d$b$a r3 = r7.f10739b
                o1.d$b$a r3 = r3.f10745c
                java.lang.String r4 = ""
            L1b:
                if (r3 == 0) goto L61
                java.lang.Object r5 = r3.f10744b
                if (r5 != 0) goto L24
                if (r0 != 0) goto L5e
                goto L2c
            L24:
                if (r1 == 0) goto L2c
                boolean r6 = d(r5)
                if (r6 != 0) goto L5e
            L2c:
                r2.append(r4)
                java.lang.String r4 = r3.f10743a
                if (r4 == 0) goto L3b
                r2.append(r4)
                r4 = 61
                r2.append(r4)
            L3b:
                if (r5 == 0) goto L59
                java.lang.Class r4 = r5.getClass()
                boolean r4 = r4.isArray()
                if (r4 == 0) goto L59
                java.lang.Object[] r4 = new java.lang.Object[]{r5}
                java.lang.String r4 = java.util.Arrays.deepToString(r4)
                int r5 = r4.length()
                r6 = 1
                int r5 = r5 - r6
                r2.append(r4, r6, r5)
                goto L5c
            L59:
                r2.append(r5)
            L5c:
                java.lang.String r4 = ", "
            L5e:
                o1.d$b$a r3 = r3.f10745c
                goto L1b
            L61:
                r0 = 125(0x7d, float:1.75E-43)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o1.AbstractC1467d.b.toString():java.lang.String");
        }

        public b(String str) {
            a aVar = new a();
            this.f10739b = aVar;
            this.f10740c = aVar;
            this.f10741d = false;
            this.f10742e = false;
            this.f10738a = (String) AbstractC1471h.h(str);
        }
    }

    public static b a(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }
}
