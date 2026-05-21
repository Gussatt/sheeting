package H2;

import android.webkit.GeolocationPermissions;

/* JADX INFO: renamed from: H2.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0345i0 extends AbstractC0290a1 {
    public C0345i0(O3 o32) {
        super(o32);
    }

    @Override // H2.AbstractC0290a1
    public void c(GeolocationPermissions.Callback callback, String str, boolean z3, boolean z4) {
        callback.invoke(str, z3, z4);
    }
}
