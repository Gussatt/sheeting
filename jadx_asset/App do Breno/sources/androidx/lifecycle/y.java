package androidx.lifecycle;

import android.os.Bundle;
import e0.C0925d;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class y implements C0925d.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0925d f5030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f5032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final K2.f f5033d;

    public static final class a extends X2.m implements W2.a {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ F f5034n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(F f4) {
            super(0);
            this.f5034n = f4;
        }

        @Override // W2.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final z e() {
            return x.b(this.f5034n);
        }
    }

    public y(C0925d c0925d, F f4) {
        X2.l.e(c0925d, "savedStateRegistry");
        X2.l.e(f4, "viewModelStoreOwner");
        this.f5030a = c0925d;
        this.f5033d = K2.g.a(new a(f4));
    }

    @Override // e0.C0925d.c
    public Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f5032c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        Iterator it = b().d().entrySet().iterator();
        if (!it.hasNext()) {
            this.f5031b = false;
            return bundle;
        }
        Map.Entry entry = (Map.Entry) it.next();
        i.d.a(entry.getValue());
        throw null;
    }

    public final z b() {
        return (z) this.f5033d.getValue();
    }

    public final void c() {
        if (this.f5031b) {
            return;
        }
        Bundle bundleB = this.f5030a.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f5032c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleB != null) {
            bundle.putAll(bundleB);
        }
        this.f5032c = bundle;
        this.f5031b = true;
        b();
    }
}
