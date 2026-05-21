package androidx.recyclerview.widget;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.n {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f5163A;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public c f5169r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public h f5170s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f5171t;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f5168q = 1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f5172u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f5173v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f5174w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f5175x = true;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f5176y = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f5177z = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public d f5164B = null;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final a f5165C = new a();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final b f5166D = new b();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f5167E = 2;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public h f5178a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f5179b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f5180c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f5181d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f5182e;

        public a() {
            a();
        }

        public void a() {
            this.f5179b = -1;
            this.f5180c = Integer.MIN_VALUE;
            this.f5181d = false;
            this.f5182e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f5179b + ", mCoordinate=" + this.f5180c + ", mLayoutFromEnd=" + this.f5181d + ", mValid=" + this.f5182e + '}';
        }
    }

    public static class b {
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f5183a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f5184b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f5185c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public List f5186d = null;
    }

    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f5187m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f5188n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f5189o;

        public static class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i4) {
                return new d[i4];
            }
        }

        public d() {
        }

        public void a() {
            this.f5187m = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            parcel.writeInt(this.f5187m);
            parcel.writeInt(this.f5188n);
            parcel.writeInt(this.f5189o ? 1 : 0);
        }

        public d(Parcel parcel) {
            this.f5187m = parcel.readInt();
            this.f5188n = parcel.readInt();
            this.f5189o = parcel.readInt() == 1;
        }

        public d(d dVar) {
            this.f5187m = dVar.f5187m;
            this.f5188n = dVar.f5188n;
            this.f5189o = dVar.f5189o;
        }
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i4, int i5) {
        RecyclerView.n.c cVarJ = RecyclerView.n.J(context, attributeSet, i4, i5);
        R0(cVarJ.f5300a);
        S0(cVarJ.f5302c);
        T0(cVarJ.f5303d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean E0() {
        return this.f5164B == null && this.f5171t == this.f5174w;
    }

    public final int F0(RecyclerView.x xVar) {
        if (t() == 0) {
            return 0;
        }
        J0();
        return j.a(xVar, this.f5170s, L0(!this.f5175x, true), K0(!this.f5175x, true), this, this.f5175x);
    }

    public final int G0(RecyclerView.x xVar) {
        if (t() == 0) {
            return 0;
        }
        J0();
        return j.b(xVar, this.f5170s, L0(!this.f5175x, true), K0(!this.f5175x, true), this, this.f5175x, this.f5173v);
    }

    public final int H0(RecyclerView.x xVar) {
        if (t() == 0) {
            return 0;
        }
        J0();
        return j.c(xVar, this.f5170s, L0(!this.f5175x, true), K0(!this.f5175x, true), this, this.f5175x);
    }

    public c I0() {
        return new c();
    }

    public void J0() {
        if (this.f5169r == null) {
            this.f5169r = I0();
        }
    }

    public final View K0(boolean z3, boolean z4) {
        return this.f5173v ? O0(0, t(), z3, z4) : O0(t() - 1, -1, z3, z4);
    }

    public final View L0(boolean z3, boolean z4) {
        return this.f5173v ? O0(t() - 1, -1, z3, z4) : O0(0, t(), z3, z4);
    }

    public int M0() {
        View viewO0 = O0(0, t(), false, true);
        if (viewO0 == null) {
            return -1;
        }
        return I(viewO0);
    }

    public int N0() {
        View viewO0 = O0(t() - 1, -1, false, true);
        if (viewO0 == null) {
            return -1;
        }
        return I(viewO0);
    }

    public View O0(int i4, int i5, boolean z3, boolean z4) {
        J0();
        int i6 = z3 ? 24579 : 320;
        int i7 = z4 ? 320 : 0;
        return this.f5168q == 0 ? this.f5286e.a(i4, i5, i6, i7) : this.f5287f.a(i4, i5, i6, i7);
    }

    public final View P0() {
        return s(this.f5173v ? 0 : t() - 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean Q() {
        return true;
    }

    public final View Q0() {
        return s(this.f5173v ? t() - 1 : 0);
    }

    public void R0(int i4) {
        if (i4 != 0 && i4 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i4);
        }
        a(null);
        if (i4 != this.f5168q || this.f5170s == null) {
            h hVarB = h.b(this, i4);
            this.f5170s = hVarB;
            this.f5165C.f5178a = hVarB;
            this.f5168q = i4;
            A0();
        }
    }

    public void S0(boolean z3) {
        a(null);
        if (z3 == this.f5172u) {
            return;
        }
        this.f5172u = z3;
        A0();
    }

    public void T0(boolean z3) {
        a(null);
        if (this.f5174w == z3) {
            return;
        }
        this.f5174w = z3;
        A0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void Y(RecyclerView recyclerView, RecyclerView.t tVar) {
        super.Y(recyclerView, tVar);
        if (this.f5163A) {
            v0(tVar);
            tVar.b();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void Z(AccessibilityEvent accessibilityEvent) {
        super.Z(accessibilityEvent);
        if (t() > 0) {
            accessibilityEvent.setFromIndex(M0());
            accessibilityEvent.setToIndex(N0());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void a(String str) {
        if (this.f5164B == null) {
            super.a(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean b() {
        return this.f5168q == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean c() {
        return this.f5168q == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int f(RecyclerView.x xVar) {
        return F0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int g(RecyclerView.x xVar) {
        return G0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int h(RecyclerView.x xVar) {
        return H0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int i(RecyclerView.x xVar) {
        return F0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int j(RecyclerView.x xVar) {
        return G0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int k(RecyclerView.x xVar) {
        return H0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public RecyclerView.o n() {
        return new RecyclerView.o(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void o0(Parcelable parcelable) {
        if (parcelable instanceof d) {
            this.f5164B = (d) parcelable;
            A0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public Parcelable p0() {
        if (this.f5164B != null) {
            return new d(this.f5164B);
        }
        d dVar = new d();
        if (t() <= 0) {
            dVar.a();
            return dVar;
        }
        J0();
        boolean z3 = this.f5171t ^ this.f5173v;
        dVar.f5189o = z3;
        if (z3) {
            View viewP0 = P0();
            dVar.f5188n = this.f5170s.f() - this.f5170s.d(viewP0);
            dVar.f5187m = I(viewP0);
            return dVar;
        }
        View viewQ0 = Q0();
        dVar.f5187m = I(viewQ0);
        dVar.f5188n = this.f5170s.e(viewQ0) - this.f5170s.g();
        return dVar;
    }
}
