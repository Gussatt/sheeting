package v2;

import l2.AbstractC1388b;
import o2.C1472a;
import w2.C1616i;
import w2.C1617j;
import w2.C1622o;

/* JADX INFO: loaded from: classes.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1617j f11746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f11747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1617j.c f11748c;

    public class a implements C1617j.c {
        public a() {
        }

        @Override // w2.C1617j.c
        public void g(C1616i c1616i, C1617j.d dVar) {
            String str;
            if (x.this.f11747b == null) {
                return;
            }
            str = c1616i.f11879a;
            AbstractC1388b.f("SensitiveContentChannel", "Received '" + str + "' message.");
            str.getClass();
            switch (str) {
                case "SensitiveContent.getContentSensitivity":
                    try {
                        dVar.a(Integer.valueOf(x.this.e(x.this.f11747b.b())));
                        break;
                    } catch (IllegalArgumentException | IllegalStateException e4) {
                        dVar.b("error", e4.getMessage(), null);
                        return;
                    }
                    break;
                case "SensitiveContent.setContentSensitivity":
                    try {
                        x.this.f11747b.c(x.this.d(((Integer) c1616i.b()).intValue()));
                        break;
                    } catch (IllegalArgumentException | IllegalStateException e5) {
                        dVar.b("error", e5.getMessage(), null);
                        return;
                    }
                    break;
                case "SensitiveContent.isSupported":
                    dVar.a(Boolean.valueOf(x.this.f11747b.a()));
                    break;
                default:
                    AbstractC1388b.f("SensitiveContentChannel", "Method " + str + " is not implemented for the SensitiveContentChannel.");
                    dVar.c();
                    break;
            }
        }
    }

    public interface b {
        boolean a();

        int b();

        void c(int i4);
    }

    public x(C1472a c1472a) {
        a aVar = new a();
        this.f11748c = aVar;
        C1617j c1617j = new C1617j(c1472a, "flutter/sensitivecontent", C1622o.f11894b);
        this.f11746a = c1617j;
        c1617j.e(aVar);
    }

    public final int d(int i4) {
        if (i4 == 0) {
            return 0;
        }
        if (i4 == 1) {
            return 1;
        }
        if (i4 == 2) {
            return 2;
        }
        throw new IllegalArgumentException("contentSensitivityIndex " + i4 + " not known to the SensitiveContentChannel.");
    }

    public final int e(int i4) {
        if (i4 == 0) {
            return 0;
        }
        int i5 = 1;
        if (i4 != 1) {
            i5 = 2;
            if (i4 != 2) {
                return 3;
            }
        }
        return i5;
    }

    public void f(b bVar) {
        this.f11747b = bVar;
    }
}
