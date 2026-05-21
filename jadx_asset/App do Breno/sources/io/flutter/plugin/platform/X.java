package io.flutter.plugin.platform;

import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowMetrics;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import l2.AbstractC1388b;

/* JADX INFO: loaded from: classes.dex */
public abstract class X implements WindowManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WindowManager f7977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public S f7978c;

    public X(WindowManager windowManager, S s4) {
        this.f7977b = windowManager;
        this.f7978c = s4;
    }

    @Override // android.view.WindowManager
    public void addCrossWindowBlurEnabledListener(Consumer consumer) {
        this.f7977b.addCrossWindowBlurEnabledListener(consumer);
    }

    @Override // android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        S s4 = this.f7978c;
        if (s4 == null) {
            AbstractC1388b.g("PlatformViewsController", "Embedded view called addView while detached from presentation");
        } else {
            s4.addView(view, layoutParams);
        }
    }

    @Override // android.view.WindowManager
    public WindowMetrics getCurrentWindowMetrics() {
        return this.f7977b.getCurrentWindowMetrics();
    }

    @Override // android.view.WindowManager
    public Display getDefaultDisplay() {
        return this.f7977b.getDefaultDisplay();
    }

    @Override // android.view.WindowManager
    public WindowMetrics getMaximumWindowMetrics() {
        return this.f7977b.getMaximumWindowMetrics();
    }

    @Override // android.view.WindowManager
    public boolean isCrossWindowBlurEnabled() {
        return this.f7977b.isCrossWindowBlurEnabled();
    }

    @Override // android.view.WindowManager
    public void removeCrossWindowBlurEnabledListener(Consumer consumer) {
        this.f7977b.removeCrossWindowBlurEnabledListener(consumer);
    }

    @Override // android.view.ViewManager
    public void removeView(View view) {
        S s4 = this.f7978c;
        if (s4 == null) {
            AbstractC1388b.g("PlatformViewsController", "Embedded view called removeView while detached from presentation");
        } else {
            s4.removeView(view);
        }
    }

    @Override // android.view.WindowManager
    public void removeViewImmediate(View view) {
        if (this.f7978c == null) {
            AbstractC1388b.g("PlatformViewsController", "Embedded view called removeViewImmediate while detached from presentation");
        } else {
            view.clearAnimation();
            this.f7978c.removeView(view);
        }
    }

    @Override // android.view.ViewManager
    public void updateViewLayout(View view, ViewGroup.LayoutParams layoutParams) {
        S s4 = this.f7978c;
        if (s4 == null) {
            AbstractC1388b.g("PlatformViewsController", "Embedded view called updateViewLayout while detached from presentation");
        } else {
            s4.updateViewLayout(view, layoutParams);
        }
    }

    @Override // android.view.WindowManager
    public void addCrossWindowBlurEnabledListener(Executor executor, Consumer consumer) {
        this.f7977b.addCrossWindowBlurEnabledListener(executor, consumer);
    }
}
