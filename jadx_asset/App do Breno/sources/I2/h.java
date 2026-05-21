package I2;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import q0.k;
import q0.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    public interface a {
        void a(float f4, float f5, float f6);
    }

    public interface b {
        boolean a(View view);
    }

    public static /* synthetic */ boolean b(Class[] clsArr, View view) {
        for (Class cls : clsArr) {
            if (cls.isInstance(view)) {
                return true;
            }
        }
        return false;
    }

    public static void c(Context context, a aVar) {
        Activity activityE = e(context);
        if (activityE != null) {
            k kVarA = l.b().a(activityE);
            aVar.a(kVarA.a().width(), kVarA.a().height(), context.getResources().getDisplayMetrics().density);
        }
    }

    public static boolean d(View view) {
        return g(view, new b() { // from class: I2.g
            @Override // I2.h.b
            public final boolean a(View view2) {
                return view2.hasFocus();
            }
        });
    }

    public static Activity e(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return e(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static boolean f(View view, final Class[] clsArr) {
        return g(view, new b() { // from class: I2.f
            @Override // I2.h.b
            public final boolean a(View view2) {
                return h.b(clsArr, view2);
            }
        });
    }

    public static boolean g(View view, b bVar) {
        if (view == null) {
            return false;
        }
        if (bVar.a(view)) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                if (g(viewGroup.getChildAt(i4), bVar)) {
                    return true;
                }
            }
        }
        return false;
    }
}
