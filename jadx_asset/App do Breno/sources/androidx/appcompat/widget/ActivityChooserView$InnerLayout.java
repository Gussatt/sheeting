package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import k.a0;

/* JADX INFO: loaded from: classes.dex */
public class ActivityChooserView$InnerLayout extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f4325b = {R.attr.background};

    public ActivityChooserView$InnerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a0 a0VarQ = a0.q(context, attributeSet, f4325b);
        setBackgroundDrawable(a0VarQ.f(0));
        a0VarQ.s();
    }
}
