package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a implements g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public B.d f5392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f5393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f5394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC0101a f5395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Runnable f5396e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f5397f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g f5398g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5399h;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    public interface InterfaceC0101a {
        void a(int i4, int i5);

        void b(b bVar);

        RecyclerView.A c(int i4);

        void d(int i4, int i5);

        void e(int i4, int i5);

        void f(int i4, int i5);

        void g(b bVar);

        void h(int i4, int i5, Object obj);
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5400a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f5401b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f5402c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f5403d;

        public b(int i4, int i5, int i6, Object obj) {
            this.f5400a = i4;
            this.f5401b = i5;
            this.f5403d = i6;
            this.f5402c = obj;
        }

        public String a() {
            int i4 = this.f5400a;
            return i4 != 1 ? i4 != 2 ? i4 != 4 ? i4 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            int i4 = this.f5400a;
            if (i4 != bVar.f5400a) {
                return false;
            }
            if (i4 == 8 && Math.abs(this.f5403d - this.f5401b) == 1 && this.f5403d == bVar.f5401b && this.f5401b == bVar.f5403d) {
                return true;
            }
            if (this.f5403d != bVar.f5403d || this.f5401b != bVar.f5401b) {
                return false;
            }
            Object obj2 = this.f5402c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f5402c)) {
                    return false;
                }
            } else if (bVar.f5402c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f5400a * 31) + this.f5401b) * 31) + this.f5403d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f5401b + "c:" + this.f5403d + ",p:" + this.f5402c + "]";
        }
    }

    public a(InterfaceC0101a interfaceC0101a) {
        this(interfaceC0101a, false);
    }

    @Override // androidx.recyclerview.widget.g.a
    public void a(b bVar) {
        if (this.f5397f) {
            return;
        }
        bVar.f5402c = null;
        this.f5392a.a(bVar);
    }

    @Override // androidx.recyclerview.widget.g.a
    public b b(int i4, int i5, int i6, Object obj) {
        b bVar = (b) this.f5392a.b();
        if (bVar == null) {
            return new b(i4, i5, i6, obj);
        }
        bVar.f5400a = i4;
        bVar.f5401b = i5;
        bVar.f5403d = i6;
        bVar.f5402c = obj;
        return bVar;
    }

    public final void c(b bVar) {
        p(bVar);
    }

    public final void d(b bVar) {
        p(bVar);
    }

    public final void e(b bVar) {
        boolean z3;
        byte b4;
        int i4 = bVar.f5401b;
        int i5 = bVar.f5403d + i4;
        byte b5 = -1;
        int i6 = i4;
        int i7 = 0;
        while (i6 < i5) {
            this.f5395d.c(i6);
            if (g(i6)) {
                if (b5 == 0) {
                    j(b(2, i4, i7, null));
                    z3 = true;
                } else {
                    z3 = false;
                }
                b4 = 1;
            } else {
                if (b5 == 1) {
                    p(b(2, i4, i7, null));
                    z3 = true;
                } else {
                    z3 = false;
                }
                b4 = 0;
            }
            if (z3) {
                i6 -= i7;
                i5 -= i7;
                i7 = 1;
            } else {
                i7++;
            }
            i6++;
            b5 = b4;
        }
        if (i7 != bVar.f5403d) {
            a(bVar);
            bVar = b(2, i4, i7, null);
        }
        if (b5 == 0) {
            j(bVar);
        } else {
            p(bVar);
        }
    }

    public final void f(b bVar) {
        int i4 = bVar.f5401b;
        int i5 = bVar.f5403d + i4;
        int i6 = 0;
        byte b4 = -1;
        int i7 = i4;
        while (i4 < i5) {
            this.f5395d.c(i4);
            if (g(i4)) {
                if (b4 == 0) {
                    j(b(4, i7, i6, bVar.f5402c));
                    i7 = i4;
                    i6 = 0;
                }
                b4 = 1;
            } else {
                if (b4 == 1) {
                    p(b(4, i7, i6, bVar.f5402c));
                    i7 = i4;
                    i6 = 0;
                }
                b4 = 0;
            }
            i6++;
            i4++;
        }
        if (i6 != bVar.f5403d) {
            Object obj = bVar.f5402c;
            a(bVar);
            bVar = b(4, i7, i6, obj);
        }
        if (b4 == 0) {
            j(bVar);
        } else {
            p(bVar);
        }
    }

    public final boolean g(int i4) {
        int size = this.f5394c.size();
        for (int i5 = 0; i5 < size; i5++) {
            b bVar = (b) this.f5394c.get(i5);
            int i6 = bVar.f5400a;
            if (i6 == 8) {
                if (m(bVar.f5403d, i5 + 1) == i4) {
                    return true;
                }
            } else if (i6 == 1) {
                int i7 = bVar.f5401b;
                int i8 = bVar.f5403d + i7;
                while (i7 < i8) {
                    if (m(i7, i5 + 1) == i4) {
                        return true;
                    }
                    i7++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public void h() {
        int size = this.f5394c.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f5395d.b((b) this.f5394c.get(i4));
        }
        r(this.f5394c);
        this.f5399h = 0;
    }

    public void i() {
        h();
        int size = this.f5393b.size();
        for (int i4 = 0; i4 < size; i4++) {
            b bVar = (b) this.f5393b.get(i4);
            int i5 = bVar.f5400a;
            if (i5 == 1) {
                this.f5395d.b(bVar);
                this.f5395d.e(bVar.f5401b, bVar.f5403d);
            } else if (i5 == 2) {
                this.f5395d.b(bVar);
                this.f5395d.f(bVar.f5401b, bVar.f5403d);
            } else if (i5 == 4) {
                this.f5395d.b(bVar);
                this.f5395d.h(bVar.f5401b, bVar.f5403d, bVar.f5402c);
            } else if (i5 == 8) {
                this.f5395d.b(bVar);
                this.f5395d.a(bVar.f5401b, bVar.f5403d);
            }
            Runnable runnable = this.f5396e;
            if (runnable != null) {
                runnable.run();
            }
        }
        r(this.f5393b);
        this.f5399h = 0;
    }

    public final void j(b bVar) {
        int i4;
        int i5 = bVar.f5400a;
        if (i5 == 1 || i5 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iT = t(bVar.f5401b, i5);
        int i6 = bVar.f5401b;
        int i7 = bVar.f5400a;
        if (i7 == 2) {
            i4 = 0;
        } else {
            if (i7 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i4 = 1;
        }
        int i8 = 1;
        for (int i9 = 1; i9 < bVar.f5403d; i9++) {
            int iT2 = t(bVar.f5401b + (i4 * i9), bVar.f5400a);
            int i10 = bVar.f5400a;
            if (i10 == 2 ? iT2 != iT : !(i10 == 4 && iT2 == iT + 1)) {
                b bVarB = b(i10, iT, i8, bVar.f5402c);
                k(bVarB, i6);
                a(bVarB);
                if (bVar.f5400a == 4) {
                    i6 += i8;
                }
                i8 = 1;
                iT = iT2;
            } else {
                i8++;
            }
        }
        Object obj = bVar.f5402c;
        a(bVar);
        if (i8 > 0) {
            b bVarB2 = b(bVar.f5400a, iT, i8, obj);
            k(bVarB2, i6);
            a(bVarB2);
        }
    }

    public void k(b bVar, int i4) {
        this.f5395d.g(bVar);
        int i5 = bVar.f5400a;
        if (i5 == 2) {
            this.f5395d.f(i4, bVar.f5403d);
        } else {
            if (i5 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f5395d.h(i4, bVar.f5403d, bVar.f5402c);
        }
    }

    public int l(int i4) {
        return m(i4, 0);
    }

    public int m(int i4, int i5) {
        int size = this.f5394c.size();
        while (i5 < size) {
            b bVar = (b) this.f5394c.get(i5);
            int i6 = bVar.f5400a;
            if (i6 == 8) {
                int i7 = bVar.f5401b;
                if (i7 == i4) {
                    i4 = bVar.f5403d;
                } else {
                    if (i7 < i4) {
                        i4--;
                    }
                    if (bVar.f5403d <= i4) {
                        i4++;
                    }
                }
            } else {
                int i8 = bVar.f5401b;
                if (i8 > i4) {
                    continue;
                } else if (i6 == 2) {
                    int i9 = bVar.f5403d;
                    if (i4 < i8 + i9) {
                        return -1;
                    }
                    i4 -= i9;
                } else if (i6 == 1) {
                    i4 += bVar.f5403d;
                }
            }
            i5++;
        }
        return i4;
    }

    public boolean n(int i4) {
        return (i4 & this.f5399h) != 0;
    }

    public boolean o() {
        return this.f5393b.size() > 0;
    }

    public final void p(b bVar) {
        this.f5394c.add(bVar);
        int i4 = bVar.f5400a;
        if (i4 == 1) {
            this.f5395d.e(bVar.f5401b, bVar.f5403d);
            return;
        }
        if (i4 == 2) {
            this.f5395d.d(bVar.f5401b, bVar.f5403d);
            return;
        }
        if (i4 == 4) {
            this.f5395d.h(bVar.f5401b, bVar.f5403d, bVar.f5402c);
        } else {
            if (i4 == 8) {
                this.f5395d.a(bVar.f5401b, bVar.f5403d);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    public void q() {
        this.f5398g.b(this.f5393b);
        int size = this.f5393b.size();
        for (int i4 = 0; i4 < size; i4++) {
            b bVar = (b) this.f5393b.get(i4);
            int i5 = bVar.f5400a;
            if (i5 == 1) {
                c(bVar);
            } else if (i5 == 2) {
                e(bVar);
            } else if (i5 == 4) {
                f(bVar);
            } else if (i5 == 8) {
                d(bVar);
            }
            Runnable runnable = this.f5396e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f5393b.clear();
    }

    public void r(List list) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            a((b) list.get(i4));
        }
        list.clear();
    }

    public void s() {
        r(this.f5393b);
        r(this.f5394c);
        this.f5399h = 0;
    }

    public final int t(int i4, int i5) {
        int i6;
        int i7;
        for (int size = this.f5394c.size() - 1; size >= 0; size--) {
            b bVar = (b) this.f5394c.get(size);
            int i8 = bVar.f5400a;
            if (i8 == 8) {
                int i9 = bVar.f5401b;
                int i10 = bVar.f5403d;
                if (i9 < i10) {
                    i7 = i9;
                    i6 = i10;
                } else {
                    i6 = i9;
                    i7 = i10;
                }
                if (i4 < i7 || i4 > i6) {
                    if (i4 < i9) {
                        if (i5 == 1) {
                            bVar.f5401b = i9 + 1;
                            bVar.f5403d = i10 + 1;
                        } else if (i5 == 2) {
                            bVar.f5401b = i9 - 1;
                            bVar.f5403d = i10 - 1;
                        }
                    }
                } else if (i7 == i9) {
                    if (i5 == 1) {
                        bVar.f5403d = i10 + 1;
                    } else if (i5 == 2) {
                        bVar.f5403d = i10 - 1;
                    }
                    i4++;
                } else {
                    if (i5 == 1) {
                        bVar.f5401b = i9 + 1;
                    } else if (i5 == 2) {
                        bVar.f5401b = i9 - 1;
                    }
                    i4--;
                }
            } else {
                int i11 = bVar.f5401b;
                if (i11 <= i4) {
                    if (i8 == 1) {
                        i4 -= bVar.f5403d;
                    } else if (i8 == 2) {
                        i4 += bVar.f5403d;
                    }
                } else if (i5 == 1) {
                    bVar.f5401b = i11 + 1;
                } else if (i5 == 2) {
                    bVar.f5401b = i11 - 1;
                }
            }
        }
        for (int size2 = this.f5394c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = (b) this.f5394c.get(size2);
            if (bVar2.f5400a == 8) {
                int i12 = bVar2.f5403d;
                if (i12 == bVar2.f5401b || i12 < 0) {
                    this.f5394c.remove(size2);
                    a(bVar2);
                }
            } else if (bVar2.f5403d <= 0) {
                this.f5394c.remove(size2);
                a(bVar2);
            }
        }
        return i4;
    }

    public a(InterfaceC0101a interfaceC0101a, boolean z3) {
        this.f5392a = new B.e(30);
        this.f5393b = new ArrayList();
        this.f5394c = new ArrayList();
        this.f5399h = 0;
        this.f5395d = interfaceC0101a;
        this.f5397f = z3;
        this.f5398g = new g(this);
    }
}
