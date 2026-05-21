package B2;

import B2.InterfaceC0216y;
import java.util.List;
import java.util.Map;
import w2.C1608a;
import w2.InterfaceC1609b;
import w2.InterfaceC1615h;

/* JADX INFO: renamed from: B2.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0216y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f315a = a.f316a;

    /* JADX INFO: renamed from: B2.y$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f316a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final K2.f f317b = K2.g.a(new W2.a() { // from class: B2.b
            @Override // W2.a
            public final Object e() {
                return InterfaceC0216y.a.x();
            }
        });

        public static /* synthetic */ void A(a aVar, InterfaceC1609b interfaceC1609b, InterfaceC0216y interfaceC0216y, String str, int i4, Object obj) {
            if ((i4 & 4) != 0) {
                str = "";
            }
            aVar.z(interfaceC1609b, interfaceC0216y, str);
        }

        public static final void B(InterfaceC0216y interfaceC0216y, Object obj, final C1608a.e eVar) {
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            interfaceC0216y.j(((Boolean) obj2).booleanValue(), new W2.l() { // from class: B2.i
                @Override // W2.l
                public final Object k(Object obj3) {
                    return InterfaceC0216y.a.C(eVar, (K2.j) obj3);
                }
            });
        }

        public static final K2.p C(C1608a.e eVar, K2.j jVar) {
            Throwable thD = K2.j.d(jVar.i());
            if (thD != null) {
                eVar.a(Z.f289a.b(thD));
            } else {
                eVar.a(Z.f289a.c(null));
            }
            return K2.p.f2516a;
        }

        public static final void D(InterfaceC0216y interfaceC0216y, Object obj, final C1608a.e eVar) {
            X2.l.e(eVar, "reply");
            interfaceC0216y.b(new W2.l() { // from class: B2.g
                @Override // W2.l
                public final Object k(Object obj2) {
                    return InterfaceC0216y.a.E(eVar, (K2.j) obj2);
                }
            });
        }

        public static final K2.p E(C1608a.e eVar, K2.j jVar) {
            Throwable thD = K2.j.d(jVar.i());
            if (thD != null) {
                eVar.a(Z.f289a.b(thD));
            } else {
                eVar.a(Z.f289a.c(null));
            }
            return K2.p.f2516a;
        }

        public static final void F(InterfaceC0216y interfaceC0216y, Object obj, final C1608a.e eVar) {
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type kotlin.Long");
            interfaceC0216y.h(((Long) obj2).longValue(), new W2.l() { // from class: B2.p
                @Override // W2.l
                public final Object k(Object obj3) {
                    return InterfaceC0216y.a.G(eVar, (K2.j) obj3);
                }
            });
        }

        public static final K2.p G(C1608a.e eVar, K2.j jVar) {
            Throwable thD = K2.j.d(jVar.i());
            if (thD != null) {
                eVar.a(Z.f289a.b(thD));
            } else {
                eVar.a(Z.f289a.c(null));
            }
            return K2.p.f2516a;
        }

        public static final void H(InterfaceC0216y interfaceC0216y, Object obj, final C1608a.e eVar) {
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Boolean?>");
            interfaceC0216y.f((Map) obj2, new W2.l() { // from class: B2.l
                @Override // W2.l
                public final Object k(Object obj3) {
                    return InterfaceC0216y.a.I(eVar, (K2.j) obj3);
                }
            });
        }

        public static final K2.p I(C1608a.e eVar, K2.j jVar) {
            Throwable thD = K2.j.d(jVar.i());
            if (thD != null) {
                eVar.a(Z.f289a.b(thD));
            } else {
                eVar.a(Z.f289a.c(null));
            }
            return K2.p.f2516a;
        }

        public static final void J(InterfaceC0216y interfaceC0216y, Object obj, final C1608a.e eVar) {
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            interfaceC0216y.k((Map) ((List) obj).get(0), new W2.l() { // from class: B2.h
                @Override // W2.l
                public final Object k(Object obj2) {
                    return InterfaceC0216y.a.K(eVar, (K2.j) obj2);
                }
            });
        }

        public static final K2.p K(C1608a.e eVar, K2.j jVar) {
            Throwable thD = K2.j.d(jVar.i());
            if (thD != null) {
                eVar.a(Z.f289a.b(thD));
            } else {
                eVar.a(Z.f289a.c(null));
            }
            return K2.p.f2516a;
        }

        public static final void L(InterfaceC0216y interfaceC0216y, Object obj, final C1608a.e eVar) {
            X2.l.e(eVar, "reply");
            interfaceC0216y.d(new W2.l() { // from class: B2.o
                @Override // W2.l
                public final Object k(Object obj2) {
                    return InterfaceC0216y.a.M(eVar, (K2.j) obj2);
                }
            });
        }

        public static final K2.p M(C1608a.e eVar, K2.j jVar) {
            Throwable thD = K2.j.d(jVar.i());
            if (thD != null) {
                eVar.a(Z.f289a.b(thD));
            } else {
                Object objI = jVar.i();
                if (K2.j.f(objI)) {
                    objI = null;
                }
                eVar.a(Z.f289a.c((String) objI));
            }
            return K2.p.f2516a;
        }

        public static final void N(InterfaceC0216y interfaceC0216y, Object obj, final C1608a.e eVar) {
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            interfaceC0216y.e((Map) obj2, new W2.l() { // from class: B2.j
                @Override // W2.l
                public final Object k(Object obj3) {
                    return InterfaceC0216y.a.O(eVar, (K2.j) obj3);
                }
            });
        }

        public static final K2.p O(C1608a.e eVar, K2.j jVar) {
            Throwable thD = K2.j.d(jVar.i());
            if (thD != null) {
                eVar.a(Z.f289a.b(thD));
            } else {
                eVar.a(Z.f289a.c(null));
            }
            return K2.p.f2516a;
        }

        public static final void P(InterfaceC0216y interfaceC0216y, Object obj, final C1608a.e eVar) {
            X2.l.e(eVar, "reply");
            interfaceC0216y.l(new W2.l() { // from class: B2.e
                @Override // W2.l
                public final Object k(Object obj2) {
                    return InterfaceC0216y.a.Q(eVar, (K2.j) obj2);
                }
            });
        }

        public static final K2.p Q(C1608a.e eVar, K2.j jVar) {
            Throwable thD = K2.j.d(jVar.i());
            if (thD != null) {
                eVar.a(Z.f289a.b(thD));
            } else {
                Object objI = jVar.i();
                if (K2.j.f(objI)) {
                    objI = null;
                }
                eVar.a(Z.f289a.c((Long) objI));
            }
            return K2.p.f2516a;
        }

        public static final void R(InterfaceC0216y interfaceC0216y, Object obj, final C1608a.e eVar) {
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String?>");
            interfaceC0216y.i((Map) obj2, new W2.l() { // from class: B2.f
                @Override // W2.l
                public final Object k(Object obj3) {
                    return InterfaceC0216y.a.S(eVar, (K2.j) obj3);
                }
            });
        }

        public static final K2.p S(C1608a.e eVar, K2.j jVar) {
            Throwable thD = K2.j.d(jVar.i());
            if (thD != null) {
                eVar.a(Z.f289a.b(thD));
            } else {
                eVar.a(Z.f289a.c(null));
            }
            return K2.p.f2516a;
        }

        public static final void T(InterfaceC0216y interfaceC0216y, Object obj, final C1608a.e eVar) {
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            interfaceC0216y.a((String) ((List) obj).get(0), new W2.l() { // from class: B2.n
                @Override // W2.l
                public final Object k(Object obj2) {
                    return InterfaceC0216y.a.U(eVar, (K2.j) obj2);
                }
            });
        }

        public static final K2.p U(C1608a.e eVar, K2.j jVar) {
            Throwable thD = K2.j.d(jVar.i());
            if (thD != null) {
                eVar.a(Z.f289a.b(thD));
            } else {
                eVar.a(Z.f289a.c(null));
            }
            return K2.p.f2516a;
        }

        public static final void V(InterfaceC0216y interfaceC0216y, Object obj, final C1608a.e eVar) {
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type kotlin.String");
            interfaceC0216y.g((String) obj2, (String) list.get(1), new W2.l() { // from class: B2.k
                @Override // W2.l
                public final Object k(Object obj3) {
                    return InterfaceC0216y.a.W(eVar, (K2.j) obj3);
                }
            });
        }

        public static final K2.p W(C1608a.e eVar, K2.j jVar) {
            Throwable thD = K2.j.d(jVar.i());
            if (thD != null) {
                eVar.a(Z.f289a.b(thD));
            } else {
                eVar.a(Z.f289a.c(null));
            }
            return K2.p.f2516a;
        }

        public static final Y x() {
            return new Y();
        }

        public final InterfaceC1615h y() {
            return (InterfaceC1615h) f317b.getValue();
        }

        public final void z(InterfaceC1609b interfaceC1609b, final InterfaceC0216y interfaceC0216y, String str) {
            String str2;
            X2.l.e(interfaceC1609b, "binaryMessenger");
            X2.l.e(str, "messageChannelSuffix");
            if (str.length() > 0) {
                str2 = '.' + str;
            } else {
                str2 = "";
            }
            C1608a c1608a = new C1608a(interfaceC1609b, "dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.logEvent" + str2, y());
            if (interfaceC0216y != null) {
                c1608a.e(new C1608a.d() { // from class: B2.m
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        InterfaceC0216y.a.N(interfaceC0216y, obj, eVar);
                    }
                });
            } else {
                c1608a.e(null);
            }
            C1608a c1608a2 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.setUserId" + str2, y());
            if (interfaceC0216y != null) {
                c1608a2.e(new C1608a.d() { // from class: B2.r
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        InterfaceC0216y.a.T(interfaceC0216y, obj, eVar);
                    }
                });
            } else {
                c1608a2.e(null);
            }
            C1608a c1608a3 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.setUserProperty" + str2, y());
            if (interfaceC0216y != null) {
                c1608a3.e(new C1608a.d() { // from class: B2.s
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        InterfaceC0216y.a.V(interfaceC0216y, obj, eVar);
                    }
                });
            } else {
                c1608a3.e(null);
            }
            C1608a c1608a4 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.setAnalyticsCollectionEnabled" + str2, y());
            if (interfaceC0216y != null) {
                c1608a4.e(new C1608a.d() { // from class: B2.t
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        InterfaceC0216y.a.B(interfaceC0216y, obj, eVar);
                    }
                });
            } else {
                c1608a4.e(null);
            }
            C1608a c1608a5 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.resetAnalyticsData" + str2, y());
            if (interfaceC0216y != null) {
                c1608a5.e(new C1608a.d() { // from class: B2.u
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        InterfaceC0216y.a.D(interfaceC0216y, obj, eVar);
                    }
                });
            } else {
                c1608a5.e(null);
            }
            C1608a c1608a6 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.setSessionTimeoutDuration" + str2, y());
            if (interfaceC0216y != null) {
                c1608a6.e(new C1608a.d() { // from class: B2.v
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        InterfaceC0216y.a.F(interfaceC0216y, obj, eVar);
                    }
                });
            } else {
                c1608a6.e(null);
            }
            C1608a c1608a7 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.setConsent" + str2, y());
            if (interfaceC0216y != null) {
                c1608a7.e(new C1608a.d() { // from class: B2.w
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        InterfaceC0216y.a.H(interfaceC0216y, obj, eVar);
                    }
                });
            } else {
                c1608a7.e(null);
            }
            C1608a c1608a8 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.setDefaultEventParameters" + str2, y());
            if (interfaceC0216y != null) {
                c1608a8.e(new C1608a.d() { // from class: B2.x
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        InterfaceC0216y.a.J(interfaceC0216y, obj, eVar);
                    }
                });
            } else {
                c1608a8.e(null);
            }
            C1608a c1608a9 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.getAppInstanceId" + str2, y());
            if (interfaceC0216y != null) {
                c1608a9.e(new C1608a.d() { // from class: B2.c
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        InterfaceC0216y.a.L(interfaceC0216y, obj, eVar);
                    }
                });
            } else {
                c1608a9.e(null);
            }
            C1608a c1608a10 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.getSessionId" + str2, y());
            if (interfaceC0216y != null) {
                c1608a10.e(new C1608a.d() { // from class: B2.d
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        InterfaceC0216y.a.P(interfaceC0216y, obj, eVar);
                    }
                });
            } else {
                c1608a10.e(null);
            }
            C1608a c1608a11 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.initiateOnDeviceConversionMeasurement" + str2, y());
            if (interfaceC0216y != null) {
                c1608a11.e(new C1608a.d() { // from class: B2.q
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        InterfaceC0216y.a.R(interfaceC0216y, obj, eVar);
                    }
                });
            } else {
                c1608a11.e(null);
            }
        }
    }

    void a(String str, W2.l lVar);

    void b(W2.l lVar);

    void d(W2.l lVar);

    void e(Map map, W2.l lVar);

    void f(Map map, W2.l lVar);

    void g(String str, String str2, W2.l lVar);

    void h(long j4, W2.l lVar);

    void i(Map map, W2.l lVar);

    void j(boolean z3, W2.l lVar);

    void k(Map map, W2.l lVar);

    void l(W2.l lVar);
}
