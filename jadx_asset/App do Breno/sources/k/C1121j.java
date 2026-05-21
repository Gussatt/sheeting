package k;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import c.AbstractC0645i;

/* JADX INFO: renamed from: k.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1121j extends PopupWindow {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f8831b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f8832a;

    public C1121j(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        a(context, attributeSet, i4, i5);
    }

    public final void a(Context context, AttributeSet attributeSet, int i4, int i5) {
        a0 a0VarR = a0.r(context, attributeSet, AbstractC0645i.f5892v1, i4, i5);
        if (a0VarR.o(AbstractC0645i.f5900x1)) {
            b(a0VarR.a(AbstractC0645i.f5900x1, false));
        }
        setBackgroundDrawable(a0VarR.f(AbstractC0645i.f5896w1));
        a0VarR.s();
    }

    public final void b(boolean z3) {
        if (f8831b) {
            this.f8832a = z3;
        } else {
            H.f.a(this, z3);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i4, int i5) {
        if (f8831b && this.f8832a) {
            i5 -= view.getHeight();
        }
        super.showAsDropDown(view, i4, i5);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i4, int i5, int i6, int i7) {
        if (f8831b && this.f8832a) {
            i5 -= view.getHeight();
        }
        super.update(view, i4, i5, i6, i7);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i4, int i5, int i6) {
        if (f8831b && this.f8832a) {
            i5 -= view.getHeight();
        }
        super.showAsDropDown(view, i4, i5, i6);
    }
}
