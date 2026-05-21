package v2;

import java.util.HashMap;
import java.util.Map;
import l2.AbstractC1388b;
import o2.C1472a;
import w2.C1616i;
import w2.C1617j;
import w2.C1622o;

/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f11733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1617j f11734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1617j.d f11735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f11736e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f11737f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1617j.c f11738g;

    public class b implements C1617j.c {
        public b() {
        }

        @Override // w2.C1617j.c
        public void g(C1616i c1616i, C1617j.d dVar) {
            String str = c1616i.f11879a;
            Object obj = c1616i.f11880b;
            str.getClass();
            if (!str.equals("get")) {
                if (!str.equals("put")) {
                    dVar.c();
                    return;
                }
                v.this.f11733b = (byte[]) obj;
                dVar.a(null);
                return;
            }
            v.this.f11737f = true;
            if (!v.this.f11736e) {
                v vVar = v.this;
                if (vVar.f11732a) {
                    vVar.f11735d = dVar;
                    return;
                }
            }
            v vVar2 = v.this;
            dVar.a(vVar2.i(vVar2.f11733b));
        }
    }

    public v(C1472a c1472a, boolean z3) {
        this(new C1617j(c1472a, "flutter/restoration", C1622o.f11894b), z3);
    }

    public void g() {
        this.f11733b = null;
    }

    public byte[] h() {
        return this.f11733b;
    }

    public final Map i(byte[] bArr) {
        HashMap map = new HashMap();
        map.put("enabled", Boolean.TRUE);
        map.put("data", bArr);
        return map;
    }

    public void j(byte[] bArr) {
        this.f11736e = true;
        C1617j.d dVar = this.f11735d;
        if (dVar != null) {
            dVar.a(i(bArr));
            this.f11735d = null;
            this.f11733b = bArr;
        } else if (this.f11737f) {
            this.f11734c.d("push", i(bArr), new a(bArr));
        } else {
            this.f11733b = bArr;
        }
    }

    public v(C1617j c1617j, boolean z3) {
        this.f11736e = false;
        this.f11737f = false;
        b bVar = new b();
        this.f11738g = bVar;
        this.f11734c = c1617j;
        this.f11732a = z3;
        c1617j.e(bVar);
    }

    public class a implements C1617j.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ byte[] f11739a;

        public a(byte[] bArr) {
            this.f11739a = bArr;
        }

        @Override // w2.C1617j.d
        public void a(Object obj) {
            v.this.f11733b = this.f11739a;
        }

        @Override // w2.C1617j.d
        public void b(String str, String str2, Object obj) {
            AbstractC1388b.b("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
        }

        @Override // w2.C1617j.d
        public void c() {
        }
    }
}
