package v2;

import android.os.Build;
import l2.AbstractC1388b;
import o2.C1472a;
import w2.C1613f;
import w2.C1616i;
import w2.C1617j;

/* JADX INFO: loaded from: classes.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1617j f11742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f11743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1617j.c f11744c;

    public class a implements C1617j.c {
        public a() {
        }

        @Override // w2.C1617j.c
        public void g(C1616i c1616i, C1617j.d dVar) {
            if (w.this.f11743b == null) {
                AbstractC1388b.f("ScribeChannel", "No ScribeMethodHandler registered. Scribe call not handled.");
            }
            String str = c1616i.f11879a;
            AbstractC1388b.f("ScribeChannel", "Received '" + str + "' message.");
            str.getClass();
            switch (str) {
                case "Scribe.isFeatureAvailable":
                    w.this.e(c1616i, dVar);
                    break;
                case "Scribe.startStylusHandwriting":
                    w.this.h(c1616i, dVar);
                    break;
                case "Scribe.isStylusHandwritingAvailable":
                    w.this.f(c1616i, dVar);
                    break;
                default:
                    dVar.c();
                    break;
            }
        }
    }

    public interface b {
        boolean a();

        void b();

        boolean c();
    }

    public w(C1472a c1472a) {
        a aVar = new a();
        this.f11744c = aVar;
        C1617j c1617j = new C1617j(c1472a, "flutter/scribe", C1613f.f11878a);
        this.f11742a = c1617j;
        c1617j.e(aVar);
    }

    public final void e(C1616i c1616i, C1617j.d dVar) {
        try {
            dVar.a(Boolean.valueOf(this.f11743b.a()));
        } catch (IllegalStateException e4) {
            dVar.b("error", e4.getMessage(), null);
        }
    }

    public final void f(C1616i c1616i, C1617j.d dVar) {
        if (Build.VERSION.SDK_INT < 34) {
            dVar.b("error", "Requires API level 34 or higher.", null);
            return;
        }
        try {
            dVar.a(Boolean.valueOf(this.f11743b.c()));
        } catch (IllegalStateException e4) {
            dVar.b("error", e4.getMessage(), null);
        }
    }

    public void g(b bVar) {
        this.f11743b = bVar;
    }

    public final void h(C1616i c1616i, C1617j.d dVar) {
        if (Build.VERSION.SDK_INT < 33) {
            dVar.b("error", "Requires API level 33 or higher.", null);
            return;
        }
        try {
            this.f11743b.b();
            dVar.a(null);
        } catch (IllegalStateException e4) {
            dVar.b("error", e4.getMessage(), null);
        }
    }
}
