package R;

import C.AbstractC0241y;
import C.ViewTreeObserverOnPreDrawListenerC0236t;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import y.C1644a;

/* JADX INFO: loaded from: classes.dex */
public abstract class M {

    public class a implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f3082m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ ArrayList f3083n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ ArrayList f3084o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final /* synthetic */ ArrayList f3085p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final /* synthetic */ ArrayList f3086q;

        public a(int i4, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f3082m = i4;
            this.f3083n = arrayList;
            this.f3084o = arrayList2;
            this.f3085p = arrayList3;
            this.f3086q = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i4 = 0; i4 < this.f3082m; i4++) {
                AbstractC0241y.O((View) this.f3083n.get(i4), (String) this.f3084o.get(i4));
                AbstractC0241y.O((View) this.f3085p.get(i4), (String) this.f3086q.get(i4));
            }
        }
    }

    public static void f(List list, View view) {
        int size = list.size();
        if (i(list, view, size)) {
            return;
        }
        if (AbstractC0241y.q(view) != null) {
            list.add(view);
        }
        for (int i4 = size; i4 < list.size(); i4++) {
            View view2 = (View) list.get(i4);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt = viewGroup.getChildAt(i5);
                    if (!i(list, childAt, size) && AbstractC0241y.q(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    public static boolean i(List list, View view, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            if (list.get(i5) == view) {
                return true;
            }
        }
        return false;
    }

    public static boolean l(List list) {
        return list == null || list.isEmpty();
    }

    public abstract Object A(Object obj);

    public abstract void a(Object obj, View view);

    public abstract void b(Object obj, ArrayList arrayList);

    public abstract void e(ViewGroup viewGroup, Object obj);

    public abstract boolean g(Object obj);

    public abstract Object h(Object obj);

    public Object j(ViewGroup viewGroup, Object obj) {
        return null;
    }

    public void k(View view, Rect rect) {
        if (view.isAttachedToWindow()) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            view.getRootView().getLocationOnScreen(new int[2]);
            rectF.offset(r1[0], r1[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public boolean m() {
        if (!B.m0(4)) {
            return false;
        }
        Log.i("FragmentManager", "Older versions of AndroidX Transition do not support seeking. Add dependency on AndroidX Transition 1.5.0 or higher to enable seeking.");
        return false;
    }

    public boolean n(Object obj) {
        return false;
    }

    public abstract Object o(Object obj, Object obj2, Object obj3);

    public abstract Object p(Object obj, Object obj2, Object obj3);

    public ArrayList q(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) arrayList.get(i4);
            arrayList2.add(AbstractC0241y.q(view));
            AbstractC0241y.O(view, null);
        }
        return arrayList2;
    }

    public abstract void r(Object obj, View view, ArrayList arrayList);

    public abstract void s(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3);

    public abstract void t(Object obj, Rect rect);

    public abstract void u(Object obj, View view);

    public abstract void v(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o, Object obj, C1644a c1644a, Runnable runnable);

    public void w(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o, Object obj, C1644a c1644a, Runnable runnable, Runnable runnable2) {
        runnable2.run();
    }

    public void x(View view, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Map map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = (View) arrayList.get(i4);
            String strQ = AbstractC0241y.q(view2);
            arrayList4.add(strQ);
            if (strQ != null) {
                AbstractC0241y.O(view2, null);
                String str = (String) map.get(strQ);
                int i5 = 0;
                while (true) {
                    if (i5 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i5))) {
                        AbstractC0241y.O((View) arrayList2.get(i5), strQ);
                        break;
                    }
                    i5++;
                }
            }
        }
        ViewTreeObserverOnPreDrawListenerC0236t.a(view, new a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void y(Object obj, View view, ArrayList arrayList);

    public abstract void z(Object obj, ArrayList arrayList, ArrayList arrayList2);

    public void c(Object obj) {
    }

    public void d(Object obj, Runnable runnable) {
    }
}
