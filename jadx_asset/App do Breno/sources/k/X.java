package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class X extends ContextWrapper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f8760c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static ArrayList f8761d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f8762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources.Theme f8763b;

    public X(Context context) {
        super(context);
        if (!f0.b()) {
            this.f8762a = new Z(this, context.getResources());
            this.f8763b = null;
            return;
        }
        f0 f0Var = new f0(this, context.getResources());
        this.f8762a = f0Var;
        Resources.Theme themeNewTheme = f0Var.newTheme();
        this.f8763b = themeNewTheme;
        themeNewTheme.setTo(context.getTheme());
    }

    public static boolean a(Context context) {
        return ((context instanceof X) || (context.getResources() instanceof Z) || (context.getResources() instanceof f0) || !f0.b()) ? false : true;
    }

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f8760c) {
            try {
                ArrayList arrayList = f8761d;
                if (arrayList == null) {
                    f8761d = new ArrayList();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference weakReference = (WeakReference) f8761d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f8761d.remove(size);
                        }
                    }
                    for (int size2 = f8761d.size() - 1; size2 >= 0; size2--) {
                        WeakReference weakReference2 = (WeakReference) f8761d.get(size2);
                        X x3 = weakReference2 != null ? (X) weakReference2.get() : null;
                        if (x3 != null && x3.getBaseContext() == context) {
                            return x3;
                        }
                    }
                }
                X x4 = new X(context);
                f8761d.add(new WeakReference(x4));
                return x4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f8762a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f8762a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f8763b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i4) {
        Resources.Theme theme = this.f8763b;
        if (theme == null) {
            super.setTheme(i4);
        } else {
            theme.applyStyle(i4, true);
        }
    }
}
