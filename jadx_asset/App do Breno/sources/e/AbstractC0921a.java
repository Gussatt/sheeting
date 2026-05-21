package e;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import java.util.WeakHashMap;
import k.Q;

/* JADX INFO: renamed from: e.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0921a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f7164a = new ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f7165b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f7166c = new Object();

    public static ColorStateList a(Context context, int i4) {
        return context.getColorStateList(i4);
    }

    public static Drawable b(Context context, int i4) {
        return Q.g().i(context, i4);
    }
}
