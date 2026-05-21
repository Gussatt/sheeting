package V0;

import android.content.Context;
import android.content.res.Resources;

/* JADX INFO: renamed from: V0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0552k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f3708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3709b;

    public C0552k(Context context) {
        AbstractC0549h.j(context);
        Resources resources = context.getResources();
        this.f3708a = resources;
        this.f3709b = resources.getResourcePackageName(S0.p.f3448a);
    }

    public String a(String str) {
        int identifier = this.f3708a.getIdentifier(str, "string", this.f3709b);
        if (identifier == 0) {
            return null;
        }
        return this.f3708a.getString(identifier);
    }
}
