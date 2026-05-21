package v2;

import java.util.HashMap;
import l2.AbstractC1388b;
import o2.C1472a;
import w2.C1613f;
import w2.C1616i;
import w2.C1617j;

/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1617j f11633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1617j.c f11634b;

    public class a implements C1617j.c {
        public a() {
        }

        @Override // w2.C1617j.c
        public void g(C1616i c1616i, C1617j.d dVar) {
            dVar.a(null);
        }
    }

    public n(C1472a c1472a) {
        a aVar = new a();
        this.f11634b = aVar;
        C1617j c1617j = new C1617j(c1472a, "flutter/navigation", C1613f.f11878a);
        this.f11633a = c1617j;
        c1617j.e(aVar);
    }

    public void a() {
        AbstractC1388b.f("NavigationChannel", "Sending message to pop route.");
        this.f11633a.c("popRoute", null);
    }

    public void b(String str) {
        AbstractC1388b.f("NavigationChannel", "Sending message to push route information '" + str + "'");
        HashMap map = new HashMap();
        map.put("location", str);
        this.f11633a.c("pushRouteInformation", map);
    }

    public void c(String str) {
        AbstractC1388b.f("NavigationChannel", "Sending message to set initial route to '" + str + "'");
        this.f11633a.c("setInitialRoute", str);
    }
}
