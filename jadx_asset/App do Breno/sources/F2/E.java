package F2;

import F2.E;
import java.util.List;
import java.util.Map;
import w2.C1608a;
import w2.InterfaceC1609b;
import w2.InterfaceC1615h;

/* JADX INFO: loaded from: classes.dex */
public interface E {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f1476b = a.f1477a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f1477a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final K2.f f1478b = K2.g.a(new W2.a() { // from class: F2.o
            @Override // W2.a
            public final Object e() {
                return E.a.q();
            }
        });

        public static final void A(E e4, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            X2.l.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                listB = L2.l.b(e4.g(str, (H) obj3));
            } catch (Throwable th) {
                listB = n.b(th);
            }
            eVar.a(listB);
        }

        public static final void B(E e4, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            X2.l.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                listB = L2.l.b(e4.d(str, (H) obj3));
            } catch (Throwable th) {
                listB = n.b(th);
            }
            eVar.a(listB);
        }

        public static final void C(E e4, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            List list2 = (List) list.get(0);
            Object obj2 = list.get(1);
            X2.l.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                e4.b(list2, (H) obj2);
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = n.b(th);
            }
            eVar.a(listB);
        }

        public static final void D(E e4, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            List list2 = (List) list.get(0);
            Object obj2 = list.get(1);
            X2.l.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                listB = L2.l.b(e4.e(list2, (H) obj2));
            } catch (Throwable th) {
                listB = n.b(th);
            }
            eVar.a(listB);
        }

        public static final void E(E e4, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            List list2 = (List) list.get(0);
            Object obj2 = list.get(1);
            X2.l.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                listB = L2.l.b(e4.p(list2, (H) obj2));
            } catch (Throwable th) {
                listB = n.b(th);
            }
            eVar.a(listB);
        }

        public static final void F(E e4, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            X2.l.c(obj3, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) obj3;
            Object obj4 = list.get(2);
            X2.l.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                e4.n(str, str2, (H) obj4);
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = n.b(th);
            }
            eVar.a(listB);
        }

        public static final void G(E e4, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            X2.l.c(obj3, "null cannot be cast to non-null type kotlin.Long");
            long jLongValue = ((Long) obj3).longValue();
            Object obj4 = list.get(2);
            X2.l.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                e4.a(str, jLongValue, (H) obj4);
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = n.b(th);
            }
            eVar.a(listB);
        }

        public static final void H(E e4, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            X2.l.c(obj3, "null cannot be cast to non-null type kotlin.Double");
            double dDoubleValue = ((Double) obj3).doubleValue();
            Object obj4 = list.get(2);
            X2.l.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                e4.k(str, dDoubleValue, (H) obj4);
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = n.b(th);
            }
            eVar.a(listB);
        }

        public static final C0287m q() {
            return new C0287m();
        }

        public static final void t(E e4, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            X2.l.c(obj3, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) obj3;
            Object obj4 = list.get(2);
            X2.l.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                e4.j(str, str2, (H) obj4);
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = n.b(th);
            }
            eVar.a(listB);
        }

        public static final void u(E e4, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            X2.l.c(obj3, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            List list2 = (List) obj3;
            Object obj4 = list.get(2);
            X2.l.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                e4.f(str, list2, (H) obj4);
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = n.b(th);
            }
            eVar.a(listB);
        }

        public static final void v(E e4, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            X2.l.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                listB = L2.l.b(e4.h(str, (H) obj3));
            } catch (Throwable th) {
                listB = n.b(th);
            }
            eVar.a(listB);
        }

        public static final void w(E e4, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            X2.l.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                listB = L2.l.b(e4.i(str, (H) obj3));
            } catch (Throwable th) {
                listB = n.b(th);
            }
            eVar.a(listB);
        }

        public static final void x(E e4, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            X2.l.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                listB = L2.l.b(e4.m(str, (H) obj3));
            } catch (Throwable th) {
                listB = n.b(th);
            }
            eVar.a(listB);
        }

        public static final void y(E e4, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            X2.l.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
            Object obj4 = list.get(2);
            X2.l.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                e4.l(str, zBooleanValue, (H) obj4);
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = n.b(th);
            }
            eVar.a(listB);
        }

        public static final void z(E e4, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            X2.l.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                listB = L2.l.b(e4.o(str, (H) obj3));
            } catch (Throwable th) {
                listB = n.b(th);
            }
            eVar.a(listB);
        }

        public final InterfaceC1615h r() {
            return (InterfaceC1615h) f1478b.getValue();
        }

        public final void s(InterfaceC1609b interfaceC1609b, final E e4, String str) {
            String str2;
            X2.l.e(interfaceC1609b, "binaryMessenger");
            X2.l.e(str, "messageChannelSuffix");
            if (str.length() > 0) {
                str2 = '.' + str;
            } else {
                str2 = "";
            }
            InterfaceC1609b.c cVarB = interfaceC1609b.b();
            C1608a c1608a = new C1608a(interfaceC1609b, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setBool" + str2, r(), cVarB);
            if (e4 != null) {
                c1608a.e(new C1608a.d() { // from class: F2.v
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        E.a.y(e4, obj, eVar);
                    }
                });
            } else {
                c1608a.e(null);
            }
            C1608a c1608a2 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setString" + str2, r(), cVarB);
            if (e4 != null) {
                c1608a2.e(new C1608a.d() { // from class: F2.B
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        E.a.F(e4, obj, eVar);
                    }
                });
            } else {
                c1608a2.e(null);
            }
            C1608a c1608a3 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setInt" + str2, r(), cVarB);
            if (e4 != null) {
                c1608a3.e(new C1608a.d() { // from class: F2.C
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        E.a.G(e4, obj, eVar);
                    }
                });
            } else {
                c1608a3.e(null);
            }
            C1608a c1608a4 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDouble" + str2, r(), cVarB);
            if (e4 != null) {
                c1608a4.e(new C1608a.d() { // from class: F2.D
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        E.a.H(e4, obj, eVar);
                    }
                });
            } else {
                c1608a4.e(null);
            }
            C1608a c1608a5 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setEncodedStringList" + str2, r(), cVarB);
            if (e4 != null) {
                c1608a5.e(new C1608a.d() { // from class: F2.p
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        E.a.t(e4, obj, eVar);
                    }
                });
            } else {
                c1608a5.e(null);
            }
            C1608a c1608a6 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDeprecatedStringList" + str2, r(), cVarB);
            if (e4 != null) {
                c1608a6.e(new C1608a.d() { // from class: F2.q
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        E.a.u(e4, obj, eVar);
                    }
                });
            } else {
                c1608a6.e(null);
            }
            C1608a c1608a7 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getString" + str2, r(), cVarB);
            if (e4 != null) {
                c1608a7.e(new C1608a.d() { // from class: F2.r
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        E.a.v(e4, obj, eVar);
                    }
                });
            } else {
                c1608a7.e(null);
            }
            C1608a c1608a8 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getBool" + str2, r(), cVarB);
            if (e4 != null) {
                c1608a8.e(new C1608a.d() { // from class: F2.s
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        E.a.w(e4, obj, eVar);
                    }
                });
            } else {
                c1608a8.e(null);
            }
            C1608a c1608a9 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getDouble" + str2, r(), cVarB);
            if (e4 != null) {
                c1608a9.e(new C1608a.d() { // from class: F2.t
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        E.a.x(e4, obj, eVar);
                    }
                });
            } else {
                c1608a9.e(null);
            }
            C1608a c1608a10 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getInt" + str2, r(), cVarB);
            if (e4 != null) {
                c1608a10.e(new C1608a.d() { // from class: F2.u
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        E.a.z(e4, obj, eVar);
                    }
                });
            } else {
                c1608a10.e(null);
            }
            C1608a c1608a11 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getPlatformEncodedStringList" + str2, r(), cVarB);
            if (e4 != null) {
                c1608a11.e(new C1608a.d() { // from class: F2.w
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        E.a.A(e4, obj, eVar);
                    }
                });
            } else {
                c1608a11.e(null);
            }
            C1608a c1608a12 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getStringList" + str2, r(), cVarB);
            if (e4 != null) {
                c1608a12.e(new C1608a.d() { // from class: F2.x
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        E.a.B(e4, obj, eVar);
                    }
                });
            } else {
                c1608a12.e(null);
            }
            C1608a c1608a13 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.clear" + str2, r(), cVarB);
            if (e4 != null) {
                c1608a13.e(new C1608a.d() { // from class: F2.y
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        E.a.C(e4, obj, eVar);
                    }
                });
            } else {
                c1608a13.e(null);
            }
            C1608a c1608a14 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getAll" + str2, r(), cVarB);
            if (e4 != null) {
                c1608a14.e(new C1608a.d() { // from class: F2.z
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        E.a.D(e4, obj, eVar);
                    }
                });
            } else {
                c1608a14.e(null);
            }
            C1608a c1608a15 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getKeys" + str2, r(), cVarB);
            if (e4 != null) {
                c1608a15.e(new C1608a.d() { // from class: F2.A
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        E.a.E(e4, obj, eVar);
                    }
                });
            } else {
                c1608a15.e(null);
            }
        }
    }

    void a(String str, long j4, H h4);

    void b(List list, H h4);

    M d(String str, H h4);

    Map e(List list, H h4);

    void f(String str, List list, H h4);

    List g(String str, H h4);

    String h(String str, H h4);

    Boolean i(String str, H h4);

    void j(String str, String str2, H h4);

    void k(String str, double d4, H h4);

    void l(String str, boolean z3, H h4);

    Double m(String str, H h4);

    void n(String str, String str2, H h4);

    Long o(String str, H h4);

    List p(List list, H h4);
}
