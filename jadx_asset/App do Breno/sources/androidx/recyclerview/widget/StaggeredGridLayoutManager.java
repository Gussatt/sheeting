package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.n {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f5342D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f5343E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public e f5344F;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public f[] f5351r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public h f5352s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public h f5353t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f5354u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final androidx.recyclerview.widget.f f5355v;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public BitSet f5358y;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f5350q = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f5356w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f5357x = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f5359z = -1;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f5339A = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public d f5340B = new d();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f5341C = 2;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final Rect f5345G = new Rect();

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final b f5346H = new b();

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f5347I = false;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f5348J = true;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final Runnable f5349K = new a();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.F0();
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5361a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f5362b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f5363c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f5364d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f5365e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int[] f5366f;

        public b() {
            a();
        }

        public void a() {
            this.f5361a = -1;
            this.f5362b = Integer.MIN_VALUE;
            this.f5363c = false;
            this.f5364d = false;
            this.f5365e = false;
            int[] iArr = this.f5366f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    public static class c extends RecyclerView.o {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public f f5368d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f5369e;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(int i4, int i5) {
            super(i4, i5);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int[] f5370a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List f5371b;

        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0100a();

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public int f5372m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public int f5373n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public int[] f5374o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public boolean f5375p;

            /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a, reason: collision with other inner class name */
            public static class C0100a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public a[] newArray(int i4) {
                    return new a[i4];
                }
            }

            public a(Parcel parcel) {
                this.f5372m = parcel.readInt();
                this.f5373n = parcel.readInt();
                this.f5375p = parcel.readInt() == 1;
                int i4 = parcel.readInt();
                if (i4 > 0) {
                    int[] iArr = new int[i4];
                    this.f5374o = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            public int a(int i4) {
                int[] iArr = this.f5374o;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i4];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f5372m + ", mGapDir=" + this.f5373n + ", mHasUnwantedGapAfter=" + this.f5375p + ", mGapPerSpan=" + Arrays.toString(this.f5374o) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i4) {
                parcel.writeInt(this.f5372m);
                parcel.writeInt(this.f5373n);
                parcel.writeInt(this.f5375p ? 1 : 0);
                int[] iArr = this.f5374o;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f5374o);
                }
            }
        }

        public void a() {
            int[] iArr = this.f5370a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f5371b = null;
        }

        public void b(int i4) {
            int[] iArr = this.f5370a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i4, 10) + 1];
                this.f5370a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i4 >= iArr.length) {
                int[] iArr3 = new int[l(i4)];
                this.f5370a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f5370a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public int c(int i4) {
            List list = this.f5371b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (((a) this.f5371b.get(size)).f5372m >= i4) {
                        this.f5371b.remove(size);
                    }
                }
            }
            return f(i4);
        }

        public a d(int i4, int i5, int i6, boolean z3) {
            List list = this.f5371b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                a aVar = (a) this.f5371b.get(i7);
                int i8 = aVar.f5372m;
                if (i8 >= i5) {
                    return null;
                }
                if (i8 >= i4 && (i6 == 0 || aVar.f5373n == i6 || (z3 && aVar.f5375p))) {
                    return aVar;
                }
            }
            return null;
        }

        public a e(int i4) {
            List list = this.f5371b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f5371b.get(size);
                if (aVar.f5372m == i4) {
                    return aVar;
                }
            }
            return null;
        }

        public int f(int i4) {
            int[] iArr = this.f5370a;
            if (iArr == null || i4 >= iArr.length) {
                return -1;
            }
            int iG = g(i4);
            if (iG == -1) {
                int[] iArr2 = this.f5370a;
                Arrays.fill(iArr2, i4, iArr2.length, -1);
                return this.f5370a.length;
            }
            int i5 = iG + 1;
            Arrays.fill(this.f5370a, i4, i5, -1);
            return i5;
        }

        public final int g(int i4) {
            if (this.f5371b == null) {
                return -1;
            }
            a aVarE = e(i4);
            if (aVarE != null) {
                this.f5371b.remove(aVarE);
            }
            int size = this.f5371b.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    i5 = -1;
                    break;
                }
                if (((a) this.f5371b.get(i5)).f5372m >= i4) {
                    break;
                }
                i5++;
            }
            if (i5 == -1) {
                return -1;
            }
            a aVar = (a) this.f5371b.get(i5);
            this.f5371b.remove(i5);
            return aVar.f5372m;
        }

        public void h(int i4, int i5) {
            int[] iArr = this.f5370a;
            if (iArr == null || i4 >= iArr.length) {
                return;
            }
            int i6 = i4 + i5;
            b(i6);
            int[] iArr2 = this.f5370a;
            System.arraycopy(iArr2, i4, iArr2, i6, (iArr2.length - i4) - i5);
            Arrays.fill(this.f5370a, i4, i6, -1);
            j(i4, i5);
        }

        public void i(int i4, int i5) {
            int[] iArr = this.f5370a;
            if (iArr == null || i4 >= iArr.length) {
                return;
            }
            int i6 = i4 + i5;
            b(i6);
            int[] iArr2 = this.f5370a;
            System.arraycopy(iArr2, i6, iArr2, i4, (iArr2.length - i4) - i5);
            int[] iArr3 = this.f5370a;
            Arrays.fill(iArr3, iArr3.length - i5, iArr3.length, -1);
            k(i4, i5);
        }

        public final void j(int i4, int i5) {
            List list = this.f5371b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f5371b.get(size);
                int i6 = aVar.f5372m;
                if (i6 >= i4) {
                    aVar.f5372m = i6 + i5;
                }
            }
        }

        public final void k(int i4, int i5) {
            List list = this.f5371b;
            if (list == null) {
                return;
            }
            int i6 = i4 + i5;
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f5371b.get(size);
                int i7 = aVar.f5372m;
                if (i7 >= i4) {
                    if (i7 < i6) {
                        this.f5371b.remove(size);
                    } else {
                        aVar.f5372m = i7 - i5;
                    }
                }
            }
        }

        public int l(int i4) {
            int length = this.f5370a.length;
            while (length <= i4) {
                length *= 2;
            }
            return length;
        }
    }

    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f5376m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f5377n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f5378o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int[] f5379p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f5380q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int[] f5381r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public List f5382s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f5383t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public boolean f5384u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f5385v;

        public static class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public e[] newArray(int i4) {
                return new e[i4];
            }
        }

        public e() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            parcel.writeInt(this.f5376m);
            parcel.writeInt(this.f5377n);
            parcel.writeInt(this.f5378o);
            if (this.f5378o > 0) {
                parcel.writeIntArray(this.f5379p);
            }
            parcel.writeInt(this.f5380q);
            if (this.f5380q > 0) {
                parcel.writeIntArray(this.f5381r);
            }
            parcel.writeInt(this.f5383t ? 1 : 0);
            parcel.writeInt(this.f5384u ? 1 : 0);
            parcel.writeInt(this.f5385v ? 1 : 0);
            parcel.writeList(this.f5382s);
        }

        public e(Parcel parcel) {
            this.f5376m = parcel.readInt();
            this.f5377n = parcel.readInt();
            int i4 = parcel.readInt();
            this.f5378o = i4;
            if (i4 > 0) {
                int[] iArr = new int[i4];
                this.f5379p = iArr;
                parcel.readIntArray(iArr);
            }
            int i5 = parcel.readInt();
            this.f5380q = i5;
            if (i5 > 0) {
                int[] iArr2 = new int[i5];
                this.f5381r = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f5383t = parcel.readInt() == 1;
            this.f5384u = parcel.readInt() == 1;
            this.f5385v = parcel.readInt() == 1;
            this.f5382s = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f5378o = eVar.f5378o;
            this.f5376m = eVar.f5376m;
            this.f5377n = eVar.f5377n;
            this.f5379p = eVar.f5379p;
            this.f5380q = eVar.f5380q;
            this.f5381r = eVar.f5381r;
            this.f5383t = eVar.f5383t;
            this.f5384u = eVar.f5384u;
            this.f5385v = eVar.f5385v;
            this.f5382s = eVar.f5382s;
        }
    }

    public class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ArrayList f5386a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f5387b = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f5388c = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f5389d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f5390e;

        public f(int i4) {
            this.f5390e = i4;
        }

        public void a() {
            d.a aVarE;
            ArrayList arrayList = this.f5386a;
            View view = (View) arrayList.get(arrayList.size() - 1);
            c cVarF = f(view);
            this.f5388c = StaggeredGridLayoutManager.this.f5352s.d(view);
            if (cVarF.f5369e && (aVarE = StaggeredGridLayoutManager.this.f5340B.e(cVarF.a())) != null && aVarE.f5373n == 1) {
                this.f5388c += aVarE.a(this.f5390e);
            }
        }

        public void b() {
            d.a aVarE;
            View view = (View) this.f5386a.get(0);
            c cVarF = f(view);
            this.f5387b = StaggeredGridLayoutManager.this.f5352s.e(view);
            if (cVarF.f5369e && (aVarE = StaggeredGridLayoutManager.this.f5340B.e(cVarF.a())) != null && aVarE.f5373n == -1) {
                this.f5387b -= aVarE.a(this.f5390e);
            }
        }

        public void c() {
            this.f5386a.clear();
            i();
            this.f5389d = 0;
        }

        public int d() {
            int i4 = this.f5388c;
            if (i4 != Integer.MIN_VALUE) {
                return i4;
            }
            a();
            return this.f5388c;
        }

        public int e(int i4) {
            int i5 = this.f5388c;
            if (i5 != Integer.MIN_VALUE) {
                return i5;
            }
            if (this.f5386a.size() == 0) {
                return i4;
            }
            a();
            return this.f5388c;
        }

        public c f(View view) {
            return (c) view.getLayoutParams();
        }

        public int g() {
            int i4 = this.f5387b;
            if (i4 != Integer.MIN_VALUE) {
                return i4;
            }
            b();
            return this.f5387b;
        }

        public int h(int i4) {
            int i5 = this.f5387b;
            if (i5 != Integer.MIN_VALUE) {
                return i5;
            }
            if (this.f5386a.size() == 0) {
                return i4;
            }
            b();
            return this.f5387b;
        }

        public void i() {
            this.f5387b = Integer.MIN_VALUE;
            this.f5388c = Integer.MIN_VALUE;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i4, int i5) {
        RecyclerView.n.c cVarJ = RecyclerView.n.J(context, attributeSet, i4, i5);
        U0(cVarJ.f5300a);
        W0(cVarJ.f5301b);
        V0(cVarJ.f5302c);
        this.f5355v = new androidx.recyclerview.widget.f();
        K0();
    }

    private int H0(RecyclerView.x xVar) {
        if (t() == 0) {
            return 0;
        }
        return j.a(xVar, this.f5352s, M0(!this.f5348J), L0(!this.f5348J), this, this.f5348J);
    }

    private int I0(RecyclerView.x xVar) {
        if (t() == 0) {
            return 0;
        }
        return j.b(xVar, this.f5352s, M0(!this.f5348J), L0(!this.f5348J), this, this.f5348J, this.f5357x);
    }

    private int J0(RecyclerView.x xVar) {
        if (t() == 0) {
            return 0;
        }
        return j.c(xVar, this.f5352s, M0(!this.f5348J), L0(!this.f5348J), this, this.f5348J);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean E0() {
        return this.f5344F == null;
    }

    public boolean F0() {
        int iO0;
        int iP0;
        if (t() == 0 || this.f5341C == 0 || !P()) {
            return false;
        }
        if (this.f5357x) {
            iO0 = P0();
            iP0 = O0();
        } else {
            iO0 = O0();
            iP0 = P0();
        }
        if (iO0 == 0 && R0() != null) {
            this.f5340B.a();
            B0();
            A0();
            return true;
        }
        if (!this.f5347I) {
            return false;
        }
        int i4 = this.f5357x ? -1 : 1;
        int i5 = iP0 + 1;
        d.a aVarD = this.f5340B.d(iO0, i5, i4, true);
        if (aVarD == null) {
            this.f5347I = false;
            this.f5340B.c(i5);
            return false;
        }
        d.a aVarD2 = this.f5340B.d(iO0, aVarD.f5372m, i4 * (-1), true);
        if (aVarD2 == null) {
            this.f5340B.c(aVarD.f5372m);
        } else {
            this.f5340B.c(aVarD2.f5372m + 1);
        }
        B0();
        A0();
        return true;
    }

    public final boolean G0(f fVar) {
        if (this.f5357x) {
            if (fVar.d() < this.f5352s.f()) {
                ArrayList arrayList = fVar.f5386a;
                return !fVar.f((View) arrayList.get(arrayList.size() - 1)).f5369e;
            }
        } else if (fVar.g() > this.f5352s.g()) {
            return !fVar.f((View) fVar.f5386a.get(0)).f5369e;
        }
        return false;
    }

    public final void K0() {
        this.f5352s = h.b(this, this.f5354u);
        this.f5353t = h.b(this, 1 - this.f5354u);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int L(RecyclerView.t tVar, RecyclerView.x xVar) {
        return this.f5354u == 0 ? this.f5350q : super.L(tVar, xVar);
    }

    public View L0(boolean z3) {
        int iG = this.f5352s.g();
        int iF = this.f5352s.f();
        View view = null;
        for (int iT = t() - 1; iT >= 0; iT--) {
            View viewS = s(iT);
            int iE = this.f5352s.e(viewS);
            int iD = this.f5352s.d(viewS);
            if (iD > iG && iE < iF) {
                if (iD <= iF || !z3) {
                    return viewS;
                }
                if (view == null) {
                    view = viewS;
                }
            }
        }
        return view;
    }

    public View M0(boolean z3) {
        int iG = this.f5352s.g();
        int iF = this.f5352s.f();
        int iT = t();
        View view = null;
        for (int i4 = 0; i4 < iT; i4++) {
            View viewS = s(i4);
            int iE = this.f5352s.e(viewS);
            if (this.f5352s.d(viewS) > iG && iE < iF) {
                if (iE >= iG || !z3) {
                    return viewS;
                }
                if (view == null) {
                    view = viewS;
                }
            }
        }
        return view;
    }

    public int N0() {
        View viewL0 = this.f5357x ? L0(true) : M0(true);
        if (viewL0 == null) {
            return -1;
        }
        return I(viewL0);
    }

    public int O0() {
        if (t() == 0) {
            return 0;
        }
        return I(s(0));
    }

    public int P0() {
        int iT = t();
        if (iT == 0) {
            return 0;
        }
        return I(s(iT - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean Q() {
        return this.f5341C != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q0(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f5357x
            if (r0 == 0) goto L9
            int r0 = r6.P0()
            goto Ld
        L9:
            int r0 = r6.O0()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1b
            if (r7 >= r8) goto L17
            int r2 = r8 + 1
        L15:
            r3 = r7
            goto L1e
        L17:
            int r2 = r7 + 1
            r3 = r8
            goto L1e
        L1b:
            int r2 = r7 + r8
            goto L15
        L1e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.f5340B
            r4.f(r3)
            r4 = 1
            if (r9 == r4) goto L3d
            r5 = 2
            if (r9 == r5) goto L37
            if (r9 == r1) goto L2c
            goto L42
        L2c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f5340B
            r9.i(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.f5340B
            r7.h(r8, r4)
            goto L42
        L37:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f5340B
            r9.i(r7, r8)
            goto L42
        L3d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f5340B
            r9.h(r7, r8)
        L42:
            if (r2 > r0) goto L45
            goto L57
        L45:
            boolean r7 = r6.f5357x
            if (r7 == 0) goto L4e
            int r7 = r6.O0()
            goto L52
        L4e:
            int r7 = r6.P0()
        L52:
            if (r3 > r7) goto L57
            r6.A0()
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.Q0(int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View R0() {
        /*
            r12 = this;
            int r0 = r12.t()
            int r1 = r0 + (-1)
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f5350q
            r2.<init>(r3)
            int r3 = r12.f5350q
            r4 = 0
            r5 = 1
            r2.set(r4, r3, r5)
            int r3 = r12.f5354u
            r6 = -1
            if (r3 != r5) goto L21
            boolean r3 = r12.T0()
            if (r3 == 0) goto L21
            r3 = r5
            goto L22
        L21:
            r3 = r6
        L22:
            boolean r7 = r12.f5357x
            if (r7 == 0) goto L28
            r0 = r6
            goto L29
        L28:
            r1 = r4
        L29:
            if (r1 >= r0) goto L2c
            r6 = r5
        L2c:
            if (r1 == r0) goto La4
            android.view.View r7 = r12.s(r1)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f5368d
            int r9 = r9.f5390e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L52
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f5368d
            boolean r9 = r12.G0(r9)
            if (r9 == 0) goto L4b
            goto La1
        L4b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f5368d
            int r9 = r9.f5390e
            r2.clear(r9)
        L52:
            boolean r9 = r8.f5369e
            if (r9 == 0) goto L57
            goto La2
        L57:
            int r9 = r1 + r6
            if (r9 == r0) goto La2
            android.view.View r9 = r12.s(r9)
            boolean r10 = r12.f5357x
            if (r10 == 0) goto L75
            androidx.recyclerview.widget.h r10 = r12.f5352s
            int r10 = r10.d(r7)
            androidx.recyclerview.widget.h r11 = r12.f5352s
            int r11 = r11.d(r9)
            if (r10 >= r11) goto L72
            goto La1
        L72:
            if (r10 != r11) goto La2
            goto L86
        L75:
            androidx.recyclerview.widget.h r10 = r12.f5352s
            int r10 = r10.e(r7)
            androidx.recyclerview.widget.h r11 = r12.f5352s
            int r11 = r11.e(r9)
            if (r10 <= r11) goto L84
            goto La1
        L84:
            if (r10 != r11) goto La2
        L86:
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.f5368d
            int r8 = r8.f5390e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.f5368d
            int r9 = r9.f5390e
            int r8 = r8 - r9
            if (r8 >= 0) goto L99
            r8 = r5
            goto L9a
        L99:
            r8 = r4
        L9a:
            if (r3 >= 0) goto L9e
            r9 = r5
            goto L9f
        L9e:
            r9 = r4
        L9f:
            if (r8 == r9) goto La2
        La1:
            return r7
        La2:
            int r1 = r1 + r6
            goto L2c
        La4:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.R0():android.view.View");
    }

    public void S0() {
        this.f5340B.a();
        A0();
    }

    public boolean T0() {
        return C() == 1;
    }

    public void U0(int i4) {
        if (i4 != 0 && i4 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        a(null);
        if (i4 == this.f5354u) {
            return;
        }
        this.f5354u = i4;
        h hVar = this.f5352s;
        this.f5352s = this.f5353t;
        this.f5353t = hVar;
        A0();
    }

    public void V0(boolean z3) {
        a(null);
        e eVar = this.f5344F;
        if (eVar != null && eVar.f5383t != z3) {
            eVar.f5383t = z3;
        }
        this.f5356w = z3;
        A0();
    }

    public void W0(int i4) {
        a(null);
        if (i4 != this.f5350q) {
            S0();
            this.f5350q = i4;
            this.f5358y = new BitSet(this.f5350q);
            this.f5351r = new f[this.f5350q];
            for (int i5 = 0; i5 < this.f5350q; i5++) {
                this.f5351r[i5] = new f(i5);
            }
            A0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void Y(RecyclerView recyclerView, RecyclerView.t tVar) {
        super.Y(recyclerView, tVar);
        x0(this.f5349K);
        for (int i4 = 0; i4 < this.f5350q; i4++) {
            this.f5351r[i4].c();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void Z(AccessibilityEvent accessibilityEvent) {
        super.Z(accessibilityEvent);
        if (t() > 0) {
            View viewM0 = M0(false);
            View viewL0 = L0(false);
            if (viewM0 == null || viewL0 == null) {
                return;
            }
            int I3 = I(viewM0);
            int I4 = I(viewL0);
            if (I3 < I4) {
                accessibilityEvent.setFromIndex(I3);
                accessibilityEvent.setToIndex(I4);
            } else {
                accessibilityEvent.setFromIndex(I4);
                accessibilityEvent.setToIndex(I3);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void a(String str) {
        if (this.f5344F == null) {
            super.a(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean b() {
        return this.f5354u == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean c() {
        return this.f5354u == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean d(RecyclerView.o oVar) {
        return oVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int f(RecyclerView.x xVar) {
        return H0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void f0(RecyclerView recyclerView, int i4, int i5) {
        Q0(i4, i5, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int g(RecyclerView.x xVar) {
        return I0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void g0(RecyclerView recyclerView) {
        this.f5340B.a();
        A0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int h(RecyclerView.x xVar) {
        return J0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void h0(RecyclerView recyclerView, int i4, int i5, int i6) {
        Q0(i4, i5, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int i(RecyclerView.x xVar) {
        return H0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void i0(RecyclerView recyclerView, int i4, int i5) {
        Q0(i4, i5, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int j(RecyclerView.x xVar) {
        return I0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int k(RecyclerView.x xVar) {
        return J0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void k0(RecyclerView recyclerView, int i4, int i5, Object obj) {
        Q0(i4, i5, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public RecyclerView.o n() {
        return this.f5354u == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public RecyclerView.o o(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void o0(Parcelable parcelable) {
        if (parcelable instanceof e) {
            this.f5344F = (e) parcelable;
            A0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public RecyclerView.o p(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public Parcelable p0() {
        int iH;
        int iG;
        int[] iArr;
        if (this.f5344F != null) {
            return new e(this.f5344F);
        }
        e eVar = new e();
        eVar.f5383t = this.f5356w;
        eVar.f5384u = this.f5342D;
        eVar.f5385v = this.f5343E;
        d dVar = this.f5340B;
        if (dVar == null || (iArr = dVar.f5370a) == null) {
            eVar.f5380q = 0;
        } else {
            eVar.f5381r = iArr;
            eVar.f5380q = iArr.length;
            eVar.f5382s = dVar.f5371b;
        }
        if (t() <= 0) {
            eVar.f5376m = -1;
            eVar.f5377n = -1;
            eVar.f5378o = 0;
            return eVar;
        }
        eVar.f5376m = this.f5342D ? P0() : O0();
        eVar.f5377n = N0();
        int i4 = this.f5350q;
        eVar.f5378o = i4;
        eVar.f5379p = new int[i4];
        for (int i5 = 0; i5 < this.f5350q; i5++) {
            if (this.f5342D) {
                iH = this.f5351r[i5].e(Integer.MIN_VALUE);
                if (iH != Integer.MIN_VALUE) {
                    iG = this.f5352s.f();
                    iH -= iG;
                }
            } else {
                iH = this.f5351r[i5].h(Integer.MIN_VALUE);
                if (iH != Integer.MIN_VALUE) {
                    iG = this.f5352s.g();
                    iH -= iG;
                }
            }
            eVar.f5379p[i5] = iH;
        }
        return eVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void q0(int i4) {
        if (i4 == 0) {
            F0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int v(RecyclerView.t tVar, RecyclerView.x xVar) {
        return this.f5354u == 1 ? this.f5350q : super.v(tVar, xVar);
    }
}
