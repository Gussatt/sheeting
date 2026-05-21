package androidx.preference;

import X.c;
import X.f;
import X.g;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.Preference;
import u.e;

/* JADX INFO: loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public String f5049V;

    public static final class a implements Preference.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static a f5050a;

        public static a b() {
            if (f5050a == null) {
                f5050a = new a();
            }
            return f5050a;
        }

        @Override // androidx.preference.Preference.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public CharSequence a(EditTextPreference editTextPreference) {
            return TextUtils.isEmpty(editTextPreference.J()) ? editTextPreference.g().getString(f.f3816a) : editTextPreference.J();
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f3916v, i4, i5);
        int i6 = g.f3918w;
        if (e.b(typedArrayObtainStyledAttributes, i6, i6, false)) {
            G(a.b());
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public boolean H() {
        return TextUtils.isEmpty(this.f5049V) || super.H();
    }

    public String J() {
        return this.f5049V;
    }

    @Override // androidx.preference.Preference
    public Object z(TypedArray typedArray, int i4) {
        return typedArray.getString(i4);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, 0);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a(context, c.f3807d, R.attr.editTextPreferenceStyle));
    }
}
