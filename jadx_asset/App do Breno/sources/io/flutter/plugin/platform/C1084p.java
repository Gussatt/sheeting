package io.flutter.plugin.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import l2.AbstractC1388b;
import m2.C1400c;

/* JADX INFO: renamed from: io.flutter.plugin.platform.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1084p extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8032e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C1400c f8033f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InterfaceC1083o f8034g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ViewTreeObserver.OnGlobalFocusChangeListener f8035h;

    /* JADX INFO: renamed from: io.flutter.plugin.platform.p$a */
    public class a implements ViewTreeObserver.OnGlobalFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View.OnFocusChangeListener f8036b;

        public a(View.OnFocusChangeListener onFocusChangeListener) {
            this.f8036b = onFocusChangeListener;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
        public void onGlobalFocusChanged(View view, View view2) {
            View.OnFocusChangeListener onFocusChangeListener = this.f8036b;
            C1084p c1084p = C1084p.this;
            onFocusChangeListener.onFocusChange(c1084p, I2.h.d(c1084p));
        }
    }

    public C1084p(Context context) {
        super(context);
        setWillNotDraw(false);
    }

    public void a() {
        InterfaceC1083o interfaceC1083o = this.f8034g;
        if (interfaceC1083o != null) {
            interfaceC1083o.release();
            this.f8034g = null;
        }
    }

    public void b(int i4, int i5) {
        InterfaceC1083o interfaceC1083o = this.f8034g;
        if (interfaceC1083o != null) {
            interfaceC1083o.b(i4, i5);
        }
    }

    public void c() {
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive() || (onGlobalFocusChangeListener = this.f8035h) == null) {
            return;
        }
        this.f8035h = null;
        viewTreeObserver.removeOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        InterfaceC1083o interfaceC1083o = this.f8034g;
        if (interfaceC1083o == null) {
            super.draw(canvas);
            AbstractC1388b.b("PlatformViewWrapper", "Platform view cannot be composed without a RenderTarget.");
            return;
        }
        Surface surface = interfaceC1083o.getSurface();
        if (!surface.isValid()) {
            AbstractC1388b.b("PlatformViewWrapper", "Platform view cannot be composed without a valid RenderTarget surface.");
            return;
        }
        Canvas canvasLockHardwareCanvas = surface.lockHardwareCanvas();
        if (canvasLockHardwareCanvas == null) {
            invalidate();
            return;
        }
        try {
            canvasLockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            super.draw(canvasLockHardwareCanvas);
        } finally {
            this.f8034g.scheduleFrame();
            surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
        }
    }

    public ViewTreeObserver.OnGlobalFocusChangeListener getActiveFocusListener() {
        return this.f8035h;
    }

    public int getRenderTargetHeight() {
        InterfaceC1083o interfaceC1083o = this.f8034g;
        if (interfaceC1083o != null) {
            return interfaceC1083o.getHeight();
        }
        return 0;
    }

    public int getRenderTargetWidth() {
        InterfaceC1083o interfaceC1083o = this.f8034g;
        if (interfaceC1083o != null) {
            return interfaceC1083o.getWidth();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        invalidate();
        return super.invalidateChildInParent(iArr, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f8033f == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i4 = this.f8031d;
            this.f8029b = i4;
            int i5 = this.f8032e;
            this.f8030c = i5;
            matrix.postTranslate(i4, i5);
        } else if (action != 2) {
            matrix.postTranslate(this.f8031d, this.f8032e);
        } else {
            matrix.postTranslate(this.f8029b, this.f8030c);
            this.f8029b = this.f8031d;
            this.f8030c = this.f8032e;
        }
        return this.f8033f.l(motionEvent, matrix);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }

    public void setLayoutParams(FrameLayout.LayoutParams layoutParams) {
        super.setLayoutParams((ViewGroup.LayoutParams) layoutParams);
        this.f8031d = layoutParams.leftMargin;
        this.f8032e = layoutParams.topMargin;
    }

    public void setOnDescendantFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        c();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.f8035h == null) {
            a aVar = new a(onFocusChangeListener);
            this.f8035h = aVar;
            viewTreeObserver.addOnGlobalFocusChangeListener(aVar);
        }
    }

    public void setTouchProcessor(C1400c c1400c) {
        this.f8033f = c1400c;
    }

    public C1084p(Context context, InterfaceC1083o interfaceC1083o) {
        this(context);
        this.f8034g = interfaceC1083o;
        Surface surface = interfaceC1083o.getSurface();
        if (surface == null || FlutterRenderer.f7801j) {
            return;
        }
        Canvas canvasLockHardwareCanvas = surface.lockHardwareCanvas();
        try {
            canvasLockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
        } finally {
            surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
        }
    }
}
