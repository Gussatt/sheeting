package O;

import W2.l;
import X2.m;
import android.content.Context;
import d3.i;
import h3.I;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Z2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M.b f2826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f2827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final I f2828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f2829e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile L.h f2830f;

    public static final class a extends m implements W2.a {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Context f2831n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ c f2832o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, c cVar) {
            super(0);
            this.f2831n = context;
            this.f2832o = cVar;
        }

        @Override // W2.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File e() {
            Context context = this.f2831n;
            X2.l.d(context, "applicationContext");
            return b.a(context, this.f2832o.f2825a);
        }
    }

    public c(String str, M.b bVar, l lVar, I i4) {
        X2.l.e(str, "name");
        X2.l.e(lVar, "produceMigrations");
        X2.l.e(i4, "scope");
        this.f2825a = str;
        this.f2826b = bVar;
        this.f2827c = lVar;
        this.f2828d = i4;
        this.f2829e = new Object();
    }

    @Override // Z2.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public L.h a(Context context, i iVar) {
        L.h hVar;
        X2.l.e(context, "thisRef");
        X2.l.e(iVar, "property");
        L.h hVar2 = this.f2830f;
        if (hVar2 != null) {
            return hVar2;
        }
        synchronized (this.f2829e) {
            try {
                if (this.f2830f == null) {
                    Context applicationContext = context.getApplicationContext();
                    P.e eVar = P.e.f2884a;
                    M.b bVar = this.f2826b;
                    l lVar = this.f2827c;
                    X2.l.d(applicationContext, "applicationContext");
                    this.f2830f = eVar.b(bVar, (List) lVar.k(applicationContext), this.f2828d, new a(applicationContext, this));
                }
                hVar = this.f2830f;
                X2.l.b(hVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }
}
