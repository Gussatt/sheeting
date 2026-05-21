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
import android.widget.Switch;
import u.e;

/* JADX INFO: loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final a f5114U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public CharSequence f5115V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public CharSequence f5116W;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
            if (SwitchPreference.this.d(Boolean.valueOf(z3))) {
                SwitchPreference.this.K(z3);
            } else {
                compoundButton.setChecked(!z3);
            }
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.f5114U = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f3836J0, i4, i5);
        N(e.f(typedArrayObtainStyledAttributes, g.f3852R0, g.f3838K0));
        M(e.f(typedArrayObtainStyledAttributes, g.f3850Q0, g.f3840L0));
        Q(e.f(typedArrayObtainStyledAttributes, g.f3856T0, g.f3844N0));
        P(e.f(typedArrayObtainStyledAttributes, g.f3854S0, g.f3846O0));
        L(e.b(typedArrayObtainStyledAttributes, g.f3848P0, g.f3842M0, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    private void S(View view) {
        if (((AccessibilityManager) g().getSystemService("accessibility")).isEnabled()) {
            R(view.findViewById(R.id.switch_widget));
            O(view.findViewById(R.id.summary));
        }
    }

    @Override // androidx.preference.Preference
    public void C(View view) {
        super.C(view);
        S(view);
    }

    public void P(CharSequence charSequence) {
        this.f5116W = charSequence;
        v();
    }

    public void Q(CharSequence charSequence) {
        this.f5115V = charSequence;
        v();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void R(View view) {
        boolean z3 = view instanceof Switch;
        if (z3) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f5122P);
        }
        if (z3) {
            Switch r4 = (Switch) view;
            r4.setTextOn(this.f5115V);
            r4.setTextOff(this.f5116W);
            r4.setOnCheckedChangeListener(this.f5114U);
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, 0);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a(context, c.f3813j, R.attr.switchPreferenceStyle));
    }
}
