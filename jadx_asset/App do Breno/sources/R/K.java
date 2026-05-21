package R;

import android.view.View;
import h0.C0979e;
import java.util.Iterator;
import java.util.List;
import p.C1475a;

/* JADX INFO: loaded from: classes.dex */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final K f3063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final M f3064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final M f3065c;

    static {
        K k4 = new K();
        f3063a = k4;
        f3064b = new L();
        f3065c = k4.b();
    }

    public static final void a(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o, AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o2, boolean z3, C1475a c1475a, boolean z4) {
        X2.l.e(abstractComponentCallbacksC0497o, "inFragment");
        X2.l.e(abstractComponentCallbacksC0497o2, "outFragment");
        X2.l.e(c1475a, "sharedElements");
        if (z3) {
            abstractComponentCallbacksC0497o2.t();
        } else {
            abstractComponentCallbacksC0497o.t();
        }
    }

    public static final void c(C1475a c1475a, C1475a c1475a2) {
        X2.l.e(c1475a, "<this>");
        X2.l.e(c1475a2, "namedViews");
        int size = c1475a.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (!c1475a2.containsKey((String) c1475a.m(size))) {
                c1475a.k(size);
            }
        }
    }

    public static final void d(List list, int i4) {
        X2.l.e(list, "views");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i4);
        }
    }

    public final M b() {
        try {
            X2.l.c(C0979e.class, "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>");
            return (M) C0979e.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
