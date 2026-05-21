package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView.n f5489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f5491c;

    public static class a extends h {
        public a(RecyclerView.n nVar) {
            super(nVar, null);
        }

        @Override // androidx.recyclerview.widget.h
        public int d(View view) {
            return this.f5489a.z(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.o) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.h
        public int e(View view) {
            return this.f5489a.y(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.o) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.h
        public int f() {
            return this.f5489a.O() - this.f5489a.G();
        }

        @Override // androidx.recyclerview.widget.h
        public int g() {
            return this.f5489a.F();
        }

        @Override // androidx.recyclerview.widget.h
        public int h() {
            return (this.f5489a.O() - this.f5489a.F()) - this.f5489a.G();
        }
    }

    public static class b extends h {
        public b(RecyclerView.n nVar) {
            super(nVar, null);
        }

        @Override // androidx.recyclerview.widget.h
        public int d(View view) {
            return this.f5489a.w(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.o) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.h
        public int e(View view) {
            return this.f5489a.A(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.o) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.h
        public int f() {
            return this.f5489a.B() - this.f5489a.E();
        }

        @Override // androidx.recyclerview.widget.h
        public int g() {
            return this.f5489a.H();
        }

        @Override // androidx.recyclerview.widget.h
        public int h() {
            return (this.f5489a.B() - this.f5489a.H()) - this.f5489a.E();
        }
    }

    public /* synthetic */ h(RecyclerView.n nVar, a aVar) {
        this(nVar);
    }

    public static h a(RecyclerView.n nVar) {
        return new a(nVar);
    }

    public static h b(RecyclerView.n nVar, int i4) {
        if (i4 == 0) {
            return a(nVar);
        }
        if (i4 == 1) {
            return c(nVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static h c(RecyclerView.n nVar) {
        return new b(nVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public h(RecyclerView.n nVar) {
        this.f5490b = Integer.MIN_VALUE;
        this.f5491c = new Rect();
        this.f5489a = nVar;
    }
}
