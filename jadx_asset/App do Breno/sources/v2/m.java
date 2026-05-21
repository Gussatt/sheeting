package v2;

import java.util.HashMap;
import l2.AbstractC1388b;
import o2.C1472a;
import w2.C1616i;
import w2.C1617j;
import w2.C1622o;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1617j f11629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f11630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1617j.c f11631c;

    public class a implements C1617j.c {
        public a() {
        }

        @Override // w2.C1617j.c
        public void g(C1616i c1616i, C1617j.d dVar) {
            if (m.this.f11630b == null) {
                return;
            }
            String str = c1616i.f11879a;
            AbstractC1388b.f("MouseCursorChannel", "Received '" + str + "' message.");
            try {
                if (str.hashCode() == -1307105544 && str.equals("activateSystemCursor")) {
                    try {
                        m.this.f11630b.a((String) ((HashMap) c1616i.f11880b).get("kind"));
                        dVar.a(Boolean.TRUE);
                    } catch (Exception e4) {
                        dVar.b("error", "Error when setting cursors: " + e4.getMessage(), null);
                    }
                }
            } catch (Exception e5) {
                dVar.b("error", "Unhandled error: " + e5.getMessage(), null);
            }
        }
    }

    public interface b {
        void a(String str);
    }

    public m(C1472a c1472a) {
        a aVar = new a();
        this.f11631c = aVar;
        C1617j c1617j = new C1617j(c1472a, "flutter/mousecursor", C1622o.f11894b);
        this.f11629a = c1617j;
        c1617j.e(aVar);
    }

    public void b(b bVar) {
        this.f11630b = bVar;
    }
}
