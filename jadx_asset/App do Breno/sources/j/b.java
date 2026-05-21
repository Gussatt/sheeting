package j;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements c, g, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Rect f8558b;

    public static int o(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i4) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i5 = 0;
        int i6 = 0;
        View view = null;
        for (int i7 = 0; i7 < count; i7++) {
            int itemViewType = listAdapter.getItemViewType(i7);
            if (itemViewType != i6) {
                view = null;
                i6 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i7, view, viewGroup);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i4) {
                return i4;
            }
            if (measuredWidth > i5) {
                i5 = measuredWidth;
            }
        }
        return i5;
    }

    public static boolean x(d dVar) {
        int size = dVar.size();
        for (int i4 = 0; i4 < size; i4++) {
            MenuItem item = dVar.getItem(i4);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    public static androidx.appcompat.view.menu.c y(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (androidx.appcompat.view.menu.c) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (androidx.appcompat.view.menu.c) listAdapter;
    }

    @Override // androidx.appcompat.view.menu.g
    public boolean h(d dVar, e eVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.g
    public boolean j(d dVar, e eVar) {
        return false;
    }

    public abstract void l(d dVar);

    public boolean m() {
        return true;
    }

    public Rect n() {
        return this.f8558b;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        y(listAdapter).f4154b.I((MenuItem) listAdapter.getItem(i4), this, m() ? 0 : 4);
    }

    public abstract void p(View view);

    public void q(Rect rect) {
        this.f8558b = rect;
    }

    public abstract void r(boolean z3);

    public abstract void s(int i4);

    public abstract void t(int i4);

    public abstract void u(PopupWindow.OnDismissListener onDismissListener);

    public abstract void v(boolean z3);

    public abstract void w(int i4);

    @Override // androidx.appcompat.view.menu.g
    public void c(Context context, d dVar) {
    }
}
