package j$.time.zone;

import java.security.PrivilegedAction;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
final class h implements PrivilegedAction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ArrayList f8532a;

    h(ArrayList arrayList) {
        this.f8532a = arrayList;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        String property = System.getProperty("java.time.zone.DefaultZoneRulesProvider");
        if (property != null) {
            try {
                j jVar = (j) j.class.cast(Class.forName(property, true, j.class.getClassLoader()).newInstance());
                j.d(jVar);
                this.f8532a.add(jVar);
                return null;
            } catch (Exception e4) {
                throw new Error(e4);
            }
        }
        j.d(new i());
        return null;
    }
}
