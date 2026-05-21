package e0;

import X2.l;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0609f;
import androidx.lifecycle.InterfaceC0611h;
import androidx.lifecycle.j;
import java.util.Map;
import m.C1390b;

/* JADX INFO: renamed from: e0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0925d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f7171f = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f7174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f7175d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1390b f7172a = new C1390b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f7176e = true;

    /* JADX INFO: renamed from: e0.d$a */
    public interface a {
    }

    /* JADX INFO: renamed from: e0.d$b */
    public static final class b {
        public /* synthetic */ b(X2.g gVar) {
            this();
        }

        public b() {
        }
    }

    /* JADX INFO: renamed from: e0.d$c */
    public interface c {
        Bundle a();
    }

    public static final void d(C0925d c0925d, j jVar, AbstractC0609f.a aVar) {
        l.e(c0925d, "this$0");
        l.e(jVar, "<anonymous parameter 0>");
        l.e(aVar, "event");
        if (aVar == AbstractC0609f.a.ON_START) {
            c0925d.f7176e = true;
        } else if (aVar == AbstractC0609f.a.ON_STOP) {
            c0925d.f7176e = false;
        }
    }

    public final Bundle b(String str) {
        l.e(str, "key");
        if (!this.f7175d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f7174c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
        Bundle bundle3 = this.f7174c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f7174c;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f7174c = null;
        return bundle2;
    }

    public final c c(String str) {
        l.e(str, "key");
        for (Map.Entry entry : this.f7172a) {
            l.d(entry, "components");
            String str2 = (String) entry.getKey();
            c cVar = (c) entry.getValue();
            if (l.a(str2, str)) {
                return cVar;
            }
        }
        return null;
    }

    public final void e(AbstractC0609f abstractC0609f) {
        l.e(abstractC0609f, "lifecycle");
        if (this.f7173b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        abstractC0609f.a(new InterfaceC0611h() { // from class: e0.c
            @Override // androidx.lifecycle.InterfaceC0611h
            public final void a(j jVar, AbstractC0609f.a aVar) {
                C0925d.d(this.f7170a, jVar, aVar);
            }
        });
        this.f7173b = true;
    }

    public final void f(Bundle bundle) {
        if (!this.f7173b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (this.f7175d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        this.f7174c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        this.f7175d = true;
    }

    public final void g(Bundle bundle) {
        l.e(bundle, "outBundle");
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f7174c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C1390b.d dVarH = this.f7172a.h();
        l.d(dVarH, "this.components.iteratorWithAdditions()");
        while (dVarH.hasNext()) {
            Map.Entry entry = (Map.Entry) dVarH.next();
            bundle2.putBundle((String) entry.getKey(), ((c) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public final void h(String str, c cVar) {
        l.e(str, "key");
        l.e(cVar, "provider");
        if (((c) this.f7172a.l(str, cVar)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }
}
