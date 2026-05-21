package androidx.preference;

import X.c;
import X.e;
import X.g;
import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Preference implements Comparable<Preference> {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f5060A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f5061B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f5062C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f5063D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f5064E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f5065F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f5066G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f5067H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f5068I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f5069J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f5070K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f5071L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public List f5072M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public b f5073N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final View.OnClickListener f5074O;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Context f5075m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f5076n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f5077o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f5078p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f5079q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f5080r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f5081s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Intent f5082t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f5083u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f5084v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f5085w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f5086x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f5087y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Object f5088z;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Preference.this.C(view);
        }
    }

    public interface b {
        CharSequence a(Preference preference);
    }

    public Preference(Context context, AttributeSet attributeSet, int i4, int i5) {
        this.f5076n = Integer.MAX_VALUE;
        this.f5077o = 0;
        this.f5084v = true;
        this.f5085w = true;
        this.f5086x = true;
        this.f5060A = true;
        this.f5061B = true;
        this.f5062C = true;
        this.f5063D = true;
        this.f5064E = true;
        this.f5066G = true;
        this.f5069J = true;
        this.f5070K = e.f3815a;
        this.f5074O = new a();
        this.f5075m = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f3833I, i4, i5);
        this.f5080r = u.e.e(typedArrayObtainStyledAttributes, g.f3887g0, g.f3835J, 0);
        this.f5081s = u.e.f(typedArrayObtainStyledAttributes, g.f3893j0, g.f3847P);
        this.f5078p = u.e.g(typedArrayObtainStyledAttributes, g.f3909r0, g.f3843N);
        this.f5079q = u.e.g(typedArrayObtainStyledAttributes, g.f3907q0, g.f3849Q);
        this.f5076n = u.e.d(typedArrayObtainStyledAttributes, g.f3897l0, g.f3851R, Integer.MAX_VALUE);
        this.f5083u = u.e.f(typedArrayObtainStyledAttributes, g.f3885f0, g.f3861W);
        this.f5070K = u.e.e(typedArrayObtainStyledAttributes, g.f3895k0, g.f3841M, e.f3815a);
        this.f5071L = u.e.e(typedArrayObtainStyledAttributes, g.f3911s0, g.f3853S, 0);
        this.f5084v = u.e.b(typedArrayObtainStyledAttributes, g.f3882e0, g.f3839L, true);
        this.f5085w = u.e.b(typedArrayObtainStyledAttributes, g.f3901n0, g.f3845O, true);
        this.f5086x = u.e.b(typedArrayObtainStyledAttributes, g.f3899m0, g.f3837K, true);
        this.f5087y = u.e.f(typedArrayObtainStyledAttributes, g.f3876c0, g.f3855T);
        int i6 = g.f3867Z;
        this.f5063D = u.e.b(typedArrayObtainStyledAttributes, i6, i6, this.f5085w);
        int i7 = g.f3870a0;
        this.f5064E = u.e.b(typedArrayObtainStyledAttributes, i7, i7, this.f5085w);
        if (typedArrayObtainStyledAttributes.hasValue(g.f3873b0)) {
            this.f5088z = z(typedArrayObtainStyledAttributes, g.f3873b0);
        } else if (typedArrayObtainStyledAttributes.hasValue(g.f3857U)) {
            this.f5088z = z(typedArrayObtainStyledAttributes, g.f3857U);
        }
        this.f5069J = u.e.b(typedArrayObtainStyledAttributes, g.f3903o0, g.f3859V, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(g.f3905p0);
        this.f5065F = zHasValue;
        if (zHasValue) {
            this.f5066G = u.e.b(typedArrayObtainStyledAttributes, g.f3905p0, g.f3863X, true);
        }
        this.f5067H = u.e.b(typedArrayObtainStyledAttributes, g.f3889h0, g.f3865Y, false);
        int i8 = g.f3891i0;
        this.f5062C = u.e.b(typedArrayObtainStyledAttributes, i8, i8, true);
        int i9 = g.f3879d0;
        this.f5068I = u.e.b(typedArrayObtainStyledAttributes, i9, i9, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public void A(Preference preference, boolean z3) {
        if (this.f5061B == z3) {
            this.f5061B = !z3;
            w(H());
            v();
        }
    }

    public void B() {
        if (t() && u()) {
            x();
            o();
            if (this.f5082t != null) {
                g().startActivity(this.f5082t);
            }
        }
    }

    public void C(View view) {
        B();
    }

    public boolean D(boolean z3) {
        if (!I()) {
            return false;
        }
        if (z3 == k(!z3)) {
            return true;
        }
        n();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    public boolean E(int i4) {
        if (!I()) {
            return false;
        }
        if (i4 == l(~i4)) {
            return true;
        }
        n();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    public boolean F(String str) {
        if (!I()) {
            return false;
        }
        Object obj = null;
        if (TextUtils.equals(str, m(null))) {
            return true;
        }
        n();
        obj.getClass();
        throw null;
    }

    public final void G(b bVar) {
        this.f5073N = bVar;
        v();
    }

    public boolean H() {
        return !t();
    }

    public boolean I() {
        return false;
    }

    public boolean d(Object obj) {
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(Preference preference) {
        int i4 = this.f5076n;
        int i5 = preference.f5076n;
        if (i4 != i5) {
            return i4 - i5;
        }
        CharSequence charSequence = this.f5078p;
        CharSequence charSequence2 = preference.f5078p;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.f5078p.toString());
    }

    public Context g() {
        return this.f5075m;
    }

    public StringBuilder h() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequenceR = r();
        if (!TextUtils.isEmpty(charSequenceR)) {
            sb.append(charSequenceR);
            sb.append(' ');
        }
        CharSequence charSequenceP = p();
        if (!TextUtils.isEmpty(charSequenceP)) {
            sb.append(charSequenceP);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb;
    }

    public String i() {
        return this.f5083u;
    }

    public Intent j() {
        return this.f5082t;
    }

    public boolean k(boolean z3) {
        if (!I()) {
            return z3;
        }
        n();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    public int l(int i4) {
        if (!I()) {
            return i4;
        }
        n();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    public String m(String str) {
        if (!I()) {
            return str;
        }
        n();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    public X.a n() {
        return null;
    }

    public X.b o() {
        return null;
    }

    public CharSequence p() {
        return q() != null ? q().a(this) : this.f5079q;
    }

    public final b q() {
        return this.f5073N;
    }

    public CharSequence r() {
        return this.f5078p;
    }

    public boolean s() {
        return !TextUtils.isEmpty(this.f5081s);
    }

    public boolean t() {
        return this.f5084v && this.f5060A && this.f5061B;
    }

    public String toString() {
        return h().toString();
    }

    public boolean u() {
        return this.f5085w;
    }

    public void v() {
    }

    public void w(boolean z3) {
        List list = this.f5072M;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((Preference) list.get(i4)).y(this, z3);
        }
    }

    public void x() {
    }

    public void y(Preference preference, boolean z3) {
        if (this.f5060A == z3) {
            this.f5060A = !z3;
            w(H());
            v();
        }
    }

    public Object z(TypedArray typedArray, int i4) {
        return null;
    }

    public Preference(Context context, AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, 0);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, u.e.a(context, c.f3810g, R.attr.preferenceStyle));
    }
}
