package androidx.preference;

import X.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p.C1481g;
import u.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final C1481g f5090P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final Handler f5091Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final List f5092R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f5093S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public int f5094T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f5095U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public int f5096V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final Runnable f5097W;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                PreferenceGroup.this.f5090P.clear();
            }
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.f5090P = new C1481g();
        this.f5091Q = new Handler(Looper.getMainLooper());
        this.f5093S = true;
        this.f5094T = 0;
        this.f5095U = false;
        this.f5096V = Integer.MAX_VALUE;
        this.f5097W = new a();
        this.f5092R = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f3917v0, i4, i5);
        int i6 = g.f3921x0;
        this.f5093S = e.b(typedArrayObtainStyledAttributes, i6, i6, true);
        if (typedArrayObtainStyledAttributes.hasValue(g.f3919w0)) {
            int i7 = g.f3919w0;
            L(e.d(typedArrayObtainStyledAttributes, i7, i7, Integer.MAX_VALUE));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public Preference J(int i4) {
        return (Preference) this.f5092R.get(i4);
    }

    public int K() {
        return this.f5092R.size();
    }

    public void L(int i4) {
        if (i4 != Integer.MAX_VALUE && !s()) {
            Log.e("PreferenceGroup", getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        this.f5096V = i4;
    }

    @Override // androidx.preference.Preference
    public void w(boolean z3) {
        super.w(z3);
        int iK = K();
        for (int i4 = 0; i4 < iK; i4++) {
            J(i4).A(this, z3);
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
