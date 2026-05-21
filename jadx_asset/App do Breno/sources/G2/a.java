package G2;

import G2.a;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import w2.C1608a;
import w2.C1621n;
import w2.InterfaceC1609b;
import w2.InterfaceC1615h;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: G2.a$a, reason: collision with other inner class name */
    public static final class C0047a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Boolean f1647a;

        public static C0047a a(ArrayList arrayList) {
            C0047a c0047a = new C0047a();
            c0047a.c((Boolean) arrayList.get(0));
            return c0047a;
        }

        public Boolean b() {
            return this.f1647a;
        }

        public void c(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"showTitle\" is null.");
            }
            this.f1647a = bool;
        }

        public ArrayList d() {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(this.f1647a);
            return arrayList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0047a.class != obj.getClass()) {
                return false;
            }
            return this.f1647a.equals(((C0047a) obj).f1647a);
        }

        public int hashCode() {
            return Objects.hash(this.f1647a);
        }
    }

    public static class b extends RuntimeException {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final String f1648m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Object f1649n;

        public b(String str, String str2, Object obj) {
            super(str2);
            this.f1648m = str;
            this.f1649n = obj;
        }
    }

    public static class c extends C1621n {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f1650d = new c();

        @Override // w2.C1621n
        public Object g(byte b4, ByteBuffer byteBuffer) {
            return b4 != -127 ? b4 != -126 ? super.g(b4, byteBuffer) : C0047a.a((ArrayList) f(byteBuffer)) : e.a((ArrayList) f(byteBuffer));
        }

        @Override // w2.C1621n
        public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof e) {
                byteArrayOutputStream.write(129);
                p(byteArrayOutputStream, ((e) obj).h());
            } else if (!(obj instanceof C0047a)) {
                super.p(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(130);
                p(byteArrayOutputStream, ((C0047a) obj).d());
            }
        }
    }

    public interface d {
        static InterfaceC1615h a() {
            return c.f1650d;
        }

        static /* synthetic */ void b(d dVar, Object obj, C1608a.e eVar) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, dVar.m((String) arrayList2.get(0), (Boolean) arrayList2.get(1), (e) arrayList2.get(2), (C0047a) arrayList2.get(3)));
            } catch (Throwable th) {
                arrayList = a.a(th);
            }
            eVar.a(arrayList);
        }

        static /* synthetic */ void c(d dVar, Object obj, C1608a.e eVar) {
            ArrayList arrayList = new ArrayList();
            try {
                arrayList.add(0, dVar.e((String) ((ArrayList) obj).get(0)));
            } catch (Throwable th) {
                arrayList = a.a(th);
            }
            eVar.a(arrayList);
        }

        static /* synthetic */ void d(d dVar, Object obj, C1608a.e eVar) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, dVar.j((String) arrayList2.get(0), (Map) arrayList2.get(1)));
            } catch (Throwable th) {
                arrayList = a.a(th);
            }
            eVar.a(arrayList);
        }

        static /* synthetic */ void f(d dVar, Object obj, C1608a.e eVar) {
            ArrayList arrayList = new ArrayList();
            try {
                dVar.h();
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = a.a(th);
            }
            eVar.a(arrayList);
        }

        static void g(InterfaceC1609b interfaceC1609b, String str, final d dVar) {
            String str2;
            if (str.isEmpty()) {
                str2 = "";
            } else {
                str2 = "." + str;
            }
            C1608a c1608a = new C1608a(interfaceC1609b, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.canLaunchUrl" + str2, a());
            if (dVar != null) {
                c1608a.e(new C1608a.d() { // from class: G2.b
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        a.d.c(this.f1654a, obj, eVar);
                    }
                });
            } else {
                c1608a.e(null);
            }
            C1608a c1608a2 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.launchUrl" + str2, a());
            if (dVar != null) {
                c1608a2.e(new C1608a.d() { // from class: G2.c
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        a.d.d(this.f1655a, obj, eVar);
                    }
                });
            } else {
                c1608a2.e(null);
            }
            C1608a c1608a3 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.openUrlInApp" + str2, a());
            if (dVar != null) {
                c1608a3.e(new C1608a.d() { // from class: G2.d
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        a.d.b(this.f1656a, obj, eVar);
                    }
                });
            } else {
                c1608a3.e(null);
            }
            C1608a c1608a4 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.supportsCustomTabs" + str2, a());
            if (dVar != null) {
                c1608a4.e(new C1608a.d() { // from class: G2.e
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        a.d.k(this.f1657a, obj, eVar);
                    }
                });
            } else {
                c1608a4.e(null);
            }
            C1608a c1608a5 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.closeWebView" + str2, a());
            if (dVar != null) {
                c1608a5.e(new C1608a.d() { // from class: G2.f
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        a.d.f(this.f1658a, obj, eVar);
                    }
                });
            } else {
                c1608a5.e(null);
            }
        }

        static void i(InterfaceC1609b interfaceC1609b, d dVar) {
            g(interfaceC1609b, "", dVar);
        }

        static /* synthetic */ void k(d dVar, Object obj, C1608a.e eVar) {
            ArrayList arrayList = new ArrayList();
            try {
                arrayList.add(0, dVar.l());
            } catch (Throwable th) {
                arrayList = a.a(th);
            }
            eVar.a(arrayList);
        }

        Boolean e(String str);

        void h();

        Boolean j(String str, Map map);

        Boolean l();

        Boolean m(String str, Boolean bool, e eVar, C0047a c0047a);
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Boolean f1651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Boolean f1652b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Map f1653c;

        public static e a(ArrayList arrayList) {
            e eVar = new e();
            eVar.f((Boolean) arrayList.get(0));
            eVar.e((Boolean) arrayList.get(1));
            eVar.g((Map) arrayList.get(2));
            return eVar;
        }

        public Boolean b() {
            return this.f1652b;
        }

        public Boolean c() {
            return this.f1651a;
        }

        public Map d() {
            return this.f1653c;
        }

        public void e(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"enableDomStorage\" is null.");
            }
            this.f1652b = bool;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (this.f1651a.equals(eVar.f1651a) && this.f1652b.equals(eVar.f1652b) && this.f1653c.equals(eVar.f1653c)) {
                    return true;
                }
            }
            return false;
        }

        public void f(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"enableJavaScript\" is null.");
            }
            this.f1651a = bool;
        }

        public void g(Map map) {
            if (map == null) {
                throw new IllegalStateException("Nonnull field \"headers\" is null.");
            }
            this.f1653c = map;
        }

        public ArrayList h() {
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(this.f1651a);
            arrayList.add(this.f1652b);
            arrayList.add(this.f1653c);
            return arrayList;
        }

        public int hashCode() {
            return Objects.hash(this.f1651a, this.f1652b, this.f1653c);
        }
    }

    public static ArrayList a(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        if (th instanceof b) {
            b bVar = (b) th;
            arrayList.add(bVar.f1648m);
            arrayList.add(bVar.getMessage());
            arrayList.add(bVar.f1649n);
            return arrayList;
        }
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }
}
