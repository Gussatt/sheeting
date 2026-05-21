package y1;

import android.os.Bundle;
import java.util.Locale;
import t1.InterfaceC1540a;

/* JADX INFO: loaded from: classes.dex */
public class e implements InterfaceC1540a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public A1.b f12024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public A1.b f12025b;

    public static void b(A1.b bVar, String str, Bundle bundle) {
        if (bVar == null) {
            return;
        }
        bVar.b(str, bundle);
    }

    @Override // t1.InterfaceC1540a.b
    public void a(int i4, Bundle bundle) {
        String string;
        z1.g.f().i(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i4), bundle));
        if (bundle == null || (string = bundle.getString("name")) == null) {
            return;
        }
        Bundle bundle2 = bundle.getBundle("params");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        c(string, bundle2);
    }

    public final void c(String str, Bundle bundle) {
        b("clx".equals(bundle.getString("_o")) ? this.f12024a : this.f12025b, str, bundle);
    }

    public void d(A1.b bVar) {
        this.f12025b = bVar;
    }

    public void e(A1.b bVar) {
        this.f12024a = bVar;
    }
}
