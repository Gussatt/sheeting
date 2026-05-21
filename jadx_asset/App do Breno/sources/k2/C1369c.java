package k2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import w2.C1617j;

/* JADX INFO: renamed from: k2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1369c extends AbstractC1367a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f10034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f10035b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10036c;

    /* JADX INFO: renamed from: k2.c$a */
    public class a implements InterfaceC1372f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f10037a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f10038b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f10039c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f10040d;

        public a() {
        }

        @Override // k2.InterfaceC1372f
        public void a(Object obj) {
            this.f10037a = obj;
        }

        @Override // k2.InterfaceC1372f
        public void b(String str, String str2, Object obj) {
            this.f10038b = str;
            this.f10039c = str2;
            this.f10040d = obj;
        }
    }

    public C1369c(Map map, boolean z3) {
        this.f10034a = map;
        this.f10036c = z3;
    }

    @Override // k2.InterfaceC1371e
    public Object c(String str) {
        return this.f10034a.get(str);
    }

    @Override // k2.AbstractC1368b, k2.InterfaceC1371e
    public boolean e() {
        return this.f10036c;
    }

    @Override // k2.InterfaceC1371e
    public String i() {
        return (String) this.f10034a.get("method");
    }

    @Override // k2.InterfaceC1371e
    public boolean j(String str) {
        return this.f10034a.containsKey(str);
    }

    @Override // k2.AbstractC1367a
    public InterfaceC1372f o() {
        return this.f10035b;
    }

    public Map p() {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map2.put("code", this.f10035b.f10038b);
        map2.put("message", this.f10035b.f10039c);
        map2.put("data", this.f10035b.f10040d);
        map.put("error", map2);
        return map;
    }

    public Map q() {
        HashMap map = new HashMap();
        map.put("result", this.f10035b.f10037a);
        return map;
    }

    public void r(C1617j.d dVar) {
        a aVar = this.f10035b;
        dVar.b(aVar.f10038b, aVar.f10039c, aVar.f10040d);
    }

    public void s(List list) {
        if (e()) {
            return;
        }
        list.add(p());
    }

    public void t(List list) {
        if (e()) {
            return;
        }
        list.add(q());
    }
}
