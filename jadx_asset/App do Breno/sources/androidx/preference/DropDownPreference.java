package androidx.preference;

import X.c;
import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/* JADX INFO: loaded from: classes.dex */
public class DropDownPreference extends ListPreference {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Context f5044a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final ArrayAdapter f5045b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public Spinner f5046c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final AdapterView.OnItemSelectedListener f5047d0;

    public class a implements AdapterView.OnItemSelectedListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i4, long j4) {
            if (i4 >= 0) {
                String string = DropDownPreference.this.M()[i4].toString();
                if (string.equals(DropDownPreference.this.N()) || !DropDownPreference.this.d(string)) {
                    return;
                }
                DropDownPreference.this.P(string);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.f3806c);
    }

    public ArrayAdapter Q() {
        return new ArrayAdapter(this.f5044a0, R.layout.simple_spinner_dropdown_item);
    }

    public final void R() {
        this.f5045b0.clear();
        if (K() != null) {
            for (CharSequence charSequence : K()) {
                this.f5045b0.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    public void v() {
        super.v();
        ArrayAdapter arrayAdapter = this.f5045b0;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public void x() {
        this.f5046c0.performClick();
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, 0);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.f5047d0 = new a();
        this.f5044a0 = context;
        this.f5045b0 = Q();
        R();
    }
}
