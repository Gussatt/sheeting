package C2;

import C2.o;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import w2.C1608a;
import w2.C1621n;
import w2.InterfaceC1609b;
import w2.InterfaceC1615h;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    public interface a {

        /* JADX INFO: renamed from: C2.o$a$a, reason: collision with other inner class name */
        public class C0008a implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ArrayList f729a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C1608a.e f730b;

            public C0008a(ArrayList arrayList, C1608a.e eVar) {
                this.f729a = arrayList;
                this.f730b = eVar;
            }

            @Override // C2.o.f
            public void b(Throwable th) {
                this.f730b.a(o.a(th));
            }

            @Override // C2.o.f
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void a(Void r32) {
                this.f729a.add(0, null);
                this.f730b.a(this.f729a);
            }
        }

        public class b implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ArrayList f731a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C1608a.e f732b;

            public b(ArrayList arrayList, C1608a.e eVar) {
                this.f731a = arrayList;
                this.f732b = eVar;
            }

            @Override // C2.o.f
            public void b(Throwable th) {
                this.f732b.a(o.a(th));
            }

            @Override // C2.o.f
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void a(Void r32) {
                this.f731a.add(0, null);
                this.f732b.a(this.f731a);
            }
        }

        public class c implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ArrayList f733a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C1608a.e f734b;

            public c(ArrayList arrayList, C1608a.e eVar) {
                this.f733a = arrayList;
                this.f734b = eVar;
            }

            @Override // C2.o.f
            public void b(Throwable th) {
                this.f734b.a(o.a(th));
            }

            @Override // C2.o.f
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void a(Void r32) {
                this.f733a.add(0, null);
                this.f734b.a(this.f733a);
            }
        }

        static InterfaceC1615h a() {
            return new C1621n();
        }

        static /* synthetic */ void d(a aVar, Object obj, C1608a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            aVar.h((String) arrayList.get(0), (Boolean) arrayList.get(1), new C0008a(new ArrayList(), eVar));
        }

        static void i(InterfaceC1609b interfaceC1609b, final a aVar) {
            C1608a c1608a = new C1608a(interfaceC1609b, "dev.flutter.pigeon.FirebaseAppHostApi.setAutomaticDataCollectionEnabled", a());
            if (aVar != null) {
                c1608a.e(new C1608a.d() { // from class: C2.l
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        o.a.d(this.f726a, obj, eVar);
                    }
                });
            } else {
                c1608a.e(null);
            }
            C1608a c1608a2 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.FirebaseAppHostApi.setAutomaticResourceManagementEnabled", a());
            if (aVar != null) {
                c1608a2.e(new C1608a.d() { // from class: C2.m
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        o.a.l(this.f727a, obj, eVar);
                    }
                });
            } else {
                c1608a2.e(null);
            }
            C1608a c1608a3 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.FirebaseAppHostApi.delete", a());
            if (aVar != null) {
                c1608a3.e(new C1608a.d() { // from class: C2.n
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        this.f728a.g((String) ((ArrayList) obj).get(0), new o.a.c(new ArrayList(), eVar));
                    }
                });
            } else {
                c1608a3.e(null);
            }
        }

        static /* synthetic */ void l(a aVar, Object obj, C1608a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            aVar.e((String) arrayList.get(0), (Boolean) arrayList.get(1), new b(new ArrayList(), eVar));
        }

        void e(String str, Boolean bool, f fVar);

        void g(String str, f fVar);

        void h(String str, Boolean bool, f fVar);
    }

    public interface b {

        public class a implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ArrayList f735a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C1608a.e f736b;

            public a(ArrayList arrayList, C1608a.e eVar) {
                this.f735a = arrayList;
                this.f736b = eVar;
            }

            @Override // C2.o.f
            public void b(Throwable th) {
                this.f736b.a(o.a(th));
            }

            @Override // C2.o.f
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void a(e eVar) {
                this.f735a.add(0, eVar);
                this.f736b.a(this.f735a);
            }
        }

        /* JADX INFO: renamed from: C2.o$b$b, reason: collision with other inner class name */
        public class C0009b implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ArrayList f737a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C1608a.e f738b;

            public C0009b(ArrayList arrayList, C1608a.e eVar) {
                this.f737a = arrayList;
                this.f738b = eVar;
            }

            @Override // C2.o.f
            public void b(Throwable th) {
                this.f738b.a(o.a(th));
            }

            @Override // C2.o.f
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void a(List list) {
                this.f737a.add(0, list);
                this.f738b.a(this.f737a);
            }
        }

        public class c implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ArrayList f739a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C1608a.e f740b;

            public c(ArrayList arrayList, C1608a.e eVar) {
                this.f739a = arrayList;
                this.f740b = eVar;
            }

            @Override // C2.o.f
            public void b(Throwable th) {
                this.f740b.a(o.a(th));
            }

            @Override // C2.o.f
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void a(d dVar) {
                this.f739a.add(0, dVar);
                this.f740b.a(this.f739a);
            }
        }

        static InterfaceC1615h a() {
            return c.f741d;
        }

        static /* synthetic */ void b(b bVar, Object obj, C1608a.e eVar) {
            ArrayList arrayList = (ArrayList) obj;
            bVar.m((String) arrayList.get(0), (d) arrayList.get(1), new a(new ArrayList(), eVar));
        }

        static void o(InterfaceC1609b interfaceC1609b, final b bVar) {
            C1608a c1608a = new C1608a(interfaceC1609b, "dev.flutter.pigeon.FirebaseCoreHostApi.initializeApp", a());
            if (bVar != null) {
                c1608a.e(new C1608a.d() { // from class: C2.p
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        o.b.b(this.f778a, obj, eVar);
                    }
                });
            } else {
                c1608a.e(null);
            }
            C1608a c1608a2 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.FirebaseCoreHostApi.initializeCore", a());
            if (bVar != null) {
                c1608a2.e(new C1608a.d() { // from class: C2.q
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        this.f779a.n(new o.b.C0009b(new ArrayList(), eVar));
                    }
                });
            } else {
                c1608a2.e(null);
            }
            C1608a c1608a3 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.FirebaseCoreHostApi.optionsFromResource", a());
            if (bVar != null) {
                c1608a3.e(new C1608a.d() { // from class: C2.r
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        this.f780a.f(new o.b.c(new ArrayList(), eVar));
                    }
                });
            } else {
                c1608a3.e(null);
            }
        }

        void f(f fVar);

        void m(String str, d dVar, f fVar);

        void n(f fVar);
    }

    public static class c extends C1621n {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f741d = new c();

        @Override // w2.C1621n
        public Object g(byte b4, ByteBuffer byteBuffer) {
            return b4 != -128 ? b4 != -127 ? super.g(b4, byteBuffer) : e.a((ArrayList) f(byteBuffer)) : d.a((ArrayList) f(byteBuffer));
        }

        @Override // w2.C1621n
        public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof d) {
                byteArrayOutputStream.write(128);
                p(byteArrayOutputStream, ((d) obj).x());
            } else if (!(obj instanceof e)) {
                super.p(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(129);
                p(byteArrayOutputStream, ((e) obj).f());
            }
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f742a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f743b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f744c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f745d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f746e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f747f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f748g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f749h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f750i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f751j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f752k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f753l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public String f754m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public String f755n;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public String f756a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public String f757b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public String f758c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public String f759d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public String f760e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public String f761f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public String f762g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public String f763h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public String f764i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public String f765j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public String f766k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public String f767l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public String f768m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public String f769n;

            public d a() {
                d dVar = new d();
                dVar.k(this.f756a);
                dVar.m(this.f757b);
                dVar.t(this.f758c);
                dVar.u(this.f759d);
                dVar.n(this.f760e);
                dVar.o(this.f761f);
                dVar.v(this.f762g);
                dVar.s(this.f763h);
                dVar.w(this.f764i);
                dVar.p(this.f765j);
                dVar.j(this.f766k);
                dVar.r(this.f767l);
                dVar.q(this.f768m);
                dVar.l(this.f769n);
                return dVar;
            }

            public a b(String str) {
                this.f756a = str;
                return this;
            }

            public a c(String str) {
                this.f757b = str;
                return this;
            }

            public a d(String str) {
                this.f761f = str;
                return this;
            }

            public a e(String str) {
                this.f758c = str;
                return this;
            }

            public a f(String str) {
                this.f759d = str;
                return this;
            }

            public a g(String str) {
                this.f762g = str;
                return this;
            }

            public a h(String str) {
                this.f764i = str;
                return this;
            }
        }

        public static d a(ArrayList arrayList) {
            d dVar = new d();
            dVar.k((String) arrayList.get(0));
            dVar.m((String) arrayList.get(1));
            dVar.t((String) arrayList.get(2));
            dVar.u((String) arrayList.get(3));
            dVar.n((String) arrayList.get(4));
            dVar.o((String) arrayList.get(5));
            dVar.v((String) arrayList.get(6));
            dVar.s((String) arrayList.get(7));
            dVar.w((String) arrayList.get(8));
            dVar.p((String) arrayList.get(9));
            dVar.j((String) arrayList.get(10));
            dVar.r((String) arrayList.get(11));
            dVar.q((String) arrayList.get(12));
            dVar.l((String) arrayList.get(13));
            return dVar;
        }

        public String b() {
            return this.f742a;
        }

        public String c() {
            return this.f743b;
        }

        public String d() {
            return this.f746e;
        }

        public String e() {
            return this.f747f;
        }

        public String f() {
            return this.f744c;
        }

        public String g() {
            return this.f745d;
        }

        public String h() {
            return this.f748g;
        }

        public String i() {
            return this.f750i;
        }

        public void j(String str) {
            this.f752k = str;
        }

        public void k(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"apiKey\" is null.");
            }
            this.f742a = str;
        }

        public void l(String str) {
            this.f755n = str;
        }

        public void m(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"appId\" is null.");
            }
            this.f743b = str;
        }

        public void n(String str) {
            this.f746e = str;
        }

        public void o(String str) {
            this.f747f = str;
        }

        public void p(String str) {
            this.f751j = str;
        }

        public void q(String str) {
            this.f754m = str;
        }

        public void r(String str) {
            this.f753l = str;
        }

        public void s(String str) {
            this.f749h = str;
        }

        public void t(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"messagingSenderId\" is null.");
            }
            this.f744c = str;
        }

        public void u(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"projectId\" is null.");
            }
            this.f745d = str;
        }

        public void v(String str) {
            this.f748g = str;
        }

        public void w(String str) {
            this.f750i = str;
        }

        public ArrayList x() {
            ArrayList arrayList = new ArrayList(14);
            arrayList.add(this.f742a);
            arrayList.add(this.f743b);
            arrayList.add(this.f744c);
            arrayList.add(this.f745d);
            arrayList.add(this.f746e);
            arrayList.add(this.f747f);
            arrayList.add(this.f748g);
            arrayList.add(this.f749h);
            arrayList.add(this.f750i);
            arrayList.add(this.f751j);
            arrayList.add(this.f752k);
            arrayList.add(this.f753l);
            arrayList.add(this.f754m);
            arrayList.add(this.f755n);
            return arrayList;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f770a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public d f771b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Boolean f772c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Map f773d;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public String f774a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public d f775b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public Boolean f776c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public Map f777d;

            public e a() {
                e eVar = new e();
                eVar.c(this.f774a);
                eVar.d(this.f775b);
                eVar.b(this.f776c);
                eVar.e(this.f777d);
                return eVar;
            }

            public a b(Boolean bool) {
                this.f776c = bool;
                return this;
            }

            public a c(String str) {
                this.f774a = str;
                return this;
            }

            public a d(d dVar) {
                this.f775b = dVar;
                return this;
            }

            public a e(Map map) {
                this.f777d = map;
                return this;
            }
        }

        public static e a(ArrayList arrayList) {
            e eVar = new e();
            eVar.c((String) arrayList.get(0));
            Object obj = arrayList.get(1);
            eVar.d(obj == null ? null : d.a((ArrayList) obj));
            eVar.b((Boolean) arrayList.get(2));
            eVar.e((Map) arrayList.get(3));
            return eVar;
        }

        public void b(Boolean bool) {
            this.f772c = bool;
        }

        public void c(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"name\" is null.");
            }
            this.f770a = str;
        }

        public void d(d dVar) {
            if (dVar == null) {
                throw new IllegalStateException("Nonnull field \"options\" is null.");
            }
            this.f771b = dVar;
        }

        public void e(Map map) {
            if (map == null) {
                throw new IllegalStateException("Nonnull field \"pluginConstants\" is null.");
            }
            this.f773d = map;
        }

        public ArrayList f() {
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(this.f770a);
            d dVar = this.f771b;
            arrayList.add(dVar == null ? null : dVar.x());
            arrayList.add(this.f772c);
            arrayList.add(this.f773d);
            return arrayList;
        }
    }

    public interface f {
        void a(Object obj);

        void b(Throwable th);
    }

    public static ArrayList a(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }
}
