package androidx.preference;

import X.c;
import X.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class SeekBarPreference extends Preference {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f5100P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f5101Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f5102R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f5103S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f5104T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public SeekBar f5105U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public TextView f5106V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f5107W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public boolean f5108X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f5109Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final SeekBar.OnSeekBarChangeListener f5110Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final View.OnKeyListener f5111a0;

    public class a implements SeekBar.OnSeekBarChangeListener {
        public a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i4, boolean z3) {
            if (z3) {
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (seekBarPreference.f5109Y || !seekBarPreference.f5104T) {
                    seekBarPreference.M(seekBar);
                    return;
                }
            }
            SeekBarPreference seekBarPreference2 = SeekBarPreference.this;
            seekBarPreference2.N(i4 + seekBarPreference2.f5101Q);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f5104T = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f5104T = false;
            int progress = seekBar.getProgress();
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if (progress + seekBarPreference.f5101Q != seekBarPreference.f5100P) {
                seekBarPreference.M(seekBar);
            }
        }
    }

    public class b implements View.OnKeyListener {
        public b() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i4, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if ((!seekBarPreference.f5107W && (i4 == 21 || i4 == 22)) || i4 == 23 || i4 == 66) {
                return false;
            }
            SeekBar seekBar = seekBarPreference.f5105U;
            if (seekBar != null) {
                return seekBar.onKeyDown(i4, keyEvent);
            }
            Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
            return false;
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.f5110Z = new a();
        this.f5111a0 = new b();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f3822C0, i4, i5);
        this.f5101Q = typedArrayObtainStyledAttributes.getInt(g.f3828F0, 0);
        J(typedArrayObtainStyledAttributes.getInt(g.f3824D0, 100));
        K(typedArrayObtainStyledAttributes.getInt(g.f3830G0, 0));
        this.f5107W = typedArrayObtainStyledAttributes.getBoolean(g.f3826E0, true);
        this.f5108X = typedArrayObtainStyledAttributes.getBoolean(g.f3832H0, false);
        this.f5109Y = typedArrayObtainStyledAttributes.getBoolean(g.f3834I0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void J(int i4) {
        int i5 = this.f5101Q;
        if (i4 < i5) {
            i4 = i5;
        }
        if (i4 != this.f5102R) {
            this.f5102R = i4;
            v();
        }
    }

    public final void K(int i4) {
        if (i4 != this.f5103S) {
            this.f5103S = Math.min(this.f5102R - this.f5101Q, Math.abs(i4));
            v();
        }
    }

    public final void L(int i4, boolean z3) {
        int i5 = this.f5101Q;
        if (i4 < i5) {
            i4 = i5;
        }
        int i6 = this.f5102R;
        if (i4 > i6) {
            i4 = i6;
        }
        if (i4 != this.f5100P) {
            this.f5100P = i4;
            N(i4);
            E(i4);
            if (z3) {
                v();
            }
        }
    }

    public void M(SeekBar seekBar) {
        int progress = this.f5101Q + seekBar.getProgress();
        if (progress != this.f5100P) {
            if (d(Integer.valueOf(progress))) {
                L(progress, false);
            } else {
                seekBar.setProgress(this.f5100P - this.f5101Q);
                N(this.f5100P);
            }
        }
    }

    public void N(int i4) {
        TextView textView = this.f5106V;
        if (textView != null) {
            textView.setText(String.valueOf(i4));
        }
    }

    @Override // androidx.preference.Preference
    public Object z(TypedArray typedArray, int i4) {
        return Integer.valueOf(typedArray.getInt(i4, 0));
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, 0);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.f3811h);
    }
}
