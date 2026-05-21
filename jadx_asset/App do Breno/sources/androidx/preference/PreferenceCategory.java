package androidx.preference;

import X.c;
import android.R;
import android.content.Context;
import android.util.AttributeSet;
import u.e;

/* JADX INFO: loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
    }

    @Override // androidx.preference.Preference
    public boolean H() {
        return !super.t();
    }

    @Override // androidx.preference.Preference
    public boolean t() {
        return false;
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, 0);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a(context, c.f3808e, R.attr.preferenceCategoryStyle));
    }
}
