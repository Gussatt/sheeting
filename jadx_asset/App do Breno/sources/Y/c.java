package Y;

import W2.l;
import android.content.Context;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f3998a = new c();

    public final Object a(Context context, String str, l lVar) {
        X2.l.e(context, "context");
        X2.l.e(str, "tag");
        X2.l.e(lVar, "manager");
        try {
            return lVar.k(context);
        } catch (NoClassDefFoundError unused) {
            Log.d(str, "Unable to find adservices code, check manifest for uses-library tag, versionS=" + b.f3995a.b());
            return null;
        }
    }
}
