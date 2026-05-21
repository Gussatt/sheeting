package E2;

import E2.h;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import w2.C1608a;
import w2.C1621n;
import w2.InterfaceC1609b;
import w2.InterfaceC1615h;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    public interface a {
        static InterfaceC1615h a() {
            return new C1621n();
        }

        static void b(InterfaceC1609b interfaceC1609b, final a aVar) {
            C1608a c1608a = new C1608a(interfaceC1609b, "dev.flutter.pigeon.PathProviderApi.getTemporaryPath", a(), interfaceC1609b.b());
            if (aVar != null) {
                c1608a.e(new C1608a.d() { // from class: E2.a
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        h.a.p(this.f989a, obj, eVar);
                    }
                });
            } else {
                c1608a.e(null);
            }
            C1608a c1608a2 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.PathProviderApi.getApplicationSupportPath", a(), interfaceC1609b.b());
            if (aVar != null) {
                c1608a2.e(new C1608a.d() { // from class: E2.b
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        h.a.l(this.f990a, obj, eVar);
                    }
                });
            } else {
                c1608a2.e(null);
            }
            C1608a c1608a3 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.PathProviderApi.getApplicationDocumentsPath", a(), interfaceC1609b.b());
            if (aVar != null) {
                c1608a3.e(new C1608a.d() { // from class: E2.c
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        h.a.d(this.f991a, obj, eVar);
                    }
                });
            } else {
                c1608a3.e(null);
            }
            C1608a c1608a4 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.PathProviderApi.getApplicationCachePath", a(), interfaceC1609b.b());
            if (aVar != null) {
                c1608a4.e(new C1608a.d() { // from class: E2.d
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        h.a.m(this.f992a, obj, eVar);
                    }
                });
            } else {
                c1608a4.e(null);
            }
            C1608a c1608a5 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.PathProviderApi.getExternalStoragePath", a(), interfaceC1609b.b());
            if (aVar != null) {
                c1608a5.e(new C1608a.d() { // from class: E2.e
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        h.a.i(this.f993a, obj, eVar);
                    }
                });
            } else {
                c1608a5.e(null);
            }
            C1608a c1608a6 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.PathProviderApi.getExternalCachePaths", a(), interfaceC1609b.b());
            if (aVar != null) {
                c1608a6.e(new C1608a.d() { // from class: E2.f
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        h.a.n(this.f994a, obj, eVar);
                    }
                });
            } else {
                c1608a6.e(null);
            }
            C1608a c1608a7 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.PathProviderApi.getExternalStoragePaths", a(), interfaceC1609b.b());
            if (aVar != null) {
                c1608a7.e(new C1608a.d() { // from class: E2.g
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        h.a.k(this.f995a, obj, eVar);
                    }
                });
            } else {
                c1608a7.e(null);
            }
        }

        static /* synthetic */ void d(a aVar, Object obj, C1608a.e eVar) {
            ArrayList arrayList = new ArrayList();
            try {
                arrayList.add(0, aVar.g());
            } catch (Throwable th) {
                arrayList = h.a(th);
            }
            eVar.a(arrayList);
        }

        static /* synthetic */ void i(a aVar, Object obj, C1608a.e eVar) {
            ArrayList arrayList = new ArrayList();
            try {
                arrayList.add(0, aVar.o());
            } catch (Throwable th) {
                arrayList = h.a(th);
            }
            eVar.a(arrayList);
        }

        static /* synthetic */ void k(a aVar, Object obj, C1608a.e eVar) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, aVar.q(arrayList2.get(0) == null ? null : b.values()[((Integer) arrayList2.get(0)).intValue()]));
            } catch (Throwable th) {
                arrayList = h.a(th);
            }
            eVar.a(arrayList);
        }

        static /* synthetic */ void l(a aVar, Object obj, C1608a.e eVar) {
            ArrayList arrayList = new ArrayList();
            try {
                arrayList.add(0, aVar.j());
            } catch (Throwable th) {
                arrayList = h.a(th);
            }
            eVar.a(arrayList);
        }

        static /* synthetic */ void m(a aVar, Object obj, C1608a.e eVar) {
            ArrayList arrayList = new ArrayList();
            try {
                arrayList.add(0, aVar.f());
            } catch (Throwable th) {
                arrayList = h.a(th);
            }
            eVar.a(arrayList);
        }

        static /* synthetic */ void n(a aVar, Object obj, C1608a.e eVar) {
            ArrayList arrayList = new ArrayList();
            try {
                arrayList.add(0, aVar.h());
            } catch (Throwable th) {
                arrayList = h.a(th);
            }
            eVar.a(arrayList);
        }

        static /* synthetic */ void p(a aVar, Object obj, C1608a.e eVar) {
            ArrayList arrayList = new ArrayList();
            try {
                arrayList.add(0, aVar.e());
            } catch (Throwable th) {
                arrayList = h.a(th);
            }
            eVar.a(arrayList);
        }

        String e();

        String f();

        String g();

        List h();

        String j();

        String o();

        List q(b bVar);
    }

    public enum b {
        ROOT(0),
        MUSIC(1),
        PODCASTS(2),
        RINGTONES(3),
        ALARMS(4),
        NOTIFICATIONS(5),
        PICTURES(6),
        MOVIES(7),
        DOWNLOADS(8),
        DCIM(9),
        DOCUMENTS(10);


        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f1008m;

        b(int i4) {
            this.f1008m = i4;
        }
    }

    public static ArrayList a(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }
}
