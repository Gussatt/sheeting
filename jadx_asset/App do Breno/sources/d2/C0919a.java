package d2;

import N2.e;
import P2.d;
import X2.g;
import X2.l;
import android.util.Log;
import d2.InterfaceC0920b;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import q3.a;
import q3.c;

/* JADX INFO: renamed from: d2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0919a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0919a f7146a = new C0919a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f7147b = Collections.synchronizedMap(new LinkedHashMap());

    /* JADX INFO: renamed from: d2.a$a, reason: collision with other inner class name */
    public static final class C0118a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q3.a f7148a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public InterfaceC0920b f7149b;

        public C0118a(q3.a aVar, InterfaceC0920b interfaceC0920b) {
            l.e(aVar, "mutex");
            this.f7148a = aVar;
            this.f7149b = interfaceC0920b;
        }

        public final q3.a a() {
            return this.f7148a;
        }

        public final InterfaceC0920b b() {
            return this.f7149b;
        }

        public final void c(InterfaceC0920b interfaceC0920b) {
            this.f7149b = interfaceC0920b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0118a)) {
                return false;
            }
            C0118a c0118a = (C0118a) obj;
            return l.a(this.f7148a, c0118a.f7148a) && l.a(this.f7149b, c0118a.f7149b);
        }

        public int hashCode() {
            int iHashCode = this.f7148a.hashCode() * 31;
            InterfaceC0920b interfaceC0920b = this.f7149b;
            return iHashCode + (interfaceC0920b == null ? 0 : interfaceC0920b.hashCode());
        }

        public String toString() {
            return "Dependency(mutex=" + this.f7148a + ", subscriber=" + this.f7149b + ')';
        }

        public /* synthetic */ C0118a(q3.a aVar, InterfaceC0920b interfaceC0920b, int i4, g gVar) {
            this(aVar, (i4 & 2) != 0 ? null : interfaceC0920b);
        }
    }

    /* JADX INFO: renamed from: d2.a$b */
    public static final class b extends d {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Object f7150p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Object f7151q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f7152r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f7153s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f7154t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f7155u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f7156v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f7158x;

        public b(e eVar) {
            super(eVar);
        }

        @Override // P2.a
        public final Object q(Object obj) {
            this.f7156v = obj;
            this.f7158x |= Integer.MIN_VALUE;
            return C0919a.this.c(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(InterfaceC0920b.a aVar) {
        l.e(aVar, "subscriberName");
        if (aVar == InterfaceC0920b.a.PERFORMANCE) {
            throw new IllegalArgumentException("Incompatible versions of Firebase Perf and Firebase Sessions.\nA safe combination would be:\n  firebase-sessions:1.1.0\n  firebase-crashlytics:18.5.0\n  firebase-perf:20.5.0\nFor more information contact Firebase Support.");
        }
        Map map = f7147b;
        if (map.containsKey(aVar)) {
            Log.d("SessionsDependencies", "Dependency " + aVar + " already added.");
            return;
        }
        l.d(map, "dependencies");
        map.put(aVar, new C0118a(c.a(true), null, 2, 0 == true ? 1 : 0));
        Log.d("SessionsDependencies", "Dependency to " + aVar + " added.");
    }

    public static final void e(InterfaceC0920b interfaceC0920b) {
        l.e(interfaceC0920b, "subscriber");
        InterfaceC0920b.a aVarA = interfaceC0920b.a();
        C0118a c0118aB = f7146a.b(aVarA);
        if (c0118aB.b() != null) {
            Log.d("SessionsDependencies", "Subscriber " + aVarA + " already registered.");
            return;
        }
        c0118aB.c(interfaceC0920b);
        Log.d("SessionsDependencies", "Subscriber " + aVarA + " registered.");
        a.C0162a.b(c0118aB.a(), null, 1, null);
    }

    public final C0118a b(InterfaceC0920b.a aVar) {
        Map map = f7147b;
        l.d(map, "dependencies");
        Object obj = map.get(aVar);
        if (obj != null) {
            l.d(obj, "dependencies.getOrElse(s…load time.\"\n      )\n    }");
            return (C0118a) obj;
        }
        throw new IllegalStateException("Cannot get dependency " + aVar + ". Dependencies should be added at class load time.");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x009f -> B:27:0x00a0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(N2.e r11) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r11 instanceof d2.C0919a.b
            if (r0 == 0) goto L13
            r0 = r11
            d2.a$b r0 = (d2.C0919a.b) r0
            int r1 = r0.f7158x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7158x = r1
            goto L18
        L13:
            d2.a$b r0 = new d2.a$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f7156v
            java.lang.Object r1 = O2.c.c()
            int r2 = r0.f7158x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L48
            if (r2 != r3) goto L40
            java.lang.Object r2 = r0.f7155u
            java.lang.Object r5 = r0.f7154t
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r0.f7153s
            q3.a r6 = (q3.a) r6
            java.lang.Object r7 = r0.f7152r
            d2.b$a r7 = (d2.InterfaceC0920b.a) r7
            java.lang.Object r8 = r0.f7151q
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r0.f7150p
            java.util.Map r9 = (java.util.Map) r9
            K2.k.b(r11)
            goto La0
        L40:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L48:
            K2.k.b(r11)
            java.util.Map r11 = d2.C0919a.f7147b
            java.lang.String r2 = "dependencies"
            X2.l.d(r11, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r5 = r11.size()
            int r5 = L2.B.a(r5)
            r2.<init>(r5)
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
            r8 = r11
            r5 = r2
        L69:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto Lb3
            java.lang.Object r11 = r8.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r2 = r11.getKey()
            java.lang.Object r6 = r11.getKey()
            r7 = r6
            d2.b$a r7 = (d2.InterfaceC0920b.a) r7
            java.lang.Object r11 = r11.getValue()
            d2.a$a r11 = (d2.C0919a.C0118a) r11
            q3.a r6 = r11.a()
            r0.f7150p = r5
            r0.f7151q = r8
            r0.f7152r = r7
            r0.f7153s = r6
            r0.f7154t = r5
            r0.f7155u = r2
            r0.f7158x = r3
            java.lang.Object r11 = r6.c(r4, r0)
            if (r11 != r1) goto L9f
            return r1
        L9f:
            r9 = r5
        La0:
            d2.a r11 = d2.C0919a.f7146a     // Catch: java.lang.Throwable -> Lae
            d2.b r11 = r11.d(r7)     // Catch: java.lang.Throwable -> Lae
            r6.a(r4)
            r5.put(r2, r11)
            r5 = r9
            goto L69
        Lae:
            r11 = move-exception
            r6.a(r4)
            throw r11
        Lb3:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.C0919a.c(N2.e):java.lang.Object");
    }

    public final InterfaceC0920b d(InterfaceC0920b.a aVar) {
        l.e(aVar, "subscriberName");
        InterfaceC0920b interfaceC0920bB = b(aVar).b();
        if (interfaceC0920bB != null) {
            return interfaceC0920bB;
        }
        throw new IllegalStateException("Subscriber " + aVar + " has not been registered.");
    }
}
