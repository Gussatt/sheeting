package u1;

import android.os.Bundle;
import j1.C1109a;

/* JADX INFO: loaded from: classes.dex */
public final class e implements C1109a.InterfaceC0130a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f11474a;

    public e(f fVar) {
        this.f11474a = fVar;
    }

    @Override // k1.InterfaceC1277o4
    public final void a(String str, String str2, Bundle bundle, long j4) {
        if (str == null || !AbstractC1580b.c(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j4);
        bundle2.putBundle("params", bundle);
        this.f11474a.f11475a.a(3, bundle2);
    }
}
