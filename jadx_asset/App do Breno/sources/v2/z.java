package v2;

import java.util.ArrayList;
import l2.AbstractC1388b;
import o2.C1472a;
import w2.C1616i;
import w2.C1617j;
import w2.C1622o;

/* JADX INFO: loaded from: classes.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1617j f11767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f11768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1617j.c f11769c;

    public class a implements C1617j.c {
        public a() {
        }

        @Override // w2.C1617j.c
        public void g(C1616i c1616i, C1617j.d dVar) {
            if (z.this.f11768b == null) {
                AbstractC1388b.f("SpellCheckChannel", "No SpellCheckeMethodHandler registered, call not forwarded to spell check API.");
                return;
            }
            String str = c1616i.f11879a;
            Object obj = c1616i.f11880b;
            AbstractC1388b.f("SpellCheckChannel", "Received '" + str + "' message.");
            str.getClass();
            if (!str.equals("SpellCheck.initiateSpellCheck")) {
                dVar.c();
                return;
            }
            try {
                ArrayList arrayList = (ArrayList) obj;
                z.this.f11768b.a((String) arrayList.get(0), (String) arrayList.get(1), dVar);
            } catch (IllegalStateException e4) {
                dVar.b("error", e4.getMessage(), null);
            }
        }
    }

    public interface b {
        void a(String str, String str2, C1617j.d dVar);
    }

    public z(C1472a c1472a) {
        a aVar = new a();
        this.f11769c = aVar;
        C1617j c1617j = new C1617j(c1472a, "flutter/spellcheck", C1622o.f11894b);
        this.f11767a = c1617j;
        c1617j.e(aVar);
    }

    public void b(b bVar) {
        this.f11768b = bVar;
    }
}
