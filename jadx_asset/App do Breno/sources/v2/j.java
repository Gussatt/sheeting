package v2;

import java.util.HashMap;
import java.util.Map;
import w2.C1616i;
import w2.C1617j;
import w2.C1622o;
import w2.InterfaceC1609b;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1617j f11610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f11611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1617j.c f11612c;

    public class a implements C1617j.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Map f11613c = new HashMap();

        public a() {
        }

        @Override // w2.C1617j.c
        public void g(C1616i c1616i, C1617j.d dVar) {
            if (j.this.f11611b == null) {
                dVar.a(this.f11613c);
                return;
            }
            String str = c1616i.f11879a;
            str.getClass();
            if (!str.equals("getKeyboardState")) {
                dVar.c();
                return;
            }
            try {
                this.f11613c = j.this.f11611b.a();
            } catch (IllegalStateException e4) {
                dVar.b("error", e4.getMessage(), null);
            }
            dVar.a(this.f11613c);
        }
    }

    public interface b {
        Map a();
    }

    public j(InterfaceC1609b interfaceC1609b) {
        a aVar = new a();
        this.f11612c = aVar;
        C1617j c1617j = new C1617j(interfaceC1609b, "flutter/keyboard", C1622o.f11894b);
        this.f11610a = c1617j;
        c1617j.e(aVar);
    }

    public void b(b bVar) {
        this.f11611b = bVar;
    }
}
