package androidx.preference;

import X.c;
import X.f;
import X.g;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.preference.Preference;
import u.e;

/* JADX INFO: loaded from: classes.dex */
public class ListPreference extends DialogPreference {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public CharSequence[] f5051V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public CharSequence[] f5052W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public String f5053X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public String f5054Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public boolean f5055Z;

    public static final class a implements Preference.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static a f5056a;

        public static a b() {
            if (f5056a == null) {
                f5056a = new a();
            }
            return f5056a;
        }

        @Override // androidx.preference.Preference.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public CharSequence a(ListPreference listPreference) {
            return TextUtils.isEmpty(listPreference.L()) ? listPreference.g().getString(f.f3816a) : listPreference.L();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f3920x, i4, i5);
        this.f5051V = e.h(typedArrayObtainStyledAttributes, g.f3817A, g.f3922y);
        this.f5052W = e.h(typedArrayObtainStyledAttributes, g.f3819B, g.f3924z);
        int i6 = g.f3821C;
        if (e.b(typedArrayObtainStyledAttributes, i6, i6, false)) {
            G(a.b());
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, g.f3833I, i4, i5);
        this.f5054Y = e.f(typedArrayObtainStyledAttributes2, g.f3907q0, g.f3849Q);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public int J(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.f5052W) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(this.f5052W[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    public CharSequence[] K() {
        return this.f5051V;
    }

    public CharSequence L() {
        CharSequence[] charSequenceArr;
        int iO = O();
        if (iO < 0 || (charSequenceArr = this.f5051V) == null) {
            return null;
        }
        return charSequenceArr[iO];
    }

    public CharSequence[] M() {
        return this.f5052W;
    }

    public String N() {
        return this.f5053X;
    }

    public final int O() {
        return J(this.f5053X);
    }

    public void P(String str) {
        boolean zEquals = TextUtils.equals(this.f5053X, str);
        if (zEquals && this.f5055Z) {
            return;
        }
        this.f5053X = str;
        this.f5055Z = true;
        F(str);
        if (zEquals) {
            return;
        }
        v();
    }

    @Override // androidx.preference.Preference
    public CharSequence p() {
        if (q() != null) {
            return q().a(this);
        }
        CharSequence charSequenceL = L();
        CharSequence charSequenceP = super.p();
        String str = this.f5054Y;
        if (str != null) {
            if (charSequenceL == null) {
                charSequenceL = "";
            }
            String str2 = String.format(str, charSequenceL);
            if (!TextUtils.equals(str2, charSequenceP)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return str2;
            }
        }
        return charSequenceP;
    }

    @Override // androidx.preference.Preference
    public Object z(TypedArray typedArray, int i4) {
        return typedArray.getString(i4);
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a(context, c.f3805b, R.attr.dialogPreferenceStyle));
    }
}
