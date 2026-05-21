package u1;

import android.os.Bundle;
import j1.C1109a;
import k1.AbstractC1237j4;
import p1.k;

/* JADX INFO: loaded from: classes.dex */
public final class c implements C1109a.InterfaceC0130a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f11469a;

    public c(d dVar) {
        this.f11469a = dVar;
    }

    @Override // k1.InterfaceC1277o4
    public final void a(String str, String str2, Bundle bundle, long j4) {
        d dVar = this.f11469a;
        if (dVar.f11470a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            k kVar = AbstractC1580b.f11463a;
            String strA = AbstractC1237j4.a(str2);
            if (strA != null) {
                str2 = strA;
            }
            bundle2.putString("events", str2);
            dVar.f11471b.a(2, bundle2);
        }
    }
}
