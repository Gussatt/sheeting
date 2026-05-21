package u0;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.inputmethodservice.InputMethodService;

/* JADX INFO: renamed from: u0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1567b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1567b f11459a = new C1567b();

    public final Context a(Context context) {
        X2.l.e(context, "context");
        Context baseContext = context;
        while (baseContext instanceof ContextWrapper) {
            if (baseContext instanceof Activity) {
                return baseContext;
            }
            if (baseContext instanceof InputMethodService) {
                return baseContext;
            }
            ContextWrapper contextWrapper = (ContextWrapper) baseContext;
            if (contextWrapper.getBaseContext() == null) {
                return baseContext;
            }
            baseContext = contextWrapper.getBaseContext();
            X2.l.d(baseContext, "iterator.baseContext");
        }
        throw new IllegalArgumentException("Context " + context + " is not a UiContext");
    }
}
