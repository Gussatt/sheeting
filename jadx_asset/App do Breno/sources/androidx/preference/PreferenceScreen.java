package androidx.preference;

import X.c;
import android.R;
import android.content.Context;
import android.util.AttributeSet;
import u.e;

/* JADX INFO: loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public boolean f5099X;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, e.a(context, c.f3809f, R.attr.preferenceScreenStyle));
        this.f5099X = true;
    }

    @Override // androidx.preference.Preference
    public void x() {
        if (j() == null && i() == null && K() != 0) {
            o();
            throw null;
        }
    }
}
