package C;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: C.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0236t implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewTreeObserver f388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Runnable f389d;

    public ViewTreeObserverOnPreDrawListenerC0236t(View view, Runnable runnable) {
        this.f387b = view;
        this.f388c = view.getViewTreeObserver();
        this.f389d = runnable;
    }

    public static ViewTreeObserverOnPreDrawListenerC0236t a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        ViewTreeObserverOnPreDrawListenerC0236t viewTreeObserverOnPreDrawListenerC0236t = new ViewTreeObserverOnPreDrawListenerC0236t(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0236t);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0236t);
        return viewTreeObserverOnPreDrawListenerC0236t;
    }

    public void b() {
        if (this.f388c.isAlive()) {
            this.f388c.removeOnPreDrawListener(this);
        } else {
            this.f387b.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f387b.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f389d.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f388c = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
