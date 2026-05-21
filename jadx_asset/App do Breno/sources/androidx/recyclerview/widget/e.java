package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final ThreadLocal f5466q = new ThreadLocal();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static Comparator f5467r = new a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f5469n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f5470o;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f5468m = new ArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f5471p = new ArrayList();

    public static class a implements Comparator {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f5479d;
            if ((recyclerView == null) != (cVar2.f5479d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z3 = cVar.f5476a;
            if (z3 != cVar2.f5476a) {
                return z3 ? -1 : 1;
            }
            int i4 = cVar2.f5477b - cVar.f5477b;
            if (i4 != 0) {
                return i4;
            }
            int i5 = cVar.f5478c - cVar2.f5478c;
            if (i5 != 0) {
                return i5;
            }
            return 0;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f5473b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int[] f5474c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f5475d;

        public void a() {
            int[] iArr = this.f5474c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f5475d = 0;
        }

        public void b(RecyclerView recyclerView, boolean z3) {
            this.f5475d = 0;
            int[] iArr = this.f5474c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.n nVar = recyclerView.f5246m;
        }

        public void c(int i4, int i5) {
            this.f5472a = i4;
            this.f5473b = i5;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f5476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f5477b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f5478c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public RecyclerView f5479d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f5480e;

        public void a() {
            this.f5476a = false;
            this.f5477b = 0;
            this.f5478c = 0;
            this.f5479d = null;
            this.f5480e = 0;
        }
    }

    public static boolean e(RecyclerView recyclerView, int i4) {
        if (recyclerView.f5232f.g() <= 0) {
            return false;
        }
        RecyclerView.E(recyclerView.f5232f.f(0));
        throw null;
    }

    public void a(RecyclerView recyclerView) {
        this.f5468m.add(recyclerView);
    }

    public final void b() {
        c cVar;
        int size = this.f5468m.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView recyclerView = (RecyclerView) this.f5468m.get(i5);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f5231e0.b(recyclerView, false);
                i4 += recyclerView.f5231e0.f5475d;
            }
        }
        this.f5471p.ensureCapacity(i4);
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            RecyclerView recyclerView2 = (RecyclerView) this.f5468m.get(i7);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.f5231e0;
                int iAbs = Math.abs(bVar.f5472a) + Math.abs(bVar.f5473b);
                for (int i8 = 0; i8 < bVar.f5475d * 2; i8 += 2) {
                    if (i6 >= this.f5471p.size()) {
                        cVar = new c();
                        this.f5471p.add(cVar);
                    } else {
                        cVar = (c) this.f5471p.get(i6);
                    }
                    int[] iArr = bVar.f5474c;
                    int i9 = iArr[i8 + 1];
                    cVar.f5476a = i9 <= iAbs;
                    cVar.f5477b = iAbs;
                    cVar.f5478c = i9;
                    cVar.f5479d = recyclerView2;
                    cVar.f5480e = iArr[i8];
                    i6++;
                }
            }
        }
        Collections.sort(this.f5471p, f5467r);
    }

    public final void c(c cVar, long j4) {
        if (cVar.f5476a) {
            j4 = Long.MAX_VALUE;
        }
        h(cVar.f5479d, cVar.f5480e, j4);
    }

    public final void d(long j4) {
        for (int i4 = 0; i4 < this.f5471p.size(); i4++) {
            c cVar = (c) this.f5471p.get(i4);
            if (cVar.f5479d == null) {
                return;
            }
            c(cVar, j4);
            cVar.a();
        }
    }

    public void f(RecyclerView recyclerView, int i4, int i5) {
        if (recyclerView.isAttachedToWindow() && this.f5469n == 0) {
            this.f5469n = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f5231e0.c(i4, i5);
    }

    public void g(long j4) {
        b();
        d(j4);
    }

    public final RecyclerView.A h(RecyclerView recyclerView, int i4, long j4) {
        if (e(recyclerView, i4)) {
            return null;
        }
        RecyclerView.t tVar = recyclerView.f5226c;
        try {
            recyclerView.Y();
            tVar.v(i4, false, j4);
            return null;
        } finally {
            recyclerView.a0(false);
        }
    }

    public void i(RecyclerView recyclerView) {
        this.f5468m.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            y.j.a("RV Prefetch");
            if (!this.f5468m.isEmpty()) {
                int size = this.f5468m.size();
                long jMax = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    RecyclerView recyclerView = (RecyclerView) this.f5468m.get(i4);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f5470o);
                }
            }
        } finally {
            this.f5469n = 0L;
            y.j.b();
        }
    }
}
