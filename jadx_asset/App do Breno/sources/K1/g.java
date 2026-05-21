package K1;

import C1.AbstractC0252j;
import C1.I;
import C1.J;
import C1.K;
import C1.O;
import C1.j0;
import K1.g;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import n1.AbstractC1445l;
import n1.AbstractC1448o;
import n1.C1446m;
import n1.InterfaceC1444k;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f2480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f2481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final I f2482d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final K1.a f2483e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f2484f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final J f2485g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference f2486h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicReference f2487i;

    public class a implements InterfaceC1444k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ D1.f f2488a;

        public a(D1.f fVar) {
            this.f2488a = fVar;
        }

        @Override // n1.InterfaceC1444k
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public AbstractC1445l a(Void r5) throws Throwable {
            JSONObject jSONObject = (JSONObject) this.f2488a.f880d.c().submit(new Callable() { // from class: K1.f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    g.a aVar = this.f2478a;
                    return g.this.f2484f.a(g.this.f2480b, true);
                }
            }).get();
            if (jSONObject != null) {
                d dVarB = g.this.f2481c.b(jSONObject);
                g.this.f2483e.c(dVarB.f2463c, jSONObject);
                g.this.q(jSONObject, "Loaded settings: ");
                g gVar = g.this;
                gVar.r(gVar.f2480b.f2496f);
                g.this.f2486h.set(dVarB);
                ((C1446m) g.this.f2487i.get()).e(dVarB);
            }
            return AbstractC1448o.e(null);
        }
    }

    public g(Context context, k kVar, I i4, h hVar, K1.a aVar, l lVar, J j4) {
        AtomicReference atomicReference = new AtomicReference();
        this.f2486h = atomicReference;
        this.f2487i = new AtomicReference(new C1446m());
        this.f2479a = context;
        this.f2480b = kVar;
        this.f2482d = i4;
        this.f2481c = hVar;
        this.f2483e = aVar;
        this.f2484f = lVar;
        this.f2485g = j4;
        atomicReference.set(b.b(i4));
    }

    public static g l(Context context, String str, O o4, H1.b bVar, String str2, String str3, I1.g gVar, J j4) {
        String strG = o4.g();
        j0 j0Var = new j0();
        return new g(context, new k(str, o4.h(), o4.i(), o4.j(), o4, AbstractC0252j.h(AbstractC0252j.m(context), str, str3, str2), str3, str2, K.f(strG).g()), j0Var, new h(j0Var), new K1.a(gVar), new c(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str), bVar), j4);
    }

    @Override // K1.j
    public AbstractC1445l a() {
        return ((C1446m) this.f2487i.get()).a();
    }

    @Override // K1.j
    public d b() {
        return (d) this.f2486h.get();
    }

    public boolean k() {
        return !n().equals(this.f2480b.f2496f);
    }

    public final d m(e eVar) throws Throwable {
        d dVar = null;
        try {
            if (!e.SKIP_CACHE_LOOKUP.equals(eVar)) {
                JSONObject jSONObjectB = this.f2483e.b();
                if (jSONObjectB != null) {
                    d dVarB = this.f2481c.b(jSONObjectB);
                    if (dVarB == null) {
                        z1.g.f().e("Failed to parse cached settings data.", null);
                        return null;
                    }
                    q(jSONObjectB, "Loaded cached settings: ");
                    long jA = this.f2482d.a();
                    if (!e.IGNORE_CACHE_EXPIRATION.equals(eVar) && dVarB.a(jA)) {
                        z1.g.f().i("Cached settings have expired.");
                        return null;
                    }
                    try {
                        z1.g.f().i("Returning cached settings.");
                        return dVarB;
                    } catch (Exception e4) {
                        e = e4;
                        dVar = dVarB;
                        z1.g.f().e("Failed to get cached settings", e);
                        return dVar;
                    }
                }
                z1.g.f().b("No cached settings data found.");
            }
            return null;
        } catch (Exception e5) {
            e = e5;
        }
    }

    public final String n() {
        return AbstractC0252j.q(this.f2479a).getString("existing_instance_identifier", "");
    }

    public AbstractC1445l o(D1.f fVar) {
        return p(e.USE_CACHE, fVar);
    }

    public AbstractC1445l p(e eVar, D1.f fVar) throws Throwable {
        d dVarM;
        if (!k() && (dVarM = m(eVar)) != null) {
            this.f2486h.set(dVarM);
            ((C1446m) this.f2487i.get()).e(dVarM);
            return AbstractC1448o.e(null);
        }
        d dVarM2 = m(e.IGNORE_CACHE_EXPIRATION);
        if (dVarM2 != null) {
            this.f2486h.set(dVarM2);
            ((C1446m) this.f2487i.get()).e(dVarM2);
        }
        return this.f2485g.k().n(fVar.f877a, new a(fVar));
    }

    public final void q(JSONObject jSONObject, String str) {
        z1.g.f().b(str + jSONObject.toString());
    }

    public final boolean r(String str) {
        SharedPreferences.Editor editorEdit = AbstractC0252j.q(this.f2479a).edit();
        editorEdit.putString("existing_instance_identifier", str);
        editorEdit.apply();
        return true;
    }
}
