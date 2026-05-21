package u;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f11455a = new ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f11456b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f11457c = new Object();

    public static abstract class a {
        public static Handler e(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void c(final int i4, Handler handler) {
            e(handler).post(new Runnable() { // from class: u.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11453m.f(i4);
                }
            });
        }

        public final void d(final Typeface typeface, Handler handler) {
            e(handler).post(new Runnable() { // from class: u.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11451m.g(typeface);
                }
            });
        }

        public abstract void f(int i4);

        public abstract void g(Typeface typeface);
    }

    public static Typeface a(Context context, int i4, TypedValue typedValue, int i5, a aVar) {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, i4, typedValue, i5, aVar, null, true, false);
    }

    public static Typeface b(Context context, int i4, TypedValue typedValue, int i5, a aVar, Handler handler, boolean z3, boolean z4) {
        Resources resources = context.getResources();
        resources.getValue(i4, typedValue, true);
        Typeface typefaceC = c(context, resources, typedValue, i4, i5, aVar, handler, z3, z4);
        if (typefaceC != null || aVar != null || z4) {
            return typefaceC;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i4) + " could not be retrieved.");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface c(android.content.Context r13, android.content.res.Resources r14, android.util.TypedValue r15, int r16, int r17, u.d.a r18, android.os.Handler r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u.d.c(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, u.d$a, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
