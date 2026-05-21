package k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class P extends M implements N {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static Method f8705L;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public N f8706K;

    public static class a extends H {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final int f8707o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f8708p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public N f8709q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public MenuItem f8710r;

        public a(Context context, boolean z3) {
            super(context, z3);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f8707o = 21;
                this.f8708p = 22;
            } else {
                this.f8707o = 22;
                this.f8708p = 21;
            }
        }

        @Override // k.H
        public /* bridge */ /* synthetic */ int d(int i4, int i5, int i6, int i7, int i8) {
            return super.d(i4, i5, i6, i7, i8);
        }

        @Override // k.H
        public /* bridge */ /* synthetic */ boolean e(MotionEvent motionEvent, int i4) {
            return super.e(motionEvent, i4);
        }

        @Override // k.H, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // k.H, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // k.H, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // k.H, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // k.H, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            androidx.appcompat.view.menu.c cVar;
            int headersCount;
            int iPointToPosition;
            int i4;
            if (this.f8709q != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    cVar = (androidx.appcompat.view.menu.c) headerViewListAdapter.getWrappedAdapter();
                } else {
                    cVar = (androidx.appcompat.view.menu.c) adapter;
                    headersCount = 0;
                }
                androidx.appcompat.view.menu.e item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i4 = iPointToPosition - headersCount) < 0 || i4 >= cVar.getCount()) ? null : cVar.getItem(i4);
                MenuItem menuItem = this.f8710r;
                if (menuItem != item) {
                    androidx.appcompat.view.menu.d dVarB = cVar.b();
                    if (menuItem != null) {
                        this.f8709q.c(dVarB, menuItem);
                    }
                    this.f8710r = item;
                    if (item != null) {
                        this.f8709q.b(dVarB, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i4, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i4 == this.f8707o) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i4 != this.f8708p) {
                return super.onKeyDown(i4, keyEvent);
            }
            setSelection(-1);
            ((androidx.appcompat.view.menu.c) getAdapter()).b().d(false);
            return true;
        }

        @Override // k.H, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(N n4) {
            this.f8709q = n4;
        }

        @Override // k.H, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f8705L = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public P(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
    }

    public void E(Object obj) {
        this.f8672H.setEnterTransition((Transition) obj);
    }

    public void F(Object obj) {
        this.f8672H.setExitTransition((Transition) obj);
    }

    public void G(N n4) {
        this.f8706K = n4;
    }

    public void H(boolean z3) {
        if (Build.VERSION.SDK_INT > 28) {
            this.f8672H.setTouchModal(z3);
            return;
        }
        Method method = f8705L;
        if (method != null) {
            try {
                method.invoke(this.f8672H, Boolean.valueOf(z3));
            } catch (Exception unused) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }

    @Override // k.N
    public void b(androidx.appcompat.view.menu.d dVar, MenuItem menuItem) {
        N n4 = this.f8706K;
        if (n4 != null) {
            n4.b(dVar, menuItem);
        }
    }

    @Override // k.N
    public void c(androidx.appcompat.view.menu.d dVar, MenuItem menuItem) {
        N n4 = this.f8706K;
        if (n4 != null) {
            n4.c(dVar, menuItem);
        }
    }

    @Override // k.M
    public H g(Context context, boolean z3) {
        a aVar = new a(context, z3);
        aVar.setHoverListener(this);
        return aVar;
    }
}
