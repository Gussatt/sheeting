package k;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import c.AbstractC0639c;
import c.AbstractC0641e;
import c.AbstractC0642f;
import c.AbstractC0644h;

/* JADX INFO: loaded from: classes.dex */
public class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f8814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f8815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WindowManager.LayoutParams f8816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f8817e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f8818f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f8819g;

    public e0(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f8816d = layoutParams;
        this.f8817e = new Rect();
        this.f8818f = new int[2];
        this.f8819g = new int[2];
        this.f8813a = context;
        View viewInflate = LayoutInflater.from(context).inflate(AbstractC0642f.f5678m, (ViewGroup) null);
        this.f8814b = viewInflate;
        this.f8815c = (TextView) viewInflate.findViewById(AbstractC0641e.f5652m);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = AbstractC0644h.f5691a;
        layoutParams.flags = 24;
    }

    public static View b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if (!(layoutParams instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams).type != 2) {
            for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof Activity) {
                    return ((Activity) context).getWindow().getDecorView();
                }
            }
        }
        return rootView;
    }

    public final void a(View view, int i4, int i5, boolean z3, WindowManager.LayoutParams layoutParams) {
        int height;
        int i6;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f8813a.getResources().getDimensionPixelOffset(AbstractC0639c.f5589h);
        if (view.getWidth() < dimensionPixelOffset) {
            i4 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f8813a.getResources().getDimensionPixelOffset(AbstractC0639c.f5588g);
            height = i5 + dimensionPixelOffset2;
            i6 = i5 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i6 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f8813a.getResources().getDimensionPixelOffset(z3 ? AbstractC0639c.f5591j : AbstractC0639c.f5590i);
        View viewB = b(view);
        if (viewB == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        viewB.getWindowVisibleDisplayFrame(this.f8817e);
        Rect rect = this.f8817e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f8813a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f8817e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        viewB.getLocationOnScreen(this.f8819g);
        view.getLocationOnScreen(this.f8818f);
        int[] iArr = this.f8818f;
        int i7 = iArr[0];
        int[] iArr2 = this.f8819g;
        int i8 = i7 - iArr2[0];
        iArr[0] = i8;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i8 + i4) - (viewB.getWidth() / 2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f8814b.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredHeight = this.f8814b.getMeasuredHeight();
        int i9 = this.f8818f[1];
        int i10 = ((i6 + i9) - dimensionPixelOffset3) - measuredHeight;
        int i11 = i9 + height + dimensionPixelOffset3;
        if (z3) {
            if (i10 >= 0) {
                layoutParams.y = i10;
                return;
            } else {
                layoutParams.y = i11;
                return;
            }
        }
        if (measuredHeight + i11 <= this.f8817e.height()) {
            layoutParams.y = i11;
        } else {
            layoutParams.y = i10;
        }
    }

    public void c() {
        if (d()) {
            ((WindowManager) this.f8813a.getSystemService("window")).removeView(this.f8814b);
        }
    }

    public boolean d() {
        return this.f8814b.getParent() != null;
    }

    public void e(View view, int i4, int i5, boolean z3, CharSequence charSequence) {
        if (d()) {
            c();
        }
        this.f8815c.setText(charSequence);
        a(view, i4, i5, z3, this.f8816d);
        ((WindowManager) this.f8813a.getSystemService("window")).addView(this.f8814b, this.f8816d);
    }
}
