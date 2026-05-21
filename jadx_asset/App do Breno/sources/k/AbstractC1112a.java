package k;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import c.AbstractC0637a;
import c.AbstractC0645i;

/* JADX INFO: renamed from: k.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1112a extends ViewGroup {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0132a f8769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f8770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActionMenuView f8771d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.appcompat.widget.a f8772e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8773f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f8774g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f8775h;

    /* JADX INFO: renamed from: k.a$a, reason: collision with other inner class name */
    public class C0132a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f8776a = false;

        public C0132a() {
        }
    }

    public AbstractC1112a(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f8769b = new C0132a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(AbstractC0637a.f5556a, typedValue, true) || typedValue.resourceId == 0) {
            this.f8770c = context;
        } else {
            this.f8770c = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public static int b(int i4, int i5, boolean z3) {
        return z3 ? i4 - i5 : i4 + i5;
    }

    public int a(View view, int i4, int i5, int i6) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), i5);
        return Math.max(0, (i4 - view.getMeasuredWidth()) - i6);
    }

    public int c(View view, int i4, int i5, int i6, boolean z3) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i7 = i5 + ((i6 - measuredHeight) / 2);
        if (z3) {
            view.layout(i4 - measuredWidth, i7, i4, measuredHeight + i7);
        } else {
            view.layout(i4, i7, i4 + measuredWidth, measuredHeight + i7);
        }
        return z3 ? -measuredWidth : measuredWidth;
    }

    public int getAnimatedVisibility() {
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f8773f;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC0645i.f5796a, AbstractC0637a.f5558c, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(AbstractC0645i.f5836i, 0));
        typedArrayObtainStyledAttributes.recycle();
        androidx.appcompat.widget.a aVar = this.f8772e;
        if (aVar != null) {
            aVar.B(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f8775h = false;
        }
        if (!this.f8775h) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f8775h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f8775h = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f8774g = false;
        }
        if (!this.f8774g) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f8774g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f8774g = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i4);

    @Override // android.view.View
    public void setVisibility(int i4) {
        if (i4 != getVisibility()) {
            super.setVisibility(i4);
        }
    }
}
