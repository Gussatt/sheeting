package androidx.preference;

import X.c;
import X.g;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import u.e;

/* JADX INFO: loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final a f5036U;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
            if (CheckBoxPreference.this.d(Boolean.valueOf(z3))) {
                CheckBoxPreference.this.K(z3);
            } else {
                compoundButton.setChecked(!z3);
            }
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, 0);
    }

    @Override // androidx.preference.Preference
    public void C(View view) {
        super.C(view);
        Q(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void P(View view) {
        boolean z3 = view instanceof CompoundButton;
        if (z3) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f5122P);
        }
        if (z3) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.f5036U);
        }
    }

    public final void Q(View view) {
        if (((AccessibilityManager) g().getSystemService("accessibility")).isEnabled()) {
            P(view.findViewById(R.id.checkbox));
            O(view.findViewById(R.id.summary));
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.f5036U = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f3872b, i4, i5);
        N(e.f(typedArrayObtainStyledAttributes, g.f3888h, g.f3875c));
        M(e.f(typedArrayObtainStyledAttributes, g.f3886g, g.f3878d));
        L(e.b(typedArrayObtainStyledAttributes, g.f3884f, g.f3881e, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a(context, c.f3804a, R.attr.checkBoxPreferenceStyle));
    }
}
