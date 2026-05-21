package v2;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l2.AbstractC1388b;
import o2.C1472a;
import v2.s;
import w2.C1616i;
import w2.C1617j;
import w2.C1622o;

/* JADX INFO: loaded from: classes.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1617j f11714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f11715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1617j.c f11716c;

    public class a implements C1617j.c {
        public a() {
        }

        public static /* synthetic */ void a(C1617j.d dVar, c cVar) {
            if (cVar == null) {
                dVar.b("error", "Failed to resize the platform view", null);
                return;
            }
            HashMap map = new HashMap();
            map.put("width", Double.valueOf(cVar.f11718a));
            map.put("height", Double.valueOf(cVar.f11719b));
            dVar.a(map);
        }

        public final void b(C1616i c1616i, C1617j.d dVar) {
            try {
                s.this.f11715b.c(((Integer) c1616i.b()).intValue());
                dVar.a(null);
            } catch (IllegalStateException e4) {
                dVar.b("error", s.c(e4), null);
            }
        }

        public final void c(C1616i c1616i, C1617j.d dVar) {
            Map map = (Map) c1616i.b();
            boolean z3 = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
            ByteBuffer byteBufferWrap = map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null;
            try {
                if (z3) {
                    s.this.f11715b.m(p.b(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), ((Integer) map.get("direction")).intValue(), byteBufferWrap));
                    dVar.a(null);
                    return;
                }
                boolean z4 = map.containsKey("hybridFallback") && ((Boolean) map.get("hybridFallback")).booleanValue();
                long jF = s.this.f11715b.f(p.c(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), map.containsKey("top") ? ((Double) map.get("top")).doubleValue() : 0.0d, map.containsKey("left") ? ((Double) map.get("left")).doubleValue() : 0.0d, ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), z4, byteBufferWrap));
                if (jF != -2) {
                    dVar.a(Long.valueOf(jF));
                } else {
                    if (!z4) {
                        throw new AssertionError("Platform view attempted to fall back to hybrid mode when not requested.");
                    }
                    dVar.a(null);
                }
            } catch (IllegalStateException e4) {
                dVar.b("error", s.c(e4), null);
            }
        }

        public final void d(C1616i c1616i, C1617j.d dVar) {
            try {
                s.this.f11715b.d(((Integer) ((Map) c1616i.b()).get("id")).intValue());
                dVar.a(null);
            } catch (IllegalStateException e4) {
                dVar.b("error", s.c(e4), null);
            }
        }

        public final void e(C1616i c1616i, C1617j.d dVar) {
            Map map = (Map) c1616i.b();
            try {
                s.this.f11715b.i(((Integer) map.get("id")).intValue(), ((Double) map.get("top")).doubleValue(), ((Double) map.get("left")).doubleValue());
                dVar.a(null);
            } catch (IllegalStateException e4) {
                dVar.b("error", s.c(e4), null);
            }
        }

        public final void f(C1616i c1616i, final C1617j.d dVar) {
            Map map = (Map) c1616i.b();
            try {
                s.this.f11715b.e(new d(((Integer) map.get("id")).intValue(), ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue()), new b() { // from class: v2.r
                    @Override // v2.s.b
                    public final void a(s.c cVar) {
                        s.a.a(dVar, cVar);
                    }
                });
            } catch (IllegalStateException e4) {
                dVar.b("error", s.c(e4), null);
            }
        }

        @Override // w2.C1617j.c
        public void g(C1616i c1616i, C1617j.d dVar) {
            if (s.this.f11715b == null) {
            }
            AbstractC1388b.f("PlatformViewsChannel", "Received '" + c1616i.f11879a + "' message.");
            String str = c1616i.f11879a;
            str.getClass();
            switch (str) {
                case "create":
                    c(c1616i, dVar);
                    break;
                case "offset":
                    e(c1616i, dVar);
                    break;
                case "resize":
                    f(c1616i, dVar);
                    break;
                case "clearFocus":
                    b(c1616i, dVar);
                    break;
                case "synchronizeToNativeViewHierarchy":
                    i(c1616i, dVar);
                    break;
                case "touch":
                    j(c1616i, dVar);
                    break;
                case "setDirection":
                    h(c1616i, dVar);
                    break;
                case "dispose":
                    d(c1616i, dVar);
                    break;
                default:
                    dVar.c();
                    break;
            }
        }

        public final void h(C1616i c1616i, C1617j.d dVar) {
            Map map = (Map) c1616i.b();
            try {
                s.this.f11715b.a(((Integer) map.get("id")).intValue(), ((Integer) map.get("direction")).intValue());
                dVar.a(null);
            } catch (IllegalStateException e4) {
                dVar.b("error", s.c(e4), null);
            }
        }

        public final void i(C1616i c1616i, C1617j.d dVar) {
            try {
                s.this.f11715b.g(((Boolean) c1616i.b()).booleanValue());
                dVar.a(null);
            } catch (IllegalStateException e4) {
                dVar.b("error", s.c(e4), null);
            }
        }

        public final void j(C1616i c1616i, C1617j.d dVar) {
            List list = (List) c1616i.b();
            try {
                s.this.f11715b.b(new q(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                dVar.a(null);
            } catch (IllegalStateException e4) {
                dVar.b("error", s.c(e4), null);
            }
        }
    }

    public interface b {
        void a(c cVar);
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f11718a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f11719b;

        public c(int i4, int i5) {
            this.f11718a = i4;
            this.f11719b = i5;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f11720a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f11721b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final double f11722c;

        public d(int i4, double d4, double d5) {
            this.f11720a = i4;
            this.f11721b = d4;
            this.f11722c = d5;
        }
    }

    public interface e {
        void a(int i4, int i5);

        void b(q qVar);

        void c(int i4);

        void d(int i4);

        void e(d dVar, b bVar);

        long f(p pVar);

        void g(boolean z3);

        void i(int i4, double d4, double d5);

        void m(p pVar);
    }

    public s(C1472a c1472a) {
        a aVar = new a();
        this.f11716c = aVar;
        C1617j c1617j = new C1617j(c1472a, "flutter/platform_views", C1622o.f11894b);
        this.f11714a = c1617j;
        c1617j.e(aVar);
    }

    public static String c(Exception exc) {
        return AbstractC1388b.d(exc);
    }

    public void d(int i4) {
        C1617j c1617j = this.f11714a;
        if (c1617j == null) {
            return;
        }
        c1617j.c("viewFocused", Integer.valueOf(i4));
    }

    public void e(e eVar) {
        this.f11715b = eVar;
    }
}
