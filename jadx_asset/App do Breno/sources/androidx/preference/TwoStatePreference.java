package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f5122P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public CharSequence f5123Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public CharSequence f5124R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f5125S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f5126T;

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
    }

    @Override // androidx.preference.Preference
    public boolean H() {
        return (this.f5126T ? this.f5122P : !this.f5122P) || super.H();
    }

    public boolean J() {
        return this.f5122P;
    }

    public void K(boolean z3) {
        boolean z4 = this.f5122P != z3;
        if (z4 || !this.f5125S) {
            this.f5122P = z3;
            this.f5125S = true;
            D(z3);
            if (z4) {
                w(H());
                v();
            }
        }
    }

    public void L(boolean z3) {
        this.f5126T = z3;
    }

    public void M(CharSequence charSequence) {
        this.f5124R = charSequence;
        if (J()) {
            return;
        }
        v();
    }

    public void N(CharSequence charSequence) {
        this.f5123Q = charSequence;
        if (J()) {
            v();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void O(android.view.View r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 != 0) goto L5
            goto L4c
        L5:
            android.widget.TextView r5 = (android.widget.TextView) r5
            boolean r0 = r4.f5122P
            r1 = 0
            if (r0 == 0) goto L1b
            java.lang.CharSequence r0 = r4.f5123Q
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1b
            java.lang.CharSequence r0 = r4.f5123Q
            r5.setText(r0)
        L19:
            r0 = r1
            goto L2e
        L1b:
            boolean r0 = r4.f5122P
            if (r0 != 0) goto L2d
            java.lang.CharSequence r0 = r4.f5124R
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2d
            java.lang.CharSequence r0 = r4.f5124R
            r5.setText(r0)
            goto L19
        L2d:
            r0 = 1
        L2e:
            if (r0 == 0) goto L3e
            java.lang.CharSequence r2 = r4.p()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L3e
            r5.setText(r2)
            r0 = r1
        L3e:
            if (r0 != 0) goto L41
            goto L43
        L41:
            r1 = 8
        L43:
            int r0 = r5.getVisibility()
            if (r1 == r0) goto L4c
            r5.setVisibility(r1)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.O(android.view.View):void");
    }

    @Override // androidx.preference.Preference
    public void x() {
        super.x();
        boolean z3 = !J();
        if (d(Boolean.valueOf(z3))) {
            K(z3);
        }
    }

    @Override // androidx.preference.Preference
    public Object z(TypedArray typedArray, int i4) {
        return Boolean.valueOf(typedArray.getBoolean(i4, false));
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
