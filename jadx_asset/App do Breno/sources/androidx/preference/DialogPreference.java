package androidx.preference;

import X.c;
import X.g;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import u.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class DialogPreference extends Preference {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public CharSequence f5038P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public CharSequence f5039Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public Drawable f5040R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public CharSequence f5041S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public CharSequence f5042T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public int f5043U;

    public DialogPreference(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f3890i, i4, i5);
        String strF = e.f(typedArrayObtainStyledAttributes, g.f3910s, g.f3892j);
        this.f5038P = strF;
        if (strF == null) {
            this.f5038P = r();
        }
        this.f5039Q = e.f(typedArrayObtainStyledAttributes, g.f3908r, g.f3894k);
        this.f5040R = e.c(typedArrayObtainStyledAttributes, g.f3904p, g.f3896l);
        this.f5041S = e.f(typedArrayObtainStyledAttributes, g.f3914u, g.f3898m);
        this.f5042T = e.f(typedArrayObtainStyledAttributes, g.f3912t, g.f3900n);
        this.f5043U = e.e(typedArrayObtainStyledAttributes, g.f3906q, g.f3902o, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public void x() {
        o();
        throw null;
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a(context, c.f3805b, R.attr.dialogPreferenceStyle));
    }
}
