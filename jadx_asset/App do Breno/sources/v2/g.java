package v2;

import java.util.HashMap;
import java.util.Map;
import l2.C1387a;
import o2.C1472a;
import p2.InterfaceC1487a;
import w2.C1616i;
import w2.C1617j;
import w2.C1622o;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1617j f11602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map f11603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1617j.c f11604c;

    public class a implements C1617j.c {
        public a() {
        }

        @Override // w2.C1617j.c
        public void g(C1616i c1616i, C1617j.d dVar) {
            g.a(g.this);
        }
    }

    public g(C1472a c1472a) {
        a aVar = new a();
        this.f11604c = aVar;
        C1617j c1617j = new C1617j(c1472a, "flutter/deferredcomponent", C1622o.f11894b);
        this.f11602a = c1617j;
        c1617j.e(aVar);
        C1387a.e().a();
        this.f11603b = new HashMap();
    }

    public static /* synthetic */ InterfaceC1487a a(g gVar) {
        gVar.getClass();
        return null;
    }
}
