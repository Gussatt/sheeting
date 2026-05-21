package k;

import C.AbstractC0241y;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

/* JADX INFO: loaded from: classes.dex */
public class d0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static d0 f8791k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static d0 f8792l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f8793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence f8794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Runnable f8796e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Runnable f8797f = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f8798g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8799h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e0 f8800i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f8801j;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d0.this.g(false);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d0.this.c();
        }
    }

    public d0(View view, CharSequence charSequence) {
        this.f8793b = view;
        this.f8794c = charSequence;
        this.f8795d = C.C.g(ViewConfiguration.get(view.getContext()));
        b();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void e(d0 d0Var) {
        d0 d0Var2 = f8791k;
        if (d0Var2 != null) {
            d0Var2.a();
        }
        f8791k = d0Var;
        if (d0Var != null) {
            d0Var.d();
        }
    }

    public static void f(View view, CharSequence charSequence) {
        d0 d0Var = f8791k;
        if (d0Var != null && d0Var.f8793b == view) {
            e(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new d0(view, charSequence);
            return;
        }
        d0 d0Var2 = f8792l;
        if (d0Var2 != null && d0Var2.f8793b == view) {
            d0Var2.c();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public final void a() {
        this.f8793b.removeCallbacks(this.f8796e);
    }

    public final void b() {
        this.f8798g = Integer.MAX_VALUE;
        this.f8799h = Integer.MAX_VALUE;
    }

    public void c() {
        if (f8792l == this) {
            f8792l = null;
            e0 e0Var = this.f8800i;
            if (e0Var != null) {
                e0Var.c();
                this.f8800i = null;
                b();
                this.f8793b.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f8791k == this) {
            e(null);
        }
        this.f8793b.removeCallbacks(this.f8797f);
    }

    public final void d() {
        this.f8793b.postDelayed(this.f8796e, ViewConfiguration.getLongPressTimeout());
    }

    public void g(boolean z3) {
        long longPressTimeout;
        long j4;
        long j5;
        if (AbstractC0241y.u(this.f8793b)) {
            e(null);
            d0 d0Var = f8792l;
            if (d0Var != null) {
                d0Var.c();
            }
            f8792l = this;
            this.f8801j = z3;
            e0 e0Var = new e0(this.f8793b.getContext());
            this.f8800i = e0Var;
            e0Var.e(this.f8793b, this.f8798g, this.f8799h, this.f8801j, this.f8794c);
            this.f8793b.addOnAttachStateChangeListener(this);
            if (this.f8801j) {
                j5 = 2500;
            } else {
                if ((AbstractC0241y.r(this.f8793b) & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j4 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j4 = 15000;
                }
                j5 = j4 - longPressTimeout;
            }
            this.f8793b.removeCallbacks(this.f8797f);
            this.f8793b.postDelayed(this.f8797f, j5);
        }
    }

    public final boolean h(MotionEvent motionEvent) {
        int x3 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        if (Math.abs(x3 - this.f8798g) <= this.f8795d && Math.abs(y3 - this.f8799h) <= this.f8795d) {
            return false;
        }
        this.f8798g = x3;
        this.f8799h = y3;
        return true;
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f8800i != null && this.f8801j) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f8793b.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                b();
                c();
            }
        } else if (this.f8793b.isEnabled() && this.f8800i == null && h(motionEvent)) {
            e(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f8798g = view.getWidth() / 2;
        this.f8799h = view.getHeight() / 2;
        g(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }
}
