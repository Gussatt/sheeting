package androidx.preference;

import X.c;
import X.g;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.HashSet;
import java.util.Set;
import u.e;

/* JADX INFO: loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public CharSequence[] f5057V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public CharSequence[] f5058W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public Set f5059X;

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.f5059X = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f3823D, i4, i5);
        this.f5057V = e.h(typedArrayObtainStyledAttributes, g.f3829G, g.f3825E);
        this.f5058W = e.h(typedArrayObtainStyledAttributes, g.f3831H, g.f3827F);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public Object z(TypedArray typedArray, int i4) {
        CharSequence[] textArray = typedArray.getTextArray(i4);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, 0);
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a(context, c.f3805b, R.attr.dialogPreferenceStyle));
    }
}
