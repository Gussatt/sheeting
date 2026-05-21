package k;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class f0 extends Resources {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f8820b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f8821a;

    public f0(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f8821a = new WeakReference(context);
    }

    public static boolean a() {
        return f8820b;
    }

    public static boolean b() {
        a();
        return false;
    }

    public final Drawable c(int i4) {
        return super.getDrawable(i4);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i4) {
        Context context = (Context) this.f8821a.get();
        return context != null ? Q.g().r(context, this, i4) : super.getDrawable(i4);
    }
}
