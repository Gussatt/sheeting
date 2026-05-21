package b0;

import android.content.Context;

/* JADX INFO: renamed from: b0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0624g extends AbstractC0629l {
    /* JADX WARN: Illegal instructions before constructor call */
    public C0624g(Context context) {
        X2.l.e(context, "context");
        Object systemService = context.getSystemService((Class<Object>) AbstractC0622e.a());
        X2.l.d(systemService, "context.getSystemService…ementManager::class.java)");
        super(AbstractC0623f.a(systemService));
    }
}
