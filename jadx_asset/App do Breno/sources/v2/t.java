package v2;

import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import l2.AbstractC1388b;
import o2.C1472a;
import w2.C1616i;
import w2.C1617j;
import w2.C1622o;

/* JADX INFO: loaded from: classes.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1617j f11723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f11724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1617j.c f11725c;

    public class a implements C1617j.c {
        public a() {
        }

        private void a(C1616i c1616i, C1617j.d dVar) {
            try {
                t.this.f11724b.c(((Integer) c1616i.b()).intValue());
                dVar.a(null);
            } catch (IllegalStateException e4) {
                dVar.b("error", t.c(e4), null);
            }
        }

        private void b(C1616i c1616i, C1617j.d dVar) {
            Map map = (Map) c1616i.b();
            try {
                t.this.f11724b.e(p.a(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), ((Integer) map.get("direction")).intValue(), map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null));
                dVar.a(null);
            } catch (IllegalStateException e4) {
                dVar.b("error", t.c(e4), null);
            }
        }

        private void c(C1616i c1616i, C1617j.d dVar) {
            try {
                t.this.f11724b.d(((Integer) ((Map) c1616i.b()).get("id")).intValue());
                dVar.a(null);
            } catch (IllegalStateException e4) {
                dVar.b("error", t.c(e4), null);
            }
        }

        private void e(C1616i c1616i, C1617j.d dVar) {
            Map map = (Map) c1616i.b();
            try {
                t.this.f11724b.a(((Integer) map.get("id")).intValue(), ((Integer) map.get("direction")).intValue());
                dVar.a(null);
            } catch (IllegalStateException e4) {
                dVar.b("error", t.c(e4), null);
            }
        }

        private void f(C1616i c1616i, C1617j.d dVar) {
            List list = (List) c1616i.b();
            try {
                t.this.f11724b.b(new q(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                dVar.a(null);
            } catch (IllegalStateException e4) {
                dVar.b("error", t.c(e4), null);
            }
        }

        public final void d(C1616i c1616i, C1617j.d dVar) {
            dVar.a(Boolean.valueOf(t.this.f11724b.f()));
        }

        @Override // w2.C1617j.c
        public void g(C1616i c1616i, C1617j.d dVar) {
            if (t.this.f11724b == null) {
            }
            AbstractC1388b.f("PlatformViewsChannel2", "Received '" + c1616i.f11879a + "' message.");
            String str = c1616i.f11879a;
            str.getClass();
            switch (str) {
                case "create":
                    b(c1616i, dVar);
                    break;
                case "clearFocus":
                    a(c1616i, dVar);
                    break;
                case "touch":
                    f(c1616i, dVar);
                    break;
                case "setDirection":
                    e(c1616i, dVar);
                    break;
                case "isSurfaceControlEnabled":
                    d(c1616i, dVar);
                    break;
                case "dispose":
                    c(c1616i, dVar);
                    break;
                default:
                    dVar.c();
                    break;
            }
        }
    }

    public interface b {
        void a(int i4, int i5);

        void b(q qVar);

        void c(int i4);

        void d(int i4);

        void e(p pVar);

        boolean f();
    }

    public t(C1472a c1472a) {
        a aVar = new a();
        this.f11725c = aVar;
        C1617j c1617j = new C1617j(c1472a, "flutter/platform_views_2", C1622o.f11894b);
        this.f11723a = c1617j;
        c1617j.e(aVar);
    }

    public static String c(Exception exc) {
        return AbstractC1388b.d(exc);
    }

    public void d(int i4) {
        C1617j c1617j = this.f11723a;
        if (c1617j == null) {
            return;
        }
        c1617j.c("viewFocused", Integer.valueOf(i4));
    }

    public void e(b bVar) {
        this.f11724b = bVar;
    }
}
