package F2;

import F2.AbstractC0277c;
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

/* JADX INFO: renamed from: F2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0277c {

    /* JADX INFO: renamed from: F2.c$a */
    public static class a extends C1621n {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f1624d = new a();

        @Override // w2.C1621n
        public Object g(byte b4, ByteBuffer byteBuffer) {
            return super.g(b4, byteBuffer);
        }

        @Override // w2.C1621n
        public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            super.p(byteArrayOutputStream, obj);
        }
    }

    /* JADX INFO: renamed from: F2.c$b */
    public interface b {
        static InterfaceC1615h a() {
            return a.f1624d;
        }

        static /* synthetic */ void b(b bVar, Object obj, C1608a.e eVar) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, bVar.j((String) arrayList2.get(0), (String) arrayList2.get(1)));
            } catch (Throwable th) {
                arrayList = AbstractC0277c.a(th);
            }
            eVar.a(arrayList);
        }

        static /* synthetic */ void f(b bVar, Object obj, C1608a.e eVar) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, bVar.m((String) arrayList2.get(0), (List) arrayList2.get(1)));
            } catch (Throwable th) {
                arrayList = AbstractC0277c.a(th);
            }
            eVar.a(arrayList);
        }

        static void h(InterfaceC1609b interfaceC1609b, String str, final b bVar) {
            String str2;
            if (str.isEmpty()) {
                str2 = "";
            } else {
                str2 = "." + str;
            }
            InterfaceC1609b.c cVarB = interfaceC1609b.b();
            C1608a c1608a = new C1608a(interfaceC1609b, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.remove" + str2, a(), cVarB);
            if (bVar != null) {
                c1608a.e(new C1608a.d() { // from class: F2.d
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        AbstractC0277c.b.s(this.f1625a, obj, eVar);
                    }
                });
            } else {
                c1608a.e(null);
            }
            C1608a c1608a2 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setBool" + str2, a(), cVarB);
            if (bVar != null) {
                c1608a2.e(new C1608a.d() { // from class: F2.e
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        AbstractC0277c.b.v(this.f1626a, obj, eVar);
                    }
                });
            } else {
                c1608a2.e(null);
            }
            C1608a c1608a3 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setString" + str2, a(), cVarB);
            if (bVar != null) {
                c1608a3.e(new C1608a.d() { // from class: F2.f
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        AbstractC0277c.b.u(this.f1627a, obj, eVar);
                    }
                });
            } else {
                c1608a3.e(null);
            }
            C1608a c1608a4 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setInt" + str2, a(), cVarB);
            if (bVar != null) {
                c1608a4.e(new C1608a.d() { // from class: F2.g
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        AbstractC0277c.b.i(this.f1628a, obj, eVar);
                    }
                });
            } else {
                c1608a4.e(null);
            }
            C1608a c1608a5 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDouble" + str2, a(), cVarB);
            if (bVar != null) {
                c1608a5.e(new C1608a.d() { // from class: F2.h
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        AbstractC0277c.b.n(this.f1629a, obj, eVar);
                    }
                });
            } else {
                c1608a5.e(null);
            }
            C1608a c1608a6 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setEncodedStringList" + str2, a(), cVarB);
            if (bVar != null) {
                c1608a6.e(new C1608a.d() { // from class: F2.i
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        AbstractC0277c.b.b(this.f1630a, obj, eVar);
                    }
                });
            } else {
                c1608a6.e(null);
            }
            C1608a c1608a7 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDeprecatedStringList" + str2, a(), cVarB);
            if (bVar != null) {
                c1608a7.e(new C1608a.d() { // from class: F2.j
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        AbstractC0277c.b.f(this.f1631a, obj, eVar);
                    }
                });
            } else {
                c1608a7.e(null);
            }
            C1608a c1608a8 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.clear" + str2, a(), cVarB);
            if (bVar != null) {
                c1608a8.e(new C1608a.d() { // from class: F2.k
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        AbstractC0277c.b.l(this.f1632a, obj, eVar);
                    }
                });
            } else {
                c1608a8.e(null);
            }
            C1608a c1608a9 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.getAll" + str2, a(), cVarB);
            if (bVar != null) {
                c1608a9.e(new C1608a.d() { // from class: F2.l
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        AbstractC0277c.b.t(this.f1633a, obj, eVar);
                    }
                });
            } else {
                c1608a9.e(null);
            }
        }

        static /* synthetic */ void i(b bVar, Object obj, C1608a.e eVar) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, bVar.d((String) arrayList2.get(0), (Long) arrayList2.get(1)));
            } catch (Throwable th) {
                arrayList = AbstractC0277c.a(th);
            }
            eVar.a(arrayList);
        }

        static /* synthetic */ void l(b bVar, Object obj, C1608a.e eVar) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, bVar.k((String) arrayList2.get(0), (List) arrayList2.get(1)));
            } catch (Throwable th) {
                arrayList = AbstractC0277c.a(th);
            }
            eVar.a(arrayList);
        }

        static /* synthetic */ void n(b bVar, Object obj, C1608a.e eVar) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, bVar.q((String) arrayList2.get(0), (Double) arrayList2.get(1)));
            } catch (Throwable th) {
                arrayList = AbstractC0277c.a(th);
            }
            eVar.a(arrayList);
        }

        static void p(InterfaceC1609b interfaceC1609b, b bVar) {
            h(interfaceC1609b, "", bVar);
        }

        static /* synthetic */ void s(b bVar, Object obj, C1608a.e eVar) {
            ArrayList arrayList = new ArrayList();
            try {
                arrayList.add(0, bVar.remove((String) ((ArrayList) obj).get(0)));
            } catch (Throwable th) {
                arrayList = AbstractC0277c.a(th);
            }
            eVar.a(arrayList);
        }

        static /* synthetic */ void t(b bVar, Object obj, C1608a.e eVar) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, bVar.e((String) arrayList2.get(0), (List) arrayList2.get(1)));
            } catch (Throwable th) {
                arrayList = AbstractC0277c.a(th);
            }
            eVar.a(arrayList);
        }

        static /* synthetic */ void u(b bVar, Object obj, C1608a.e eVar) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, bVar.g((String) arrayList2.get(0), (String) arrayList2.get(1)));
            } catch (Throwable th) {
                arrayList = AbstractC0277c.a(th);
            }
            eVar.a(arrayList);
        }

        static /* synthetic */ void v(b bVar, Object obj, C1608a.e eVar) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, bVar.o((String) arrayList2.get(0), (Boolean) arrayList2.get(1)));
            } catch (Throwable th) {
                arrayList = AbstractC0277c.a(th);
            }
            eVar.a(arrayList);
        }

        Boolean d(String str, Long l4);

        Map e(String str, List list);

        Boolean g(String str, String str2);

        Boolean j(String str, String str2);

        Boolean k(String str, List list);

        Boolean m(String str, List list);

        Boolean o(String str, Boolean bool);

        Boolean q(String str, Double d4);

        Boolean remove(String str);
    }

    public static ArrayList a(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }
}
