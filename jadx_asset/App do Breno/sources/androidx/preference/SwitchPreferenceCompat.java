package androidx.preference;

import X.c;
import X.d;
import X.g;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import u.e;

/* JADX INFO: loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final a f5118U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public CharSequence f5119V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public CharSequence f5120W;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
            if (SwitchPreferenceCompat.this.d(Boolean.valueOf(z3))) {
                SwitchPreferenceCompat.this.K(z3);
            } else {
                compoundButton.setChecked(!z3);
            }
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.f5118U = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f3858U0, i4, i5);
        N(e.f(typedArrayObtainStyledAttributes, g.f3877c1, g.f3860V0));
        M(e.f(typedArrayObtainStyledAttributes, g.f3874b1, g.f3862W0));
        Q(e.f(typedArrayObtainStyledAttributes, g.f3883e1, g.f3866Y0));
        P(e.f(typedArrayObtainStyledAttributes, g.f3880d1, g.f3868Z0));
        L(e.b(typedArrayObtainStyledAttributes, g.f3871a1, g.f3864X0, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void R(View view) {
        boolean z3 = view instanceof SwitchCompat;
        if (z3) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f5122P);
        }
        if (z3) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.f5119V);
            switchCompat.setTextOff(this.f5120W);
            switchCompat.setOnCheckedChangeListener(this.f5118U);
        }
    }

    private void S(View view) {
        if (((AccessibilityManager) g().getSystemService("accessibility")).isEnabled()) {
            R(view.findViewById(d.f3814a));
            O(view.findViewById(R.id.summary));
        }
    }

    @Override // androidx.preference.Preference
    public void C(View view) {
        super.C(view);
        S(view);
    }

    public void P(CharSequence charSequence) {
        this.f5120W = charSequence;
        v();
    }

    public void Q(CharSequence charSequence) {
        this.f5119V = charSequence;
        v();
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, 0);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.f3812i);
    }
}
