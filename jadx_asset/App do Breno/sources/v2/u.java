package v2;

import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Map;
import o2.C1472a;
import w2.C1616i;
import w2.C1617j;
import w2.C1622o;

/* JADX INFO: loaded from: classes.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1617j f11727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PackageManager f11728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f11729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1617j.c f11730d;

    public class a implements C1617j.c {
        public a() {
        }

        @Override // w2.C1617j.c
        public void g(C1616i c1616i, C1617j.d dVar) {
            if (u.this.f11729c == null) {
                return;
            }
            String str = c1616i.f11879a;
            Object obj = c1616i.f11880b;
            str.getClass();
            if (!str.equals("ProcessText.processTextAction")) {
                if (!str.equals("ProcessText.queryTextActions")) {
                    dVar.c();
                    return;
                }
                try {
                    dVar.a(u.this.f11729c.e());
                    return;
                } catch (IllegalStateException e4) {
                    dVar.b("error", e4.getMessage(), null);
                    return;
                }
            }
            try {
                ArrayList arrayList = (ArrayList) obj;
                u.this.f11729c.b((String) arrayList.get(0), (String) arrayList.get(1), ((Boolean) arrayList.get(2)).booleanValue(), dVar);
            } catch (IllegalStateException e5) {
                dVar.b("error", e5.getMessage(), null);
            }
        }
    }

    public interface b {
        void b(String str, String str2, boolean z3, C1617j.d dVar);

        Map e();
    }

    public u(C1472a c1472a, PackageManager packageManager) {
        a aVar = new a();
        this.f11730d = aVar;
        this.f11728b = packageManager;
        C1617j c1617j = new C1617j(c1472a, "flutter/processtext", C1622o.f11894b);
        this.f11727a = c1617j;
        c1617j.e(aVar);
    }

    public void b(b bVar) {
        this.f11729c = bVar;
    }
}
