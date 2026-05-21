package r2;

import I2.h;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import java.util.Iterator;
import m2.C1400c;

/* JADX INFO: renamed from: r2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1513a extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FlutterMutatorsStack f11225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f11226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11229f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11230g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C1400c f11231h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Paint f11232i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ViewTreeObserver.OnGlobalFocusChangeListener f11233j;

    /* JADX INFO: renamed from: r2.a$a, reason: collision with other inner class name */
    public class ViewTreeObserverOnGlobalFocusChangeListenerC0166a implements ViewTreeObserver.OnGlobalFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View.OnFocusChangeListener f11234b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f11235c;

        public ViewTreeObserverOnGlobalFocusChangeListenerC0166a(View.OnFocusChangeListener onFocusChangeListener, View view) {
            this.f11234b = onFocusChangeListener;
            this.f11235c = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
        public void onGlobalFocusChanged(View view, View view2) {
            View.OnFocusChangeListener onFocusChangeListener = this.f11234b;
            View view3 = this.f11235c;
            onFocusChangeListener.onFocusChange(view3, h.d(view3));
        }
    }

    public C1513a(Context context, float f4, C1400c c1400c) {
        super(context, null);
        this.f11226c = f4;
        this.f11231h = c1400c;
        this.f11232i = new Paint();
    }

    private Matrix getPlatformViewMatrix() {
        Matrix matrix = new Matrix(this.f11225b.getFinalMatrix());
        float f4 = this.f11226c;
        matrix.preScale(1.0f / f4, 1.0f / f4);
        matrix.postTranslate(-this.f11227d, -this.f11228e);
        return matrix;
    }

    public void a(FlutterMutatorsStack flutterMutatorsStack, int i4, int i5, int i6, int i7) {
        this.f11225b = flutterMutatorsStack;
        this.f11227d = i4;
        this.f11228e = i5;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i6, i7);
        layoutParams.leftMargin = i4;
        layoutParams.topMargin = i5;
        setLayoutParams(layoutParams);
        setWillNotDraw(false);
    }

    public void b() {
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive() || (onGlobalFocusChangeListener = this.f11233j) == null) {
            return;
        }
        this.f11233j = null;
        viewTreeObserver.removeOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.concat(getPlatformViewMatrix());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.save();
        Iterator<Path> it = this.f11225b.getFinalClippingPaths().iterator();
        while (it.hasNext()) {
            Path path = new Path(it.next());
            path.offset(-this.f11227d, -this.f11228e);
            canvas.clipPath(path);
        }
        if (this.f11232i.getAlpha() != ((int) (this.f11225b.getFinalOpacity() * 255.0f))) {
            this.f11232i.setAlpha((int) (this.f11225b.getFinalOpacity() * 255.0f));
            setLayerType(2, this.f11232i);
        }
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f11231h == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i4 = this.f11227d;
            this.f11229f = i4;
            int i5 = this.f11228e;
            this.f11230g = i5;
            matrix.postTranslate(i4, i5);
        } else if (action != 2) {
            matrix.postTranslate(this.f11227d, this.f11228e);
        } else {
            matrix.postTranslate(this.f11229f, this.f11230g);
            this.f11229f = this.f11227d;
            this.f11230g = this.f11228e;
        }
        return this.f11231h.l(motionEvent, matrix);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }

    public void setOnDescendantFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        b();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.f11233j == null) {
            ViewTreeObserverOnGlobalFocusChangeListenerC0166a viewTreeObserverOnGlobalFocusChangeListenerC0166a = new ViewTreeObserverOnGlobalFocusChangeListenerC0166a(onFocusChangeListener, this);
            this.f11233j = viewTreeObserverOnGlobalFocusChangeListenerC0166a;
            viewTreeObserver.addOnGlobalFocusChangeListener(viewTreeObserverOnGlobalFocusChangeListenerC0166a);
        }
    }
}
