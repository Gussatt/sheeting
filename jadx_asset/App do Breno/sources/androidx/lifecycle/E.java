package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f4959a = new LinkedHashMap();

    public final void a() {
        Iterator it = this.f4959a.values().iterator();
        while (it.hasNext()) {
            ((B) it.next()).a();
        }
        this.f4959a.clear();
    }

    public final B b(String str) {
        X2.l.e(str, "key");
        return (B) this.f4959a.get(str);
    }

    public final void c(String str, B b4) {
        X2.l.e(str, "key");
        X2.l.e(b4, "viewModel");
        B b5 = (B) this.f4959a.put(str, b4);
        if (b5 != null) {
            b5.c();
        }
    }
}
